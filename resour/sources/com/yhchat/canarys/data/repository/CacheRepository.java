package com.yhchat.canarys.data.repository;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.yhchat.canarys.data.local.AppDatabase;
import com.yhchat.canarys.data.local.CachedConversation;
import com.yhchat.canarys.data.local.CachedConversationDao;
import com.yhchat.canarys.data.local.CachedMessage;
import com.yhchat.canarys.data.local.CachedMessageDao;
import com.yhchat.canarys.data.model.ChatMessage;
import com.yhchat.canarys.data.model.Conversation;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import okhttp3.internal.p011ws.WebSocketProtocol;

/* compiled from: CacheRepository.kt */
@Singleton
@Metadata(m168d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0086@\u00a2\u0006\u0002\u0010\u0011J\u001c\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0086@\u00a2\u0006\u0002\u0010\u0015J&\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0086@\u00a2\u0006\u0002\u0010\u001cJ\u001e\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0086@\u00a2\u0006\u0002\u0010 J\u0016\u0010!\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0086@\u00a2\u0006\u0002\u0010\"J\u0016\u0010#\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0086@\u00a2\u0006\u0002\u0010\"J\u001a\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u000e0\r2\u0006\u0010\u0017\u001a\u00020\u0018J\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0086@\u00a2\u0006\u0002\u0010\"J\u0016\u0010'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020%H\u0086@\u00a2\u0006\u0002\u0010)J\u001c\u0010*\u001a\u00020\u00132\f\u0010+\u001a\b\u0012\u0004\u0012\u00020%0\u000eH\u0086@\u00a2\u0006\u0002\u0010\u0015J\u000e\u0010,\u001a\u00020\u0013H\u0086@\u00a2\u0006\u0002\u0010\u0011J\u0018\u0010-\u001a\u0004\u0018\u00010%2\u0006\u0010.\u001a\u00020\u0018H\u0086@\u00a2\u0006\u0002\u0010\"J\u0016\u0010/\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\u0018H\u0086@\u00a2\u0006\u0002\u0010\"J \u00100\u001a\u0004\u0018\u00010%2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u00101\u001a\u00020\u001fH\u0086@\u00a2\u0006\u0002\u0010 J\u000e\u00102\u001a\u00020\u0013H\u0086@\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, m169d2 = {"Lcom/yhchat/canarys/data/repository/CacheRepository;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "database", "Lcom/yhchat/canarys/data/local/AppDatabase;", "conversationDao", "Lcom/yhchat/canarys/data/local/CachedConversationDao;", "messageDao", "Lcom/yhchat/canarys/data/local/CachedMessageDao;", "getCachedConversations", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/yhchat/canarys/data/model/Conversation;", "getCachedConversationsSync", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cacheConversations", "", "conversations", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateConversationLastMessage", ChatSearchActivity.EXTRA_CHAT_ID, "", "lastMessage", "timestamp", "", "(Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateConversationDoNotDisturb", "doNotDisturb", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markConversationAsRead", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteConversationFromCache", "getCachedMessages", "Lcom/yhchat/canarys/data/model/ChatMessage;", "getCachedMessagesSync", "cacheMessage", "message", "(Lcom/yhchat/canarys/data/model/ChatMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cacheMessages", "messages", "cleanOldMessages", "getMessageById", "msgId", "deleteMessage", "getLastMessage", ChatSearchActivity.EXTRA_CHAT_TYPE, "clearAllCache", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class CacheRepository {
    public static final int $stable = 8;
    private final Context context;
    private final CachedConversationDao conversationDao;
    private final AppDatabase database;
    private final CachedMessageDao messageDao;

    /* compiled from: CacheRepository.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.data.repository.CacheRepository", m185f = "CacheRepository.kt", m186i = {}, m187l = {377, 378}, m188m = "clearAllCache", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.data.repository.CacheRepository$clearAllCache$1 */
    static final class C30301 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C30301(Continuation<? super C30301> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CacheRepository.this.clearAllCache(this);
        }
    }

    /* compiled from: CacheRepository.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.data.repository.CacheRepository", m185f = "CacheRepository.kt", m186i = {0, 1, 1, 2, 2}, m187l = {WebSocketProtocol.PAYLOAD_SHORT, 131, 134}, m188m = "deleteConversationFromCache", m189n = {ChatSearchActivity.EXTRA_CHAT_ID, ChatSearchActivity.EXTRA_CHAT_ID, "conversation", ChatSearchActivity.EXTRA_CHAT_ID, "conversation"}, m191s = {"L$0", "L$0", "L$1", "L$0", "L$1"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.data.repository.CacheRepository$deleteConversationFromCache$1 */
    static final class C30311 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C30311(Continuation<? super C30311> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CacheRepository.this.deleteConversationFromCache(null, this);
        }
    }

    /* compiled from: CacheRepository.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.data.repository.CacheRepository", m185f = "CacheRepository.kt", m186i = {}, m187l = {58}, m188m = "getCachedConversationsSync", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.data.repository.CacheRepository$getCachedConversationsSync$1 */
    static final class C30321 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C30321(Continuation<? super C30321> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CacheRepository.this.getCachedConversationsSync(this);
        }
    }

    /* compiled from: CacheRepository.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.data.repository.CacheRepository", m185f = "CacheRepository.kt", m186i = {0}, m187l = {178}, m188m = "getCachedMessagesSync", m189n = {ChatSearchActivity.EXTRA_CHAT_ID}, m191s = {"L$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.data.repository.CacheRepository$getCachedMessagesSync$1 */
    static final class C30331 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C30331(Continuation<? super C30331> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CacheRepository.this.getCachedMessagesSync(null, this);
        }
    }

    /* compiled from: CacheRepository.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.data.repository.CacheRepository", m185f = "CacheRepository.kt", m186i = {0, 0}, m187l = {345}, m188m = "getLastMessage", m189n = {ChatSearchActivity.EXTRA_CHAT_ID, ChatSearchActivity.EXTRA_CHAT_TYPE}, m191s = {"L$0", "I$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.data.repository.CacheRepository$getLastMessage$1 */
    static final class C30341 extends ContinuationImpl {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C30341(Continuation<? super C30341> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CacheRepository.this.getLastMessage(null, 0, this);
        }
    }

    /* compiled from: CacheRepository.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.data.repository.CacheRepository", m185f = "CacheRepository.kt", m186i = {0}, m187l = {306}, m188m = "getMessageById", m189n = {"msgId"}, m191s = {"L$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.data.repository.CacheRepository$getMessageById$1 */
    static final class C30351 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C30351(Continuation<? super C30351> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CacheRepository.this.getMessageById(null, this);
        }
    }

    @Inject
    public CacheRepository(@ApplicationContext Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.database = AppDatabase.INSTANCE.getDatabase(this.context);
        this.conversationDao = this.database.cachedConversationDao();
        this.messageDao = this.database.cachedMessageDao();
    }

    public final Flow<List<Conversation>> getCachedConversations() {
        final Flow allConversations = this.conversationDao.getAllConversations();
        return (Flow) new Flow<List<? extends Conversation>>() { // from class: com.yhchat.canarys.data.repository.CacheRepository$getCachedConversations$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@\u00a2\u0006\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, m169d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
            /* renamed from: com.yhchat.canarys.data.repository.CacheRepository$getCachedConversations$$inlined$map$1$2 */
            public static final class C30282<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
                @DebugMetadata(m184c = "com.yhchat.canarys.data.repository.CacheRepository$getCachedConversations$$inlined$map$1$2", m185f = "CacheRepository.kt", m186i = {0, 0, 0, 0, 0}, m187l = {219}, m188m = "emit", m189n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1\\1\\49\\0"}, m191s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, m192v = 1)
                /* renamed from: com.yhchat.canarys.data.repository.CacheRepository$getCachedConversations$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C30282.this.emit(null, this);
                    }
                }

                public C30282(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r40, kotlin.coroutines.Continuation r41) {
                    /*
                        Method dump skipped, instructions count: 258
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.CacheRepository$getCachedConversations$$inlined$map$1.C30282.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends Conversation>> flowCollector, Continuation $completion) {
                Object objCollect = allConversations.collect(new C30282(flowCollector), $completion);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getCachedConversationsSync(kotlin.coroutines.Continuation<? super java.util.List<com.yhchat.canarys.data.model.Conversation>> r32) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            boolean r2 = r1 instanceof com.yhchat.canarys.data.repository.CacheRepository.C30321
            if (r2 == 0) goto L18
            r2 = r1
            com.yhchat.canarys.data.repository.CacheRepository$getCachedConversationsSync$1 r2 = (com.yhchat.canarys.data.repository.CacheRepository.C30321) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r3 = r2.label
            int r3 = r3 - r4
            r2.label = r3
            goto L1d
        L18:
            com.yhchat.canarys.data.repository.CacheRepository$getCachedConversationsSync$1 r2 = new com.yhchat.canarys.data.repository.CacheRepository$getCachedConversationsSync$1
            r2.<init>(r1)
        L1d:
            java.lang.Object r3 = r2.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r2.label
            switch(r5) {
                case 0: goto L35;
                case 1: goto L30;
                default: goto L28;
            }
        L28:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r2.<init>(r3)
            throw r2
        L30:
            kotlin.ResultKt.throwOnFailure(r3)
            r5 = r3
            goto L44
        L35:
            kotlin.ResultKt.throwOnFailure(r3)
            com.yhchat.canarys.data.local.CachedConversationDao r5 = r0.conversationDao
            r6 = 1
            r2.label = r6
            java.lang.Object r5 = r5.getAllConversationsSync(r2)
            if (r5 != r4) goto L44
            return r4
        L44:
            r4 = r5
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r5 = 0
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r4, r7)
            r6.<init>(r7)
            java.util.Collection r6 = (java.util.Collection) r6
            r7 = r4
            r8 = 0
            java.util.Iterator r9 = r7.iterator()
        L5b:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto Lb4
            java.lang.Object r10 = r9.next()
            r11 = r10
            com.yhchat.canarys.data.local.CachedConversation r11 = (com.yhchat.canarys.data.local.CachedConversation) r11
            r12 = 0
            java.lang.String r14 = r11.getChatId()
            int r15 = r11.getChatType()
            java.lang.String r16 = r11.getName()
            java.lang.String r17 = r11.getChatContent()
            long r18 = r11.getTimestampMs()
            long r25 = r11.getTimestamp()
            int r20 = r11.getUnreadMessage()
            int r21 = r11.getAt()
            java.lang.String r23 = r11.getAvatarUrl()
            java.lang.Integer r24 = r11.getDoNotDisturb()
            java.lang.Integer r28 = r11.getCertificationLevel()
            com.yhchat.canarys.data.model.Conversation r13 = new com.yhchat.canarys.data.model.Conversation
            r29 = 2176(0x880, float:3.049E-42)
            r30 = 0
            r22 = 0
            r27 = 0
            r13.<init>(r14, r15, r16, r17, r18, r20, r21, r22, r23, r24, r25, r27, r28, r29, r30)
            r6.add(r13)
            goto L5b
        Lb4:
            java.util.List r6 = (java.util.List) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.CacheRepository.getCachedConversationsSync(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object cacheConversations(List<Conversation> list, Continuation<? super Unit> continuation) {
        List<Conversation> list2 = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (Conversation conversation : list2) {
            arrayList.add(new CachedConversation(conversation.getChatId(), conversation.getChatType(), conversation.getName(), conversation.getChatContent(), conversation.getTimestampMs(), conversation.getTimestamp(), conversation.getUnreadMessage(), conversation.getAt(), conversation.getAvatarUrl(), conversation.getDoNotDisturb(), conversation.getCertificationLevel(), 0L, 2048, null));
        }
        List cachedConversations = (List) arrayList;
        Object objInsertConversations = this.conversationDao.insertConversations(cachedConversations, continuation);
        return objInsertConversations == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInsertConversations : Unit.INSTANCE;
    }

    public final Object updateConversationLastMessage(String chatId, String lastMessage, long timestamp, Continuation<? super Unit> continuation) {
        Object objUpdateLastMessage = this.conversationDao.updateLastMessage(chatId, lastMessage, timestamp, continuation);
        return objUpdateLastMessage == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateLastMessage : Unit.INSTANCE;
    }

    public final Object updateConversationDoNotDisturb(String chatId, int doNotDisturb, Continuation<? super Unit> continuation) {
        Object objUpdateDoNotDisturb = this.conversationDao.updateDoNotDisturb(chatId, doNotDisturb, continuation);
        return objUpdateDoNotDisturb == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateDoNotDisturb : Unit.INSTANCE;
    }

    public final Object markConversationAsRead(String chatId, Continuation<? super Unit> continuation) {
        Object objMarkAsRead = this.conversationDao.markAsRead(chatId, continuation);
        return objMarkAsRead == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMarkAsRead : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object deleteConversationFromCache(java.lang.String r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.yhchat.canarys.data.repository.CacheRepository.C30311
            if (r0 == 0) goto L14
            r0 = r10
            com.yhchat.canarys.data.repository.CacheRepository$deleteConversationFromCache$1 r0 = (com.yhchat.canarys.data.repository.CacheRepository.C30311) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.CacheRepository$deleteConversationFromCache$1 r0 = new com.yhchat.canarys.data.repository.CacheRepository$deleteConversationFromCache$1
            r0.<init>(r10)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L51;
                case 1: goto L47;
                case 2: goto L3a;
                case 3: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            java.lang.Object r2 = r0.L$1
            com.yhchat.canarys.data.local.CachedConversation r2 = (com.yhchat.canarys.data.local.CachedConversation) r2
            java.lang.Object r3 = r0.L$0
            r9 = r3
            java.lang.String r9 = (java.lang.String) r9
            kotlin.ResultKt.throwOnFailure(r1)
            goto Lb5
        L3a:
            java.lang.Object r3 = r0.L$1
            com.yhchat.canarys.data.local.CachedConversation r3 = (com.yhchat.canarys.data.local.CachedConversation) r3
            java.lang.Object r4 = r0.L$0
            r9 = r4
            java.lang.String r9 = (java.lang.String) r9
            kotlin.ResultKt.throwOnFailure(r1)
            goto L9c
        L47:
            java.lang.Object r3 = r0.L$0
            r9 = r3
            java.lang.String r9 = (java.lang.String) r9
            kotlin.ResultKt.throwOnFailure(r1)
            r3 = r1
            goto L62
        L51:
            kotlin.ResultKt.throwOnFailure(r1)
            com.yhchat.canarys.data.local.CachedConversationDao r3 = r8.conversationDao
            r0.L$0 = r9
            r4 = 1
            r0.label = r4
            java.lang.Object r3 = r3.getAllConversationsSync(r0)
            if (r3 != r2) goto L62
            return r2
        L62:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L68:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L81
            java.lang.Object r4 = r3.next()
            r5 = r4
            com.yhchat.canarys.data.local.CachedConversation r5 = (com.yhchat.canarys.data.local.CachedConversation) r5
            r6 = 0
            java.lang.String r7 = r5.getChatId()
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r9)
            if (r5 == 0) goto L68
            goto L82
        L81:
            r4 = 0
        L82:
            com.yhchat.canarys.data.local.CachedConversation r4 = (com.yhchat.canarys.data.local.CachedConversation) r4
            if (r4 == 0) goto Lb8
            com.yhchat.canarys.data.local.CachedConversationDao r3 = r8.conversationDao
            r0.L$0 = r9
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r4)
            r0.L$1 = r5
            r5 = 2
            r0.label = r5
            java.lang.Object r3 = r3.deleteConversation(r4, r0)
            if (r3 != r2) goto L9b
            return r2
        L9b:
            r3 = r4
        L9c:
            com.yhchat.canarys.data.local.CachedMessageDao r4 = r8.messageDao
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9)
            r0.L$0 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3)
            r0.L$1 = r5
            r5 = 3
            r0.label = r5
            java.lang.Object r4 = r4.clearChatMessages(r9, r0)
            if (r4 != r2) goto Lb4
            return r2
        Lb4:
            r2 = r3
        Lb5:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        Lb8:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.CacheRepository.deleteConversationFromCache(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Flow<List<ChatMessage>> getCachedMessages(String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        final Flow messages = this.messageDao.getMessages(chatId);
        return (Flow) new Flow<List<? extends ChatMessage>>() { // from class: com.yhchat.canarys.data.repository.CacheRepository$getCachedMessages$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends ChatMessage>> flowCollector, Continuation $completion) {
                Object objCollect = messages.collect(new C30292(flowCollector), $completion);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@\u00a2\u0006\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, m169d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
            /* renamed from: com.yhchat.canarys.data.repository.CacheRepository$getCachedMessages$$inlined$map$1$2 */
            public static final class C30292<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
                @DebugMetadata(m184c = "com.yhchat.canarys.data.repository.CacheRepository$getCachedMessages$$inlined$map$1$2", m185f = "CacheRepository.kt", m186i = {0, 0, 0, 0, 0}, m187l = {219}, m188m = "emit", m189n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1\\1\\49\\0"}, m191s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, m192v = 1)
                /* renamed from: com.yhchat.canarys.data.repository.CacheRepository$getCachedMessages$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C30292.this.emit(null, this);
                    }
                }

                public C30292(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r54, kotlin.coroutines.Continuation r55) {
                    /*
                        Method dump skipped, instructions count: 342
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.CacheRepository$getCachedMessages$$inlined$map$1.C30292.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getCachedMessagesSync(java.lang.String r47, kotlin.coroutines.Continuation<? super java.util.List<com.yhchat.canarys.data.model.ChatMessage>> r48) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.CacheRepository.getCachedMessagesSync(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object cacheMessage(ChatMessage message, Continuation<? super Unit> continuation) {
        String targetChatId;
        int targetChatType;
        boolean isPrivateChat = Intrinsics.areEqual(message.getChatId(), message.getRecvId());
        if (isPrivateChat) {
            String targetChatId2 = message.getSender().getChatId();
            int targetChatType2 = message.getSender().getChatType();
            targetChatId = targetChatId2;
            targetChatType = targetChatType2;
        } else {
            String targetChatId3 = message.getChatId();
            Intrinsics.checkNotNull(targetChatId3);
            Integer chatType = message.getChatType();
            Intrinsics.checkNotNull(chatType);
            int targetChatType3 = chatType.intValue();
            targetChatId = targetChatId3;
            targetChatType = targetChatType3;
        }
        CachedMessage cachedMessage = new CachedMessage(message.getMsgId(), targetChatId, targetChatType, message.getSender().getChatId(), message.getSender().getName(), message.getSender().getAvatarUrl(), message.getDirection(), message.getContentType(), message.getContent().getText(), message.getContent().getImageUrl(), message.getContent().getFileName(), message.getContent().getFileUrl(), message.getContent().getQuoteMsgText(), message.getContent().getQuoteImageUrl(), message.getSendTime(), message.getMsgSeq(), message.getEditTime(), message.getMsgDeleteTime(), message.getQuoteMsgId(), null, null, 0L, 3670016, null);
        Object objInsertMessage = this.messageDao.insertMessage(cachedMessage, continuation);
        return objInsertMessage == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInsertMessage : Unit.INSTANCE;
    }

    public final Object cacheMessages(List<ChatMessage> list, Continuation<? super Unit> continuation) {
        String chatId;
        int iIntValue;
        List<ChatMessage> list2 = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (ChatMessage chatMessage : list2) {
            if (Intrinsics.areEqual(chatMessage.getChatId(), chatMessage.getRecvId())) {
                chatId = chatMessage.getSender().getChatId();
                iIntValue = chatMessage.getSender().getChatType();
            } else {
                String chatId2 = chatMessage.getChatId();
                Intrinsics.checkNotNull(chatId2);
                chatId = chatId2;
                Integer chatType = chatMessage.getChatType();
                Intrinsics.checkNotNull(chatType);
                iIntValue = chatType.intValue();
            }
            arrayList.add(new CachedMessage(chatMessage.getMsgId(), chatId, iIntValue, chatMessage.getSender().getChatId(), chatMessage.getSender().getName(), chatMessage.getSender().getAvatarUrl(), chatMessage.getDirection(), chatMessage.getContentType(), chatMessage.getContent().getText(), chatMessage.getContent().getImageUrl(), chatMessage.getContent().getFileName(), chatMessage.getContent().getFileUrl(), chatMessage.getContent().getQuoteMsgText(), chatMessage.getContent().getQuoteImageUrl(), chatMessage.getSendTime(), chatMessage.getMsgSeq(), chatMessage.getEditTime(), chatMessage.getMsgDeleteTime(), chatMessage.getQuoteMsgId(), null, null, 0L, 3670016, null));
        }
        List cachedMessages = (List) arrayList;
        Object objInsertMessages = this.messageDao.insertMessages(cachedMessages, continuation);
        return objInsertMessages == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInsertMessages : Unit.INSTANCE;
    }

    public final Object cleanOldMessages(Continuation<? super Unit> continuation) {
        long thirtyDaysAgo = System.currentTimeMillis() - 2592000000L;
        Object objDeleteOldMessages = this.messageDao.deleteOldMessages(thirtyDaysAgo, continuation);
        return objDeleteOldMessages == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDeleteOldMessages : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getMessageById(java.lang.String r39, kotlin.coroutines.Continuation<? super com.yhchat.canarys.data.model.ChatMessage> r40) {
        /*
            r38 = this;
            r0 = r38
            r1 = r40
            boolean r2 = r1 instanceof com.yhchat.canarys.data.repository.CacheRepository.C30351
            if (r2 == 0) goto L18
            r2 = r1
            com.yhchat.canarys.data.repository.CacheRepository$getMessageById$1 r2 = (com.yhchat.canarys.data.repository.CacheRepository.C30351) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r3 = r2.label
            int r3 = r3 - r4
            r2.label = r3
            goto L1d
        L18:
            com.yhchat.canarys.data.repository.CacheRepository$getMessageById$1 r2 = new com.yhchat.canarys.data.repository.CacheRepository$getMessageById$1
            r2.<init>(r1)
        L1d:
            java.lang.Object r3 = r2.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r2.label
            switch(r5) {
                case 0: goto L3b;
                case 1: goto L32;
                default: goto L28;
            }
        L28:
            r6 = r39
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r2.<init>(r3)
            throw r2
        L32:
            java.lang.Object r4 = r2.L$0
            java.lang.String r4 = (java.lang.String) r4
            kotlin.ResultKt.throwOnFailure(r3)
            r5 = r3
            goto L53
        L3b:
            kotlin.ResultKt.throwOnFailure(r3)
            com.yhchat.canarys.data.local.CachedMessageDao r5 = r0.messageDao
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r39)
            r2.L$0 = r6
            r6 = 1
            r2.label = r6
            r6 = r39
            java.lang.Object r5 = r5.getMessageById(r6, r2)
            if (r5 != r4) goto L52
            return r4
        L52:
            r4 = r6
        L53:
            com.yhchat.canarys.data.local.CachedMessage r5 = (com.yhchat.canarys.data.local.CachedMessage) r5
            if (r5 != 0) goto L59
            r5 = 0
            return r5
        L59:
            java.lang.String r7 = r5.getMsgId()
            com.yhchat.canarys.data.model.MessageSender r8 = new com.yhchat.canarys.data.model.MessageSender
            java.lang.String r9 = r5.getSenderChatId()
            int r10 = r5.getChatType()
            java.lang.String r11 = r5.getSenderName()
            java.lang.String r12 = r5.getSenderAvatarUrl()
            r15 = 48
            r16 = 0
            r13 = 0
            r14 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r9 = r5.getDirection()
            int r10 = r5.getContentType()
            com.yhchat.canarys.data.model.MessageContent r11 = new com.yhchat.canarys.data.model.MessageContent
            java.lang.String r12 = r5.getContentText()
            java.lang.String r14 = r5.getContentImageUrl()
            java.lang.String r15 = r5.getContentFileName()
            java.lang.String r16 = r5.getContentFileUrl()
            java.lang.String r18 = r5.getQuoteMsgText()
            java.lang.String r19 = r5.getQuoteImageUrl()
            r36 = 16776994(0xffff22, float:2.3509576E-38)
            r37 = 0
            r17 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            long r12 = r5.getSendTime()
            java.lang.Long r17 = r5.getMsgSeq()
            java.lang.Long r18 = r5.getEditTime()
            java.lang.Long r15 = r5.getMsgDeleteTime()
            java.lang.String r16 = r5.getQuoteMsgId()
            com.yhchat.canarys.data.model.ChatMessage r6 = new com.yhchat.canarys.data.model.ChatMessage
            r22 = 14400(0x3840, float:2.0179E-41)
            r14 = 0
            r19 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.CacheRepository.getMessageById(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object deleteMessage(String msgId, Continuation<? super Unit> continuation) {
        Object objDeleteMessage = this.messageDao.deleteMessage(msgId, continuation);
        return objDeleteMessage == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDeleteMessage : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getLastMessage(java.lang.String r40, int r41, kotlin.coroutines.Continuation<? super com.yhchat.canarys.data.model.ChatMessage> r42) {
        /*
            r39 = this;
            r0 = r39
            r1 = r41
            r2 = r42
            boolean r3 = r2 instanceof com.yhchat.canarys.data.repository.CacheRepository.C30341
            if (r3 == 0) goto L1a
            r3 = r2
            com.yhchat.canarys.data.repository.CacheRepository$getLastMessage$1 r3 = (com.yhchat.canarys.data.repository.CacheRepository.C30341) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 & r5
            if (r4 == 0) goto L1a
            int r4 = r3.label
            int r4 = r4 - r5
            r3.label = r4
            goto L1f
        L1a:
            com.yhchat.canarys.data.repository.CacheRepository$getLastMessage$1 r3 = new com.yhchat.canarys.data.repository.CacheRepository$getLastMessage$1
            r3.<init>(r2)
        L1f:
            java.lang.Object r4 = r3.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r6 = r3.label
            switch(r6) {
                case 0: goto L3f;
                case 1: goto L34;
                default: goto L2a;
            }
        L2a:
            r7 = r40
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L34:
            int r1 = r3.I$0
            java.lang.Object r5 = r3.L$0
            java.lang.String r5 = (java.lang.String) r5
            kotlin.ResultKt.throwOnFailure(r4)
            r6 = r4
            goto L59
        L3f:
            kotlin.ResultKt.throwOnFailure(r4)
            com.yhchat.canarys.data.local.CachedMessageDao r6 = r0.messageDao
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r40)
            r3.L$0 = r7
            r3.I$0 = r1
            r7 = 1
            r3.label = r7
            r7 = r40
            java.lang.Object r6 = r6.getLastMessage(r7, r1, r3)
            if (r6 != r5) goto L58
            return r5
        L58:
            r5 = r7
        L59:
            com.yhchat.canarys.data.local.CachedMessage r6 = (com.yhchat.canarys.data.local.CachedMessage) r6
            if (r6 != 0) goto L5f
            r6 = 0
            return r6
        L5f:
            java.lang.String r8 = r6.getMsgId()
            com.yhchat.canarys.data.model.MessageSender r9 = new com.yhchat.canarys.data.model.MessageSender
            java.lang.String r10 = r6.getSenderChatId()
            int r11 = r6.getChatType()
            java.lang.String r12 = r6.getSenderName()
            java.lang.String r13 = r6.getSenderAvatarUrl()
            r16 = 48
            r17 = 0
            r14 = 0
            r15 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.String r10 = r6.getDirection()
            int r11 = r6.getContentType()
            com.yhchat.canarys.data.model.MessageContent r12 = new com.yhchat.canarys.data.model.MessageContent
            java.lang.String r13 = r6.getContentText()
            java.lang.String r15 = r6.getContentImageUrl()
            java.lang.String r16 = r6.getContentFileName()
            java.lang.String r17 = r6.getContentFileUrl()
            java.lang.String r19 = r6.getQuoteMsgText()
            java.lang.String r20 = r6.getQuoteImageUrl()
            r37 = 16776994(0xffff22, float:2.3509576E-38)
            r38 = 0
            r18 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            long r13 = r6.getSendTime()
            java.lang.Long r18 = r6.getMsgSeq()
            java.lang.Long r19 = r6.getEditTime()
            java.lang.Long r16 = r6.getMsgDeleteTime()
            java.lang.String r17 = r6.getQuoteMsgId()
            com.yhchat.canarys.data.model.ChatMessage r7 = new com.yhchat.canarys.data.model.ChatMessage
            r23 = 14400(0x3840, float:2.0179E-41)
            r15 = 0
            r20 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.CacheRepository.getLastMessage(java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object clearAllCache(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.yhchat.canarys.data.repository.CacheRepository.C30301
            if (r0 == 0) goto L14
            r0 = r6
            com.yhchat.canarys.data.repository.CacheRepository$clearAllCache$1 r0 = (com.yhchat.canarys.data.repository.CacheRepository.C30301) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.CacheRepository$clearAllCache$1 r0 = new com.yhchat.canarys.data.repository.CacheRepository$clearAllCache$1
            r0.<init>(r6)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L34;
                case 1: goto L30;
                case 2: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            kotlin.ResultKt.throwOnFailure(r1)
            goto L4f
        L30:
            kotlin.ResultKt.throwOnFailure(r1)
            goto L43
        L34:
            kotlin.ResultKt.throwOnFailure(r1)
            com.yhchat.canarys.data.local.CachedConversationDao r3 = r5.conversationDao
            r4 = 1
            r0.label = r4
            java.lang.Object r3 = r3.clearAllConversations(r0)
            if (r3 != r2) goto L43
            return r2
        L43:
            com.yhchat.canarys.data.local.CachedMessageDao r3 = r5.messageDao
            r4 = 2
            r0.label = r4
            java.lang.Object r3 = r3.clearAllMessages(r0)
            if (r3 != r2) goto L4f
            return r2
        L4f:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.CacheRepository.clearAllCache(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
