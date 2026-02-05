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
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
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

/* compiled from: CachedConversationDao_Impl.kt */
@Metadata(m168d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0096@\u00a2\u0006\u0002\u0010\u000fJ\u001c\u0010\u0010\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0012H\u0096@\u00a2\u0006\u0002\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0096@\u00a2\u0006\u0002\u0010\u000fJ\u0016\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0096@\u00a2\u0006\u0002\u0010\u000fJ\u0014\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00120\u0017H\u0016J\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0012H\u0096@\u00a2\u0006\u0002\u0010\u0019J\u0018\u0010\u001a\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001b\u001a\u00020\u001cH\u0096@\u00a2\u0006\u0002\u0010\u001dJ\u000e\u0010\u001e\u001a\u00020\rH\u0096@\u00a2\u0006\u0002\u0010\u0019J\u0016\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001cH\u0096@\u00a2\u0006\u0002\u0010\u001dJ&\u0010 \u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#H\u0096@\u00a2\u0006\u0002\u0010$J\u001e\u0010%\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020'H\u0096@\u00a2\u0006\u0002\u0010(R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, m169d2 = {"Lcom/yhchat/canarys/data/local/CachedConversationDao_Impl;", "Lcom/yhchat/canarys/data/local/CachedConversationDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfCachedConversation", "Landroidx/room/EntityInsertAdapter;", "Lcom/yhchat/canarys/data/local/CachedConversation;", "__deleteAdapterOfCachedConversation", "Landroidx/room/EntityDeleteOrUpdateAdapter;", "__updateAdapterOfCachedConversation", "insertConversation", "", "conversation", "(Lcom/yhchat/canarys/data/local/CachedConversation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertConversations", "conversations", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteConversation", "updateConversation", "getAllConversations", "Lkotlinx/coroutines/flow/Flow;", "getAllConversationsSync", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getConversation", ChatSearchActivity.EXTRA_CHAT_ID, "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearAllConversations", "markAsRead", "updateLastMessage", "lastMessage", "timestamp", "", "(Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateDoNotDisturb", "doNotDisturb", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes7.dex */
public final class CachedConversationDao_Impl implements CachedConversationDao {
    private final RoomDatabase __db;
    private final EntityDeleteOrUpdateAdapter<CachedConversation> __deleteAdapterOfCachedConversation;
    private final EntityInsertAdapter<CachedConversation> __insertAdapterOfCachedConversation;
    private final EntityDeleteOrUpdateAdapter<CachedConversation> __updateAdapterOfCachedConversation;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public CachedConversationDao_Impl(RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfCachedConversation = new EntityInsertAdapter<CachedConversation>() { // from class: com.yhchat.canarys.data.local.CachedConversationDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `cached_conversations` (`chatId`,`chatType`,`name`,`chatContent`,`timestampMs`,`timestamp`,`unreadMessage`,`at`,`avatarUrl`,`doNotDisturb`,`certificationLevel`,`lastUpdateTime`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, CachedConversation entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.mo8127bindText(1, entity.getChatId());
                statement.mo8125bindLong(2, entity.getChatType());
                statement.mo8127bindText(3, entity.getName());
                statement.mo8127bindText(4, entity.getChatContent());
                statement.mo8125bindLong(5, entity.getTimestampMs());
                statement.mo8125bindLong(6, entity.getTimestamp());
                statement.mo8125bindLong(7, entity.getUnreadMessage());
                statement.mo8125bindLong(8, entity.getAt());
                String _tmpAvatarUrl = entity.getAvatarUrl();
                if (_tmpAvatarUrl == null) {
                    statement.mo8126bindNull(9);
                } else {
                    statement.mo8127bindText(9, _tmpAvatarUrl);
                }
                Integer _tmpDoNotDisturb = entity.getDoNotDisturb();
                if (_tmpDoNotDisturb != null) {
                    statement.mo8125bindLong(10, _tmpDoNotDisturb.intValue());
                } else {
                    statement.mo8126bindNull(10);
                }
                Integer _tmpCertificationLevel = entity.getCertificationLevel();
                if (_tmpCertificationLevel != null) {
                    statement.mo8125bindLong(11, _tmpCertificationLevel.intValue());
                } else {
                    statement.mo8126bindNull(11);
                }
                statement.mo8125bindLong(12, entity.getLastUpdateTime());
            }
        };
        this.__deleteAdapterOfCachedConversation = new EntityDeleteOrUpdateAdapter<CachedConversation>() { // from class: com.yhchat.canarys.data.local.CachedConversationDao_Impl.2
            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            protected String createQuery() {
                return "DELETE FROM `cached_conversations` WHERE `chatId` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            public void bind(SQLiteStatement statement, CachedConversation entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.mo8127bindText(1, entity.getChatId());
            }
        };
        this.__updateAdapterOfCachedConversation = new EntityDeleteOrUpdateAdapter<CachedConversation>() { // from class: com.yhchat.canarys.data.local.CachedConversationDao_Impl.3
            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            protected String createQuery() {
                return "UPDATE OR ABORT `cached_conversations` SET `chatId` = ?,`chatType` = ?,`name` = ?,`chatContent` = ?,`timestampMs` = ?,`timestamp` = ?,`unreadMessage` = ?,`at` = ?,`avatarUrl` = ?,`doNotDisturb` = ?,`certificationLevel` = ?,`lastUpdateTime` = ? WHERE `chatId` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            public void bind(SQLiteStatement statement, CachedConversation entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.mo8127bindText(1, entity.getChatId());
                statement.mo8125bindLong(2, entity.getChatType());
                statement.mo8127bindText(3, entity.getName());
                statement.mo8127bindText(4, entity.getChatContent());
                statement.mo8125bindLong(5, entity.getTimestampMs());
                statement.mo8125bindLong(6, entity.getTimestamp());
                statement.mo8125bindLong(7, entity.getUnreadMessage());
                statement.mo8125bindLong(8, entity.getAt());
                String _tmpAvatarUrl = entity.getAvatarUrl();
                if (_tmpAvatarUrl == null) {
                    statement.mo8126bindNull(9);
                } else {
                    statement.mo8127bindText(9, _tmpAvatarUrl);
                }
                Integer _tmpDoNotDisturb = entity.getDoNotDisturb();
                if (_tmpDoNotDisturb != null) {
                    statement.mo8125bindLong(10, _tmpDoNotDisturb.intValue());
                } else {
                    statement.mo8126bindNull(10);
                }
                Integer _tmpCertificationLevel = entity.getCertificationLevel();
                if (_tmpCertificationLevel != null) {
                    statement.mo8125bindLong(11, _tmpCertificationLevel.intValue());
                } else {
                    statement.mo8126bindNull(11);
                }
                statement.mo8125bindLong(12, entity.getLastUpdateTime());
                statement.mo8127bindText(13, entity.getChatId());
            }
        };
    }

    @Override // com.yhchat.canarys.data.local.CachedConversationDao
    public Object insertConversation(final CachedConversation conversation, Continuation<? super Unit> continuation) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.yhchat.canarys.data.local.CachedConversationDao_Impl$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CachedConversationDao_Impl.insertConversation$lambda$0(this.f$0, conversation, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insertConversation$lambda$0(CachedConversationDao_Impl this$0, CachedConversation $conversation, SQLiteConnection _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        this$0.__insertAdapterOfCachedConversation.insert(_connection, (SQLiteConnection) $conversation);
        return Unit.INSTANCE;
    }

    @Override // com.yhchat.canarys.data.local.CachedConversationDao
    public Object insertConversations(final List<CachedConversation> list, Continuation<? super Unit> continuation) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.yhchat.canarys.data.local.CachedConversationDao_Impl$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CachedConversationDao_Impl.insertConversations$lambda$0(this.f$0, list, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insertConversations$lambda$0(CachedConversationDao_Impl this$0, List $conversations, SQLiteConnection _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        this$0.__insertAdapterOfCachedConversation.insert(_connection, $conversations);
        return Unit.INSTANCE;
    }

    @Override // com.yhchat.canarys.data.local.CachedConversationDao
    public Object deleteConversation(final CachedConversation conversation, Continuation<? super Unit> continuation) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.yhchat.canarys.data.local.CachedConversationDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CachedConversationDao_Impl.deleteConversation$lambda$0(this.f$0, conversation, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteConversation$lambda$0(CachedConversationDao_Impl this$0, CachedConversation $conversation, SQLiteConnection _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        this$0.__deleteAdapterOfCachedConversation.handle(_connection, $conversation);
        return Unit.INSTANCE;
    }

    @Override // com.yhchat.canarys.data.local.CachedConversationDao
    public Object updateConversation(final CachedConversation conversation, Continuation<? super Unit> continuation) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.yhchat.canarys.data.local.CachedConversationDao_Impl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CachedConversationDao_Impl.updateConversation$lambda$0(this.f$0, conversation, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateConversation$lambda$0(CachedConversationDao_Impl this$0, CachedConversation $conversation, SQLiteConnection _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        this$0.__updateAdapterOfCachedConversation.handle(_connection, $conversation);
        return Unit.INSTANCE;
    }

    @Override // com.yhchat.canarys.data.local.CachedConversationDao
    public Flow<List<CachedConversation>> getAllConversations() {
        final String _sql = "SELECT `cached_conversations`.`chatId` AS `chatId`, `cached_conversations`.`chatType` AS `chatType`, `cached_conversations`.`name` AS `name`, `cached_conversations`.`chatContent` AS `chatContent`, `cached_conversations`.`timestampMs` AS `timestampMs`, `cached_conversations`.`timestamp` AS `timestamp`, `cached_conversations`.`unreadMessage` AS `unreadMessage`, `cached_conversations`.`at` AS `at`, `cached_conversations`.`avatarUrl` AS `avatarUrl`, `cached_conversations`.`doNotDisturb` AS `doNotDisturb`, `cached_conversations`.`certificationLevel` AS `certificationLevel`, `cached_conversations`.`lastUpdateTime` AS `lastUpdateTime` FROM cached_conversations ORDER BY timestampMs DESC";
        return FlowUtil.createFlow(this.__db, false, new String[]{"cached_conversations"}, new Function1() { // from class: com.yhchat.canarys.data.local.CachedConversationDao_Impl$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CachedConversationDao_Impl.getAllConversations$lambda$0(_sql, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getAllConversations$lambda$0(String $_sql, SQLiteConnection _connection) {
        String _tmpAvatarUrl;
        int _tmpAt;
        Integer _tmpDoNotDisturb;
        Integer _tmpCertificationLevel;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        int _columnIndexOfChatId = 0;
        try {
            List _result = new ArrayList();
            while (_stmt.step()) {
                String _tmpChatId = _stmt.getText(_columnIndexOfChatId);
                int _columnIndexOfChatId2 = _columnIndexOfChatId;
                int _tmpChatType = (int) _stmt.getLong(1);
                String _tmpName = _stmt.getText(2);
                String _tmpChatContent = _stmt.getText(3);
                long _tmpTimestampMs = _stmt.getLong(4);
                long _tmpTimestamp = _stmt.getLong(5);
                int _tmpUnreadMessage = (int) _stmt.getLong(6);
                int _tmpAt2 = (int) _stmt.getLong(7);
                if (_stmt.isNull(8)) {
                    _tmpAvatarUrl = null;
                } else {
                    String _tmpAvatarUrl2 = _stmt.getText(8);
                    _tmpAvatarUrl = _tmpAvatarUrl2;
                }
                if (_stmt.isNull(9)) {
                    _tmpAt = _tmpAt2;
                    _tmpDoNotDisturb = null;
                } else {
                    _tmpAt = _tmpAt2;
                    _tmpDoNotDisturb = Integer.valueOf((int) _stmt.getLong(9));
                }
                if (!_stmt.isNull(10)) {
                    _tmpCertificationLevel = Integer.valueOf((int) _stmt.getLong(10));
                } else {
                    _tmpCertificationLevel = null;
                }
                long _tmpLastUpdateTime = _stmt.getLong(11);
                CachedConversation _item = new CachedConversation(_tmpChatId, _tmpChatType, _tmpName, _tmpChatContent, _tmpTimestampMs, _tmpTimestamp, _tmpUnreadMessage, _tmpAt, _tmpAvatarUrl, _tmpDoNotDisturb, _tmpCertificationLevel, _tmpLastUpdateTime);
                _result.add(_item);
                _columnIndexOfChatId = _columnIndexOfChatId2;
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.yhchat.canarys.data.local.CachedConversationDao
    public Object getAllConversationsSync(Continuation<? super List<CachedConversation>> continuation) {
        final String _sql = "SELECT `cached_conversations`.`chatId` AS `chatId`, `cached_conversations`.`chatType` AS `chatType`, `cached_conversations`.`name` AS `name`, `cached_conversations`.`chatContent` AS `chatContent`, `cached_conversations`.`timestampMs` AS `timestampMs`, `cached_conversations`.`timestamp` AS `timestamp`, `cached_conversations`.`unreadMessage` AS `unreadMessage`, `cached_conversations`.`at` AS `at`, `cached_conversations`.`avatarUrl` AS `avatarUrl`, `cached_conversations`.`doNotDisturb` AS `doNotDisturb`, `cached_conversations`.`certificationLevel` AS `certificationLevel`, `cached_conversations`.`lastUpdateTime` AS `lastUpdateTime` FROM cached_conversations ORDER BY timestampMs DESC";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.yhchat.canarys.data.local.CachedConversationDao_Impl$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CachedConversationDao_Impl.getAllConversationsSync$lambda$0(_sql, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getAllConversationsSync$lambda$0(String $_sql, SQLiteConnection _connection) {
        String _tmpAvatarUrl;
        int _tmpAt;
        Integer _tmpDoNotDisturb;
        Integer _tmpCertificationLevel;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        int _columnIndexOfChatId = 0;
        try {
            List _result = new ArrayList();
            while (_stmt.step()) {
                String _tmpChatId = _stmt.getText(_columnIndexOfChatId);
                int _columnIndexOfChatId2 = _columnIndexOfChatId;
                int _tmpChatType = (int) _stmt.getLong(1);
                String _tmpName = _stmt.getText(2);
                String _tmpChatContent = _stmt.getText(3);
                long _tmpTimestampMs = _stmt.getLong(4);
                long _tmpTimestamp = _stmt.getLong(5);
                int _tmpUnreadMessage = (int) _stmt.getLong(6);
                int _tmpAt2 = (int) _stmt.getLong(7);
                if (_stmt.isNull(8)) {
                    _tmpAvatarUrl = null;
                } else {
                    String _tmpAvatarUrl2 = _stmt.getText(8);
                    _tmpAvatarUrl = _tmpAvatarUrl2;
                }
                if (_stmt.isNull(9)) {
                    _tmpAt = _tmpAt2;
                    _tmpDoNotDisturb = null;
                } else {
                    _tmpAt = _tmpAt2;
                    _tmpDoNotDisturb = Integer.valueOf((int) _stmt.getLong(9));
                }
                if (!_stmt.isNull(10)) {
                    _tmpCertificationLevel = Integer.valueOf((int) _stmt.getLong(10));
                } else {
                    _tmpCertificationLevel = null;
                }
                long _tmpLastUpdateTime = _stmt.getLong(11);
                CachedConversation _item = new CachedConversation(_tmpChatId, _tmpChatType, _tmpName, _tmpChatContent, _tmpTimestampMs, _tmpTimestamp, _tmpUnreadMessage, _tmpAt, _tmpAvatarUrl, _tmpDoNotDisturb, _tmpCertificationLevel, _tmpLastUpdateTime);
                _result.add(_item);
                _columnIndexOfChatId = _columnIndexOfChatId2;
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.yhchat.canarys.data.local.CachedConversationDao
    public Object getConversation(final String chatId, Continuation<? super CachedConversation> continuation) {
        final String _sql = "SELECT * FROM cached_conversations WHERE chatId = ?";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.yhchat.canarys.data.local.CachedConversationDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CachedConversationDao_Impl.getConversation$lambda$0(_sql, chatId, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CachedConversation getConversation$lambda$0(String $_sql, String $chatId, SQLiteConnection _connection) {
        CachedConversation _result;
        String _tmpAvatarUrl;
        int _tmpAt;
        Integer _tmpDoNotDisturb;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.mo8127bindText(1, $chatId);
            int _columnIndexOfChatId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, ChatSearchActivity.EXTRA_CHAT_ID);
            int _columnIndexOfChatType = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, ChatSearchActivity.EXTRA_CHAT_TYPE);
            int _columnIndexOfName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, HintConstants.AUTOFILL_HINT_NAME);
            int _columnIndexOfChatContent = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "chatContent");
            int _columnIndexOfTimestampMs = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "timestampMs");
            int _columnIndexOfTimestamp = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "timestamp");
            int _columnIndexOfUnreadMessage = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "unreadMessage");
            int _columnIndexOfAt = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "at");
            int _columnIndexOfAvatarUrl = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "avatarUrl");
            int _columnIndexOfDoNotDisturb = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "doNotDisturb");
            int _columnIndexOfCertificationLevel = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "certificationLevel");
            int _columnIndexOfLastUpdateTime = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "lastUpdateTime");
            if (_stmt.step()) {
                String _tmpChatId = _stmt.getText(_columnIndexOfChatId);
                int _tmpChatType = (int) _stmt.getLong(_columnIndexOfChatType);
                String _tmpName = _stmt.getText(_columnIndexOfName);
                String _tmpChatContent = _stmt.getText(_columnIndexOfChatContent);
                long _tmpTimestampMs = _stmt.getLong(_columnIndexOfTimestampMs);
                long _tmpTimestamp = _stmt.getLong(_columnIndexOfTimestamp);
                int _tmpUnreadMessage = (int) _stmt.getLong(_columnIndexOfUnreadMessage);
                int _tmpAt2 = (int) _stmt.getLong(_columnIndexOfAt);
                if (_stmt.isNull(_columnIndexOfAvatarUrl)) {
                    _tmpAvatarUrl = null;
                } else {
                    String _tmpAvatarUrl2 = _stmt.getText(_columnIndexOfAvatarUrl);
                    _tmpAvatarUrl = _tmpAvatarUrl2;
                }
                if (_stmt.isNull(_columnIndexOfDoNotDisturb)) {
                    _tmpAt = _tmpAt2;
                    _tmpDoNotDisturb = null;
                } else {
                    _tmpAt = _tmpAt2;
                    _tmpDoNotDisturb = Integer.valueOf((int) _stmt.getLong(_columnIndexOfDoNotDisturb));
                }
                Integer _tmpCertificationLevel = _stmt.isNull(_columnIndexOfCertificationLevel) ? null : Integer.valueOf((int) _stmt.getLong(_columnIndexOfCertificationLevel));
                long _tmpLastUpdateTime = _stmt.getLong(_columnIndexOfLastUpdateTime);
                _result = new CachedConversation(_tmpChatId, _tmpChatType, _tmpName, _tmpChatContent, _tmpTimestampMs, _tmpTimestamp, _tmpUnreadMessage, _tmpAt, _tmpAvatarUrl, _tmpDoNotDisturb, _tmpCertificationLevel, _tmpLastUpdateTime);
            } else {
                _result = null;
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.yhchat.canarys.data.local.CachedConversationDao
    public Object clearAllConversations(Continuation<? super Unit> continuation) {
        final String _sql = "DELETE FROM cached_conversations";
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.yhchat.canarys.data.local.CachedConversationDao_Impl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CachedConversationDao_Impl.clearAllConversations$lambda$0(_sql, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit clearAllConversations$lambda$0(String $_sql, SQLiteConnection _connection) {
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

    @Override // com.yhchat.canarys.data.local.CachedConversationDao
    public Object markAsRead(final String chatId, Continuation<? super Unit> continuation) {
        final String _sql = "UPDATE cached_conversations SET unreadMessage = 0, at = 0 WHERE chatId = ?";
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.yhchat.canarys.data.local.CachedConversationDao_Impl$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CachedConversationDao_Impl.markAsRead$lambda$0(_sql, chatId, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit markAsRead$lambda$0(String $_sql, String $chatId, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.mo8127bindText(1, $chatId);
            _stmt.step();
            _stmt.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            _stmt.close();
            throw th;
        }
    }

    @Override // com.yhchat.canarys.data.local.CachedConversationDao
    public Object updateLastMessage(final String chatId, final String lastMessage, final long timestamp, Continuation<? super Unit> continuation) {
        final String _sql = "UPDATE cached_conversations SET unreadMessage = unreadMessage + 1, chatContent = ?, timestampMs = ? WHERE chatId = ?";
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.yhchat.canarys.data.local.CachedConversationDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CachedConversationDao_Impl.updateLastMessage$lambda$0(_sql, lastMessage, timestamp, chatId, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateLastMessage$lambda$0(String $_sql, String $lastMessage, long $timestamp, String $chatId, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.mo8127bindText(1, $lastMessage);
            _stmt.mo8125bindLong(2, $timestamp);
            _stmt.mo8127bindText(3, $chatId);
            _stmt.step();
            _stmt.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            _stmt.close();
            throw th;
        }
    }

    @Override // com.yhchat.canarys.data.local.CachedConversationDao
    public Object updateDoNotDisturb(final String chatId, final int doNotDisturb, Continuation<? super Unit> continuation) {
        final String _sql = "UPDATE cached_conversations SET doNotDisturb = ? WHERE chatId = ?";
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.yhchat.canarys.data.local.CachedConversationDao_Impl$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CachedConversationDao_Impl.updateDoNotDisturb$lambda$0(_sql, doNotDisturb, chatId, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateDoNotDisturb$lambda$0(String $_sql, int $doNotDisturb, String $chatId, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.mo8125bindLong(1, $doNotDisturb);
            _stmt.mo8127bindText(2, $chatId);
            _stmt.step();
            _stmt.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            _stmt.close();
            throw th;
        }
    }

    /* compiled from: CachedConversationDao_Impl.kt */
    @Metadata(m168d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005\u00a8\u0006\u0007"}, m169d2 = {"Lcom/yhchat/canarys/data/local/CachedConversationDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
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
