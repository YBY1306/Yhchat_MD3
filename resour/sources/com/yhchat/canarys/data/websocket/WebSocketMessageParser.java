package com.yhchat.canarys.data.websocket;

import android.util.Log;
import com.yhchat.canarys.data.model.ChatMessage;
import com.yhchat.canarys.data.model.MessageCmd;
import com.yhchat.canarys.data.model.MessageContent;
import com.yhchat.canarys.data.model.MessageSender;
import com.yhchat.canarys.data.model.MessageTag;
import com.yhchat.canarys.data.websocket.ParsedMessage;
import com.yhchat.canarys.proto.chat_ws_go.WsMsg;
import com.yhchat.canarys.proto.chat_ws_go.WsTag;
import com.yhchat.canarys.proto.chat_ws_go.bot_board_message;
import com.yhchat.canarys.proto.chat_ws_go.draft_input;
import com.yhchat.canarys.proto.chat_ws_go.edit_message;
import com.yhchat.canarys.proto.chat_ws_go.file_send_message;
import com.yhchat.canarys.proto.chat_ws_go.heartbeat_ack;
import com.yhchat.canarys.proto.chat_ws_go.push_message;
import com.yhchat.canarys.proto.chat_ws_go.stream_message;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebSocketMessageParser.kt */
@Metadata(m168d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, m169d2 = {"Lcom/yhchat/canarys/data/websocket/WebSocketMessageParser;", "", "<init>", "()V", "TAG", "", "parseWebSocketMessage", "Lcom/yhchat/canarys/data/websocket/ParsedMessage;", "bytes", "", "convertProtoToMessage", "Lcom/yhchat/canarys/data/model/ChatMessage;", "protoMsg", "Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes17.dex */
public final class WebSocketMessageParser {
    public static final int $stable = 0;
    public static final WebSocketMessageParser INSTANCE = new WebSocketMessageParser();
    private static final String TAG = "WebSocketMessageParser";

    private WebSocketMessageParser() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final ParsedMessage parseWebSocketMessage(byte[] bytes) {
        ParsedMessage.BotBoardMessage botBoardMessage;
        ParsedMessage.FileSendMessage fileSendMessage;
        ParsedMessage.DraftInput draftInput;
        ParsedMessage.NewMessage newMessage;
        ParsedMessage.StreamMessage streamMessage;
        ParsedMessage.EditedMessage editedMessage;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        try {
            heartbeat_ack tempMsg = heartbeat_ack.parseFrom(bytes);
            String cmd = tempMsg.getInfo().getCmd();
            String seq = tempMsg.getInfo().getSeq();
            Log.d(TAG, "Parsing message - cmd: " + cmd + ", seq: " + seq);
            if (cmd != null) {
                switch (cmd.hashCode()) {
                    case -1613940026:
                        if (!cmd.equals("heartbeat_ack")) {
                            break;
                        } else {
                            Intrinsics.checkNotNull(seq);
                            return new ParsedMessage.HeartbeatAck(seq);
                        }
                    case -1077840074:
                        if (!cmd.equals("bot_board_message")) {
                            seq = seq;
                            break;
                        } else {
                            bot_board_message botBoardMessage2 = bot_board_message.parseFrom(bytes);
                            if (botBoardMessage2.hasData() && botBoardMessage2.getData().hasBoard()) {
                                bot_board_message.BoardData.BoardContent board = botBoardMessage2.getData().getBoard();
                                String botId = board.getBotId();
                                Intrinsics.checkNotNullExpressionValue(botId, "getBotId(...)");
                                String chatId = board.getChatId();
                                Intrinsics.checkNotNullExpressionValue(chatId, "getChatId(...)");
                                int chatType = board.getChatType();
                                String content = board.getContent();
                                Intrinsics.checkNotNullExpressionValue(content, "getContent(...)");
                                int contentType = board.getContentType();
                                long lastUpdateTime = board.getLastUpdateTime();
                                String botName = board.getBotName();
                                Intrinsics.checkNotNullExpressionValue(botName, "getBotName(...)");
                                Intrinsics.checkNotNull(seq);
                                botBoardMessage = new ParsedMessage.BotBoardMessage(botId, chatId, chatType, content, contentType, lastUpdateTime, botName, seq);
                            } else {
                                Log.w(TAG, "bot_board_message has no data or board");
                                botBoardMessage = null;
                            }
                            return botBoardMessage;
                        }
                    case 184527923:
                        if (!cmd.equals("file_send_message")) {
                            break;
                        } else {
                            file_send_message fileSendMessage2 = file_send_message.parseFrom(bytes);
                            if (fileSendMessage2.hasData() && fileSendMessage2.getData().hasSender()) {
                                file_send_message.FileSendData.FileSender sender = fileSendMessage2.getData().getSender();
                                String sendUserId = sender.getSendUserId();
                                Intrinsics.checkNotNullExpressionValue(sendUserId, "getSendUserId(...)");
                                String userId = sender.getUserId();
                                Intrinsics.checkNotNullExpressionValue(userId, "getUserId(...)");
                                String sendType = sender.getSendType();
                                Intrinsics.checkNotNullExpressionValue(sendType, "getSendType(...)");
                                String data = sender.getData();
                                Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
                                String seq2 = sender.getSendDeviceId();
                                Intrinsics.checkNotNullExpressionValue(seq2, "getSendDeviceId(...)");
                                Intrinsics.checkNotNull(seq);
                                fileSendMessage = new ParsedMessage.FileSendMessage(sendUserId, userId, sendType, data, seq2, seq);
                            } else {
                                Log.w(TAG, "file_send_message has no data or sender");
                                fileSendMessage = null;
                            }
                            return fileSendMessage;
                        }
                    case 605730732:
                        if (!cmd.equals("draft_input")) {
                            break;
                        } else {
                            draft_input draftInput2 = draft_input.parseFrom(bytes);
                            if (draftInput2.hasData() && draftInput2.getData().hasDraft()) {
                                draft_input.DraftData.Draft draft = draftInput2.getData().getDraft();
                                String chatId2 = draft.getChatId();
                                Intrinsics.checkNotNullExpressionValue(chatId2, "getChatId(...)");
                                String input = draft.getInput();
                                Intrinsics.checkNotNullExpressionValue(input, "getInput(...)");
                                Intrinsics.checkNotNull(seq);
                                draftInput = new ParsedMessage.DraftInput(chatId2, input, seq);
                            } else {
                                Log.w(TAG, "draft_input has no data or draft");
                                draftInput = null;
                            }
                            return draftInput;
                        }
                    case 679713762:
                        if (!cmd.equals("push_message")) {
                            break;
                        } else {
                            push_message pushMessage = push_message.parseFrom(bytes);
                            if (pushMessage.hasData() && pushMessage.getData().hasMsg()) {
                                WsMsg msg = pushMessage.getData().getMsg();
                                Intrinsics.checkNotNullExpressionValue(msg, "getMsg(...)");
                                ChatMessage message = convertProtoToMessage(msg);
                                Intrinsics.checkNotNull(seq);
                                newMessage = new ParsedMessage.NewMessage(message, seq);
                            } else {
                                Log.w(TAG, "push_message has no data or msg");
                                newMessage = null;
                            }
                            return newMessage;
                        }
                        break;
                    case 734557768:
                        if (!cmd.equals("stream_message")) {
                            break;
                        } else {
                            stream_message streamMsg = stream_message.parseFrom(bytes);
                            if (streamMsg.hasData() && streamMsg.getData().hasMsg()) {
                                stream_message.Data.StreamMsg msg2 = streamMsg.getData().getMsg();
                                String msgId = msg2.getMsgId();
                                Intrinsics.checkNotNullExpressionValue(msgId, "getMsgId(...)");
                                String recvId = msg2.getRecvId();
                                Intrinsics.checkNotNullExpressionValue(recvId, "getRecvId(...)");
                                String chatId3 = msg2.getChatId();
                                Intrinsics.checkNotNullExpressionValue(chatId3, "getChatId(...)");
                                String content2 = msg2.getContent();
                                Intrinsics.checkNotNullExpressionValue(content2, "getContent(...)");
                                Intrinsics.checkNotNull(seq);
                                streamMessage = new ParsedMessage.StreamMessage(msgId, recvId, chatId3, content2, seq);
                            } else {
                                Log.w(TAG, "stream_message has no data or msg");
                                streamMessage = null;
                            }
                            return streamMessage;
                        }
                    case 1493723858:
                        if (!cmd.equals("edit_message")) {
                            break;
                        } else {
                            edit_message editMessage = edit_message.parseFrom(bytes);
                            if (editMessage.hasData() && editMessage.getData().hasMsg()) {
                                WsMsg msg3 = editMessage.getData().getMsg();
                                Intrinsics.checkNotNullExpressionValue(msg3, "getMsg(...)");
                                ChatMessage message2 = convertProtoToMessage(msg3);
                                Intrinsics.checkNotNull(seq);
                                editedMessage = new ParsedMessage.EditedMessage(message2, seq);
                            } else {
                                Log.w(TAG, "edit_message has no data or msg");
                                editedMessage = null;
                            }
                            return editedMessage;
                        }
                }
            }
            Log.w(TAG, "Unknown command: " + cmd);
            Intrinsics.checkNotNull(cmd);
            Intrinsics.checkNotNull(seq);
            return new ParsedMessage.Unknown(cmd, seq);
        } catch (Exception e) {
            Log.e(TAG, "Failed to parse WebSocket message", e);
            return null;
        }
    }

    private final ChatMessage convertProtoToMessage(WsMsg protoMsg) {
        MessageCmd cmd;
        String chatId = protoMsg.getSender().getChatId();
        Intrinsics.checkNotNullExpressionValue(chatId, "getChatId(...)");
        int chatType = protoMsg.getSender().getChatType();
        String name = protoMsg.getSender().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        String avatarUrl = protoMsg.getSender().getAvatarUrl();
        Intrinsics.checkNotNullExpressionValue(avatarUrl, "getAvatarUrl(...)");
        List<String> tagOldList = protoMsg.getSender().getTagOldList();
        Iterable tagList = protoMsg.getSender().getTagList();
        Intrinsics.checkNotNullExpressionValue(tagList, "getTagList(...)");
        Iterable<WsTag> iterable = tagList;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (WsTag wsTag : iterable) {
            String str = chatId;
            long id = wsTag.getId();
            String str2 = name;
            String text = wsTag.getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            String color = wsTag.getColor();
            Intrinsics.checkNotNullExpressionValue(color, "getColor(...)");
            arrayList.add(new MessageTag(id, text, color));
            iterable = iterable;
            chatId = str;
            chatType = chatType;
            name = str2;
            avatarUrl = avatarUrl;
        }
        MessageSender sender = new MessageSender(chatId, chatType, name, avatarUrl, tagOldList, (List) arrayList);
        String text2 = protoMsg.getContent().getText();
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        String text3 = text2.length() > 0 ? protoMsg.getContent().getText() : null;
        String buttons = protoMsg.getContent().getButtons();
        Intrinsics.checkNotNullExpressionValue(buttons, "getButtons(...)");
        String buttons2 = buttons.length() > 0 ? protoMsg.getContent().getButtons() : null;
        String imageUrl = protoMsg.getContent().getImageUrl();
        Intrinsics.checkNotNullExpressionValue(imageUrl, "getImageUrl(...)");
        String imageUrl2 = imageUrl.length() > 0 ? protoMsg.getContent().getImageUrl() : null;
        String fileName = protoMsg.getContent().getFileName();
        Intrinsics.checkNotNullExpressionValue(fileName, "getFileName(...)");
        String fileName2 = fileName.length() > 0 ? protoMsg.getContent().getFileName() : null;
        String fileUrl = protoMsg.getContent().getFileUrl();
        Intrinsics.checkNotNullExpressionValue(fileUrl, "getFileUrl(...)");
        String fileUrl2 = fileUrl.length() > 0 ? protoMsg.getContent().getFileUrl() : null;
        String form = protoMsg.getContent().getForm();
        Intrinsics.checkNotNullExpressionValue(form, "getForm(...)");
        String form2 = form.length() > 0 ? protoMsg.getContent().getForm() : null;
        String quoteMsgText = protoMsg.getContent().getQuoteMsgText();
        Intrinsics.checkNotNullExpressionValue(quoteMsgText, "getQuoteMsgText(...)");
        String quoteMsgText2 = quoteMsgText.length() > 0 ? protoMsg.getContent().getQuoteMsgText() : null;
        String stickerUrl = protoMsg.getContent().getStickerUrl();
        Intrinsics.checkNotNullExpressionValue(stickerUrl, "getStickerUrl(...)");
        String stickerUrl2 = stickerUrl.length() > 0 ? protoMsg.getContent().getStickerUrl() : null;
        String postId = protoMsg.getContent().getPostId();
        Intrinsics.checkNotNullExpressionValue(postId, "getPostId(...)");
        String postId2 = postId.length() > 0 ? protoMsg.getContent().getPostId() : null;
        String postTitle = protoMsg.getContent().getPostTitle();
        Intrinsics.checkNotNullExpressionValue(postTitle, "getPostTitle(...)");
        String postTitle2 = postTitle.length() > 0 ? protoMsg.getContent().getPostTitle() : null;
        String postContent = protoMsg.getContent().getPostContent();
        Intrinsics.checkNotNullExpressionValue(postContent, "getPostContent(...)");
        String postContent2 = postContent.length() > 0 ? protoMsg.getContent().getPostContent() : null;
        String postContentType = protoMsg.getContent().getPostContentType();
        Intrinsics.checkNotNullExpressionValue(postContentType, "getPostContentType(...)");
        String postContentType2 = postContentType.length() > 0 ? protoMsg.getContent().getPostContentType() : null;
        String expressionId = protoMsg.getContent().getExpressionId();
        Intrinsics.checkNotNullExpressionValue(expressionId, "getExpressionId(...)");
        String expressionId2 = expressionId.length() > 0 ? protoMsg.getContent().getExpressionId() : null;
        Long lValueOf = protoMsg.getContent().getFileSize() > 0 ? Long.valueOf(protoMsg.getContent().getFileSize()) : null;
        String videoUrl = protoMsg.getContent().getVideoUrl();
        Intrinsics.checkNotNullExpressionValue(videoUrl, "getVideoUrl(...)");
        String videoUrl2 = videoUrl.length() > 0 ? protoMsg.getContent().getVideoUrl() : null;
        String audioUrl = protoMsg.getContent().getAudioUrl();
        Intrinsics.checkNotNullExpressionValue(audioUrl, "getAudioUrl(...)");
        String audioUrl2 = audioUrl.length() > 0 ? protoMsg.getContent().getAudioUrl() : null;
        Long lValueOf2 = protoMsg.getContent().getAudioTime() > 0 ? Long.valueOf(protoMsg.getContent().getAudioTime()) : null;
        Long lValueOf3 = protoMsg.getContent().getStickerItemId() > 0 ? Long.valueOf(protoMsg.getContent().getStickerItemId()) : null;
        Long lValueOf4 = protoMsg.getContent().getStickerPackId() > 0 ? Long.valueOf(protoMsg.getContent().getStickerPackId()) : null;
        String callText = protoMsg.getContent().getCallText();
        Intrinsics.checkNotNullExpressionValue(callText, "getCallText(...)");
        String callText2 = callText.length() > 0 ? protoMsg.getContent().getCallText() : null;
        String callStatusText = protoMsg.getContent().getCallStatusText();
        Intrinsics.checkNotNullExpressionValue(callStatusText, "getCallStatusText(...)");
        MessageContent content = new MessageContent(text3, buttons2, imageUrl2, fileName2, fileUrl2, form2, quoteMsgText2, null, stickerUrl2, postId2, postTitle2, postContent2, postContentType2, expressionId2, lValueOf, videoUrl2, audioUrl2, lValueOf2, lValueOf3, lValueOf4, callText2, callStatusText.length() > 0 ? protoMsg.getContent().getCallStatusText() : null, protoMsg.getContent().getWidth() > 0 ? Long.valueOf(protoMsg.getContent().getWidth()) : null, protoMsg.getContent().getHeight() > 0 ? Long.valueOf(protoMsg.getContent().getHeight()) : null, 128, null);
        if (protoMsg.hasCmd()) {
            String name2 = protoMsg.getCmd().getName();
            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
            cmd = new MessageCmd(name2, (int) protoMsg.getCmd().getId());
        } else {
            cmd = null;
        }
        String msgId = protoMsg.getMsgId();
        Intrinsics.checkNotNullExpressionValue(msgId, "getMsgId(...)");
        int contentType = protoMsg.getContentType();
        long timestamp = protoMsg.getTimestamp();
        Long lValueOf5 = protoMsg.getDeleteTime() > 0 ? Long.valueOf(protoMsg.getDeleteTime()) : null;
        String quoteMsgId = protoMsg.getQuoteMsgId();
        Intrinsics.checkNotNullExpressionValue(quoteMsgId, "getQuoteMsgId(...)");
        return new ChatMessage(msgId, sender, "left", contentType, content, timestamp, cmd, lValueOf5, quoteMsgId.length() > 0 ? protoMsg.getQuoteMsgId() : null, Long.valueOf(protoMsg.getMsgSeq()), protoMsg.getEditTime() > 0 ? Long.valueOf(protoMsg.getEditTime()) : null, protoMsg.getChatId(), Integer.valueOf(protoMsg.getChatType()), protoMsg.getRecvId());
    }
}
