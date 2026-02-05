package com.yhchat.canarys.proto.friend;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes7.dex */
public final class FriendProto {

    public interface StatusOrBuilder extends MessageLiteOrBuilder {
        int getCode();

        String getMsg();

        ByteString getMsgBytes();

        long getNumber();
    }

    public interface request_listOrBuilder extends MessageLiteOrBuilder {
        int getPending();

        request_list.Request getRequests(int index);

        int getRequestsCount();

        List<request_list.Request> getRequestsList();

        Status getStatus();

        int getTotal();

        boolean hasStatus();
    }

    private FriendProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }

    public static final class Status extends GeneratedMessageLite<Status, Builder> implements StatusOrBuilder {
        public static final int CODE_FIELD_NUMBER = 2;
        private static final Status DEFAULT_INSTANCE;
        public static final int MSG_FIELD_NUMBER = 3;
        public static final int NUMBER_FIELD_NUMBER = 1;
        private static volatile Parser<Status> PARSER;
        private int code_;
        private String msg_ = "";
        private long number_;

        private Status() {
        }

        @Override // com.yhchat.canarys.proto.friend.FriendProto.StatusOrBuilder
        public long getNumber() {
            return this.number_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNumber(long value) {
            this.number_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNumber() {
            this.number_ = 0L;
        }

        @Override // com.yhchat.canarys.proto.friend.FriendProto.StatusOrBuilder
        public int getCode() {
            return this.code_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCode(int value) {
            this.code_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCode() {
            this.code_ = 0;
        }

        @Override // com.yhchat.canarys.proto.friend.FriendProto.StatusOrBuilder
        public String getMsg() {
            return this.msg_;
        }

        @Override // com.yhchat.canarys.proto.friend.FriendProto.StatusOrBuilder
        public ByteString getMsgBytes() {
            return ByteString.copyFromUtf8(this.msg_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsg(String value) {
            value.getClass();
            this.msg_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMsg() {
            this.msg_ = getDefaultInstance().getMsg();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.msg_ = value.toStringUtf8();
        }

        public static Status parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Status parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Status parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Status parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Status parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Status parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Status parseFrom(InputStream input) throws IOException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Status parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Status parseDelimitedFrom(InputStream input) throws IOException {
            return (Status) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static Status parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Status) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Status parseFrom(CodedInputStream input) throws IOException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Status parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Status prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Status, Builder> implements StatusOrBuilder {
            private Builder() {
                super(Status.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.StatusOrBuilder
            public long getNumber() {
                return ((Status) this.instance).getNumber();
            }

            public Builder setNumber(long value) {
                copyOnWrite();
                ((Status) this.instance).setNumber(value);
                return this;
            }

            public Builder clearNumber() {
                copyOnWrite();
                ((Status) this.instance).clearNumber();
                return this;
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.StatusOrBuilder
            public int getCode() {
                return ((Status) this.instance).getCode();
            }

            public Builder setCode(int value) {
                copyOnWrite();
                ((Status) this.instance).setCode(value);
                return this;
            }

            public Builder clearCode() {
                copyOnWrite();
                ((Status) this.instance).clearCode();
                return this;
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.StatusOrBuilder
            public String getMsg() {
                return ((Status) this.instance).getMsg();
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.StatusOrBuilder
            public ByteString getMsgBytes() {
                return ((Status) this.instance).getMsgBytes();
            }

            public Builder setMsg(String value) {
                copyOnWrite();
                ((Status) this.instance).setMsg(value);
                return this;
            }

            public Builder clearMsg() {
                copyOnWrite();
                ((Status) this.instance).clearMsg();
                return this;
            }

            public Builder setMsgBytes(ByteString value) {
                copyOnWrite();
                ((Status) this.instance).setMsgBytes(value);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new Status();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"number_", "code_", "msg_"};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u0004\u0003\u0208", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<Status> parser = PARSER;
                    if (parser == null) {
                        synchronized (Status.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        }
                    }
                    return parser;
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            Status defaultInstance = new Status();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(Status.class, defaultInstance);
        }

        public static Status getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Status> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class request_list extends GeneratedMessageLite<request_list, Builder> implements request_listOrBuilder {
        private static final request_list DEFAULT_INSTANCE;
        private static volatile Parser<request_list> PARSER = null;
        public static final int PENDING_FIELD_NUMBER = 4;
        public static final int REQUESTS_FIELD_NUMBER = 2;
        public static final int STATUS_FIELD_NUMBER = 1;
        public static final int TOTAL_FIELD_NUMBER = 3;
        private int bitField0_;
        private int pending_;
        private Internal.ProtobufList<Request> requests_ = emptyProtobufList();
        private Status status_;
        private int total_;

        public interface RequestOrBuilder extends MessageLiteOrBuilder {
            String getAvatar();

            ByteString getAvatarBytes();

            String getBotAvatar();

            ByteString getBotAvatarBytes();

            String getBotName();

            ByteString getBotNameBytes();

            String getGroupAvatar();

            ByteString getGroupAvatarBytes();

            String getGroupName();

            ByteString getGroupNameBytes();

            long getInviteAt();

            String getInviteAtStr();

            ByteString getInviteAtStrBytes();

            String getInviterId();

            ByteString getInviterIdBytes();

            String getName();

            ByteString getNameBytes();

            String getNote();

            ByteString getNoteBytes();

            long getProcessedAt();

            String getProcessorName();

            ByteString getProcessorNameBytes();

            String getReceiverAvatar();

            ByteString getReceiverAvatarBytes();

            String getReceiverId();

            ByteString getReceiverIdBytes();

            String getReceiverName();

            ByteString getReceiverNameBytes();

            int getRequestId();

            int getResult();

            int getSourceType();

            String getTargetId();

            ByteString getTargetIdBytes();

            int getTargetType();
        }

        private request_list() {
        }

        public static final class Request extends GeneratedMessageLite<Request, Builder> implements RequestOrBuilder {
            public static final int AVATAR_FIELD_NUMBER = 4;
            public static final int BOTAVATAR_FIELD_NUMBER = 20;
            public static final int BOTNAME_FIELD_NUMBER = 19;
            private static final Request DEFAULT_INSTANCE;
            public static final int GROUPAVATAR_FIELD_NUMBER = 6;
            public static final int GROUPNAME_FIELD_NUMBER = 5;
            public static final int INVITEATSTR_FIELD_NUMBER = 17;
            public static final int INVITEAT_FIELD_NUMBER = 16;
            public static final int INVITERID_FIELD_NUMBER = 7;
            public static final int NAME_FIELD_NUMBER = 3;
            public static final int NOTE_FIELD_NUMBER = 23;
            private static volatile Parser<Request> PARSER = null;
            public static final int PROCESSEDAT_FIELD_NUMBER = 14;
            public static final int PROCESSORNAME_FIELD_NUMBER = 22;
            public static final int RECEIVERAVATAR_FIELD_NUMBER = 2;
            public static final int RECEIVERID_FIELD_NUMBER = 12;
            public static final int RECEIVERNAME_FIELD_NUMBER = 1;
            public static final int REQUESTID_FIELD_NUMBER = 18;
            public static final int RESULT_FIELD_NUMBER = 13;
            public static final int SOURCETYPE_FIELD_NUMBER = 9;
            public static final int TARGETID_FIELD_NUMBER = 11;
            public static final int TARGETTYPE_FIELD_NUMBER = 10;
            private long inviteAt_;
            private long processedAt_;
            private int requestId_;
            private int result_;
            private int sourceType_;
            private int targetType_;
            private String receiverName_ = "";
            private String receiverAvatar_ = "";
            private String name_ = "";
            private String avatar_ = "";
            private String groupName_ = "";
            private String groupAvatar_ = "";
            private String inviterId_ = "";
            private String targetId_ = "";
            private String receiverId_ = "";
            private String inviteAtStr_ = "";
            private String botName_ = "";
            private String botAvatar_ = "";
            private String processorName_ = "";
            private String note_ = "";

            private Request() {
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
            public String getReceiverName() {
                return this.receiverName_;
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
            public ByteString getReceiverNameBytes() {
                return ByteString.copyFromUtf8(this.receiverName_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setReceiverName(String value) {
                value.getClass();
                this.receiverName_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearReceiverName() {
                this.receiverName_ = getDefaultInstance().getReceiverName();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setReceiverNameBytes(ByteString value) {
                checkByteStringIsUtf8(value);
                this.receiverName_ = value.toStringUtf8();
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
            public String getReceiverAvatar() {
                return this.receiverAvatar_;
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
            public ByteString getReceiverAvatarBytes() {
                return ByteString.copyFromUtf8(this.receiverAvatar_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setReceiverAvatar(String value) {
                value.getClass();
                this.receiverAvatar_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearReceiverAvatar() {
                this.receiverAvatar_ = getDefaultInstance().getReceiverAvatar();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setReceiverAvatarBytes(ByteString value) {
                checkByteStringIsUtf8(value);
                this.receiverAvatar_ = value.toStringUtf8();
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
            public String getName() {
                return this.name_;
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
            public ByteString getNameBytes() {
                return ByteString.copyFromUtf8(this.name_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setName(String value) {
                value.getClass();
                this.name_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearName() {
                this.name_ = getDefaultInstance().getName();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNameBytes(ByteString value) {
                checkByteStringIsUtf8(value);
                this.name_ = value.toStringUtf8();
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
            public String getAvatar() {
                return this.avatar_;
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
            public ByteString getAvatarBytes() {
                return ByteString.copyFromUtf8(this.avatar_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAvatar(String value) {
                value.getClass();
                this.avatar_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAvatar() {
                this.avatar_ = getDefaultInstance().getAvatar();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAvatarBytes(ByteString value) {
                checkByteStringIsUtf8(value);
                this.avatar_ = value.toStringUtf8();
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
            public String getGroupName() {
                return this.groupName_;
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
            public ByteString getGroupNameBytes() {
                return ByteString.copyFromUtf8(this.groupName_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setGroupName(String value) {
                value.getClass();
                this.groupName_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearGroupName() {
                this.groupName_ = getDefaultInstance().getGroupName();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setGroupNameBytes(ByteString value) {
                checkByteStringIsUtf8(value);
                this.groupName_ = value.toStringUtf8();
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
            public String getGroupAvatar() {
                return this.groupAvatar_;
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
            public ByteString getGroupAvatarBytes() {
                return ByteString.copyFromUtf8(this.groupAvatar_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setGroupAvatar(String value) {
                value.getClass();
                this.groupAvatar_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearGroupAvatar() {
                this.groupAvatar_ = getDefaultInstance().getGroupAvatar();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setGroupAvatarBytes(ByteString value) {
                checkByteStringIsUtf8(value);
                this.groupAvatar_ = value.toStringUtf8();
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
            public String getInviterId() {
                return this.inviterId_;
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
            public ByteString getInviterIdBytes() {
                return ByteString.copyFromUtf8(this.inviterId_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setInviterId(String value) {
                value.getClass();
                this.inviterId_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearInviterId() {
                this.inviterId_ = getDefaultInstance().getInviterId();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setInviterIdBytes(ByteString value) {
                checkByteStringIsUtf8(value);
                this.inviterId_ = value.toStringUtf8();
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
            public int getSourceType() {
                return this.sourceType_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSourceType(int value) {
                this.sourceType_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSourceType() {
                this.sourceType_ = 0;
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
            public int getTargetType() {
                return this.targetType_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTargetType(int value) {
                this.targetType_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearTargetType() {
                this.targetType_ = 0;
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
            public String getTargetId() {
                return this.targetId_;
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
            public ByteString getTargetIdBytes() {
                return ByteString.copyFromUtf8(this.targetId_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTargetId(String value) {
                value.getClass();
                this.targetId_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearTargetId() {
                this.targetId_ = getDefaultInstance().getTargetId();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTargetIdBytes(ByteString value) {
                checkByteStringIsUtf8(value);
                this.targetId_ = value.toStringUtf8();
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
            public String getReceiverId() {
                return this.receiverId_;
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
            public ByteString getReceiverIdBytes() {
                return ByteString.copyFromUtf8(this.receiverId_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setReceiverId(String value) {
                value.getClass();
                this.receiverId_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearReceiverId() {
                this.receiverId_ = getDefaultInstance().getReceiverId();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setReceiverIdBytes(ByteString value) {
                checkByteStringIsUtf8(value);
                this.receiverId_ = value.toStringUtf8();
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
            public int getResult() {
                return this.result_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setResult(int value) {
                this.result_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearResult() {
                this.result_ = 0;
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
            public long getProcessedAt() {
                return this.processedAt_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setProcessedAt(long value) {
                this.processedAt_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearProcessedAt() {
                this.processedAt_ = 0L;
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
            public long getInviteAt() {
                return this.inviteAt_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setInviteAt(long value) {
                this.inviteAt_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearInviteAt() {
                this.inviteAt_ = 0L;
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
            public String getInviteAtStr() {
                return this.inviteAtStr_;
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
            public ByteString getInviteAtStrBytes() {
                return ByteString.copyFromUtf8(this.inviteAtStr_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setInviteAtStr(String value) {
                value.getClass();
                this.inviteAtStr_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearInviteAtStr() {
                this.inviteAtStr_ = getDefaultInstance().getInviteAtStr();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setInviteAtStrBytes(ByteString value) {
                checkByteStringIsUtf8(value);
                this.inviteAtStr_ = value.toStringUtf8();
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
            public int getRequestId() {
                return this.requestId_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setRequestId(int value) {
                this.requestId_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearRequestId() {
                this.requestId_ = 0;
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
            public String getBotName() {
                return this.botName_;
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
            public ByteString getBotNameBytes() {
                return ByteString.copyFromUtf8(this.botName_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBotName(String value) {
                value.getClass();
                this.botName_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBotName() {
                this.botName_ = getDefaultInstance().getBotName();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBotNameBytes(ByteString value) {
                checkByteStringIsUtf8(value);
                this.botName_ = value.toStringUtf8();
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
            public String getBotAvatar() {
                return this.botAvatar_;
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
            public ByteString getBotAvatarBytes() {
                return ByteString.copyFromUtf8(this.botAvatar_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBotAvatar(String value) {
                value.getClass();
                this.botAvatar_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBotAvatar() {
                this.botAvatar_ = getDefaultInstance().getBotAvatar();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBotAvatarBytes(ByteString value) {
                checkByteStringIsUtf8(value);
                this.botAvatar_ = value.toStringUtf8();
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
            public String getProcessorName() {
                return this.processorName_;
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
            public ByteString getProcessorNameBytes() {
                return ByteString.copyFromUtf8(this.processorName_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setProcessorName(String value) {
                value.getClass();
                this.processorName_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearProcessorName() {
                this.processorName_ = getDefaultInstance().getProcessorName();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setProcessorNameBytes(ByteString value) {
                checkByteStringIsUtf8(value);
                this.processorName_ = value.toStringUtf8();
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
            public String getNote() {
                return this.note_;
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
            public ByteString getNoteBytes() {
                return ByteString.copyFromUtf8(this.note_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNote(String value) {
                value.getClass();
                this.note_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearNote() {
                this.note_ = getDefaultInstance().getNote();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNoteBytes(ByteString value) {
                checkByteStringIsUtf8(value);
                this.note_ = value.toStringUtf8();
            }

            public static Request parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Request parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Request parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Request parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Request parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Request parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Request parseFrom(InputStream input) throws IOException {
                return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static Request parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Request parseDelimitedFrom(InputStream input) throws IOException {
                return (Request) parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static Request parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Request) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Request parseFrom(CodedInputStream input) throws IOException {
                return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static Request parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Request) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(Request prototype) {
                return DEFAULT_INSTANCE.createBuilder(prototype);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<Request, Builder> implements RequestOrBuilder {
                private Builder() {
                    super(Request.DEFAULT_INSTANCE);
                }

                @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
                public String getReceiverName() {
                    return ((Request) this.instance).getReceiverName();
                }

                @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
                public ByteString getReceiverNameBytes() {
                    return ((Request) this.instance).getReceiverNameBytes();
                }

                public Builder setReceiverName(String value) {
                    copyOnWrite();
                    ((Request) this.instance).setReceiverName(value);
                    return this;
                }

                public Builder clearReceiverName() {
                    copyOnWrite();
                    ((Request) this.instance).clearReceiverName();
                    return this;
                }

                public Builder setReceiverNameBytes(ByteString value) {
                    copyOnWrite();
                    ((Request) this.instance).setReceiverNameBytes(value);
                    return this;
                }

                @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
                public String getReceiverAvatar() {
                    return ((Request) this.instance).getReceiverAvatar();
                }

                @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
                public ByteString getReceiverAvatarBytes() {
                    return ((Request) this.instance).getReceiverAvatarBytes();
                }

                public Builder setReceiverAvatar(String value) {
                    copyOnWrite();
                    ((Request) this.instance).setReceiverAvatar(value);
                    return this;
                }

                public Builder clearReceiverAvatar() {
                    copyOnWrite();
                    ((Request) this.instance).clearReceiverAvatar();
                    return this;
                }

                public Builder setReceiverAvatarBytes(ByteString value) {
                    copyOnWrite();
                    ((Request) this.instance).setReceiverAvatarBytes(value);
                    return this;
                }

                @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
                public String getName() {
                    return ((Request) this.instance).getName();
                }

                @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
                public ByteString getNameBytes() {
                    return ((Request) this.instance).getNameBytes();
                }

                public Builder setName(String value) {
                    copyOnWrite();
                    ((Request) this.instance).setName(value);
                    return this;
                }

                public Builder clearName() {
                    copyOnWrite();
                    ((Request) this.instance).clearName();
                    return this;
                }

                public Builder setNameBytes(ByteString value) {
                    copyOnWrite();
                    ((Request) this.instance).setNameBytes(value);
                    return this;
                }

                @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
                public String getAvatar() {
                    return ((Request) this.instance).getAvatar();
                }

                @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
                public ByteString getAvatarBytes() {
                    return ((Request) this.instance).getAvatarBytes();
                }

                public Builder setAvatar(String value) {
                    copyOnWrite();
                    ((Request) this.instance).setAvatar(value);
                    return this;
                }

                public Builder clearAvatar() {
                    copyOnWrite();
                    ((Request) this.instance).clearAvatar();
                    return this;
                }

                public Builder setAvatarBytes(ByteString value) {
                    copyOnWrite();
                    ((Request) this.instance).setAvatarBytes(value);
                    return this;
                }

                @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
                public String getGroupName() {
                    return ((Request) this.instance).getGroupName();
                }

                @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
                public ByteString getGroupNameBytes() {
                    return ((Request) this.instance).getGroupNameBytes();
                }

                public Builder setGroupName(String value) {
                    copyOnWrite();
                    ((Request) this.instance).setGroupName(value);
                    return this;
                }

                public Builder clearGroupName() {
                    copyOnWrite();
                    ((Request) this.instance).clearGroupName();
                    return this;
                }

                public Builder setGroupNameBytes(ByteString value) {
                    copyOnWrite();
                    ((Request) this.instance).setGroupNameBytes(value);
                    return this;
                }

                @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
                public String getGroupAvatar() {
                    return ((Request) this.instance).getGroupAvatar();
                }

                @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
                public ByteString getGroupAvatarBytes() {
                    return ((Request) this.instance).getGroupAvatarBytes();
                }

                public Builder setGroupAvatar(String value) {
                    copyOnWrite();
                    ((Request) this.instance).setGroupAvatar(value);
                    return this;
                }

                public Builder clearGroupAvatar() {
                    copyOnWrite();
                    ((Request) this.instance).clearGroupAvatar();
                    return this;
                }

                public Builder setGroupAvatarBytes(ByteString value) {
                    copyOnWrite();
                    ((Request) this.instance).setGroupAvatarBytes(value);
                    return this;
                }

                @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
                public String getInviterId() {
                    return ((Request) this.instance).getInviterId();
                }

                @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
                public ByteString getInviterIdBytes() {
                    return ((Request) this.instance).getInviterIdBytes();
                }

                public Builder setInviterId(String value) {
                    copyOnWrite();
                    ((Request) this.instance).setInviterId(value);
                    return this;
                }

                public Builder clearInviterId() {
                    copyOnWrite();
                    ((Request) this.instance).clearInviterId();
                    return this;
                }

                public Builder setInviterIdBytes(ByteString value) {
                    copyOnWrite();
                    ((Request) this.instance).setInviterIdBytes(value);
                    return this;
                }

                @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
                public int getSourceType() {
                    return ((Request) this.instance).getSourceType();
                }

                public Builder setSourceType(int value) {
                    copyOnWrite();
                    ((Request) this.instance).setSourceType(value);
                    return this;
                }

                public Builder clearSourceType() {
                    copyOnWrite();
                    ((Request) this.instance).clearSourceType();
                    return this;
                }

                @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
                public int getTargetType() {
                    return ((Request) this.instance).getTargetType();
                }

                public Builder setTargetType(int value) {
                    copyOnWrite();
                    ((Request) this.instance).setTargetType(value);
                    return this;
                }

                public Builder clearTargetType() {
                    copyOnWrite();
                    ((Request) this.instance).clearTargetType();
                    return this;
                }

                @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
                public String getTargetId() {
                    return ((Request) this.instance).getTargetId();
                }

                @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
                public ByteString getTargetIdBytes() {
                    return ((Request) this.instance).getTargetIdBytes();
                }

                public Builder setTargetId(String value) {
                    copyOnWrite();
                    ((Request) this.instance).setTargetId(value);
                    return this;
                }

                public Builder clearTargetId() {
                    copyOnWrite();
                    ((Request) this.instance).clearTargetId();
                    return this;
                }

                public Builder setTargetIdBytes(ByteString value) {
                    copyOnWrite();
                    ((Request) this.instance).setTargetIdBytes(value);
                    return this;
                }

                @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
                public String getReceiverId() {
                    return ((Request) this.instance).getReceiverId();
                }

                @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
                public ByteString getReceiverIdBytes() {
                    return ((Request) this.instance).getReceiverIdBytes();
                }

                public Builder setReceiverId(String value) {
                    copyOnWrite();
                    ((Request) this.instance).setReceiverId(value);
                    return this;
                }

                public Builder clearReceiverId() {
                    copyOnWrite();
                    ((Request) this.instance).clearReceiverId();
                    return this;
                }

                public Builder setReceiverIdBytes(ByteString value) {
                    copyOnWrite();
                    ((Request) this.instance).setReceiverIdBytes(value);
                    return this;
                }

                @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
                public int getResult() {
                    return ((Request) this.instance).getResult();
                }

                public Builder setResult(int value) {
                    copyOnWrite();
                    ((Request) this.instance).setResult(value);
                    return this;
                }

                public Builder clearResult() {
                    copyOnWrite();
                    ((Request) this.instance).clearResult();
                    return this;
                }

                @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
                public long getProcessedAt() {
                    return ((Request) this.instance).getProcessedAt();
                }

                public Builder setProcessedAt(long value) {
                    copyOnWrite();
                    ((Request) this.instance).setProcessedAt(value);
                    return this;
                }

                public Builder clearProcessedAt() {
                    copyOnWrite();
                    ((Request) this.instance).clearProcessedAt();
                    return this;
                }

                @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
                public long getInviteAt() {
                    return ((Request) this.instance).getInviteAt();
                }

                public Builder setInviteAt(long value) {
                    copyOnWrite();
                    ((Request) this.instance).setInviteAt(value);
                    return this;
                }

                public Builder clearInviteAt() {
                    copyOnWrite();
                    ((Request) this.instance).clearInviteAt();
                    return this;
                }

                @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
                public String getInviteAtStr() {
                    return ((Request) this.instance).getInviteAtStr();
                }

                @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
                public ByteString getInviteAtStrBytes() {
                    return ((Request) this.instance).getInviteAtStrBytes();
                }

                public Builder setInviteAtStr(String value) {
                    copyOnWrite();
                    ((Request) this.instance).setInviteAtStr(value);
                    return this;
                }

                public Builder clearInviteAtStr() {
                    copyOnWrite();
                    ((Request) this.instance).clearInviteAtStr();
                    return this;
                }

                public Builder setInviteAtStrBytes(ByteString value) {
                    copyOnWrite();
                    ((Request) this.instance).setInviteAtStrBytes(value);
                    return this;
                }

                @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
                public int getRequestId() {
                    return ((Request) this.instance).getRequestId();
                }

                public Builder setRequestId(int value) {
                    copyOnWrite();
                    ((Request) this.instance).setRequestId(value);
                    return this;
                }

                public Builder clearRequestId() {
                    copyOnWrite();
                    ((Request) this.instance).clearRequestId();
                    return this;
                }

                @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
                public String getBotName() {
                    return ((Request) this.instance).getBotName();
                }

                @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
                public ByteString getBotNameBytes() {
                    return ((Request) this.instance).getBotNameBytes();
                }

                public Builder setBotName(String value) {
                    copyOnWrite();
                    ((Request) this.instance).setBotName(value);
                    return this;
                }

                public Builder clearBotName() {
                    copyOnWrite();
                    ((Request) this.instance).clearBotName();
                    return this;
                }

                public Builder setBotNameBytes(ByteString value) {
                    copyOnWrite();
                    ((Request) this.instance).setBotNameBytes(value);
                    return this;
                }

                @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
                public String getBotAvatar() {
                    return ((Request) this.instance).getBotAvatar();
                }

                @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
                public ByteString getBotAvatarBytes() {
                    return ((Request) this.instance).getBotAvatarBytes();
                }

                public Builder setBotAvatar(String value) {
                    copyOnWrite();
                    ((Request) this.instance).setBotAvatar(value);
                    return this;
                }

                public Builder clearBotAvatar() {
                    copyOnWrite();
                    ((Request) this.instance).clearBotAvatar();
                    return this;
                }

                public Builder setBotAvatarBytes(ByteString value) {
                    copyOnWrite();
                    ((Request) this.instance).setBotAvatarBytes(value);
                    return this;
                }

                @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
                public String getProcessorName() {
                    return ((Request) this.instance).getProcessorName();
                }

                @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
                public ByteString getProcessorNameBytes() {
                    return ((Request) this.instance).getProcessorNameBytes();
                }

                public Builder setProcessorName(String value) {
                    copyOnWrite();
                    ((Request) this.instance).setProcessorName(value);
                    return this;
                }

                public Builder clearProcessorName() {
                    copyOnWrite();
                    ((Request) this.instance).clearProcessorName();
                    return this;
                }

                public Builder setProcessorNameBytes(ByteString value) {
                    copyOnWrite();
                    ((Request) this.instance).setProcessorNameBytes(value);
                    return this;
                }

                @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
                public String getNote() {
                    return ((Request) this.instance).getNote();
                }

                @Override // com.yhchat.canarys.proto.friend.FriendProto.request_list.RequestOrBuilder
                public ByteString getNoteBytes() {
                    return ((Request) this.instance).getNoteBytes();
                }

                public Builder setNote(String value) {
                    copyOnWrite();
                    ((Request) this.instance).setNote(value);
                    return this;
                }

                public Builder clearNote() {
                    copyOnWrite();
                    ((Request) this.instance).clearNote();
                    return this;
                }

                public Builder setNoteBytes(ByteString value) {
                    copyOnWrite();
                    ((Request) this.instance).setNoteBytes(value);
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
                switch (method) {
                    case NEW_MUTABLE_INSTANCE:
                        return new Request();
                    case NEW_BUILDER:
                        return new Builder();
                    case BUILD_MESSAGE_INFO:
                        Object[] objects = {"receiverName_", "receiverAvatar_", "name_", "avatar_", "groupName_", "groupAvatar_", "inviterId_", "sourceType_", "targetType_", "targetId_", "receiverId_", "result_", "processedAt_", "inviteAt_", "inviteAtStr_", "requestId_", "botName_", "botAvatar_", "processorName_", "note_"};
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0014\u0000\u0000\u0001\u0017\u0014\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0208\t\u0004\n\u0004\u000b\u0208\f\u0208\r\u0004\u000e\u0002\u0010\u0002\u0011\u0208\u0012\u0004\u0013\u0208\u0014\u0208\u0016\u0208\u0017\u0208", objects);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<Request> parser = PARSER;
                        if (parser == null) {
                            synchronized (Request.class) {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
                            }
                        }
                        return parser;
                    case GET_MEMOIZED_IS_INITIALIZED:
                        return (byte) 1;
                    case SET_MEMOIZED_IS_INITIALIZED:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                Request defaultInstance = new Request();
                DEFAULT_INSTANCE = defaultInstance;
                GeneratedMessageLite.registerDefaultInstance(Request.class, defaultInstance);
            }

            public static Request getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<Request> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        @Override // com.yhchat.canarys.proto.friend.FriendProto.request_listOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.yhchat.canarys.proto.friend.FriendProto.request_listOrBuilder
        public Status getStatus() {
            return this.status_ == null ? Status.getDefaultInstance() : this.status_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatus(Status value) {
            value.getClass();
            this.status_ = value;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStatus(Status value) {
            value.getClass();
            if (this.status_ != null && this.status_ != Status.getDefaultInstance()) {
                this.status_ = Status.newBuilder(this.status_).mergeFrom((Status.Builder) value).buildPartial();
            } else {
                this.status_ = value;
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatus() {
            this.status_ = null;
            this.bitField0_ &= -2;
        }

        @Override // com.yhchat.canarys.proto.friend.FriendProto.request_listOrBuilder
        public List<Request> getRequestsList() {
            return this.requests_;
        }

        public List<? extends RequestOrBuilder> getRequestsOrBuilderList() {
            return this.requests_;
        }

        @Override // com.yhchat.canarys.proto.friend.FriendProto.request_listOrBuilder
        public int getRequestsCount() {
            return this.requests_.size();
        }

        @Override // com.yhchat.canarys.proto.friend.FriendProto.request_listOrBuilder
        public Request getRequests(int index) {
            return this.requests_.get(index);
        }

        public RequestOrBuilder getRequestsOrBuilder(int index) {
            return this.requests_.get(index);
        }

        private void ensureRequestsIsMutable() {
            Internal.ProtobufList<Request> tmp = this.requests_;
            if (!tmp.isModifiable()) {
                this.requests_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequests(int index, Request value) {
            value.getClass();
            ensureRequestsIsMutable();
            this.requests_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRequests(Request value) {
            value.getClass();
            ensureRequestsIsMutable();
            this.requests_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRequests(int index, Request value) {
            value.getClass();
            ensureRequestsIsMutable();
            this.requests_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllRequests(Iterable<? extends Request> values) {
            ensureRequestsIsMutable();
            AbstractMessageLite.addAll(values, this.requests_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRequests() {
            this.requests_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeRequests(int index) {
            ensureRequestsIsMutable();
            this.requests_.remove(index);
        }

        @Override // com.yhchat.canarys.proto.friend.FriendProto.request_listOrBuilder
        public int getTotal() {
            return this.total_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotal(int value) {
            this.total_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTotal() {
            this.total_ = 0;
        }

        @Override // com.yhchat.canarys.proto.friend.FriendProto.request_listOrBuilder
        public int getPending() {
            return this.pending_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPending(int value) {
            this.pending_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPending() {
            this.pending_ = 0;
        }

        public static request_list parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (request_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static request_list parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (request_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static request_list parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (request_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static request_list parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (request_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static request_list parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (request_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static request_list parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (request_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static request_list parseFrom(InputStream input) throws IOException {
            return (request_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static request_list parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (request_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static request_list parseDelimitedFrom(InputStream input) throws IOException {
            return (request_list) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static request_list parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (request_list) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static request_list parseFrom(CodedInputStream input) throws IOException {
            return (request_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static request_list parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (request_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(request_list prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<request_list, Builder> implements request_listOrBuilder {
            private Builder() {
                super(request_list.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.request_listOrBuilder
            public boolean hasStatus() {
                return ((request_list) this.instance).hasStatus();
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.request_listOrBuilder
            public Status getStatus() {
                return ((request_list) this.instance).getStatus();
            }

            public Builder setStatus(Status value) {
                copyOnWrite();
                ((request_list) this.instance).setStatus(value);
                return this;
            }

            public Builder setStatus(Status.Builder builderForValue) {
                copyOnWrite();
                ((request_list) this.instance).setStatus(builderForValue.build());
                return this;
            }

            public Builder mergeStatus(Status value) {
                copyOnWrite();
                ((request_list) this.instance).mergeStatus(value);
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((request_list) this.instance).clearStatus();
                return this;
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.request_listOrBuilder
            public List<Request> getRequestsList() {
                return Collections.unmodifiableList(((request_list) this.instance).getRequestsList());
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.request_listOrBuilder
            public int getRequestsCount() {
                return ((request_list) this.instance).getRequestsCount();
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.request_listOrBuilder
            public Request getRequests(int index) {
                return ((request_list) this.instance).getRequests(index);
            }

            public Builder setRequests(int index, Request value) {
                copyOnWrite();
                ((request_list) this.instance).setRequests(index, value);
                return this;
            }

            public Builder setRequests(int index, Request.Builder builderForValue) {
                copyOnWrite();
                ((request_list) this.instance).setRequests(index, builderForValue.build());
                return this;
            }

            public Builder addRequests(Request value) {
                copyOnWrite();
                ((request_list) this.instance).addRequests(value);
                return this;
            }

            public Builder addRequests(int index, Request value) {
                copyOnWrite();
                ((request_list) this.instance).addRequests(index, value);
                return this;
            }

            public Builder addRequests(Request.Builder builderForValue) {
                copyOnWrite();
                ((request_list) this.instance).addRequests(builderForValue.build());
                return this;
            }

            public Builder addRequests(int index, Request.Builder builderForValue) {
                copyOnWrite();
                ((request_list) this.instance).addRequests(index, builderForValue.build());
                return this;
            }

            public Builder addAllRequests(Iterable<? extends Request> values) {
                copyOnWrite();
                ((request_list) this.instance).addAllRequests(values);
                return this;
            }

            public Builder clearRequests() {
                copyOnWrite();
                ((request_list) this.instance).clearRequests();
                return this;
            }

            public Builder removeRequests(int index) {
                copyOnWrite();
                ((request_list) this.instance).removeRequests(index);
                return this;
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.request_listOrBuilder
            public int getTotal() {
                return ((request_list) this.instance).getTotal();
            }

            public Builder setTotal(int value) {
                copyOnWrite();
                ((request_list) this.instance).setTotal(value);
                return this;
            }

            public Builder clearTotal() {
                copyOnWrite();
                ((request_list) this.instance).clearTotal();
                return this;
            }

            @Override // com.yhchat.canarys.proto.friend.FriendProto.request_listOrBuilder
            public int getPending() {
                return ((request_list) this.instance).getPending();
            }

            public Builder setPending(int value) {
                copyOnWrite();
                ((request_list) this.instance).setPending(value);
                return this;
            }

            public Builder clearPending() {
                copyOnWrite();
                ((request_list) this.instance).clearPending();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new request_list();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"bitField0_", "status_", "requests_", Request.class, "total_", "pending_"};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u1009\u0000\u0002\u001b\u0003\u0004\u0004\u0004", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<request_list> parser = PARSER;
                    if (parser == null) {
                        synchronized (request_list.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        }
                    }
                    return parser;
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            request_list defaultInstance = new request_list();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(request_list.class, defaultInstance);
        }

        public static request_list getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<request_list> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
