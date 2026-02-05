package com.yhchat.canarys.p007ui.community;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.yhchat.canarys.data.p005di.RepositoryFactory;
import com.yhchat.canarys.p007ui.base.BaseActivity;
import com.yhchat.canarys.p007ui.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* compiled from: BoardDetailActivity.kt */
@Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/ui/community/BoardDetailActivity;", "Lcom/yhchat/canarys/ui/base/BaseActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final class BoardDetailActivity extends BaseActivity {
    public static final int $stable = 8;

    @Override // com.yhchat.canarys.p007ui.base.BaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable$default(this, null, null, 3, null);
        final int boardId = getIntent().getIntExtra("board_id", 0);
        final String boardName = getIntent().getStringExtra("board_name");
        if (boardName == null) {
            boardName = "\u5206\u533a\u8be6\u60c5";
        }
        final String token = getIntent().getStringExtra("token");
        if (token == null) {
            token = "";
        }
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1616007112, true, new Function2() { // from class: com.yhchat.canarys.ui.community.BoardDetailActivity$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BoardDetailActivity.onCreate$lambda$0(this.f$0, boardId, boardName, token, (Composer) obj, ((Integer) obj2).intValue());
            }
        }), 1, null);
    }

    public static final Unit onCreate$lambda$0(final BoardDetailActivity this$0, final int $boardId, final String $boardName, final String $token, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C58@2500L659,58@2482L677:BoardDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1616007112, $changed, -1, "com.yhchat.canarys.ui.community.BoardDetailActivity.onCreate.<anonymous> (BoardDetailActivity.kt:58)");
            }
            ThemeKt.YhchatCanaryTheme(false, false, ComposableLambdaKt.rememberComposableLambda(81727467, true, new Function2() { // from class: com.yhchat.canarys.ui.community.BoardDetailActivity$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BoardDetailActivity.onCreate$lambda$0$0(this.f$0, $boardId, $boardName, $token, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v15, types: [androidx.lifecycle.viewmodel.CreationExtras] */
    public static final Unit onCreate$lambda$0$0(final BoardDetailActivity this$0, int $boardId, String $boardName, String $token, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C59@2566L302,59@2556L312,71@3115L12,66@2902L243:BoardDetailActivity.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(81727467, $changed, -1, "com.yhchat.canarys.ui.community.BoardDetailActivity.onCreate.<anonymous>.<anonymous> (BoardDetailActivity.kt:59)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1230686873, "CC(remember):BoardDetailActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance(this$0);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.community.BoardDetailActivity$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return BoardDetailActivity.onCreate$lambda$0$0$0$0(this.f$0, (CreationExtras) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            Function1 function1 = (Function1) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 419377738, "CC(viewModel)P(2,1)127@5933L7,133@6121L328:ViewModel.kt#3tja67");
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent($composer, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BoardDetailViewModel.class);
            InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
            initializerViewModelFactoryBuilder.addInitializer(Reflection.getOrCreateKotlinClass(BoardDetailViewModel.class), function1);
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) orCreateKotlinClass, current, (String) null, initializerViewModelFactoryBuilder.build(), current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, $composer, ((0 << 3) & 112) | ((0 << 3) & 896), 0);
            ComposerKt.sourceInformationMarkerEnd($composer);
            BoardDetailViewModel viewModel2 = (BoardDetailViewModel) viewModel;
            ComposerKt.sourceInformationMarkerStart($composer, 1230704151, "CC(remember):BoardDetailActivity.kt#9igjgp");
            boolean zChangedInstance2 = $composer.changedInstance(this$0);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.community.BoardDetailActivity$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BoardDetailActivity.onCreate$lambda$0$0$1$0(this.f$0);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            BoardDetailActivityKt.BoardDetailScreen($boardId, $boardName, $token, viewModel2, (Function0) objRememberedValue2, null, $composer, 0, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final BoardDetailViewModel onCreate$lambda$0$0$0$0(BoardDetailActivity this$0, CreationExtras viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
        return new BoardDetailViewModel(RepositoryFactory.INSTANCE.getCommunityRepository(this$0), RepositoryFactory.INSTANCE.getTokenRepository(this$0));
    }

    public static final Unit onCreate$lambda$0$0$1$0(BoardDetailActivity this$0) {
        this$0.finish();
        return Unit.INSTANCE;
    }
}
