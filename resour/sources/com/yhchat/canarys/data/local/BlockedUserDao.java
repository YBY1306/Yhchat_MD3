package com.yhchat.canarys.data.local;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* compiled from: BlockedUserDao.kt */
@Metadata(m168d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H'J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00a7@\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0011J\u001c\u0010\u0012\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00a7@\u00a2\u0006\u0002\u0010\u0014J\u0016\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0011J\u0016\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0011J\u0016\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\u0018\u001a\u00020\u000fH\u00a7@\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\u0019\u001a\u00020\u001aH\u00a7@\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\u001b\u00c0\u0006\u0003"}, m169d2 = {"Lcom/yhchat/canarys/data/local/BlockedUserDao;", "", "getAllBlockedUsers", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/yhchat/canarys/data/local/BlockedUser;", "getAllBlockedUsersSync", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBlockedUser", "userId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isUserBlocked", "", "insertBlockedUser", "", "user", "(Lcom/yhchat/canarys/data/local/BlockedUser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertBlockedUsers", "users", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateBlockedUser", "deleteBlockedUser", "deleteBlockedUserById", "clearAllBlockedUsers", "getBlockedUsersCount", "", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes7.dex */
public interface BlockedUserDao {
    Object clearAllBlockedUsers(Continuation<? super Unit> continuation);

    Object deleteBlockedUser(BlockedUser blockedUser, Continuation<? super Unit> continuation);

    Object deleteBlockedUserById(String str, Continuation<? super Unit> continuation);

    Flow<List<BlockedUser>> getAllBlockedUsers();

    Object getAllBlockedUsersSync(Continuation<? super List<BlockedUser>> continuation);

    Object getBlockedUser(String str, Continuation<? super BlockedUser> continuation);

    Object getBlockedUsersCount(Continuation<? super Integer> continuation);

    Object insertBlockedUser(BlockedUser blockedUser, Continuation<? super Unit> continuation);

    Object insertBlockedUsers(List<BlockedUser> list, Continuation<? super Unit> continuation);

    Object isUserBlocked(String str, Continuation<? super Boolean> continuation);

    Object updateBlockedUser(BlockedUser blockedUser, Continuation<? super Unit> continuation);
}
