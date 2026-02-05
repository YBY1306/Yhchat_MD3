package com.yhchat.canarys.data.protobuf;

import com.yhchat.canarys.data.model.AtData;
import com.yhchat.canarys.proto.conversation.Conversation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationProtoParser.kt */
@Metadata(m168d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u00a8\u0006\u0013"}, m169d2 = {"Lcom/yhchat/canarys/data/protobuf/ConversationProtoParser;", "", "<init>", "()V", "parseConversationList", "Lkotlin/Result;", "", "Lcom/yhchat/canarys/data/model/Conversation;", "protoBytes", "", "parseConversationList-IoAF18A", "([B)Ljava/lang/Object;", "convertProtoToConversation", "protoData", "Lcom/yhchat/canarys/proto/conversation/Conversation$ConversationList$ConversationData;", "convertProtoAtData", "Lcom/yhchat/canarys/data/model/AtData;", "protoAtData", "Lcom/yhchat/canarys/proto/conversation/Conversation$ConversationList$ConversationData$AtData;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes17.dex */
public final class ConversationProtoParser {
    public static final int $stable = 0;
    public static final ConversationProtoParser INSTANCE = new ConversationProtoParser();

    private ConversationProtoParser() {
    }

    /* renamed from: parseConversationList-IoAF18A, reason: not valid java name */
    public final Object m8472parseConversationListIoAF18A(byte[] protoBytes) {
        Intrinsics.checkNotNullParameter(protoBytes, "protoBytes");
        try {
            Conversation.ConversationList conversationList = Conversation.ConversationList.parseFrom(protoBytes);
            if (conversationList.getStatus().getCode() == 1) {
                Iterable dataList = conversationList.getDataList();
                Intrinsics.checkNotNullExpressionValue(dataList, "getDataList(...)");
                Iterable<Conversation.ConversationList.ConversationData> iterable = dataList;
                Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (Conversation.ConversationList.ConversationData conversationData : iterable) {
                    ConversationProtoParser conversationProtoParser = INSTANCE;
                    Intrinsics.checkNotNull(conversationData);
                    arrayList.add(conversationProtoParser.convertProtoToConversation(conversationData));
                }
                List conversations = (List) arrayList;
                Result.Companion companion = Result.INSTANCE;
                return Result.m11919constructorimpl(conversations);
            }
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m11919constructorimpl(ResultKt.createFailure(new Exception("\u83b7\u53d6\u4f1a\u8bdd\u5217\u8868\u5931\u8d25: " + conversationList.getStatus().getMsg())));
        } catch (Exception e) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m11919constructorimpl(ResultKt.createFailure(new Exception("\u89e3\u6790\u4f1a\u8bdd\u5217\u8868\u5931\u8d25: " + e.getMessage())));
        }
    }

    private final com.yhchat.canarys.data.model.Conversation convertProtoToConversation(Conversation.ConversationList.ConversationData protoData) {
        String chatId = protoData.getChatId();
        Intrinsics.checkNotNullExpressionValue(chatId, "getChatId(...)");
        int chatType = protoData.getChatType();
        String name = protoData.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        String chatContent = protoData.getChatContent();
        Intrinsics.checkNotNullExpressionValue(chatContent, "getChatContent(...)");
        long timestampMs = protoData.getTimestampMs();
        int unreadMessage = protoData.getUnreadMessage();
        int at = protoData.getAt();
        Long lValueOf = Long.valueOf(protoData.getAvatarId());
        String avatarUrl = protoData.getAvatarUrl();
        Intrinsics.checkNotNullExpressionValue(avatarUrl, "getAvatarUrl(...)");
        String avatarUrl2 = avatarUrl.length() > 0 ? protoData.getAvatarUrl() : null;
        Integer numValueOf = Integer.valueOf(protoData.getDoNotDisturb());
        AtData atDataConvertProtoAtData = null;
        long timestamp = protoData.getTimestamp();
        if (protoData.hasAtData()) {
            Conversation.ConversationList.ConversationData.AtData atData = protoData.getAtData();
            Intrinsics.checkNotNullExpressionValue(atData, "getAtData(...)");
            atDataConvertProtoAtData = convertProtoAtData(atData);
        }
        return new com.yhchat.canarys.data.model.Conversation(chatId, chatType, name, chatContent, timestampMs, unreadMessage, at, lValueOf, avatarUrl2, numValueOf, timestamp, atDataConvertProtoAtData, Integer.valueOf(protoData.getCertificationLevel()));
    }

    private final AtData convertProtoAtData(Conversation.ConversationList.ConversationData.AtData protoAtData) {
        Long lValueOf = Long.valueOf(protoAtData.getUnknown());
        String mentionedId = protoAtData.getMentionedId();
        Intrinsics.checkNotNullExpressionValue(mentionedId, "getMentionedId(...)");
        String mentionedId2 = mentionedId.length() > 0 ? protoAtData.getMentionedId() : null;
        String mentionedName = protoAtData.getMentionedName();
        Intrinsics.checkNotNullExpressionValue(mentionedName, "getMentionedName(...)");
        String mentionedName2 = mentionedName.length() > 0 ? protoAtData.getMentionedName() : null;
        String mentionedIn = protoAtData.getMentionedIn();
        Intrinsics.checkNotNullExpressionValue(mentionedIn, "getMentionedIn(...)");
        String mentionedIn2 = mentionedIn.length() > 0 ? protoAtData.getMentionedIn() : null;
        String mentionerId = protoAtData.getMentionerId();
        Intrinsics.checkNotNullExpressionValue(mentionerId, "getMentionerId(...)");
        String mentionerId2 = mentionerId.length() > 0 ? protoAtData.getMentionerId() : null;
        String mentionerName = protoAtData.getMentionerName();
        Intrinsics.checkNotNullExpressionValue(mentionerName, "getMentionerName(...)");
        return new AtData(lValueOf, mentionedId2, mentionedName2, mentionedIn2, mentionerId2, mentionerName.length() > 0 ? protoAtData.getMentionerName() : null, Long.valueOf(protoAtData.getMsgSeq()));
    }
}
