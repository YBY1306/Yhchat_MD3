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

/* compiled from: CommunityTabScreen.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.community.CommunityTabScreenKt$MoreTabContent$imagePickerLauncher$1$1$1", m185f = "CommunityTabScreen.kt", m186i = {1}, m187l = {292, 294}, m188m = "invokeSuspend", m189n = {"uploadToken"}, m191s = {"L$0"}, m192v = 1)
/* loaded from: classes14.dex */
final class CommunityTabScreenKt$MoreTabContent$imagePickerLauncher$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<String> $editError$delegate;
    final /* synthetic */ MutableState<String> $editedAvatarUrl$delegate;
    final /* synthetic */ MutableState<Boolean> $isUploadingAvatar$delegate;
    final /* synthetic */ Uri $selected;
    final /* synthetic */ String $token;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommunityTabScreenKt$MoreTabContent$imagePickerLauncher$1$1$1(Context context, String str, Uri uri, MutableState<Boolean> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, Continuation<? super CommunityTabScreenKt$MoreTabContent$imagePickerLauncher$1$1$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$token = str;
        this.$selected = uri;
        this.$isUploadingAvatar$delegate = mutableState;
        this.$editError$delegate = mutableState2;
        this.$editedAvatarUrl$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CommunityTabScreenKt$MoreTabContent$imagePickerLauncher$1$1$1(this.$context, this.$token, this.$selected, this.$isUploadingAvatar$delegate, this.$editError$delegate, this.$editedAvatarUrl$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CommunityTabScreenKt$MoreTabContent$imagePickerLauncher$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f A[Catch: all -> 0x0029, Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:7:0x0019, B:27:0x007a, B:29:0x0084, B:30:0x00a3, B:33:0x00ab, B:8:0x0024, B:18:0x0050, B:23:0x005f, B:35:0x00b0, B:15:0x003e), top: B:46:0x000a, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084 A[Catch: all -> 0x0029, Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:7:0x0019, B:27:0x007a, B:29:0x0084, B:30:0x00a3, B:33:0x00ab, B:8:0x0024, B:18:0x0050, B:23:0x005f, B:35:0x00b0, B:15:0x003e), top: B:46:0x000a, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3 A[Catch: all -> 0x0029, Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:7:0x0019, B:27:0x007a, B:29:0x0084, B:30:0x00a3, B:33:0x00ab, B:8:0x0024, B:18:0x0050, B:23:0x005f, B:35:0x00b0, B:15:0x003e), top: B:46:0x000a, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0 A[Catch: all -> 0x0029, Exception -> 0x002c, TRY_LEAVE, TryCatch #0 {Exception -> 0x002c, blocks: (B:7:0x0019, B:27:0x007a, B:29:0x0084, B:30:0x00a3, B:33:0x00ab, B:8:0x0024, B:18:0x0050, B:23:0x005f, B:35:0x00b0, B:15:0x003e), top: B:46:0x000a, outer: #1 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.label
            java.lang.String r2 = "\u56fe\u7247\u4e0a\u4f20\u5931\u8d25"
            r3 = 1
            r4 = 0
            switch(r1) {
                case 0: goto L2f;
                case 1: goto L24;
                case 2: goto L15;
                default: goto Ld;
            }
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L15:
            java.lang.Object r0 = r9.L$0
            java.lang.String r0 = (java.lang.String) r0
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
            r1 = r10
            kotlin.Result r1 = (kotlin.Result) r1     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
            goto L7a
        L24:
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
            r1 = r10
            goto L50
        L29:
            r0 = move-exception
            goto Lce
        L2c:
            r0 = move-exception
            goto Lb8
        L2f:
            kotlin.ResultKt.throwOnFailure(r10)
            androidx.compose.runtime.MutableState<java.lang.Boolean> r1 = r9.$isUploadingAvatar$delegate
            com.yhchat.canarys.p007ui.community.CommunityTabScreenKt.access$MoreTabContent$lambda$36(r1, r3)
            androidx.compose.runtime.MutableState<java.lang.String> r1 = r9.$editError$delegate
            r5 = 0
            com.yhchat.canarys.p007ui.community.CommunityTabScreenKt.access$MoreTabContent$lambda$39(r1, r5)
            com.yhchat.canarys.utils.ImageUploadUtil r1 = com.yhchat.canarys.utils.ImageUploadUtil.INSTANCE     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
            android.content.Context r5 = r9.$context     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
            java.lang.String r6 = r9.$token     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
            r7 = r9
            kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
            r9.label = r3     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
            java.lang.Object r1 = r1.getQiniuUploadToken(r5, r6, r7)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
            if (r1 != r0) goto L50
            return r0
        L50:
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
            r5 = r1
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
            int r5 = r5.length()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
            if (r5 <= 0) goto L5c
            goto L5d
        L5c:
            r3 = r4
        L5d:
            if (r3 == 0) goto Lb0
            com.yhchat.canarys.utils.ImageUploadUtil r3 = com.yhchat.canarys.utils.ImageUploadUtil.INSTANCE     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
            android.content.Context r5 = r9.$context     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
            android.net.Uri r6 = r9.$selected     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
            r7 = r9
            kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
            r9.L$0 = r8     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
            r8 = 2
            r9.label = r8     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
            java.lang.Object r3 = r3.m11896uploadImageBWLJW6A(r5, r6, r1, r7)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
            if (r3 != r0) goto L78
            return r0
        L78:
            r0 = r1
            r1 = r3
        L7a:
            androidx.compose.runtime.MutableState<java.lang.String> r3 = r9.$editedAvatarUrl$delegate     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
            androidx.compose.runtime.MutableState<java.lang.String> r5 = r9.$editError$delegate     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
            java.lang.Throwable r6 = kotlin.Result.m11922exceptionOrNullimpl(r1)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
            if (r6 != 0) goto La3
            com.yhchat.canarys.data.api.QiniuUploadResponse r1 = (com.yhchat.canarys.data.api.QiniuUploadResponse) r1     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
            r5 = 0
            java.lang.String r6 = r1.getKey()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
            r7.<init>()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
            java.lang.String r8 = "https://chat-img.jwznb.com/"
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
            java.lang.StringBuilder r6 = r7.append(r6)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
            com.yhchat.canarys.p007ui.community.CommunityTabScreenKt.access$MoreTabContent$lambda$33(r3, r6)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
            goto Laf
        La3:
            r1 = 0
            java.lang.String r3 = r6.getMessage()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
            if (r3 != 0) goto Lab
            r3 = r2
        Lab:
            com.yhchat.canarys.p007ui.community.CommunityTabScreenKt.access$MoreTabContent$lambda$39(r5, r3)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
        Laf:
            goto Lc5
        Lb0:
            androidx.compose.runtime.MutableState<java.lang.String> r0 = r9.$editError$delegate     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
            java.lang.String r3 = "\u83b7\u53d6\u4e0a\u4f20token\u5931\u8d25"
            com.yhchat.canarys.p007ui.community.CommunityTabScreenKt.access$MoreTabContent$lambda$39(r0, r3)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2c
            goto Lc5
        Lb8:
            androidx.compose.runtime.MutableState<java.lang.String> r1 = r9.$editError$delegate     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = r0.getMessage()     // Catch: java.lang.Throwable -> L29
            if (r3 != 0) goto Lc1
            goto Lc2
        Lc1:
            r2 = r3
        Lc2:
            com.yhchat.canarys.p007ui.community.CommunityTabScreenKt.access$MoreTabContent$lambda$39(r1, r2)     // Catch: java.lang.Throwable -> L29
        Lc5:
            androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r9.$isUploadingAvatar$delegate
            com.yhchat.canarys.p007ui.community.CommunityTabScreenKt.access$MoreTabContent$lambda$36(r0, r4)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        Lce:
            androidx.compose.runtime.MutableState<java.lang.Boolean> r1 = r9.$isUploadingAvatar$delegate
            com.yhchat.canarys.p007ui.community.CommunityTabScreenKt.access$MoreTabContent$lambda$36(r1, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.CommunityTabScreenKt$MoreTabContent$imagePickerLauncher$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
