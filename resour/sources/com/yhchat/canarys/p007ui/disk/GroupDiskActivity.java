package com.yhchat.canarys.p007ui.disk;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
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

/* compiled from: GroupDiskActivity.kt */
@Metadata(m168d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014\u00a8\u0006\t"}, m169d2 = {"Lcom/yhchat/canarys/ui/disk/GroupDiskActivity;", "Lcom/yhchat/canarys/ui/base/BaseActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes8.dex */
public final class GroupDiskActivity extends BaseActivity {
    public static final String EXTRA_GROUP_ID = "extra_group_id";
    public static final String EXTRA_GROUP_NAME = "extra_group_name";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: GroupDiskActivity.kt */
    @Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, m169d2 = {"Lcom/yhchat/canarys/ui/disk/GroupDiskActivity$Companion;", "", "<init>", "()V", "EXTRA_GROUP_ID", "", "EXTRA_GROUP_NAME", "start", "", "context", "Landroid/content/Context;", "groupId", "groupName", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void start(Context context, String groupId, String groupName) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            Intrinsics.checkNotNullParameter(groupName, "groupName");
            Intent intent = new Intent(context, (Class<?>) GroupDiskActivity.class);
            intent.putExtra("extra_group_id", groupId);
            intent.putExtra("extra_group_name", groupName);
            context.startActivity(intent);
        }
    }

    @Override // com.yhchat.canarys.p007ui.base.BaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable$default(this, null, null, 3, null);
        final String groupId = getIntent().getStringExtra("extra_group_id");
        if (groupId == null) {
            groupId = "";
        }
        final String groupName = getIntent().getStringExtra("extra_group_name");
        if (groupName == null) {
            groupName = "\u7fa4\u804a";
        }
        if (groupId.length() == 0) {
            finish();
        } else {
            ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-736406630, true, new Function2() { // from class: com.yhchat.canarys.ui.disk.GroupDiskActivity$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupDiskActivity.onCreate$lambda$0(groupId, groupName, this, (Composer) obj, ((Integer) obj2).intValue());
                }
            }), 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(final String $groupId, final String $groupName, final GroupDiskActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C81@3114L195,81@3096L213:GroupDiskActivity.kt#kdr2ae");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-736406630, $changed, -1, "com.yhchat.canarys.ui.disk.GroupDiskActivity.onCreate.<anonymous> (GroupDiskActivity.kt:81)");
            }
            ThemeKt.YhchatCanaryTheme(false, false, ComposableLambdaKt.rememberComposableLambda(-905555945, true, new Function2() { // from class: com.yhchat.canarys.ui.disk.GroupDiskActivity$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupDiskActivity.onCreate$lambda$0$0($groupId, $groupName, this$0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0(String $groupId, String $groupName, final GroupDiskActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C85@3265L12,82@3132L163:GroupDiskActivity.kt#kdr2ae");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-905555945, $changed, -1, "com.yhchat.canarys.ui.disk.GroupDiskActivity.onCreate.<anonymous>.<anonymous> (GroupDiskActivity.kt:82)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1639102787, "CC(remember):GroupDiskActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance(this$0);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.disk.GroupDiskActivity$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupDiskActivity.onCreate$lambda$0$0$0$0(this.f$0);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            GroupDiskActivityKt.GroupDiskScreen($groupId, $groupName, (Function0) objRememberedValue, null, $composer, 0, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0$0$0(GroupDiskActivity this$0) {
        this$0.finish();
        return Unit.INSTANCE;
    }
}
