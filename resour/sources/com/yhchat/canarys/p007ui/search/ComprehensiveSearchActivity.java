package com.yhchat.canarys.p007ui.search;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.yhchat.canarys.p007ui.theme.ThemeKt;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;

/* compiled from: ComprehensiveSearchActivity.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000e"}, m169d2 = {"Lcom/yhchat/canarys/ui/search/ComprehensiveSearchActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "viewModel", "Lcom/yhchat/canarys/ui/search/ComprehensiveSearchViewModel;", "getViewModel", "()Lcom/yhchat/canarys/ui/search/ComprehensiveSearchViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes11.dex */
public final class ComprehensiveSearchActivity extends ComponentActivity {
    public static final int $stable = 8;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    public ComprehensiveSearchActivity() {
        final ComprehensiveSearchActivity comprehensiveSearchActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ComprehensiveSearchViewModel.class), new Function0<ViewModelStore>() { // from class: com.yhchat.canarys.ui.search.ComprehensiveSearchActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return comprehensiveSearchActivity.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yhchat.canarys.ui.search.ComprehensiveSearchActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return comprehensiveSearchActivity.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: com.yhchat.canarys.ui.search.ComprehensiveSearchActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? comprehensiveSearchActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    private final ComprehensiveSearchViewModel getViewModel() {
        return (ComprehensiveSearchViewModel) this.viewModel.getValue();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable$default(this, null, null, 3, null);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-1215842331, true, new Function2() { // from class: com.yhchat.canarys.ui.search.ComprehensiveSearchActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ComprehensiveSearchActivity.onCreate$lambda$0(this.f$0, (Composer) obj, ((Integer) obj2).intValue());
            }
        }), 1, null);
    }

    public static final Unit onCreate$lambda$0(final ComprehensiveSearchActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C46@1958L166,46@1940L184:ComprehensiveSearchActivity.kt#ogsx9x");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1215842331, $changed, -1, "com.yhchat.canarys.ui.search.ComprehensiveSearchActivity.onCreate.<anonymous> (ComprehensiveSearchActivity.kt:46)");
            }
            ThemeKt.YhchatCanaryTheme(false, false, ComposableLambdaKt.rememberComposableLambda(252020898, true, new Function2() { // from class: com.yhchat.canarys.ui.search.ComprehensiveSearchActivity$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ComprehensiveSearchActivity.onCreate$lambda$0$0(this.f$0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$0$0(final ComprehensiveSearchActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C49@2080L12,47@1976L134:ComprehensiveSearchActivity.kt#ogsx9x");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(252020898, $changed, -1, "com.yhchat.canarys.ui.search.ComprehensiveSearchActivity.onCreate.<anonymous>.<anonymous> (ComprehensiveSearchActivity.kt:47)");
            }
            ComprehensiveSearchViewModel viewModel = this$0.getViewModel();
            ComposerKt.sourceInformationMarkerStart($composer, 1673918318, "CC(remember):ComprehensiveSearchActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance(this$0);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.search.ComprehensiveSearchActivity$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ComprehensiveSearchActivity.onCreate$lambda$0$0$0$0(this.f$0);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComprehensiveSearchActivityKt.ComprehensiveSearchScreen(viewModel, (Function0) objRememberedValue, $composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$0$0$0$0(ComprehensiveSearchActivity this$0) {
        this$0.finish();
        return Unit.INSTANCE;
    }
}
