package com.yhchat.canarys.p007ui.group;

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
import kotlin.jvm.internal.Reflection;

/* compiled from: GroupSettingsActivity.kt */
@Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000f"}, m169d2 = {"Lcom/yhchat/canarys/ui/group/GroupSettingsActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "viewModel", "Lcom/yhchat/canarys/ui/group/GroupSettingsViewModel;", "getViewModel", "()Lcom/yhchat/canarys/ui/group/GroupSettingsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
@AndroidEntryPoint
/* loaded from: classes9.dex */
public final class GroupSettingsActivity extends Hilt_GroupSettingsActivity {
    public static final String EXTRA_GROUP_ID = "groupId";
    public static final String EXTRA_GROUP_NAME = "groupName";

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;
    public static final int $stable = 8;

    public GroupSettingsActivity() {
        final GroupSettingsActivity groupSettingsActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(GroupSettingsViewModel.class), new Function0<ViewModelStore>() { // from class: com.yhchat.canarys.ui.group.GroupSettingsActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return groupSettingsActivity.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yhchat.canarys.ui.group.GroupSettingsActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return groupSettingsActivity.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: com.yhchat.canarys.ui.group.GroupSettingsActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? groupSettingsActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    private final GroupSettingsViewModel getViewModel() {
        return (GroupSettingsViewModel) this.viewModel.getValue();
    }

    @Override // com.yhchat.canarys.p007ui.group.Hilt_GroupSettingsActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable$default(this, null, null, 3, null);
        final String groupId = getIntent().getStringExtra("groupId");
        if (groupId == null) {
            Log.e("GroupSettingsActivity", "Missing groupId in intent");
            finish();
            return;
        }
        final String groupName = getIntent().getStringExtra("groupName");
        if (groupName == null) {
            groupName = "\u7fa4\u804a\u8bbe\u7f6e";
        }
        Log.d("GroupSettingsActivity", "Opening group settings: id=" + groupId + ", name=" + groupName);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(38340158, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupSettingsActivity$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return GroupSettingsActivity.onCreate$lambda$1(groupId, groupName, this, (Composer) obj, ((Integer) obj2).intValue());
            }
        }), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(final String $groupId, final String $groupName, final GroupSettingsActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C40@1411L453,40@1393L471:GroupSettingsActivity.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(38340158, $changed, -1, "com.yhchat.canarys.ui.group.GroupSettingsActivity.onCreate.<anonymous> (GroupSettingsActivity.kt:40)");
            }
            ThemeKt.YhchatCanaryTheme(false, false, ComposableLambdaKt.rememberComposableLambda(-1495939487, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupSettingsActivity$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupSettingsActivity.onCreate$lambda$1$0($groupId, $groupName, this$0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1$0(final String $groupId, final String $groupName, final GroupSettingsActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C43@1535L11,44@1576L274,41@1429L421:GroupSettingsActivity.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1495939487, $changed, -1, "com.yhchat.canarys.ui.group.GroupSettingsActivity.onCreate.<anonymous>.<anonymous> (GroupSettingsActivity.kt:41)");
            }
            SurfaceKt.m3209SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getBackground(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1980945796, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupSettingsActivity$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupSettingsActivity.onCreate$lambda$1$0$0($groupId, $groupName, this$0, (Composer) obj, ((Integer) obj2).intValue());
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
    public static final Unit onCreate$lambda$1$0$0(String $groupId, String $groupName, final GroupSettingsActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C49@1798L12,45@1598L234:GroupSettingsActivity.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1980945796, $changed, -1, "com.yhchat.canarys.ui.group.GroupSettingsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (GroupSettingsActivity.kt:45)");
            }
            GroupSettingsViewModel viewModel = this$0.getViewModel();
            ComposerKt.sourceInformationMarkerStart($composer, -1018390712, "CC(remember):GroupSettingsActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance(this$0);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupSettingsActivity$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupSettingsActivity.onCreate$lambda$1$0$0$0$0(this.f$0);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            GroupSettingsScreenKt.GroupSettingsScreenRoot($groupId, $groupName, viewModel, (Function0) objRememberedValue, null, $composer, 0, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1$0$0$0$0(GroupSettingsActivity this$0) {
        this$0.finish();
        return Unit.INSTANCE;
    }
}
