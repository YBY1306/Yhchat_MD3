package com.yhchat.canarys.data.local;

import androidx.autofill.HintConstants;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.yhchat.canarys.data.model.SavedAccount;
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

/* compiled from: SavedAccountDao_Impl.kt */
@Metadata(m168d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0096@\u00a2\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0096@\u00a2\u0006\u0002\u0010\u000eJ\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00120\u0011H\u0016J\u0018\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@\u00a2\u0006\u0002\u0010\u0016J\u0016\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@\u00a2\u0006\u0002\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, m169d2 = {"Lcom/yhchat/canarys/data/local/SavedAccountDao_Impl;", "Lcom/yhchat/canarys/data/local/SavedAccountDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfSavedAccount", "Landroidx/room/EntityInsertAdapter;", "Lcom/yhchat/canarys/data/model/SavedAccount;", "__deleteAdapterOfSavedAccount", "Landroidx/room/EntityDeleteOrUpdateAdapter;", "insertAccount", "", "account", "(Lcom/yhchat/canarys/data/model/SavedAccount;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAccount", "getAllAccounts", "Lkotlinx/coroutines/flow/Flow;", "", "getAccount", "userId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAccountById", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes7.dex */
public final class SavedAccountDao_Impl implements SavedAccountDao {
    private final RoomDatabase __db;
    private final EntityDeleteOrUpdateAdapter<SavedAccount> __deleteAdapterOfSavedAccount;
    private final EntityInsertAdapter<SavedAccount> __insertAdapterOfSavedAccount;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public SavedAccountDao_Impl(RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfSavedAccount = new EntityInsertAdapter<SavedAccount>() { // from class: com.yhchat.canarys.data.local.SavedAccountDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `saved_accounts` (`userId`,`name`,`avatarUrl`,`displayId`,`lastLoginTime`) VALUES (?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, SavedAccount entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.mo8127bindText(1, entity.getUserId());
                statement.mo8127bindText(2, entity.getName());
                String _tmpAvatarUrl = entity.getAvatarUrl();
                if (_tmpAvatarUrl == null) {
                    statement.mo8126bindNull(3);
                } else {
                    statement.mo8127bindText(3, _tmpAvatarUrl);
                }
                statement.mo8127bindText(4, entity.getDisplayId());
                statement.mo8125bindLong(5, entity.getLastLoginTime());
            }
        };
        this.__deleteAdapterOfSavedAccount = new EntityDeleteOrUpdateAdapter<SavedAccount>() { // from class: com.yhchat.canarys.data.local.SavedAccountDao_Impl.2
            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            protected String createQuery() {
                return "DELETE FROM `saved_accounts` WHERE `userId` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            public void bind(SQLiteStatement statement, SavedAccount entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.mo8127bindText(1, entity.getUserId());
            }
        };
    }

    @Override // com.yhchat.canarys.data.local.SavedAccountDao
    public Object insertAccount(final SavedAccount account, Continuation<? super Unit> continuation) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.yhchat.canarys.data.local.SavedAccountDao_Impl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SavedAccountDao_Impl.insertAccount$lambda$0(this.f$0, account, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insertAccount$lambda$0(SavedAccountDao_Impl this$0, SavedAccount $account, SQLiteConnection _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        this$0.__insertAdapterOfSavedAccount.insert(_connection, (SQLiteConnection) $account);
        return Unit.INSTANCE;
    }

    @Override // com.yhchat.canarys.data.local.SavedAccountDao
    public Object deleteAccount(final SavedAccount account, Continuation<? super Unit> continuation) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.yhchat.canarys.data.local.SavedAccountDao_Impl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SavedAccountDao_Impl.deleteAccount$lambda$0(this.f$0, account, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteAccount$lambda$0(SavedAccountDao_Impl this$0, SavedAccount $account, SQLiteConnection _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        this$0.__deleteAdapterOfSavedAccount.handle(_connection, $account);
        return Unit.INSTANCE;
    }

    @Override // com.yhchat.canarys.data.local.SavedAccountDao
    public Flow<List<SavedAccount>> getAllAccounts() {
        final String _sql = "SELECT `saved_accounts`.`userId` AS `userId`, `saved_accounts`.`name` AS `name`, `saved_accounts`.`avatarUrl` AS `avatarUrl`, `saved_accounts`.`displayId` AS `displayId`, `saved_accounts`.`lastLoginTime` AS `lastLoginTime` FROM saved_accounts ORDER BY lastLoginTime DESC";
        return FlowUtil.createFlow(this.__db, false, new String[]{"saved_accounts"}, new Function1() { // from class: com.yhchat.canarys.data.local.SavedAccountDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SavedAccountDao_Impl.getAllAccounts$lambda$0(_sql, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getAllAccounts$lambda$0(String $_sql, SQLiteConnection _connection) {
        String _tmpAvatarUrl;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            List _result = new ArrayList();
            while (_stmt.step()) {
                String _tmpUserId = _stmt.getText(0);
                String _tmpName = _stmt.getText(1);
                if (_stmt.isNull(2)) {
                    _tmpAvatarUrl = null;
                } else {
                    String _tmpAvatarUrl2 = _stmt.getText(2);
                    _tmpAvatarUrl = _tmpAvatarUrl2;
                }
                String _tmpDisplayId = _stmt.getText(3);
                long _tmpLastLoginTime = _stmt.getLong(4);
                SavedAccount _item = new SavedAccount(_tmpUserId, _tmpName, _tmpAvatarUrl, _tmpDisplayId, _tmpLastLoginTime);
                _result.add(_item);
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.yhchat.canarys.data.local.SavedAccountDao
    public Object getAccount(final String userId, Continuation<? super SavedAccount> continuation) {
        final String _sql = "SELECT * FROM saved_accounts WHERE userId = ?";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.yhchat.canarys.data.local.SavedAccountDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SavedAccountDao_Impl.getAccount$lambda$0(_sql, userId, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SavedAccount getAccount$lambda$0(String $_sql, String $userId, SQLiteConnection _connection) {
        SavedAccount _result;
        String _tmpAvatarUrl;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.mo8127bindText(1, $userId);
            int _columnIndexOfUserId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "userId");
            int _columnIndexOfName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, HintConstants.AUTOFILL_HINT_NAME);
            int _columnIndexOfAvatarUrl = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "avatarUrl");
            int _columnIndexOfDisplayId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "displayId");
            int _columnIndexOfLastLoginTime = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "lastLoginTime");
            if (_stmt.step()) {
                String _tmpUserId = _stmt.getText(_columnIndexOfUserId);
                String _tmpName = _stmt.getText(_columnIndexOfName);
                if (_stmt.isNull(_columnIndexOfAvatarUrl)) {
                    _tmpAvatarUrl = null;
                } else {
                    String _tmpAvatarUrl2 = _stmt.getText(_columnIndexOfAvatarUrl);
                    _tmpAvatarUrl = _tmpAvatarUrl2;
                }
                String _tmpDisplayId = _stmt.getText(_columnIndexOfDisplayId);
                long _tmpLastLoginTime = _stmt.getLong(_columnIndexOfLastLoginTime);
                _result = new SavedAccount(_tmpUserId, _tmpName, _tmpAvatarUrl, _tmpDisplayId, _tmpLastLoginTime);
            } else {
                _result = null;
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.yhchat.canarys.data.local.SavedAccountDao
    public Object deleteAccountById(final String userId, Continuation<? super Unit> continuation) {
        final String _sql = "DELETE FROM saved_accounts WHERE userId = ?";
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.yhchat.canarys.data.local.SavedAccountDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SavedAccountDao_Impl.deleteAccountById$lambda$0(_sql, userId, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteAccountById$lambda$0(String $_sql, String $userId, SQLiteConnection _connection) {
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

    /* compiled from: SavedAccountDao_Impl.kt */
    @Metadata(m168d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005\u00a8\u0006\u0007"}, m169d2 = {"Lcom/yhchat/canarys/data/local/SavedAccountDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
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
