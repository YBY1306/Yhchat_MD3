package com.yhchat.canarys.p007ui.group;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.yhchat.canarys.p007ui.theme.ThemeKt;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: ChatSearchActivity.kt */
@Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000f"}, m169d2 = {"Lcom/yhchat/canarys/ui/group/ChatSearchActivity;", "Lcom/yhchat/canarys/ui/base/BaseActivity;", "<init>", "()V", "viewModel", "Lcom/yhchat/canarys/ui/group/ChatSearchViewModel;", "getViewModel", "()Lcom/yhchat/canarys/ui/group/ChatSearchViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
@AndroidEntryPoint
/* loaded from: classes9.dex */
public final class ChatSearchActivity extends Hilt_ChatSearchActivity {
    public static final String EXTRA_CHAT_ID = "chatId";
    public static final String EXTRA_CHAT_NAME = "chatName";
    public static final String EXTRA_CHAT_TYPE = "chatType";

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public ChatSearchActivity() {
        final ChatSearchActivity chatSearchActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ChatSearchViewModel.class), new Function0<ViewModelStore>() { // from class: com.yhchat.canarys.ui.group.ChatSearchActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return chatSearchActivity.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yhchat.canarys.ui.group.ChatSearchActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return chatSearchActivity.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: com.yhchat.canarys.ui.group.ChatSearchActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? chatSearchActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    private final ChatSearchViewModel getViewModel() {
        return (ChatSearchViewModel) this.viewModel.getValue();
    }

    /* compiled from: ChatSearchActivity.kt */
    @Metadata(m168d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J&\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, m169d2 = {"Lcom/yhchat/canarys/ui/group/ChatSearchActivity$Companion;", "", "<init>", "()V", "EXTRA_CHAT_ID", "", "EXTRA_CHAT_TYPE", "EXTRA_CHAT_NAME", "start", "", "context", "Landroid/content/Context;", ChatSearchActivity.EXTRA_CHAT_ID, ChatSearchActivity.EXTRA_CHAT_TYPE, "", ChatSearchActivity.EXTRA_CHAT_NAME, "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void start(Context context, String chatId, int chatType, String chatName) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            Intrinsics.checkNotNullParameter(chatName, "chatName");
            Intent intent = new Intent(context, (Class<?>) ChatSearchActivity.class);
            intent.putExtra(ChatSearchActivity.EXTRA_CHAT_ID, chatId);
            intent.putExtra(ChatSearchActivity.EXTRA_CHAT_TYPE, chatType);
            intent.putExtra(ChatSearchActivity.EXTRA_CHAT_NAME, chatName);
            context.startActivity(intent);
        }
    }

    @Override // com.yhchat.canarys.p007ui.group.Hilt_ChatSearchActivity, com.yhchat.canarys.p007ui.base.BaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable$default(this, null, null, 3, null);
        final String chatId = getIntent().getStringExtra(EXTRA_CHAT_ID);
        if (chatId == null) {
            Log.e("ChatSearchActivity", "Missing chatId in intent");
            finish();
            return;
        }
        final int chatType = getIntent().getIntExtra(EXTRA_CHAT_TYPE, 2);
        final String chatName = getIntent().getStringExtra(EXTRA_CHAT_NAME);
        if (chatName == null) {
            chatName = "\u804a\u5929";
        }
        Log.d("ChatSearchActivity", "Opening chat search: id=" + chatId + ", type=" + chatType + ", name=" + chatName);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(736499448, true, new Function2() { // from class: com.yhchat.canarys.ui.group.ChatSearchActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ChatSearchActivity.onCreate$lambda$1(chatId, chatType, chatName, this, (Composer) obj, ((Integer) obj2).intValue());
            }
        }), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(final String $chatId, final int $chatType, final String $chatName, final ChatSearchActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C53@1995L487,53@1977L505:ChatSearchActivity.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(736499448, $changed, -1, "com.yhchat.canarys.ui.group.ChatSearchActivity.onCreate.<anonymous> (ChatSearchActivity.kt:53)");
            }
            ThemeKt.YhchatCanaryTheme(false, false, ComposableLambdaKt.rememberComposableLambda(-394105509, true, new Function2() { // from class: com.yhchat.canarys.ui.group.ChatSearchActivity$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatSearchActivity.onCreate$lambda$1$0($chatId, $chatType, $chatName, this$0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1$0(final String $chatId, final int $chatType, final String $chatName, final ChatSearchActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C56@2119L11,57@2160L308,54@2013L455:ChatSearchActivity.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-394105509, $changed, -1, "com.yhchat.canarys.ui.group.ChatSearchActivity.onCreate.<anonymous>.<anonymous> (ChatSearchActivity.kt:54)");
            }
            SurfaceKt.m3209SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getBackground(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1181630026, true, new Function2() { // from class: com.yhchat.canarys.ui.group.ChatSearchActivity$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatSearchActivity.onCreate$lambda$1$0$0($chatId, $chatType, $chatName, this$0, (Composer) obj, ((Integer) obj2).intValue());
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1$0$0(String $chatId, int $chatType, String $chatName, final ChatSearchActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C63@2416L12,58@2182L268:ChatSearchActivity.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1181630026, $changed, -1, "com.yhchat.canarys.ui.group.ChatSearchActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (ChatSearchActivity.kt:58)");
            }
            ChatSearchViewModel viewModel = this$0.getViewModel();
            ComposerKt.sourceInformationMarkerStart($composer, -1675080638, "CC(remember):ChatSearchActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance(this$0);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.group.ChatSearchActivity$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ChatSearchActivity.onCreate$lambda$1$0$0$0$0(this.f$0);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ChatSearchScreenKt.ChatSearchScreen($chatId, $chatType, $chatName, viewModel, (Function0) objRememberedValue, $composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1$0$0$0$0(ChatSearchActivity this$0) {
        this$0.finish();
        return Unit.INSTANCE;
    }
}
