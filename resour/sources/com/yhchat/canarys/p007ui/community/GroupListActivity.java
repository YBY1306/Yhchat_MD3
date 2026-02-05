package com.yhchat.canarys.p007ui.community;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p000ui.Modifier;
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
import com.yhchat.canarys.data.repository.ConversationRepository;
import com.yhchat.canarys.data.repository.TokenRepository;
import com.yhchat.canarys.p007ui.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* compiled from: GroupListActivity.kt */
@Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/ui/community/GroupListActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final class GroupListActivity extends ComponentActivity {
    public static final int $stable = 8;

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable$default(this, null, null, 3, null);
        final int boardId = getIntent().getIntExtra("board_id", 0);
        final String boardName = getIntent().getStringExtra("board_name");
        if (boardName == null) {
            boardName = "\u7fa4\u804a\u5217\u8868";
        }
        final String token = getIntent().getStringExtra("token");
        if (token == null) {
            token = "";
        }
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(716289544, true, new Function2() { // from class: com.yhchat.canarys.ui.community.GroupListActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return GroupListActivity.onCreate$lambda$0(this.f$0, boardId, boardName, token, (Composer) obj, ((Integer) obj2).intValue());
            }
        }), 1, null);
    }

    public static final Unit onCreate$lambda$0(final GroupListActivity this$0, final int $boardId, final String $boardName, final String $token, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C45@1809L1303,45@1791L1321:GroupListActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(716289544, $changed, -1, "com.yhchat.canarys.ui.community.GroupListActivity.onCreate.<anonymous> (GroupListActivity.kt:45)");
            }
            ThemeKt.YhchatCanaryTheme(false, false, ComposableLambdaKt.rememberComposableLambda(831651755, true, new Function2() { // from class: com.yhchat.canarys.ui.community.GroupListActivity$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupListActivity.onCreate$lambda$0$0(this.f$0, $boardId, $boardName, $token, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$0$0(final GroupListActivity this$0, final int $boardId, final String $boardName, final String $token, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C48@1933L11,49@1974L1124,46@1827L1271:GroupListActivity.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(831651755, $changed, -1, "com.yhchat.canarys.ui.community.GroupListActivity.onCreate.<anonymous>.<anonymous> (GroupListActivity.kt:46)");
            }
            SurfaceKt.m3209SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getBackground(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-65164986, true, new Function2() { // from class: com.yhchat.canarys.ui.community.GroupListActivity$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupListActivity.onCreate$lambda$0$0$0(this.f$0, $boardId, $boardName, $token, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 12582918, 122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v15, types: [androidx.lifecycle.viewmodel.CreationExtras] */
    public static final Unit onCreate$lambda$0$0$0(final GroupListActivity this$0, int $boardId, String $boardName, String $token, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C50@2042L731,50@2032L741,67@3046L12,62@2815L265:GroupListActivity.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-65164986, $changed, -1, "com.yhchat.canarys.ui.community.GroupListActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (GroupListActivity.kt:50)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1800960801, "CC(remember):GroupListActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance(this$0);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.community.GroupListActivity$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return GroupListActivity.onCreate$lambda$0$0$0$0$0(this.f$0, (CreationExtras) obj2);
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
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GroupListViewModel.class);
            InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
            initializerViewModelFactoryBuilder.addInitializer(Reflection.getOrCreateKotlinClass(GroupListViewModel.class), function1);
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) orCreateKotlinClass, current, (String) null, initializerViewModelFactoryBuilder.build(), current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, $composer, ((0 << 3) & 112) | ((0 << 3) & 896), 0);
            ComposerKt.sourceInformationMarkerEnd($composer);
            GroupListViewModel viewModel2 = (GroupListViewModel) viewModel;
            ComposerKt.sourceInformationMarkerStart($composer, 1800992210, "CC(remember):GroupListActivity.kt#9igjgp");
            boolean zChangedInstance2 = $composer.changedInstance(this$0);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.community.GroupListActivity$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupListActivity.onCreate$lambda$0$0$0$1$0(this.f$0);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            GroupListActivityKt.GroupListScreen($boardId, $boardName, $token, viewModel2, (Function0) objRememberedValue2, null, $composer, 0, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final GroupListViewModel onCreate$lambda$0$0$0$0$0(GroupListActivity this$0, CreationExtras viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
        ConversationRepository conversationRepository = RepositoryFactory.INSTANCE.getConversationRepository(this$0);
        TokenRepository tokenRepository = RepositoryFactory.INSTANCE.getTokenRepository(this$0);
        conversationRepository.setTokenRepository(tokenRepository);
        return new GroupListViewModel(RepositoryFactory.INSTANCE.getCommunityRepository(this$0), RepositoryFactory.INSTANCE.getFriendRepository(this$0), conversationRepository);
    }

    public static final Unit onCreate$lambda$0$0$0$1$0(GroupListActivity this$0) {
        this$0.finish();
        return Unit.INSTANCE;
    }
}
