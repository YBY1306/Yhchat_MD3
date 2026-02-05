package com.yhchat.canarys.p007ui.community;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* compiled from: CreateBoardDialog.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.community.CreateBoardDialogKt$CreateBoardDialog$imagePickerLauncher$1$1$1$1", m185f = "CreateBoardDialog.kt", m186i = {1}, m187l = {58, LockFreeTaskQueueCore.CLOSED_SHIFT}, m188m = "invokeSuspend", m189n = {"uploadToken"}, m191s = {"L$0"}, m192v = 1)
/* renamed from: com.yhchat.canarys.ui.community.CreateBoardDialogKt$CreateBoardDialog$imagePickerLauncher$1$1$1$1 */
/* loaded from: classes14.dex */
final class C3490x92f80ae2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<String> $avatarUrl$delegate;
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<String> $errorMessage$delegate;
    final /* synthetic */ MutableState<Boolean> $isLoading$delegate;
    final /* synthetic */ Uri $selectedUri;
    final /* synthetic */ String $token;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3490x92f80ae2(Context context, String str, Uri uri, MutableState<Boolean> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, Continuation<? super C3490x92f80ae2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$token = str;
        this.$selectedUri = uri;
        this.$isLoading$delegate = mutableState;
        this.$avatarUrl$delegate = mutableState2;
        this.$errorMessage$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C3490x92f80ae2(this.$context, this.$token, this.$selectedUri, this.$isLoading$delegate, this.$avatarUrl$delegate, this.$errorMessage$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C3490x92f80ae2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059 A[Catch: all -> 0x0029, Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:7:0x0019, B:27:0x0074, B:29:0x007c, B:33:0x0084, B:35:0x0088, B:36:0x00ac, B:37:0x00b4, B:39:0x00bc, B:40:0x00c0, B:8:0x0024, B:18:0x004a, B:23:0x0059, B:41:0x00d5, B:15:0x0038), top: B:48:0x000a, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c A[Catch: all -> 0x0029, Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:7:0x0019, B:27:0x0074, B:29:0x007c, B:33:0x0084, B:35:0x0088, B:36:0x00ac, B:37:0x00b4, B:39:0x00bc, B:40:0x00c0, B:8:0x0024, B:18:0x004a, B:23:0x0059, B:41:0x00d5, B:15:0x0038), top: B:48:0x000a, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4 A[Catch: all -> 0x0029, Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:7:0x0019, B:27:0x0074, B:29:0x007c, B:33:0x0084, B:35:0x0088, B:36:0x00ac, B:37:0x00b4, B:39:0x00bc, B:40:0x00c0, B:8:0x0024, B:18:0x004a, B:23:0x0059, B:41:0x00d5, B:15:0x0038), top: B:48:0x000a, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d5 A[Catch: all -> 0x0029, Exception -> 0x002c, TRY_LEAVE, TryCatch #0 {Exception -> 0x002c, blocks: (B:7:0x0019, B:27:0x0074, B:29:0x007c, B:33:0x0084, B:35:0x0088, B:36:0x00ac, B:37:0x00b4, B:39:0x00bc, B:40:0x00c0, B:8:0x0024, B:18:0x004a, B:23:0x0059, B:41:0x00d5, B:15:0x0038), top: B:48:0x000a, outer: #1 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.C3490x92f80ae2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
