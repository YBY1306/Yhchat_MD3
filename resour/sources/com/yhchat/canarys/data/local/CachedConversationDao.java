package com.yhchat.canarys.data.local;

import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* compiled from: CachedConversationDao.kt */
@Metadata(m168d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H'J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00a7@\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u000fJ\u001c\u0010\u0010\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00a7@\u00a2\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u000fJ\u0016\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u000fJ\u000e\u0010\u0015\u001a\u00020\rH\u00a7@\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\u0016\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ&\u0010\u0017\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001aH\u00a7@\u00a2\u0006\u0002\u0010\u001bJ\u001e\u0010\u001c\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001eH\u00a7@\u00a2\u0006\u0002\u0010\u001f\u00a8\u0006 \u00c0\u0006\u0003"}, m169d2 = {"Lcom/yhchat/canarys/data/local/CachedConversationDao;", "", "getAllConversations", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/yhchat/canarys/data/local/CachedConversation;", "getAllConversationsSync", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getConversation", ChatSearchActivity.EXTRA_CHAT_ID, "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertConversation", "", "conversation", "(Lcom/yhchat/canarys/data/local/CachedConversation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertConversations", "conversations", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateConversation", "deleteConversation", "clearAllConversations", "markAsRead", "updateLastMessage", "lastMessage", "timestamp", "", "(Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateDoNotDisturb", "doNotDisturb", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes7.dex */
public interface CachedConversationDao {
    Object clearAllConversations(Continuation<? super Unit> continuation);

    Object deleteConversation(CachedConversation cachedConversation, Continuation<? super Unit> continuation);

    Flow<List<CachedConversation>> getAllConversations();

    Object getAllConversationsSync(Continuation<? super List<CachedConversation>> continuation);

    Object getConversation(String str, Continuation<? super CachedConversation> continuation);

    Object insertConversation(CachedConversation cachedConversation, Continuation<? super Unit> continuation);

    Object insertConversations(List<CachedConversation> list, Continuation<? super Unit> continuation);

    Object markAsRead(String str, Continuation<? super Unit> continuation);

    Object updateConversation(CachedConversation cachedConversation, Continuation<? super Unit> continuation);

    Object updateDoNotDisturb(String str, int i, Continuation<? super Unit> continuation);

    Object updateLastMessage(String str, String str2, long j, Continuation<? super Unit> continuation);
}
