package com.yhchat.canarys.data.local;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
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

/* compiled from: BlockedUserDao_Impl.kt */
@Metadata(m168d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0096@\u00a2\u0006\u0002\u0010\u000fJ\u001c\u0010\u0010\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0012H\u0096@\u00a2\u0006\u0002\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0096@\u00a2\u0006\u0002\u0010\u000fJ\u0016\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0096@\u00a2\u0006\u0002\u0010\u000fJ\u0014\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00120\u0017H\u0016J\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0012H\u0096@\u00a2\u0006\u0002\u0010\u0019J\u0018\u0010\u001a\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001b\u001a\u00020\u001cH\u0096@\u00a2\u0006\u0002\u0010\u001dJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0096@\u00a2\u0006\u0002\u0010\u001dJ\u000e\u0010 \u001a\u00020!H\u0096@\u00a2\u0006\u0002\u0010\u0019J\u0016\u0010\"\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001cH\u0096@\u00a2\u0006\u0002\u0010\u001dJ\u000e\u0010#\u001a\u00020\rH\u0096@\u00a2\u0006\u0002\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, m169d2 = {"Lcom/yhchat/canarys/data/local/BlockedUserDao_Impl;", "Lcom/yhchat/canarys/data/local/BlockedUserDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfBlockedUser", "Landroidx/room/EntityInsertAdapter;", "Lcom/yhchat/canarys/data/local/BlockedUser;", "__deleteAdapterOfBlockedUser", "Landroidx/room/EntityDeleteOrUpdateAdapter;", "__updateAdapterOfBlockedUser", "insertBlockedUser", "", "user", "(Lcom/yhchat/canarys/data/local/BlockedUser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertBlockedUsers", "users", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteBlockedUser", "updateBlockedUser", "getAllBlockedUsers", "Lkotlinx/coroutines/flow/Flow;", "getAllBlockedUsersSync", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBlockedUser", "userId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isUserBlocked", "", "getBlockedUsersCount", "", "deleteBlockedUserById", "clearAllBlockedUsers", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes7.dex */
public final class BlockedUserDao_Impl implements BlockedUserDao {
    private final RoomDatabase __db;
    private final EntityDeleteOrUpdateAdapter<BlockedUser> __deleteAdapterOfBlockedUser;
    private final EntityInsertAdapter<BlockedUser> __insertAdapterOfBlockedUser;
    private final EntityDeleteOrUpdateAdapter<BlockedUser> __updateAdapterOfBlockedUser;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public BlockedUserDao_Impl(RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfBlockedUser = new EntityInsertAdapter<BlockedUser>() { // from class: com.yhchat.canarys.data.local.BlockedUserDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `blocked_users` (`userId`,`userName`,`reason`,`blockedTime`,`avatarUrl`) VALUES (?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, BlockedUser entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.mo8127bindText(1, entity.getUserId());
                statement.mo8127bindText(2, entity.getUserName());
                statement.mo8127bindText(3, entity.getReason());
                statement.mo8125bindLong(4, entity.getBlockedTime());
                String _tmpAvatarUrl = entity.getAvatarUrl();
                if (_tmpAvatarUrl == null) {
                    statement.mo8126bindNull(5);
                } else {
                    statement.mo8127bindText(5, _tmpAvatarUrl);
                }
            }
        };
        this.__deleteAdapterOfBlockedUser = new EntityDeleteOrUpdateAdapter<BlockedUser>() { // from class: com.yhchat.canarys.data.local.BlockedUserDao_Impl.2
            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            protected String createQuery() {
                return "DELETE FROM `blocked_users` WHERE `userId` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            public void bind(SQLiteStatement statement, BlockedUser entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.mo8127bindText(1, entity.getUserId());
            }
        };
        this.__updateAdapterOfBlockedUser = new EntityDeleteOrUpdateAdapter<BlockedUser>() { // from class: com.yhchat.canarys.data.local.BlockedUserDao_Impl.3
            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            protected String createQuery() {
                return "UPDATE OR ABORT `blocked_users` SET `userId` = ?,`userName` = ?,`reason` = ?,`blockedTime` = ?,`avatarUrl` = ? WHERE `userId` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            public void bind(SQLiteStatement statement, BlockedUser entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.mo8127bindText(1, entity.getUserId());
                statement.mo8127bindText(2, entity.getUserName());
                statement.mo8127bindText(3, entity.getReason());
                statement.mo8125bindLong(4, entity.getBlockedTime());
                String _tmpAvatarUrl = entity.getAvatarUrl();
                if (_tmpAvatarUrl == null) {
                    statement.mo8126bindNull(5);
                } else {
                    statement.mo8127bindText(5, _tmpAvatarUrl);
                }
                statement.mo8127bindText(6, entity.getUserId());
            }
        };
    }

    @Override // com.yhchat.canarys.data.local.BlockedUserDao
    public Object insertBlockedUser(final BlockedUser user, Continuation<? super Unit> continuation) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.yhchat.canarys.data.local.BlockedUserDao_Impl$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BlockedUserDao_Impl.insertBlockedUser$lambda$0(this.f$0, user, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insertBlockedUser$lambda$0(BlockedUserDao_Impl this$0, BlockedUser $user, SQLiteConnection _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        this$0.__insertAdapterOfBlockedUser.insert(_connection, (SQLiteConnection) $user);
        return Unit.INSTANCE;
    }

    @Override // com.yhchat.canarys.data.local.BlockedUserDao
    public Object insertBlockedUsers(final List<BlockedUser> list, Continuation<? super Unit> continuation) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.yhchat.canarys.data.local.BlockedUserDao_Impl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BlockedUserDao_Impl.insertBlockedUsers$lambda$0(this.f$0, list, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insertBlockedUsers$lambda$0(BlockedUserDao_Impl this$0, List $users, SQLiteConnection _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        this$0.__insertAdapterOfBlockedUser.insert(_connection, $users);
        return Unit.INSTANCE;
    }

    @Override // com.yhchat.canarys.data.local.BlockedUserDao
    public Object deleteBlockedUser(final BlockedUser user, Continuation<? super Unit> continuation) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.yhchat.canarys.data.local.BlockedUserDao_Impl$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BlockedUserDao_Impl.deleteBlockedUser$lambda$0(this.f$0, user, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteBlockedUser$lambda$0(BlockedUserDao_Impl this$0, BlockedUser $user, SQLiteConnection _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        this$0.__deleteAdapterOfBlockedUser.handle(_connection, $user);
        return Unit.INSTANCE;
    }

    @Override // com.yhchat.canarys.data.local.BlockedUserDao
    public Object updateBlockedUser(final BlockedUser user, Continuation<? super Unit> continuation) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.yhchat.canarys.data.local.BlockedUserDao_Impl$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BlockedUserDao_Impl.updateBlockedUser$lambda$0(this.f$0, user, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateBlockedUser$lambda$0(BlockedUserDao_Impl this$0, BlockedUser $user, SQLiteConnection _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        this$0.__updateAdapterOfBlockedUser.handle(_connection, $user);
        return Unit.INSTANCE;
    }

    @Override // com.yhchat.canarys.data.local.BlockedUserDao
    public Flow<List<BlockedUser>> getAllBlockedUsers() {
        final String _sql = "SELECT `blocked_users`.`userId` AS `userId`, `blocked_users`.`userName` AS `userName`, `blocked_users`.`reason` AS `reason`, `blocked_users`.`blockedTime` AS `blockedTime`, `blocked_users`.`avatarUrl` AS `avatarUrl` FROM blocked_users ORDER BY blockedTime DESC";
        return FlowUtil.createFlow(this.__db, false, new String[]{"blocked_users"}, new Function1() { // from class: com.yhchat.canarys.data.local.BlockedUserDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BlockedUserDao_Impl.getAllBlockedUsers$lambda$0(_sql, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getAllBlockedUsers$lambda$0(String $_sql, SQLiteConnection _connection) {
        String _tmpAvatarUrl;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            List _result = new ArrayList();
            while (_stmt.step()) {
                String _tmpUserId = _stmt.getText(0);
                String _tmpUserName = _stmt.getText(1);
                String _tmpReason = _stmt.getText(2);
                long _tmpBlockedTime = _stmt.getLong(3);
                if (_stmt.isNull(4)) {
                    _tmpAvatarUrl = null;
                } else {
                    String _tmpAvatarUrl2 = _stmt.getText(4);
                    _tmpAvatarUrl = _tmpAvatarUrl2;
                }
                BlockedUser _item = new BlockedUser(_tmpUserId, _tmpUserName, _tmpReason, _tmpBlockedTime, _tmpAvatarUrl);
                _result.add(_item);
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.yhchat.canarys.data.local.BlockedUserDao
    public Object getAllBlockedUsersSync(Continuation<? super List<BlockedUser>> continuation) {
        final String _sql = "SELECT `blocked_users`.`userId` AS `userId`, `blocked_users`.`userName` AS `userName`, `blocked_users`.`reason` AS `reason`, `blocked_users`.`blockedTime` AS `blockedTime`, `blocked_users`.`avatarUrl` AS `avatarUrl` FROM blocked_users ORDER BY blockedTime DESC";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.yhchat.canarys.data.local.BlockedUserDao_Impl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BlockedUserDao_Impl.getAllBlockedUsersSync$lambda$0(_sql, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getAllBlockedUsersSync$lambda$0(String $_sql, SQLiteConnection _connection) {
        String _tmpAvatarUrl;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            List _result = new ArrayList();
            while (_stmt.step()) {
                String _tmpUserId = _stmt.getText(0);
                String _tmpUserName = _stmt.getText(1);
                String _tmpReason = _stmt.getText(2);
                long _tmpBlockedTime = _stmt.getLong(3);
                if (_stmt.isNull(4)) {
                    _tmpAvatarUrl = null;
                } else {
                    String _tmpAvatarUrl2 = _stmt.getText(4);
                    _tmpAvatarUrl = _tmpAvatarUrl2;
                }
                BlockedUser _item = new BlockedUser(_tmpUserId, _tmpUserName, _tmpReason, _tmpBlockedTime, _tmpAvatarUrl);
                _result.add(_item);
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.yhchat.canarys.data.local.BlockedUserDao
    public Object getBlockedUser(final String userId, Continuation<? super BlockedUser> continuation) {
        final String _sql = "SELECT * FROM blocked_users WHERE userId = ?";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.yhchat.canarys.data.local.BlockedUserDao_Impl$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BlockedUserDao_Impl.getBlockedUser$lambda$0(_sql, userId, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BlockedUser getBlockedUser$lambda$0(String $_sql, String $userId, SQLiteConnection _connection) {
        BlockedUser _result;
        String _tmpAvatarUrl;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.mo8127bindText(1, $userId);
            int _columnIndexOfUserId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "userId");
            int _columnIndexOfUserName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "userName");
            int _columnIndexOfReason = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "reason");
            int _columnIndexOfBlockedTime = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "blockedTime");
            int _columnIndexOfAvatarUrl = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "avatarUrl");
            if (_stmt.step()) {
                String _tmpUserId = _stmt.getText(_columnIndexOfUserId);
                String _tmpUserName = _stmt.getText(_columnIndexOfUserName);
                String _tmpReason = _stmt.getText(_columnIndexOfReason);
                long _tmpBlockedTime = _stmt.getLong(_columnIndexOfBlockedTime);
                if (_stmt.isNull(_columnIndexOfAvatarUrl)) {
                    _tmpAvatarUrl = null;
                } else {
                    String _tmpAvatarUrl2 = _stmt.getText(_columnIndexOfAvatarUrl);
                    _tmpAvatarUrl = _tmpAvatarUrl2;
                }
                _result = new BlockedUser(_tmpUserId, _tmpUserName, _tmpReason, _tmpBlockedTime, _tmpAvatarUrl);
            } else {
                _result = null;
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.yhchat.canarys.data.local.BlockedUserDao
    public Object isUserBlocked(final String userId, Continuation<? super Boolean> continuation) {
        final String _sql = "SELECT EXISTS(SELECT 1 FROM blocked_users WHERE userId = ?)";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.yhchat.canarys.data.local.BlockedUserDao_Impl$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(BlockedUserDao_Impl.isUserBlocked$lambda$0(_sql, userId, (SQLiteConnection) obj));
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isUserBlocked$lambda$0(String $_sql, String $userId, SQLiteConnection _connection) {
        boolean _result;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.mo8127bindText(1, $userId);
            if (_stmt.step()) {
                _result = false;
                int _tmp = (int) _stmt.getLong(0);
                if (_tmp != 0) {
                    _result = true;
                }
            } else {
                _result = false;
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.yhchat.canarys.data.local.BlockedUserDao
    public Object getBlockedUsersCount(Continuation<? super Integer> continuation) {
        final String _sql = "SELECT COUNT(*) FROM blocked_users";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.yhchat.canarys.data.local.BlockedUserDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(BlockedUserDao_Impl.getBlockedUsersCount$lambda$0(_sql, (SQLiteConnection) obj));
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getBlockedUsersCount$lambda$0(String $_sql, SQLiteConnection _connection) {
        int _tmp;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            if (_stmt.step()) {
                _tmp = (int) _stmt.getLong(0);
            } else {
                _tmp = 0;
            }
            return _tmp;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.yhchat.canarys.data.local.BlockedUserDao
    public Object deleteBlockedUserById(final String userId, Continuation<? super Unit> continuation) {
        final String _sql = "DELETE FROM blocked_users WHERE userId = ?";
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.yhchat.canarys.data.local.BlockedUserDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BlockedUserDao_Impl.deleteBlockedUserById$lambda$0(_sql, userId, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteBlockedUserById$lambda$0(String $_sql, String $userId, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.mo8127bindText(1, $userId);
            _stmt.step();
            _stmt.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            _stmt.close();
            throw th;
        }
    }

    @Override // com.yhchat.canarys.data.local.BlockedUserDao
    public Object clearAllBlockedUsers(Continuation<? super Unit> continuation) {
        final String _sql = "DELETE FROM blocked_users";
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.yhchat.canarys.data.local.BlockedUserDao_Impl$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BlockedUserDao_Impl.clearAllBlockedUsers$lambda$0(_sql, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit clearAllBlockedUsers$lambda$0(String $_sql, SQLiteConnection _connection) {
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

    /* compiled from: BlockedUserDao_Impl.kt */
    @Metadata(m168d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005\u00a8\u0006\u0007"}, m169d2 = {"Lcom/yhchat/canarys/data/local/BlockedUserDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
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
