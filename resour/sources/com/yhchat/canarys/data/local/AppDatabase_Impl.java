package com.yhchat.canarys.data.local;

import androidx.autofill.HintConstants;
import androidx.room.InvalidationTracker;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.simpleframework.xml.strategy.Name;

/* compiled from: AppDatabase_Impl.kt */
@Metadata(m168d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\"\u0010\u0015\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0017\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170\u00180\u0016H\u0014J\u0016\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u00170\u001aH\u0016J*\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00182\u001a\u0010\u001e\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u0017\u0012\u0004\u0012\u00020\u001b0\u0016H\u0016J\b\u0010\u001f\u001a\u00020\u0006H\u0016J\b\u0010 \u001a\u00020\bH\u0016J\b\u0010!\u001a\u00020\nH\u0016J\b\u0010\"\u001a\u00020\fH\u0016J\b\u0010#\u001a\u00020\u000eH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, m169d2 = {"Lcom/yhchat/canarys/data/local/AppDatabase_Impl;", "Lcom/yhchat/canarys/data/local/AppDatabase;", "<init>", "()V", "_userTokenDao", "Lkotlin/Lazy;", "Lcom/yhchat/canarys/data/local/UserTokenDao;", "_cachedConversationDao", "Lcom/yhchat/canarys/data/local/CachedConversationDao;", "_cachedMessageDao", "Lcom/yhchat/canarys/data/local/CachedMessageDao;", "_blockedUserDao", "Lcom/yhchat/canarys/data/local/BlockedUserDao;", "_savedAccountDao", "Lcom/yhchat/canarys/data/local/SavedAccountDao;", "createOpenDelegate", "Landroidx/room/RoomOpenDelegate;", "createInvalidationTracker", "Landroidx/room/InvalidationTracker;", "clearAllTables", "", "getRequiredTypeConverterClasses", "", "Lkotlin/reflect/KClass;", "", "getRequiredAutoMigrationSpecClasses", "", "Landroidx/room/migration/AutoMigrationSpec;", "createAutoMigrations", "Landroidx/room/migration/Migration;", "autoMigrationSpecs", "userTokenDao", "cachedConversationDao", "cachedMessageDao", "blockedUserDao", "savedAccountDao", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes7.dex */
public final class AppDatabase_Impl extends AppDatabase {
    public static final int $stable = 8;
    private final Lazy<UserTokenDao> _userTokenDao = LazyKt.lazy(new Function0() { // from class: com.yhchat.canarys.data.local.AppDatabase_Impl$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppDatabase_Impl._userTokenDao$lambda$0(this.f$0);
        }
    });
    private final Lazy<CachedConversationDao> _cachedConversationDao = LazyKt.lazy(new Function0() { // from class: com.yhchat.canarys.data.local.AppDatabase_Impl$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppDatabase_Impl._cachedConversationDao$lambda$0(this.f$0);
        }
    });
    private final Lazy<CachedMessageDao> _cachedMessageDao = LazyKt.lazy(new Function0() { // from class: com.yhchat.canarys.data.local.AppDatabase_Impl$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppDatabase_Impl._cachedMessageDao$lambda$0(this.f$0);
        }
    });
    private final Lazy<BlockedUserDao> _blockedUserDao = LazyKt.lazy(new Function0() { // from class: com.yhchat.canarys.data.local.AppDatabase_Impl$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppDatabase_Impl._blockedUserDao$lambda$0(this.f$0);
        }
    });
    private final Lazy<SavedAccountDao> _savedAccountDao = LazyKt.lazy(new Function0() { // from class: com.yhchat.canarys.data.local.AppDatabase_Impl$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppDatabase_Impl._savedAccountDao$lambda$0(this.f$0);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserTokenDao_Impl _userTokenDao$lambda$0(AppDatabase_Impl this$0) {
        return new UserTokenDao_Impl(this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CachedConversationDao_Impl _cachedConversationDao$lambda$0(AppDatabase_Impl this$0) {
        return new CachedConversationDao_Impl(this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CachedMessageDao_Impl _cachedMessageDao$lambda$0(AppDatabase_Impl this$0) {
        return new CachedMessageDao_Impl(this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BlockedUserDao_Impl _blockedUserDao$lambda$0(AppDatabase_Impl this$0) {
        return new BlockedUserDao_Impl(this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SavedAccountDao_Impl _savedAccountDao$lambda$0(AppDatabase_Impl this$0) {
        return new SavedAccountDao_Impl(this$0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.room.RoomDatabase
    public RoomOpenDelegate createOpenDelegate() {
        RoomOpenDelegate _openDelegate = new RoomOpenDelegate() { // from class: com.yhchat.canarys.data.local.AppDatabase_Impl$createOpenDelegate$_openDelegate$1
            {
                super(4, "5874944bea268abb3e2a4187fd77e615", "ea96b06d50e02cc64dc5f9196ec5ab02");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void createAllTables(SQLiteConnection connection) throws Exception {
                Intrinsics.checkNotNullParameter(connection, "connection");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `user_tokens` (`id` INTEGER NOT NULL, `token` TEXT NOT NULL, `loginTime` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `cached_conversations` (`chatId` TEXT NOT NULL, `chatType` INTEGER NOT NULL, `name` TEXT NOT NULL, `chatContent` TEXT NOT NULL, `timestampMs` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, `unreadMessage` INTEGER NOT NULL, `at` INTEGER NOT NULL, `avatarUrl` TEXT, `doNotDisturb` INTEGER, `certificationLevel` INTEGER, `lastUpdateTime` INTEGER NOT NULL, PRIMARY KEY(`chatId`))");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `cached_messages` (`msgId` TEXT NOT NULL, `chatId` TEXT NOT NULL, `chatType` INTEGER NOT NULL, `senderChatId` TEXT NOT NULL, `senderName` TEXT NOT NULL, `senderAvatarUrl` TEXT NOT NULL, `direction` TEXT NOT NULL, `contentType` INTEGER NOT NULL, `contentText` TEXT, `contentImageUrl` TEXT, `contentFileName` TEXT, `contentFileUrl` TEXT, `quoteMsgText` TEXT, `quoteImageUrl` TEXT, `sendTime` INTEGER NOT NULL, `msgSeq` INTEGER, `editTime` INTEGER, `msgDeleteTime` INTEGER, `quoteMsgId` TEXT, `cmdName` TEXT, `cmdType` INTEGER, `localInsertTime` INTEGER NOT NULL, PRIMARY KEY(`msgId`))");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `blocked_users` (`userId` TEXT NOT NULL, `userName` TEXT NOT NULL, `reason` TEXT NOT NULL, `blockedTime` INTEGER NOT NULL, `avatarUrl` TEXT, PRIMARY KEY(`userId`))");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `saved_accounts` (`userId` TEXT NOT NULL, `name` TEXT NOT NULL, `avatarUrl` TEXT, `displayId` TEXT NOT NULL, `lastLoginTime` INTEGER NOT NULL, PRIMARY KEY(`userId`))");
                SQLite.execSQL(connection, RoomMasterTable.CREATE_QUERY);
                SQLite.execSQL(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5874944bea268abb3e2a4187fd77e615')");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void dropAllTables(SQLiteConnection connection) throws Exception {
                Intrinsics.checkNotNullParameter(connection, "connection");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `user_tokens`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `cached_conversations`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `cached_messages`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `blocked_users`");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `saved_accounts`");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onCreate(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onOpen(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                this.this$0.internalInitInvalidationTracker(connection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPreMigrate(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                DBUtil.dropFtsSyncTriggers(connection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPostMigrate(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
            }

            @Override // androidx.room.RoomOpenDelegate
            public RoomOpenDelegate.ValidationResult onValidateSchema(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                Map _columnsUserTokens = new LinkedHashMap();
                _columnsUserTokens.put(Name.MARK, new TableInfo.Column(Name.MARK, "INTEGER", true, 1, null, 1));
                _columnsUserTokens.put("token", new TableInfo.Column("token", "TEXT", true, 0, null, 1));
                _columnsUserTokens.put("loginTime", new TableInfo.Column("loginTime", "INTEGER", true, 0, null, 1));
                Set _foreignKeysUserTokens = new LinkedHashSet();
                Set _indicesUserTokens = new LinkedHashSet();
                TableInfo _infoUserTokens = new TableInfo("user_tokens", _columnsUserTokens, _foreignKeysUserTokens, _indicesUserTokens);
                TableInfo _existingUserTokens = TableInfo.INSTANCE.read(connection, "user_tokens");
                if (!_infoUserTokens.equals(_existingUserTokens)) {
                    return new RoomOpenDelegate.ValidationResult(false, "user_tokens(com.yhchat.canarys.data.local.UserToken).\n Expected:\n" + _infoUserTokens + "\n Found:\n" + _existingUserTokens);
                }
                Map _columnsCachedConversations = new LinkedHashMap();
                _columnsCachedConversations.put(ChatSearchActivity.EXTRA_CHAT_ID, new TableInfo.Column(ChatSearchActivity.EXTRA_CHAT_ID, "TEXT", true, 1, null, 1));
                _columnsCachedConversations.put(ChatSearchActivity.EXTRA_CHAT_TYPE, new TableInfo.Column(ChatSearchActivity.EXTRA_CHAT_TYPE, "INTEGER", true, 0, null, 1));
                _columnsCachedConversations.put(HintConstants.AUTOFILL_HINT_NAME, new TableInfo.Column(HintConstants.AUTOFILL_HINT_NAME, "TEXT", true, 0, null, 1));
                _columnsCachedConversations.put("chatContent", new TableInfo.Column("chatContent", "TEXT", true, 0, null, 1));
                _columnsCachedConversations.put("timestampMs", new TableInfo.Column("timestampMs", "INTEGER", true, 0, null, 1));
                _columnsCachedConversations.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, 1));
                _columnsCachedConversations.put("unreadMessage", new TableInfo.Column("unreadMessage", "INTEGER", true, 0, null, 1));
                _columnsCachedConversations.put("at", new TableInfo.Column("at", "INTEGER", true, 0, null, 1));
                _columnsCachedConversations.put("avatarUrl", new TableInfo.Column("avatarUrl", "TEXT", false, 0, null, 1));
                _columnsCachedConversations.put("doNotDisturb", new TableInfo.Column("doNotDisturb", "INTEGER", false, 0, null, 1));
                _columnsCachedConversations.put("certificationLevel", new TableInfo.Column("certificationLevel", "INTEGER", false, 0, null, 1));
                _columnsCachedConversations.put("lastUpdateTime", new TableInfo.Column("lastUpdateTime", "INTEGER", true, 0, null, 1));
                Set _foreignKeysCachedConversations = new LinkedHashSet();
                Set _indicesCachedConversations = new LinkedHashSet();
                TableInfo _infoCachedConversations = new TableInfo("cached_conversations", _columnsCachedConversations, _foreignKeysCachedConversations, _indicesCachedConversations);
                TableInfo _existingCachedConversations = TableInfo.INSTANCE.read(connection, "cached_conversations");
                if (!_infoCachedConversations.equals(_existingCachedConversations)) {
                    return new RoomOpenDelegate.ValidationResult(false, "cached_conversations(com.yhchat.canarys.data.local.CachedConversation).\n Expected:\n" + _infoCachedConversations + "\n Found:\n" + _existingCachedConversations);
                }
                Map _columnsCachedMessages = new LinkedHashMap();
                _columnsCachedMessages.put("msgId", new TableInfo.Column("msgId", "TEXT", true, 1, null, 1));
                _columnsCachedMessages.put(ChatSearchActivity.EXTRA_CHAT_ID, new TableInfo.Column(ChatSearchActivity.EXTRA_CHAT_ID, "TEXT", true, 0, null, 1));
                _columnsCachedMessages.put(ChatSearchActivity.EXTRA_CHAT_TYPE, new TableInfo.Column(ChatSearchActivity.EXTRA_CHAT_TYPE, "INTEGER", true, 0, null, 1));
                _columnsCachedMessages.put("senderChatId", new TableInfo.Column("senderChatId", "TEXT", true, 0, null, 1));
                _columnsCachedMessages.put("senderName", new TableInfo.Column("senderName", "TEXT", true, 0, null, 1));
                _columnsCachedMessages.put("senderAvatarUrl", new TableInfo.Column("senderAvatarUrl", "TEXT", true, 0, null, 1));
                _columnsCachedMessages.put("direction", new TableInfo.Column("direction", "TEXT", true, 0, null, 1));
                _columnsCachedMessages.put("contentType", new TableInfo.Column("contentType", "INTEGER", true, 0, null, 1));
                _columnsCachedMessages.put("contentText", new TableInfo.Column("contentText", "TEXT", false, 0, null, 1));
                _columnsCachedMessages.put("contentImageUrl", new TableInfo.Column("contentImageUrl", "TEXT", false, 0, null, 1));
                _columnsCachedMessages.put("contentFileName", new TableInfo.Column("contentFileName", "TEXT", false, 0, null, 1));
                _columnsCachedMessages.put("contentFileUrl", new TableInfo.Column("contentFileUrl", "TEXT", false, 0, null, 1));
                _columnsCachedMessages.put("quoteMsgText", new TableInfo.Column("quoteMsgText", "TEXT", false, 0, null, 1));
                _columnsCachedMessages.put("quoteImageUrl", new TableInfo.Column("quoteImageUrl", "TEXT", false, 0, null, 1));
                _columnsCachedMessages.put("sendTime", new TableInfo.Column("sendTime", "INTEGER", true, 0, null, 1));
                _columnsCachedMessages.put("msgSeq", new TableInfo.Column("msgSeq", "INTEGER", false, 0, null, 1));
                _columnsCachedMessages.put("editTime", new TableInfo.Column("editTime", "INTEGER", false, 0, null, 1));
                _columnsCachedMessages.put("msgDeleteTime", new TableInfo.Column("msgDeleteTime", "INTEGER", false, 0, null, 1));
                _columnsCachedMessages.put("quoteMsgId", new TableInfo.Column("quoteMsgId", "TEXT", false, 0, null, 1));
                _columnsCachedMessages.put("cmdName", new TableInfo.Column("cmdName", "TEXT", false, 0, null, 1));
                _columnsCachedMessages.put("cmdType", new TableInfo.Column("cmdType", "INTEGER", false, 0, null, 1));
                _columnsCachedMessages.put("localInsertTime", new TableInfo.Column("localInsertTime", "INTEGER", true, 0, null, 1));
                Set _foreignKeysCachedMessages = new LinkedHashSet();
                Set _indicesCachedMessages = new LinkedHashSet();
                TableInfo _infoCachedMessages = new TableInfo("cached_messages", _columnsCachedMessages, _foreignKeysCachedMessages, _indicesCachedMessages);
                TableInfo _existingCachedMessages = TableInfo.INSTANCE.read(connection, "cached_messages");
                if (!_infoCachedMessages.equals(_existingCachedMessages)) {
                    return new RoomOpenDelegate.ValidationResult(false, "cached_messages(com.yhchat.canarys.data.local.CachedMessage).\n Expected:\n" + _infoCachedMessages + "\n Found:\n" + _existingCachedMessages);
                }
                Map _columnsBlockedUsers = new LinkedHashMap();
                _columnsBlockedUsers.put("userId", new TableInfo.Column("userId", "TEXT", true, 1, null, 1));
                _columnsBlockedUsers.put("userName", new TableInfo.Column("userName", "TEXT", true, 0, null, 1));
                _columnsBlockedUsers.put("reason", new TableInfo.Column("reason", "TEXT", true, 0, null, 1));
                _columnsBlockedUsers.put("blockedTime", new TableInfo.Column("blockedTime", "INTEGER", true, 0, null, 1));
                _columnsBlockedUsers.put("avatarUrl", new TableInfo.Column("avatarUrl", "TEXT", false, 0, null, 1));
                Set _foreignKeysBlockedUsers = new LinkedHashSet();
                Set _indicesBlockedUsers = new LinkedHashSet();
                TableInfo _infoBlockedUsers = new TableInfo("blocked_users", _columnsBlockedUsers, _foreignKeysBlockedUsers, _indicesBlockedUsers);
                TableInfo _existingBlockedUsers = TableInfo.INSTANCE.read(connection, "blocked_users");
                if (!_infoBlockedUsers.equals(_existingBlockedUsers)) {
                    return new RoomOpenDelegate.ValidationResult(false, "blocked_users(com.yhchat.canarys.data.local.BlockedUser).\n Expected:\n" + _infoBlockedUsers + "\n Found:\n" + _existingBlockedUsers);
                }
                Map _columnsSavedAccounts = new LinkedHashMap();
                _columnsSavedAccounts.put("userId", new TableInfo.Column("userId", "TEXT", true, 1, null, 1));
                _columnsSavedAccounts.put(HintConstants.AUTOFILL_HINT_NAME, new TableInfo.Column(HintConstants.AUTOFILL_HINT_NAME, "TEXT", true, 0, null, 1));
                _columnsSavedAccounts.put("avatarUrl", new TableInfo.Column("avatarUrl", "TEXT", false, 0, null, 1));
                _columnsSavedAccounts.put("displayId", new TableInfo.Column("displayId", "TEXT", true, 0, null, 1));
                _columnsSavedAccounts.put("lastLoginTime", new TableInfo.Column("lastLoginTime", "INTEGER", true, 0, null, 1));
                Set _foreignKeysSavedAccounts = new LinkedHashSet();
                Set _indicesSavedAccounts = new LinkedHashSet();
                TableInfo _infoSavedAccounts = new TableInfo("saved_accounts", _columnsSavedAccounts, _foreignKeysSavedAccounts, _indicesSavedAccounts);
                TableInfo _existingSavedAccounts = TableInfo.INSTANCE.read(connection, "saved_accounts");
                return !_infoSavedAccounts.equals(_existingSavedAccounts) ? new RoomOpenDelegate.ValidationResult(false, "saved_accounts(com.yhchat.canarys.data.model.SavedAccount).\n Expected:\n" + _infoSavedAccounts + "\n Found:\n" + _existingSavedAccounts) : new RoomOpenDelegate.ValidationResult(true, null);
            }
        };
        return _openDelegate;
    }

    @Override // androidx.room.RoomDatabase
    protected InvalidationTracker createInvalidationTracker() {
        Map _shadowTablesMap = new LinkedHashMap();
        Map _viewTables = new LinkedHashMap();
        return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "user_tokens", "cached_conversations", "cached_messages", "blocked_users", "saved_accounts");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(false, "user_tokens", "cached_conversations", "cached_messages", "blocked_users", "saved_accounts");
    }

    @Override // androidx.room.RoomDatabase
    protected Map<KClass<?>, List<KClass<?>>> getRequiredTypeConverterClasses() {
        Map _typeConvertersMap = new LinkedHashMap();
        _typeConvertersMap.put(Reflection.getOrCreateKotlinClass(UserTokenDao.class), UserTokenDao_Impl.INSTANCE.getRequiredConverters());
        _typeConvertersMap.put(Reflection.getOrCreateKotlinClass(CachedConversationDao.class), CachedConversationDao_Impl.INSTANCE.getRequiredConverters());
        _typeConvertersMap.put(Reflection.getOrCreateKotlinClass(CachedMessageDao.class), CachedMessageDao_Impl.INSTANCE.getRequiredConverters());
        _typeConvertersMap.put(Reflection.getOrCreateKotlinClass(BlockedUserDao.class), BlockedUserDao_Impl.INSTANCE.getRequiredConverters());
        _typeConvertersMap.put(Reflection.getOrCreateKotlinClass(SavedAccountDao.class), SavedAccountDao_Impl.INSTANCE.getRequiredConverters());
        return _typeConvertersMap;
    }

    @Override // androidx.room.RoomDatabase
    public Set<KClass<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecClasses() {
        Set _autoMigrationSpecsSet = new LinkedHashSet();
        return _autoMigrationSpecsSet;
    }

    @Override // androidx.room.RoomDatabase
    public List<Migration> createAutoMigrations(Map<KClass<? extends AutoMigrationSpec>, ? extends AutoMigrationSpec> autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        List _autoMigrations = new ArrayList();
        return _autoMigrations;
    }

    @Override // com.yhchat.canarys.data.local.AppDatabase
    public UserTokenDao userTokenDao() {
        return this._userTokenDao.getValue();
    }

    @Override // com.yhchat.canarys.data.local.AppDatabase
    public CachedConversationDao cachedConversationDao() {
        return this._cachedConversationDao.getValue();
    }

    @Override // com.yhchat.canarys.data.local.AppDatabase
    public CachedMessageDao cachedMessageDao() {
        return this._cachedMessageDao.getValue();
    }

    @Override // com.yhchat.canarys.data.local.AppDatabase
    public BlockedUserDao blockedUserDao() {
        return this._blockedUserDao.getValue();
    }

    @Override // com.yhchat.canarys.data.local.AppDatabase
    public SavedAccountDao savedAccountDao() {
        return this._savedAccountDao.getValue();
    }
}
