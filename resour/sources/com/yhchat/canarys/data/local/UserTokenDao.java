package com.yhchat.canarys.data.local;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* compiled from: UserTokenDao.kt */
@Metadata(m168d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H'J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\f\u001a\u00020\bH\u00a7@\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\r\u00c0\u0006\u0003"}, m169d2 = {"Lcom/yhchat/canarys/data/local/UserTokenDao;", "", "getToken", "Lkotlinx/coroutines/flow/Flow;", "Lcom/yhchat/canarys/data/local/UserToken;", "getTokenSync", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertToken", "", "token", "(Lcom/yhchat/canarys/data/local/UserToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteToken", "clearTokens", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes7.dex */
public interface UserTokenDao {
    Object clearTokens(Continuation<? super Unit> continuation);

    Object deleteToken(UserToken userToken, Continuation<? super Unit> continuation);

    Flow<UserToken> getToken();

    Object getTokenSync(Continuation<? super UserToken> continuation);

    Object insertToken(UserToken userToken, Continuation<? super Unit> continuation);
}
