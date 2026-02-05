package com.yhchat.canarys.proto.user;

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

/* loaded from: classes15.dex */
public final class User {

    public interface DeviceInfoOrBuilder extends MessageLiteOrBuilder {
        String getDeviceId();

        ByteString getDeviceIdBytes();

        long getLoginTimestamp();

        String getPlatform();

        ByteString getPlatformBytes();

        String getUserId();

        ByteString getUserIdBytes();
    }

    public interface Medal_infoOrBuilder extends MessageLiteOrBuilder {
        long getId();

        String getName();

        ByteString getNameBytes();

        long getSort();
    }

    public interface OnlineDevicesResponseOrBuilder extends MessageLiteOrBuilder {
        DeviceInfo getDevices(int index);

        int getDevicesCount();

        List<DeviceInfo> getDevicesList();

        Status getStatus();

        boolean hasStatus();
    }

    public interface ProfileInfoOrBuilder extends MessageLiteOrBuilder {
        String getAddress();

        ByteString getAddressBytes();

        long getBirthday();

        String getCity();

        ByteString getCityBytes();

        String getDistrict();

        ByteString getDistrictBytes();

        int getGender();

        String getIntroduction();

        ByteString getIntroductionBytes();

        String getLastActiveTime();

        ByteString getLastActiveTimeBytes();
    }

    public interface RemarkInfoOrBuilder extends MessageLiteOrBuilder {
        String getExtraRemark();

        ByteString getExtraRemarkBytes();

        String getPhoneNumber();

        ByteString getPhoneNumberBytes();

        String getRemarkName();

        ByteString getRemarkNameBytes();
    }

    public interface StatusOrBuilder extends MessageLiteOrBuilder {
        int getCode();

        String getMsg();

        ByteString getMsgBytes();

        long getNumber();
    }

    public interface address_book_listOrBuilder extends MessageLiteOrBuilder {
        address_book_list.Data getData(int index);

        int getDataCount();

        List<address_book_list.Data> getDataList();

        Status getStatus();

        boolean hasStatus();
    }

    public interface address_book_list_sendOrBuilder extends MessageLiteOrBuilder {
        String getNumber();

        ByteString getNumberBytes();
    }

    public interface edit_avatarOrBuilder extends MessageLiteOrBuilder {
        Status getStatus();

        boolean hasStatus();
    }

    public interface edit_avatar_sendOrBuilder extends MessageLiteOrBuilder {
        String getUrl();

        ByteString getUrlBytes();
    }

    public interface edit_nicknameOrBuilder extends MessageLiteOrBuilder {
        Status getStatus();

        boolean hasStatus();
    }

    public interface edit_nickname_sendOrBuilder extends MessageLiteOrBuilder {
        String getName();

        ByteString getNameBytes();
    }

    public interface get_userOrBuilder extends MessageLiteOrBuilder {
        get_user.Data getData();

        Status getStatus();

        boolean hasData();

        boolean hasStatus();
    }

    public interface get_user_sendOrBuilder extends MessageLiteOrBuilder {
        String getId();

        ByteString getIdBytes();
    }

    public interface infoOrBuilder extends MessageLiteOrBuilder {
        info.Data getData();

        Status getStatus();

        boolean hasData();

        boolean hasStatus();
    }

    public interface medalOrBuilder extends MessageLiteOrBuilder {
        Medal_info getMedal(int index);

        int getMedalCount();

        List<Medal_info> getMedalList();

        Status getStatus();

        boolean hasStatus();
    }

    private User() {
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

        @Override // com.yhchat.canarys.proto.user.User.StatusOrBuilder
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

        @Override // com.yhchat.canarys.proto.user.User.StatusOrBuilder
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

        @Override // com.yhchat.canarys.proto.user.User.StatusOrBuilder
        public String getMsg() {
            return this.msg_;
        }

        @Override // com.yhchat.canarys.proto.user.User.StatusOrBuilder
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

            @Override // com.yhchat.canarys.proto.user.User.StatusOrBuilder
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

            @Override // com.yhchat.canarys.proto.user.User.StatusOrBuilder
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

            @Override // com.yhchat.canarys.proto.user.User.StatusOrBuilder
            public String getMsg() {
                return ((Status) this.instance).getMsg();
            }

            @Override // com.yhchat.canarys.proto.user.User.StatusOrBuilder
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

    public static final class info extends GeneratedMessageLite<info, Builder> implements infoOrBuilder {
        public static final int DATA_FIELD_NUMBER = 2;
        private static final info DEFAULT_INSTANCE;
        private static volatile Parser<info> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 1;
        private int bitField0_;
        private Data data_;
        private Status status_;

        public interface DataOrBuilder extends MessageLiteOrBuilder {
            long getAvatarId();

            String getAvatarUrl();

            ByteString getAvatarUrlBytes();

            double getCoin();

            String getEmail();

            ByteString getEmailBytes();

            String getId();

            ByteString getIdBytes();

            String getInvitationCode();

            ByteString getInvitationCodeBytes();

            int getIsVip();

            String getName();

            ByteString getNameBytes();

            String getPhone();

            ByteString getPhoneBytes();

            long getVipExpiredTime();
        }

        private info() {
        }

        public static final class Data extends GeneratedMessageLite<Data, Builder> implements DataOrBuilder {
            public static final int AVATAR_ID_FIELD_NUMBER = 5;
            public static final int AVATAR_URL_FIELD_NUMBER = 4;
            public static final int COIN_FIELD_NUMBER = 8;
            private static final Data DEFAULT_INSTANCE;
            public static final int EMAIL_FIELD_NUMBER = 7;
            public static final int ID_FIELD_NUMBER = 1;
            public static final int INVITATION_CODE_FIELD_NUMBER = 12;
            public static final int IS_VIP_FIELD_NUMBER = 9;
            public static final int NAME_FIELD_NUMBER = 2;
            private static volatile Parser<Data> PARSER = null;
            public static final int PHONE_FIELD_NUMBER = 6;
            public static final int VIP_EXPIRED_TIME_FIELD_NUMBER = 10;
            private long avatarId_;
            private double coin_;
            private int isVip_;
            private long vipExpiredTime_;
            private String id_ = "";
            private String name_ = "";
            private String avatarUrl_ = "";
            private String phone_ = "";
            private String email_ = "";
            private String invitationCode_ = "";

            private Data() {
            }

            @Override // com.yhchat.canarys.proto.user.User.info.DataOrBuilder
            public String getId() {
                return this.id_;
            }

            @Override // com.yhchat.canarys.proto.user.User.info.DataOrBuilder
            public ByteString getIdBytes() {
                return ByteString.copyFromUtf8(this.id_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setId(String value) {
                value.getClass();
                this.id_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearId() {
                this.id_ = getDefaultInstance().getId();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setIdBytes(ByteString value) {
                checkByteStringIsUtf8(value);
                this.id_ = value.toStringUtf8();
            }

            @Override // com.yhchat.canarys.proto.user.User.info.DataOrBuilder
            public String getName() {
                return this.name_;
            }

            @Override // com.yhchat.canarys.proto.user.User.info.DataOrBuilder
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

            @Override // com.yhchat.canarys.proto.user.User.info.DataOrBuilder
            public String getAvatarUrl() {
                return this.avatarUrl_;
            }

            @Override // com.yhchat.canarys.proto.user.User.info.DataOrBuilder
            public ByteString getAvatarUrlBytes() {
                return ByteString.copyFromUtf8(this.avatarUrl_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAvatarUrl(String value) {
                value.getClass();
                this.avatarUrl_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAvatarUrl() {
                this.avatarUrl_ = getDefaultInstance().getAvatarUrl();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAvatarUrlBytes(ByteString value) {
                checkByteStringIsUtf8(value);
                this.avatarUrl_ = value.toStringUtf8();
            }

            @Override // com.yhchat.canarys.proto.user.User.info.DataOrBuilder
            public long getAvatarId() {
                return this.avatarId_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAvatarId(long value) {
                this.avatarId_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAvatarId() {
                this.avatarId_ = 0L;
            }

            @Override // com.yhchat.canarys.proto.user.User.info.DataOrBuilder
            public String getPhone() {
                return this.phone_;
            }

            @Override // com.yhchat.canarys.proto.user.User.info.DataOrBuilder
            public ByteString getPhoneBytes() {
                return ByteString.copyFromUtf8(this.phone_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPhone(String value) {
                value.getClass();
                this.phone_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearPhone() {
                this.phone_ = getDefaultInstance().getPhone();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPhoneBytes(ByteString value) {
                checkByteStringIsUtf8(value);
                this.phone_ = value.toStringUtf8();
            }

            @Override // com.yhchat.canarys.proto.user.User.info.DataOrBuilder
            public String getEmail() {
                return this.email_;
            }

            @Override // com.yhchat.canarys.proto.user.User.info.DataOrBuilder
            public ByteString getEmailBytes() {
                return ByteString.copyFromUtf8(this.email_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setEmail(String value) {
                value.getClass();
                this.email_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearEmail() {
                this.email_ = getDefaultInstance().getEmail();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setEmailBytes(ByteString value) {
                checkByteStringIsUtf8(value);
                this.email_ = value.toStringUtf8();
            }

            @Override // com.yhchat.canarys.proto.user.User.info.DataOrBuilder
            public double getCoin() {
                return this.coin_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCoin(double value) {
                this.coin_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearCoin() {
                this.coin_ = 0.0d;
            }

            @Override // com.yhchat.canarys.proto.user.User.info.DataOrBuilder
            public int getIsVip() {
                return this.isVip_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setIsVip(int value) {
                this.isVip_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearIsVip() {
                this.isVip_ = 0;
            }

            @Override // com.yhchat.canarys.proto.user.User.info.DataOrBuilder
            public long getVipExpiredTime() {
                return this.vipExpiredTime_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setVipExpiredTime(long value) {
                this.vipExpiredTime_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearVipExpiredTime() {
                this.vipExpiredTime_ = 0L;
            }

            @Override // com.yhchat.canarys.proto.user.User.info.DataOrBuilder
            public String getInvitationCode() {
                return this.invitationCode_;
            }

            @Override // com.yhchat.canarys.proto.user.User.info.DataOrBuilder
            public ByteString getInvitationCodeBytes() {
                return ByteString.copyFromUtf8(this.invitationCode_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setInvitationCode(String value) {
                value.getClass();
                this.invitationCode_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearInvitationCode() {
                this.invitationCode_ = getDefaultInstance().getInvitationCode();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setInvitationCodeBytes(ByteString value) {
                checkByteStringIsUtf8(value);
                this.invitationCode_ = value.toStringUtf8();
            }

            public static Data parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Data parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Data parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Data parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Data parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Data parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Data parseFrom(InputStream input) throws IOException {
                return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static Data parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Data parseDelimitedFrom(InputStream input) throws IOException {
                return (Data) parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static Data parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Data) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Data parseFrom(CodedInputStream input) throws IOException {
                return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static Data parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(Data prototype) {
                return DEFAULT_INSTANCE.createBuilder(prototype);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<Data, Builder> implements DataOrBuilder {
                private Builder() {
                    super(Data.DEFAULT_INSTANCE);
                }

                @Override // com.yhchat.canarys.proto.user.User.info.DataOrBuilder
                public String getId() {
                    return ((Data) this.instance).getId();
                }

                @Override // com.yhchat.canarys.proto.user.User.info.DataOrBuilder
                public ByteString getIdBytes() {
                    return ((Data) this.instance).getIdBytes();
                }

                public Builder setId(String value) {
                    copyOnWrite();
                    ((Data) this.instance).setId(value);
                    return this;
                }

                public Builder clearId() {
                    copyOnWrite();
                    ((Data) this.instance).clearId();
                    return this;
                }

                public Builder setIdBytes(ByteString value) {
                    copyOnWrite();
                    ((Data) this.instance).setIdBytes(value);
                    return this;
                }

                @Override // com.yhchat.canarys.proto.user.User.info.DataOrBuilder
                public String getName() {
                    return ((Data) this.instance).getName();
                }

                @Override // com.yhchat.canarys.proto.user.User.info.DataOrBuilder
                public ByteString getNameBytes() {
                    return ((Data) this.instance).getNameBytes();
                }

                public Builder setName(String value) {
                    copyOnWrite();
                    ((Data) this.instance).setName(value);
                    return this;
                }

                public Builder clearName() {
                    copyOnWrite();
                    ((Data) this.instance).clearName();
                    return this;
                }

                public Builder setNameBytes(ByteString value) {
                    copyOnWrite();
                    ((Data) this.instance).setNameBytes(value);
                    return this;
                }

                @Override // com.yhchat.canarys.proto.user.User.info.DataOrBuilder
                public String getAvatarUrl() {
                    return ((Data) this.instance).getAvatarUrl();
                }

                @Override // com.yhchat.canarys.proto.user.User.info.DataOrBuilder
                public ByteString getAvatarUrlBytes() {
                    return ((Data) this.instance).getAvatarUrlBytes();
                }

                public Builder setAvatarUrl(String value) {
                    copyOnWrite();
                    ((Data) this.instance).setAvatarUrl(value);
                    return this;
                }

                public Builder clearAvatarUrl() {
                    copyOnWrite();
                    ((Data) this.instance).clearAvatarUrl();
                    return this;
                }

                public Builder setAvatarUrlBytes(ByteString value) {
                    copyOnWrite();
                    ((Data) this.instance).setAvatarUrlBytes(value);
                    return this;
                }

                @Override // com.yhchat.canarys.proto.user.User.info.DataOrBuilder
                public long getAvatarId() {
                    return ((Data) this.instance).getAvatarId();
                }

                public Builder setAvatarId(long value) {
                    copyOnWrite();
                    ((Data) this.instance).setAvatarId(value);
                    return this;
                }

                public Builder clearAvatarId() {
                    copyOnWrite();
                    ((Data) this.instance).clearAvatarId();
                    return this;
                }

                @Override // com.yhchat.canarys.proto.user.User.info.DataOrBuilder
                public String getPhone() {
                    return ((Data) this.instance).getPhone();
                }

                @Override // com.yhchat.canarys.proto.user.User.info.DataOrBuilder
                public ByteString getPhoneBytes() {
                    return ((Data) this.instance).getPhoneBytes();
                }

                public Builder setPhone(String value) {
                    copyOnWrite();
                    ((Data) this.instance).setPhone(value);
                    return this;
                }

                public Builder clearPhone() {
                    copyOnWrite();
                    ((Data) this.instance).clearPhone();
                    return this;
                }

                public Builder setPhoneBytes(ByteString value) {
                    copyOnWrite();
                    ((Data) this.instance).setPhoneBytes(value);
                    return this;
                }

                @Override // com.yhchat.canarys.proto.user.User.info.DataOrBuilder
                public String getEmail() {
                    return ((Data) this.instance).getEmail();
                }

                @Override // com.yhchat.canarys.proto.user.User.info.DataOrBuilder
                public ByteString getEmailBytes() {
                    return ((Data) this.instance).getEmailBytes();
                }

                public Builder setEmail(String value) {
                    copyOnWrite();
                    ((Data) this.instance).setEmail(value);
                    return this;
                }

                public Builder clearEmail() {
                    copyOnWrite();
                    ((Data) this.instance).clearEmail();
                    return this;
                }

                public Builder setEmailBytes(ByteString value) {
                    copyOnWrite();
                    ((Data) this.instance).setEmailBytes(value);
                    return this;
                }

                @Override // com.yhchat.canarys.proto.user.User.info.DataOrBuilder
                public double getCoin() {
                    return ((Data) this.instance).getCoin();
                }

                public Builder setCoin(double value) {
                    copyOnWrite();
                    ((Data) this.instance).setCoin(value);
                    return this;
                }

                public Builder clearCoin() {
                    copyOnWrite();
                    ((Data) this.instance).clearCoin();
                    return this;
                }

                @Override // com.yhchat.canarys.proto.user.User.info.DataOrBuilder
                public int getIsVip() {
                    return ((Data) this.instance).getIsVip();
                }

                public Builder setIsVip(int value) {
                    copyOnWrite();
                    ((Data) this.instance).setIsVip(value);
                    return this;
                }

                public Builder clearIsVip() {
                    copyOnWrite();
                    ((Data) this.instance).clearIsVip();
                    return this;
                }

                @Override // com.yhchat.canarys.proto.user.User.info.DataOrBuilder
                public long getVipExpiredTime() {
                    return ((Data) this.instance).getVipExpiredTime();
                }

                public Builder setVipExpiredTime(long value) {
                    copyOnWrite();
                    ((Data) this.instance).setVipExpiredTime(value);
                    return this;
                }

                public Builder clearVipExpiredTime() {
                    copyOnWrite();
                    ((Data) this.instance).clearVipExpiredTime();
                    return this;
                }

                @Override // com.yhchat.canarys.proto.user.User.info.DataOrBuilder
                public String getInvitationCode() {
                    return ((Data) this.instance).getInvitationCode();
                }

                @Override // com.yhchat.canarys.proto.user.User.info.DataOrBuilder
                public ByteString getInvitationCodeBytes() {
                    return ((Data) this.instance).getInvitationCodeBytes();
                }

                public Builder setInvitationCode(String value) {
                    copyOnWrite();
                    ((Data) this.instance).setInvitationCode(value);
                    return this;
                }

                public Builder clearInvitationCode() {
                    copyOnWrite();
                    ((Data) this.instance).clearInvitationCode();
                    return this;
                }

                public Builder setInvitationCodeBytes(ByteString value) {
                    copyOnWrite();
                    ((Data) this.instance).setInvitationCodeBytes(value);
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
                switch (method) {
                    case NEW_MUTABLE_INSTANCE:
                        return new Data();
                    case NEW_BUILDER:
                        return new Builder();
                    case BUILD_MESSAGE_INFO:
                        Object[] objects = {"id_", "name_", "avatarUrl_", "avatarId_", "phone_", "email_", "coin_", "isVip_", "vipExpiredTime_", "invitationCode_"};
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\f\n\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0004\u0208\u0005\u0002\u0006\u0208\u0007\u0208\b\u0000\t\u0004\n\u0002\f\u0208", objects);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<Data> parser = PARSER;
                        if (parser == null) {
                            synchronized (Data.class) {
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
                Data defaultInstance = new Data();
                DEFAULT_INSTANCE = defaultInstance;
                GeneratedMessageLite.registerDefaultInstance(Data.class, defaultInstance);
            }

            public static Data getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<Data> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        @Override // com.yhchat.canarys.proto.user.User.infoOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.yhchat.canarys.proto.user.User.infoOrBuilder
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

        @Override // com.yhchat.canarys.proto.user.User.infoOrBuilder
        public boolean hasData() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.yhchat.canarys.proto.user.User.infoOrBuilder
        public Data getData() {
            return this.data_ == null ? Data.getDefaultInstance() : this.data_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData(Data value) {
            value.getClass();
            this.data_ = value;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeData(Data value) {
            value.getClass();
            if (this.data_ != null && this.data_ != Data.getDefaultInstance()) {
                this.data_ = Data.newBuilder(this.data_).mergeFrom((Data.Builder) value).buildPartial();
            } else {
                this.data_ = value;
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData() {
            this.data_ = null;
            this.bitField0_ &= -3;
        }

        public static info parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static info parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static info parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static info parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static info parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static info parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static info parseFrom(InputStream input) throws IOException {
            return (info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static info parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static info parseDelimitedFrom(InputStream input) throws IOException {
            return (info) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static info parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (info) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static info parseFrom(CodedInputStream input) throws IOException {
            return (info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static info parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(info prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<info, Builder> implements infoOrBuilder {
            private Builder() {
                super(info.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.user.User.infoOrBuilder
            public boolean hasStatus() {
                return ((info) this.instance).hasStatus();
            }

            @Override // com.yhchat.canarys.proto.user.User.infoOrBuilder
            public Status getStatus() {
                return ((info) this.instance).getStatus();
            }

            public Builder setStatus(Status value) {
                copyOnWrite();
                ((info) this.instance).setStatus(value);
                return this;
            }

            public Builder setStatus(Status.Builder builderForValue) {
                copyOnWrite();
                ((info) this.instance).setStatus(builderForValue.build());
                return this;
            }

            public Builder mergeStatus(Status value) {
                copyOnWrite();
                ((info) this.instance).mergeStatus(value);
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((info) this.instance).clearStatus();
                return this;
            }

            @Override // com.yhchat.canarys.proto.user.User.infoOrBuilder
            public boolean hasData() {
                return ((info) this.instance).hasData();
            }

            @Override // com.yhchat.canarys.proto.user.User.infoOrBuilder
            public Data getData() {
                return ((info) this.instance).getData();
            }

            public Builder setData(Data value) {
                copyOnWrite();
                ((info) this.instance).setData(value);
                return this;
            }

            public Builder setData(Data.Builder builderForValue) {
                copyOnWrite();
                ((info) this.instance).setData(builderForValue.build());
                return this;
            }

            public Builder mergeData(Data value) {
                copyOnWrite();
                ((info) this.instance).mergeData(value);
                return this;
            }

            public Builder clearData() {
                copyOnWrite();
                ((info) this.instance).clearData();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new info();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"bitField0_", "status_", "data_"};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<info> parser = PARSER;
                    if (parser == null) {
                        synchronized (info.class) {
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
            info defaultInstance = new info();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(info.class, defaultInstance);
        }

        public static info getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<info> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class get_user_send extends GeneratedMessageLite<get_user_send, Builder> implements get_user_sendOrBuilder {
        private static final get_user_send DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 2;
        private static volatile Parser<get_user_send> PARSER;
        private String id_ = "";

        private get_user_send() {
        }

        @Override // com.yhchat.canarys.proto.user.User.get_user_sendOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.yhchat.canarys.proto.user.User.get_user_sendOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String value) {
            value.getClass();
            this.id_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.id_ = value.toStringUtf8();
        }

        public static get_user_send parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (get_user_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static get_user_send parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (get_user_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static get_user_send parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (get_user_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static get_user_send parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (get_user_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static get_user_send parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (get_user_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static get_user_send parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (get_user_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static get_user_send parseFrom(InputStream input) throws IOException {
            return (get_user_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static get_user_send parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (get_user_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static get_user_send parseDelimitedFrom(InputStream input) throws IOException {
            return (get_user_send) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static get_user_send parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (get_user_send) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static get_user_send parseFrom(CodedInputStream input) throws IOException {
            return (get_user_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static get_user_send parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (get_user_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(get_user_send prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<get_user_send, Builder> implements get_user_sendOrBuilder {
            private Builder() {
                super(get_user_send.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.user.User.get_user_sendOrBuilder
            public String getId() {
                return ((get_user_send) this.instance).getId();
            }

            @Override // com.yhchat.canarys.proto.user.User.get_user_sendOrBuilder
            public ByteString getIdBytes() {
                return ((get_user_send) this.instance).getIdBytes();
            }

            public Builder setId(String value) {
                copyOnWrite();
                ((get_user_send) this.instance).setId(value);
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((get_user_send) this.instance).clearId();
                return this;
            }

            public Builder setIdBytes(ByteString value) {
                copyOnWrite();
                ((get_user_send) this.instance).setIdBytes(value);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new get_user_send();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"id_"};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u0208", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<get_user_send> parser = PARSER;
                    if (parser == null) {
                        synchronized (get_user_send.class) {
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
            get_user_send defaultInstance = new get_user_send();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(get_user_send.class, defaultInstance);
        }

        public static get_user_send getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<get_user_send> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class get_user extends GeneratedMessageLite<get_user, Builder> implements get_userOrBuilder {
        public static final int DATA_FIELD_NUMBER = 2;
        private static final get_user DEFAULT_INSTANCE;
        private static volatile Parser<get_user> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 1;
        private int bitField0_;
        private Data data_;
        private Status status_;

        public interface DataOrBuilder extends MessageLiteOrBuilder {
            long getAvatarId();

            String getAvatarUrl();

            ByteString getAvatarUrlBytes();

            long getBanTime();

            int getContinuousOnlineDay();

            String getId();

            ByteString getIdBytes();

            int getIsVip();

            Medal_info getMedal(int index);

            int getMedalCount();

            List<Medal_info> getMedalList();

            String getName();

            ByteString getNameBytes();

            long getNameId();

            int getOnlineDay();

            ProfileInfo getProfileInfo();

            String getRegisterTime();

            ByteString getRegisterTimeBytes();

            RemarkInfo getRemarkInfo();

            long getVipExpiredTime();

            boolean hasProfileInfo();

            boolean hasRemarkInfo();
        }

        private get_user() {
        }

        public static final class Data extends GeneratedMessageLite<Data, Builder> implements DataOrBuilder {
            public static final int AVATAR_ID_FIELD_NUMBER = 5;
            public static final int AVATAR_URL_FIELD_NUMBER = 4;
            public static final int BAN_TIME_FIELD_NUMBER = 10;
            public static final int CONTINUOUS_ONLINE_DAY_FIELD_NUMBER = 12;
            private static final Data DEFAULT_INSTANCE;
            public static final int ID_FIELD_NUMBER = 1;
            public static final int IS_VIP_FIELD_NUMBER = 13;
            public static final int MEDAL_FIELD_NUMBER = 6;
            public static final int NAME_FIELD_NUMBER = 2;
            public static final int NAME_ID_FIELD_NUMBER = 3;
            public static final int ONLINE_DAY_FIELD_NUMBER = 11;
            private static volatile Parser<Data> PARSER = null;
            public static final int PROFILE_INFO_FIELD_NUMBER = 19;
            public static final int REGISTER_TIME_FIELD_NUMBER = 7;
            public static final int REMARK_INFO_FIELD_NUMBER = 18;
            public static final int VIP_EXPIRED_TIME_FIELD_NUMBER = 14;
            private long avatarId_;
            private long banTime_;
            private int bitField0_;
            private int continuousOnlineDay_;
            private int isVip_;
            private long nameId_;
            private int onlineDay_;
            private ProfileInfo profileInfo_;
            private RemarkInfo remarkInfo_;
            private long vipExpiredTime_;
            private String id_ = "";
            private String name_ = "";
            private String avatarUrl_ = "";
            private Internal.ProtobufList<Medal_info> medal_ = emptyProtobufList();
            private String registerTime_ = "";

            private Data() {
            }

            @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
            public String getId() {
                return this.id_;
            }

            @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
            public ByteString getIdBytes() {
                return ByteString.copyFromUtf8(this.id_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setId(String value) {
                value.getClass();
                this.id_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearId() {
                this.id_ = getDefaultInstance().getId();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setIdBytes(ByteString value) {
                checkByteStringIsUtf8(value);
                this.id_ = value.toStringUtf8();
            }

            @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
            public String getName() {
                return this.name_;
            }

            @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
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

            @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
            public long getNameId() {
                return this.nameId_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNameId(long value) {
                this.nameId_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearNameId() {
                this.nameId_ = 0L;
            }

            @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
            public String getAvatarUrl() {
                return this.avatarUrl_;
            }

            @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
            public ByteString getAvatarUrlBytes() {
                return ByteString.copyFromUtf8(this.avatarUrl_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAvatarUrl(String value) {
                value.getClass();
                this.avatarUrl_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAvatarUrl() {
                this.avatarUrl_ = getDefaultInstance().getAvatarUrl();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAvatarUrlBytes(ByteString value) {
                checkByteStringIsUtf8(value);
                this.avatarUrl_ = value.toStringUtf8();
            }

            @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
            public long getAvatarId() {
                return this.avatarId_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAvatarId(long value) {
                this.avatarId_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAvatarId() {
                this.avatarId_ = 0L;
            }

            @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
            public List<Medal_info> getMedalList() {
                return this.medal_;
            }

            public List<? extends Medal_infoOrBuilder> getMedalOrBuilderList() {
                return this.medal_;
            }

            @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
            public int getMedalCount() {
                return this.medal_.size();
            }

            @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
            public Medal_info getMedal(int index) {
                return this.medal_.get(index);
            }

            public Medal_infoOrBuilder getMedalOrBuilder(int index) {
                return this.medal_.get(index);
            }

            private void ensureMedalIsMutable() {
                Internal.ProtobufList<Medal_info> tmp = this.medal_;
                if (!tmp.isModifiable()) {
                    this.medal_ = GeneratedMessageLite.mutableCopy(tmp);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMedal(int index, Medal_info value) {
                value.getClass();
                ensureMedalIsMutable();
                this.medal_.set(index, value);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addMedal(Medal_info value) {
                value.getClass();
                ensureMedalIsMutable();
                this.medal_.add(value);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addMedal(int index, Medal_info value) {
                value.getClass();
                ensureMedalIsMutable();
                this.medal_.add(index, value);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllMedal(Iterable<? extends Medal_info> values) {
                ensureMedalIsMutable();
                AbstractMessageLite.addAll(values, this.medal_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMedal() {
                this.medal_ = emptyProtobufList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void removeMedal(int index) {
                ensureMedalIsMutable();
                this.medal_.remove(index);
            }

            @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
            public String getRegisterTime() {
                return this.registerTime_;
            }

            @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
            public ByteString getRegisterTimeBytes() {
                return ByteString.copyFromUtf8(this.registerTime_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setRegisterTime(String value) {
                value.getClass();
                this.registerTime_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearRegisterTime() {
                this.registerTime_ = getDefaultInstance().getRegisterTime();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setRegisterTimeBytes(ByteString value) {
                checkByteStringIsUtf8(value);
                this.registerTime_ = value.toStringUtf8();
            }

            @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
            public long getBanTime() {
                return this.banTime_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBanTime(long value) {
                this.banTime_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBanTime() {
                this.banTime_ = 0L;
            }

            @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
            public int getOnlineDay() {
                return this.onlineDay_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOnlineDay(int value) {
                this.onlineDay_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearOnlineDay() {
                this.onlineDay_ = 0;
            }

            @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
            public int getContinuousOnlineDay() {
                return this.continuousOnlineDay_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setContinuousOnlineDay(int value) {
                this.continuousOnlineDay_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearContinuousOnlineDay() {
                this.continuousOnlineDay_ = 0;
            }

            @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
            public int getIsVip() {
                return this.isVip_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setIsVip(int value) {
                this.isVip_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearIsVip() {
                this.isVip_ = 0;
            }

            @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
            public long getVipExpiredTime() {
                return this.vipExpiredTime_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setVipExpiredTime(long value) {
                this.vipExpiredTime_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearVipExpiredTime() {
                this.vipExpiredTime_ = 0L;
            }

            @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
            public boolean hasRemarkInfo() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
            public RemarkInfo getRemarkInfo() {
                return this.remarkInfo_ == null ? RemarkInfo.getDefaultInstance() : this.remarkInfo_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setRemarkInfo(RemarkInfo value) {
                value.getClass();
                this.remarkInfo_ = value;
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeRemarkInfo(RemarkInfo value) {
                value.getClass();
                if (this.remarkInfo_ != null && this.remarkInfo_ != RemarkInfo.getDefaultInstance()) {
                    this.remarkInfo_ = RemarkInfo.newBuilder(this.remarkInfo_).mergeFrom((RemarkInfo.Builder) value).buildPartial();
                } else {
                    this.remarkInfo_ = value;
                }
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearRemarkInfo() {
                this.remarkInfo_ = null;
                this.bitField0_ &= -2;
            }

            @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
            public boolean hasProfileInfo() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
            public ProfileInfo getProfileInfo() {
                return this.profileInfo_ == null ? ProfileInfo.getDefaultInstance() : this.profileInfo_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setProfileInfo(ProfileInfo value) {
                value.getClass();
                this.profileInfo_ = value;
                this.bitField0_ |= 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeProfileInfo(ProfileInfo value) {
                value.getClass();
                if (this.profileInfo_ != null && this.profileInfo_ != ProfileInfo.getDefaultInstance()) {
                    this.profileInfo_ = ProfileInfo.newBuilder(this.profileInfo_).mergeFrom((ProfileInfo.Builder) value).buildPartial();
                } else {
                    this.profileInfo_ = value;
                }
                this.bitField0_ |= 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearProfileInfo() {
                this.profileInfo_ = null;
                this.bitField0_ &= -3;
            }

            public static Data parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Data parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Data parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Data parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Data parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Data parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Data parseFrom(InputStream input) throws IOException {
                return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static Data parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Data parseDelimitedFrom(InputStream input) throws IOException {
                return (Data) parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static Data parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Data) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Data parseFrom(CodedInputStream input) throws IOException {
                return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static Data parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(Data prototype) {
                return DEFAULT_INSTANCE.createBuilder(prototype);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<Data, Builder> implements DataOrBuilder {
                private Builder() {
                    super(Data.DEFAULT_INSTANCE);
                }

                @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
                public String getId() {
                    return ((Data) this.instance).getId();
                }

                @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
                public ByteString getIdBytes() {
                    return ((Data) this.instance).getIdBytes();
                }

                public Builder setId(String value) {
                    copyOnWrite();
                    ((Data) this.instance).setId(value);
                    return this;
                }

                public Builder clearId() {
                    copyOnWrite();
                    ((Data) this.instance).clearId();
                    return this;
                }

                public Builder setIdBytes(ByteString value) {
                    copyOnWrite();
                    ((Data) this.instance).setIdBytes(value);
                    return this;
                }

                @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
                public String getName() {
                    return ((Data) this.instance).getName();
                }

                @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
                public ByteString getNameBytes() {
                    return ((Data) this.instance).getNameBytes();
                }

                public Builder setName(String value) {
                    copyOnWrite();
                    ((Data) this.instance).setName(value);
                    return this;
                }

                public Builder clearName() {
                    copyOnWrite();
                    ((Data) this.instance).clearName();
                    return this;
                }

                public Builder setNameBytes(ByteString value) {
                    copyOnWrite();
                    ((Data) this.instance).setNameBytes(value);
                    return this;
                }

                @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
                public long getNameId() {
                    return ((Data) this.instance).getNameId();
                }

                public Builder setNameId(long value) {
                    copyOnWrite();
                    ((Data) this.instance).setNameId(value);
                    return this;
                }

                public Builder clearNameId() {
                    copyOnWrite();
                    ((Data) this.instance).clearNameId();
                    return this;
                }

                @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
                public String getAvatarUrl() {
                    return ((Data) this.instance).getAvatarUrl();
                }

                @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
                public ByteString getAvatarUrlBytes() {
                    return ((Data) this.instance).getAvatarUrlBytes();
                }

                public Builder setAvatarUrl(String value) {
                    copyOnWrite();
                    ((Data) this.instance).setAvatarUrl(value);
                    return this;
                }

                public Builder clearAvatarUrl() {
                    copyOnWrite();
                    ((Data) this.instance).clearAvatarUrl();
                    return this;
                }

                public Builder setAvatarUrlBytes(ByteString value) {
                    copyOnWrite();
                    ((Data) this.instance).setAvatarUrlBytes(value);
                    return this;
                }

                @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
                public long getAvatarId() {
                    return ((Data) this.instance).getAvatarId();
                }

                public Builder setAvatarId(long value) {
                    copyOnWrite();
                    ((Data) this.instance).setAvatarId(value);
                    return this;
                }

                public Builder clearAvatarId() {
                    copyOnWrite();
                    ((Data) this.instance).clearAvatarId();
                    return this;
                }

                @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
                public List<Medal_info> getMedalList() {
                    return Collections.unmodifiableList(((Data) this.instance).getMedalList());
                }

                @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
                public int getMedalCount() {
                    return ((Data) this.instance).getMedalCount();
                }

                @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
                public Medal_info getMedal(int index) {
                    return ((Data) this.instance).getMedal(index);
                }

                public Builder setMedal(int index, Medal_info value) {
                    copyOnWrite();
                    ((Data) this.instance).setMedal(index, value);
                    return this;
                }

                public Builder setMedal(int index, Medal_info.Builder builderForValue) {
                    copyOnWrite();
                    ((Data) this.instance).setMedal(index, builderForValue.build());
                    return this;
                }

                public Builder addMedal(Medal_info value) {
                    copyOnWrite();
                    ((Data) this.instance).addMedal(value);
                    return this;
                }

                public Builder addMedal(int index, Medal_info value) {
                    copyOnWrite();
                    ((Data) this.instance).addMedal(index, value);
                    return this;
                }

                public Builder addMedal(Medal_info.Builder builderForValue) {
                    copyOnWrite();
                    ((Data) this.instance).addMedal(builderForValue.build());
                    return this;
                }

                public Builder addMedal(int index, Medal_info.Builder builderForValue) {
                    copyOnWrite();
                    ((Data) this.instance).addMedal(index, builderForValue.build());
                    return this;
                }

                public Builder addAllMedal(Iterable<? extends Medal_info> values) {
                    copyOnWrite();
                    ((Data) this.instance).addAllMedal(values);
                    return this;
                }

                public Builder clearMedal() {
                    copyOnWrite();
                    ((Data) this.instance).clearMedal();
                    return this;
                }

                public Builder removeMedal(int index) {
                    copyOnWrite();
                    ((Data) this.instance).removeMedal(index);
                    return this;
                }

                @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
                public String getRegisterTime() {
                    return ((Data) this.instance).getRegisterTime();
                }

                @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
                public ByteString getRegisterTimeBytes() {
                    return ((Data) this.instance).getRegisterTimeBytes();
                }

                public Builder setRegisterTime(String value) {
                    copyOnWrite();
                    ((Data) this.instance).setRegisterTime(value);
                    return this;
                }

                public Builder clearRegisterTime() {
                    copyOnWrite();
                    ((Data) this.instance).clearRegisterTime();
                    return this;
                }

                public Builder setRegisterTimeBytes(ByteString value) {
                    copyOnWrite();
                    ((Data) this.instance).setRegisterTimeBytes(value);
                    return this;
                }

                @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
                public long getBanTime() {
                    return ((Data) this.instance).getBanTime();
                }

                public Builder setBanTime(long value) {
                    copyOnWrite();
                    ((Data) this.instance).setBanTime(value);
                    return this;
                }

                public Builder clearBanTime() {
                    copyOnWrite();
                    ((Data) this.instance).clearBanTime();
                    return this;
                }

                @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
                public int getOnlineDay() {
                    return ((Data) this.instance).getOnlineDay();
                }

                public Builder setOnlineDay(int value) {
                    copyOnWrite();
                    ((Data) this.instance).setOnlineDay(value);
                    return this;
                }

                public Builder clearOnlineDay() {
                    copyOnWrite();
                    ((Data) this.instance).clearOnlineDay();
                    return this;
                }

                @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
                public int getContinuousOnlineDay() {
                    return ((Data) this.instance).getContinuousOnlineDay();
                }

                public Builder setContinuousOnlineDay(int value) {
                    copyOnWrite();
                    ((Data) this.instance).setContinuousOnlineDay(value);
                    return this;
                }

                public Builder clearContinuousOnlineDay() {
                    copyOnWrite();
                    ((Data) this.instance).clearContinuousOnlineDay();
                    return this;
                }

                @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
                public int getIsVip() {
                    return ((Data) this.instance).getIsVip();
                }

                public Builder setIsVip(int value) {
                    copyOnWrite();
                    ((Data) this.instance).setIsVip(value);
                    return this;
                }

                public Builder clearIsVip() {
                    copyOnWrite();
                    ((Data) this.instance).clearIsVip();
                    return this;
                }

                @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
                public long getVipExpiredTime() {
                    return ((Data) this.instance).getVipExpiredTime();
                }

                public Builder setVipExpiredTime(long value) {
                    copyOnWrite();
                    ((Data) this.instance).setVipExpiredTime(value);
                    return this;
                }

                public Builder clearVipExpiredTime() {
                    copyOnWrite();
                    ((Data) this.instance).clearVipExpiredTime();
                    return this;
                }

                @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
                public boolean hasRemarkInfo() {
                    return ((Data) this.instance).hasRemarkInfo();
                }

                @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
                public RemarkInfo getRemarkInfo() {
                    return ((Data) this.instance).getRemarkInfo();
                }

                public Builder setRemarkInfo(RemarkInfo value) {
                    copyOnWrite();
                    ((Data) this.instance).setRemarkInfo(value);
                    return this;
                }

                public Builder setRemarkInfo(RemarkInfo.Builder builderForValue) {
                    copyOnWrite();
                    ((Data) this.instance).setRemarkInfo(builderForValue.build());
                    return this;
                }

                public Builder mergeRemarkInfo(RemarkInfo value) {
                    copyOnWrite();
                    ((Data) this.instance).mergeRemarkInfo(value);
                    return this;
                }

                public Builder clearRemarkInfo() {
                    copyOnWrite();
                    ((Data) this.instance).clearRemarkInfo();
                    return this;
                }

                @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
                public boolean hasProfileInfo() {
                    return ((Data) this.instance).hasProfileInfo();
                }

                @Override // com.yhchat.canarys.proto.user.User.get_user.DataOrBuilder
                public ProfileInfo getProfileInfo() {
                    return ((Data) this.instance).getProfileInfo();
                }

                public Builder setProfileInfo(ProfileInfo value) {
                    copyOnWrite();
                    ((Data) this.instance).setProfileInfo(value);
                    return this;
                }

                public Builder setProfileInfo(ProfileInfo.Builder builderForValue) {
                    copyOnWrite();
                    ((Data) this.instance).setProfileInfo(builderForValue.build());
                    return this;
                }

                public Builder mergeProfileInfo(ProfileInfo value) {
                    copyOnWrite();
                    ((Data) this.instance).mergeProfileInfo(value);
                    return this;
                }

                public Builder clearProfileInfo() {
                    copyOnWrite();
                    ((Data) this.instance).clearProfileInfo();
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
                switch (method) {
                    case NEW_MUTABLE_INSTANCE:
                        return new Data();
                    case NEW_BUILDER:
                        return new Builder();
                    case BUILD_MESSAGE_INFO:
                        Object[] objects = {"bitField0_", "id_", "name_", "nameId_", "avatarUrl_", "avatarId_", "medal_", Medal_info.class, "registerTime_", "banTime_", "onlineDay_", "continuousOnlineDay_", "isVip_", "vipExpiredTime_", "remarkInfo_", "profileInfo_"};
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0001\u0001\u0013\u000e\u0000\u0001\u0000\u0001\u0208\u0002\u0208\u0003\u0002\u0004\u0208\u0005\u0002\u0006\u001b\u0007\u0208\n\u0002\u000b\u0004\f\u0004\r\u0004\u000e\u0002\u0012\u1009\u0000\u0013\u1009\u0001", objects);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<Data> parser = PARSER;
                        if (parser == null) {
                            synchronized (Data.class) {
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
                Data defaultInstance = new Data();
                DEFAULT_INSTANCE = defaultInstance;
                GeneratedMessageLite.registerDefaultInstance(Data.class, defaultInstance);
            }

            public static Data getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<Data> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        @Override // com.yhchat.canarys.proto.user.User.get_userOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.yhchat.canarys.proto.user.User.get_userOrBuilder
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

        @Override // com.yhchat.canarys.proto.user.User.get_userOrBuilder
        public boolean hasData() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.yhchat.canarys.proto.user.User.get_userOrBuilder
        public Data getData() {
            return this.data_ == null ? Data.getDefaultInstance() : this.data_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData(Data value) {
            value.getClass();
            this.data_ = value;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeData(Data value) {
            value.getClass();
            if (this.data_ != null && this.data_ != Data.getDefaultInstance()) {
                this.data_ = Data.newBuilder(this.data_).mergeFrom((Data.Builder) value).buildPartial();
            } else {
                this.data_ = value;
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData() {
            this.data_ = null;
            this.bitField0_ &= -3;
        }

        public static get_user parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (get_user) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static get_user parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (get_user) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static get_user parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (get_user) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static get_user parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (get_user) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static get_user parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (get_user) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static get_user parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (get_user) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static get_user parseFrom(InputStream input) throws IOException {
            return (get_user) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static get_user parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (get_user) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static get_user parseDelimitedFrom(InputStream input) throws IOException {
            return (get_user) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static get_user parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (get_user) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static get_user parseFrom(CodedInputStream input) throws IOException {
            return (get_user) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static get_user parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (get_user) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(get_user prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<get_user, Builder> implements get_userOrBuilder {
            private Builder() {
                super(get_user.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.user.User.get_userOrBuilder
            public boolean hasStatus() {
                return ((get_user) this.instance).hasStatus();
            }

            @Override // com.yhchat.canarys.proto.user.User.get_userOrBuilder
            public Status getStatus() {
                return ((get_user) this.instance).getStatus();
            }

            public Builder setStatus(Status value) {
                copyOnWrite();
                ((get_user) this.instance).setStatus(value);
                return this;
            }

            public Builder setStatus(Status.Builder builderForValue) {
                copyOnWrite();
                ((get_user) this.instance).setStatus(builderForValue.build());
                return this;
            }

            public Builder mergeStatus(Status value) {
                copyOnWrite();
                ((get_user) this.instance).mergeStatus(value);
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((get_user) this.instance).clearStatus();
                return this;
            }

            @Override // com.yhchat.canarys.proto.user.User.get_userOrBuilder
            public boolean hasData() {
                return ((get_user) this.instance).hasData();
            }

            @Override // com.yhchat.canarys.proto.user.User.get_userOrBuilder
            public Data getData() {
                return ((get_user) this.instance).getData();
            }

            public Builder setData(Data value) {
                copyOnWrite();
                ((get_user) this.instance).setData(value);
                return this;
            }

            public Builder setData(Data.Builder builderForValue) {
                copyOnWrite();
                ((get_user) this.instance).setData(builderForValue.build());
                return this;
            }

            public Builder mergeData(Data value) {
                copyOnWrite();
                ((get_user) this.instance).mergeData(value);
                return this;
            }

            public Builder clearData() {
                copyOnWrite();
                ((get_user) this.instance).clearData();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new get_user();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"bitField0_", "status_", "data_"};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<get_user> parser = PARSER;
                    if (parser == null) {
                        synchronized (get_user.class) {
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
            get_user defaultInstance = new get_user();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(get_user.class, defaultInstance);
        }

        public static get_user getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<get_user> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class medal extends GeneratedMessageLite<medal, Builder> implements medalOrBuilder {
        private static final medal DEFAULT_INSTANCE;
        public static final int MEDAL_FIELD_NUMBER = 2;
        private static volatile Parser<medal> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 1;
        private int bitField0_;
        private Internal.ProtobufList<Medal_info> medal_ = emptyProtobufList();
        private Status status_;

        private medal() {
        }

        @Override // com.yhchat.canarys.proto.user.User.medalOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.yhchat.canarys.proto.user.User.medalOrBuilder
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

        @Override // com.yhchat.canarys.proto.user.User.medalOrBuilder
        public List<Medal_info> getMedalList() {
            return this.medal_;
        }

        public List<? extends Medal_infoOrBuilder> getMedalOrBuilderList() {
            return this.medal_;
        }

        @Override // com.yhchat.canarys.proto.user.User.medalOrBuilder
        public int getMedalCount() {
            return this.medal_.size();
        }

        @Override // com.yhchat.canarys.proto.user.User.medalOrBuilder
        public Medal_info getMedal(int index) {
            return this.medal_.get(index);
        }

        public Medal_infoOrBuilder getMedalOrBuilder(int index) {
            return this.medal_.get(index);
        }

        private void ensureMedalIsMutable() {
            Internal.ProtobufList<Medal_info> tmp = this.medal_;
            if (!tmp.isModifiable()) {
                this.medal_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMedal(int index, Medal_info value) {
            value.getClass();
            ensureMedalIsMutable();
            this.medal_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMedal(Medal_info value) {
            value.getClass();
            ensureMedalIsMutable();
            this.medal_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMedal(int index, Medal_info value) {
            value.getClass();
            ensureMedalIsMutable();
            this.medal_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMedal(Iterable<? extends Medal_info> values) {
            ensureMedalIsMutable();
            AbstractMessageLite.addAll(values, this.medal_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMedal() {
            this.medal_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeMedal(int index) {
            ensureMedalIsMutable();
            this.medal_.remove(index);
        }

        public static medal parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (medal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static medal parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (medal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static medal parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (medal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static medal parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (medal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static medal parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (medal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static medal parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (medal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static medal parseFrom(InputStream input) throws IOException {
            return (medal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static medal parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (medal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static medal parseDelimitedFrom(InputStream input) throws IOException {
            return (medal) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static medal parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (medal) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static medal parseFrom(CodedInputStream input) throws IOException {
            return (medal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static medal parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (medal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(medal prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<medal, Builder> implements medalOrBuilder {
            private Builder() {
                super(medal.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.user.User.medalOrBuilder
            public boolean hasStatus() {
                return ((medal) this.instance).hasStatus();
            }

            @Override // com.yhchat.canarys.proto.user.User.medalOrBuilder
            public Status getStatus() {
                return ((medal) this.instance).getStatus();
            }

            public Builder setStatus(Status value) {
                copyOnWrite();
                ((medal) this.instance).setStatus(value);
                return this;
            }

            public Builder setStatus(Status.Builder builderForValue) {
                copyOnWrite();
                ((medal) this.instance).setStatus(builderForValue.build());
                return this;
            }

            public Builder mergeStatus(Status value) {
                copyOnWrite();
                ((medal) this.instance).mergeStatus(value);
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((medal) this.instance).clearStatus();
                return this;
            }

            @Override // com.yhchat.canarys.proto.user.User.medalOrBuilder
            public List<Medal_info> getMedalList() {
                return Collections.unmodifiableList(((medal) this.instance).getMedalList());
            }

            @Override // com.yhchat.canarys.proto.user.User.medalOrBuilder
            public int getMedalCount() {
                return ((medal) this.instance).getMedalCount();
            }

            @Override // com.yhchat.canarys.proto.user.User.medalOrBuilder
            public Medal_info getMedal(int index) {
                return ((medal) this.instance).getMedal(index);
            }

            public Builder setMedal(int index, Medal_info value) {
                copyOnWrite();
                ((medal) this.instance).setMedal(index, value);
                return this;
            }

            public Builder setMedal(int index, Medal_info.Builder builderForValue) {
                copyOnWrite();
                ((medal) this.instance).setMedal(index, builderForValue.build());
                return this;
            }

            public Builder addMedal(Medal_info value) {
                copyOnWrite();
                ((medal) this.instance).addMedal(value);
                return this;
            }

            public Builder addMedal(int index, Medal_info value) {
                copyOnWrite();
                ((medal) this.instance).addMedal(index, value);
                return this;
            }

            public Builder addMedal(Medal_info.Builder builderForValue) {
                copyOnWrite();
                ((medal) this.instance).addMedal(builderForValue.build());
                return this;
            }

            public Builder addMedal(int index, Medal_info.Builder builderForValue) {
                copyOnWrite();
                ((medal) this.instance).addMedal(index, builderForValue.build());
                return this;
            }

            public Builder addAllMedal(Iterable<? extends Medal_info> values) {
                copyOnWrite();
                ((medal) this.instance).addAllMedal(values);
                return this;
            }

            public Builder clearMedal() {
                copyOnWrite();
                ((medal) this.instance).clearMedal();
                return this;
            }

            public Builder removeMedal(int index) {
                copyOnWrite();
                ((medal) this.instance).removeMedal(index);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new medal();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"bitField0_", "status_", "medal_", Medal_info.class};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1009\u0000\u0002\u001b", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<medal> parser = PARSER;
                    if (parser == null) {
                        synchronized (medal.class) {
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
            medal defaultInstance = new medal();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(medal.class, defaultInstance);
        }

        public static medal getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<medal> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class Medal_info extends GeneratedMessageLite<Medal_info, Builder> implements Medal_infoOrBuilder {
        private static final Medal_info DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile Parser<Medal_info> PARSER = null;
        public static final int SORT_FIELD_NUMBER = 5;
        private long id_;
        private String name_ = "";
        private long sort_;

        private Medal_info() {
        }

        @Override // com.yhchat.canarys.proto.user.User.Medal_infoOrBuilder
        public long getId() {
            return this.id_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(long value) {
            this.id_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = 0L;
        }

        @Override // com.yhchat.canarys.proto.user.User.Medal_infoOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.yhchat.canarys.proto.user.User.Medal_infoOrBuilder
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

        @Override // com.yhchat.canarys.proto.user.User.Medal_infoOrBuilder
        public long getSort() {
            return this.sort_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSort(long value) {
            this.sort_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSort() {
            this.sort_ = 0L;
        }

        public static Medal_info parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (Medal_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Medal_info parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Medal_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Medal_info parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (Medal_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Medal_info parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Medal_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Medal_info parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (Medal_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Medal_info parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Medal_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Medal_info parseFrom(InputStream input) throws IOException {
            return (Medal_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Medal_info parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Medal_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Medal_info parseDelimitedFrom(InputStream input) throws IOException {
            return (Medal_info) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static Medal_info parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Medal_info) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Medal_info parseFrom(CodedInputStream input) throws IOException {
            return (Medal_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Medal_info parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Medal_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Medal_info prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Medal_info, Builder> implements Medal_infoOrBuilder {
            private Builder() {
                super(Medal_info.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.user.User.Medal_infoOrBuilder
            public long getId() {
                return ((Medal_info) this.instance).getId();
            }

            public Builder setId(long value) {
                copyOnWrite();
                ((Medal_info) this.instance).setId(value);
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((Medal_info) this.instance).clearId();
                return this;
            }

            @Override // com.yhchat.canarys.proto.user.User.Medal_infoOrBuilder
            public String getName() {
                return ((Medal_info) this.instance).getName();
            }

            @Override // com.yhchat.canarys.proto.user.User.Medal_infoOrBuilder
            public ByteString getNameBytes() {
                return ((Medal_info) this.instance).getNameBytes();
            }

            public Builder setName(String value) {
                copyOnWrite();
                ((Medal_info) this.instance).setName(value);
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((Medal_info) this.instance).clearName();
                return this;
            }

            public Builder setNameBytes(ByteString value) {
                copyOnWrite();
                ((Medal_info) this.instance).setNameBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.user.User.Medal_infoOrBuilder
            public long getSort() {
                return ((Medal_info) this.instance).getSort();
            }

            public Builder setSort(long value) {
                copyOnWrite();
                ((Medal_info) this.instance).setSort(value);
                return this;
            }

            public Builder clearSort() {
                copyOnWrite();
                ((Medal_info) this.instance).clearSort();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new Medal_info();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"id_", "name_", "sort_"};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0005\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0005\u0002", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<Medal_info> parser = PARSER;
                    if (parser == null) {
                        synchronized (Medal_info.class) {
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
            Medal_info defaultInstance = new Medal_info();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(Medal_info.class, defaultInstance);
        }

        public static Medal_info getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Medal_info> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class edit_nickname_send extends GeneratedMessageLite<edit_nickname_send, Builder> implements edit_nickname_sendOrBuilder {
        private static final edit_nickname_send DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 3;
        private static volatile Parser<edit_nickname_send> PARSER;
        private String name_ = "";

        private edit_nickname_send() {
        }

        @Override // com.yhchat.canarys.proto.user.User.edit_nickname_sendOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.yhchat.canarys.proto.user.User.edit_nickname_sendOrBuilder
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

        public static edit_nickname_send parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (edit_nickname_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static edit_nickname_send parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (edit_nickname_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static edit_nickname_send parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (edit_nickname_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static edit_nickname_send parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (edit_nickname_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static edit_nickname_send parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (edit_nickname_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static edit_nickname_send parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (edit_nickname_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static edit_nickname_send parseFrom(InputStream input) throws IOException {
            return (edit_nickname_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static edit_nickname_send parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (edit_nickname_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static edit_nickname_send parseDelimitedFrom(InputStream input) throws IOException {
            return (edit_nickname_send) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static edit_nickname_send parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (edit_nickname_send) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static edit_nickname_send parseFrom(CodedInputStream input) throws IOException {
            return (edit_nickname_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static edit_nickname_send parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (edit_nickname_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(edit_nickname_send prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<edit_nickname_send, Builder> implements edit_nickname_sendOrBuilder {
            private Builder() {
                super(edit_nickname_send.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.user.User.edit_nickname_sendOrBuilder
            public String getName() {
                return ((edit_nickname_send) this.instance).getName();
            }

            @Override // com.yhchat.canarys.proto.user.User.edit_nickname_sendOrBuilder
            public ByteString getNameBytes() {
                return ((edit_nickname_send) this.instance).getNameBytes();
            }

            public Builder setName(String value) {
                copyOnWrite();
                ((edit_nickname_send) this.instance).setName(value);
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((edit_nickname_send) this.instance).clearName();
                return this;
            }

            public Builder setNameBytes(ByteString value) {
                copyOnWrite();
                ((edit_nickname_send) this.instance).setNameBytes(value);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new edit_nickname_send();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"name_"};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0000\u0000\u0003\u0208", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<edit_nickname_send> parser = PARSER;
                    if (parser == null) {
                        synchronized (edit_nickname_send.class) {
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
            edit_nickname_send defaultInstance = new edit_nickname_send();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(edit_nickname_send.class, defaultInstance);
        }

        public static edit_nickname_send getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<edit_nickname_send> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class edit_nickname extends GeneratedMessageLite<edit_nickname, Builder> implements edit_nicknameOrBuilder {
        private static final edit_nickname DEFAULT_INSTANCE;
        private static volatile Parser<edit_nickname> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 1;
        private int bitField0_;
        private Status status_;

        private edit_nickname() {
        }

        @Override // com.yhchat.canarys.proto.user.User.edit_nicknameOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.yhchat.canarys.proto.user.User.edit_nicknameOrBuilder
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

        public static edit_nickname parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (edit_nickname) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static edit_nickname parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (edit_nickname) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static edit_nickname parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (edit_nickname) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static edit_nickname parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (edit_nickname) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static edit_nickname parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (edit_nickname) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static edit_nickname parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (edit_nickname) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static edit_nickname parseFrom(InputStream input) throws IOException {
            return (edit_nickname) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static edit_nickname parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (edit_nickname) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static edit_nickname parseDelimitedFrom(InputStream input) throws IOException {
            return (edit_nickname) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static edit_nickname parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (edit_nickname) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static edit_nickname parseFrom(CodedInputStream input) throws IOException {
            return (edit_nickname) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static edit_nickname parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (edit_nickname) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(edit_nickname prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<edit_nickname, Builder> implements edit_nicknameOrBuilder {
            private Builder() {
                super(edit_nickname.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.user.User.edit_nicknameOrBuilder
            public boolean hasStatus() {
                return ((edit_nickname) this.instance).hasStatus();
            }

            @Override // com.yhchat.canarys.proto.user.User.edit_nicknameOrBuilder
            public Status getStatus() {
                return ((edit_nickname) this.instance).getStatus();
            }

            public Builder setStatus(Status value) {
                copyOnWrite();
                ((edit_nickname) this.instance).setStatus(value);
                return this;
            }

            public Builder setStatus(Status.Builder builderForValue) {
                copyOnWrite();
                ((edit_nickname) this.instance).setStatus(builderForValue.build());
                return this;
            }

            public Builder mergeStatus(Status value) {
                copyOnWrite();
                ((edit_nickname) this.instance).mergeStatus(value);
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((edit_nickname) this.instance).clearStatus();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new edit_nickname();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"bitField0_", "status_"};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<edit_nickname> parser = PARSER;
                    if (parser == null) {
                        synchronized (edit_nickname.class) {
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
            edit_nickname defaultInstance = new edit_nickname();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(edit_nickname.class, defaultInstance);
        }

        public static edit_nickname getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<edit_nickname> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class edit_avatar_send extends GeneratedMessageLite<edit_avatar_send, Builder> implements edit_avatar_sendOrBuilder {
        private static final edit_avatar_send DEFAULT_INSTANCE;
        private static volatile Parser<edit_avatar_send> PARSER = null;
        public static final int URL_FIELD_NUMBER = 2;
        private String url_ = "";

        private edit_avatar_send() {
        }

        @Override // com.yhchat.canarys.proto.user.User.edit_avatar_sendOrBuilder
        public String getUrl() {
            return this.url_;
        }

        @Override // com.yhchat.canarys.proto.user.User.edit_avatar_sendOrBuilder
        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8(this.url_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrl(String value) {
            value.getClass();
            this.url_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUrl() {
            this.url_ = getDefaultInstance().getUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrlBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.url_ = value.toStringUtf8();
        }

        public static edit_avatar_send parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (edit_avatar_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static edit_avatar_send parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (edit_avatar_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static edit_avatar_send parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (edit_avatar_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static edit_avatar_send parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (edit_avatar_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static edit_avatar_send parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (edit_avatar_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static edit_avatar_send parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (edit_avatar_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static edit_avatar_send parseFrom(InputStream input) throws IOException {
            return (edit_avatar_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static edit_avatar_send parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (edit_avatar_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static edit_avatar_send parseDelimitedFrom(InputStream input) throws IOException {
            return (edit_avatar_send) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static edit_avatar_send parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (edit_avatar_send) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static edit_avatar_send parseFrom(CodedInputStream input) throws IOException {
            return (edit_avatar_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static edit_avatar_send parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (edit_avatar_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(edit_avatar_send prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<edit_avatar_send, Builder> implements edit_avatar_sendOrBuilder {
            private Builder() {
                super(edit_avatar_send.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.user.User.edit_avatar_sendOrBuilder
            public String getUrl() {
                return ((edit_avatar_send) this.instance).getUrl();
            }

            @Override // com.yhchat.canarys.proto.user.User.edit_avatar_sendOrBuilder
            public ByteString getUrlBytes() {
                return ((edit_avatar_send) this.instance).getUrlBytes();
            }

            public Builder setUrl(String value) {
                copyOnWrite();
                ((edit_avatar_send) this.instance).setUrl(value);
                return this;
            }

            public Builder clearUrl() {
                copyOnWrite();
                ((edit_avatar_send) this.instance).clearUrl();
                return this;
            }

            public Builder setUrlBytes(ByteString value) {
                copyOnWrite();
                ((edit_avatar_send) this.instance).setUrlBytes(value);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new edit_avatar_send();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"url_"};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u0208", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<edit_avatar_send> parser = PARSER;
                    if (parser == null) {
                        synchronized (edit_avatar_send.class) {
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
            edit_avatar_send defaultInstance = new edit_avatar_send();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(edit_avatar_send.class, defaultInstance);
        }

        public static edit_avatar_send getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<edit_avatar_send> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class edit_avatar extends GeneratedMessageLite<edit_avatar, Builder> implements edit_avatarOrBuilder {
        private static final edit_avatar DEFAULT_INSTANCE;
        private static volatile Parser<edit_avatar> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 1;
        private int bitField0_;
        private Status status_;

        private edit_avatar() {
        }

        @Override // com.yhchat.canarys.proto.user.User.edit_avatarOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.yhchat.canarys.proto.user.User.edit_avatarOrBuilder
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

        public static edit_avatar parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (edit_avatar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static edit_avatar parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (edit_avatar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static edit_avatar parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (edit_avatar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static edit_avatar parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (edit_avatar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static edit_avatar parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (edit_avatar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static edit_avatar parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (edit_avatar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static edit_avatar parseFrom(InputStream input) throws IOException {
            return (edit_avatar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static edit_avatar parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (edit_avatar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static edit_avatar parseDelimitedFrom(InputStream input) throws IOException {
            return (edit_avatar) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static edit_avatar parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (edit_avatar) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static edit_avatar parseFrom(CodedInputStream input) throws IOException {
            return (edit_avatar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static edit_avatar parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (edit_avatar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(edit_avatar prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<edit_avatar, Builder> implements edit_avatarOrBuilder {
            private Builder() {
                super(edit_avatar.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.user.User.edit_avatarOrBuilder
            public boolean hasStatus() {
                return ((edit_avatar) this.instance).hasStatus();
            }

            @Override // com.yhchat.canarys.proto.user.User.edit_avatarOrBuilder
            public Status getStatus() {
                return ((edit_avatar) this.instance).getStatus();
            }

            public Builder setStatus(Status value) {
                copyOnWrite();
                ((edit_avatar) this.instance).setStatus(value);
                return this;
            }

            public Builder setStatus(Status.Builder builderForValue) {
                copyOnWrite();
                ((edit_avatar) this.instance).setStatus(builderForValue.build());
                return this;
            }

            public Builder mergeStatus(Status value) {
                copyOnWrite();
                ((edit_avatar) this.instance).mergeStatus(value);
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((edit_avatar) this.instance).clearStatus();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new edit_avatar();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"bitField0_", "status_"};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<edit_avatar> parser = PARSER;
                    if (parser == null) {
                        synchronized (edit_avatar.class) {
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
            edit_avatar defaultInstance = new edit_avatar();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(edit_avatar.class, defaultInstance);
        }

        public static edit_avatar getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<edit_avatar> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class address_book_list_send extends GeneratedMessageLite<address_book_list_send, Builder> implements address_book_list_sendOrBuilder {
        private static final address_book_list_send DEFAULT_INSTANCE;
        public static final int NUMBER_FIELD_NUMBER = 2;
        private static volatile Parser<address_book_list_send> PARSER;
        private String number_ = "";

        private address_book_list_send() {
        }

        @Override // com.yhchat.canarys.proto.user.User.address_book_list_sendOrBuilder
        public String getNumber() {
            return this.number_;
        }

        @Override // com.yhchat.canarys.proto.user.User.address_book_list_sendOrBuilder
        public ByteString getNumberBytes() {
            return ByteString.copyFromUtf8(this.number_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNumber(String value) {
            value.getClass();
            this.number_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNumber() {
            this.number_ = getDefaultInstance().getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNumberBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.number_ = value.toStringUtf8();
        }

        public static address_book_list_send parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (address_book_list_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static address_book_list_send parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (address_book_list_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static address_book_list_send parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (address_book_list_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static address_book_list_send parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (address_book_list_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static address_book_list_send parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (address_book_list_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static address_book_list_send parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (address_book_list_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static address_book_list_send parseFrom(InputStream input) throws IOException {
            return (address_book_list_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static address_book_list_send parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (address_book_list_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static address_book_list_send parseDelimitedFrom(InputStream input) throws IOException {
            return (address_book_list_send) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static address_book_list_send parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (address_book_list_send) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static address_book_list_send parseFrom(CodedInputStream input) throws IOException {
            return (address_book_list_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static address_book_list_send parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (address_book_list_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(address_book_list_send prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<address_book_list_send, Builder> implements address_book_list_sendOrBuilder {
            private Builder() {
                super(address_book_list_send.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.user.User.address_book_list_sendOrBuilder
            public String getNumber() {
                return ((address_book_list_send) this.instance).getNumber();
            }

            @Override // com.yhchat.canarys.proto.user.User.address_book_list_sendOrBuilder
            public ByteString getNumberBytes() {
                return ((address_book_list_send) this.instance).getNumberBytes();
            }

            public Builder setNumber(String value) {
                copyOnWrite();
                ((address_book_list_send) this.instance).setNumber(value);
                return this;
            }

            public Builder clearNumber() {
                copyOnWrite();
                ((address_book_list_send) this.instance).clearNumber();
                return this;
            }

            public Builder setNumberBytes(ByteString value) {
                copyOnWrite();
                ((address_book_list_send) this.instance).setNumberBytes(value);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new address_book_list_send();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"number_"};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u0208", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<address_book_list_send> parser = PARSER;
                    if (parser == null) {
                        synchronized (address_book_list_send.class) {
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
            address_book_list_send defaultInstance = new address_book_list_send();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(address_book_list_send.class, defaultInstance);
        }

        public static address_book_list_send getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<address_book_list_send> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class address_book_list extends GeneratedMessageLite<address_book_list, Builder> implements address_book_listOrBuilder {
        public static final int DATA_FIELD_NUMBER = 2;
        private static final address_book_list DEFAULT_INSTANCE;
        private static volatile Parser<address_book_list> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 1;
        private int bitField0_;
        private Internal.ProtobufList<Data> data_ = emptyProtobufList();
        private Status status_;

        public interface DataOrBuilder extends MessageLiteOrBuilder {
            Data.Data_list getData(int index);

            int getDataCount();

            List<Data.Data_list> getDataList();

            String getListName();

            ByteString getListNameBytes();
        }

        private address_book_list() {
        }

        public static final class Data extends GeneratedMessageLite<Data, Builder> implements DataOrBuilder {
            public static final int DATA_FIELD_NUMBER = 2;
            private static final Data DEFAULT_INSTANCE;
            public static final int LIST_NAME_FIELD_NUMBER = 1;
            private static volatile Parser<Data> PARSER;
            private String listName_ = "";
            private Internal.ProtobufList<Data_list> data_ = emptyProtobufList();

            public interface Data_listOrBuilder extends MessageLiteOrBuilder {
                String getAvatarUrl();

                ByteString getAvatarUrlBytes();

                String getChatId();

                ByteString getChatIdBytes();

                String getName();

                ByteString getNameBytes();

                boolean getNoDisturb();

                int getPermissonLevel();
            }

            private Data() {
            }

            public static final class Data_list extends GeneratedMessageLite<Data_list, Builder> implements Data_listOrBuilder {
                public static final int AVATAR_URL_FIELD_NUMBER = 3;
                public static final int CHAT_ID_FIELD_NUMBER = 1;
                private static final Data_list DEFAULT_INSTANCE;
                public static final int NAME_FIELD_NUMBER = 2;
                public static final int NODISTURB_FIELD_NUMBER = 5;
                private static volatile Parser<Data_list> PARSER = null;
                public static final int PERMISSON_LEVEL_FIELD_NUMBER = 4;
                private boolean noDisturb_;
                private int permissonLevel_;
                private String chatId_ = "";
                private String name_ = "";
                private String avatarUrl_ = "";

                private Data_list() {
                }

                @Override // com.yhchat.canarys.proto.user.User.address_book_list.Data.Data_listOrBuilder
                public String getChatId() {
                    return this.chatId_;
                }

                @Override // com.yhchat.canarys.proto.user.User.address_book_list.Data.Data_listOrBuilder
                public ByteString getChatIdBytes() {
                    return ByteString.copyFromUtf8(this.chatId_);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setChatId(String value) {
                    value.getClass();
                    this.chatId_ = value;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearChatId() {
                    this.chatId_ = getDefaultInstance().getChatId();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setChatIdBytes(ByteString value) {
                    checkByteStringIsUtf8(value);
                    this.chatId_ = value.toStringUtf8();
                }

                @Override // com.yhchat.canarys.proto.user.User.address_book_list.Data.Data_listOrBuilder
                public String getName() {
                    return this.name_;
                }

                @Override // com.yhchat.canarys.proto.user.User.address_book_list.Data.Data_listOrBuilder
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

                @Override // com.yhchat.canarys.proto.user.User.address_book_list.Data.Data_listOrBuilder
                public String getAvatarUrl() {
                    return this.avatarUrl_;
                }

                @Override // com.yhchat.canarys.proto.user.User.address_book_list.Data.Data_listOrBuilder
                public ByteString getAvatarUrlBytes() {
                    return ByteString.copyFromUtf8(this.avatarUrl_);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setAvatarUrl(String value) {
                    value.getClass();
                    this.avatarUrl_ = value;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearAvatarUrl() {
                    this.avatarUrl_ = getDefaultInstance().getAvatarUrl();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setAvatarUrlBytes(ByteString value) {
                    checkByteStringIsUtf8(value);
                    this.avatarUrl_ = value.toStringUtf8();
                }

                @Override // com.yhchat.canarys.proto.user.User.address_book_list.Data.Data_listOrBuilder
                public int getPermissonLevel() {
                    return this.permissonLevel_;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setPermissonLevel(int value) {
                    this.permissonLevel_ = value;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearPermissonLevel() {
                    this.permissonLevel_ = 0;
                }

                @Override // com.yhchat.canarys.proto.user.User.address_book_list.Data.Data_listOrBuilder
                public boolean getNoDisturb() {
                    return this.noDisturb_;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setNoDisturb(boolean value) {
                    this.noDisturb_ = value;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearNoDisturb() {
                    this.noDisturb_ = false;
                }

                public static Data_list parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                    return (Data_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
                }

                public static Data_list parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return (Data_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
                }

                public static Data_list parseFrom(ByteString data) throws InvalidProtocolBufferException {
                    return (Data_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
                }

                public static Data_list parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return (Data_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
                }

                public static Data_list parseFrom(byte[] data) throws InvalidProtocolBufferException {
                    return (Data_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
                }

                public static Data_list parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return (Data_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
                }

                public static Data_list parseFrom(InputStream input) throws IOException {
                    return (Data_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
                }

                public static Data_list parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                    return (Data_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
                }

                public static Data_list parseDelimitedFrom(InputStream input) throws IOException {
                    return (Data_list) parseDelimitedFrom(DEFAULT_INSTANCE, input);
                }

                public static Data_list parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                    return (Data_list) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
                }

                public static Data_list parseFrom(CodedInputStream input) throws IOException {
                    return (Data_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
                }

                public static Data_list parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                    return (Data_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.createBuilder();
                }

                public static Builder newBuilder(Data_list prototype) {
                    return DEFAULT_INSTANCE.createBuilder(prototype);
                }

                public static final class Builder extends GeneratedMessageLite.Builder<Data_list, Builder> implements Data_listOrBuilder {
                    private Builder() {
                        super(Data_list.DEFAULT_INSTANCE);
                    }

                    @Override // com.yhchat.canarys.proto.user.User.address_book_list.Data.Data_listOrBuilder
                    public String getChatId() {
                        return ((Data_list) this.instance).getChatId();
                    }

                    @Override // com.yhchat.canarys.proto.user.User.address_book_list.Data.Data_listOrBuilder
                    public ByteString getChatIdBytes() {
                        return ((Data_list) this.instance).getChatIdBytes();
                    }

                    public Builder setChatId(String value) {
                        copyOnWrite();
                        ((Data_list) this.instance).setChatId(value);
                        return this;
                    }

                    public Builder clearChatId() {
                        copyOnWrite();
                        ((Data_list) this.instance).clearChatId();
                        return this;
                    }

                    public Builder setChatIdBytes(ByteString value) {
                        copyOnWrite();
                        ((Data_list) this.instance).setChatIdBytes(value);
                        return this;
                    }

                    @Override // com.yhchat.canarys.proto.user.User.address_book_list.Data.Data_listOrBuilder
                    public String getName() {
                        return ((Data_list) this.instance).getName();
                    }

                    @Override // com.yhchat.canarys.proto.user.User.address_book_list.Data.Data_listOrBuilder
                    public ByteString getNameBytes() {
                        return ((Data_list) this.instance).getNameBytes();
                    }

                    public Builder setName(String value) {
                        copyOnWrite();
                        ((Data_list) this.instance).setName(value);
                        return this;
                    }

                    public Builder clearName() {
                        copyOnWrite();
                        ((Data_list) this.instance).clearName();
                        return this;
                    }

                    public Builder setNameBytes(ByteString value) {
                        copyOnWrite();
                        ((Data_list) this.instance).setNameBytes(value);
                        return this;
                    }

                    @Override // com.yhchat.canarys.proto.user.User.address_book_list.Data.Data_listOrBuilder
                    public String getAvatarUrl() {
                        return ((Data_list) this.instance).getAvatarUrl();
                    }

                    @Override // com.yhchat.canarys.proto.user.User.address_book_list.Data.Data_listOrBuilder
                    public ByteString getAvatarUrlBytes() {
                        return ((Data_list) this.instance).getAvatarUrlBytes();
                    }

                    public Builder setAvatarUrl(String value) {
                        copyOnWrite();
                        ((Data_list) this.instance).setAvatarUrl(value);
                        return this;
                    }

                    public Builder clearAvatarUrl() {
                        copyOnWrite();
                        ((Data_list) this.instance).clearAvatarUrl();
                        return this;
                    }

                    public Builder setAvatarUrlBytes(ByteString value) {
                        copyOnWrite();
                        ((Data_list) this.instance).setAvatarUrlBytes(value);
                        return this;
                    }

                    @Override // com.yhchat.canarys.proto.user.User.address_book_list.Data.Data_listOrBuilder
                    public int getPermissonLevel() {
                        return ((Data_list) this.instance).getPermissonLevel();
                    }

                    public Builder setPermissonLevel(int value) {
                        copyOnWrite();
                        ((Data_list) this.instance).setPermissonLevel(value);
                        return this;
                    }

                    public Builder clearPermissonLevel() {
                        copyOnWrite();
                        ((Data_list) this.instance).clearPermissonLevel();
                        return this;
                    }

                    @Override // com.yhchat.canarys.proto.user.User.address_book_list.Data.Data_listOrBuilder
                    public boolean getNoDisturb() {
                        return ((Data_list) this.instance).getNoDisturb();
                    }

                    public Builder setNoDisturb(boolean value) {
                        copyOnWrite();
                        ((Data_list) this.instance).setNoDisturb(value);
                        return this;
                    }

                    public Builder clearNoDisturb() {
                        copyOnWrite();
                        ((Data_list) this.instance).clearNoDisturb();
                        return this;
                    }
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
                    switch (method) {
                        case NEW_MUTABLE_INSTANCE:
                            return new Data_list();
                        case NEW_BUILDER:
                            return new Builder();
                        case BUILD_MESSAGE_INFO:
                            Object[] objects = {"chatId_", "name_", "avatarUrl_", "permissonLevel_", "noDisturb_"};
                            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0004\u0005\u0007", objects);
                        case GET_DEFAULT_INSTANCE:
                            return DEFAULT_INSTANCE;
                        case GET_PARSER:
                            Parser<Data_list> parser = PARSER;
                            if (parser == null) {
                                synchronized (Data_list.class) {
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
                    Data_list defaultInstance = new Data_list();
                    DEFAULT_INSTANCE = defaultInstance;
                    GeneratedMessageLite.registerDefaultInstance(Data_list.class, defaultInstance);
                }

                public static Data_list getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static Parser<Data_list> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }
            }

            @Override // com.yhchat.canarys.proto.user.User.address_book_list.DataOrBuilder
            public String getListName() {
                return this.listName_;
            }

            @Override // com.yhchat.canarys.proto.user.User.address_book_list.DataOrBuilder
            public ByteString getListNameBytes() {
                return ByteString.copyFromUtf8(this.listName_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setListName(String value) {
                value.getClass();
                this.listName_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearListName() {
                this.listName_ = getDefaultInstance().getListName();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setListNameBytes(ByteString value) {
                checkByteStringIsUtf8(value);
                this.listName_ = value.toStringUtf8();
            }

            @Override // com.yhchat.canarys.proto.user.User.address_book_list.DataOrBuilder
            public List<Data_list> getDataList() {
                return this.data_;
            }

            public List<? extends Data_listOrBuilder> getDataOrBuilderList() {
                return this.data_;
            }

            @Override // com.yhchat.canarys.proto.user.User.address_book_list.DataOrBuilder
            public int getDataCount() {
                return this.data_.size();
            }

            @Override // com.yhchat.canarys.proto.user.User.address_book_list.DataOrBuilder
            public Data_list getData(int index) {
                return this.data_.get(index);
            }

            public Data_listOrBuilder getDataOrBuilder(int index) {
                return this.data_.get(index);
            }

            private void ensureDataIsMutable() {
                Internal.ProtobufList<Data_list> tmp = this.data_;
                if (!tmp.isModifiable()) {
                    this.data_ = GeneratedMessageLite.mutableCopy(tmp);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setData(int index, Data_list value) {
                value.getClass();
                ensureDataIsMutable();
                this.data_.set(index, value);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addData(Data_list value) {
                value.getClass();
                ensureDataIsMutable();
                this.data_.add(value);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addData(int index, Data_list value) {
                value.getClass();
                ensureDataIsMutable();
                this.data_.add(index, value);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllData(Iterable<? extends Data_list> values) {
                ensureDataIsMutable();
                AbstractMessageLite.addAll(values, this.data_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearData() {
                this.data_ = emptyProtobufList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void removeData(int index) {
                ensureDataIsMutable();
                this.data_.remove(index);
            }

            public static Data parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Data parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Data parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Data parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Data parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Data parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Data parseFrom(InputStream input) throws IOException {
                return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static Data parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Data parseDelimitedFrom(InputStream input) throws IOException {
                return (Data) parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static Data parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Data) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Data parseFrom(CodedInputStream input) throws IOException {
                return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static Data parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(Data prototype) {
                return DEFAULT_INSTANCE.createBuilder(prototype);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<Data, Builder> implements DataOrBuilder {
                private Builder() {
                    super(Data.DEFAULT_INSTANCE);
                }

                @Override // com.yhchat.canarys.proto.user.User.address_book_list.DataOrBuilder
                public String getListName() {
                    return ((Data) this.instance).getListName();
                }

                @Override // com.yhchat.canarys.proto.user.User.address_book_list.DataOrBuilder
                public ByteString getListNameBytes() {
                    return ((Data) this.instance).getListNameBytes();
                }

                public Builder setListName(String value) {
                    copyOnWrite();
                    ((Data) this.instance).setListName(value);
                    return this;
                }

                public Builder clearListName() {
                    copyOnWrite();
                    ((Data) this.instance).clearListName();
                    return this;
                }

                public Builder setListNameBytes(ByteString value) {
                    copyOnWrite();
                    ((Data) this.instance).setListNameBytes(value);
                    return this;
                }

                @Override // com.yhchat.canarys.proto.user.User.address_book_list.DataOrBuilder
                public List<Data_list> getDataList() {
                    return Collections.unmodifiableList(((Data) this.instance).getDataList());
                }

                @Override // com.yhchat.canarys.proto.user.User.address_book_list.DataOrBuilder
                public int getDataCount() {
                    return ((Data) this.instance).getDataCount();
                }

                @Override // com.yhchat.canarys.proto.user.User.address_book_list.DataOrBuilder
                public Data_list getData(int index) {
                    return ((Data) this.instance).getData(index);
                }

                public Builder setData(int index, Data_list value) {
                    copyOnWrite();
                    ((Data) this.instance).setData(index, value);
                    return this;
                }

                public Builder setData(int index, Data_list.Builder builderForValue) {
                    copyOnWrite();
                    ((Data) this.instance).setData(index, builderForValue.build());
                    return this;
                }

                public Builder addData(Data_list value) {
                    copyOnWrite();
                    ((Data) this.instance).addData(value);
                    return this;
                }

                public Builder addData(int index, Data_list value) {
                    copyOnWrite();
                    ((Data) this.instance).addData(index, value);
                    return this;
                }

                public Builder addData(Data_list.Builder builderForValue) {
                    copyOnWrite();
                    ((Data) this.instance).addData(builderForValue.build());
                    return this;
                }

                public Builder addData(int index, Data_list.Builder builderForValue) {
                    copyOnWrite();
                    ((Data) this.instance).addData(index, builderForValue.build());
                    return this;
                }

                public Builder addAllData(Iterable<? extends Data_list> values) {
                    copyOnWrite();
                    ((Data) this.instance).addAllData(values);
                    return this;
                }

                public Builder clearData() {
                    copyOnWrite();
                    ((Data) this.instance).clearData();
                    return this;
                }

                public Builder removeData(int index) {
                    copyOnWrite();
                    ((Data) this.instance).removeData(index);
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
                switch (method) {
                    case NEW_MUTABLE_INSTANCE:
                        return new Data();
                    case NEW_BUILDER:
                        return new Builder();
                    case BUILD_MESSAGE_INFO:
                        Object[] objects = {"listName_", "data_", Data_list.class};
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0208\u0002\u001b", objects);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<Data> parser = PARSER;
                        if (parser == null) {
                            synchronized (Data.class) {
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
                Data defaultInstance = new Data();
                DEFAULT_INSTANCE = defaultInstance;
                GeneratedMessageLite.registerDefaultInstance(Data.class, defaultInstance);
            }

            public static Data getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<Data> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        @Override // com.yhchat.canarys.proto.user.User.address_book_listOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.yhchat.canarys.proto.user.User.address_book_listOrBuilder
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

        @Override // com.yhchat.canarys.proto.user.User.address_book_listOrBuilder
        public List<Data> getDataList() {
            return this.data_;
        }

        public List<? extends DataOrBuilder> getDataOrBuilderList() {
            return this.data_;
        }

        @Override // com.yhchat.canarys.proto.user.User.address_book_listOrBuilder
        public int getDataCount() {
            return this.data_.size();
        }

        @Override // com.yhchat.canarys.proto.user.User.address_book_listOrBuilder
        public Data getData(int index) {
            return this.data_.get(index);
        }

        public DataOrBuilder getDataOrBuilder(int index) {
            return this.data_.get(index);
        }

        private void ensureDataIsMutable() {
            Internal.ProtobufList<Data> tmp = this.data_;
            if (!tmp.isModifiable()) {
                this.data_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData(int index, Data value) {
            value.getClass();
            ensureDataIsMutable();
            this.data_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addData(Data value) {
            value.getClass();
            ensureDataIsMutable();
            this.data_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addData(int index, Data value) {
            value.getClass();
            ensureDataIsMutable();
            this.data_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllData(Iterable<? extends Data> values) {
            ensureDataIsMutable();
            AbstractMessageLite.addAll(values, this.data_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData() {
            this.data_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeData(int index) {
            ensureDataIsMutable();
            this.data_.remove(index);
        }

        public static address_book_list parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (address_book_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static address_book_list parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (address_book_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static address_book_list parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (address_book_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static address_book_list parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (address_book_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static address_book_list parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (address_book_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static address_book_list parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (address_book_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static address_book_list parseFrom(InputStream input) throws IOException {
            return (address_book_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static address_book_list parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (address_book_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static address_book_list parseDelimitedFrom(InputStream input) throws IOException {
            return (address_book_list) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static address_book_list parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (address_book_list) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static address_book_list parseFrom(CodedInputStream input) throws IOException {
            return (address_book_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static address_book_list parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (address_book_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(address_book_list prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<address_book_list, Builder> implements address_book_listOrBuilder {
            private Builder() {
                super(address_book_list.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.user.User.address_book_listOrBuilder
            public boolean hasStatus() {
                return ((address_book_list) this.instance).hasStatus();
            }

            @Override // com.yhchat.canarys.proto.user.User.address_book_listOrBuilder
            public Status getStatus() {
                return ((address_book_list) this.instance).getStatus();
            }

            public Builder setStatus(Status value) {
                copyOnWrite();
                ((address_book_list) this.instance).setStatus(value);
                return this;
            }

            public Builder setStatus(Status.Builder builderForValue) {
                copyOnWrite();
                ((address_book_list) this.instance).setStatus(builderForValue.build());
                return this;
            }

            public Builder mergeStatus(Status value) {
                copyOnWrite();
                ((address_book_list) this.instance).mergeStatus(value);
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((address_book_list) this.instance).clearStatus();
                return this;
            }

            @Override // com.yhchat.canarys.proto.user.User.address_book_listOrBuilder
            public List<Data> getDataList() {
                return Collections.unmodifiableList(((address_book_list) this.instance).getDataList());
            }

            @Override // com.yhchat.canarys.proto.user.User.address_book_listOrBuilder
            public int getDataCount() {
                return ((address_book_list) this.instance).getDataCount();
            }

            @Override // com.yhchat.canarys.proto.user.User.address_book_listOrBuilder
            public Data getData(int index) {
                return ((address_book_list) this.instance).getData(index);
            }

            public Builder setData(int index, Data value) {
                copyOnWrite();
                ((address_book_list) this.instance).setData(index, value);
                return this;
            }

            public Builder setData(int index, Data.Builder builderForValue) {
                copyOnWrite();
                ((address_book_list) this.instance).setData(index, builderForValue.build());
                return this;
            }

            public Builder addData(Data value) {
                copyOnWrite();
                ((address_book_list) this.instance).addData(value);
                return this;
            }

            public Builder addData(int index, Data value) {
                copyOnWrite();
                ((address_book_list) this.instance).addData(index, value);
                return this;
            }

            public Builder addData(Data.Builder builderForValue) {
                copyOnWrite();
                ((address_book_list) this.instance).addData(builderForValue.build());
                return this;
            }

            public Builder addData(int index, Data.Builder builderForValue) {
                copyOnWrite();
                ((address_book_list) this.instance).addData(index, builderForValue.build());
                return this;
            }

            public Builder addAllData(Iterable<? extends Data> values) {
                copyOnWrite();
                ((address_book_list) this.instance).addAllData(values);
                return this;
            }

            public Builder clearData() {
                copyOnWrite();
                ((address_book_list) this.instance).clearData();
                return this;
            }

            public Builder removeData(int index) {
                copyOnWrite();
                ((address_book_list) this.instance).removeData(index);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new address_book_list();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"bitField0_", "status_", "data_", Data.class};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1009\u0000\u0002\u001b", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<address_book_list> parser = PARSER;
                    if (parser == null) {
                        synchronized (address_book_list.class) {
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
            address_book_list defaultInstance = new address_book_list();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(address_book_list.class, defaultInstance);
        }

        public static address_book_list getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<address_book_list> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class DeviceInfo extends GeneratedMessageLite<DeviceInfo, Builder> implements DeviceInfoOrBuilder {
        private static final DeviceInfo DEFAULT_INSTANCE;
        public static final int DEVICE_ID_FIELD_NUMBER = 4;
        public static final int LOGIN_TIMESTAMP_FIELD_NUMBER = 5;
        private static volatile Parser<DeviceInfo> PARSER = null;
        public static final int PLATFORM_FIELD_NUMBER = 3;
        public static final int USER_ID_FIELD_NUMBER = 1;
        private long loginTimestamp_;
        private String userId_ = "";
        private String platform_ = "";
        private String deviceId_ = "";

        private DeviceInfo() {
        }

        @Override // com.yhchat.canarys.proto.user.User.DeviceInfoOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.yhchat.canarys.proto.user.User.DeviceInfoOrBuilder
        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserId(String value) {
            value.getClass();
            this.userId_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUserIdBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.userId_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.user.User.DeviceInfoOrBuilder
        public String getPlatform() {
            return this.platform_;
        }

        @Override // com.yhchat.canarys.proto.user.User.DeviceInfoOrBuilder
        public ByteString getPlatformBytes() {
            return ByteString.copyFromUtf8(this.platform_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlatform(String value) {
            value.getClass();
            this.platform_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPlatform() {
            this.platform_ = getDefaultInstance().getPlatform();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPlatformBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.platform_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.user.User.DeviceInfoOrBuilder
        public String getDeviceId() {
            return this.deviceId_;
        }

        @Override // com.yhchat.canarys.proto.user.User.DeviceInfoOrBuilder
        public ByteString getDeviceIdBytes() {
            return ByteString.copyFromUtf8(this.deviceId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceId(String value) {
            value.getClass();
            this.deviceId_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceId() {
            this.deviceId_ = getDefaultInstance().getDeviceId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceIdBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.deviceId_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.user.User.DeviceInfoOrBuilder
        public long getLoginTimestamp() {
            return this.loginTimestamp_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoginTimestamp(long value) {
            this.loginTimestamp_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLoginTimestamp() {
            this.loginTimestamp_ = 0L;
        }

        public static DeviceInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (DeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static DeviceInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (DeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static DeviceInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (DeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static DeviceInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (DeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static DeviceInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (DeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static DeviceInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (DeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static DeviceInfo parseFrom(InputStream input) throws IOException {
            return (DeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static DeviceInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static DeviceInfo parseDelimitedFrom(InputStream input) throws IOException {
            return (DeviceInfo) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static DeviceInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DeviceInfo) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static DeviceInfo parseFrom(CodedInputStream input) throws IOException {
            return (DeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static DeviceInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(DeviceInfo prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<DeviceInfo, Builder> implements DeviceInfoOrBuilder {
            private Builder() {
                super(DeviceInfo.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.user.User.DeviceInfoOrBuilder
            public String getUserId() {
                return ((DeviceInfo) this.instance).getUserId();
            }

            @Override // com.yhchat.canarys.proto.user.User.DeviceInfoOrBuilder
            public ByteString getUserIdBytes() {
                return ((DeviceInfo) this.instance).getUserIdBytes();
            }

            public Builder setUserId(String value) {
                copyOnWrite();
                ((DeviceInfo) this.instance).setUserId(value);
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((DeviceInfo) this.instance).clearUserId();
                return this;
            }

            public Builder setUserIdBytes(ByteString value) {
                copyOnWrite();
                ((DeviceInfo) this.instance).setUserIdBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.user.User.DeviceInfoOrBuilder
            public String getPlatform() {
                return ((DeviceInfo) this.instance).getPlatform();
            }

            @Override // com.yhchat.canarys.proto.user.User.DeviceInfoOrBuilder
            public ByteString getPlatformBytes() {
                return ((DeviceInfo) this.instance).getPlatformBytes();
            }

            public Builder setPlatform(String value) {
                copyOnWrite();
                ((DeviceInfo) this.instance).setPlatform(value);
                return this;
            }

            public Builder clearPlatform() {
                copyOnWrite();
                ((DeviceInfo) this.instance).clearPlatform();
                return this;
            }

            public Builder setPlatformBytes(ByteString value) {
                copyOnWrite();
                ((DeviceInfo) this.instance).setPlatformBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.user.User.DeviceInfoOrBuilder
            public String getDeviceId() {
                return ((DeviceInfo) this.instance).getDeviceId();
            }

            @Override // com.yhchat.canarys.proto.user.User.DeviceInfoOrBuilder
            public ByteString getDeviceIdBytes() {
                return ((DeviceInfo) this.instance).getDeviceIdBytes();
            }

            public Builder setDeviceId(String value) {
                copyOnWrite();
                ((DeviceInfo) this.instance).setDeviceId(value);
                return this;
            }

            public Builder clearDeviceId() {
                copyOnWrite();
                ((DeviceInfo) this.instance).clearDeviceId();
                return this;
            }

            public Builder setDeviceIdBytes(ByteString value) {
                copyOnWrite();
                ((DeviceInfo) this.instance).setDeviceIdBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.user.User.DeviceInfoOrBuilder
            public long getLoginTimestamp() {
                return ((DeviceInfo) this.instance).getLoginTimestamp();
            }

            public Builder setLoginTimestamp(long value) {
                copyOnWrite();
                ((DeviceInfo) this.instance).setLoginTimestamp(value);
                return this;
            }

            public Builder clearLoginTimestamp() {
                copyOnWrite();
                ((DeviceInfo) this.instance).clearLoginTimestamp();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new DeviceInfo();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"userId_", "platform_", "deviceId_", "loginTimestamp_"};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u0208\u0003\u0208\u0004\u0208\u0005\u0002", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<DeviceInfo> parser = PARSER;
                    if (parser == null) {
                        synchronized (DeviceInfo.class) {
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
            DeviceInfo defaultInstance = new DeviceInfo();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(DeviceInfo.class, defaultInstance);
        }

        public static DeviceInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<DeviceInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class OnlineDevicesResponse extends GeneratedMessageLite<OnlineDevicesResponse, Builder> implements OnlineDevicesResponseOrBuilder {
        private static final OnlineDevicesResponse DEFAULT_INSTANCE;
        public static final int DEVICES_FIELD_NUMBER = 2;
        private static volatile Parser<OnlineDevicesResponse> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 1;
        private int bitField0_;
        private Internal.ProtobufList<DeviceInfo> devices_ = emptyProtobufList();
        private Status status_;

        private OnlineDevicesResponse() {
        }

        @Override // com.yhchat.canarys.proto.user.User.OnlineDevicesResponseOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.yhchat.canarys.proto.user.User.OnlineDevicesResponseOrBuilder
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

        @Override // com.yhchat.canarys.proto.user.User.OnlineDevicesResponseOrBuilder
        public List<DeviceInfo> getDevicesList() {
            return this.devices_;
        }

        public List<? extends DeviceInfoOrBuilder> getDevicesOrBuilderList() {
            return this.devices_;
        }

        @Override // com.yhchat.canarys.proto.user.User.OnlineDevicesResponseOrBuilder
        public int getDevicesCount() {
            return this.devices_.size();
        }

        @Override // com.yhchat.canarys.proto.user.User.OnlineDevicesResponseOrBuilder
        public DeviceInfo getDevices(int index) {
            return this.devices_.get(index);
        }

        public DeviceInfoOrBuilder getDevicesOrBuilder(int index) {
            return this.devices_.get(index);
        }

        private void ensureDevicesIsMutable() {
            Internal.ProtobufList<DeviceInfo> tmp = this.devices_;
            if (!tmp.isModifiable()) {
                this.devices_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDevices(int index, DeviceInfo value) {
            value.getClass();
            ensureDevicesIsMutable();
            this.devices_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDevices(DeviceInfo value) {
            value.getClass();
            ensureDevicesIsMutable();
            this.devices_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDevices(int index, DeviceInfo value) {
            value.getClass();
            ensureDevicesIsMutable();
            this.devices_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllDevices(Iterable<? extends DeviceInfo> values) {
            ensureDevicesIsMutable();
            AbstractMessageLite.addAll(values, this.devices_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDevices() {
            this.devices_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeDevices(int index) {
            ensureDevicesIsMutable();
            this.devices_.remove(index);
        }

        public static OnlineDevicesResponse parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (OnlineDevicesResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static OnlineDevicesResponse parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (OnlineDevicesResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static OnlineDevicesResponse parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (OnlineDevicesResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static OnlineDevicesResponse parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (OnlineDevicesResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static OnlineDevicesResponse parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (OnlineDevicesResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static OnlineDevicesResponse parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (OnlineDevicesResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static OnlineDevicesResponse parseFrom(InputStream input) throws IOException {
            return (OnlineDevicesResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static OnlineDevicesResponse parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (OnlineDevicesResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static OnlineDevicesResponse parseDelimitedFrom(InputStream input) throws IOException {
            return (OnlineDevicesResponse) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static OnlineDevicesResponse parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (OnlineDevicesResponse) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static OnlineDevicesResponse parseFrom(CodedInputStream input) throws IOException {
            return (OnlineDevicesResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static OnlineDevicesResponse parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (OnlineDevicesResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(OnlineDevicesResponse prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<OnlineDevicesResponse, Builder> implements OnlineDevicesResponseOrBuilder {
            private Builder() {
                super(OnlineDevicesResponse.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.user.User.OnlineDevicesResponseOrBuilder
            public boolean hasStatus() {
                return ((OnlineDevicesResponse) this.instance).hasStatus();
            }

            @Override // com.yhchat.canarys.proto.user.User.OnlineDevicesResponseOrBuilder
            public Status getStatus() {
                return ((OnlineDevicesResponse) this.instance).getStatus();
            }

            public Builder setStatus(Status value) {
                copyOnWrite();
                ((OnlineDevicesResponse) this.instance).setStatus(value);
                return this;
            }

            public Builder setStatus(Status.Builder builderForValue) {
                copyOnWrite();
                ((OnlineDevicesResponse) this.instance).setStatus(builderForValue.build());
                return this;
            }

            public Builder mergeStatus(Status value) {
                copyOnWrite();
                ((OnlineDevicesResponse) this.instance).mergeStatus(value);
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((OnlineDevicesResponse) this.instance).clearStatus();
                return this;
            }

            @Override // com.yhchat.canarys.proto.user.User.OnlineDevicesResponseOrBuilder
            public List<DeviceInfo> getDevicesList() {
                return Collections.unmodifiableList(((OnlineDevicesResponse) this.instance).getDevicesList());
            }

            @Override // com.yhchat.canarys.proto.user.User.OnlineDevicesResponseOrBuilder
            public int getDevicesCount() {
                return ((OnlineDevicesResponse) this.instance).getDevicesCount();
            }

            @Override // com.yhchat.canarys.proto.user.User.OnlineDevicesResponseOrBuilder
            public DeviceInfo getDevices(int index) {
                return ((OnlineDevicesResponse) this.instance).getDevices(index);
            }

            public Builder setDevices(int index, DeviceInfo value) {
                copyOnWrite();
                ((OnlineDevicesResponse) this.instance).setDevices(index, value);
                return this;
            }

            public Builder setDevices(int index, DeviceInfo.Builder builderForValue) {
                copyOnWrite();
                ((OnlineDevicesResponse) this.instance).setDevices(index, builderForValue.build());
                return this;
            }

            public Builder addDevices(DeviceInfo value) {
                copyOnWrite();
                ((OnlineDevicesResponse) this.instance).addDevices(value);
                return this;
            }

            public Builder addDevices(int index, DeviceInfo value) {
                copyOnWrite();
                ((OnlineDevicesResponse) this.instance).addDevices(index, value);
                return this;
            }

            public Builder addDevices(DeviceInfo.Builder builderForValue) {
                copyOnWrite();
                ((OnlineDevicesResponse) this.instance).addDevices(builderForValue.build());
                return this;
            }

            public Builder addDevices(int index, DeviceInfo.Builder builderForValue) {
                copyOnWrite();
                ((OnlineDevicesResponse) this.instance).addDevices(index, builderForValue.build());
                return this;
            }

            public Builder addAllDevices(Iterable<? extends DeviceInfo> values) {
                copyOnWrite();
                ((OnlineDevicesResponse) this.instance).addAllDevices(values);
                return this;
            }

            public Builder clearDevices() {
                copyOnWrite();
                ((OnlineDevicesResponse) this.instance).clearDevices();
                return this;
            }

            public Builder removeDevices(int index) {
                copyOnWrite();
                ((OnlineDevicesResponse) this.instance).removeDevices(index);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new OnlineDevicesResponse();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"bitField0_", "status_", "devices_", DeviceInfo.class};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1009\u0000\u0002\u001b", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<OnlineDevicesResponse> parser = PARSER;
                    if (parser == null) {
                        synchronized (OnlineDevicesResponse.class) {
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
            OnlineDevicesResponse defaultInstance = new OnlineDevicesResponse();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(OnlineDevicesResponse.class, defaultInstance);
        }

        public static OnlineDevicesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<OnlineDevicesResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class RemarkInfo extends GeneratedMessageLite<RemarkInfo, Builder> implements RemarkInfoOrBuilder {
        private static final RemarkInfo DEFAULT_INSTANCE;
        public static final int EXTRA_REMARK_FIELD_NUMBER = 3;
        private static volatile Parser<RemarkInfo> PARSER = null;
        public static final int PHONE_NUMBER_FIELD_NUMBER = 2;
        public static final int REMARK_NAME_FIELD_NUMBER = 1;
        private String remarkName_ = "";
        private String phoneNumber_ = "";
        private String extraRemark_ = "";

        private RemarkInfo() {
        }

        @Override // com.yhchat.canarys.proto.user.User.RemarkInfoOrBuilder
        public String getRemarkName() {
            return this.remarkName_;
        }

        @Override // com.yhchat.canarys.proto.user.User.RemarkInfoOrBuilder
        public ByteString getRemarkNameBytes() {
            return ByteString.copyFromUtf8(this.remarkName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRemarkName(String value) {
            value.getClass();
            this.remarkName_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRemarkName() {
            this.remarkName_ = getDefaultInstance().getRemarkName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRemarkNameBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.remarkName_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.user.User.RemarkInfoOrBuilder
        public String getPhoneNumber() {
            return this.phoneNumber_;
        }

        @Override // com.yhchat.canarys.proto.user.User.RemarkInfoOrBuilder
        public ByteString getPhoneNumberBytes() {
            return ByteString.copyFromUtf8(this.phoneNumber_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhoneNumber(String value) {
            value.getClass();
            this.phoneNumber_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPhoneNumber() {
            this.phoneNumber_ = getDefaultInstance().getPhoneNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhoneNumberBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.phoneNumber_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.user.User.RemarkInfoOrBuilder
        public String getExtraRemark() {
            return this.extraRemark_;
        }

        @Override // com.yhchat.canarys.proto.user.User.RemarkInfoOrBuilder
        public ByteString getExtraRemarkBytes() {
            return ByteString.copyFromUtf8(this.extraRemark_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtraRemark(String value) {
            value.getClass();
            this.extraRemark_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExtraRemark() {
            this.extraRemark_ = getDefaultInstance().getExtraRemark();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtraRemarkBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.extraRemark_ = value.toStringUtf8();
        }

        public static RemarkInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (RemarkInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static RemarkInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (RemarkInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static RemarkInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (RemarkInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static RemarkInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (RemarkInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static RemarkInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (RemarkInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static RemarkInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (RemarkInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static RemarkInfo parseFrom(InputStream input) throws IOException {
            return (RemarkInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static RemarkInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (RemarkInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static RemarkInfo parseDelimitedFrom(InputStream input) throws IOException {
            return (RemarkInfo) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static RemarkInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (RemarkInfo) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static RemarkInfo parseFrom(CodedInputStream input) throws IOException {
            return (RemarkInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static RemarkInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (RemarkInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(RemarkInfo prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<RemarkInfo, Builder> implements RemarkInfoOrBuilder {
            private Builder() {
                super(RemarkInfo.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.user.User.RemarkInfoOrBuilder
            public String getRemarkName() {
                return ((RemarkInfo) this.instance).getRemarkName();
            }

            @Override // com.yhchat.canarys.proto.user.User.RemarkInfoOrBuilder
            public ByteString getRemarkNameBytes() {
                return ((RemarkInfo) this.instance).getRemarkNameBytes();
            }

            public Builder setRemarkName(String value) {
                copyOnWrite();
                ((RemarkInfo) this.instance).setRemarkName(value);
                return this;
            }

            public Builder clearRemarkName() {
                copyOnWrite();
                ((RemarkInfo) this.instance).clearRemarkName();
                return this;
            }

            public Builder setRemarkNameBytes(ByteString value) {
                copyOnWrite();
                ((RemarkInfo) this.instance).setRemarkNameBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.user.User.RemarkInfoOrBuilder
            public String getPhoneNumber() {
                return ((RemarkInfo) this.instance).getPhoneNumber();
            }

            @Override // com.yhchat.canarys.proto.user.User.RemarkInfoOrBuilder
            public ByteString getPhoneNumberBytes() {
                return ((RemarkInfo) this.instance).getPhoneNumberBytes();
            }

            public Builder setPhoneNumber(String value) {
                copyOnWrite();
                ((RemarkInfo) this.instance).setPhoneNumber(value);
                return this;
            }

            public Builder clearPhoneNumber() {
                copyOnWrite();
                ((RemarkInfo) this.instance).clearPhoneNumber();
                return this;
            }

            public Builder setPhoneNumberBytes(ByteString value) {
                copyOnWrite();
                ((RemarkInfo) this.instance).setPhoneNumberBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.user.User.RemarkInfoOrBuilder
            public String getExtraRemark() {
                return ((RemarkInfo) this.instance).getExtraRemark();
            }

            @Override // com.yhchat.canarys.proto.user.User.RemarkInfoOrBuilder
            public ByteString getExtraRemarkBytes() {
                return ((RemarkInfo) this.instance).getExtraRemarkBytes();
            }

            public Builder setExtraRemark(String value) {
                copyOnWrite();
                ((RemarkInfo) this.instance).setExtraRemark(value);
                return this;
            }

            public Builder clearExtraRemark() {
                copyOnWrite();
                ((RemarkInfo) this.instance).clearExtraRemark();
                return this;
            }

            public Builder setExtraRemarkBytes(ByteString value) {
                copyOnWrite();
                ((RemarkInfo) this.instance).setExtraRemarkBytes(value);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new RemarkInfo();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"remarkName_", "phoneNumber_", "extraRemark_"};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<RemarkInfo> parser = PARSER;
                    if (parser == null) {
                        synchronized (RemarkInfo.class) {
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
            RemarkInfo defaultInstance = new RemarkInfo();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(RemarkInfo.class, defaultInstance);
        }

        public static RemarkInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<RemarkInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class ProfileInfo extends GeneratedMessageLite<ProfileInfo, Builder> implements ProfileInfoOrBuilder {
        public static final int ADDRESS_FIELD_NUMBER = 7;
        public static final int BIRTHDAY_FIELD_NUMBER = 4;
        public static final int CITY_FIELD_NUMBER = 5;
        private static final ProfileInfo DEFAULT_INSTANCE;
        public static final int DISTRICT_FIELD_NUMBER = 6;
        public static final int GENDER_FIELD_NUMBER = 3;
        public static final int INTRODUCTION_FIELD_NUMBER = 2;
        public static final int LAST_ACTIVE_TIME_FIELD_NUMBER = 1;
        private static volatile Parser<ProfileInfo> PARSER;
        private long birthday_;
        private int gender_;
        private String lastActiveTime_ = "";
        private String introduction_ = "";
        private String city_ = "";
        private String district_ = "";
        private String address_ = "";

        private ProfileInfo() {
        }

        @Override // com.yhchat.canarys.proto.user.User.ProfileInfoOrBuilder
        public String getLastActiveTime() {
            return this.lastActiveTime_;
        }

        @Override // com.yhchat.canarys.proto.user.User.ProfileInfoOrBuilder
        public ByteString getLastActiveTimeBytes() {
            return ByteString.copyFromUtf8(this.lastActiveTime_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLastActiveTime(String value) {
            value.getClass();
            this.lastActiveTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLastActiveTime() {
            this.lastActiveTime_ = getDefaultInstance().getLastActiveTime();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLastActiveTimeBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.lastActiveTime_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.user.User.ProfileInfoOrBuilder
        public String getIntroduction() {
            return this.introduction_;
        }

        @Override // com.yhchat.canarys.proto.user.User.ProfileInfoOrBuilder
        public ByteString getIntroductionBytes() {
            return ByteString.copyFromUtf8(this.introduction_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIntroduction(String value) {
            value.getClass();
            this.introduction_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIntroduction() {
            this.introduction_ = getDefaultInstance().getIntroduction();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIntroductionBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.introduction_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.user.User.ProfileInfoOrBuilder
        public int getGender() {
            return this.gender_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGender(int value) {
            this.gender_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGender() {
            this.gender_ = 0;
        }

        @Override // com.yhchat.canarys.proto.user.User.ProfileInfoOrBuilder
        public long getBirthday() {
            return this.birthday_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBirthday(long value) {
            this.birthday_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBirthday() {
            this.birthday_ = 0L;
        }

        @Override // com.yhchat.canarys.proto.user.User.ProfileInfoOrBuilder
        public String getCity() {
            return this.city_;
        }

        @Override // com.yhchat.canarys.proto.user.User.ProfileInfoOrBuilder
        public ByteString getCityBytes() {
            return ByteString.copyFromUtf8(this.city_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCity(String value) {
            value.getClass();
            this.city_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCity() {
            this.city_ = getDefaultInstance().getCity();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCityBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.city_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.user.User.ProfileInfoOrBuilder
        public String getDistrict() {
            return this.district_;
        }

        @Override // com.yhchat.canarys.proto.user.User.ProfileInfoOrBuilder
        public ByteString getDistrictBytes() {
            return ByteString.copyFromUtf8(this.district_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDistrict(String value) {
            value.getClass();
            this.district_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDistrict() {
            this.district_ = getDefaultInstance().getDistrict();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDistrictBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.district_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.user.User.ProfileInfoOrBuilder
        public String getAddress() {
            return this.address_;
        }

        @Override // com.yhchat.canarys.proto.user.User.ProfileInfoOrBuilder
        public ByteString getAddressBytes() {
            return ByteString.copyFromUtf8(this.address_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddress(String value) {
            value.getClass();
            this.address_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAddress() {
            this.address_ = getDefaultInstance().getAddress();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddressBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.address_ = value.toStringUtf8();
        }

        public static ProfileInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (ProfileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ProfileInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ProfileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ProfileInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ProfileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ProfileInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ProfileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ProfileInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ProfileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ProfileInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ProfileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ProfileInfo parseFrom(InputStream input) throws IOException {
            return (ProfileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static ProfileInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ProfileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static ProfileInfo parseDelimitedFrom(InputStream input) throws IOException {
            return (ProfileInfo) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static ProfileInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ProfileInfo) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static ProfileInfo parseFrom(CodedInputStream input) throws IOException {
            return (ProfileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static ProfileInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ProfileInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(ProfileInfo prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<ProfileInfo, Builder> implements ProfileInfoOrBuilder {
            private Builder() {
                super(ProfileInfo.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.user.User.ProfileInfoOrBuilder
            public String getLastActiveTime() {
                return ((ProfileInfo) this.instance).getLastActiveTime();
            }

            @Override // com.yhchat.canarys.proto.user.User.ProfileInfoOrBuilder
            public ByteString getLastActiveTimeBytes() {
                return ((ProfileInfo) this.instance).getLastActiveTimeBytes();
            }

            public Builder setLastActiveTime(String value) {
                copyOnWrite();
                ((ProfileInfo) this.instance).setLastActiveTime(value);
                return this;
            }

            public Builder clearLastActiveTime() {
                copyOnWrite();
                ((ProfileInfo) this.instance).clearLastActiveTime();
                return this;
            }

            public Builder setLastActiveTimeBytes(ByteString value) {
                copyOnWrite();
                ((ProfileInfo) this.instance).setLastActiveTimeBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.user.User.ProfileInfoOrBuilder
            public String getIntroduction() {
                return ((ProfileInfo) this.instance).getIntroduction();
            }

            @Override // com.yhchat.canarys.proto.user.User.ProfileInfoOrBuilder
            public ByteString getIntroductionBytes() {
                return ((ProfileInfo) this.instance).getIntroductionBytes();
            }

            public Builder setIntroduction(String value) {
                copyOnWrite();
                ((ProfileInfo) this.instance).setIntroduction(value);
                return this;
            }

            public Builder clearIntroduction() {
                copyOnWrite();
                ((ProfileInfo) this.instance).clearIntroduction();
                return this;
            }

            public Builder setIntroductionBytes(ByteString value) {
                copyOnWrite();
                ((ProfileInfo) this.instance).setIntroductionBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.user.User.ProfileInfoOrBuilder
            public int getGender() {
                return ((ProfileInfo) this.instance).getGender();
            }

            public Builder setGender(int value) {
                copyOnWrite();
                ((ProfileInfo) this.instance).setGender(value);
                return this;
            }

            public Builder clearGender() {
                copyOnWrite();
                ((ProfileInfo) this.instance).clearGender();
                return this;
            }

            @Override // com.yhchat.canarys.proto.user.User.ProfileInfoOrBuilder
            public long getBirthday() {
                return ((ProfileInfo) this.instance).getBirthday();
            }

            public Builder setBirthday(long value) {
                copyOnWrite();
                ((ProfileInfo) this.instance).setBirthday(value);
                return this;
            }

            public Builder clearBirthday() {
                copyOnWrite();
                ((ProfileInfo) this.instance).clearBirthday();
                return this;
            }

            @Override // com.yhchat.canarys.proto.user.User.ProfileInfoOrBuilder
            public String getCity() {
                return ((ProfileInfo) this.instance).getCity();
            }

            @Override // com.yhchat.canarys.proto.user.User.ProfileInfoOrBuilder
            public ByteString getCityBytes() {
                return ((ProfileInfo) this.instance).getCityBytes();
            }

            public Builder setCity(String value) {
                copyOnWrite();
                ((ProfileInfo) this.instance).setCity(value);
                return this;
            }

            public Builder clearCity() {
                copyOnWrite();
                ((ProfileInfo) this.instance).clearCity();
                return this;
            }

            public Builder setCityBytes(ByteString value) {
                copyOnWrite();
                ((ProfileInfo) this.instance).setCityBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.user.User.ProfileInfoOrBuilder
            public String getDistrict() {
                return ((ProfileInfo) this.instance).getDistrict();
            }

            @Override // com.yhchat.canarys.proto.user.User.ProfileInfoOrBuilder
            public ByteString getDistrictBytes() {
                return ((ProfileInfo) this.instance).getDistrictBytes();
            }

            public Builder setDistrict(String value) {
                copyOnWrite();
                ((ProfileInfo) this.instance).setDistrict(value);
                return this;
            }

            public Builder clearDistrict() {
                copyOnWrite();
                ((ProfileInfo) this.instance).clearDistrict();
                return this;
            }

            public Builder setDistrictBytes(ByteString value) {
                copyOnWrite();
                ((ProfileInfo) this.instance).setDistrictBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.user.User.ProfileInfoOrBuilder
            public String getAddress() {
                return ((ProfileInfo) this.instance).getAddress();
            }

            @Override // com.yhchat.canarys.proto.user.User.ProfileInfoOrBuilder
            public ByteString getAddressBytes() {
                return ((ProfileInfo) this.instance).getAddressBytes();
            }

            public Builder setAddress(String value) {
                copyOnWrite();
                ((ProfileInfo) this.instance).setAddress(value);
                return this;
            }

            public Builder clearAddress() {
                copyOnWrite();
                ((ProfileInfo) this.instance).clearAddress();
                return this;
            }

            public Builder setAddressBytes(ByteString value) {
                copyOnWrite();
                ((ProfileInfo) this.instance).setAddressBytes(value);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new ProfileInfo();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"lastActiveTime_", "introduction_", "gender_", "birthday_", "city_", "district_", "address_"};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0004\u0004\u0003\u0005\u0208\u0006\u0208\u0007\u0208", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<ProfileInfo> parser = PARSER;
                    if (parser == null) {
                        synchronized (ProfileInfo.class) {
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
            ProfileInfo defaultInstance = new ProfileInfo();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(ProfileInfo.class, defaultInstance);
        }

        public static ProfileInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ProfileInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
