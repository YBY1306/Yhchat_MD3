# 手表界面版

> 通过将 `:app` 模块改为 library、`:watch` 作为 application 模块来覆盖代码。

## 原理

- `:app` → Android Library（被覆盖方）
- `:watch` → Android Application（覆盖方，依赖 `:app`）
- 同包名同文件名的类会覆盖 library 中的实现
- `:watch` 的 `AndroidManifest.xml` 通过 `tools:replace="android:name"` 覆盖 Application 声明

## 已做的改动

### `app/build.gradle.kts`
- `android.application` → `android.library`
- 移除 `applicationId`、`versionCode`、`versionName`、`signingConfigs`、`isShrinkResources`

### `app/.../CanaryApplication.kt`
- 移除 `@HiltAndroidApp`（library 里不能用）
- 保留内存清理、前台追踪等业务逻辑

### `watch/build.gradle.kts`
- 添加 `hilt`、`ksp` 插件
- 添加 Hilt 依赖

### `watch/.../WatchApplication.kt`
- 带 `@HiltAndroidApp`，继承 `CanaryApplication`（继承其内存清理等逻辑）

### `watch/AndroidManifest.xml`
- `android:name="com.yhchat.canary.WatchApplication"` 
- `tools:replace="android:name"` 覆盖 library 的合并

## 编译运行

```shell
# 直接构建 watch 变体即可
./gradlew :watch:assembleStandardDebug
# 或
./gradlew :watch:assembleWithPlayerDebug
```

## 注意

- `:app` 中的 `CanaryApplication` 在 watch 构建中不会被实例化，由 `WatchApplication` 替代（继承自它）。
- 如果需要在 `WatchApplication` 中添加额外逻辑，直接在 `watch/.../WatchApplication.kt` 中修改即可。
