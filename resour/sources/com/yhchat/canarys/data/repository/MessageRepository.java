package com.yhchat.canarys.data.repository;

import androidx.core.view.PointerIconCompat;
import com.yhchat.canarys.data.api.ApiService;
import com.yhchat.canarys.data.model.ChatMessage;
import com.yhchat.canarys.data.model.Expression;
import com.yhchat.canarys.data.model.MessageCmd;
import com.yhchat.canarys.data.model.MessageContent;
import com.yhchat.canarys.data.model.MessageSender;
import com.yhchat.canarys.data.model.MessageTag;
import com.yhchat.canarys.data.model.StickerItem;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import com.yhchat.canarys.proto.Msg;
import com.yhchat.canarys.proto.Tag;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MessageRepository.kt */
@Singleton
@Metadata(m168d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tJB\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000bH\u0086@\u00a2\u0006\u0004\b\u0015\u0010\u0016J6\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0086@\u00a2\u0006\u0004\b\u001a\u0010\u001bJn\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\r2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u00122\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00192\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000eH\u0086@\u00a2\u0006\u0004\b$\u0010%J.\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001d0\r2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0004\b'\u0010(J>\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001d0\r2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u0012H\u0086@\u00a2\u0006\u0004\b+\u0010,J^\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001d0\r2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u00122\u0006\u00100\u001a\u00020\u00122\u0006\u00101\u001a\u00020\u00192\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000bH\u0086@\u00a2\u0006\u0004\b2\u00103JV\u00104\u001a\b\u0012\u0004\u0012\u00020\u001d0\r2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u00105\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u00192\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000bH\u0086@\u00a2\u0006\u0004\b7\u00108JV\u00109\u001a\b\u0012\u0004\u0012\u00020\u001d0\r2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u00192\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000bH\u0086@\u00a2\u0006\u0004\b<\u00108JF\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001d0\r2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010>\u001a\u00020?2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000bH\u0086@\u00a2\u0006\u0004\b@\u0010AJF\u0010B\u001a\b\u0012\u0004\u0012\u00020\u001d0\r2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010C\u001a\u00020D2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000bH\u0086@\u00a2\u0006\u0004\bE\u0010FJR\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001d0\r2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010H\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020\u000b2\u0006\u0010K\u001a\u00020\u000b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000bH\u0086@\u00a2\u0006\u0004\bL\u0010MJ \u0010N\u001a\u00020\u000f2\u0006\u0010O\u001a\u00020P2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010Q\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0002\u0010RJ(\u0010S\u001a\u0004\u0018\u00010\u000f2\u0006\u0010T\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@\u00a2\u0006\u0002\u0010UJ\u0016\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0002\u0010YJ\u0016\u0010Z\u001a\u00020W2\u0006\u0010X\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0002\u0010YJ\u0016\u0010[\u001a\u00020W2\u0006\u0010\u0014\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0002\u0010RJ \u0010\\\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@\u00a2\u0006\u0002\u0010]J>\u0010^\u001a\b\u0012\u0004\u0012\u00020W0\r2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010_\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0004\ba\u0010bJ\u001e\u0010c\u001a\b\u0012\u0004\u0012\u00020W0\r2\u0006\u0010d\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0004\be\u0010RJ8\u0010f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020g0\u000e0\r2\u0006\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010h\u001a\u00020\u00122\b\b\u0002\u0010i\u001a\u00020\u0012H\u0086@\u00a2\u0006\u0004\bj\u0010kR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006l"}, m169d2 = {"Lcom/yhchat/canarys/data/repository/MessageRepository;", "", "apiService", "Lcom/yhchat/canarys/data/api/ApiService;", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "cacheRepository", "Lcom/yhchat/canarys/data/repository/CacheRepository;", "<init>", "(Lcom/yhchat/canarys/data/api/ApiService;Lcom/yhchat/canarys/data/repository/TokenRepository;Lcom/yhchat/canarys/data/repository/CacheRepository;)V", "tag", "", "getMessages", "Lkotlin/Result;", "", "Lcom/yhchat/canarys/data/model/ChatMessage;", ChatSearchActivity.EXTRA_CHAT_ID, ChatSearchActivity.EXTRA_CHAT_TYPE, "", "msgCount", "msgId", "getMessages-yxL6bBk", "(Ljava/lang/String;IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMessagesBySeq", "msgSeq", "", "getMessagesBySeq-BWLJW6A", "(Ljava/lang/String;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMessage", "", "text", "contentType", "quoteMsgId", "quoteMsgText", "commandId", "mentionedIds", "sendMessage-tZkwj4A", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recallMessage", "recallMessage-BWLJW6A", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editMessage", "content", "editMessage-hUnOzRk", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendImageMessage", "imageKey", "width", "height", "fileSize", "sendImageMessage-tZkwj4A", "(Ljava/lang/String;ILjava/lang/String;IIJLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendFileMessage", "fileName", "fileKey", "sendFileMessage-eH_QyT8", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendVideoMessage", "videoKey", "fileHash", "sendVideoMessage-eH_QyT8", "sendExpressionMessage", "expression", "Lcom/yhchat/canarys/data/model/Expression;", "sendExpressionMessage-hUnOzRk", "(Ljava/lang/String;ILcom/yhchat/canarys/data/model/Expression;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendStickerMessage", "stickerItem", "Lcom/yhchat/canarys/data/model/StickerItem;", "sendStickerMessage-hUnOzRk", "(Ljava/lang/String;ILcom/yhchat/canarys/data/model/StickerItem;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendPostMessage", "postId", "postTitle", "postContent", "postType", "sendPostMessage-eH_QyT8", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "convertProtoToMessage", "protoMsg", "Lcom/yhchat/canarys/proto/Msg;", "getMessageById", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMessageByIdFromApi", "messageId", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertMessage", "", "message", "(Lcom/yhchat/canarys/data/model/ChatMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateMessage", "deleteMessage", "getLastMessage", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reportButtonClick", "userId", "buttonValue", "reportButtonClick-hUnOzRk", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addExpressionToFavorites", "expressionId", "addExpressionToFavorites-gIAlu-s", "getMessageEditHistory", "Lcom/yhchat/canarys/data/model/MessageEditRecord;", "size", "page", "getMessageEditHistory-BWLJW6A", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class MessageRepository {
    public static final int $stable = 8;
    private final ApiService apiService;
    private final CacheRepository cacheRepository;
    private final String tag;
    private final TokenRepository tokenRepository;

    /* compiled from: MessageRepository.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.data.repository.MessageRepository", m185f = "MessageRepository.kt", m186i = {0}, m187l = {1107}, m188m = "deleteMessage", m189n = {"msgId"}, m191s = {"L$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.data.repository.MessageRepository$deleteMessage$1 */
    static final class C30391 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C30391(Continuation<? super C30391> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MessageRepository.this.deleteMessage(null, this);
        }
    }

    /* compiled from: MessageRepository.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.data.repository.MessageRepository", m185f = "MessageRepository.kt", m186i = {0, 0}, m187l = {1119}, m188m = "getLastMessage", m189n = {ChatSearchActivity.EXTRA_CHAT_ID, ChatSearchActivity.EXTRA_CHAT_TYPE}, m191s = {"L$0", "I$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.data.repository.MessageRepository$getLastMessage$1 */
    static final class C30401 extends ContinuationImpl {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C30401(Continuation<? super C30401> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MessageRepository.this.getLastMessage(null, 0, this);
        }
    }

    /* compiled from: MessageRepository.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.data.repository.MessageRepository", m185f = "MessageRepository.kt", m186i = {0}, m187l = {1001}, m188m = "getMessageById", m189n = {"msgId"}, m191s = {"L$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.data.repository.MessageRepository$getMessageById$1 */
    static final class C30411 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C30411(Continuation<? super C30411> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MessageRepository.this.getMessageById(null, this);
        }
    }

    /* compiled from: MessageRepository.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.data.repository.MessageRepository", m185f = "MessageRepository.kt", m186i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, m187l = {PointerIconCompat.TYPE_GRAB, 1040}, m188m = "getMessageByIdFromApi", m189n = {"messageId", ChatSearchActivity.EXTRA_CHAT_ID, "tokenFlow", ChatSearchActivity.EXTRA_CHAT_TYPE, "messageId", ChatSearchActivity.EXTRA_CHAT_ID, "tokenFlow", "token", "request", "requestBody", ChatSearchActivity.EXTRA_CHAT_TYPE}, m191s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.data.repository.MessageRepository$getMessageByIdFromApi$1 */
    static final class C30421 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        C30421(Continuation<? super C30421> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MessageRepository.this.getMessageByIdFromApi(null, null, 0, this);
        }
    }

    /* compiled from: MessageRepository.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.data.repository.MessageRepository", m185f = "MessageRepository.kt", m186i = {0}, m187l = {1081}, m188m = "insertMessage", m189n = {"message"}, m191s = {"L$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.data.repository.MessageRepository$insertMessage$1 */
    static final class C30431 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C30431(Continuation<? super C30431> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MessageRepository.this.insertMessage(null, this);
        }
    }

    /* compiled from: MessageRepository.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.data.repository.MessageRepository", m185f = "MessageRepository.kt", m186i = {0, 1}, m187l = {1094, 1095}, m188m = "updateMessage", m189n = {"message", "message"}, m191s = {"L$0", "L$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.data.repository.MessageRepository$updateMessage$1 */
    static final class C30441 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C30441(Continuation<? super C30441> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MessageRepository.this.updateMessage(null, this);
        }
    }

    @Inject
    public MessageRepository(ApiService apiService, TokenRepository tokenRepository, CacheRepository cacheRepository) {
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        Intrinsics.checkNotNullParameter(tokenRepository, "tokenRepository");
        Intrinsics.checkNotNullParameter(cacheRepository, "cacheRepository");
        this.apiService = apiService;
        this.tokenRepository = tokenRepository;
        this.cacheRepository = cacheRepository;
        this.tag = "MessageRepository";
    }

    /* renamed from: getMessages-yxL6bBk$default */
    public static /* synthetic */ Object m8600getMessagesyxL6bBk$default(MessageRepository messageRepository, String str, int i, int i2, String str2, Continuation continuation, int i3, Object obj) {
        int i4;
        String str3;
        if ((i3 & 4) == 0) {
            i4 = i2;
        } else {
            i4 = 20;
        }
        if ((i3 & 8) == 0) {
            str3 = str2;
        } else {
            str3 = null;
        }
        return messageRepository.m8612getMessagesyxL6bBk(str, i, i4, str3, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00d7 A[Catch: Exception -> 0x00bc, TRY_LEAVE, TryCatch #3 {Exception -> 0x00bc, blocks: (B:173:0x00b7, B:181:0x00cb, B:187:0x00d7, B:191:0x010a, B:195:0x0113), top: B:249:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00f2 A[Catch: Exception -> 0x0308, TRY_ENTER, TRY_LEAVE, TryCatch #7 {Exception -> 0x0308, blocks: (B:171:0x00b3, B:178:0x00c5, B:189:0x00f2, B:196:0x0116), top: B:256:0x00b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x01aa A[Catch: Exception -> 0x0301, TryCatch #12 {Exception -> 0x0301, blocks: (B:200:0x01a2, B:202:0x01aa, B:204:0x01b2, B:206:0x01ca), top: B:266:0x01a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02b0 A[Catch: Exception -> 0x02fe, TRY_LEAVE, TryCatch #2 {Exception -> 0x02fe, blocks: (B:218:0x0232, B:221:0x0255, B:223:0x0294, B:224:0x02b0), top: B:248:0x01a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: getMessages-yxL6bBk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8612getMessagesyxL6bBk(java.lang.String r25, int r26, int r27, java.lang.String r28, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<com.yhchat.canarys.data.model.ChatMessage>>> r29) {
        /*
            Method dump skipped, instructions count: 888
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.MessageRepository.m8612getMessagesyxL6bBk(java.lang.String, int, int, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: getMessagesBySeq-BWLJW6A$default */
    public static /* synthetic */ Object m8601getMessagesBySeqBWLJW6A$default(MessageRepository messageRepository, String str, int i, long j, Continuation continuation, int i2, Object obj) {
        long j2;
        if ((i2 & 4) == 0) {
            j2 = j;
        } else {
            j2 = 0;
        }
        return messageRepository.m8613getMessagesBySeqBWLJW6A(str, i, j2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00a3 A[Catch: Exception -> 0x006c, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x006c, blocks: (B:133:0x0067, B:150:0x00a3, B:155:0x00ae, B:161:0x00ba), top: B:215:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00ba A[Catch: Exception -> 0x006c, TRY_LEAVE, TryCatch #4 {Exception -> 0x006c, blocks: (B:133:0x0067, B:150:0x00a3, B:155:0x00ae, B:161:0x00ba), top: B:215:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00d5 A[Catch: Exception -> 0x02bd, TRY_ENTER, TryCatch #3 {Exception -> 0x02bd, blocks: (B:167:0x0165, B:169:0x016d, B:171:0x0175, B:173:0x018b, B:148:0x009f, B:153:0x00a9, B:163:0x00d5), top: B:213:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x016d A[Catch: Exception -> 0x02bd, TryCatch #3 {Exception -> 0x02bd, blocks: (B:167:0x0165, B:169:0x016d, B:171:0x0175, B:173:0x018b, B:148:0x009f, B:153:0x00a9, B:163:0x00d5), top: B:213:0x009f }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x026f A[Catch: Exception -> 0x02bb, TRY_LEAVE, TryCatch #5 {Exception -> 0x02bb, blocks: (B:185:0x01f3, B:188:0x0216, B:190:0x0255, B:191:0x026f), top: B:217:0x016b }] */
    /* renamed from: getMessagesBySeq-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8613getMessagesBySeqBWLJW6A(java.lang.String r25, int r26, long r27, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<com.yhchat.canarys.data.model.ChatMessage>>> r29) {
        /*
            Method dump skipped, instructions count: 802
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.MessageRepository.m8613getMessagesBySeqBWLJW6A(java.lang.String, int, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0143 A[Catch: Exception -> 0x0127, TRY_LEAVE, TryCatch #18 {Exception -> 0x0127, blocks: (B:244:0x0122, B:252:0x0136, B:258:0x0143, B:262:0x0194, B:268:0x01a2, B:271:0x01ab), top: B:394:0x0122 }] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x015e A[Catch: Exception -> 0x0448, TRY_ENTER, TRY_LEAVE, TryCatch #17 {Exception -> 0x0448, blocks: (B:242:0x011e, B:249:0x012f, B:260:0x015e, B:269:0x01a5), top: B:392:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0327 A[Catch: Exception -> 0x0435, TryCatch #8 {Exception -> 0x0435, blocks: (B:300:0x031f, B:302:0x0327, B:304:0x032f), top: B:374:0x031f }] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x03db A[Catch: Exception -> 0x042d, TRY_LEAVE, TryCatch #4 {Exception -> 0x042d, blocks: (B:315:0x037c, B:321:0x03bf, B:322:0x03db), top: B:367:0x0325 }] */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0122 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v66, types: [okhttp3.RequestBody] */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r29v3, types: [com.yhchat.canarys.proto.send_message_send$Content$Builder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r29v4 */
    /* JADX WARN: Type inference failed for: r2v12, types: [com.yhchat.canarys.data.api.ApiService] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, okhttp3.RequestBody] */
    /* renamed from: sendMessage-tZkwj4A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8619sendMessagetZkwj4A(java.lang.String r27, int r28, java.lang.String r29, int r30, java.lang.String r31, java.lang.String r32, java.lang.Long r33, java.util.List<java.lang.String> r34, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r35) {
        /*
            Method dump skipped, instructions count: 1198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.MessageRepository.m8619sendMessagetZkwj4A(java.lang.String, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.Long, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00c6 A[Catch: Exception -> 0x00ab, TRY_LEAVE, TryCatch #6 {Exception -> 0x00ab, blocks: (B:151:0x00a6, B:158:0x00ba, B:164:0x00c6), top: B:219:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00e1 A[Catch: Exception -> 0x0306, TRY_ENTER, TRY_LEAVE, TryCatch #8 {Exception -> 0x0306, blocks: (B:149:0x00a2, B:156:0x00b5, B:166:0x00e1), top: B:223:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01cb A[Catch: Exception -> 0x0300, TryCatch #0 {Exception -> 0x0300, blocks: (B:170:0x01a7, B:172:0x01cb, B:174:0x01d3), top: B:208:0x01a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x029c A[Catch: Exception -> 0x02fe, TryCatch #4 {Exception -> 0x02fe, blocks: (B:178:0x01f1, B:180:0x022d, B:181:0x0241, B:185:0x0282, B:186:0x029c, B:188:0x02a8, B:190:0x02ae), top: B:216:0x01c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: recallMessage-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8614recallMessageBWLJW6A(java.lang.String r22, int r23, java.lang.String r24, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r25) {
        /*
            Method dump skipped, instructions count: 868
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.MessageRepository.m8614recallMessageBWLJW6A(java.lang.String, int, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00ea A[Catch: Exception -> 0x00d1, TRY_LEAVE, TryCatch #10 {Exception -> 0x00d1, blocks: (B:164:0x00cc, B:171:0x00de, B:177:0x00ea), top: B:243:0x00cc }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0105 A[Catch: Exception -> 0x0386, TRY_ENTER, TryCatch #7 {Exception -> 0x0386, blocks: (B:183:0x0228, B:162:0x00c8, B:169:0x00d9, B:179:0x0105), top: B:237:0x00c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0250 A[Catch: Exception -> 0x0381, TryCatch #11 {Exception -> 0x0381, blocks: (B:185:0x0239, B:187:0x0250, B:189:0x0258), top: B:245:0x0239 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x031a A[Catch: Exception -> 0x037e, TryCatch #1 {Exception -> 0x037e, blocks: (B:191:0x0278, B:193:0x02b4, B:194:0x02c8, B:196:0x0304, B:197:0x031a, B:199:0x0322, B:201:0x032b), top: B:226:0x024e }] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: editMessage-hUnOzRk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8610editMessagehUnOzRk(java.lang.String r27, int r28, java.lang.String r29, java.lang.String r30, int r31, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r32) {
        /*
            Method dump skipped, instructions count: 1024
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.MessageRepository.m8610editMessagehUnOzRk(java.lang.String, int, java.lang.String, java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: sendImageMessage-tZkwj4A$default */
    public static /* synthetic */ Object m8604sendImageMessagetZkwj4A$default(MessageRepository messageRepository, String str, int i, String str2, int i2, int i3, long j, String str3, String str4, Continuation continuation, int i4, Object obj) {
        if ((i4 & 64) != 0) {
            str3 = null;
        }
        if ((i4 & 128) != 0) {
            str4 = null;
        }
        return messageRepository.m8618sendImageMessagetZkwj4A(str, i, str2, i2, i3, j, str3, str4, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:215:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0151 A[Catch: Exception -> 0x0130, TRY_LEAVE, TryCatch #0 {Exception -> 0x0130, blocks: (B:253:0x012b, B:261:0x0143, B:267:0x0151), top: B:372:0x012b }] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x016c A[Catch: Exception -> 0x0571, TRY_ENTER, TRY_LEAVE, TryCatch #8 {Exception -> 0x0571, blocks: (B:251:0x0127, B:258:0x013b, B:269:0x016c), top: B:388:0x0127 }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0263 A[Catch: Exception -> 0x0258, TRY_LEAVE, TryCatch #5 {Exception -> 0x0258, blocks: (B:273:0x024e, B:281:0x0263), top: B:382:0x024e }] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x02bd A[Catch: Exception -> 0x02b2, TRY_LEAVE, TryCatch #7 {Exception -> 0x02b2, blocks: (B:288:0x02ab, B:295:0x02bd), top: B:386:0x02ab }] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x03c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0405 A[Catch: Exception -> 0x04d1, TRY_ENTER, TryCatch #9 {Exception -> 0x04d1, blocks: (B:309:0x0405, B:311:0x040d, B:313:0x0469, B:314:0x047d, B:316:0x04bb, B:322:0x04dd), top: B:390:0x0403 }] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x04d7 A[Catch: Exception -> 0x0544, TRY_ENTER, TRY_LEAVE, TryCatch #20 {Exception -> 0x0544, blocks: (B:307:0x03e7, B:320:0x04d7, B:326:0x04e8), top: B:411:0x03e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x012b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:386:0x02ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: sendImageMessage-tZkwj4A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8618sendImageMessagetZkwj4A(java.lang.String r32, int r33, java.lang.String r34, int r35, int r36, long r37, java.lang.String r39, java.lang.String r40, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r41) {
        /*
            Method dump skipped, instructions count: 1506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.MessageRepository.m8618sendImageMessagetZkwj4A(java.lang.String, int, java.lang.String, int, int, long, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: sendFileMessage-eH_QyT8$default */
    public static /* synthetic */ Object m8603sendFileMessageeH_QyT8$default(MessageRepository messageRepository, String str, int i, String str2, String str3, long j, String str4, String str5, Continuation continuation, int i2, Object obj) {
        if ((i2 & 32) != 0) {
            str4 = null;
        }
        if ((i2 & 64) != 0) {
            str5 = null;
        }
        return messageRepository.m8617sendFileMessageeH_QyT8(str, i, str2, str3, j, str4, str5, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:211:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x014b A[Catch: Exception -> 0x012b, TRY_LEAVE, TryCatch #4 {Exception -> 0x012b, blocks: (B:247:0x0126, B:255:0x013d, B:261:0x014b), top: B:372:0x0126 }] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0166 A[Catch: Exception -> 0x0540, TRY_ENTER, TRY_LEAVE, TryCatch #13 {Exception -> 0x0540, blocks: (B:245:0x0122, B:252:0x0135, B:263:0x0166), top: B:389:0x0122 }] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0258 A[Catch: Exception -> 0x024e, TRY_LEAVE, TryCatch #3 {Exception -> 0x024e, blocks: (B:267:0x0244, B:275:0x0258), top: B:370:0x0244 }] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x02b6 A[Catch: Exception -> 0x02a9, TRY_LEAVE, TryCatch #5 {Exception -> 0x02a9, blocks: (B:282:0x02a2, B:289:0x02b6), top: B:374:0x02a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x037c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x03b9 A[Catch: Exception -> 0x04e9, TryCatch #6 {Exception -> 0x04e9, blocks: (B:305:0x03a2, B:307:0x03b9, B:309:0x03c1, B:311:0x041d, B:312:0x0431, B:314:0x046d, B:315:0x0481, B:317:0x0487, B:319:0x0490), top: B:376:0x03a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0481 A[Catch: Exception -> 0x04e9, TryCatch #6 {Exception -> 0x04e9, blocks: (B:305:0x03a2, B:307:0x03b9, B:309:0x03c1, B:311:0x041d, B:312:0x0431, B:314:0x046d, B:315:0x0481, B:317:0x0487, B:319:0x0490), top: B:376:0x03a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0126 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:374:0x02a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: sendFileMessage-eH_QyT8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8617sendFileMessageeH_QyT8(java.lang.String r32, int r33, java.lang.String r34, java.lang.String r35, long r36, java.lang.String r38, java.lang.String r39, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r40) {
        /*
            Method dump skipped, instructions count: 1450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.MessageRepository.m8617sendFileMessageeH_QyT8(java.lang.String, int, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: sendVideoMessage-eH_QyT8$default */
    public static /* synthetic */ Object m8608sendVideoMessageeH_QyT8$default(MessageRepository messageRepository, String str, int i, String str2, String str3, long j, String str4, String str5, Continuation continuation, int i2, Object obj) {
        if ((i2 & 32) != 0) {
            str4 = null;
        }
        if ((i2 & 64) != 0) {
            str5 = null;
        }
        return messageRepository.m8622sendVideoMessageeH_QyT8(str, i, str2, str3, j, str4, str5, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:207:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0151 A[Catch: Exception -> 0x0130, TRY_LEAVE, TryCatch #0 {Exception -> 0x0130, blocks: (B:243:0x012b, B:251:0x0143, B:257:0x0151), top: B:358:0x012b }] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x016c A[Catch: Exception -> 0x0568, TRY_ENTER, TRY_LEAVE, TryCatch #17 {Exception -> 0x0568, blocks: (B:241:0x0127, B:248:0x013b, B:259:0x016c), top: B:391:0x0127 }] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0257 A[Catch: Exception -> 0x024c, TRY_LEAVE, TryCatch #3 {Exception -> 0x024c, blocks: (B:263:0x0242, B:271:0x0257), top: B:364:0x0242 }] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x02e0 A[Catch: Exception -> 0x02d3, TRY_LEAVE, TryCatch #9 {Exception -> 0x02d3, blocks: (B:278:0x02cc, B:285:0x02e0), top: B:376:0x02cc }] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x03b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x03ef A[Catch: Exception -> 0x051d, TryCatch #15 {Exception -> 0x051d, blocks: (B:301:0x03d1, B:303:0x03ef, B:305:0x03f7, B:307:0x0453, B:308:0x0467, B:310:0x04a3, B:311:0x04b7, B:313:0x04bd, B:315:0x04c6), top: B:388:0x03d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x04b7 A[Catch: Exception -> 0x051d, TryCatch #15 {Exception -> 0x051d, blocks: (B:301:0x03d1, B:303:0x03ef, B:305:0x03f7, B:307:0x0453, B:308:0x0467, B:310:0x04a3, B:311:0x04b7, B:313:0x04bd, B:315:0x04c6), top: B:388:0x03d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x012b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:376:0x02cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: sendVideoMessage-eH_QyT8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8622sendVideoMessageeH_QyT8(java.lang.String r32, int r33, java.lang.String r34, java.lang.String r35, long r36, java.lang.String r38, java.lang.String r39, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r40) {
        /*
            Method dump skipped, instructions count: 1496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.MessageRepository.m8622sendVideoMessageeH_QyT8(java.lang.String, int, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: sendExpressionMessage-hUnOzRk$default */
    public static /* synthetic */ Object m8602sendExpressionMessagehUnOzRk$default(MessageRepository messageRepository, String str, int i, Expression expression, String str2, String str3, Continuation continuation, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str2 = null;
        }
        if ((i2 & 16) != 0) {
            str3 = null;
        }
        return messageRepository.m8616sendExpressionMessagehUnOzRk(str, i, expression, str2, str3, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00dd A[Catch: Exception -> 0x009d, TRY_ENTER, TRY_LEAVE, TryCatch #8 {Exception -> 0x009d, blocks: (B:182:0x0097, B:203:0x00dd, B:209:0x00e9, B:215:0x00f5, B:219:0x01d5, B:225:0x01e1, B:228:0x0223, B:234:0x022f), top: B:314:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00f5 A[Catch: Exception -> 0x009d, TRY_LEAVE, TryCatch #8 {Exception -> 0x009d, blocks: (B:182:0x0097, B:203:0x00dd, B:209:0x00e9, B:215:0x00f5, B:219:0x01d5, B:225:0x01e1, B:228:0x0223, B:234:0x022f), top: B:314:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0110 A[Catch: Exception -> 0x047b, TRY_ENTER, TRY_LEAVE, TryCatch #9 {Exception -> 0x047b, blocks: (B:201:0x00d9, B:207:0x00e4, B:217:0x0110, B:226:0x01fc, B:235:0x024a), top: B:315:0x00d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0325 A[Catch: Exception -> 0x03f1, TRY_ENTER, TryCatch #7 {Exception -> 0x03f1, blocks: (B:247:0x0325, B:249:0x032d, B:251:0x0389, B:252:0x039d, B:254:0x03db, B:260:0x03fb), top: B:313:0x0323 }] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03f5 A[Catch: Exception -> 0x0461, TRY_ENTER, TRY_LEAVE, TryCatch #14 {Exception -> 0x0461, blocks: (B:245:0x0307, B:258:0x03f5, B:264:0x0406), top: B:325:0x0307 }] */
    /* renamed from: sendExpressionMessage-hUnOzRk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8616sendExpressionMessagehUnOzRk(java.lang.String r26, int r27, com.yhchat.canarys.data.model.Expression r28, java.lang.String r29, java.lang.String r30, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r31) {
        /*
            Method dump skipped, instructions count: 1232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.MessageRepository.m8616sendExpressionMessagehUnOzRk(java.lang.String, int, com.yhchat.canarys.data.model.Expression, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: sendStickerMessage-hUnOzRk$default */
    public static /* synthetic */ Object m8607sendStickerMessagehUnOzRk$default(MessageRepository messageRepository, String str, int i, StickerItem stickerItem, String str2, String str3, Continuation continuation, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str2 = null;
        }
        if ((i2 & 16) != 0) {
            str3 = null;
        }
        return messageRepository.m8621sendStickerMessagehUnOzRk(str, i, stickerItem, str2, str3, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00dd A[Catch: Exception -> 0x009d, TRY_ENTER, TRY_LEAVE, TryCatch #8 {Exception -> 0x009d, blocks: (B:182:0x0097, B:203:0x00dd, B:209:0x00e9, B:215:0x00f5, B:219:0x01f5, B:225:0x0201, B:228:0x0243, B:234:0x024f), top: B:314:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00f5 A[Catch: Exception -> 0x009d, TRY_LEAVE, TryCatch #8 {Exception -> 0x009d, blocks: (B:182:0x0097, B:203:0x00dd, B:209:0x00e9, B:215:0x00f5, B:219:0x01f5, B:225:0x0201, B:228:0x0243, B:234:0x024f), top: B:314:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0110 A[Catch: Exception -> 0x049b, TRY_ENTER, TRY_LEAVE, TryCatch #9 {Exception -> 0x049b, blocks: (B:201:0x00d9, B:207:0x00e4, B:217:0x0110, B:226:0x021c, B:235:0x026a), top: B:315:0x00d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0345 A[Catch: Exception -> 0x0411, TRY_ENTER, TryCatch #7 {Exception -> 0x0411, blocks: (B:247:0x0345, B:249:0x034d, B:251:0x03a9, B:252:0x03bd, B:254:0x03fb, B:260:0x041b), top: B:313:0x0343 }] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0415 A[Catch: Exception -> 0x0481, TRY_ENTER, TRY_LEAVE, TryCatch #14 {Exception -> 0x0481, blocks: (B:245:0x0327, B:258:0x0415, B:264:0x0426), top: B:325:0x0327 }] */
    /* renamed from: sendStickerMessage-hUnOzRk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8621sendStickerMessagehUnOzRk(java.lang.String r26, int r27, com.yhchat.canarys.data.model.StickerItem r28, java.lang.String r29, java.lang.String r30, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r31) {
        /*
            Method dump skipped, instructions count: 1264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.MessageRepository.m8621sendStickerMessagehUnOzRk(java.lang.String, int, com.yhchat.canarys.data.model.StickerItem, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: sendPostMessage-eH_QyT8$default */
    public static /* synthetic */ Object m8606sendPostMessageeH_QyT8$default(MessageRepository messageRepository, String str, int i, String str2, String str3, String str4, String str5, String str6, Continuation continuation, int i2, Object obj) {
        String str7;
        if ((i2 & 64) == 0) {
            str7 = str6;
        } else {
            str7 = null;
        }
        return messageRepository.m8620sendPostMessageeH_QyT8(str, i, str2, str3, str4, str5, str7, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0133 A[Catch: Exception -> 0x0119, TRY_LEAVE, TryCatch #11 {Exception -> 0x0119, blocks: (B:202:0x0114, B:209:0x0127, B:215:0x0133), top: B:305:0x0114 }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x014e A[Catch: Exception -> 0x03bc, TRY_ENTER, TRY_LEAVE, TryCatch #8 {Exception -> 0x03bc, blocks: (B:200:0x0110, B:207:0x0122, B:217:0x014e), top: B:299:0x0110 }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0229 A[Catch: Exception -> 0x0303, TRY_LEAVE, TryCatch #15 {Exception -> 0x0303, blocks: (B:241:0x02eb, B:223:0x021d, B:229:0x0229), top: B:313:0x021d }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02ca A[Catch: Exception -> 0x03b3, TryCatch #5 {Exception -> 0x03b3, blocks: (B:234:0x02c2, B:236:0x02ca, B:238:0x02d2, B:245:0x0308, B:221:0x0203, B:230:0x022c), top: B:294:0x0203 }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0363 A[Catch: Exception -> 0x03b1, TRY_LEAVE, TryCatch #7 {Exception -> 0x03b1, blocks: (B:247:0x0314, B:249:0x0347, B:250:0x0363), top: B:298:0x02c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0114 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: sendPostMessage-eH_QyT8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8620sendPostMessageeH_QyT8(java.lang.String r27, int r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r34) {
        /*
            Method dump skipped, instructions count: 1044
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.MessageRepository.m8620sendPostMessageeH_QyT8(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final ChatMessage convertProtoToMessage(Msg protoMsg, String str, int i) {
        MessageCmd cmd;
        String chatId = protoMsg.getSender().getChatId();
        Intrinsics.checkNotNullExpressionValue(chatId, "getChatId(...)");
        int chatType = protoMsg.getSender().getChatType();
        String name = protoMsg.getSender().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        String avatarUrl = protoMsg.getSender().getAvatarUrl();
        Intrinsics.checkNotNullExpressionValue(avatarUrl, "getAvatarUrl(...)");
        List<String> tagOldList = protoMsg.getSender().getTagOldList();
        Iterable tagList = protoMsg.getSender().getTagList();
        Intrinsics.checkNotNullExpressionValue(tagList, "getTagList(...)");
        Iterable<Tag> iterable = tagList;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (Tag tag : iterable) {
            String str2 = chatId;
            long id = tag.getId();
            String str3 = name;
            String text = tag.getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            String color = tag.getColor();
            Intrinsics.checkNotNullExpressionValue(color, "getColor(...)");
            arrayList.add(new MessageTag(id, text, color));
            iterable = iterable;
            chatId = str2;
            chatType = chatType;
            name = str3;
            avatarUrl = avatarUrl;
        }
        MessageSender sender = new MessageSender(chatId, chatType, name, avatarUrl, tagOldList, (List) arrayList);
        String text2 = protoMsg.getContent().getText();
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        String text3 = text2.length() > 0 ? protoMsg.getContent().getText() : null;
        String buttons = protoMsg.getContent().getButtons();
        Intrinsics.checkNotNullExpressionValue(buttons, "getButtons(...)");
        String buttons2 = buttons.length() > 0 ? protoMsg.getContent().getButtons() : null;
        String imageUrl = protoMsg.getContent().getImageUrl();
        Intrinsics.checkNotNullExpressionValue(imageUrl, "getImageUrl(...)");
        String imageUrl2 = imageUrl.length() > 0 ? protoMsg.getContent().getImageUrl() : null;
        String fileName = protoMsg.getContent().getFileName();
        Intrinsics.checkNotNullExpressionValue(fileName, "getFileName(...)");
        String fileName2 = fileName.length() > 0 ? protoMsg.getContent().getFileName() : null;
        String fileUrl = protoMsg.getContent().getFileUrl();
        Intrinsics.checkNotNullExpressionValue(fileUrl, "getFileUrl(...)");
        String fileUrl2 = fileUrl.length() > 0 ? protoMsg.getContent().getFileUrl() : null;
        String form = protoMsg.getContent().getForm();
        Intrinsics.checkNotNullExpressionValue(form, "getForm(...)");
        String form2 = form.length() > 0 ? protoMsg.getContent().getForm() : null;
        String quoteMsgText = protoMsg.getContent().getQuoteMsgText();
        Intrinsics.checkNotNullExpressionValue(quoteMsgText, "getQuoteMsgText(...)");
        String quoteMsgText2 = quoteMsgText.length() > 0 ? protoMsg.getContent().getQuoteMsgText() : null;
        String stickerUrl = protoMsg.getContent().getStickerUrl();
        Intrinsics.checkNotNullExpressionValue(stickerUrl, "getStickerUrl(...)");
        String stickerUrl2 = stickerUrl.length() > 0 ? protoMsg.getContent().getStickerUrl() : null;
        String postId = protoMsg.getContent().getPostId();
        Intrinsics.checkNotNullExpressionValue(postId, "getPostId(...)");
        String postId2 = postId.length() > 0 ? protoMsg.getContent().getPostId() : null;
        String postTitle = protoMsg.getContent().getPostTitle();
        Intrinsics.checkNotNullExpressionValue(postTitle, "getPostTitle(...)");
        String postTitle2 = postTitle.length() > 0 ? protoMsg.getContent().getPostTitle() : null;
        String postContent = protoMsg.getContent().getPostContent();
        Intrinsics.checkNotNullExpressionValue(postContent, "getPostContent(...)");
        String postContent2 = postContent.length() > 0 ? protoMsg.getContent().getPostContent() : null;
        String postContentType = protoMsg.getContent().getPostContentType();
        Intrinsics.checkNotNullExpressionValue(postContentType, "getPostContentType(...)");
        String postContentType2 = postContentType.length() > 0 ? protoMsg.getContent().getPostContentType() : null;
        String expressionId = protoMsg.getContent().getExpressionId();
        Intrinsics.checkNotNullExpressionValue(expressionId, "getExpressionId(...)");
        String expressionId2 = expressionId.length() > 0 ? protoMsg.getContent().getExpressionId() : null;
        Long lValueOf = protoMsg.getContent().getFileSize() > 0 ? Long.valueOf(protoMsg.getContent().getFileSize()) : null;
        String videoUrl = protoMsg.getContent().getVideoUrl();
        Intrinsics.checkNotNullExpressionValue(videoUrl, "getVideoUrl(...)");
        String videoUrl2 = videoUrl.length() > 0 ? protoMsg.getContent().getVideoUrl() : null;
        String audioUrl = protoMsg.getContent().getAudioUrl();
        Intrinsics.checkNotNullExpressionValue(audioUrl, "getAudioUrl(...)");
        String audioUrl2 = audioUrl.length() > 0 ? protoMsg.getContent().getAudioUrl() : null;
        Long lValueOf2 = protoMsg.getContent().getAudioTime() > 0 ? Long.valueOf(protoMsg.getContent().getAudioTime()) : null;
        Long lValueOf3 = protoMsg.getContent().getStickerItemId() > 0 ? Long.valueOf(protoMsg.getContent().getStickerItemId()) : null;
        Long lValueOf4 = protoMsg.getContent().getStickerPackId() > 0 ? Long.valueOf(protoMsg.getContent().getStickerPackId()) : null;
        String callText = protoMsg.getContent().getCallText();
        Intrinsics.checkNotNullExpressionValue(callText, "getCallText(...)");
        String callText2 = callText.length() > 0 ? protoMsg.getContent().getCallText() : null;
        String callStatusText = protoMsg.getContent().getCallStatusText();
        Intrinsics.checkNotNullExpressionValue(callStatusText, "getCallStatusText(...)");
        MessageContent content = new MessageContent(text3, buttons2, imageUrl2, fileName2, fileUrl2, form2, quoteMsgText2, null, stickerUrl2, postId2, postTitle2, postContent2, postContentType2, expressionId2, lValueOf, videoUrl2, audioUrl2, lValueOf2, lValueOf3, lValueOf4, callText2, callStatusText.length() > 0 ? protoMsg.getContent().getCallStatusText() : null, protoMsg.getContent().getWidth() > 0 ? Long.valueOf(protoMsg.getContent().getWidth()) : null, protoMsg.getContent().getHeight() > 0 ? Long.valueOf(protoMsg.getContent().getHeight()) : null);
        if (protoMsg.hasCmd()) {
            String name2 = protoMsg.getCmd().getName();
            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
            cmd = new MessageCmd(name2, protoMsg.getCmd().getType());
        } else {
            cmd = null;
        }
        String msgId = protoMsg.getMsgId();
        Intrinsics.checkNotNullExpressionValue(msgId, "getMsgId(...)");
        String direction = protoMsg.getDirection();
        Intrinsics.checkNotNullExpressionValue(direction, "getDirection(...)");
        int contentType = protoMsg.getContentType();
        long sendTime = protoMsg.getSendTime();
        Long lValueOf5 = protoMsg.getMsgDeleteTime() > 0 ? Long.valueOf(protoMsg.getMsgDeleteTime()) : null;
        String quoteMsgId = protoMsg.getQuoteMsgId();
        Intrinsics.checkNotNullExpressionValue(quoteMsgId, "getQuoteMsgId(...)");
        return new ChatMessage(msgId, sender, direction, contentType, content, sendTime, cmd, lValueOf5, quoteMsgId.length() > 0 ? protoMsg.getQuoteMsgId() : null, Long.valueOf(protoMsg.getMsgSeq()), protoMsg.getEditTime() > 0 ? Long.valueOf(protoMsg.getEditTime()) : null, str, Integer.valueOf(i), null, 8192, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getMessageById(java.lang.String r7, kotlin.coroutines.Continuation<? super com.yhchat.canarys.data.model.ChatMessage> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.yhchat.canarys.data.repository.MessageRepository.C30411
            if (r0 == 0) goto L14
            r0 = r8
            com.yhchat.canarys.data.repository.MessageRepository$getMessageById$1 r0 = (com.yhchat.canarys.data.repository.MessageRepository.C30411) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.MessageRepository$getMessageById$1 r0 = new com.yhchat.canarys.data.repository.MessageRepository$getMessageById$1
            r0.<init>(r8)
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
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> L4b
            r3 = r1
            goto L48
        L36:
            kotlin.ResultKt.throwOnFailure(r1)
            com.yhchat.canarys.data.repository.CacheRepository r3 = r6.cacheRepository     // Catch: java.lang.Exception -> L4b
            r0.L$0 = r7     // Catch: java.lang.Exception -> L4b
            r4 = 1
            r0.label = r4     // Catch: java.lang.Exception -> L4b
            java.lang.Object r3 = r3.getMessageById(r7, r0)     // Catch: java.lang.Exception -> L4b
            if (r3 != r2) goto L48
            return r2
        L48:
            com.yhchat.canarys.data.model.ChatMessage r3 = (com.yhchat.canarys.data.model.ChatMessage) r3     // Catch: java.lang.Exception -> L4b
            goto L68
        L4b:
            r2 = move-exception
            java.lang.String r3 = r6.tag
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Error getting message by id: "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r7)
            java.lang.String r4 = r4.toString()
            r5 = r2
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            android.util.Log.e(r3, r4, r5)
            r3 = 0
        L68:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.MessageRepository.getMessageById(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00c7 A[Catch: Exception -> 0x00ac, TRY_LEAVE, TryCatch #5 {Exception -> 0x00ac, blocks: (B:152:0x00a7, B:159:0x00bb, B:165:0x00c7), top: B:219:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00cf A[Catch: Exception -> 0x02a6, TRY_ENTER, TRY_LEAVE, TryCatch #8 {Exception -> 0x02a6, blocks: (B:150:0x00a3, B:157:0x00b6, B:167:0x00cf), top: B:225:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0173 A[Catch: Exception -> 0x02a0, TryCatch #1 {Exception -> 0x02a0, blocks: (B:171:0x016b, B:173:0x0173, B:175:0x017b), top: B:212:0x016b }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0279 A[Catch: Exception -> 0x029e, TRY_LEAVE, TryCatch #4 {Exception -> 0x029e, blocks: (B:179:0x01a0, B:181:0x01d7, B:183:0x01e1, B:184:0x01fb, B:185:0x0249, B:191:0x0279), top: B:218:0x0171 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getMessageByIdFromApi(java.lang.String r22, java.lang.String r23, int r24, kotlin.coroutines.Continuation<? super com.yhchat.canarys.data.model.ChatMessage> r25) {
        /*
            Method dump skipped, instructions count: 772
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.MessageRepository.getMessageByIdFromApi(java.lang.String, java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object insertMessage(com.yhchat.canarys.data.model.ChatMessage r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.yhchat.canarys.data.repository.MessageRepository.C30431
            if (r0 == 0) goto L14
            r0 = r9
            com.yhchat.canarys.data.repository.MessageRepository$insertMessage$1 r0 = (com.yhchat.canarys.data.repository.MessageRepository.C30431) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.MessageRepository$insertMessage$1 r0 = new com.yhchat.canarys.data.repository.MessageRepository$insertMessage$1
            r0.<init>(r9)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L35;
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
            r8 = r2
            com.yhchat.canarys.data.model.ChatMessage r8 = (com.yhchat.canarys.data.model.ChatMessage) r8
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> L68
            goto L4b
        L35:
            kotlin.ResultKt.throwOnFailure(r1)
            com.yhchat.canarys.data.repository.CacheRepository r3 = r7.cacheRepository     // Catch: java.lang.Exception -> L68
            java.util.List r4 = kotlin.collections.CollectionsKt.listOf(r8)     // Catch: java.lang.Exception -> L68
            r0.L$0 = r8     // Catch: java.lang.Exception -> L68
            r5 = 1
            r0.label = r5     // Catch: java.lang.Exception -> L68
            java.lang.Object r3 = r3.cacheMessages(r4, r0)     // Catch: java.lang.Exception -> L68
            if (r3 != r2) goto L4b
            return r2
        L4b:
            java.lang.String r2 = r7.tag     // Catch: java.lang.Exception -> L68
            java.lang.String r3 = r8.getMsgId()     // Catch: java.lang.Exception -> L68
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L68
            r4.<init>()     // Catch: java.lang.Exception -> L68
            java.lang.String r5 = "Inserted message: "
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Exception -> L68
            java.lang.StringBuilder r3 = r4.append(r3)     // Catch: java.lang.Exception -> L68
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L68
            android.util.Log.d(r2, r3)     // Catch: java.lang.Exception -> L68
            goto L88
        L68:
            r2 = move-exception
            java.lang.String r3 = r7.tag
            java.lang.String r4 = r8.getMsgId()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Error inserting message: "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r4 = r4.toString()
            r5 = r2
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            android.util.Log.e(r3, r4, r5)
        L88:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.MessageRepository.insertMessage(com.yhchat.canarys.data.model.ChatMessage, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0065 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object updateMessage(com.yhchat.canarys.data.model.ChatMessage r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.yhchat.canarys.data.repository.MessageRepository.C30441
            if (r0 == 0) goto L14
            r0 = r9
            com.yhchat.canarys.data.repository.MessageRepository$updateMessage$1 r0 = (com.yhchat.canarys.data.repository.MessageRepository.C30441) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.MessageRepository$updateMessage$1 r0 = new com.yhchat.canarys.data.repository.MessageRepository$updateMessage$1
            r0.<init>(r9)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L3e;
                case 1: goto L35;
                case 2: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            java.lang.Object r2 = r0.L$0
            r8 = r2
            com.yhchat.canarys.data.model.ChatMessage r8 = (com.yhchat.canarys.data.model.ChatMessage) r8
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> L83
            goto L66
        L35:
            java.lang.Object r3 = r0.L$0
            r8 = r3
            com.yhchat.canarys.data.model.ChatMessage r8 = (com.yhchat.canarys.data.model.ChatMessage) r8
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> L83
            goto L54
        L3e:
            kotlin.ResultKt.throwOnFailure(r1)
            com.yhchat.canarys.data.repository.CacheRepository r3 = r7.cacheRepository     // Catch: java.lang.Exception -> L83
            java.lang.String r4 = r8.getMsgId()     // Catch: java.lang.Exception -> L83
            r0.L$0 = r8     // Catch: java.lang.Exception -> L83
            r5 = 1
            r0.label = r5     // Catch: java.lang.Exception -> L83
            java.lang.Object r3 = r3.deleteMessage(r4, r0)     // Catch: java.lang.Exception -> L83
            if (r3 != r2) goto L54
            return r2
        L54:
            com.yhchat.canarys.data.repository.CacheRepository r3 = r7.cacheRepository     // Catch: java.lang.Exception -> L83
            java.util.List r4 = kotlin.collections.CollectionsKt.listOf(r8)     // Catch: java.lang.Exception -> L83
            r0.L$0 = r8     // Catch: java.lang.Exception -> L83
            r5 = 2
            r0.label = r5     // Catch: java.lang.Exception -> L83
            java.lang.Object r3 = r3.cacheMessages(r4, r0)     // Catch: java.lang.Exception -> L83
            if (r3 != r2) goto L66
            return r2
        L66:
            java.lang.String r2 = r7.tag     // Catch: java.lang.Exception -> L83
            java.lang.String r3 = r8.getMsgId()     // Catch: java.lang.Exception -> L83
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L83
            r4.<init>()     // Catch: java.lang.Exception -> L83
            java.lang.String r5 = "Updated message: "
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Exception -> L83
            java.lang.StringBuilder r3 = r4.append(r3)     // Catch: java.lang.Exception -> L83
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L83
            android.util.Log.d(r2, r3)     // Catch: java.lang.Exception -> L83
            goto La3
        L83:
            r2 = move-exception
            java.lang.String r3 = r7.tag
            java.lang.String r4 = r8.getMsgId()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Error updating message: "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r4 = r4.toString()
            r5 = r2
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            android.util.Log.e(r3, r4, r5)
        La3:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.MessageRepository.updateMessage(com.yhchat.canarys.data.model.ChatMessage, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object deleteMessage(java.lang.String r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.yhchat.canarys.data.repository.MessageRepository.C30391
            if (r0 == 0) goto L14
            r0 = r8
            com.yhchat.canarys.data.repository.MessageRepository$deleteMessage$1 r0 = (com.yhchat.canarys.data.repository.MessageRepository.C30391) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.MessageRepository$deleteMessage$1 r0 = new com.yhchat.canarys.data.repository.MessageRepository$deleteMessage$1
            r0.<init>(r8)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L35;
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
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> L60
            goto L47
        L35:
            kotlin.ResultKt.throwOnFailure(r1)
            com.yhchat.canarys.data.repository.CacheRepository r3 = r6.cacheRepository     // Catch: java.lang.Exception -> L60
            r0.L$0 = r7     // Catch: java.lang.Exception -> L60
            r4 = 1
            r0.label = r4     // Catch: java.lang.Exception -> L60
            java.lang.Object r3 = r3.deleteMessage(r7, r0)     // Catch: java.lang.Exception -> L60
            if (r3 != r2) goto L47
            return r2
        L47:
            java.lang.String r2 = r6.tag     // Catch: java.lang.Exception -> L60
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L60
            r3.<init>()     // Catch: java.lang.Exception -> L60
            java.lang.String r4 = "Deleted message: "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Exception -> L60
            java.lang.StringBuilder r3 = r3.append(r7)     // Catch: java.lang.Exception -> L60
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L60
            android.util.Log.d(r2, r3)     // Catch: java.lang.Exception -> L60
            goto L7c
        L60:
            r2 = move-exception
            java.lang.String r3 = r6.tag
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Error deleting message: "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r7)
            java.lang.String r4 = r4.toString()
            r5 = r2
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            android.util.Log.e(r3, r4, r5)
        L7c:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.MessageRepository.deleteMessage(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getLastMessage(java.lang.String r7, int r8, kotlin.coroutines.Continuation<? super com.yhchat.canarys.data.model.ChatMessage> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.yhchat.canarys.data.repository.MessageRepository.C30401
            if (r0 == 0) goto L14
            r0 = r9
            com.yhchat.canarys.data.repository.MessageRepository$getLastMessage$1 r0 = (com.yhchat.canarys.data.repository.MessageRepository.C30401) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.MessageRepository$getLastMessage$1 r0 = new com.yhchat.canarys.data.repository.MessageRepository$getLastMessage$1
            r0.<init>(r9)
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
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> L4f
            r3 = r1
            goto L4c
        L38:
            kotlin.ResultKt.throwOnFailure(r1)
            com.yhchat.canarys.data.repository.CacheRepository r3 = r6.cacheRepository     // Catch: java.lang.Exception -> L4f
            r0.L$0 = r7     // Catch: java.lang.Exception -> L4f
            r0.I$0 = r8     // Catch: java.lang.Exception -> L4f
            r4 = 1
            r0.label = r4     // Catch: java.lang.Exception -> L4f
            java.lang.Object r3 = r3.getLastMessage(r7, r8, r0)     // Catch: java.lang.Exception -> L4f
            if (r3 != r2) goto L4c
            return r2
        L4c:
            com.yhchat.canarys.data.model.ChatMessage r3 = (com.yhchat.canarys.data.model.ChatMessage) r3     // Catch: java.lang.Exception -> L4f
            goto L6c
        L4f:
            r2 = move-exception
            java.lang.String r3 = r6.tag
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Error getting last message for chat: "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r7)
            java.lang.String r4 = r4.toString()
            r5 = r2
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            android.util.Log.e(r3, r4, r5)
            r3 = 0
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.MessageRepository.getLastMessage(java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00d0 A[Catch: Exception -> 0x008d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x008d, blocks: (B:149:0x0088, B:170:0x00d0, B:175:0x00db, B:181:0x00e7), top: B:240:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00e7 A[Catch: Exception -> 0x008d, TRY_LEAVE, TryCatch #2 {Exception -> 0x008d, blocks: (B:149:0x0088, B:170:0x00d0, B:175:0x00db, B:181:0x00e7), top: B:240:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0102 A[Catch: Exception -> 0x02da, TRY_ENTER, TryCatch #6 {Exception -> 0x02da, blocks: (B:168:0x00cc, B:173:0x00d6, B:183:0x0102, B:184:0x0141, B:185:0x0144, B:191:0x0150, B:192:0x0167), top: B:248:0x00cc }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x01f0 A[Catch: Exception -> 0x02d5, TryCatch #8 {Exception -> 0x02d5, blocks: (B:198:0x01e8, B:200:0x01f0, B:202:0x01f8, B:209:0x0229, B:194:0x0171), top: B:252:0x0171 }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0284 A[Catch: Exception -> 0x02d2, TRY_LEAVE, TryCatch #10 {Exception -> 0x02d2, blocks: (B:211:0x0235, B:213:0x0268, B:214:0x0284), top: B:256:0x01ee }] */
    /* renamed from: reportButtonClick-hUnOzRk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8615reportButtonClickhUnOzRk(java.lang.String r23, int r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>> r28) {
        /*
            Method dump skipped, instructions count: 880
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.MessageRepository.m8615reportButtonClickhUnOzRk(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0088 A[Catch: Exception -> 0x0063, TryCatch #2 {Exception -> 0x0063, blocks: (B:127:0x0104, B:130:0x010e, B:132:0x0116, B:134:0x0124, B:135:0x0145, B:137:0x016e, B:138:0x0184, B:96:0x005d, B:107:0x0084, B:109:0x0088, B:111:0x008e, B:113:0x0093, B:119:0x009f, B:121:0x00ba, B:123:0x00c0, B:140:0x01c9), top: B:152:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x009f A[Catch: Exception -> 0x0063, TryCatch #2 {Exception -> 0x0063, blocks: (B:127:0x0104, B:130:0x010e, B:132:0x0116, B:134:0x0124, B:135:0x0145, B:137:0x016e, B:138:0x0184, B:96:0x005d, B:107:0x0084, B:109:0x0088, B:111:0x008e, B:113:0x0093, B:119:0x009f, B:121:0x00ba, B:123:0x00c0, B:140:0x01c9), top: B:152:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00ba A[Catch: Exception -> 0x0063, TryCatch #2 {Exception -> 0x0063, blocks: (B:127:0x0104, B:130:0x010e, B:132:0x0116, B:134:0x0124, B:135:0x0145, B:137:0x016e, B:138:0x0184, B:96:0x005d, B:107:0x0084, B:109:0x0088, B:111:0x008e, B:113:0x0093, B:119:0x009f, B:121:0x00ba, B:123:0x00c0, B:140:0x01c9), top: B:152:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x010e A[Catch: Exception -> 0x0063, TRY_ENTER, TryCatch #2 {Exception -> 0x0063, blocks: (B:127:0x0104, B:130:0x010e, B:132:0x0116, B:134:0x0124, B:135:0x0145, B:137:0x016e, B:138:0x0184, B:96:0x005d, B:107:0x0084, B:109:0x0088, B:111:0x008e, B:113:0x0093, B:119:0x009f, B:121:0x00ba, B:123:0x00c0, B:140:0x01c9), top: B:152:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0184 A[Catch: Exception -> 0x0063, TryCatch #2 {Exception -> 0x0063, blocks: (B:127:0x0104, B:130:0x010e, B:132:0x0116, B:134:0x0124, B:135:0x0145, B:137:0x016e, B:138:0x0184, B:96:0x005d, B:107:0x0084, B:109:0x0088, B:111:0x008e, B:113:0x0093, B:119:0x009f, B:121:0x00ba, B:123:0x00c0, B:140:0x01c9), top: B:152:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0018  */
    /* renamed from: addExpressionToFavorites-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8609addExpressionToFavoritesgIAlus(java.lang.String r19, kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>> r20) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.MessageRepository.m8609addExpressionToFavoritesgIAlus(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: getMessageEditHistory-BWLJW6A$default */
    public static /* synthetic */ Object m8599getMessageEditHistoryBWLJW6A$default(MessageRepository messageRepository, String str, int i, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 10;
        }
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        return messageRepository.m8611getMessageEditHistoryBWLJW6A(str, i, i2, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x00bf A[Catch: Exception -> 0x00a5, TRY_LEAVE, TryCatch #11 {Exception -> 0x00a5, blocks: (B:247:0x00a0, B:254:0x00b3, B:260:0x00bf), top: B:414:0x00a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x00da A[Catch: Exception -> 0x03a4, TRY_ENTER, TRY_LEAVE, TryCatch #12 {Exception -> 0x03a4, blocks: (B:245:0x009c, B:252:0x00ae, B:262:0x00da), top: B:416:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x012f A[Catch: Exception -> 0x039a, TryCatch #10 {Exception -> 0x039a, blocks: (B:266:0x0127, B:268:0x012f, B:270:0x0137), top: B:412:0x0127 }] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0346 A[Catch: Exception -> 0x0396, TRY_LEAVE, TryCatch #4 {Exception -> 0x0396, blocks: (B:356:0x027c, B:316:0x01df, B:318:0x01e9, B:320:0x01f5, B:326:0x01fe, B:328:0x020a, B:331:0x0210, B:333:0x0219, B:335:0x0225, B:340:0x022e, B:342:0x0238, B:345:0x023e, B:347:0x024a, B:349:0x0256, B:352:0x025c, B:354:0x0268, B:361:0x029a, B:363:0x02b2, B:362:0x02a8, B:364:0x02dc, B:366:0x02ec, B:370:0x02f5, B:374:0x032a, B:375:0x0346), top: B:401:0x012d }] */
    /* JADX WARN: Removed duplicated region for block: B:414:0x00a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* renamed from: getMessageEditHistory-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8611getMessageEditHistoryBWLJW6A(java.lang.String r44, int r45, int r46, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<com.yhchat.canarys.data.model.MessageEditRecord>>> r47) {
        /*
            Method dump skipped, instructions count: 1018
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.MessageRepository.m8611getMessageEditHistoryBWLJW6A(java.lang.String, int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
