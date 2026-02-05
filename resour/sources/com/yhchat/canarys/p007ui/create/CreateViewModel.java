package com.yhchat.canarys.p007ui.create;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import androidx.autofill.HintConstants;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.p005di.RepositoryFactory;
import com.yhchat.canarys.data.repository.BotRepository;
import com.yhchat.canarys.data.repository.GroupRepository;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: CreateActivity.kt */
@Metadata(m168d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J*\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00130\u001aJ*\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00130\u001aJB\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00130\u001aJ:\u0010$\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010%\u001a\u00020&2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00130\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e\u00a8\u0006("}, m169d2 = {"Lcom/yhchat/canarys/ui/create/CreateViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "groupRepository", "Lcom/yhchat/canarys/data/repository/GroupRepository;", "botRepository", "Lcom/yhchat/canarys/data/repository/BotRepository;", "_groupUiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/create/CreateUiState;", "groupUiState", "Lkotlinx/coroutines/flow/StateFlow;", "getGroupUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "_botUiState", "botUiState", "getBotUiState", "init", "", "context", "Landroid/content/Context;", "uploadGroupAvatar", "uri", "Landroid/net/Uri;", "onSuccess", "Lkotlin/Function1;", "", "uploadBotAvatar", "createGroup", HintConstants.AUTOFILL_HINT_NAME, "introduction", "avatarUrl", "category", "categoryId", "", "createBot", "isPrivate", "", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes13.dex */
public final class CreateViewModel extends ViewModel {
    private static final String TAG = "CreateViewModel";
    private BotRepository botRepository;
    private GroupRepository groupRepository;
    public static final int $stable = 8;
    private final MutableStateFlow<CreateUiState> _groupUiState = StateFlowKt.MutableStateFlow(new CreateUiState(false, null, 3, null));
    private final StateFlow<CreateUiState> groupUiState = FlowKt.asStateFlow(this._groupUiState);
    private final MutableStateFlow<CreateUiState> _botUiState = StateFlowKt.MutableStateFlow(new CreateUiState(false, null, 3, null));
    private final StateFlow<CreateUiState> botUiState = FlowKt.asStateFlow(this._botUiState);

    public final StateFlow<CreateUiState> getGroupUiState() {
        return this.groupUiState;
    }

    public final StateFlow<CreateUiState> getBotUiState() {
        return this.botUiState;
    }

    public final void init(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.groupRepository = RepositoryFactory.INSTANCE.getGroupRepository(context);
        this.botRepository = RepositoryFactory.INSTANCE.getBotRepository(context);
    }

    /* compiled from: CreateActivity.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.create.CreateViewModel$uploadGroupAvatar$1", m185f = "CreateActivity.kt", m186i = {0, 1, 1, 2, 2, 2, 2}, m187l = {460, 465, 473}, m188m = "invokeSuspend", m189n = {"tokenRepository", "tokenRepository", "userToken", "tokenRepository", "userToken", "tokenResponse", "uploadToken"}, m191s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.create.CreateViewModel$uploadGroupAvatar$1 */
    static final class C37521 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Function1<String, Unit> $onSuccess;
        final /* synthetic */ Uri $uri;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C37521(Context context, Uri uri, Function1<? super String, Unit> function1, Continuation<? super C37521> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$uri = uri;
            this.$onSuccess = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateViewModel.this.new C37521(this.$context, this.$uri, this.$onSuccess, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C37521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0099 A[Catch: Exception -> 0x018b, TryCatch #0 {Exception -> 0x018b, blocks: (B:7:0x0029, B:50:0x0119, B:52:0x0124, B:54:0x0172, B:10:0x003e, B:31:0x00bc, B:33:0x00c4, B:35:0x00cc, B:40:0x00d6, B:42:0x00de, B:44:0x00e4, B:46:0x00ea, B:55:0x0173, B:56:0x017a, B:57:0x017b, B:58:0x0182, B:13:0x0049, B:19:0x0086, B:21:0x008d, B:27:0x0099, B:59:0x0183, B:60:0x018a, B:16:0x006c), top: B:65:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00c4 A[Catch: Exception -> 0x018b, TryCatch #0 {Exception -> 0x018b, blocks: (B:7:0x0029, B:50:0x0119, B:52:0x0124, B:54:0x0172, B:10:0x003e, B:31:0x00bc, B:33:0x00c4, B:35:0x00cc, B:40:0x00d6, B:42:0x00de, B:44:0x00e4, B:46:0x00ea, B:55:0x0173, B:56:0x017a, B:57:0x017b, B:58:0x0182, B:13:0x0049, B:19:0x0086, B:21:0x008d, B:27:0x0099, B:59:0x0183, B:60:0x018a, B:16:0x006c), top: B:65:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0124 A[Catch: Exception -> 0x018b, TryCatch #0 {Exception -> 0x018b, blocks: (B:7:0x0029, B:50:0x0119, B:52:0x0124, B:54:0x0172, B:10:0x003e, B:31:0x00bc, B:33:0x00c4, B:35:0x00cc, B:40:0x00d6, B:42:0x00de, B:44:0x00e4, B:46:0x00ea, B:55:0x0173, B:56:0x017a, B:57:0x017b, B:58:0x0182, B:13:0x0049, B:19:0x0086, B:21:0x008d, B:27:0x0099, B:59:0x0183, B:60:0x018a, B:16:0x006c), top: B:65:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0170  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0183 A[Catch: Exception -> 0x018b, TryCatch #0 {Exception -> 0x018b, blocks: (B:7:0x0029, B:50:0x0119, B:52:0x0124, B:54:0x0172, B:10:0x003e, B:31:0x00bc, B:33:0x00c4, B:35:0x00cc, B:40:0x00d6, B:42:0x00de, B:44:0x00e4, B:46:0x00ea, B:55:0x0173, B:56:0x017a, B:57:0x017b, B:58:0x0182, B:13:0x0049, B:19:0x0086, B:21:0x008d, B:27:0x0099, B:59:0x0183, B:60:0x018a, B:16:0x006c), top: B:65:0x000e }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Exception {
            /*
                Method dump skipped, instructions count: 468
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.create.CreateViewModel.C37521.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void uploadGroupAvatar(Context context, Uri uri, Function1<? super String, Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C37521(context, uri, onSuccess, null), 3, null);
    }

    /* compiled from: CreateActivity.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.create.CreateViewModel$uploadBotAvatar$1", m185f = "CreateActivity.kt", m186i = {0, 1, 1, 2, 2, 2, 2}, m187l = {501, 506, 514}, m188m = "invokeSuspend", m189n = {"tokenRepository", "tokenRepository", "userToken", "tokenRepository", "userToken", "tokenResponse", "uploadToken"}, m191s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.create.CreateViewModel$uploadBotAvatar$1 */
    static final class C37511 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Function1<String, Unit> $onSuccess;
        final /* synthetic */ Uri $uri;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C37511(Context context, Uri uri, Function1<? super String, Unit> function1, Continuation<? super C37511> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$uri = uri;
            this.$onSuccess = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateViewModel.this.new C37511(this.$context, this.$uri, this.$onSuccess, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C37511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0099 A[Catch: Exception -> 0x018b, TryCatch #0 {Exception -> 0x018b, blocks: (B:7:0x0029, B:50:0x0119, B:52:0x0124, B:54:0x0172, B:10:0x003e, B:31:0x00bc, B:33:0x00c4, B:35:0x00cc, B:40:0x00d6, B:42:0x00de, B:44:0x00e4, B:46:0x00ea, B:55:0x0173, B:56:0x017a, B:57:0x017b, B:58:0x0182, B:13:0x0049, B:19:0x0086, B:21:0x008d, B:27:0x0099, B:59:0x0183, B:60:0x018a, B:16:0x006c), top: B:65:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00c4 A[Catch: Exception -> 0x018b, TryCatch #0 {Exception -> 0x018b, blocks: (B:7:0x0029, B:50:0x0119, B:52:0x0124, B:54:0x0172, B:10:0x003e, B:31:0x00bc, B:33:0x00c4, B:35:0x00cc, B:40:0x00d6, B:42:0x00de, B:44:0x00e4, B:46:0x00ea, B:55:0x0173, B:56:0x017a, B:57:0x017b, B:58:0x0182, B:13:0x0049, B:19:0x0086, B:21:0x008d, B:27:0x0099, B:59:0x0183, B:60:0x018a, B:16:0x006c), top: B:65:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0124 A[Catch: Exception -> 0x018b, TryCatch #0 {Exception -> 0x018b, blocks: (B:7:0x0029, B:50:0x0119, B:52:0x0124, B:54:0x0172, B:10:0x003e, B:31:0x00bc, B:33:0x00c4, B:35:0x00cc, B:40:0x00d6, B:42:0x00de, B:44:0x00e4, B:46:0x00ea, B:55:0x0173, B:56:0x017a, B:57:0x017b, B:58:0x0182, B:13:0x0049, B:19:0x0086, B:21:0x008d, B:27:0x0099, B:59:0x0183, B:60:0x018a, B:16:0x006c), top: B:65:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0170  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0183 A[Catch: Exception -> 0x018b, TryCatch #0 {Exception -> 0x018b, blocks: (B:7:0x0029, B:50:0x0119, B:52:0x0124, B:54:0x0172, B:10:0x003e, B:31:0x00bc, B:33:0x00c4, B:35:0x00cc, B:40:0x00d6, B:42:0x00de, B:44:0x00e4, B:46:0x00ea, B:55:0x0173, B:56:0x017a, B:57:0x017b, B:58:0x0182, B:13:0x0049, B:19:0x0086, B:21:0x008d, B:27:0x0099, B:59:0x0183, B:60:0x018a, B:16:0x006c), top: B:65:0x000e }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Exception {
            /*
                Method dump skipped, instructions count: 468
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.create.CreateViewModel.C37511.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void uploadBotAvatar(Context context, Uri uri, Function1<? super String, Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C37511(context, uri, onSuccess, null), 3, null);
    }

    /* compiled from: CreateActivity.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.create.CreateViewModel$createGroup$1", m185f = "CreateActivity.kt", m186i = {}, m187l = {548}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.create.CreateViewModel$createGroup$1 */
    static final class C37501 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $avatarUrl;
        final /* synthetic */ String $category;
        final /* synthetic */ int $categoryId;
        final /* synthetic */ String $introduction;
        final /* synthetic */ String $name;
        final /* synthetic */ Function1<String, Unit> $onSuccess;
        int label;
        final /* synthetic */ CreateViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C37501(String str, String str2, String str3, String str4, int i, CreateViewModel createViewModel, Function1<? super String, Unit> function1, Continuation<? super C37501> continuation) {
            super(2, continuation);
            this.$name = str;
            this.$introduction = str2;
            this.$avatarUrl = str3;
            this.$category = str4;
            this.$categoryId = i;
            this.this$0 = createViewModel;
            this.$onSuccess = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C37501(this.$name, this.$introduction, this.$avatarUrl, this.$category, this.$categoryId, this.this$0, this.$onSuccess, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C37501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            GroupRepository groupRepository;
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Log.d(CreateViewModel.TAG, "\u1f3d7\ufe0f \u521b\u5efa\u7fa4\u804a: name=" + this.$name + ", introduction=" + this.$introduction + ", avatarUrl=" + this.$avatarUrl + ", category=" + this.$category + ", categoryId=" + this.$categoryId);
                    this.this$0._groupUiState.setValue(((CreateUiState) this.this$0._groupUiState.getValue()).copy(true, null));
                    GroupRepository groupRepository2 = this.this$0.groupRepository;
                    if (groupRepository2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("groupRepository");
                        groupRepository = null;
                    } else {
                        groupRepository = groupRepository2;
                    }
                    this.label = 1;
                    Object objM8568createGrouphUnOzRk = groupRepository.m8568createGrouphUnOzRk(this.$name, this.$introduction, this.$avatarUrl, this.$category, this.$categoryId, this);
                    if (objM8568createGrouphUnOzRk == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8568createGrouphUnOzRk;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CreateViewModel createViewModel = this.this$0;
            Function1<String, Unit> function1 = this.$onSuccess;
            CreateViewModel createViewModel2 = this.this$0;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                String str = (String) value;
                Log.d(CreateViewModel.TAG, "\u2705 \u7fa4\u804a\u521b\u5efa\u6210\u529f: groupId=" + str);
                createViewModel._groupUiState.setValue(CreateUiState.copy$default((CreateUiState) createViewModel._groupUiState.getValue(), false, null, 2, null));
                function1.invoke(str);
            } else {
                Log.e(CreateViewModel.TAG, "\u274c \u7fa4\u804a\u521b\u5efa\u5931\u8d25", thM11922exceptionOrNullimpl);
                MutableStateFlow mutableStateFlow = createViewModel2._groupUiState;
                CreateUiState createUiState = (CreateUiState) createViewModel2._groupUiState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u521b\u5efa\u5931\u8d25";
                }
                mutableStateFlow.setValue(createUiState.copy(false, message));
            }
            return Unit.INSTANCE;
        }
    }

    public final void createGroup(String name, String introduction, String avatarUrl, String category, int categoryId, Function1<? super String, Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(introduction, "introduction");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C37501(name, introduction, avatarUrl, category, categoryId, this, onSuccess, null), 3, null);
    }

    /* compiled from: CreateActivity.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.create.CreateViewModel$createBot$1", m185f = "CreateActivity.kt", m186i = {}, m187l = {582}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.create.CreateViewModel$createBot$1 */
    static final class C37491 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $avatarUrl;
        final /* synthetic */ String $introduction;
        final /* synthetic */ boolean $isPrivate;
        final /* synthetic */ String $name;
        final /* synthetic */ Function1<String, Unit> $onSuccess;
        int label;
        final /* synthetic */ CreateViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C37491(String str, String str2, String str3, boolean z, CreateViewModel createViewModel, Function1<? super String, Unit> function1, Continuation<? super C37491> continuation) {
            super(2, continuation);
            this.$name = str;
            this.$introduction = str2;
            this.$avatarUrl = str3;
            this.$isPrivate = z;
            this.this$0 = createViewModel;
            this.$onSuccess = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C37491(this.$name, this.$introduction, this.$avatarUrl, this.$isPrivate, this.this$0, this.$onSuccess, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C37491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            BotRepository botRepository;
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Log.d(CreateViewModel.TAG, "\u1f916 \u521b\u5efa\u673a\u5668\u4eba: name=" + this.$name + ", introduction=" + this.$introduction + ", avatarUrl=" + this.$avatarUrl + ", isPrivate=" + this.$isPrivate);
                    this.this$0._botUiState.setValue(((CreateUiState) this.this$0._botUiState.getValue()).copy(true, null));
                    BotRepository botRepository2 = this.this$0.botRepository;
                    if (botRepository2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("botRepository");
                        botRepository = null;
                    } else {
                        botRepository = botRepository2;
                    }
                    this.label = 1;
                    Object objM8481createBotyxL6bBk = botRepository.m8481createBotyxL6bBk(this.$name, this.$introduction, this.$avatarUrl, this.$isPrivate, this);
                    if (objM8481createBotyxL6bBk == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8481createBotyxL6bBk;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CreateViewModel createViewModel = this.this$0;
            Function1<String, Unit> function1 = this.$onSuccess;
            CreateViewModel createViewModel2 = this.this$0;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                String str = (String) value;
                Log.d(CreateViewModel.TAG, "\u2705 \u673a\u5668\u4eba\u521b\u5efa\u6210\u529f: botId=" + str);
                createViewModel._botUiState.setValue(CreateUiState.copy$default((CreateUiState) createViewModel._botUiState.getValue(), false, null, 2, null));
                function1.invoke(str);
            } else {
                Log.e(CreateViewModel.TAG, "\u274c \u673a\u5668\u4eba\u521b\u5efa\u5931\u8d25", thM11922exceptionOrNullimpl);
                MutableStateFlow mutableStateFlow = createViewModel2._botUiState;
                CreateUiState createUiState = (CreateUiState) createViewModel2._botUiState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u521b\u5efa\u5931\u8d25";
                }
                mutableStateFlow.setValue(createUiState.copy(false, message));
            }
            return Unit.INSTANCE;
        }
    }

    public final void createBot(String name, String introduction, String avatarUrl, boolean isPrivate, Function1<? super String, Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(introduction, "introduction");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C37491(name, introduction, avatarUrl, isPrivate, this, onSuccess, null), 3, null);
    }
}
