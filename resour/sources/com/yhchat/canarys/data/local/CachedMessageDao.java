package com.yhchat.canarys.data.local;

import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* compiled from: CachedMessageDao.kt */
@Metadata(m168d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0012\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H'J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\tJ.\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u00a7@\u00a2\u0006\u0002\u0010\u000fJ\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\tJ\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0016J\u001c\u0010\u0017\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00a7@\u00a2\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0016J\u0016\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0016J\u0016\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\tJ\u0016\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\u001d\u001a\u00020\u0014H\u00a7@\u00a2\u0006\u0002\u0010\u001eJ\u0016\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\tJ\u0016\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\fH\u00a7@\u00a2\u0006\u0002\u0010\"J \u0010#\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u000eH\u00a7@\u00a2\u0006\u0002\u0010%\u00a8\u0006&\u00c0\u0006\u0003"}, m169d2 = {"Lcom/yhchat/canarys/data/local/CachedMessageDao;", "", "getMessages", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/yhchat/canarys/data/local/CachedMessage;", ChatSearchActivity.EXTRA_CHAT_ID, "", "getMessagesSync", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMessagesBySeq", "msgSeq", "", "limit", "", "(Ljava/lang/String;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMessage", "msgId", "getMessageById", "insertMessage", "", "message", "(Lcom/yhchat/canarys/data/local/CachedMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertMessages", "messages", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateMessage", "deleteMessage", "clearChatMessages", "clearAllMessages", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMessageCount", "deleteOldMessages", "timestamp", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLastMessage", ChatSearchActivity.EXTRA_CHAT_TYPE, "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes7.dex */
public interface CachedMessageDao {
    Object clearAllMessages(Continuation<? super Unit> continuation);

    Object clearChatMessages(String str, Continuation<? super Unit> continuation);

    Object deleteMessage(CachedMessage cachedMessage, Continuation<? super Unit> continuation);

    Object deleteMessage(String str, Continuation<? super Unit> continuation);

    Object deleteOldMessages(long j, Continuation<? super Unit> continuation);

    Object getLastMessage(String str, int i, Continuation<? super CachedMessage> continuation);

    Object getMessage(String str, Continuation<? super CachedMessage> continuation);

    Object getMessageById(String str, Continuation<? super CachedMessage> continuation);

    Object getMessageCount(String str, Continuation<? super Integer> continuation);

    Flow<List<CachedMessage>> getMessages(String chatId);

    Object getMessagesBySeq(String str, long j, int i, Continuation<? super List<CachedMessage>> continuation);

    Object getMessagesSync(String str, Continuation<? super List<CachedMessage>> continuation);

    Object insertMessage(CachedMessage cachedMessage, Continuation<? super Unit> continuation);

    Object insertMessages(List<CachedMessage> list, Continuation<? super Unit> continuation);

    Object updateMessage(CachedMessage cachedMessage, Continuation<? super Unit> continuation);

    /* compiled from: CachedMessageDao.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object getMessagesBySeq$default(CachedMessageDao cachedMessageDao, String str, long j, int i, Continuation continuation, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMessagesBySeq");
        }
        if ((i2 & 4) != 0) {
            i = 50;
        }
        return cachedMessageDao.getMessagesBySeq(str, j, i, continuation);
    }
}
