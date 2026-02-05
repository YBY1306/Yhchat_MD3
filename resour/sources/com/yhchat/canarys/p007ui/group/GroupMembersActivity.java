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

/* compiled from: GroupMembersActivity.kt */
@Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000f"}, m169d2 = {"Lcom/yhchat/canarys/ui/group/GroupMembersActivity;", "Lcom/yhchat/canarys/ui/base/BaseActivity;", "<init>", "()V", "viewModel", "Lcom/yhchat/canarys/ui/group/GroupInfoViewModel;", "getViewModel", "()Lcom/yhchat/canarys/ui/group/GroupInfoViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
@AndroidEntryPoint
/* loaded from: classes9.dex */
public final class GroupMembersActivity extends Hilt_GroupMembersActivity {
    public static final String EXTRA_GROUP_ID = "groupId";
    public static final String EXTRA_GROUP_NAME = "groupName";

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public GroupMembersActivity() {
        final GroupMembersActivity groupMembersActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(GroupInfoViewModel.class), new Function0<ViewModelStore>() { // from class: com.yhchat.canarys.ui.group.GroupMembersActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return groupMembersActivity.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yhchat.canarys.ui.group.GroupMembersActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return groupMembersActivity.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: com.yhchat.canarys.ui.group.GroupMembersActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? groupMembersActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    private final GroupInfoViewModel getViewModel() {
        return (GroupInfoViewModel) this.viewModel.getValue();
    }

    /* compiled from: GroupMembersActivity.kt */
    @Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, m169d2 = {"Lcom/yhchat/canarys/ui/group/GroupMembersActivity$Companion;", "", "<init>", "()V", "EXTRA_GROUP_ID", "", "EXTRA_GROUP_NAME", "start", "", "context", "Landroid/content/Context;", "groupId", "groupName", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
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
            Intent intent = new Intent(context, (Class<?>) GroupMembersActivity.class);
            intent.putExtra("groupId", groupId);
            intent.putExtra("groupName", groupName);
            context.startActivity(intent);
        }
    }

    @Override // com.yhchat.canarys.p007ui.group.Hilt_GroupMembersActivity, com.yhchat.canarys.p007ui.base.BaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable$default(this, null, null, 3, null);
        final String groupId = getIntent().getStringExtra("groupId");
        if (groupId == null) {
            Log.e("GroupMembersActivity", "Missing groupId in intent");
            finish();
        } else {
            final String groupName = getIntent().getStringExtra("groupName");
            if (groupName == null) {
                groupName = "\u7fa4\u6210\u5458";
            }
            ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-1926044348, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupMembersActivity$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupMembersActivity.onCreate$lambda$1(groupId, groupName, this, (Composer) obj, ((Integer) obj2).intValue());
                }
            }), 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(final String $groupId, final String $groupName, final GroupMembersActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C48@1696L448,48@1678L466:GroupMembersActivity.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1926044348, $changed, -1, "com.yhchat.canarys.ui.group.GroupMembersActivity.onCreate.<anonymous> (GroupMembersActivity.kt:48)");
            }
            ThemeKt.YhchatCanaryTheme(false, false, ComposableLambdaKt.rememberComposableLambda(1562858023, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupMembersActivity$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupMembersActivity.onCreate$lambda$1$0($groupId, $groupName, this$0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1$0(final String $groupId, final String $groupName, final GroupMembersActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C51@1820L11,52@1861L269,49@1714L416:GroupMembersActivity.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1562858023, $changed, -1, "com.yhchat.canarys.ui.group.GroupMembersActivity.onCreate.<anonymous>.<anonymous> (GroupMembersActivity.kt:49)");
            }
            SurfaceKt.m3209SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getBackground(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1284570878, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupMembersActivity$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupMembersActivity.onCreate$lambda$1$0$0($groupId, $groupName, this$0, (Composer) obj, ((Integer) obj2).intValue());
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
    public static final Unit onCreate$lambda$1$0$0(String $groupId, String $groupName, final GroupMembersActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C57@2078L12,53@1883L229:GroupMembersActivity.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1284570878, $changed, -1, "com.yhchat.canarys.ui.group.GroupMembersActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (GroupMembersActivity.kt:53)");
            }
            GroupInfoViewModel viewModel = this$0.getViewModel();
            ComposerKt.sourceInformationMarkerStart($composer, -1816992850, "CC(remember):GroupMembersActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance(this$0);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupMembersActivity$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupMembersActivity.onCreate$lambda$1$0$0$0$0(this.f$0);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            GroupMembersScreenKt.GroupMembersScreen($groupId, $groupName, viewModel, (Function0) objRememberedValue, null, $composer, 0, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1$0$0$0$0(GroupMembersActivity this$0) {
        this$0.finish();
        return Unit.INSTANCE;
    }
}
