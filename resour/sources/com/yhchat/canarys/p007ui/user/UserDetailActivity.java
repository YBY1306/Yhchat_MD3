package com.yhchat.canarys.p007ui.user;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.yhchat.canarys.p007ui.base.BaseActivity;
import com.yhchat.canarys.p007ui.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserDetailActivity.kt */
@Metadata(m168d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014\u00a8\u0006\t"}, m169d2 = {"Lcom/yhchat/canarys/ui/user/UserDetailActivity;", "Lcom/yhchat/canarys/ui/base/BaseActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes13.dex */
public final class UserDetailActivity extends BaseActivity {
    private static final String EXTRA_GROUP_ID = "group_id";
    private static final String EXTRA_USER_ID = "user_id";
    private static final String EXTRA_USER_NAME = "user_name";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: UserDetailActivity.kt */
    @Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J,\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, m169d2 = {"Lcom/yhchat/canarys/ui/user/UserDetailActivity$Companion;", "", "<init>", "()V", "EXTRA_USER_ID", "", "EXTRA_USER_NAME", "EXTRA_GROUP_ID", "start", "", "context", "Landroid/content/Context;", "userId", "userName", "groupId", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ void start$default(Companion companion, Context context, String str, String str2, String str3, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = "";
            }
            if ((i & 8) != 0) {
                str3 = null;
            }
            companion.start(context, str, str2, str3);
        }

        public final void start(Context context, String userId, String userName, String groupId) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(userName, "userName");
            Intent intent = new Intent(context, (Class<?>) UserDetailActivity.class);
            intent.putExtra(UserDetailActivity.EXTRA_USER_ID, userId);
            intent.putExtra(UserDetailActivity.EXTRA_USER_NAME, userName);
            if (groupId != null) {
                intent.putExtra(UserDetailActivity.EXTRA_GROUP_ID, groupId);
            }
            context.startActivity(intent);
        }
    }

    @Override // com.yhchat.canarys.p007ui.base.BaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final String userId = getIntent().getStringExtra(EXTRA_USER_ID);
        if (userId == null) {
            userId = "";
        }
        String stringExtra = getIntent().getStringExtra(EXTRA_USER_NAME);
        final String userName = stringExtra != null ? stringExtra : "";
        final String groupId = getIntent().getStringExtra(EXTRA_GROUP_ID);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-312378326, true, new Function2() { // from class: com.yhchat.canarys.ui.user.UserDetailActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return UserDetailActivity.onCreate$lambda$0(userId, userName, groupId, this, (Composer) obj, ((Integer) obj2).intValue());
            }
        }), 1, null);
    }

    public static final Unit onCreate$lambda$0(final String $userId, final String $userName, final String $groupId, final UserDetailActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C91@3910L231,91@3892L249:UserDetailActivity.kt#kdg0fc");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-312378326, $changed, -1, "com.yhchat.canarys.ui.user.UserDetailActivity.onCreate.<anonymous> (UserDetailActivity.kt:91)");
            }
            ThemeKt.YhchatCanaryTheme(false, false, ComposableLambdaKt.rememberComposableLambda(343887207, true, new Function2() { // from class: com.yhchat.canarys.ui.user.UserDetailActivity$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UserDetailActivity.onCreate$lambda$0$0($userId, $userName, $groupId, this$0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$0$0(String $userId, String $userName, String $groupId, final UserDetailActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C96@4097L12,92@3928L199:UserDetailActivity.kt#kdg0fc");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(343887207, $changed, -1, "com.yhchat.canarys.ui.user.UserDetailActivity.onCreate.<anonymous>.<anonymous> (UserDetailActivity.kt:92)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -236869869, "CC(remember):UserDetailActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance(this$0);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.user.UserDetailActivity$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UserDetailActivity.onCreate$lambda$0$0$0$0(this.f$0);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UserDetailActivityKt.UserDetailScreen($userId, $userName, $groupId, (Function0) objRememberedValue, $composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$0$0$0$0(UserDetailActivity this$0) {
        this$0.finish();
        return Unit.INSTANCE;
    }
}
