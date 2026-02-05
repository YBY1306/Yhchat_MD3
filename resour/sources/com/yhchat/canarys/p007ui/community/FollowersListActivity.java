package com.yhchat.canarys.p007ui.community;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.yhchat.canarys.p007ui.theme.ThemeKt;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FollowersListActivity.kt */
@Metadata(m168d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014\u00a8\u0006\t"}, m169d2 = {"Lcom/yhchat/canarys/ui/community/FollowersListActivity;", "Lcom/yhchat/canarys/ui/base/BaseActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
@AndroidEntryPoint
/* loaded from: classes14.dex */
public final class FollowersListActivity extends Hilt_FollowersListActivity {
    private static final String EXTRA_BA_ID = "ba_id";
    private static final String EXTRA_BA_NAME = "ba_name";
    private static final String EXTRA_TOKEN = "token";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: FollowersListActivity.kt */
    @Metadata(m168d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J&\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, m169d2 = {"Lcom/yhchat/canarys/ui/community/FollowersListActivity$Companion;", "", "<init>", "()V", "EXTRA_TOKEN", "", "EXTRA_BA_ID", "EXTRA_BA_NAME", "start", "", "context", "Landroid/content/Context;", FollowersListActivity.EXTRA_TOKEN, "baId", "", "baName", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void start(Context context, String token, int baId, String baName) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(baName, "baName");
            Intent intent = new Intent(context, (Class<?>) FollowersListActivity.class);
            intent.putExtra(FollowersListActivity.EXTRA_TOKEN, token);
            intent.putExtra(FollowersListActivity.EXTRA_BA_ID, baId);
            intent.putExtra(FollowersListActivity.EXTRA_BA_NAME, baName);
            context.startActivity(intent);
        }
    }

    @Override // com.yhchat.canarys.p007ui.community.Hilt_FollowersListActivity, com.yhchat.canarys.p007ui.base.BaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable$default(this, null, null, 3, null);
        final String token = getIntent().getStringExtra(EXTRA_TOKEN);
        if (token == null) {
            token = "";
        }
        final int baId = getIntent().getIntExtra(EXTRA_BA_ID, 0);
        String stringExtra = getIntent().getStringExtra(EXTRA_BA_NAME);
        final String baName = stringExtra != null ? stringExtra : "";
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1064745160, true, new Function2() { // from class: com.yhchat.canarys.ui.community.FollowersListActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FollowersListActivity.onCreate$lambda$0(token, baId, baName, this, (Composer) obj, ((Integer) obj2).intValue());
            }
        }), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(final String $token, final int $baId, final String $baName, final FollowersListActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C63@2507L338,63@2489L356:FollowersListActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1064745160, $changed, -1, "com.yhchat.canarys.ui.community.FollowersListActivity.onCreate.<anonymous> (FollowersListActivity.kt:63)");
            }
            ThemeKt.YhchatCanaryTheme(false, false, ComposableLambdaKt.rememberComposableLambda(1368436587, true, new Function2() { // from class: com.yhchat.canarys.ui.community.FollowersListActivity$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FollowersListActivity.onCreate$lambda$0$0($token, $baId, $baName, this$0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0(String $token, int $baId, String $baName, final FollowersListActivity this$0, Composer $composer, int $changed) {
        CreationExtras defaultViewModelCreationExtras;
        ComposerKt.sourceInformation($composer, "C64@2565L15,71@2801L12,66@2598L233:FollowersListActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1368436587, $changed, -1, "com.yhchat.canarys.ui.community.FollowersListActivity.onCreate.<anonymous>.<anonymous> (FollowersListActivity.kt:64)");
            }
            $composer.startReplaceableGroup(1890788296);
            ComposerKt.sourceInformation($composer, "CC(hiltViewModel)P(1)*45@1969L7,50@2112L47,51@2171L54:HiltViewModel.kt#9mcars");
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent($composer, LocalViewModelStoreOwner.$stable);
            if (current != null) {
                ViewModelProvider.Factory factoryCreateHiltViewModelFactory = HiltViewModelKt.createHiltViewModelFactory(current, $composer, 0 & 14);
                int i = (0 & 14) | (0 & 112);
                $composer.startReplaceableGroup(1729797275);
                ComposerKt.sourceInformation($composer, "CC(viewModel)P(3,2,1)*80@3834L7,90@4209L68:ViewModel.kt#3tja67");
                if (current instanceof HasDefaultViewModelProviderFactory) {
                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                }
                ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) FollowersListViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory, defaultViewModelCreationExtras, $composer, ((i << 3) & 896) | 36936, 0);
                $composer.endReplaceableGroup();
                $composer.endReplaceableGroup();
                FollowersListViewModel viewModel2 = (FollowersListViewModel) viewModel;
                ComposerKt.sourceInformationMarkerStart($composer, 807576951, "CC(remember):FollowersListActivity.kt#9igjgp");
                boolean zChangedInstance = $composer.changedInstance(this$0);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.FollowersListActivity$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FollowersListActivity.onCreate$lambda$0$0$0$0(this.f$0);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                FollowersListActivityKt.FollowersListScreen($token, $baId, $baName, viewModel2, (Function0) objRememberedValue, $composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0$0$0(FollowersListActivity this$0) {
        this$0.finish();
        return Unit.INSTANCE;
    }
}
