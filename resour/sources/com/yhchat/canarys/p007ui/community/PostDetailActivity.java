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
import com.yhchat.canarys.util.YunhuLinkHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* compiled from: PostDetailActivity.kt */
@Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/ui/community/PostDetailActivity;", "Lcom/yhchat/canarys/ui/base/BaseActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final class PostDetailActivity extends BaseActivity {
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yhchat.canarys.p007ui.base.BaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Integer numExtractPostIdFromLink;
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable$default(this, null, null, 3, null);
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = getIntent().getIntExtra("post_id", 0);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        String stringExtra = getIntent().getStringExtra("post_title");
        T t = stringExtra;
        if (stringExtra == null) {
            t = "\u6587\u7ae0\u8be6\u60c5";
        }
        objectRef.element = t;
        if (getIntent().getStringExtra("token") == null) {
        }
        if (intRef.element == 0 && getIntent().getData() != null && (numExtractPostIdFromLink = YunhuLinkHandler.INSTANCE.extractPostIdFromLink(String.valueOf(getIntent().getData()))) != null) {
            intRef.element = numExtractPostIdFromLink.intValue();
            objectRef.element = "\u6587\u7ae0\u8be6\u60c5";
        }
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(674430252, true, new Function2() { // from class: com.yhchat.canarys.ui.community.PostDetailActivity$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return PostDetailActivity.onCreate$lambda$0(this.f$0, intRef, objectRef, (Composer) obj, ((Integer) obj2).intValue());
            }
        }), 1, null);
    }

    public static final Unit onCreate$lambda$0(final PostDetailActivity this$0, final Ref.IntRef $postId, final Ref.ObjectRef $postTitle, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C133@5867L936,133@5849L954:PostDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(674430252, $changed, -1, "com.yhchat.canarys.ui.community.PostDetailActivity.onCreate.<anonymous> (PostDetailActivity.kt:133)");
            }
            ThemeKt.YhchatCanaryTheme(false, false, ComposableLambdaKt.rememberComposableLambda(-131634673, true, new Function2() { // from class: com.yhchat.canarys.ui.community.PostDetailActivity$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PostDetailActivity.onCreate$lambda$0$0(this.f$0, $postId, $postTitle, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [androidx.lifecycle.viewmodel.CreationExtras] */
    public static final Unit onCreate$lambda$0$0(final PostDetailActivity this$0, Ref.IntRef $postId, Ref.ObjectRef $postTitle, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C134@5932L618,134@5922L628,148@6759L12,144@6584L205:PostDetailActivity.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-131634673, $changed, -1, "com.yhchat.canarys.ui.community.PostDetailActivity.onCreate.<anonymous>.<anonymous> (PostDetailActivity.kt:134)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -1946866471, "CC(remember):PostDetailActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance(this$0);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.community.PostDetailActivity$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return PostDetailActivity.onCreate$lambda$0$0$0$0(this.f$0, (CreationExtras) obj2);
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
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PostDetailViewModel.class);
            InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
            initializerViewModelFactoryBuilder.addInitializer(Reflection.getOrCreateKotlinClass(PostDetailViewModel.class), function1);
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) orCreateKotlinClass, current, (String) null, initializerViewModelFactoryBuilder.build(), current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, $composer, ((0 << 3) & 112) | ((0 << 3) & 896), 0);
            ComposerKt.sourceInformationMarkerEnd($composer);
            PostDetailViewModel viewModel2 = (PostDetailViewModel) viewModel;
            int i = $postId.element;
            String str = (String) $postTitle.element;
            ComposerKt.sourceInformationMarkerStart($composer, -1946840613, "CC(remember):PostDetailActivity.kt#9igjgp");
            boolean zChangedInstance2 = $composer.changedInstance(this$0);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.community.PostDetailActivity$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PostDetailActivity.onCreate$lambda$0$0$1$0(this.f$0);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            PostDetailActivityKt.PostDetailScreen(i, str, viewModel2, (Function0) objRememberedValue2, null, $composer, 0, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final PostDetailViewModel onCreate$lambda$0$0$0$0(PostDetailActivity this$0, CreationExtras viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
        return new PostDetailViewModel(RepositoryFactory.INSTANCE.getCommunityRepository(this$0), RepositoryFactory.INSTANCE.getTokenRepository(this$0), RepositoryFactory.INSTANCE.getUserRepository(this$0), RepositoryFactory.INSTANCE.getFriendRepository(this$0), RepositoryFactory.INSTANCE.getMessageRepository(this$0));
    }

    public static final Unit onCreate$lambda$0$0$1$0(PostDetailActivity this$0) {
        this$0.finish();
        return Unit.INSTANCE;
    }
}
