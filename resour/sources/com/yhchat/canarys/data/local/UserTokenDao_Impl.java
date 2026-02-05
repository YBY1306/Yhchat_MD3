package com.yhchat.canarys.data.local;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.Flow;

/* compiled from: UserTokenDao_Impl.kt */
@Metadata(m168d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0096@\u00a2\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0096@\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0011H\u0016J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0096@\u00a2\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\u00020\fH\u0096@\u00a2\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, m169d2 = {"Lcom/yhchat/canarys/data/local/UserTokenDao_Impl;", "Lcom/yhchat/canarys/data/local/UserTokenDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfUserToken", "Landroidx/room/EntityInsertAdapter;", "Lcom/yhchat/canarys/data/local/UserToken;", "__deleteAdapterOfUserToken", "Landroidx/room/EntityDeleteOrUpdateAdapter;", "insertToken", "", "token", "(Lcom/yhchat/canarys/data/local/UserToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteToken", "getToken", "Lkotlinx/coroutines/flow/Flow;", "getTokenSync", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearTokens", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes7.dex */
public final class UserTokenDao_Impl implements UserTokenDao {
    private final RoomDatabase __db;
    private final EntityDeleteOrUpdateAdapter<UserToken> __deleteAdapterOfUserToken;
    private final EntityInsertAdapter<UserToken> __insertAdapterOfUserToken;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public UserTokenDao_Impl(RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfUserToken = new EntityInsertAdapter<UserToken>() { // from class: com.yhchat.canarys.data.local.UserTokenDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `user_tokens` (`id`,`token`,`loginTime`) VALUES (?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, UserToken entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.mo8125bindLong(1, entity.getId());
                statement.mo8127bindText(2, entity.getToken());
                statement.mo8125bindLong(3, entity.getLoginTime());
            }
        };
        this.__deleteAdapterOfUserToken = new EntityDeleteOrUpdateAdapter<UserToken>() { // from class: com.yhchat.canarys.data.local.UserTokenDao_Impl.2
            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            protected String createQuery() {
                return "DELETE FROM `user_tokens` WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            public void bind(SQLiteStatement statement, UserToken entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.mo8125bindLong(1, entity.getId());
            }
        };
    }

    @Override // com.yhchat.canarys.data.local.UserTokenDao
    public Object insertToken(final UserToken token, Continuation<? super Unit> continuation) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.yhchat.canarys.data.local.UserTokenDao_Impl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserTokenDao_Impl.insertToken$lambda$0(this.f$0, token, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insertToken$lambda$0(UserTokenDao_Impl this$0, UserToken $token, SQLiteConnection _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        this$0.__insertAdapterOfUserToken.insert(_connection, (SQLiteConnection) $token);
        return Unit.INSTANCE;
    }

    @Override // com.yhchat.canarys.data.local.UserTokenDao
    public Object deleteToken(final UserToken token, Continuation<? super Unit> continuation) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.yhchat.canarys.data.local.UserTokenDao_Impl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserTokenDao_Impl.deleteToken$lambda$0(this.f$0, token, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteToken$lambda$0(UserTokenDao_Impl this$0, UserToken $token, SQLiteConnection _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        this$0.__deleteAdapterOfUserToken.handle(_connection, $token);
        return Unit.INSTANCE;
    }

    @Override // com.yhchat.canarys.data.local.UserTokenDao
    public Flow<UserToken> getToken() {
        final String _sql = "SELECT `user_tokens`.`id` AS `id`, `user_tokens`.`token` AS `token`, `user_tokens`.`loginTime` AS `loginTime` FROM user_tokens WHERE id = 1";
        return FlowUtil.createFlow(this.__db, false, new String[]{"user_tokens"}, new Function1() { // from class: com.yhchat.canarys.data.local.UserTokenDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserTokenDao_Impl.getToken$lambda$0(_sql, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserToken getToken$lambda$0(String $_sql, SQLiteConnection _connection) {
        UserToken _result;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            if (_stmt.step()) {
                int _tmpId = (int) _stmt.getLong(0);
                String _tmpToken = _stmt.getText(1);
                long _tmpLoginTime = _stmt.getLong(2);
                _result = new UserToken(_tmpId, _tmpToken, _tmpLoginTime);
            } else {
                _result = null;
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.yhchat.canarys.data.local.UserTokenDao
    public Object getTokenSync(Continuation<? super UserToken> continuation) {
        final String _sql = "SELECT `user_tokens`.`id` AS `id`, `user_tokens`.`token` AS `token`, `user_tokens`.`loginTime` AS `loginTime` FROM user_tokens WHERE id = 1";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.yhchat.canarys.data.local.UserTokenDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserTokenDao_Impl.getTokenSync$lambda$0(_sql, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserToken getTokenSync$lambda$0(String $_sql, SQLiteConnection _connection) {
        UserToken _result;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            if (_stmt.step()) {
                int _tmpId = (int) _stmt.getLong(0);
                String _tmpToken = _stmt.getText(1);
                long _tmpLoginTime = _stmt.getLong(2);
                _result = new UserToken(_tmpId, _tmpToken, _tmpLoginTime);
            } else {
                _result = null;
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.yhchat.canarys.data.local.UserTokenDao
    public Object clearTokens(Continuation<? super Unit> continuation) {
        final String _sql = "DELETE FROM user_tokens";
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.yhchat.canarys.data.local.UserTokenDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserTokenDao_Impl.clearTokens$lambda$0(_sql, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit clearTokens$lambda$0(String $_sql, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.step();
            _stmt.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            _stmt.close();
            throw th;
        }
    }

    /* compiled from: UserTokenDao_Impl.kt */
    @Metadata(m168d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005\u00a8\u0006\u0007"}, m169d2 = {"Lcom/yhchat/canarys/data/local/UserTokenDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<KClass<?>> getRequiredConverters() {
            return CollectionsKt.emptyList();
        }
    }
}
