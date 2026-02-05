package com.yhchat.canarys.p007ui.user;

import android.content.Context;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: UserDetailActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.user.UserDetailActivityKt$UserDetailScreen$1$1", m185f = "UserDetailActivity.kt", m186i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5}, m187l = {156, 160, 165, 185, ComposerKt.providerKey, 221}, m188m = "invokeSuspend", m189n = {"db", "tokenRepository", "userRepository", "communityRepository", "friendRepository", "groupRepository", "db", "tokenRepository", "userRepository", "communityRepository", "friendRepository", "groupRepository", "localToken", "db", "tokenRepository", "userRepository", "communityRepository", "friendRepository", "groupRepository", "localToken", "cachedConversation", "db", "tokenRepository", "userRepository", "communityRepository", "friendRepository", "groupRepository", "localToken", "cachedConversation", "requestProto", "requestBody", "db", "tokenRepository", "userRepository", "communityRepository", "friendRepository", "groupRepository", "localToken", "cachedConversation", "requestProto", "requestBody", "db", "tokenRepository", "userRepository", "communityRepository", "friendRepository", "groupRepository", "localToken", "cachedConversation", "requestProto", "requestBody", "page", "hasMore", "allMembers"}, m191s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12"}, m192v = 1)
/* loaded from: classes13.dex */
final class UserDetailActivityKt$UserDetailScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $groupId;
    final /* synthetic */ MutableState<Boolean> $isCheckingAddressBook$delegate;
    final /* synthetic */ MutableState<Boolean> $isInAddressBook$delegate;
    final /* synthetic */ MutableState<Boolean> $isNoNotify$delegate;
    final /* synthetic */ MutableState<Integer> $targetUserPermission$delegate;
    final /* synthetic */ MutableState<String> $token$delegate;
    final /* synthetic */ MutableState<UserDetailUiState> $uiState$delegate;
    final /* synthetic */ String $userId;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserDetailActivityKt$UserDetailScreen$1$1(Context context, String str, String str2, MutableState<UserDetailUiState> mutableState, MutableState<String> mutableState2, MutableState<Boolean> mutableState3, MutableState<Boolean> mutableState4, MutableState<Boolean> mutableState5, MutableState<Integer> mutableState6, Continuation<? super UserDetailActivityKt$UserDetailScreen$1$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$userId = str;
        this.$groupId = str2;
        this.$uiState$delegate = mutableState;
        this.$token$delegate = mutableState2;
        this.$isNoNotify$delegate = mutableState3;
        this.$isCheckingAddressBook$delegate = mutableState4;
        this.$isInAddressBook$delegate = mutableState5;
        this.$targetUserPermission$delegate = mutableState6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UserDetailActivityKt$UserDetailScreen$1$1(this.$context, this.$userId, this.$groupId, this.$uiState$delegate, this.$token$delegate, this.$isNoNotify$delegate, this.$isCheckingAddressBook$delegate, this.$isInAddressBook$delegate, this.$targetUserPermission$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UserDetailActivityKt$UserDetailScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x05f9, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0254, code lost:
    
        r3 = (com.yhchat.canarys.data.model.Conversation) r15;
        r5 = r31.$isNoNotify$delegate;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0259, code lost:
    
        if (r3 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x025b, code lost:
    
        r11 = r3.getDoNotDisturb();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x025f, code lost:
    
        if (r11 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0267, code lost:
    
        if (r11.intValue() != 1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0269, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x026b, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x026c, code lost:
    
        com.yhchat.canarys.p007ui.user.UserDetailActivityKt.UserDetailScreen$lambda$44(r5, r11);
        com.yhchat.canarys.p007ui.user.UserDetailActivityKt.UserDetailScreen$lambda$17(r31.$isCheckingAddressBook$delegate, true);
        r31.L$0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r20);
        r31.L$1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10);
        r31.L$2 = r9;
        r31.L$3 = r8;
        r31.L$4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7);
        r31.L$5 = r6;
        r31.L$6 = r4;
        r31.L$7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3);
        r31.label = 3;
        r12 = r7.m8561getAddressBookListIoAF18A(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x029f, code lost:
    
        if (r12 != r2) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02a1, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x02a2, code lost:
    
        r11 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0407, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0496 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x04a1 A[Catch: Exception -> 0x0407, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x0407, blocks: (B:103:0x04a1, B:88:0x03e6, B:70:0x02b6, B:71:0x02d5, B:73:0x02db, B:74:0x02ff, B:75:0x0320, B:77:0x0326, B:78:0x033c, B:56:0x025b, B:59:0x0262), top: B:165:0x025b }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04ea A[Catch: Exception -> 0x05f9, TRY_LEAVE, TryCatch #4 {Exception -> 0x05f9, blocks: (B:101:0x0497, B:107:0x04e5, B:109:0x04ea, B:106:0x04c9, B:86:0x03dc, B:98:0x0433, B:93:0x040e, B:97:0x041e, B:68:0x02a4, B:82:0x035f, B:81:0x0357, B:54:0x0254, B:64:0x026c), top: B:163:0x0254 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0514 A[Catch: Exception -> 0x05b0, TryCatch #0 {Exception -> 0x05b0, blocks: (B:118:0x0574, B:120:0x057a, B:124:0x0594, B:112:0x0510, B:114:0x0514, B:129:0x05b2, B:130:0x05c0, B:132:0x05c6, B:137:0x05e6, B:139:0x05ea, B:141:0x05f0, B:125:0x05a1), top: B:156:0x0574 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x057a A[Catch: Exception -> 0x05b0, TryCatch #0 {Exception -> 0x05b0, blocks: (B:118:0x0574, B:120:0x057a, B:124:0x0594, B:112:0x0510, B:114:0x0514, B:129:0x05b2, B:130:0x05c0, B:132:0x05c6, B:137:0x05e6, B:139:0x05ea, B:141:0x05f0, B:125:0x05a1), top: B:156:0x0574 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x05a1 A[Catch: Exception -> 0x05b0, TryCatch #0 {Exception -> 0x05b0, blocks: (B:118:0x0574, B:120:0x057a, B:124:0x0594, B:112:0x0510, B:114:0x0514, B:129:0x05b2, B:130:0x05c0, B:132:0x05c6, B:137:0x05e6, B:139:0x05ea, B:141:0x05f0, B:125:0x05a1), top: B:156:0x0574 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x05b2 A[Catch: Exception -> 0x05b0, TryCatch #0 {Exception -> 0x05b0, blocks: (B:118:0x0574, B:120:0x057a, B:124:0x0594, B:112:0x0510, B:114:0x0514, B:129:0x05b2, B:130:0x05c0, B:132:0x05c6, B:137:0x05e6, B:139:0x05ea, B:141:0x05f0, B:125:0x05a1), top: B:156:0x0574 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x021e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x024f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0204 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0245 A[LOOP:3: B:38:0x0218->B:50:0x0245, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02b6 A[Catch: Exception -> 0x0407, TRY_ENTER, TryCatch #5 {Exception -> 0x0407, blocks: (B:103:0x04a1, B:88:0x03e6, B:70:0x02b6, B:71:0x02d5, B:73:0x02db, B:74:0x02ff, B:75:0x0320, B:77:0x0326, B:78:0x033c, B:56:0x025b, B:59:0x0262), top: B:165:0x025b }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03e6 A[Catch: Exception -> 0x0407, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x0407, blocks: (B:103:0x04a1, B:88:0x03e6, B:70:0x02b6, B:71:0x02d5, B:73:0x02db, B:74:0x02ff, B:75:0x0320, B:77:0x0326, B:78:0x033c, B:56:0x025b, B:59:0x0262), top: B:165:0x025b }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x040d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x0572 -> B:156:0x0574). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instructions count: 1592
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.user.UserDetailActivityKt$UserDetailScreen$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
