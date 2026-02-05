package com.yhchat.canarys.data.repository;

import androidx.autofill.HintConstants;
import com.yhchat.canarys.data.api.ApiService;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* compiled from: GroupRepository.kt */
@Singleton
@Metadata(m168d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0011H\u0086@\u00a2\u0006\u0004\b\u0015\u0010\u0016J&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0011H\u0086@\u00a2\u0006\u0004\b\u001a\u0010\u001bJ$\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u00102\u0006\u0010\u001f\u001a\u00020\u0007H\u0086@\u00a2\u0006\u0004\b \u0010!J&\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010#\u001a\u00020$H\u0086@\u00a2\u0006\u0004\b%\u0010&J\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00130\u00102\u0006\u0010\u0018\u001a\u00020\u0007H\u0086@\u00a2\u0006\u0004\b(\u0010!JB\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u001d0\u00102\u0006\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010+\u001a\u00020$2\b\b\u0002\u0010,\u001a\u00020$2\b\b\u0002\u0010-\u001a\u00020\u0007H\u0086@\u00a2\u0006\u0004\b.\u0010/J@\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u001d0\u00102\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u00072\b\b\u0002\u0010+\u001a\u00020$2\b\b\u0002\u0010,\u001a\u00020$H\u0086@\u00a2\u0006\u0004\b1\u00102J^\u00103\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00112\u0006\u00108\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u00072\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u0011H\u0086@\u00a2\u0006\u0004\b=\u0010>J&\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010@\u001a\u00020\u0007H\u0086@\u00a2\u0006\u0004\bA\u0010BJ&\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010D\u001a\u00020\u0007H\u0086@\u00a2\u0006\u0004\bE\u0010BJ.\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010D\u001a\u00020\u00072\u0006\u0010G\u001a\u00020$H\u0086@\u00a2\u0006\u0004\bH\u0010IJ.\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010D\u001a\u00020\u00072\u0006\u0010K\u001a\u00020$H\u0086@\u00a2\u0006\u0004\bL\u0010IJ$\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u00102\u0006\u0010\u0018\u001a\u00020\u0007H\u0086@\u00a2\u0006\u0004\bN\u0010!J$\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020P0\u001d0\u00102\u0006\u0010\u0018\u001a\u00020\u0007H\u0086@\u00a2\u0006\u0004\bQ\u0010!J$\u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u00102\u0006\u0010\u0018\u001a\u00020\u0007H\u0086@\u00a2\u0006\u0004\bS\u0010!J$\u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020U0\u001d0\u00102\u0006\u0010\u0018\u001a\u00020\u0007H\u0086@\u00a2\u0006\u0004\bV\u0010!J8\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010X\u001a\u00020;2\u0006\u0010Y\u001a\u00020\u00072\u0006\u0010Z\u001a\u00020$2\b\b\u0002\u0010[\u001a\u00020\u0007H\u0086@\u00a2\u0006\u0004\b\\\u0010]J.\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010Y\u001a\u00020\u00072\u0006\u0010Z\u001a\u00020$2\u0006\u0010\u0018\u001a\u00020\u0007H\u0086@\u00a2\u0006\u0004\b_\u0010`J&\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010b\u001a\u00020\u0007H\u0086@\u00a2\u0006\u0004\bc\u0010BJ&\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010e\u001a\u00020\u0007H\u0086@\u00a2\u0006\u0004\bf\u0010BJ>\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00070\u00102\u0006\u00104\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u00072\u0006\u0010h\u001a\u00020\u00072\u0006\u0010:\u001a\u00020$H\u0086@\u00a2\u0006\u0004\bi\u0010jR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006k"}, m169d2 = {"Lcom/yhchat/canarys/data/repository/GroupRepository;", "", "apiService", "Lcom/yhchat/canarys/data/api/ApiService;", "<init>", "(Lcom/yhchat/canarys/data/api/ApiService;)V", "tag", "", "baseUrl", "client", "Lokhttp3/OkHttpClient;", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "setTokenRepository", "", "setHideGroupMembers", "Lkotlin/Result;", "", "groupInfo", "Lcom/yhchat/canarys/data/model/GroupDetail;", "hide", "setHideGroupMembers-0E7RQCE", "(Lcom/yhchat/canarys/data/model/GroupDetail;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setDenyMembersUploadToGroupDisk", "groupId", "deny", "setDenyMembersUploadToGroupDisk-0E7RQCE", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBotInstructionList", "", "Lcom/yhchat/canarys/data/model/Instruction;", "botId", "getBotInstructionList-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editAutoDeleteMessage", "autoDeleteMessage", "", "editAutoDeleteMessage-0E7RQCE", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGroupInfo", "getGroupInfo-gIAlu-s", "getGroupMembers", "Lcom/yhchat/canarys/data/model/GroupMemberInfo;", "size", "page", "keywords", "getGroupMembers-yxL6bBk", "(Ljava/lang/String;IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchGroupMembers", "searchGroupMembers-yxL6bBk", "(Ljava/lang/String;Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editGroupInfo", HintConstants.AUTOFILL_HINT_NAME, "introduction", "avatarUrl", "directJoin", "historyMsg", "categoryName", "categoryId", "", "isPrivate", "editGroupInfo-LiYkppA", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setMessageTypeLimit", "messageTypes", "setMessageTypeLimit-0E7RQCE", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeMember", "userId", "removeMember-0E7RQCE", "gagMember", "gagTime", "gagMember-BWLJW6A", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setMemberRole", "userLevel", "setMemberRole-BWLJW6A", "getGroupBotList", "getGroupBotList-gIAlu-s", "getGroupBots", "Lcom/yhchat/canarys/proto/group/Bot_data;", "getGroupBots-gIAlu-s", "getInstructionList", "getInstructionList-gIAlu-s", "getGroupMenuButtons", "Lcom/yhchat/canarys/data/model/MenuButton;", "getGroupMenuButtons-gIAlu-s", "clickMenuButton", "buttonId", ChatSearchActivity.EXTRA_CHAT_ID, ChatSearchActivity.EXTRA_CHAT_TYPE, "value", "clickMenuButton-yxL6bBk", "(JLjava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "inviteToGroup", "inviteToGroup-BWLJW6A", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editMyGroupNickname", "nickname", "editMyGroupNickname-0E7RQCE", "editGroupKeyword", "keyword", "editGroupKeyword-0E7RQCE", "createGroup", "category", "createGroup-hUnOzRk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class GroupRepository {
    public static final int $stable = 8;
    private final ApiService apiService;
    private final String baseUrl;
    private final OkHttpClient client;
    private final String tag;
    private TokenRepository tokenRepository;

    @Inject
    public GroupRepository(ApiService apiService) {
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        this.apiService = apiService;
        this.tag = "GroupRepository";
        this.baseUrl = "https://chat-go.jwzhd.com";
        this.client = new OkHttpClient.Builder().connectTimeout(30L, TimeUnit.SECONDS).readTimeout(30L, TimeUnit.SECONDS).writeTimeout(30L, TimeUnit.SECONDS).build();
    }

    public final void setTokenRepository(TokenRepository tokenRepository) {
        Intrinsics.checkNotNullParameter(tokenRepository, "tokenRepository");
        this.tokenRepository = tokenRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0014  */
    /* renamed from: setHideGroupMembers-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8585setHideGroupMembers0E7RQCE(com.yhchat.canarys.data.model.GroupDetail r7, boolean r8, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.yhchat.canarys.data.repository.GroupRepository$setHideGroupMembers$1
            if (r0 == 0) goto L14
            r0 = r9
            com.yhchat.canarys.data.repository.GroupRepository$setHideGroupMembers$1 r0 = (com.yhchat.canarys.data.repository.GroupRepository$setHideGroupMembers$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.GroupRepository$setHideGroupMembers$1 r0 = new com.yhchat.canarys.data.repository.GroupRepository$setHideGroupMembers$1
            r0.<init>(r6, r9)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L38;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            boolean r8 = r0.Z$0
            java.lang.Object r2 = r0.L$0
            r7 = r2
            com.yhchat.canarys.data.model.GroupDetail r7 = (com.yhchat.canarys.data.model.GroupDetail) r7
            kotlin.ResultKt.throwOnFailure(r1)
            r3 = r1
            goto L5b
        L38:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlinx.coroutines.CoroutineDispatcher r3 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
            com.yhchat.canarys.data.repository.GroupRepository$setHideGroupMembers$2 r4 = new com.yhchat.canarys.data.repository.GroupRepository$setHideGroupMembers$2
            r5 = 0
            r4.<init>(r6, r7, r8, r5)
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r0.L$0 = r5
            r0.Z$0 = r8
            r5 = 1
            r0.label = r5
            java.lang.Object r3 = kotlinx.coroutines.BuildersKt.withContext(r3, r4, r0)
            if (r3 != r2) goto L5b
            return r2
        L5b:
            kotlin.Result r3 = (kotlin.Result) r3
            java.lang.Object r2 = r3.getValue()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.GroupRepository.m8585setHideGroupMembers0E7RQCE(com.yhchat.canarys.data.model.GroupDetail, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0014  */
    /* renamed from: setDenyMembersUploadToGroupDisk-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8584setDenyMembersUploadToGroupDisk0E7RQCE(java.lang.String r7, boolean r8, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.yhchat.canarys.data.repository.GroupRepository$setDenyMembersUploadToGroupDisk$1
            if (r0 == 0) goto L14
            r0 = r9
            com.yhchat.canarys.data.repository.GroupRepository$setDenyMembersUploadToGroupDisk$1 r0 = (com.yhchat.canarys.data.repository.GroupRepository$setDenyMembersUploadToGroupDisk$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.GroupRepository$setDenyMembersUploadToGroupDisk$1 r0 = new com.yhchat.canarys.data.repository.GroupRepository$setDenyMembersUploadToGroupDisk$1
            r0.<init>(r6, r9)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L38;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            boolean r8 = r0.Z$0
            java.lang.Object r2 = r0.L$0
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            kotlin.ResultKt.throwOnFailure(r1)
            r3 = r1
            goto L5b
        L38:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlinx.coroutines.CoroutineDispatcher r3 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
            com.yhchat.canarys.data.repository.GroupRepository$setDenyMembersUploadToGroupDisk$2 r4 = new com.yhchat.canarys.data.repository.GroupRepository$setDenyMembersUploadToGroupDisk$2
            r5 = 0
            r4.<init>(r6, r7, r8, r5)
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r0.L$0 = r5
            r0.Z$0 = r8
            r5 = 1
            r0.label = r5
            java.lang.Object r3 = kotlinx.coroutines.BuildersKt.withContext(r3, r4, r0)
            if (r3 != r2) goto L5b
            return r2
        L5b:
            kotlin.Result r3 = (kotlin.Result) r3
            java.lang.Object r2 = r3.getValue()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.GroupRepository.m8584setDenyMembersUploadToGroupDisk0E7RQCE(java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0089 A[Catch: Exception -> 0x005a, TRY_LEAVE, TryCatch #2 {Exception -> 0x005a, blocks: (B:128:0x00fd, B:101:0x0055, B:113:0x007a, B:118:0x0089), top: B:155:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00f5 A[Catch: Exception -> 0x0234, TRY_LEAVE, TryCatch #4 {Exception -> 0x0234, blocks: (B:124:0x00ed, B:126:0x00f5, B:130:0x0103, B:132:0x0115, B:133:0x0134, B:135:0x013a, B:120:0x009d), top: B:158:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0205 A[Catch: Exception -> 0x0232, TRY_LEAVE, TryCatch #5 {Exception -> 0x0232, blocks: (B:137:0x016a, B:138:0x019d, B:139:0x01cf, B:140:0x01ed, B:141:0x0205), top: B:160:0x00f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x009d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0018  */
    /* renamed from: getBotInstructionList-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8574getBotInstructionListgIAlus(java.lang.String r36, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<com.yhchat.canarys.data.model.Instruction>>> r37) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.GroupRepository.m8574getBotInstructionListgIAlus(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0014  */
    /* renamed from: editAutoDeleteMessage-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8569editAutoDeleteMessage0E7RQCE(java.lang.String r7, int r8, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.yhchat.canarys.data.repository.GroupRepository$editAutoDeleteMessage$1
            if (r0 == 0) goto L14
            r0 = r9
            com.yhchat.canarys.data.repository.GroupRepository$editAutoDeleteMessage$1 r0 = (com.yhchat.canarys.data.repository.GroupRepository$editAutoDeleteMessage$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.GroupRepository$editAutoDeleteMessage$1 r0 = new com.yhchat.canarys.data.repository.GroupRepository$editAutoDeleteMessage$1
            r0.<init>(r6, r9)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L38;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            int r8 = r0.I$0
            java.lang.Object r2 = r0.L$0
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            kotlin.ResultKt.throwOnFailure(r1)
            r3 = r1
            goto L5b
        L38:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlinx.coroutines.CoroutineDispatcher r3 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
            com.yhchat.canarys.data.repository.GroupRepository$editAutoDeleteMessage$2 r4 = new com.yhchat.canarys.data.repository.GroupRepository$editAutoDeleteMessage$2
            r5 = 0
            r4.<init>(r6, r7, r8, r5)
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r0.L$0 = r5
            r0.I$0 = r8
            r5 = 1
            r0.label = r5
            java.lang.Object r3 = kotlinx.coroutines.BuildersKt.withContext(r3, r4, r0)
            if (r3 != r2) goto L5b
            return r2
        L5b:
            kotlin.Result r3 = (kotlin.Result) r3
            java.lang.Object r2 = r3.getValue()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.GroupRepository.m8569editAutoDeleteMessage0E7RQCE(java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0014  */
    /* renamed from: getGroupInfo-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8577getGroupInfogIAlus(java.lang.String r7, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.GroupDetail>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.yhchat.canarys.data.repository.GroupRepository$getGroupInfo$1
            if (r0 == 0) goto L14
            r0 = r8
            com.yhchat.canarys.data.repository.GroupRepository$getGroupInfo$1 r0 = (com.yhchat.canarys.data.repository.GroupRepository$getGroupInfo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.GroupRepository$getGroupInfo$1 r0 = new com.yhchat.canarys.data.repository.GroupRepository$getGroupInfo$1
            r0.<init>(r6, r8)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L36;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            java.lang.Object r2 = r0.L$0
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            kotlin.ResultKt.throwOnFailure(r1)
            r3 = r1
            goto L57
        L36:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlinx.coroutines.CoroutineDispatcher r3 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
            com.yhchat.canarys.data.repository.GroupRepository$getGroupInfo$2 r4 = new com.yhchat.canarys.data.repository.GroupRepository$getGroupInfo$2
            r5 = 0
            r4.<init>(r6, r7, r5)
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r0.L$0 = r5
            r5 = 1
            r0.label = r5
            java.lang.Object r3 = kotlinx.coroutines.BuildersKt.withContext(r3, r4, r0)
            if (r3 != r2) goto L57
            return r2
        L57:
            kotlin.Result r3 = (kotlin.Result) r3
            java.lang.Object r2 = r3.getValue()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.GroupRepository.m8577getGroupInfogIAlus(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: getGroupMembers-yxL6bBk$default */
    public static /* synthetic */ Object m8565getGroupMembersyxL6bBk$default(GroupRepository groupRepository, String str, int i, int i2, String str2, Continuation continuation, int i3, Object obj) {
        return groupRepository.m8578getGroupMembersyxL6bBk(str, (i3 & 2) != 0 ? 50 : i, (i3 & 4) != 0 ? 1 : i2, (i3 & 8) != 0 ? "" : str2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0016  */
    /* renamed from: getGroupMembers-yxL6bBk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8578getGroupMembersyxL6bBk(java.lang.String r13, int r14, int r15, java.lang.String r16, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<com.yhchat.canarys.data.model.GroupMemberInfo>>> r17) {
        /*
            r12 = this;
            r0 = r17
            boolean r1 = r0 instanceof com.yhchat.canarys.data.repository.GroupRepository$getGroupMembers$1
            if (r1 == 0) goto L16
            r1 = r0
            com.yhchat.canarys.data.repository.GroupRepository$getGroupMembers$1 r1 = (com.yhchat.canarys.data.repository.GroupRepository$getGroupMembers$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L16
            int r2 = r1.label
            int r2 = r2 - r3
            r1.label = r2
            goto L1b
        L16:
            com.yhchat.canarys.data.repository.GroupRepository$getGroupMembers$1 r1 = new com.yhchat.canarys.data.repository.GroupRepository$getGroupMembers$1
            r1.<init>(r12, r0)
        L1b:
            java.lang.Object r2 = r1.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r1.label
            switch(r4) {
                case 0: goto L40;
                case 1: goto L2e;
                default: goto L26;
            }
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2e:
            int r15 = r1.I$1
            int r14 = r1.I$0
            java.lang.Object r3 = r1.L$1
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r1.L$0
            r13 = r4
            java.lang.String r13 = (java.lang.String) r13
            kotlin.ResultKt.throwOnFailure(r2)
            r4 = r2
            goto L73
        L40:
            kotlin.ResultKt.throwOnFailure(r2)
            kotlinx.coroutines.CoroutineDispatcher r4 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r4 = (kotlin.coroutines.CoroutineContext) r4
            com.yhchat.canarys.data.repository.GroupRepository$getGroupMembers$2 r5 = new com.yhchat.canarys.data.repository.GroupRepository$getGroupMembers$2
            r11 = 0
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r15
            r10 = r16
            r5.<init>(r6, r7, r8, r9, r10, r11)
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r1.L$0 = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r16)
            r1.L$1 = r6
            r1.I$0 = r14
            r1.I$1 = r15
            r6 = 1
            r1.label = r6
            java.lang.Object r4 = kotlinx.coroutines.BuildersKt.withContext(r4, r5, r1)
            if (r4 != r3) goto L71
            return r3
        L71:
            r3 = r16
        L73:
            kotlin.Result r4 = (kotlin.Result) r4
            java.lang.Object r4 = r4.getValue()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.GroupRepository.m8578getGroupMembersyxL6bBk(java.lang.String, int, int, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: searchGroupMembers-yxL6bBk$default */
    public static /* synthetic */ Object m8566searchGroupMembersyxL6bBk$default(GroupRepository groupRepository, String str, String str2, int i, int i2, Continuation continuation, int i3, Object obj) {
        int i4;
        int i5;
        if ((i3 & 4) == 0) {
            i4 = i;
        } else {
            i4 = 50;
        }
        if ((i3 & 8) == 0) {
            i5 = i2;
        } else {
            i5 = 1;
        }
        return groupRepository.m8583searchGroupMembersyxL6bBk(str, str2, i4, i5, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0014  */
    /* renamed from: searchGroupMembers-yxL6bBk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8583searchGroupMembersyxL6bBk(java.lang.String r9, java.lang.String r10, int r11, int r12, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<com.yhchat.canarys.data.model.GroupMemberInfo>>> r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof com.yhchat.canarys.data.repository.GroupRepository$searchGroupMembers$1
            if (r0 == 0) goto L14
            r0 = r13
            com.yhchat.canarys.data.repository.GroupRepository$searchGroupMembers$1 r0 = (com.yhchat.canarys.data.repository.GroupRepository$searchGroupMembers$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.GroupRepository$searchGroupMembers$1 r0 = new com.yhchat.canarys.data.repository.GroupRepository$searchGroupMembers$1
            r0.<init>(r8, r13)
        L19:
            r6 = r0
            java.lang.Object r0 = r6.result
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            switch(r1) {
                case 0: goto L48;
                case 1: goto L2f;
                default: goto L25;
            }
        L25:
            r2 = r9
            r5 = r10
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2f:
            int r12 = r6.I$1
            int r11 = r6.I$0
            java.lang.Object r1 = r6.L$1
            r10 = r1
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r1 = r6.L$0
            r9 = r1
            java.lang.String r9 = (java.lang.String) r9
            kotlin.ResultKt.throwOnFailure(r0)
            r1 = r0
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.getValue()
            goto L6f
        L48:
            kotlin.ResultKt.throwOnFailure(r0)
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9)
            r6.L$0 = r1
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)
            r6.L$1 = r1
            r6.I$0 = r11
            r6.I$1 = r12
            r1 = 1
            r6.label = r1
            r1 = r8
            r2 = r9
            r5 = r10
            r3 = r11
            r4 = r12
            java.lang.Object r9 = r1.m8578getGroupMembersyxL6bBk(r2, r3, r4, r5, r6)
            if (r9 != r7) goto L6a
            return r7
        L6a:
            r1 = r9
            r9 = r2
            r11 = r3
            r12 = r4
            r10 = r5
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.GroupRepository.m8583searchGroupMembersyxL6bBk(java.lang.String, java.lang.String, int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0018  */
    /* renamed from: editGroupInfo-LiYkppA */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8570editGroupInfoLiYkppA(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, boolean r22, boolean r23, java.lang.String r24, long r25, boolean r27, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r28) {
        /*
            r17 = this;
            r0 = r28
            boolean r1 = r0 instanceof com.yhchat.canarys.data.repository.GroupRepository$editGroupInfo$1
            if (r1 == 0) goto L18
            r1 = r0
            com.yhchat.canarys.data.repository.GroupRepository$editGroupInfo$1 r1 = (com.yhchat.canarys.data.repository.GroupRepository$editGroupInfo$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L18
            int r2 = r1.label
            int r2 = r2 - r3
            r1.label = r2
            r3 = r17
            goto L1f
        L18:
            com.yhchat.canarys.data.repository.GroupRepository$editGroupInfo$1 r1 = new com.yhchat.canarys.data.repository.GroupRepository$editGroupInfo$1
            r3 = r17
            r1.<init>(r3, r0)
        L1f:
            java.lang.Object r15 = r1.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r1.label
            switch(r4) {
                case 0: goto L57;
                case 1: goto L32;
                default: goto L2a;
            }
        L2a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L32:
            boolean r2 = r1.Z$2
            long r4 = r1.J$0
            boolean r6 = r1.Z$1
            boolean r7 = r1.Z$0
            java.lang.Object r8 = r1.L$4
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r1.L$3
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r1.L$2
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r1.L$1
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r1.L$0
            java.lang.String r12 = (java.lang.String) r12
            kotlin.ResultKt.throwOnFailure(r15)
            r13 = r2
            r2 = r15
            r16 = r2
            goto Lbc
        L57:
            kotlin.ResultKt.throwOnFailure(r15)
            kotlinx.coroutines.CoroutineDispatcher r4 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r4 = (kotlin.coroutines.CoroutineContext) r4
            r5 = r2
            com.yhchat.canarys.data.repository.GroupRepository$editGroupInfo$2 r2 = new com.yhchat.canarys.data.repository.GroupRepository$editGroupInfo$2
            r14 = 0
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r13 = r27
            r0 = r5
            r16 = r15
            r5 = r19
            r15 = r4
            r4 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14)
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r18)
            r1.L$0 = r3
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r19)
            r1.L$1 = r3
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r20)
            r1.L$2 = r3
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r21)
            r1.L$3 = r3
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r24)
            r1.L$4 = r3
            r1.Z$0 = r8
            r1.Z$1 = r9
            r1.J$0 = r11
            r1.Z$2 = r13
            r3 = 1
            r1.label = r3
            java.lang.Object r2 = kotlinx.coroutines.BuildersKt.withContext(r15, r2, r1)
            if (r2 != r0) goto Laf
            return r0
        Laf:
            r10 = r20
            r7 = r8
            r6 = r9
            r4 = r11
            r12 = r18
            r11 = r19
            r9 = r21
            r8 = r24
        Lbc:
            kotlin.Result r2 = (kotlin.Result) r2
            java.lang.Object r0 = r2.getValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.GroupRepository.m8570editGroupInfoLiYkppA(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, long, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0014  */
    /* renamed from: setMessageTypeLimit-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8587setMessageTypeLimit0E7RQCE(java.lang.String r7, java.lang.String r8, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.yhchat.canarys.data.repository.GroupRepository$setMessageTypeLimit$1
            if (r0 == 0) goto L14
            r0 = r9
            com.yhchat.canarys.data.repository.GroupRepository$setMessageTypeLimit$1 r0 = (com.yhchat.canarys.data.repository.GroupRepository$setMessageTypeLimit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.GroupRepository$setMessageTypeLimit$1 r0 = new com.yhchat.canarys.data.repository.GroupRepository$setMessageTypeLimit$1
            r0.<init>(r6, r9)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L3b;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            java.lang.Object r2 = r0.L$1
            r8 = r2
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r2 = r0.L$0
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            kotlin.ResultKt.throwOnFailure(r1)
            r3 = r1
            goto L62
        L3b:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlinx.coroutines.CoroutineDispatcher r3 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
            com.yhchat.canarys.data.repository.GroupRepository$setMessageTypeLimit$2 r4 = new com.yhchat.canarys.data.repository.GroupRepository$setMessageTypeLimit$2
            r5 = 0
            r4.<init>(r6, r7, r8, r5)
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r0.L$0 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
            r0.L$1 = r5
            r5 = 1
            r0.label = r5
            java.lang.Object r3 = kotlinx.coroutines.BuildersKt.withContext(r3, r4, r0)
            if (r3 != r2) goto L62
            return r2
        L62:
            kotlin.Result r3 = (kotlin.Result) r3
            java.lang.Object r2 = r3.getValue()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.GroupRepository.m8587setMessageTypeLimit0E7RQCE(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0014  */
    /* renamed from: removeMember-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8582removeMember0E7RQCE(java.lang.String r7, java.lang.String r8, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.yhchat.canarys.data.repository.GroupRepository$removeMember$1
            if (r0 == 0) goto L14
            r0 = r9
            com.yhchat.canarys.data.repository.GroupRepository$removeMember$1 r0 = (com.yhchat.canarys.data.repository.GroupRepository$removeMember$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.GroupRepository$removeMember$1 r0 = new com.yhchat.canarys.data.repository.GroupRepository$removeMember$1
            r0.<init>(r6, r9)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L3b;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            java.lang.Object r2 = r0.L$1
            r8 = r2
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r2 = r0.L$0
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            kotlin.ResultKt.throwOnFailure(r1)
            r3 = r1
            goto L62
        L3b:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlinx.coroutines.CoroutineDispatcher r3 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
            com.yhchat.canarys.data.repository.GroupRepository$removeMember$2 r4 = new com.yhchat.canarys.data.repository.GroupRepository$removeMember$2
            r5 = 0
            r4.<init>(r6, r7, r8, r5)
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r0.L$0 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
            r0.L$1 = r5
            r5 = 1
            r0.label = r5
            java.lang.Object r3 = kotlinx.coroutines.BuildersKt.withContext(r3, r4, r0)
            if (r3 != r2) goto L62
            return r2
        L62:
            kotlin.Result r3 = (kotlin.Result) r3
            java.lang.Object r2 = r3.getValue()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.GroupRepository.m8582removeMember0E7RQCE(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0014  */
    /* renamed from: gagMember-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8573gagMemberBWLJW6A(java.lang.String r11, java.lang.String r12, int r13, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.yhchat.canarys.data.repository.GroupRepository$gagMember$1
            if (r0 == 0) goto L14
            r0 = r14
            com.yhchat.canarys.data.repository.GroupRepository$gagMember$1 r0 = (com.yhchat.canarys.data.repository.GroupRepository$gagMember$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.GroupRepository$gagMember$1 r0 = new com.yhchat.canarys.data.repository.GroupRepository$gagMember$1
            r0.<init>(r10, r14)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L40;
                case 1: goto L2e;
                default: goto L24;
            }
        L24:
            r6 = r11
            r7 = r12
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2e:
            int r13 = r0.I$0
            java.lang.Object r2 = r0.L$1
            r12 = r2
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r2 = r0.L$0
            r11 = r2
            java.lang.String r11 = (java.lang.String) r11
            kotlin.ResultKt.throwOnFailure(r1)
            r6 = r11
            r11 = r1
            goto L6f
        L40:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlinx.coroutines.CoroutineDispatcher r3 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
            com.yhchat.canarys.data.repository.GroupRepository$gagMember$2 r4 = new com.yhchat.canarys.data.repository.GroupRepository$gagMember$2
            r9 = 0
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r0.L$0 = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r0.L$1 = r11
            r0.I$0 = r8
            r11 = 1
            r0.label = r11
            java.lang.Object r11 = kotlinx.coroutines.BuildersKt.withContext(r3, r4, r0)
            if (r11 != r2) goto L6d
            return r2
        L6d:
            r12 = r7
            r13 = r8
        L6f:
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.getValue()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.GroupRepository.m8573gagMemberBWLJW6A(java.lang.String, java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0014  */
    /* renamed from: setMemberRole-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8586setMemberRoleBWLJW6A(java.lang.String r11, java.lang.String r12, int r13, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.yhchat.canarys.data.repository.GroupRepository$setMemberRole$1
            if (r0 == 0) goto L14
            r0 = r14
            com.yhchat.canarys.data.repository.GroupRepository$setMemberRole$1 r0 = (com.yhchat.canarys.data.repository.GroupRepository$setMemberRole$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.GroupRepository$setMemberRole$1 r0 = new com.yhchat.canarys.data.repository.GroupRepository$setMemberRole$1
            r0.<init>(r10, r14)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L40;
                case 1: goto L2e;
                default: goto L24;
            }
        L24:
            r6 = r11
            r7 = r12
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2e:
            int r13 = r0.I$0
            java.lang.Object r2 = r0.L$1
            r12 = r2
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r2 = r0.L$0
            r11 = r2
            java.lang.String r11 = (java.lang.String) r11
            kotlin.ResultKt.throwOnFailure(r1)
            r6 = r11
            r11 = r1
            goto L6f
        L40:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlinx.coroutines.CoroutineDispatcher r3 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
            com.yhchat.canarys.data.repository.GroupRepository$setMemberRole$2 r4 = new com.yhchat.canarys.data.repository.GroupRepository$setMemberRole$2
            r9 = 0
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r0.L$0 = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r0.L$1 = r11
            r0.I$0 = r8
            r11 = 1
            r0.label = r11
            java.lang.Object r11 = kotlinx.coroutines.BuildersKt.withContext(r3, r4, r0)
            if (r11 != r2) goto L6d
            return r2
        L6d:
            r12 = r7
            r13 = r8
        L6f:
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.getValue()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.GroupRepository.m8586setMemberRoleBWLJW6A(java.lang.String, java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0094 A[Catch: Exception -> 0x005f, TRY_LEAVE, TryCatch #1 {Exception -> 0x005f, blocks: (B:156:0x0109, B:129:0x005a, B:141:0x0082, B:146:0x0094), top: B:201:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0101 A[Catch: Exception -> 0x0338, TRY_LEAVE, TryCatch #6 {Exception -> 0x0338, blocks: (B:152:0x00f9, B:154:0x0101, B:158:0x010f, B:160:0x011d, B:161:0x013d), top: B:210:0x00f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0303 A[Catch: Exception -> 0x0336, TRY_LEAVE, TryCatch #7 {Exception -> 0x0336, blocks: (B:179:0x0250, B:182:0x0287, B:185:0x02c5, B:186:0x02e7, B:187:0x0303), top: B:212:0x00ff }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: getGroupBotList-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8575getGroupBotListgIAlus(java.lang.String r38, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<com.yhchat.canarys.data.model.Instruction>>> r39) {
        /*
            Method dump skipped, instructions count: 886
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.GroupRepository.m8575getGroupBotListgIAlus(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0084 A[Catch: Exception -> 0x005b, TryCatch #2 {Exception -> 0x005b, blocks: (B:111:0x00e9, B:113:0x00f1, B:115:0x00f9, B:117:0x00ff, B:119:0x010d, B:120:0x013a, B:121:0x0154, B:122:0x0168, B:88:0x0056, B:100:0x0078, B:105:0x0084, B:107:0x0098), top: B:133:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0098 A[Catch: Exception -> 0x005b, TryCatch #2 {Exception -> 0x005b, blocks: (B:111:0x00e9, B:113:0x00f1, B:115:0x00f9, B:117:0x00ff, B:119:0x010d, B:120:0x013a, B:121:0x0154, B:122:0x0168, B:88:0x0056, B:100:0x0078, B:105:0x0084, B:107:0x0098), top: B:133:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00f1 A[Catch: Exception -> 0x005b, TryCatch #2 {Exception -> 0x005b, blocks: (B:111:0x00e9, B:113:0x00f1, B:115:0x00f9, B:117:0x00ff, B:119:0x010d, B:120:0x013a, B:121:0x0154, B:122:0x0168, B:88:0x0056, B:100:0x0078, B:105:0x0084, B:107:0x0098), top: B:133:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0168 A[Catch: Exception -> 0x005b, TRY_LEAVE, TryCatch #2 {Exception -> 0x005b, blocks: (B:111:0x00e9, B:113:0x00f1, B:115:0x00f9, B:117:0x00ff, B:119:0x010d, B:120:0x013a, B:121:0x0154, B:122:0x0168, B:88:0x0056, B:100:0x0078, B:105:0x0084, B:107:0x0098), top: B:133:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0018  */
    /* renamed from: getGroupBots-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8576getGroupBotsgIAlus(java.lang.String r19, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<com.yhchat.canarys.proto.group.Bot_data>>> r20) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.GroupRepository.m8576getGroupBotsgIAlus(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0060 A[Catch: Exception -> 0x00ee, TryCatch #0 {Exception -> 0x00ee, blocks: (B:76:0x0038, B:96:0x0093, B:98:0x009b, B:100:0x00a4, B:105:0x00ae, B:107:0x00b6, B:109:0x00bc, B:112:0x00c6, B:111:0x00c2, B:113:0x00cd, B:115:0x00d9, B:118:0x00e0, B:79:0x0042, B:87:0x005a, B:90:0x0060, B:92:0x0074, B:82:0x004b, B:84:0x004f), top: B:123:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0074 A[Catch: Exception -> 0x00ee, TryCatch #0 {Exception -> 0x00ee, blocks: (B:76:0x0038, B:96:0x0093, B:98:0x009b, B:100:0x00a4, B:105:0x00ae, B:107:0x00b6, B:109:0x00bc, B:112:0x00c6, B:111:0x00c2, B:113:0x00cd, B:115:0x00d9, B:118:0x00e0, B:79:0x0042, B:87:0x005a, B:90:0x0060, B:92:0x0074, B:82:0x004b, B:84:0x004f), top: B:123:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x009b A[Catch: Exception -> 0x00ee, TryCatch #0 {Exception -> 0x00ee, blocks: (B:76:0x0038, B:96:0x0093, B:98:0x009b, B:100:0x00a4, B:105:0x00ae, B:107:0x00b6, B:109:0x00bc, B:112:0x00c6, B:111:0x00c2, B:113:0x00cd, B:115:0x00d9, B:118:0x00e0, B:79:0x0042, B:87:0x005a, B:90:0x0060, B:92:0x0074, B:82:0x004b, B:84:0x004f), top: B:123:0x0024 }] */
    /* renamed from: getInstructionList-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8580getInstructionListgIAlus(java.lang.String r10, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<com.yhchat.canarys.data.model.Instruction>>> r11) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.GroupRepository.m8580getInstructionListgIAlus(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0093 A[Catch: Exception -> 0x005e, TRY_LEAVE, TryCatch #0 {Exception -> 0x005e, blocks: (B:148:0x0108, B:155:0x0141, B:121:0x0059, B:133:0x0081, B:138:0x0093), top: B:187:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0100 A[Catch: Exception -> 0x02fc, TRY_LEAVE, TryCatch #2 {Exception -> 0x02fc, blocks: (B:144:0x00f8, B:146:0x0100, B:150:0x010e, B:152:0x011c, B:153:0x013b, B:158:0x019b, B:159:0x01ca, B:161:0x01d0), top: B:190:0x00f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02c3 A[Catch: Exception -> 0x02fa, TRY_LEAVE, TryCatch #4 {Exception -> 0x02fa, blocks: (B:167:0x01ec, B:172:0x025f, B:173:0x0279, B:174:0x02a1, B:175:0x02c3), top: B:194:0x00fe }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: getGroupMenuButtons-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8579getGroupMenuButtonsgIAlus(java.lang.String r33, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<com.yhchat.canarys.data.model.MenuButton>>> r34) {
        /*
            Method dump skipped, instructions count: 826
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.GroupRepository.m8579getGroupMenuButtonsgIAlus(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: clickMenuButton-yxL6bBk$default */
    public static /* synthetic */ Object m8564clickMenuButtonyxL6bBk$default(GroupRepository groupRepository, long j, String str, int i, String str2, Continuation continuation, int i2, Object obj) {
        String str3;
        if ((i2 & 8) == 0) {
            str3 = str2;
        } else {
            str3 = "";
        }
        return groupRepository.m8567clickMenuButtonyxL6bBk(j, str, i, str3, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00dc A[Catch: Exception -> 0x0174, TRY_ENTER, TryCatch #6 {Exception -> 0x0174, blocks: (B:148:0x00dc, B:150:0x00f0), top: B:190:0x00da }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00f0 A[Catch: Exception -> 0x0174, TRY_LEAVE, TryCatch #6 {Exception -> 0x0174, blocks: (B:148:0x00dc, B:150:0x00f0), top: B:190:0x00da }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x012c A[Catch: Exception -> 0x0172, TryCatch #8 {Exception -> 0x0172, blocks: (B:154:0x0124, B:156:0x012c, B:158:0x0135, B:162:0x013e, B:163:0x0150, B:165:0x015c, B:168:0x0164), top: B:193:0x0124 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0162  */
    /* renamed from: clickMenuButton-yxL6bBk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8567clickMenuButtonyxL6bBk(long r18, java.lang.String r20, int r21, java.lang.String r22, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r23) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.GroupRepository.m8567clickMenuButtonyxL6bBk(long, java.lang.String, int, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0072 A[Catch: Exception -> 0x00f6, TryCatch #0 {Exception -> 0x00f6, blocks: (B:68:0x003f, B:88:0x00b0, B:90:0x00b8, B:92:0x00c1, B:96:0x00ca, B:97:0x00d5, B:99:0x00e1, B:102:0x00e8, B:71:0x0050, B:79:0x006c, B:82:0x0072, B:84:0x0086, B:74:0x0059, B:76:0x005d), top: B:107:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0086 A[Catch: Exception -> 0x00f6, TryCatch #0 {Exception -> 0x00f6, blocks: (B:68:0x003f, B:88:0x00b0, B:90:0x00b8, B:92:0x00c1, B:96:0x00ca, B:97:0x00d5, B:99:0x00e1, B:102:0x00e8, B:71:0x0050, B:79:0x006c, B:82:0x0072, B:84:0x0086, B:74:0x0059, B:76:0x005d), top: B:107:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00b8 A[Catch: Exception -> 0x00f6, TryCatch #0 {Exception -> 0x00f6, blocks: (B:68:0x003f, B:88:0x00b0, B:90:0x00b8, B:92:0x00c1, B:96:0x00ca, B:97:0x00d5, B:99:0x00e1, B:102:0x00e8, B:71:0x0050, B:79:0x006c, B:82:0x0072, B:84:0x0086, B:74:0x0059, B:76:0x005d), top: B:107:0x0024 }] */
    /* renamed from: inviteToGroup-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8581inviteToGroupBWLJW6A(java.lang.String r10, int r11, java.lang.String r12, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r13) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.GroupRepository.m8581inviteToGroupBWLJW6A(java.lang.String, int, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x006b A[Catch: Exception -> 0x00fa, TryCatch #0 {Exception -> 0x00fa, blocks: (B:57:0x003b, B:77:0x00b7, B:79:0x00bf, B:80:0x00d1, B:60:0x004b, B:68:0x0065, B:71:0x006b, B:73:0x007f, B:63:0x0054, B:65:0x0058), top: B:85:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x007f A[Catch: Exception -> 0x00fa, TryCatch #0 {Exception -> 0x00fa, blocks: (B:57:0x003b, B:77:0x00b7, B:79:0x00bf, B:80:0x00d1, B:60:0x004b, B:68:0x0065, B:71:0x006b, B:73:0x007f, B:63:0x0054, B:65:0x0058), top: B:85:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00bf A[Catch: Exception -> 0x00fa, TryCatch #0 {Exception -> 0x00fa, blocks: (B:57:0x003b, B:77:0x00b7, B:79:0x00bf, B:80:0x00d1, B:60:0x004b, B:68:0x0065, B:71:0x006b, B:73:0x007f, B:63:0x0054, B:65:0x0058), top: B:85:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d1 A[Catch: Exception -> 0x00fa, TRY_LEAVE, TryCatch #0 {Exception -> 0x00fa, blocks: (B:57:0x003b, B:77:0x00b7, B:79:0x00bf, B:80:0x00d1, B:60:0x004b, B:68:0x0065, B:71:0x006b, B:73:0x007f, B:63:0x0054, B:65:0x0058), top: B:85:0x0022 }] */
    /* renamed from: editMyGroupNickname-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8572editMyGroupNickname0E7RQCE(java.lang.String r11, java.lang.String r12, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r13) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.GroupRepository.m8572editMyGroupNickname0E7RQCE(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x006c A[Catch: Exception -> 0x010b, TryCatch #0 {Exception -> 0x010b, blocks: (B:63:0x003c, B:83:0x00b7, B:85:0x00bf, B:87:0x00c7, B:91:0x00d0, B:92:0x00e2, B:66:0x004c, B:74:0x0066, B:77:0x006c, B:79:0x0080, B:69:0x0055, B:71:0x0059), top: B:97:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0080 A[Catch: Exception -> 0x010b, TryCatch #0 {Exception -> 0x010b, blocks: (B:63:0x003c, B:83:0x00b7, B:85:0x00bf, B:87:0x00c7, B:91:0x00d0, B:92:0x00e2, B:66:0x004c, B:74:0x0066, B:77:0x006c, B:79:0x0080, B:69:0x0055, B:71:0x0059), top: B:97:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00bf A[Catch: Exception -> 0x010b, TryCatch #0 {Exception -> 0x010b, blocks: (B:63:0x003c, B:83:0x00b7, B:85:0x00bf, B:87:0x00c7, B:91:0x00d0, B:92:0x00e2, B:66:0x004c, B:74:0x0066, B:77:0x006c, B:79:0x0080, B:69:0x0055, B:71:0x0059), top: B:97:0x0023 }] */
    /* renamed from: editGroupKeyword-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8571editGroupKeyword0E7RQCE(java.lang.String r11, java.lang.String r12, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r13) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.GroupRepository.m8571editGroupKeyword0E7RQCE(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00e2 A[Catch: Exception -> 0x00c0, TryCatch #0 {Exception -> 0x00c0, blocks: (B:162:0x0187, B:164:0x018f, B:166:0x0197, B:169:0x01a2, B:171:0x01b1, B:172:0x01d6, B:173:0x01f2, B:174:0x0208, B:141:0x00bd, B:156:0x00e2, B:158:0x00f6), top: B:185:0x00bd }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00f6 A[Catch: Exception -> 0x00c0, TryCatch #0 {Exception -> 0x00c0, blocks: (B:162:0x0187, B:164:0x018f, B:166:0x0197, B:169:0x01a2, B:171:0x01b1, B:172:0x01d6, B:173:0x01f2, B:174:0x0208, B:141:0x00bd, B:156:0x00e2, B:158:0x00f6), top: B:185:0x00bd }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x018f A[Catch: Exception -> 0x00c0, TryCatch #0 {Exception -> 0x00c0, blocks: (B:162:0x0187, B:164:0x018f, B:166:0x0197, B:169:0x01a2, B:171:0x01b1, B:172:0x01d6, B:173:0x01f2, B:174:0x0208, B:141:0x00bd, B:156:0x00e2, B:158:0x00f6), top: B:185:0x00bd }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0208 A[Catch: Exception -> 0x00c0, TRY_LEAVE, TryCatch #0 {Exception -> 0x00c0, blocks: (B:162:0x0187, B:164:0x018f, B:166:0x0197, B:169:0x01a2, B:171:0x01b1, B:172:0x01d6, B:173:0x01f2, B:174:0x0208, B:141:0x00bd, B:156:0x00e2, B:158:0x00f6), top: B:185:0x00bd }] */
    /* renamed from: createGroup-hUnOzRk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8568createGrouphUnOzRk(java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, int r28, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.String>> r29) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.GroupRepository.m8568createGrouphUnOzRk(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
