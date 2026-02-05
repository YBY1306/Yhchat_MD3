package com.yhchat.canarys.data.local;

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

/* compiled from: CachedMessageDao_Impl.kt */
@Metadata(m168d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001/B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0096@\u00a2\u0006\u0002\u0010\u000fJ\u001c\u0010\u0010\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0012H\u0096@\u00a2\u0006\u0002\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0096@\u00a2\u0006\u0002\u0010\u000fJ\u0016\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0096@\u00a2\u0006\u0002\u0010\u000fJ\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00120\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0096@\u00a2\u0006\u0002\u0010\u001bJ,\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0096@\u00a2\u0006\u0002\u0010!J\u0018\u0010\"\u001a\u0004\u0018\u00010\b2\u0006\u0010#\u001a\u00020\u0019H\u0096@\u00a2\u0006\u0002\u0010\u001bJ\u0018\u0010$\u001a\u0004\u0018\u00010\b2\u0006\u0010#\u001a\u00020\u0019H\u0096@\u00a2\u0006\u0002\u0010\u001bJ\u0016\u0010%\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u0019H\u0096@\u00a2\u0006\u0002\u0010\u001bJ \u0010&\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010'\u001a\u00020 H\u0096@\u00a2\u0006\u0002\u0010(J\u0016\u0010\u0014\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u0019H\u0096@\u00a2\u0006\u0002\u0010\u001bJ\u0016\u0010)\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019H\u0096@\u00a2\u0006\u0002\u0010\u001bJ\u000e\u0010*\u001a\u00020\rH\u0096@\u00a2\u0006\u0002\u0010+J\u0016\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020\u001eH\u0096@\u00a2\u0006\u0002\u0010.R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, m169d2 = {"Lcom/yhchat/canarys/data/local/CachedMessageDao_Impl;", "Lcom/yhchat/canarys/data/local/CachedMessageDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfCachedMessage", "Landroidx/room/EntityInsertAdapter;", "Lcom/yhchat/canarys/data/local/CachedMessage;", "__deleteAdapterOfCachedMessage", "Landroidx/room/EntityDeleteOrUpdateAdapter;", "__updateAdapterOfCachedMessage", "insertMessage", "", "message", "(Lcom/yhchat/canarys/data/local/CachedMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertMessages", "messages", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteMessage", "updateMessage", "getMessages", "Lkotlinx/coroutines/flow/Flow;", ChatSearchActivity.EXTRA_CHAT_ID, "", "getMessagesSync", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMessagesBySeq", "msgSeq", "", "limit", "", "(Ljava/lang/String;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMessage", "msgId", "getMessageById", "getMessageCount", "getLastMessage", ChatSearchActivity.EXTRA_CHAT_TYPE, "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearChatMessages", "clearAllMessages", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteOldMessages", "timestamp", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes7.dex */
public final class CachedMessageDao_Impl implements CachedMessageDao {
    private final RoomDatabase __db;
    private final EntityDeleteOrUpdateAdapter<CachedMessage> __deleteAdapterOfCachedMessage;
    private final EntityInsertAdapter<CachedMessage> __insertAdapterOfCachedMessage;
    private final EntityDeleteOrUpdateAdapter<CachedMessage> __updateAdapterOfCachedMessage;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public CachedMessageDao_Impl(RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfCachedMessage = new EntityInsertAdapter<CachedMessage>() { // from class: com.yhchat.canarys.data.local.CachedMessageDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `cached_messages` (`msgId`,`chatId`,`chatType`,`senderChatId`,`senderName`,`senderAvatarUrl`,`direction`,`contentType`,`contentText`,`contentImageUrl`,`contentFileName`,`contentFileUrl`,`quoteMsgText`,`quoteImageUrl`,`sendTime`,`msgSeq`,`editTime`,`msgDeleteTime`,`quoteMsgId`,`cmdName`,`cmdType`,`localInsertTime`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, CachedMessage entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.mo8127bindText(1, entity.getMsgId());
                statement.mo8127bindText(2, entity.getChatId());
                statement.mo8125bindLong(3, entity.getChatType());
                statement.mo8127bindText(4, entity.getSenderChatId());
                statement.mo8127bindText(5, entity.getSenderName());
                statement.mo8127bindText(6, entity.getSenderAvatarUrl());
                statement.mo8127bindText(7, entity.getDirection());
                statement.mo8125bindLong(8, entity.getContentType());
                String _tmpContentText = entity.getContentText();
                if (_tmpContentText == null) {
                    statement.mo8126bindNull(9);
                } else {
                    statement.mo8127bindText(9, _tmpContentText);
                }
                String _tmpContentImageUrl = entity.getContentImageUrl();
                if (_tmpContentImageUrl == null) {
                    statement.mo8126bindNull(10);
                } else {
                    statement.mo8127bindText(10, _tmpContentImageUrl);
                }
                String _tmpContentFileName = entity.getContentFileName();
                if (_tmpContentFileName == null) {
                    statement.mo8126bindNull(11);
                } else {
                    statement.mo8127bindText(11, _tmpContentFileName);
                }
                String _tmpContentFileUrl = entity.getContentFileUrl();
                if (_tmpContentFileUrl == null) {
                    statement.mo8126bindNull(12);
                } else {
                    statement.mo8127bindText(12, _tmpContentFileUrl);
                }
                String _tmpQuoteMsgText = entity.getQuoteMsgText();
                if (_tmpQuoteMsgText == null) {
                    statement.mo8126bindNull(13);
                } else {
                    statement.mo8127bindText(13, _tmpQuoteMsgText);
                }
                String _tmpQuoteImageUrl = entity.getQuoteImageUrl();
                if (_tmpQuoteImageUrl == null) {
                    statement.mo8126bindNull(14);
                } else {
                    statement.mo8127bindText(14, _tmpQuoteImageUrl);
                }
                statement.mo8125bindLong(15, entity.getSendTime());
                Long _tmpMsgSeq = entity.getMsgSeq();
                if (_tmpMsgSeq != null) {
                    statement.mo8125bindLong(16, _tmpMsgSeq.longValue());
                } else {
                    statement.mo8126bindNull(16);
                }
                Long _tmpEditTime = entity.getEditTime();
                if (_tmpEditTime != null) {
                    statement.mo8125bindLong(17, _tmpEditTime.longValue());
                } else {
                    statement.mo8126bindNull(17);
                }
                Long _tmpMsgDeleteTime = entity.getMsgDeleteTime();
                if (_tmpMsgDeleteTime != null) {
                    statement.mo8125bindLong(18, _tmpMsgDeleteTime.longValue());
                } else {
                    statement.mo8126bindNull(18);
                }
                String _tmpQuoteMsgId = entity.getQuoteMsgId();
                if (_tmpQuoteMsgId == null) {
                    statement.mo8126bindNull(19);
                } else {
                    statement.mo8127bindText(19, _tmpQuoteMsgId);
                }
                String _tmpCmdName = entity.getCmdName();
                if (_tmpCmdName == null) {
                    statement.mo8126bindNull(20);
                } else {
                    statement.mo8127bindText(20, _tmpCmdName);
                }
                Integer _tmpCmdType = entity.getCmdType();
                if (_tmpCmdType != null) {
                    statement.mo8125bindLong(21, _tmpCmdType.intValue());
                } else {
                    statement.mo8126bindNull(21);
                }
                statement.mo8125bindLong(22, entity.getLocalInsertTime());
            }
        };
        this.__deleteAdapterOfCachedMessage = new EntityDeleteOrUpdateAdapter<CachedMessage>() { // from class: com.yhchat.canarys.data.local.CachedMessageDao_Impl.2
            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            protected String createQuery() {
                return "DELETE FROM `cached_messages` WHERE `msgId` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            public void bind(SQLiteStatement statement, CachedMessage entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.mo8127bindText(1, entity.getMsgId());
            }
        };
        this.__updateAdapterOfCachedMessage = new EntityDeleteOrUpdateAdapter<CachedMessage>() { // from class: com.yhchat.canarys.data.local.CachedMessageDao_Impl.3
            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            protected String createQuery() {
                return "UPDATE OR ABORT `cached_messages` SET `msgId` = ?,`chatId` = ?,`chatType` = ?,`senderChatId` = ?,`senderName` = ?,`senderAvatarUrl` = ?,`direction` = ?,`contentType` = ?,`contentText` = ?,`contentImageUrl` = ?,`contentFileName` = ?,`contentFileUrl` = ?,`quoteMsgText` = ?,`quoteImageUrl` = ?,`sendTime` = ?,`msgSeq` = ?,`editTime` = ?,`msgDeleteTime` = ?,`quoteMsgId` = ?,`cmdName` = ?,`cmdType` = ?,`localInsertTime` = ? WHERE `msgId` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            public void bind(SQLiteStatement statement, CachedMessage entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.mo8127bindText(1, entity.getMsgId());
                statement.mo8127bindText(2, entity.getChatId());
                statement.mo8125bindLong(3, entity.getChatType());
                statement.mo8127bindText(4, entity.getSenderChatId());
                statement.mo8127bindText(5, entity.getSenderName());
                statement.mo8127bindText(6, entity.getSenderAvatarUrl());
                statement.mo8127bindText(7, entity.getDirection());
                statement.mo8125bindLong(8, entity.getContentType());
                String _tmpContentText = entity.getContentText();
                if (_tmpContentText == null) {
                    statement.mo8126bindNull(9);
                } else {
                    statement.mo8127bindText(9, _tmpContentText);
                }
                String _tmpContentImageUrl = entity.getContentImageUrl();
                if (_tmpContentImageUrl == null) {
                    statement.mo8126bindNull(10);
                } else {
                    statement.mo8127bindText(10, _tmpContentImageUrl);
                }
                String _tmpContentFileName = entity.getContentFileName();
                if (_tmpContentFileName == null) {
                    statement.mo8126bindNull(11);
                } else {
                    statement.mo8127bindText(11, _tmpContentFileName);
                }
                String _tmpContentFileUrl = entity.getContentFileUrl();
                if (_tmpContentFileUrl == null) {
                    statement.mo8126bindNull(12);
                } else {
                    statement.mo8127bindText(12, _tmpContentFileUrl);
                }
                String _tmpQuoteMsgText = entity.getQuoteMsgText();
                if (_tmpQuoteMsgText == null) {
                    statement.mo8126bindNull(13);
                } else {
                    statement.mo8127bindText(13, _tmpQuoteMsgText);
                }
                String _tmpQuoteImageUrl = entity.getQuoteImageUrl();
                if (_tmpQuoteImageUrl == null) {
                    statement.mo8126bindNull(14);
                } else {
                    statement.mo8127bindText(14, _tmpQuoteImageUrl);
                }
                statement.mo8125bindLong(15, entity.getSendTime());
                Long _tmpMsgSeq = entity.getMsgSeq();
                if (_tmpMsgSeq != null) {
                    statement.mo8125bindLong(16, _tmpMsgSeq.longValue());
                } else {
                    statement.mo8126bindNull(16);
                }
                Long _tmpEditTime = entity.getEditTime();
                if (_tmpEditTime != null) {
                    statement.mo8125bindLong(17, _tmpEditTime.longValue());
                } else {
                    statement.mo8126bindNull(17);
                }
                Long _tmpMsgDeleteTime = entity.getMsgDeleteTime();
                if (_tmpMsgDeleteTime != null) {
                    statement.mo8125bindLong(18, _tmpMsgDeleteTime.longValue());
                } else {
                    statement.mo8126bindNull(18);
                }
                String _tmpQuoteMsgId = entity.getQuoteMsgId();
                if (_tmpQuoteMsgId == null) {
                    statement.mo8126bindNull(19);
                } else {
                    statement.mo8127bindText(19, _tmpQuoteMsgId);
                }
                String _tmpCmdName = entity.getCmdName();
                if (_tmpCmdName == null) {
                    statement.mo8126bindNull(20);
                } else {
                    statement.mo8127bindText(20, _tmpCmdName);
                }
                Integer _tmpCmdType = entity.getCmdType();
                if (_tmpCmdType != null) {
                    statement.mo8125bindLong(21, _tmpCmdType.intValue());
                } else {
                    statement.mo8126bindNull(21);
                }
                statement.mo8125bindLong(22, entity.getLocalInsertTime());
                statement.mo8127bindText(23, entity.getMsgId());
            }
        };
    }

    @Override // com.yhchat.canarys.data.local.CachedMessageDao
    public Object insertMessage(final CachedMessage message, Continuation<? super Unit> continuation) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.yhchat.canarys.data.local.CachedMessageDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CachedMessageDao_Impl.insertMessage$lambda$0(this.f$0, message, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insertMessage$lambda$0(CachedMessageDao_Impl this$0, CachedMessage $message, SQLiteConnection _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        this$0.__insertAdapterOfCachedMessage.insert(_connection, (SQLiteConnection) $message);
        return Unit.INSTANCE;
    }

    @Override // com.yhchat.canarys.data.local.CachedMessageDao
    public Object insertMessages(final List<CachedMessage> list, Continuation<? super Unit> continuation) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.yhchat.canarys.data.local.CachedMessageDao_Impl$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CachedMessageDao_Impl.insertMessages$lambda$0(this.f$0, list, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insertMessages$lambda$0(CachedMessageDao_Impl this$0, List $messages, SQLiteConnection _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        this$0.__insertAdapterOfCachedMessage.insert(_connection, $messages);
        return Unit.INSTANCE;
    }

    @Override // com.yhchat.canarys.data.local.CachedMessageDao
    public Object deleteMessage(final CachedMessage message, Continuation<? super Unit> continuation) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.yhchat.canarys.data.local.CachedMessageDao_Impl$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CachedMessageDao_Impl.deleteMessage$lambda$0(this.f$0, message, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteMessage$lambda$0(CachedMessageDao_Impl this$0, CachedMessage $message, SQLiteConnection _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        this$0.__deleteAdapterOfCachedMessage.handle(_connection, $message);
        return Unit.INSTANCE;
    }

    @Override // com.yhchat.canarys.data.local.CachedMessageDao
    public Object updateMessage(final CachedMessage message, Continuation<? super Unit> continuation) {
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.yhchat.canarys.data.local.CachedMessageDao_Impl$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CachedMessageDao_Impl.updateMessage$lambda$0(this.f$0, message, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateMessage$lambda$0(CachedMessageDao_Impl this$0, CachedMessage $message, SQLiteConnection _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        this$0.__updateAdapterOfCachedMessage.handle(_connection, $message);
        return Unit.INSTANCE;
    }

    @Override // com.yhchat.canarys.data.local.CachedMessageDao
    public Flow<List<CachedMessage>> getMessages(final String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        final String _sql = "SELECT * FROM cached_messages WHERE chatId = ? ORDER BY sendTime ASC";
        return FlowUtil.createFlow(this.__db, false, new String[]{"cached_messages"}, new Function1() { // from class: com.yhchat.canarys.data.local.CachedMessageDao_Impl$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CachedMessageDao_Impl.getMessages$lambda$0(_sql, chatId, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getMessages$lambda$0(String $_sql, String $chatId, SQLiteConnection _connection) {
        String _tmpContentText;
        String _tmpContentImageUrl;
        String _tmpContentFileName;
        String _tmpContentFileUrl;
        String _tmpQuoteMsgText;
        String _tmpQuoteImageUrl;
        Long _tmpMsgSeq;
        Long _tmpEditTime;
        Long _tmpMsgDeleteTime;
        String _tmpQuoteMsgId;
        String _tmpCmdName;
        int _columnIndexOfQuoteMsgText;
        int _columnIndexOfQuoteImageUrl;
        Integer _tmpCmdType;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.mo8127bindText(1, $chatId);
            int _columnIndexOfMsgId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "msgId");
            int _columnIndexOfSendTime = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, ChatSearchActivity.EXTRA_CHAT_ID);
            int _columnIndexOfChatType = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, ChatSearchActivity.EXTRA_CHAT_TYPE);
            int _columnIndexOfSenderChatId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "senderChatId");
            int _columnIndexOfSenderName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "senderName");
            int _columnIndexOfSenderAvatarUrl = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "senderAvatarUrl");
            int _columnIndexOfDirection = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "direction");
            int _columnIndexOfContentType = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "contentType");
            int _columnIndexOfContentText = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "contentText");
            int _columnIndexOfContentImageUrl = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "contentImageUrl");
            int _columnIndexOfContentFileName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "contentFileName");
            int _columnIndexOfCmdType = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "contentFileUrl");
            int _columnIndexOfQuoteMsgText2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "quoteMsgText");
            int _columnIndexOfQuoteImageUrl2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "quoteImageUrl");
            int _columnIndexOfSendTime2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "sendTime");
            int _columnIndexOfSendTime3 = _columnIndexOfSendTime2;
            int _columnIndexOfMsgSeq = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "msgSeq");
            int _columnIndexOfMsgSeq2 = _columnIndexOfMsgSeq;
            int _columnIndexOfEditTime = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "editTime");
            int _columnIndexOfEditTime2 = _columnIndexOfEditTime;
            int _columnIndexOfMsgDeleteTime = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "msgDeleteTime");
            int _columnIndexOfMsgDeleteTime2 = _columnIndexOfMsgDeleteTime;
            int _columnIndexOfQuoteMsgId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "quoteMsgId");
            int _columnIndexOfQuoteMsgId2 = _columnIndexOfQuoteMsgId;
            int _columnIndexOfCmdName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "cmdName");
            int _columnIndexOfCmdName2 = _columnIndexOfCmdName;
            int _columnIndexOfCmdType2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "cmdType");
            int _columnIndexOfQuoteMsgText3 = _columnIndexOfCmdType2;
            int _columnIndexOfLocalInsertTime = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "localInsertTime");
            List _result = new ArrayList();
            while (_stmt.step()) {
                String _tmpMsgId = _stmt.getText(_columnIndexOfMsgId);
                String _tmpChatId = _stmt.getText(_columnIndexOfSendTime);
                int _columnIndexOfMsgId2 = _columnIndexOfMsgId;
                int _columnIndexOfChatId = _columnIndexOfSendTime;
                int _tmpChatType = (int) _stmt.getLong(_columnIndexOfChatType);
                String _tmpSenderChatId = _stmt.getText(_columnIndexOfSenderChatId);
                String _tmpSenderName = _stmt.getText(_columnIndexOfSenderName);
                String _tmpSenderAvatarUrl = _stmt.getText(_columnIndexOfSenderAvatarUrl);
                String _tmpDirection = _stmt.getText(_columnIndexOfDirection);
                int _tmpContentType = (int) _stmt.getLong(_columnIndexOfContentType);
                if (_stmt.isNull(_columnIndexOfContentText)) {
                    _tmpContentText = null;
                } else {
                    String _tmpContentText2 = _stmt.getText(_columnIndexOfContentText);
                    _tmpContentText = _tmpContentText2;
                }
                if (_stmt.isNull(_columnIndexOfContentImageUrl)) {
                    _tmpContentImageUrl = null;
                } else {
                    String _tmpContentImageUrl2 = _stmt.getText(_columnIndexOfContentImageUrl);
                    _tmpContentImageUrl = _tmpContentImageUrl2;
                }
                if (_stmt.isNull(_columnIndexOfContentFileName)) {
                    _tmpContentFileName = null;
                } else {
                    String _tmpContentFileName2 = _stmt.getText(_columnIndexOfContentFileName);
                    _tmpContentFileName = _tmpContentFileName2;
                }
                if (_stmt.isNull(_columnIndexOfCmdType)) {
                    _tmpContentFileUrl = null;
                } else {
                    String _tmpContentFileUrl2 = _stmt.getText(_columnIndexOfCmdType);
                    _tmpContentFileUrl = _tmpContentFileUrl2;
                }
                if (_stmt.isNull(_columnIndexOfQuoteMsgText2)) {
                    _tmpQuoteMsgText = null;
                } else {
                    String _tmpQuoteMsgText2 = _stmt.getText(_columnIndexOfQuoteMsgText2);
                    _tmpQuoteMsgText = _tmpQuoteMsgText2;
                }
                if (_stmt.isNull(_columnIndexOfQuoteImageUrl2)) {
                    _tmpQuoteImageUrl = null;
                } else {
                    String _tmpQuoteImageUrl2 = _stmt.getText(_columnIndexOfQuoteImageUrl2);
                    _tmpQuoteImageUrl = _tmpQuoteImageUrl2;
                }
                int _columnIndexOfSendTime4 = _columnIndexOfSendTime3;
                long _tmpSendTime = _stmt.getLong(_columnIndexOfSendTime4);
                int _columnIndexOfContentFileUrl = _columnIndexOfCmdType;
                int _columnIndexOfContentFileUrl2 = _columnIndexOfMsgSeq2;
                if (_stmt.isNull(_columnIndexOfContentFileUrl2)) {
                    _tmpMsgSeq = null;
                } else {
                    Long _tmpMsgSeq2 = Long.valueOf(_stmt.getLong(_columnIndexOfContentFileUrl2));
                    _tmpMsgSeq = _tmpMsgSeq2;
                }
                _columnIndexOfMsgSeq2 = _columnIndexOfContentFileUrl2;
                int _columnIndexOfMsgSeq3 = _columnIndexOfEditTime2;
                if (_stmt.isNull(_columnIndexOfMsgSeq3)) {
                    _tmpEditTime = null;
                } else {
                    Long _tmpEditTime2 = Long.valueOf(_stmt.getLong(_columnIndexOfMsgSeq3));
                    _tmpEditTime = _tmpEditTime2;
                }
                _columnIndexOfEditTime2 = _columnIndexOfMsgSeq3;
                int _columnIndexOfEditTime3 = _columnIndexOfMsgDeleteTime2;
                if (_stmt.isNull(_columnIndexOfEditTime3)) {
                    _tmpMsgDeleteTime = null;
                } else {
                    Long _tmpMsgDeleteTime2 = Long.valueOf(_stmt.getLong(_columnIndexOfEditTime3));
                    _tmpMsgDeleteTime = _tmpMsgDeleteTime2;
                }
                _columnIndexOfMsgDeleteTime2 = _columnIndexOfEditTime3;
                int _columnIndexOfMsgDeleteTime3 = _columnIndexOfQuoteMsgId2;
                if (_stmt.isNull(_columnIndexOfMsgDeleteTime3)) {
                    _tmpQuoteMsgId = null;
                } else {
                    String _tmpQuoteMsgId2 = _stmt.getText(_columnIndexOfMsgDeleteTime3);
                    _tmpQuoteMsgId = _tmpQuoteMsgId2;
                }
                _columnIndexOfQuoteMsgId2 = _columnIndexOfMsgDeleteTime3;
                int _columnIndexOfQuoteMsgId3 = _columnIndexOfCmdName2;
                if (_stmt.isNull(_columnIndexOfQuoteMsgId3)) {
                    _tmpCmdName = null;
                } else {
                    String _tmpCmdName2 = _stmt.getText(_columnIndexOfQuoteMsgId3);
                    _tmpCmdName = _tmpCmdName2;
                }
                _columnIndexOfCmdName2 = _columnIndexOfQuoteMsgId3;
                int _columnIndexOfCmdName3 = _columnIndexOfQuoteMsgText3;
                if (_stmt.isNull(_columnIndexOfCmdName3)) {
                    _columnIndexOfQuoteMsgText = _columnIndexOfQuoteMsgText2;
                    _columnIndexOfQuoteImageUrl = _columnIndexOfQuoteImageUrl2;
                    _tmpCmdType = null;
                } else {
                    _columnIndexOfQuoteMsgText = _columnIndexOfQuoteMsgText2;
                    _columnIndexOfQuoteImageUrl = _columnIndexOfQuoteImageUrl2;
                    Integer _tmpCmdType2 = Integer.valueOf((int) _stmt.getLong(_columnIndexOfCmdName3));
                    _tmpCmdType = _tmpCmdType2;
                }
                long _tmpLocalInsertTime = _stmt.getLong(_columnIndexOfLocalInsertTime);
                CachedMessage _item = new CachedMessage(_tmpMsgId, _tmpChatId, _tmpChatType, _tmpSenderChatId, _tmpSenderName, _tmpSenderAvatarUrl, _tmpDirection, _tmpContentType, _tmpContentText, _tmpContentImageUrl, _tmpContentFileName, _tmpContentFileUrl, _tmpQuoteMsgText, _tmpQuoteImageUrl, _tmpSendTime, _tmpMsgSeq, _tmpEditTime, _tmpMsgDeleteTime, _tmpQuoteMsgId, _tmpCmdName, _tmpCmdType, _tmpLocalInsertTime);
                List _result2 = _result;
                _result2.add(_item);
                _result = _result2;
                _columnIndexOfSendTime3 = _columnIndexOfSendTime4;
                _columnIndexOfQuoteMsgText2 = _columnIndexOfQuoteMsgText;
                _columnIndexOfMsgId = _columnIndexOfMsgId2;
                _columnIndexOfSendTime = _columnIndexOfChatId;
                _columnIndexOfQuoteImageUrl2 = _columnIndexOfQuoteImageUrl;
                _columnIndexOfQuoteMsgText3 = _columnIndexOfCmdName3;
                _columnIndexOfCmdType = _columnIndexOfContentFileUrl;
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.yhchat.canarys.data.local.CachedMessageDao
    public Object getMessagesSync(final String chatId, Continuation<? super List<CachedMessage>> continuation) {
        final String _sql = "SELECT * FROM cached_messages WHERE chatId = ? ORDER BY sendTime ASC";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.yhchat.canarys.data.local.CachedMessageDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CachedMessageDao_Impl.getMessagesSync$lambda$0(_sql, chatId, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getMessagesSync$lambda$0(String $_sql, String $chatId, SQLiteConnection _connection) {
        String _tmpContentText;
        String _tmpContentImageUrl;
        String _tmpContentFileName;
        String _tmpContentFileUrl;
        String _tmpQuoteMsgText;
        String _tmpQuoteImageUrl;
        Long _tmpMsgSeq;
        Long _tmpEditTime;
        Long _tmpMsgDeleteTime;
        String _tmpQuoteMsgId;
        String _tmpCmdName;
        int _columnIndexOfQuoteMsgText;
        int _columnIndexOfQuoteImageUrl;
        Integer _tmpCmdType;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.mo8127bindText(1, $chatId);
            int _columnIndexOfMsgId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "msgId");
            int _columnIndexOfSendTime = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, ChatSearchActivity.EXTRA_CHAT_ID);
            int _columnIndexOfChatType = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, ChatSearchActivity.EXTRA_CHAT_TYPE);
            int _columnIndexOfSenderChatId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "senderChatId");
            int _columnIndexOfSenderName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "senderName");
            int _columnIndexOfSenderAvatarUrl = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "senderAvatarUrl");
            int _columnIndexOfDirection = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "direction");
            int _columnIndexOfContentType = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "contentType");
            int _columnIndexOfContentText = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "contentText");
            int _columnIndexOfContentImageUrl = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "contentImageUrl");
            int _columnIndexOfContentFileName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "contentFileName");
            int _columnIndexOfCmdType = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "contentFileUrl");
            int _columnIndexOfQuoteMsgText2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "quoteMsgText");
            int _columnIndexOfQuoteImageUrl2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "quoteImageUrl");
            int _columnIndexOfSendTime2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "sendTime");
            int _columnIndexOfSendTime3 = _columnIndexOfSendTime2;
            int _columnIndexOfMsgSeq = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "msgSeq");
            int _columnIndexOfMsgSeq2 = _columnIndexOfMsgSeq;
            int _columnIndexOfEditTime = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "editTime");
            int _columnIndexOfEditTime2 = _columnIndexOfEditTime;
            int _columnIndexOfMsgDeleteTime = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "msgDeleteTime");
            int _columnIndexOfMsgDeleteTime2 = _columnIndexOfMsgDeleteTime;
            int _columnIndexOfQuoteMsgId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "quoteMsgId");
            int _columnIndexOfQuoteMsgId2 = _columnIndexOfQuoteMsgId;
            int _columnIndexOfCmdName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "cmdName");
            int _columnIndexOfCmdName2 = _columnIndexOfCmdName;
            int _columnIndexOfCmdType2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "cmdType");
            int _columnIndexOfQuoteMsgText3 = _columnIndexOfCmdType2;
            int _columnIndexOfLocalInsertTime = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "localInsertTime");
            List _result = new ArrayList();
            while (_stmt.step()) {
                String _tmpMsgId = _stmt.getText(_columnIndexOfMsgId);
                String _tmpChatId = _stmt.getText(_columnIndexOfSendTime);
                int _columnIndexOfMsgId2 = _columnIndexOfMsgId;
                int _columnIndexOfChatId = _columnIndexOfSendTime;
                int _tmpChatType = (int) _stmt.getLong(_columnIndexOfChatType);
                String _tmpSenderChatId = _stmt.getText(_columnIndexOfSenderChatId);
                String _tmpSenderName = _stmt.getText(_columnIndexOfSenderName);
                String _tmpSenderAvatarUrl = _stmt.getText(_columnIndexOfSenderAvatarUrl);
                String _tmpDirection = _stmt.getText(_columnIndexOfDirection);
                int _tmpContentType = (int) _stmt.getLong(_columnIndexOfContentType);
                if (_stmt.isNull(_columnIndexOfContentText)) {
                    _tmpContentText = null;
                } else {
                    String _tmpContentText2 = _stmt.getText(_columnIndexOfContentText);
                    _tmpContentText = _tmpContentText2;
                }
                if (_stmt.isNull(_columnIndexOfContentImageUrl)) {
                    _tmpContentImageUrl = null;
                } else {
                    String _tmpContentImageUrl2 = _stmt.getText(_columnIndexOfContentImageUrl);
                    _tmpContentImageUrl = _tmpContentImageUrl2;
                }
                if (_stmt.isNull(_columnIndexOfContentFileName)) {
                    _tmpContentFileName = null;
                } else {
                    String _tmpContentFileName2 = _stmt.getText(_columnIndexOfContentFileName);
                    _tmpContentFileName = _tmpContentFileName2;
                }
                if (_stmt.isNull(_columnIndexOfCmdType)) {
                    _tmpContentFileUrl = null;
                } else {
                    String _tmpContentFileUrl2 = _stmt.getText(_columnIndexOfCmdType);
                    _tmpContentFileUrl = _tmpContentFileUrl2;
                }
                if (_stmt.isNull(_columnIndexOfQuoteMsgText2)) {
                    _tmpQuoteMsgText = null;
                } else {
                    String _tmpQuoteMsgText2 = _stmt.getText(_columnIndexOfQuoteMsgText2);
                    _tmpQuoteMsgText = _tmpQuoteMsgText2;
                }
                if (_stmt.isNull(_columnIndexOfQuoteImageUrl2)) {
                    _tmpQuoteImageUrl = null;
                } else {
                    String _tmpQuoteImageUrl2 = _stmt.getText(_columnIndexOfQuoteImageUrl2);
                    _tmpQuoteImageUrl = _tmpQuoteImageUrl2;
                }
                int _columnIndexOfSendTime4 = _columnIndexOfSendTime3;
                long _tmpSendTime = _stmt.getLong(_columnIndexOfSendTime4);
                int _columnIndexOfContentFileUrl = _columnIndexOfCmdType;
                int _columnIndexOfContentFileUrl2 = _columnIndexOfMsgSeq2;
                if (_stmt.isNull(_columnIndexOfContentFileUrl2)) {
                    _tmpMsgSeq = null;
                } else {
                    Long _tmpMsgSeq2 = Long.valueOf(_stmt.getLong(_columnIndexOfContentFileUrl2));
                    _tmpMsgSeq = _tmpMsgSeq2;
                }
                _columnIndexOfMsgSeq2 = _columnIndexOfContentFileUrl2;
                int _columnIndexOfMsgSeq3 = _columnIndexOfEditTime2;
                if (_stmt.isNull(_columnIndexOfMsgSeq3)) {
                    _tmpEditTime = null;
                } else {
                    Long _tmpEditTime2 = Long.valueOf(_stmt.getLong(_columnIndexOfMsgSeq3));
                    _tmpEditTime = _tmpEditTime2;
                }
                _columnIndexOfEditTime2 = _columnIndexOfMsgSeq3;
                int _columnIndexOfEditTime3 = _columnIndexOfMsgDeleteTime2;
                if (_stmt.isNull(_columnIndexOfEditTime3)) {
                    _tmpMsgDeleteTime = null;
                } else {
                    Long _tmpMsgDeleteTime2 = Long.valueOf(_stmt.getLong(_columnIndexOfEditTime3));
                    _tmpMsgDeleteTime = _tmpMsgDeleteTime2;
                }
                _columnIndexOfMsgDeleteTime2 = _columnIndexOfEditTime3;
                int _columnIndexOfMsgDeleteTime3 = _columnIndexOfQuoteMsgId2;
                if (_stmt.isNull(_columnIndexOfMsgDeleteTime3)) {
                    _tmpQuoteMsgId = null;
                } else {
                    String _tmpQuoteMsgId2 = _stmt.getText(_columnIndexOfMsgDeleteTime3);
                    _tmpQuoteMsgId = _tmpQuoteMsgId2;
                }
                _columnIndexOfQuoteMsgId2 = _columnIndexOfMsgDeleteTime3;
                int _columnIndexOfQuoteMsgId3 = _columnIndexOfCmdName2;
                if (_stmt.isNull(_columnIndexOfQuoteMsgId3)) {
                    _tmpCmdName = null;
                } else {
                    String _tmpCmdName2 = _stmt.getText(_columnIndexOfQuoteMsgId3);
                    _tmpCmdName = _tmpCmdName2;
                }
                _columnIndexOfCmdName2 = _columnIndexOfQuoteMsgId3;
                int _columnIndexOfCmdName3 = _columnIndexOfQuoteMsgText3;
                if (_stmt.isNull(_columnIndexOfCmdName3)) {
                    _columnIndexOfQuoteMsgText = _columnIndexOfQuoteMsgText2;
                    _columnIndexOfQuoteImageUrl = _columnIndexOfQuoteImageUrl2;
                    _tmpCmdType = null;
                } else {
                    _columnIndexOfQuoteMsgText = _columnIndexOfQuoteMsgText2;
                    _columnIndexOfQuoteImageUrl = _columnIndexOfQuoteImageUrl2;
                    Integer _tmpCmdType2 = Integer.valueOf((int) _stmt.getLong(_columnIndexOfCmdName3));
                    _tmpCmdType = _tmpCmdType2;
                }
                long _tmpLocalInsertTime = _stmt.getLong(_columnIndexOfLocalInsertTime);
                CachedMessage _item = new CachedMessage(_tmpMsgId, _tmpChatId, _tmpChatType, _tmpSenderChatId, _tmpSenderName, _tmpSenderAvatarUrl, _tmpDirection, _tmpContentType, _tmpContentText, _tmpContentImageUrl, _tmpContentFileName, _tmpContentFileUrl, _tmpQuoteMsgText, _tmpQuoteImageUrl, _tmpSendTime, _tmpMsgSeq, _tmpEditTime, _tmpMsgDeleteTime, _tmpQuoteMsgId, _tmpCmdName, _tmpCmdType, _tmpLocalInsertTime);
                List _result2 = _result;
                _result2.add(_item);
                _result = _result2;
                _columnIndexOfSendTime3 = _columnIndexOfSendTime4;
                _columnIndexOfQuoteMsgText2 = _columnIndexOfQuoteMsgText;
                _columnIndexOfMsgId = _columnIndexOfMsgId2;
                _columnIndexOfSendTime = _columnIndexOfChatId;
                _columnIndexOfQuoteImageUrl2 = _columnIndexOfQuoteImageUrl;
                _columnIndexOfQuoteMsgText3 = _columnIndexOfCmdName3;
                _columnIndexOfCmdType = _columnIndexOfContentFileUrl;
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.yhchat.canarys.data.local.CachedMessageDao
    public Object getMessagesBySeq(final String chatId, final long msgSeq, final int limit, Continuation<? super List<CachedMessage>> continuation) {
        final String _sql = "SELECT * FROM cached_messages WHERE chatId = ? AND msgSeq > ? ORDER BY sendTime ASC LIMIT ?";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.yhchat.canarys.data.local.CachedMessageDao_Impl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CachedMessageDao_Impl.getMessagesBySeq$lambda$0(_sql, chatId, msgSeq, limit, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getMessagesBySeq$lambda$0(String $_sql, String $chatId, long $msgSeq, int $limit, SQLiteConnection _connection) {
        String _tmpContentText;
        String _tmpContentImageUrl;
        String _tmpContentFileName;
        String _tmpContentFileUrl;
        String _tmpQuoteMsgText;
        String _tmpQuoteImageUrl;
        Long _tmpMsgSeq;
        Long _tmpEditTime;
        Long _tmpMsgDeleteTime;
        String _tmpQuoteMsgId;
        String _tmpCmdName;
        int _columnIndexOfContentImageUrl;
        int _columnIndexOfContentFileName;
        Integer _tmpCmdType;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.mo8127bindText(1, $chatId);
            _stmt.mo8125bindLong(2, $msgSeq);
            _stmt.mo8125bindLong(3, $limit);
            int _columnIndexOfMsgId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "msgId");
            int _columnIndexOfSendTime = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, ChatSearchActivity.EXTRA_CHAT_ID);
            int _columnIndexOfChatType = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, ChatSearchActivity.EXTRA_CHAT_TYPE);
            int _columnIndexOfSenderChatId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "senderChatId");
            int _columnIndexOfSenderName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "senderName");
            int _columnIndexOfSenderAvatarUrl = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "senderAvatarUrl");
            int _columnIndexOfDirection = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "direction");
            int _columnIndexOfContentType = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "contentType");
            int _columnIndexOfCmdType = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "contentText");
            int _columnIndexOfContentImageUrl2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "contentImageUrl");
            int _columnIndexOfContentFileName2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "contentFileName");
            int _columnIndexOfContentFileUrl = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "contentFileUrl");
            int _columnIndexOfQuoteMsgText = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "quoteMsgText");
            int _columnIndexOfQuoteImageUrl = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "quoteImageUrl");
            int _columnIndexOfSendTime2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "sendTime");
            int _columnIndexOfSendTime3 = _columnIndexOfSendTime2;
            int _columnIndexOfMsgSeq = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "msgSeq");
            int _columnIndexOfMsgSeq2 = _columnIndexOfMsgSeq;
            int _columnIndexOfEditTime = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "editTime");
            int _columnIndexOfEditTime2 = _columnIndexOfEditTime;
            int _columnIndexOfMsgDeleteTime = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "msgDeleteTime");
            int _columnIndexOfMsgDeleteTime2 = _columnIndexOfMsgDeleteTime;
            int _columnIndexOfQuoteMsgId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "quoteMsgId");
            int _columnIndexOfQuoteMsgId2 = _columnIndexOfQuoteMsgId;
            int _columnIndexOfCmdName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "cmdName");
            int _columnIndexOfCmdName2 = _columnIndexOfCmdName;
            int _columnIndexOfCmdType2 = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "cmdType");
            int _columnIndexOfContentImageUrl3 = _columnIndexOfCmdType2;
            int _columnIndexOfLocalInsertTime = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "localInsertTime");
            List _result = new ArrayList();
            while (_stmt.step()) {
                String _tmpMsgId = _stmt.getText(_columnIndexOfMsgId);
                String _tmpChatId = _stmt.getText(_columnIndexOfSendTime);
                int _columnIndexOfMsgId2 = _columnIndexOfMsgId;
                int _columnIndexOfChatId = _columnIndexOfSendTime;
                int _tmpChatType = (int) _stmt.getLong(_columnIndexOfChatType);
                String _tmpSenderChatId = _stmt.getText(_columnIndexOfSenderChatId);
                String _tmpSenderName = _stmt.getText(_columnIndexOfSenderName);
                String _tmpSenderAvatarUrl = _stmt.getText(_columnIndexOfSenderAvatarUrl);
                String _tmpDirection = _stmt.getText(_columnIndexOfDirection);
                int _tmpContentType = (int) _stmt.getLong(_columnIndexOfContentType);
                if (_stmt.isNull(_columnIndexOfCmdType)) {
                    _tmpContentText = null;
                } else {
                    String _tmpContentText2 = _stmt.getText(_columnIndexOfCmdType);
                    _tmpContentText = _tmpContentText2;
                }
                if (_stmt.isNull(_columnIndexOfContentImageUrl2)) {
                    _tmpContentImageUrl = null;
                } else {
                    String _tmpContentImageUrl2 = _stmt.getText(_columnIndexOfContentImageUrl2);
                    _tmpContentImageUrl = _tmpContentImageUrl2;
                }
                if (_stmt.isNull(_columnIndexOfContentFileName2)) {
                    _tmpContentFileName = null;
                } else {
                    String _tmpContentFileName2 = _stmt.getText(_columnIndexOfContentFileName2);
                    _tmpContentFileName = _tmpContentFileName2;
                }
                if (_stmt.isNull(_columnIndexOfContentFileUrl)) {
                    _tmpContentFileUrl = null;
                } else {
                    String _tmpContentFileUrl2 = _stmt.getText(_columnIndexOfContentFileUrl);
                    _tmpContentFileUrl = _tmpContentFileUrl2;
                }
                if (_stmt.isNull(_columnIndexOfQuoteMsgText)) {
                    _tmpQuoteMsgText = null;
                } else {
                    String _tmpQuoteMsgText2 = _stmt.getText(_columnIndexOfQuoteMsgText);
                    _tmpQuoteMsgText = _tmpQuoteMsgText2;
                }
                if (_stmt.isNull(_columnIndexOfQuoteImageUrl)) {
                    _tmpQuoteImageUrl = null;
                } else {
                    String _tmpQuoteImageUrl2 = _stmt.getText(_columnIndexOfQuoteImageUrl);
                    _tmpQuoteImageUrl = _tmpQuoteImageUrl2;
                }
                int _columnIndexOfSendTime4 = _columnIndexOfSendTime3;
                long _tmpSendTime = _stmt.getLong(_columnIndexOfSendTime4);
                int _columnIndexOfContentText = _columnIndexOfCmdType;
                int _columnIndexOfContentText2 = _columnIndexOfMsgSeq2;
                if (_stmt.isNull(_columnIndexOfContentText2)) {
                    _tmpMsgSeq = null;
                } else {
                    Long _tmpMsgSeq2 = Long.valueOf(_stmt.getLong(_columnIndexOfContentText2));
                    _tmpMsgSeq = _tmpMsgSeq2;
                }
                _columnIndexOfMsgSeq2 = _columnIndexOfContentText2;
                int _columnIndexOfMsgSeq3 = _columnIndexOfEditTime2;
                if (_stmt.isNull(_columnIndexOfMsgSeq3)) {
                    _tmpEditTime = null;
                } else {
                    Long _tmpEditTime2 = Long.valueOf(_stmt.getLong(_columnIndexOfMsgSeq3));
                    _tmpEditTime = _tmpEditTime2;
                }
                _columnIndexOfEditTime2 = _columnIndexOfMsgSeq3;
                int _columnIndexOfEditTime3 = _columnIndexOfMsgDeleteTime2;
                if (_stmt.isNull(_columnIndexOfEditTime3)) {
                    _tmpMsgDeleteTime = null;
                } else {
                    Long _tmpMsgDeleteTime2 = Long.valueOf(_stmt.getLong(_columnIndexOfEditTime3));
                    _tmpMsgDeleteTime = _tmpMsgDeleteTime2;
                }
                _columnIndexOfMsgDeleteTime2 = _columnIndexOfEditTime3;
                int _columnIndexOfMsgDeleteTime3 = _columnIndexOfQuoteMsgId2;
                if (_stmt.isNull(_columnIndexOfMsgDeleteTime3)) {
                    _tmpQuoteMsgId = null;
                } else {
                    String _tmpQuoteMsgId2 = _stmt.getText(_columnIndexOfMsgDeleteTime3);
                    _tmpQuoteMsgId = _tmpQuoteMsgId2;
                }
                _columnIndexOfQuoteMsgId2 = _columnIndexOfMsgDeleteTime3;
                int _columnIndexOfQuoteMsgId3 = _columnIndexOfCmdName2;
                if (_stmt.isNull(_columnIndexOfQuoteMsgId3)) {
                    _tmpCmdName = null;
                } else {
                    String _tmpCmdName2 = _stmt.getText(_columnIndexOfQuoteMsgId3);
                    _tmpCmdName = _tmpCmdName2;
                }
                _columnIndexOfCmdName2 = _columnIndexOfQuoteMsgId3;
                int _columnIndexOfCmdName3 = _columnIndexOfContentImageUrl3;
                if (_stmt.isNull(_columnIndexOfCmdName3)) {
                    _columnIndexOfContentImageUrl = _columnIndexOfContentImageUrl2;
                    _columnIndexOfContentFileName = _columnIndexOfContentFileName2;
                    _tmpCmdType = null;
                } else {
                    _columnIndexOfContentImageUrl = _columnIndexOfContentImageUrl2;
                    _columnIndexOfContentFileName = _columnIndexOfContentFileName2;
                    Integer _tmpCmdType2 = Integer.valueOf((int) _stmt.getLong(_columnIndexOfCmdName3));
                    _tmpCmdType = _tmpCmdType2;
                }
                long _tmpLocalInsertTime = _stmt.getLong(_columnIndexOfLocalInsertTime);
                CachedMessage _item = new CachedMessage(_tmpMsgId, _tmpChatId, _tmpChatType, _tmpSenderChatId, _tmpSenderName, _tmpSenderAvatarUrl, _tmpDirection, _tmpContentType, _tmpContentText, _tmpContentImageUrl, _tmpContentFileName, _tmpContentFileUrl, _tmpQuoteMsgText, _tmpQuoteImageUrl, _tmpSendTime, _tmpMsgSeq, _tmpEditTime, _tmpMsgDeleteTime, _tmpQuoteMsgId, _tmpCmdName, _tmpCmdType, _tmpLocalInsertTime);
                List _result2 = _result;
                _result2.add(_item);
                _result = _result2;
                _columnIndexOfSendTime3 = _columnIndexOfSendTime4;
                _columnIndexOfContentImageUrl2 = _columnIndexOfContentImageUrl;
                _columnIndexOfMsgId = _columnIndexOfMsgId2;
                _columnIndexOfSendTime = _columnIndexOfChatId;
                _columnIndexOfContentFileName2 = _columnIndexOfContentFileName;
                _columnIndexOfContentImageUrl3 = _columnIndexOfCmdName3;
                _columnIndexOfCmdType = _columnIndexOfContentText;
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.yhchat.canarys.data.local.CachedMessageDao
    public Object getMessage(final String msgId, Continuation<? super CachedMessage> continuation) {
        final String _sql = "SELECT * FROM cached_messages WHERE msgId = ?";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.yhchat.canarys.data.local.CachedMessageDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CachedMessageDao_Impl.getMessage$lambda$0(_sql, msgId, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CachedMessage getMessage$lambda$0(String $_sql, String $msgId, SQLiteConnection _connection) {
        CachedMessage _result;
        String _tmpContentText;
        String _tmpContentImageUrl;
        String _tmpContentFileName;
        String _tmpContentFileUrl;
        String _tmpQuoteMsgText;
        String _tmpQuoteImageUrl;
        Long _tmpMsgSeq;
        Long _tmpEditTime;
        Long _tmpMsgDeleteTime;
        String _tmpQuoteMsgId;
        String _tmpCmdName;
        Integer _tmpCmdType;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.mo8127bindText(1, $msgId);
            int _columnIndexOfMsgId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "msgId");
            int _columnIndexOfChatId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, ChatSearchActivity.EXTRA_CHAT_ID);
            int _columnIndexOfChatType = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, ChatSearchActivity.EXTRA_CHAT_TYPE);
            int _columnIndexOfSenderChatId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "senderChatId");
            int _columnIndexOfSenderName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "senderName");
            int _columnIndexOfSenderAvatarUrl = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "senderAvatarUrl");
            int _columnIndexOfDirection = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "direction");
            int _columnIndexOfContentType = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "contentType");
            int _columnIndexOfContentText = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "contentText");
            int _columnIndexOfContentImageUrl = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "contentImageUrl");
            int _columnIndexOfContentFileName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "contentFileName");
            int _columnIndexOfContentFileUrl = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "contentFileUrl");
            int _columnIndexOfQuoteMsgText = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "quoteMsgText");
            int _columnIndexOfQuoteImageUrl = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "quoteImageUrl");
            int _columnIndexOfSendTime = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "sendTime");
            int _columnIndexOfMsgSeq = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "msgSeq");
            int _columnIndexOfEditTime = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "editTime");
            int _columnIndexOfMsgDeleteTime = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "msgDeleteTime");
            int _columnIndexOfQuoteMsgId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "quoteMsgId");
            int _columnIndexOfCmdName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "cmdName");
            int _columnIndexOfCmdType = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "cmdType");
            int _columnIndexOfLocalInsertTime = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "localInsertTime");
            if (_stmt.step()) {
                String _tmpMsgId = _stmt.getText(_columnIndexOfMsgId);
                String _tmpChatId = _stmt.getText(_columnIndexOfChatId);
                int _tmpChatType = (int) _stmt.getLong(_columnIndexOfChatType);
                String _tmpSenderChatId = _stmt.getText(_columnIndexOfSenderChatId);
                String _tmpSenderName = _stmt.getText(_columnIndexOfSenderName);
                String _tmpSenderAvatarUrl = _stmt.getText(_columnIndexOfSenderAvatarUrl);
                String _tmpDirection = _stmt.getText(_columnIndexOfDirection);
                int _tmpContentType = (int) _stmt.getLong(_columnIndexOfContentType);
                if (_stmt.isNull(_columnIndexOfContentText)) {
                    _tmpContentText = null;
                } else {
                    String _tmpContentText2 = _stmt.getText(_columnIndexOfContentText);
                    _tmpContentText = _tmpContentText2;
                }
                if (_stmt.isNull(_columnIndexOfContentImageUrl)) {
                    _tmpContentImageUrl = null;
                } else {
                    String _tmpContentImageUrl2 = _stmt.getText(_columnIndexOfContentImageUrl);
                    _tmpContentImageUrl = _tmpContentImageUrl2;
                }
                if (_stmt.isNull(_columnIndexOfContentFileName)) {
                    _tmpContentFileName = null;
                } else {
                    String _tmpContentFileName2 = _stmt.getText(_columnIndexOfContentFileName);
                    _tmpContentFileName = _tmpContentFileName2;
                }
                if (_stmt.isNull(_columnIndexOfContentFileUrl)) {
                    _tmpContentFileUrl = null;
                } else {
                    String _tmpContentFileUrl2 = _stmt.getText(_columnIndexOfContentFileUrl);
                    _tmpContentFileUrl = _tmpContentFileUrl2;
                }
                if (_stmt.isNull(_columnIndexOfQuoteMsgText)) {
                    _tmpQuoteMsgText = null;
                } else {
                    String _tmpQuoteMsgText2 = _stmt.getText(_columnIndexOfQuoteMsgText);
                    _tmpQuoteMsgText = _tmpQuoteMsgText2;
                }
                if (_stmt.isNull(_columnIndexOfQuoteImageUrl)) {
                    _tmpQuoteImageUrl = null;
                } else {
                    String _tmpQuoteImageUrl2 = _stmt.getText(_columnIndexOfQuoteImageUrl);
                    _tmpQuoteImageUrl = _tmpQuoteImageUrl2;
                }
                long _tmpSendTime = _stmt.getLong(_columnIndexOfSendTime);
                if (_stmt.isNull(_columnIndexOfMsgSeq)) {
                    _tmpMsgSeq = null;
                } else {
                    Long _tmpMsgSeq2 = Long.valueOf(_stmt.getLong(_columnIndexOfMsgSeq));
                    _tmpMsgSeq = _tmpMsgSeq2;
                }
                if (_stmt.isNull(_columnIndexOfEditTime)) {
                    _tmpEditTime = null;
                } else {
                    Long _tmpEditTime2 = Long.valueOf(_stmt.getLong(_columnIndexOfEditTime));
                    _tmpEditTime = _tmpEditTime2;
                }
                if (_stmt.isNull(_columnIndexOfMsgDeleteTime)) {
                    _tmpMsgDeleteTime = null;
                } else {
                    Long _tmpMsgDeleteTime2 = Long.valueOf(_stmt.getLong(_columnIndexOfMsgDeleteTime));
                    _tmpMsgDeleteTime = _tmpMsgDeleteTime2;
                }
                if (_stmt.isNull(_columnIndexOfQuoteMsgId)) {
                    _tmpQuoteMsgId = null;
                } else {
                    String _tmpQuoteMsgId2 = _stmt.getText(_columnIndexOfQuoteMsgId);
                    _tmpQuoteMsgId = _tmpQuoteMsgId2;
                }
                if (_stmt.isNull(_columnIndexOfCmdName)) {
                    _tmpCmdName = null;
                } else {
                    String _tmpCmdName2 = _stmt.getText(_columnIndexOfCmdName);
                    _tmpCmdName = _tmpCmdName2;
                }
                if (!_stmt.isNull(_columnIndexOfCmdType)) {
                    Integer _tmpCmdType2 = Integer.valueOf((int) _stmt.getLong(_columnIndexOfCmdType));
                    _tmpCmdType = _tmpCmdType2;
                } else {
                    _tmpCmdType = null;
                }
                long _tmpLocalInsertTime = _stmt.getLong(_columnIndexOfLocalInsertTime);
                _result = new CachedMessage(_tmpMsgId, _tmpChatId, _tmpChatType, _tmpSenderChatId, _tmpSenderName, _tmpSenderAvatarUrl, _tmpDirection, _tmpContentType, _tmpContentText, _tmpContentImageUrl, _tmpContentFileName, _tmpContentFileUrl, _tmpQuoteMsgText, _tmpQuoteImageUrl, _tmpSendTime, _tmpMsgSeq, _tmpEditTime, _tmpMsgDeleteTime, _tmpQuoteMsgId, _tmpCmdName, _tmpCmdType, _tmpLocalInsertTime);
            } else {
                _result = null;
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.yhchat.canarys.data.local.CachedMessageDao
    public Object getMessageById(final String msgId, Continuation<? super CachedMessage> continuation) {
        final String _sql = "SELECT * FROM cached_messages WHERE msgId = ?";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.yhchat.canarys.data.local.CachedMessageDao_Impl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CachedMessageDao_Impl.getMessageById$lambda$0(_sql, msgId, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CachedMessage getMessageById$lambda$0(String $_sql, String $msgId, SQLiteConnection _connection) {
        CachedMessage _result;
        String _tmpContentText;
        String _tmpContentImageUrl;
        String _tmpContentFileName;
        String _tmpContentFileUrl;
        String _tmpQuoteMsgText;
        String _tmpQuoteImageUrl;
        Long _tmpMsgSeq;
        Long _tmpEditTime;
        Long _tmpMsgDeleteTime;
        String _tmpQuoteMsgId;
        String _tmpCmdName;
        Integer _tmpCmdType;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.mo8127bindText(1, $msgId);
            int _columnIndexOfMsgId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "msgId");
            int _columnIndexOfChatId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, ChatSearchActivity.EXTRA_CHAT_ID);
            int _columnIndexOfChatType = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, ChatSearchActivity.EXTRA_CHAT_TYPE);
            int _columnIndexOfSenderChatId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "senderChatId");
            int _columnIndexOfSenderName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "senderName");
            int _columnIndexOfSenderAvatarUrl = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "senderAvatarUrl");
            int _columnIndexOfDirection = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "direction");
            int _columnIndexOfContentType = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "contentType");
            int _columnIndexOfContentText = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "contentText");
            int _columnIndexOfContentImageUrl = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "contentImageUrl");
            int _columnIndexOfContentFileName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "contentFileName");
            int _columnIndexOfContentFileUrl = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "contentFileUrl");
            int _columnIndexOfQuoteMsgText = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "quoteMsgText");
            int _columnIndexOfQuoteImageUrl = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "quoteImageUrl");
            int _columnIndexOfSendTime = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "sendTime");
            int _columnIndexOfMsgSeq = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "msgSeq");
            int _columnIndexOfEditTime = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "editTime");
            int _columnIndexOfMsgDeleteTime = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "msgDeleteTime");
            int _columnIndexOfQuoteMsgId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "quoteMsgId");
            int _columnIndexOfCmdName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "cmdName");
            int _columnIndexOfCmdType = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "cmdType");
            int _columnIndexOfLocalInsertTime = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "localInsertTime");
            if (_stmt.step()) {
                String _tmpMsgId = _stmt.getText(_columnIndexOfMsgId);
                String _tmpChatId = _stmt.getText(_columnIndexOfChatId);
                int _tmpChatType = (int) _stmt.getLong(_columnIndexOfChatType);
                String _tmpSenderChatId = _stmt.getText(_columnIndexOfSenderChatId);
                String _tmpSenderName = _stmt.getText(_columnIndexOfSenderName);
                String _tmpSenderAvatarUrl = _stmt.getText(_columnIndexOfSenderAvatarUrl);
                String _tmpDirection = _stmt.getText(_columnIndexOfDirection);
                int _tmpContentType = (int) _stmt.getLong(_columnIndexOfContentType);
                if (_stmt.isNull(_columnIndexOfContentText)) {
                    _tmpContentText = null;
                } else {
                    String _tmpContentText2 = _stmt.getText(_columnIndexOfContentText);
                    _tmpContentText = _tmpContentText2;
                }
                if (_stmt.isNull(_columnIndexOfContentImageUrl)) {
                    _tmpContentImageUrl = null;
                } else {
                    String _tmpContentImageUrl2 = _stmt.getText(_columnIndexOfContentImageUrl);
                    _tmpContentImageUrl = _tmpContentImageUrl2;
                }
                if (_stmt.isNull(_columnIndexOfContentFileName)) {
                    _tmpContentFileName = null;
                } else {
                    String _tmpContentFileName2 = _stmt.getText(_columnIndexOfContentFileName);
                    _tmpContentFileName = _tmpContentFileName2;
                }
                if (_stmt.isNull(_columnIndexOfContentFileUrl)) {
                    _tmpContentFileUrl = null;
                } else {
                    String _tmpContentFileUrl2 = _stmt.getText(_columnIndexOfContentFileUrl);
                    _tmpContentFileUrl = _tmpContentFileUrl2;
                }
                if (_stmt.isNull(_columnIndexOfQuoteMsgText)) {
                    _tmpQuoteMsgText = null;
                } else {
                    String _tmpQuoteMsgText2 = _stmt.getText(_columnIndexOfQuoteMsgText);
                    _tmpQuoteMsgText = _tmpQuoteMsgText2;
                }
                if (_stmt.isNull(_columnIndexOfQuoteImageUrl)) {
                    _tmpQuoteImageUrl = null;
                } else {
                    String _tmpQuoteImageUrl2 = _stmt.getText(_columnIndexOfQuoteImageUrl);
                    _tmpQuoteImageUrl = _tmpQuoteImageUrl2;
                }
                long _tmpSendTime = _stmt.getLong(_columnIndexOfSendTime);
                if (_stmt.isNull(_columnIndexOfMsgSeq)) {
                    _tmpMsgSeq = null;
                } else {
                    Long _tmpMsgSeq2 = Long.valueOf(_stmt.getLong(_columnIndexOfMsgSeq));
                    _tmpMsgSeq = _tmpMsgSeq2;
                }
                if (_stmt.isNull(_columnIndexOfEditTime)) {
                    _tmpEditTime = null;
                } else {
                    Long _tmpEditTime2 = Long.valueOf(_stmt.getLong(_columnIndexOfEditTime));
                    _tmpEditTime = _tmpEditTime2;
                }
                if (_stmt.isNull(_columnIndexOfMsgDeleteTime)) {
                    _tmpMsgDeleteTime = null;
                } else {
                    Long _tmpMsgDeleteTime2 = Long.valueOf(_stmt.getLong(_columnIndexOfMsgDeleteTime));
                    _tmpMsgDeleteTime = _tmpMsgDeleteTime2;
                }
                if (_stmt.isNull(_columnIndexOfQuoteMsgId)) {
                    _tmpQuoteMsgId = null;
                } else {
                    String _tmpQuoteMsgId2 = _stmt.getText(_columnIndexOfQuoteMsgId);
                    _tmpQuoteMsgId = _tmpQuoteMsgId2;
                }
                if (_stmt.isNull(_columnIndexOfCmdName)) {
                    _tmpCmdName = null;
                } else {
                    String _tmpCmdName2 = _stmt.getText(_columnIndexOfCmdName);
                    _tmpCmdName = _tmpCmdName2;
                }
                if (!_stmt.isNull(_columnIndexOfCmdType)) {
                    Integer _tmpCmdType2 = Integer.valueOf((int) _stmt.getLong(_columnIndexOfCmdType));
                    _tmpCmdType = _tmpCmdType2;
                } else {
                    _tmpCmdType = null;
                }
                long _tmpLocalInsertTime = _stmt.getLong(_columnIndexOfLocalInsertTime);
                _result = new CachedMessage(_tmpMsgId, _tmpChatId, _tmpChatType, _tmpSenderChatId, _tmpSenderName, _tmpSenderAvatarUrl, _tmpDirection, _tmpContentType, _tmpContentText, _tmpContentImageUrl, _tmpContentFileName, _tmpContentFileUrl, _tmpQuoteMsgText, _tmpQuoteImageUrl, _tmpSendTime, _tmpMsgSeq, _tmpEditTime, _tmpMsgDeleteTime, _tmpQuoteMsgId, _tmpCmdName, _tmpCmdType, _tmpLocalInsertTime);
            } else {
                _result = null;
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.yhchat.canarys.data.local.CachedMessageDao
    public Object getMessageCount(final String chatId, Continuation<? super Integer> continuation) {
        final String _sql = "SELECT COUNT(*) FROM cached_messages WHERE chatId = ?";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.yhchat.canarys.data.local.CachedMessageDao_Impl$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(CachedMessageDao_Impl.getMessageCount$lambda$0(_sql, chatId, (SQLiteConnection) obj));
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getMessageCount$lambda$0(String $_sql, String $chatId, SQLiteConnection _connection) {
        int _tmp;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.mo8127bindText(1, $chatId);
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

    @Override // com.yhchat.canarys.data.local.CachedMessageDao
    public Object getLastMessage(final String chatId, final int chatType, Continuation<? super CachedMessage> continuation) {
        final String _sql = "SELECT * FROM cached_messages WHERE chatId = ? AND chatType = ? ORDER BY sendTime DESC LIMIT 1";
        return DBUtil.performSuspending(this.__db, true, false, new Function1() { // from class: com.yhchat.canarys.data.local.CachedMessageDao_Impl$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CachedMessageDao_Impl.getLastMessage$lambda$0(_sql, chatId, chatType, (SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CachedMessage getLastMessage$lambda$0(String $_sql, String $chatId, int $chatType, SQLiteConnection _connection) {
        CachedMessage _result;
        String _tmpContentText;
        String _tmpContentImageUrl;
        String _tmpContentFileName;
        String _tmpContentFileUrl;
        String _tmpQuoteMsgText;
        String _tmpQuoteImageUrl;
        Long _tmpMsgSeq;
        Long _tmpEditTime;
        Long _tmpMsgDeleteTime;
        String _tmpQuoteMsgId;
        String _tmpCmdName;
        Integer _tmpCmdType;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.mo8127bindText(1, $chatId);
            _stmt.mo8125bindLong(2, $chatType);
            int _columnIndexOfMsgId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "msgId");
            int _columnIndexOfChatId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, ChatSearchActivity.EXTRA_CHAT_ID);
            int _columnIndexOfChatType = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, ChatSearchActivity.EXTRA_CHAT_TYPE);
            int _columnIndexOfSenderChatId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "senderChatId");
            int _columnIndexOfSenderName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "senderName");
            int _columnIndexOfSenderAvatarUrl = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "senderAvatarUrl");
            int _columnIndexOfDirection = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "direction");
            int _columnIndexOfContentType = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "contentType");
            int _columnIndexOfContentText = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "contentText");
            int _columnIndexOfContentImageUrl = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "contentImageUrl");
            int _columnIndexOfContentFileName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "contentFileName");
            int _columnIndexOfContentFileUrl = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "contentFileUrl");
            int _columnIndexOfQuoteMsgText = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "quoteMsgText");
            int _columnIndexOfQuoteImageUrl = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "quoteImageUrl");
            int _columnIndexOfSendTime = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "sendTime");
            int _columnIndexOfMsgSeq = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "msgSeq");
            int _columnIndexOfEditTime = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "editTime");
            int _columnIndexOfMsgDeleteTime = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "msgDeleteTime");
            int _columnIndexOfQuoteMsgId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "quoteMsgId");
            int _columnIndexOfCmdName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "cmdName");
            int _columnIndexOfCmdType = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "cmdType");
            int _columnIndexOfLocalInsertTime = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "localInsertTime");
            if (_stmt.step()) {
                String _tmpMsgId = _stmt.getText(_columnIndexOfMsgId);
                String _tmpChatId = _stmt.getText(_columnIndexOfChatId);
                int _tmpChatType = (int) _stmt.getLong(_columnIndexOfChatType);
                String _tmpSenderChatId = _stmt.getText(_columnIndexOfSenderChatId);
                String _tmpSenderName = _stmt.getText(_columnIndexOfSenderName);
                String _tmpSenderAvatarUrl = _stmt.getText(_columnIndexOfSenderAvatarUrl);
                String _tmpDirection = _stmt.getText(_columnIndexOfDirection);
                int _tmpContentType = (int) _stmt.getLong(_columnIndexOfContentType);
                if (_stmt.isNull(_columnIndexOfContentText)) {
                    _tmpContentText = null;
                } else {
                    String _tmpContentText2 = _stmt.getText(_columnIndexOfContentText);
                    _tmpContentText = _tmpContentText2;
                }
                if (_stmt.isNull(_columnIndexOfContentImageUrl)) {
                    _tmpContentImageUrl = null;
                } else {
                    String _tmpContentImageUrl2 = _stmt.getText(_columnIndexOfContentImageUrl);
                    _tmpContentImageUrl = _tmpContentImageUrl2;
                }
                if (_stmt.isNull(_columnIndexOfContentFileName)) {
                    _tmpContentFileName = null;
                } else {
                    String _tmpContentFileName2 = _stmt.getText(_columnIndexOfContentFileName);
                    _tmpContentFileName = _tmpContentFileName2;
                }
                if (_stmt.isNull(_columnIndexOfContentFileUrl)) {
                    _tmpContentFileUrl = null;
                } else {
                    String _tmpContentFileUrl2 = _stmt.getText(_columnIndexOfContentFileUrl);
                    _tmpContentFileUrl = _tmpContentFileUrl2;
                }
                if (_stmt.isNull(_columnIndexOfQuoteMsgText)) {
                    _tmpQuoteMsgText = null;
                } else {
                    String _tmpQuoteMsgText2 = _stmt.getText(_columnIndexOfQuoteMsgText);
                    _tmpQuoteMsgText = _tmpQuoteMsgText2;
                }
                if (_stmt.isNull(_columnIndexOfQuoteImageUrl)) {
                    _tmpQuoteImageUrl = null;
                } else {
                    String _tmpQuoteImageUrl2 = _stmt.getText(_columnIndexOfQuoteImageUrl);
                    _tmpQuoteImageUrl = _tmpQuoteImageUrl2;
                }
                long _tmpSendTime = _stmt.getLong(_columnIndexOfSendTime);
                if (_stmt.isNull(_columnIndexOfMsgSeq)) {
                    _tmpMsgSeq = null;
                } else {
                    Long _tmpMsgSeq2 = Long.valueOf(_stmt.getLong(_columnIndexOfMsgSeq));
                    _tmpMsgSeq = _tmpMsgSeq2;
                }
                if (_stmt.isNull(_columnIndexOfEditTime)) {
                    _tmpEditTime = null;
                } else {
                    Long _tmpEditTime2 = Long.valueOf(_stmt.getLong(_columnIndexOfEditTime));
                    _tmpEditTime = _tmpEditTime2;
                }
                if (_stmt.isNull(_columnIndexOfMsgDeleteTime)) {
                    _tmpMsgDeleteTime = null;
                } else {
                    Long _tmpMsgDeleteTime2 = Long.valueOf(_stmt.getLong(_columnIndexOfMsgDeleteTime));
                    _tmpMsgDeleteTime = _tmpMsgDeleteTime2;
                }
                if (_stmt.isNull(_columnIndexOfQuoteMsgId)) {
                    _tmpQuoteMsgId = null;
                } else {
                    String _tmpQuoteMsgId2 = _stmt.getText(_columnIndexOfQuoteMsgId);
                    _tmpQuoteMsgId = _tmpQuoteMsgId2;
                }
                if (_stmt.isNull(_columnIndexOfCmdName)) {
                    _tmpCmdName = null;
                } else {
                    String _tmpCmdName2 = _stmt.getText(_columnIndexOfCmdName);
                    _tmpCmdName = _tmpCmdName2;
                }
                if (!_stmt.isNull(_columnIndexOfCmdType)) {
                    Integer _tmpCmdType2 = Integer.valueOf((int) _stmt.getLong(_columnIndexOfCmdType));
                    _tmpCmdType = _tmpCmdType2;
                } else {
                    _tmpCmdType = null;
                }
                long _tmpLocalInsertTime = _stmt.getLong(_columnIndexOfLocalInsertTime);
                _result = new CachedMessage(_tmpMsgId, _tmpChatId, _tmpChatType, _tmpSenderChatId, _tmpSenderName, _tmpSenderAvatarUrl, _tmpDirection, _tmpContentType, _tmpContentText, _tmpContentImageUrl, _tmpContentFileName, _tmpContentFileUrl, _tmpQuoteMsgText, _tmpQuoteImageUrl, _tmpSendTime, _tmpMsgSeq, _tmpEditTime, _tmpMsgDeleteTime, _tmpQuoteMsgId, _tmpCmdName, _tmpCmdType, _tmpLocalInsertTime);
            } else {
                _result = null;
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.yhchat.canarys.data.local.CachedMessageDao
    public Object deleteMessage(final String msgId, Continuation<? super Unit> continuation) {
        final String _sql = "DELETE FROM cached_messages WHERE msgId = ?";
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.yhchat.canarys.data.local.CachedMessageDao_Impl$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CachedMessageDao_Impl.deleteMessage$lambda$1(_sql, msgId, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteMessage$lambda$1(String $_sql, String $msgId, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.mo8127bindText(1, $msgId);
            _stmt.step();
            _stmt.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            _stmt.close();
            throw th;
        }
    }

    @Override // com.yhchat.canarys.data.local.CachedMessageDao
    public Object clearChatMessages(final String chatId, Continuation<? super Unit> continuation) {
        final String _sql = "DELETE FROM cached_messages WHERE chatId = ?";
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.yhchat.canarys.data.local.CachedMessageDao_Impl$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CachedMessageDao_Impl.clearChatMessages$lambda$0(_sql, chatId, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit clearChatMessages$lambda$0(String $_sql, String $chatId, SQLiteConnection _connection) {
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

    @Override // com.yhchat.canarys.data.local.CachedMessageDao
    public Object clearAllMessages(Continuation<? super Unit> continuation) {
        final String _sql = "DELETE FROM cached_messages";
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.yhchat.canarys.data.local.CachedMessageDao_Impl$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CachedMessageDao_Impl.clearAllMessages$lambda$0(_sql, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit clearAllMessages$lambda$0(String $_sql, SQLiteConnection _connection) {
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

    @Override // com.yhchat.canarys.data.local.CachedMessageDao
    public Object deleteOldMessages(final long timestamp, Continuation<? super Unit> continuation) {
        final String _sql = "DELETE FROM cached_messages WHERE localInsertTime < ?";
        Object objPerformSuspending = DBUtil.performSuspending(this.__db, false, true, new Function1() { // from class: com.yhchat.canarys.data.local.CachedMessageDao_Impl$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CachedMessageDao_Impl.deleteOldMessages$lambda$0(_sql, timestamp, (SQLiteConnection) obj);
            }
        }, continuation);
        return objPerformSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformSuspending : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteOldMessages$lambda$0(String $_sql, long $timestamp, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.mo8125bindLong(1, $timestamp);
            _stmt.step();
            _stmt.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            _stmt.close();
            throw th;
        }
    }

    /* compiled from: CachedMessageDao_Impl.kt */
    @Metadata(m168d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005\u00a8\u0006\u0007"}, m169d2 = {"Lcom/yhchat/canarys/data/local/CachedMessageDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
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
