package com.yhchat.canarys.p007ui.group;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
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

/* compiled from: GroupTagDetailActivity.kt */
@Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000f"}, m169d2 = {"Lcom/yhchat/canarys/ui/group/GroupTagDetailActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "viewModel", "Lcom/yhchat/canarys/ui/group/GroupTagDetailViewModel;", "getViewModel", "()Lcom/yhchat/canarys/ui/group/GroupTagDetailViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
@AndroidEntryPoint
/* loaded from: classes9.dex */
public final class GroupTagDetailActivity extends Hilt_GroupTagDetailActivity {
    private static final String EXTRA_GROUP_ID = "group_id";
    private static final String EXTRA_TAG_ID = "tag_id";
    private static final String EXTRA_TAG_NAME = "tag_name";

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public GroupTagDetailActivity() {
        final GroupTagDetailActivity groupTagDetailActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(GroupTagDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.yhchat.canarys.ui.group.GroupTagDetailActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return groupTagDetailActivity.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yhchat.canarys.ui.group.GroupTagDetailActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return groupTagDetailActivity.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: com.yhchat.canarys.ui.group.GroupTagDetailActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? groupTagDetailActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    private final GroupTagDetailViewModel getViewModel() {
        return (GroupTagDetailViewModel) this.viewModel.getValue();
    }

    /* compiled from: GroupTagDetailActivity.kt */
    @Metadata(m168d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J&\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, m169d2 = {"Lcom/yhchat/canarys/ui/group/GroupTagDetailActivity$Companion;", "", "<init>", "()V", "EXTRA_GROUP_ID", "", "EXTRA_TAG_ID", "EXTRA_TAG_NAME", "start", "", "context", "Landroid/content/Context;", "groupId", "tagId", "", "tagName", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void start(Context context, String groupId, long tagId, String tagName) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            Intrinsics.checkNotNullParameter(tagName, "tagName");
            Intent intent = new Intent(context, (Class<?>) GroupTagDetailActivity.class);
            intent.putExtra(GroupTagDetailActivity.EXTRA_GROUP_ID, groupId);
            intent.putExtra(GroupTagDetailActivity.EXTRA_TAG_ID, tagId);
            intent.putExtra(GroupTagDetailActivity.EXTRA_TAG_NAME, tagName);
            context.startActivity(intent);
        }
    }

    @Override // com.yhchat.canarys.p007ui.group.Hilt_GroupTagDetailActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable$default(this, null, null, 3, null);
        final String stringExtra = getIntent().getStringExtra(EXTRA_GROUP_ID);
        if (stringExtra == null) {
            finish();
            return;
        }
        final long tagId = getIntent().getLongExtra(EXTRA_TAG_ID, 0L);
        String stringExtra2 = getIntent().getStringExtra(EXTRA_TAG_NAME);
        if (stringExtra2 == null) {
            stringExtra2 = "\u6807\u7b7e";
        }
        final String tagName = stringExtra2;
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-401687264, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupTagDetailActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return GroupTagDetailActivity.onCreate$lambda$1(stringExtra, tagId, tagName, this, (Composer) obj, ((Integer) obj2).intValue());
            }
        }), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(final String $groupId, final long $tagId, final String $tagName, final GroupTagDetailActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C71@2825L274,71@2807L292:GroupTagDetailActivity.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-401687264, $changed, -1, "com.yhchat.canarys.ui.group.GroupTagDetailActivity.onCreate.<anonymous> (GroupTagDetailActivity.kt:71)");
            }
            ThemeKt.YhchatCanaryTheme(false, false, ComposableLambdaKt.rememberComposableLambda(-1670643581, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupTagDetailActivity$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupTagDetailActivity.onCreate$lambda$1$0($groupId, $tagId, $tagName, this$0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1$0(String $groupId, long $tagId, String $tagName, final GroupTagDetailActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C77@3055L12,72@2843L242:GroupTagDetailActivity.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1670643581, $changed, -1, "com.yhchat.canarys.ui.group.GroupTagDetailActivity.onCreate.<anonymous>.<anonymous> (GroupTagDetailActivity.kt:72)");
            }
            GroupTagDetailViewModel viewModel = this$0.getViewModel();
            ComposerKt.sourceInformationMarkerStart($composer, 829294735, "CC(remember):GroupTagDetailActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance(this$0);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupTagDetailActivity$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupTagDetailActivity.onCreate$lambda$1$0$0$0(this.f$0);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            GroupTagDetailActivityKt.GroupTagDetailScreen($groupId, $tagId, $tagName, viewModel, (Function0) objRememberedValue, $composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1$0$0$0(GroupTagDetailActivity this$0) {
        this$0.finish();
        return Unit.INSTANCE;
    }
}
