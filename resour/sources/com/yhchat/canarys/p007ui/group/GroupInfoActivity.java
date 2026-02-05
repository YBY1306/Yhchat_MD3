package com.yhchat.canarys.p007ui.group;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
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

/* compiled from: GroupInfoActivity.kt */
@Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000f"}, m169d2 = {"Lcom/yhchat/canarys/ui/group/GroupInfoActivity;", "Lcom/yhchat/canarys/ui/base/BaseActivity;", "<init>", "()V", "viewModel", "Lcom/yhchat/canarys/ui/group/GroupInfoViewModel;", "getViewModel", "()Lcom/yhchat/canarys/ui/group/GroupInfoViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
@AndroidEntryPoint
/* loaded from: classes9.dex */
public final class GroupInfoActivity extends Hilt_GroupInfoActivity {
    public static final String EXTRA_GROUP_ID = "groupId";
    public static final String EXTRA_GROUP_NAME = "groupName";

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public GroupInfoActivity() {
        final GroupInfoActivity groupInfoActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(GroupInfoViewModel.class), new Function0<ViewModelStore>() { // from class: com.yhchat.canarys.ui.group.GroupInfoActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return groupInfoActivity.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yhchat.canarys.ui.group.GroupInfoActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return groupInfoActivity.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: com.yhchat.canarys.ui.group.GroupInfoActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? groupInfoActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    private final GroupInfoViewModel getViewModel() {
        return (GroupInfoViewModel) this.viewModel.getValue();
    }

    /* compiled from: GroupInfoActivity.kt */
    @Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, m169d2 = {"Lcom/yhchat/canarys/ui/group/GroupInfoActivity$Companion;", "", "<init>", "()V", "EXTRA_GROUP_ID", "", "EXTRA_GROUP_NAME", "start", "", "context", "Landroid/content/Context;", "groupId", "groupName", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
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
            Intent intent = new Intent(context, (Class<?>) GroupInfoActivity.class);
            intent.putExtra("groupId", groupId);
            intent.putExtra("groupName", groupName);
            context.startActivity(intent);
        }
    }

    @Override // com.yhchat.canarys.p007ui.group.Hilt_GroupInfoActivity, com.yhchat.canarys.p007ui.base.BaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable$default(this, null, null, 3, null);
        final String groupId = getIntent().getStringExtra("groupId");
        if (groupId == null) {
            Log.e("GroupInfoActivity", "Missing groupId in intent");
            finish();
            return;
        }
        final String groupName = getIntent().getStringExtra("groupName");
        if (groupName == null) {
            groupName = "\u7fa4\u804a";
        }
        Log.d("GroupInfoActivity", "Opening group info: id=" + groupId + ", name=" + groupName);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-465811426, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupInfoActivity$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return GroupInfoActivity.onCreate$lambda$1(groupId, groupName, this, (Composer) obj, ((Integer) obj2).intValue());
            }
        }), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(final String $groupId, final String $groupName, final GroupInfoActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C53@1940L2575,53@1922L2593:GroupInfoActivity.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-465811426, $changed, -1, "com.yhchat.canarys.ui.group.GroupInfoActivity.onCreate.<anonymous> (GroupInfoActivity.kt:53)");
            }
            ThemeKt.YhchatCanaryTheme(false, false, ComposableLambdaKt.rememberComposableLambda(-1414472895, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupInfoActivity$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupInfoActivity.onCreate$lambda$1$0($groupId, $groupName, this$0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1$0(final String $groupId, final String $groupName, final GroupInfoActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C56@2064L11,57@2105L2396,54@1958L2543:GroupInfoActivity.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1414472895, $changed, -1, "com.yhchat.canarys.ui.group.GroupInfoActivity.onCreate.<anonymous>.<anonymous> (GroupInfoActivity.kt:54)");
            }
            SurfaceKt.m3209SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getBackground(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(28281436, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupInfoActivity$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupInfoActivity.onCreate$lambda$1$0$0($groupId, $groupName, this$0, (Composer) obj, ((Integer) obj2).intValue());
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
    public static final Unit onCreate$lambda$1$0$0(final String $groupId, final String $groupName, final GroupInfoActivity this$0, Composer $composer, int $changed) {
        GroupInfoViewModel groupInfoViewModel;
        ComposerKt.sourceInformation($composer, "C62@2323L12,63@2379L923,79@3343L83,82@3468L83,85@3597L864,58@2127L2356:GroupInfoActivity.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(28281436, $changed, -1, "com.yhchat.canarys.ui.group.GroupInfoActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (GroupInfoActivity.kt:58)");
            }
            GroupInfoViewModel viewModel = this$0.getViewModel();
            ComposerKt.sourceInformationMarkerStart($composer, 1408663208, "CC(remember):GroupInfoActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance(this$0);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupInfoActivity$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupInfoActivity.onCreate$lambda$1$0$0$0$0(this.f$0);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            Function0 function0 = (Function0) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 1408665911, "CC(remember):GroupInfoActivity.kt#9igjgp");
            boolean zChangedInstance2 = $composer.changedInstance(this$0) | $composer.changed($groupId) | $composer.changed($groupName);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupInfoActivity$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupInfoActivity.onCreate$lambda$1$0$0$1$0(this.f$0, $groupId, $groupName);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            Function0 function02 = (Function0) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 1408695919, "CC(remember):GroupInfoActivity.kt#9igjgp");
            Object objRememberedValue3 = $composer.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupInfoActivity$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                $composer.updateRememberedValue(obj3);
                objRememberedValue3 = obj3;
            }
            Function0 function03 = (Function0) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 1408699919, "CC(remember):GroupInfoActivity.kt#9igjgp");
            Object objRememberedValue4 = $composer.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object obj4 = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupInfoActivity$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                $composer.updateRememberedValue(obj4);
                objRememberedValue4 = obj4;
            }
            Function0 function04 = (Function0) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 1408704828, "CC(remember):GroupInfoActivity.kt#9igjgp");
            boolean zChangedInstance3 = $composer.changedInstance(this$0) | $composer.changed($groupId) | $composer.changed($groupName);
            Object objRememberedValue5 = $composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                groupInfoViewModel = viewModel;
                Object obj5 = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupInfoActivity$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupInfoActivity.onCreate$lambda$1$0$0$4$0(this.f$0, $groupId, $groupName);
                    }
                };
                $composer.updateRememberedValue(obj5);
                objRememberedValue5 = obj5;
            } else {
                groupInfoViewModel = viewModel;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            GroupInfoScreenKt.GroupInfoScreenRoot($groupId, $groupName, groupInfoViewModel, function0, function02, function03, function04, (Function0) objRememberedValue5, null, $composer, 1769472, 256);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1$0$0$0$0(GroupInfoActivity this$0) {
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1$0$0$1$0(GroupInfoActivity this$0, String $groupId, String $groupName) {
        try {
            Intent intent = new Intent(this$0, (Class<?>) GroupSettingsActivity.class);
            intent.putExtra("groupId", $groupId);
            intent.putExtra("groupName", $groupName);
            this$0.startActivity(intent);
        } catch (Exception e) {
            Log.e("GroupInfoActivity", "Failed to open settings", e);
            Toast.makeText(this$0, "\u65e0\u6cd5\u6253\u5f00\u7fa4\u804a\u8bbe\u7f6e", 0).show();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1$0$0$4$0(GroupInfoActivity this$0, String $groupId, String $groupName) {
        try {
            ChatSearchActivity.INSTANCE.start(this$0, $groupId, 2, $groupName);
        } catch (Exception e) {
            Log.e("GroupInfoActivity", "Failed to open chat search", e);
            Toast.makeText(this$0, "\u65e0\u6cd5\u6253\u5f00\u804a\u5929\u8bb0\u5f55\u641c\u7d22", 0).show();
        }
        return Unit.INSTANCE;
    }
}
