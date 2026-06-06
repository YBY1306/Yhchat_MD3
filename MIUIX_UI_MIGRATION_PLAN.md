# Miuix UI Migration Plan

## Goal

Add a `miuixRelease` build variant while keeping the existing `standardRelease` build unchanged. The migration should start with a flavor-based implementation and leave a clean path to split MD3 and Miuix UI into separate modules later.

## Phase 1: Build Variant

- Keep the existing `standardRelease` Gradle task.
- Add a `miuix` product flavor in the existing flavor dimension.
- Generate `miuixRelease` as a separate APK build.
- Keep `standard`, `withPlayer`, and `withLive` behavior unchanged.
- Add the Miuix dependency only as needed for the Miuix UI path.
- Make CI continue using `assembleStandardRelease`.
- Optionally add a separate CI matrix entry for `assembleMiuixRelease`.

## Phase 2: Theme Entry

- Keep `YhchatCanaryTheme` as the single app theme entry.
- Add a build-time UI style flag such as `BuildConfig.UI_STYLE`.
- Use MD3 theme for `standard`, `withPlayer`, and `withLive`.
- Wrap Miuix flavor content with `MiuixTheme`.
- Keep the existing `MaterialTheme` available until all Material3 screen code is migrated.
- Do not scatter `if (BuildConfig.UI_STYLE == "miuix")` across business screens.

## Current State

- `app/src/miuix` currently contains only limited flavor-specific overrides and does not replace the main screens.
- `YhchatCanaryTheme` wraps content with `MiuixTheme` for `miuixRelease`, but most screens still directly use `androidx.compose.material3.*`.
- Therefore a successful `miuixRelease` build can still look like MD3 until screens start using the project-level `Yh*` wrappers.
- This is an expected migration state, not proof that the flavor failed.

## Phase 3: UI Wrapper Layer

- Create project-level wrapper components before replacing screens.
- Start with high-frequency components:
  - `YhScaffold`
  - `YhTopBar`
  - `YhButton`
  - `YhCard`
  - `YhDialog`
  - `YhTextField`
  - `YhSwitch`
  - `YhListItem`
  - `YhBottomSheet`
- Keep wrapper APIs stable and independent from MD3 or Miuix names.
- Implement wrappers with MD3 first.
- Dispatch to Miuix implementations inside the wrapper layer so business screens do not depend on `BuildConfig.UI_STYLE`.
- Do not create same-package same-name wrapper files in `main` and `src/miuix`; Android source sets compile both and this causes duplicate declarations.
- Move wrapper implementations into separate modules later if the wrapper layer becomes large enough.

## Phase 4: Screen Migration

- Migrate one screen group at a time.
- Suggested order:
  - Settings screens
  - Community top bars and list containers
  - Group info and group management screens
  - Conversation list
  - Chat top bar and input bar
  - Dialogs and bottom sheets
  - Profile and discovery screens
- First visible migration target:
  - Settings home screen uses `YhScaffold`, `YhTopBar`, `YhCard`, `YhListItem`, and `YhSwitch`.
  - `standardRelease` keeps the current MD3 visuals.
  - `miuixRelease` shows Miuix scaffold/top bar/card/preference components on the settings home screen.
- After each screen group:
  - Check `standardRelease` behavior.
  - Check `miuixRelease` visual behavior.
  - Avoid unrelated refactors.

## Phase 5: Module Split Decision

Split into modules only after wrapper coverage is high enough.

Possible module structure:

```text
:ui-common
:ui-md3
:ui-miuix
```

Recommended conditions before splitting:

- Most common UI widgets go through `Yh*` wrappers.
- Major screens no longer import Material3 directly for basic controls.
- Miuix code is large enough that flavor source-set overlays become hard to navigate.
- The standard APK should avoid carrying Miuix dependencies.

## Acceptance Criteria

- `assembleStandardRelease` still exists and builds the MD3 app.
- `assembleMiuixRelease` exists and builds the Miuix app.
- At least one migrated page in `miuixRelease` visibly uses Miuix native components, starting with the settings home screen.
- Existing player/live flavors keep their current behavior.
- No old `org.burnoutcrew.composereorderable` dependency remains.
- Miuix-specific code is isolated in theme, wrappers, or flavor source sets.
- Business logic does not depend on UI implementation details.
- Business screens should use `Yh*` wrappers instead of checking `BuildConfig.UI_STYLE`.
- Do not copy entire screens into `src/miuix` unless wrapper-based migration cannot express the screen safely.

## Current Risks

- The current app directly imports `androidx.compose.material3.*` in many screens.
- A full UI swap cannot be done safely by only changing the theme.
- Miuix latest versions may require newer Kotlin, Compose, or Gradle versions.
- AGP 9 removes the need for `org.jetbrains.kotlin.android` in Android modules.
- Dependency upgrades should be verified one error at a time.

## Recommended Next Step

Finish Phase 1 first:

- Keep one flavor dimension.
- Add `miuix`.
- Ensure `standardRelease` and `miuixRelease` tasks exist.
- Resolve Gradle, AGP, Kotlin, and KSP version compatibility.
- Start screen-level migration only through wrapper components.
- Use the settings home screen as the first visual proof that `miuixRelease` is using Miuix UI.
