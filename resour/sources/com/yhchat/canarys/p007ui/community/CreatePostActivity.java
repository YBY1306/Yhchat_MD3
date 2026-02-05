package com.yhchat.canarys.p007ui.community;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.ColorKt;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.yhchat.canarys.data.p005di.RepositoryFactory;
import com.yhchat.canarys.p007ui.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* compiled from: CreatePostActivity.kt */
@Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/ui/community/CreatePostActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final class CreatePostActivity extends ComponentActivity {
    public static final int $stable = 8;

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable$default(this, null, null, 3, null);
        final int boardId = getIntent().getIntExtra("board_id", 0);
        String stringExtra = getIntent().getStringExtra("board_name");
        if (stringExtra == null) {
            stringExtra = "\u53d1\u5e03\u6587\u7ae0";
        }
        final String boardName = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("token");
        final String token = stringExtra2 == null ? "" : stringExtra2;
        getIntent().getStringExtra("draft_id");
        String stringExtra3 = getIntent().getStringExtra("draft_title");
        final String draftTitle = stringExtra3 == null ? "" : stringExtra3;
        String stringExtra4 = getIntent().getStringExtra("draft_content");
        final String draftContent = stringExtra4 == null ? "" : stringExtra4;
        final boolean draftMarkdownMode = getIntent().getBooleanExtra("draft_markdown_mode", false);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-326537066, true, new Function2() { // from class: com.yhchat.canarys.ui.community.CreatePostActivity$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CreatePostActivity.onCreate$lambda$0(this.f$0, boardId, boardName, token, draftTitle, draftContent, draftMarkdownMode, (Composer) obj, ((Integer) obj2).intValue());
            }
        }), 1, null);
    }

    public static final Unit onCreate$lambda$0(final CreatePostActivity this$0, final int $boardId, final String $boardName, final String $token, final String $draftTitle, final String $draftContent, final boolean $draftMarkdownMode, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C51@2097L1949,51@2079L1967:CreatePostActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-326537066, $changed, -1, "com.yhchat.canarys.ui.community.CreatePostActivity.onCreate.<anonymous> (CreatePostActivity.kt:51)");
            }
            ThemeKt.YhchatCanaryTheme(false, false, ComposableLambdaKt.rememberComposableLambda(-1132601991, true, new Function2() { // from class: com.yhchat.canarys.ui.community.CreatePostActivity$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CreatePostActivity.onCreate$lambda$0$0(this.f$0, $boardId, $boardName, $token, $draftTitle, $draftContent, $draftMarkdownMode, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v18, types: [androidx.lifecycle.viewmodel.CreationExtras] */
    public static final Unit onCreate$lambda$0$0(final CreatePostActivity this$0, int $boardId, String $boardName, final String $token, String $draftTitle, String $draftContent, boolean $draftMarkdownMode, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C52@2136L7,53@2176L21,55@2242L461,55@2231L472,62@2767L299,62@2757L309,74@3312L12,75@3362L12,76@3414L297,88@4003L10,69@3100L932:CreatePostActivity.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1132601991, $changed, -1, "com.yhchat.canarys.ui.community.CreatePostActivity.onCreate.<anonymous>.<anonymous> (CreatePostActivity.kt:52)");
            }
            ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
            ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer.consume(localView);
            ComposerKt.sourceInformationMarkerEnd($composer);
            final View view = (View) objConsume;
            final boolean darkTheme = DarkThemeKt.isSystemInDarkTheme($composer, 0);
            ComposerKt.sourceInformationMarkerStart($composer, -1803782362, "CC(remember):CreatePostActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance(view) | $composer.changed(darkTheme);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.CreatePostActivity$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreatePostActivity.onCreate$lambda$0$0$0$0(view, darkTheme);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            EffectsKt.SideEffect((Function0) objRememberedValue, $composer, 0);
            ComposerKt.sourceInformationMarkerStart($composer, -1803765724, "CC(remember):CreatePostActivity.kt#9igjgp");
            boolean zChangedInstance2 = $composer.changedInstance(this$0);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function1() { // from class: com.yhchat.canarys.ui.community.CreatePostActivity$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return CreatePostActivity.onCreate$lambda$0$0$1$0(this.f$0, (CreationExtras) obj3);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            Function1 function1 = (Function1) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 419377738, "CC(viewModel)P(2,1)127@5933L7,133@6121L328:ViewModel.kt#3tja67");
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent($composer, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CreatePostViewModel.class);
            InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
            initializerViewModelFactoryBuilder.addInitializer(Reflection.getOrCreateKotlinClass(CreatePostViewModel.class), function1);
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) orCreateKotlinClass, current, (String) null, initializerViewModelFactoryBuilder.build(), current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, $composer, ((0 << 3) & 112) | ((0 << 3) & 896), 0);
            ComposerKt.sourceInformationMarkerEnd($composer);
            CreatePostViewModel viewModel2 = (CreatePostViewModel) viewModel;
            ComposerKt.sourceInformationMarkerStart($composer, -1803748571, "CC(remember):CreatePostActivity.kt#9igjgp");
            boolean zChangedInstance3 = $composer.changedInstance(this$0);
            Object objRememberedValue3 = $composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = new Function0() { // from class: com.yhchat.canarys.ui.community.CreatePostActivity$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreatePostActivity.onCreate$lambda$0$0$2$0(this.f$0);
                    }
                };
                $composer.updateRememberedValue(obj3);
                objRememberedValue3 = obj3;
            }
            Function0 function0 = (Function0) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, -1803746971, "CC(remember):CreatePostActivity.kt#9igjgp");
            boolean zChangedInstance4 = $composer.changedInstance(this$0);
            Object objRememberedValue4 = $composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object obj4 = new Function0() { // from class: com.yhchat.canarys.ui.community.CreatePostActivity$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreatePostActivity.onCreate$lambda$0$0$3$0(this.f$0);
                    }
                };
                $composer.updateRememberedValue(obj4);
                objRememberedValue4 = obj4;
            }
            Function0 function02 = (Function0) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, -1803745022, "CC(remember):CreatePostActivity.kt#9igjgp");
            boolean zChangedInstance5 = $composer.changedInstance(this$0) | $composer.changed($token);
            Object objRememberedValue5 = $composer.rememberedValue();
            if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                Object obj5 = new Function0() { // from class: com.yhchat.canarys.ui.community.CreatePostActivity$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreatePostActivity.onCreate$lambda$0$0$4$0(this.f$0, $token);
                    }
                };
                $composer.updateRememberedValue(obj5);
                objRememberedValue5 = obj5;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            CreatePostActivityKt.CreatePostScreen($boardId, $boardName, $token, viewModel2, function0, function02, (Function0) objRememberedValue5, $draftTitle, $draftContent, $draftMarkdownMode, WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), WindowInsets_androidKt.getSystemBars(WindowInsets.INSTANCE, $composer, 6)), $composer, 0, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$0$0$0$0(View $view, boolean $darkTheme) {
        Context context = $view.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.activity.ComponentActivity");
        Window window = ((ComponentActivity) context).getWindow();
        window.setStatusBarColor(ColorKt.m5111toArgb8_81llA(Color.INSTANCE.m5092getTransparent0d7_KjU()));
        window.setNavigationBarColor(ColorKt.m5111toArgb8_81llA(Color.INSTANCE.m5092getTransparent0d7_KjU()));
        WindowCompat.getInsetsController(window, $view).setAppearanceLightStatusBars(!$darkTheme);
        WindowCompat.getInsetsController(window, $view).setAppearanceLightNavigationBars(!$darkTheme);
        return Unit.INSTANCE;
    }

    public static final CreatePostViewModel onCreate$lambda$0$0$1$0(CreatePostActivity this$0, CreationExtras viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
        return new CreatePostViewModel(RepositoryFactory.INSTANCE.getCommunityRepository(this$0), RepositoryFactory.INSTANCE.getTokenRepository(this$0));
    }

    public static final Unit onCreate$lambda$0$0$2$0(CreatePostActivity this$0) {
        this$0.finish();
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$0$0$3$0(CreatePostActivity this$0) {
        this$0.finish();
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$0$0$4$0(CreatePostActivity this$0, String $token) {
        Intent intent = new Intent(this$0, (Class<?>) DraftBoxActivity.class);
        intent.putExtra("token", $token);
        this$0.startActivity(intent);
        return Unit.INSTANCE;
    }
}
