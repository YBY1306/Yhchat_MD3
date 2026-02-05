package com.yhchat.canarys.proto.group;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.yhchat.canarys.proto.group.Bot_data;
import com.yhchat.canarys.proto.group.Status;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class info extends GeneratedMessageLite<info, Builder> implements infoOrBuilder {
    public static final int DATA_FIELD_NUMBER = 2;
    private static final info DEFAULT_INSTANCE;
    public static final int HISTORY_BOT_FIELD_NUMBER = 3;
    private static volatile Parser<info> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private Group_data data_;
    private Internal.ProtobufList<Bot_data> historyBot_ = emptyProtobufList();
    private Status status_;

    public interface Group_dataOrBuilder extends MessageLiteOrBuilder {
        String getAdmin(int index);

        ByteString getAdminBytes(int index);

        int getAdminCount();

        List<String> getAdminList();

        long getAutoDeleteMessage();

        long getAvatarId();

        String getAvatarUrl();

        ByteString getAvatarUrlBytes();

        long getCategoryId();

        String getCategoryName();

        ByteString getCategoryNameBytes();

        long getCommunityId();

        String getCommunityName();

        ByteString getCommunityNameBytes();

        String getCreateBy();

        ByteString getCreateByBytes();

        long getDenyMembersUploadToGroupDisk();

        int getDirectJoin();

        int getDoNotDisturb();

        String getGroupCode();

        ByteString getGroupCodeBytes();

        String getGroupId();

        ByteString getGroupIdBytes();

        long getHideGroupMembers();

        int getHistoryMsg();

        String getIntroduction();

        ByteString getIntroductionBytes();

        String getLimitedMsgType();

        ByteString getLimitedMsgTypeBytes();

        long getMember();

        String getMyGroupNickname();

        ByteString getMyGroupNicknameBytes();

        String getName();

        ByteString getNameBytes();

        String getOwner();

        ByteString getOwnerBytes();

        int getPermissonLevel();

        int getPrivate();

        int getRecommandation();

        Group_data.Tag getTag(int index);

        int getTagCount();

        List<Group_data.Tag> getTagList();

        String getTagOld(int index);

        ByteString getTagOldBytes(int index);

        int getTagOldCount();

        List<String> getTagOldList();

        int getTop();
    }

    private info() {
    }

    public static final class Group_data extends GeneratedMessageLite<Group_data, Builder> implements Group_dataOrBuilder {
        public static final int ADMIN_FIELD_NUMBER = 20;
        public static final int AUTO_DELETE_MESSAGE_FIELD_NUMBER = 32;
        public static final int AVATAR_ID_FIELD_NUMBER = 4;
        public static final int AVATAR_URL_FIELD_NUMBER = 3;
        public static final int CATEGORY_ID_FIELD_NUMBER = 12;
        public static final int CATEGORY_NAME_FIELD_NUMBER = 11;
        public static final int COMMUNITY_ID_FIELD_NUMBER = 15;
        public static final int COMMUNITY_NAME_FIELD_NUMBER = 16;
        public static final int CREATE_BY_FIELD_NUMBER = 7;
        private static final Group_data DEFAULT_INSTANCE;
        public static final int DENY_MEMBERS_UPLOAD_TO_GROUP_DISK_FIELD_NUMBER = 33;
        public static final int DIRECT_JOIN_FIELD_NUMBER = 8;
        public static final int DO_NOT_DISTURB_FIELD_NUMBER = 14;
        public static final int GROUP_CODE_FIELD_NUMBER = 29;
        public static final int GROUP_ID_FIELD_NUMBER = 1;
        public static final int HIDE_GROUP_MEMBERS_FIELD_NUMBER = 30;
        public static final int HISTORY_MSG_FIELD_NUMBER = 10;
        public static final int INTRODUCTION_FIELD_NUMBER = 5;
        public static final int LIMITED_MSG_TYPE_FIELD_NUMBER = 22;
        public static final int MEMBER_FIELD_NUMBER = 6;
        public static final int MY_GROUP_NICKNAME_FIELD_NUMBER = 28;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int OWNER_FIELD_NUMBER = 23;
        private static volatile Parser<Group_data> PARSER = null;
        public static final int PERMISSON_LEVEL_FIELD_NUMBER = 9;
        public static final int PRIVATE_FIELD_NUMBER = 13;
        public static final int RECOMMANDATION_FIELD_NUMBER = 24;
        public static final int TAG_FIELD_NUMBER = 27;
        public static final int TAG_OLD_FIELD_NUMBER = 26;
        public static final int TOP_FIELD_NUMBER = 19;
        private long autoDeleteMessage_;
        private long avatarId_;
        private long categoryId_;
        private long communityId_;
        private long denyMembersUploadToGroupDisk_;
        private int directJoin_;
        private int doNotDisturb_;
        private long hideGroupMembers_;
        private int historyMsg_;
        private long member_;
        private int permissonLevel_;
        private int private_;
        private int recommandation_;
        private int top_;
        private String groupId_ = "";
        private String name_ = "";
        private String avatarUrl_ = "";
        private String introduction_ = "";
        private String createBy_ = "";
        private String categoryName_ = "";
        private String communityName_ = "";
        private Internal.ProtobufList<String> admin_ = GeneratedMessageLite.emptyProtobufList();
        private String limitedMsgType_ = "";
        private String owner_ = "";
        private Internal.ProtobufList<String> tagOld_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<Tag> tag_ = emptyProtobufList();
        private String myGroupNickname_ = "";
        private String groupCode_ = "";

        public interface TagOrBuilder extends MessageLiteOrBuilder {
            String getColor();

            ByteString getColorBytes();

            long getId();

            String getText();

            ByteString getTextBytes();
        }

        private Group_data() {
        }

        public static final class Tag extends GeneratedMessageLite<Tag, Builder> implements TagOrBuilder {
            public static final int COLOR_FIELD_NUMBER = 4;
            private static final Tag DEFAULT_INSTANCE;
            public static final int ID_FIELD_NUMBER = 1;
            private static volatile Parser<Tag> PARSER = null;
            public static final int TEXT_FIELD_NUMBER = 3;
            private long id_;
            private String text_ = "";
            private String color_ = "";

            private Tag() {
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_data.TagOrBuilder
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

            @Override // com.yhchat.canarys.proto.group.info.Group_data.TagOrBuilder
            public String getText() {
                return this.text_;
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_data.TagOrBuilder
            public ByteString getTextBytes() {
                return ByteString.copyFromUtf8(this.text_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setText(String value) {
                value.getClass();
                this.text_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearText() {
                this.text_ = getDefaultInstance().getText();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTextBytes(ByteString value) {
                checkByteStringIsUtf8(value);
                this.text_ = value.toStringUtf8();
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_data.TagOrBuilder
            public String getColor() {
                return this.color_;
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_data.TagOrBuilder
            public ByteString getColorBytes() {
                return ByteString.copyFromUtf8(this.color_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setColor(String value) {
                value.getClass();
                this.color_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearColor() {
                this.color_ = getDefaultInstance().getColor();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setColorBytes(ByteString value) {
                checkByteStringIsUtf8(value);
                this.color_ = value.toStringUtf8();
            }

            public static Tag parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return (Tag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Tag parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Tag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Tag parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return (Tag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Tag parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Tag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Tag parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return (Tag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Tag parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Tag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Tag parseFrom(InputStream input) throws IOException {
                return (Tag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static Tag parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Tag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Tag parseDelimitedFrom(InputStream input) throws IOException {
                return (Tag) parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static Tag parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Tag) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Tag parseFrom(CodedInputStream input) throws IOException {
                return (Tag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static Tag parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Tag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(Tag prototype) {
                return DEFAULT_INSTANCE.createBuilder(prototype);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<Tag, Builder> implements TagOrBuilder {
                private Builder() {
                    super(Tag.DEFAULT_INSTANCE);
                }

                @Override // com.yhchat.canarys.proto.group.info.Group_data.TagOrBuilder
                public long getId() {
                    return ((Tag) this.instance).getId();
                }

                public Builder setId(long value) {
                    copyOnWrite();
                    ((Tag) this.instance).setId(value);
                    return this;
                }

                public Builder clearId() {
                    copyOnWrite();
                    ((Tag) this.instance).clearId();
                    return this;
                }

                @Override // com.yhchat.canarys.proto.group.info.Group_data.TagOrBuilder
                public String getText() {
                    return ((Tag) this.instance).getText();
                }

                @Override // com.yhchat.canarys.proto.group.info.Group_data.TagOrBuilder
                public ByteString getTextBytes() {
                    return ((Tag) this.instance).getTextBytes();
                }

                public Builder setText(String value) {
                    copyOnWrite();
                    ((Tag) this.instance).setText(value);
                    return this;
                }

                public Builder clearText() {
                    copyOnWrite();
                    ((Tag) this.instance).clearText();
                    return this;
                }

                public Builder setTextBytes(ByteString value) {
                    copyOnWrite();
                    ((Tag) this.instance).setTextBytes(value);
                    return this;
                }

                @Override // com.yhchat.canarys.proto.group.info.Group_data.TagOrBuilder
                public String getColor() {
                    return ((Tag) this.instance).getColor();
                }

                @Override // com.yhchat.canarys.proto.group.info.Group_data.TagOrBuilder
                public ByteString getColorBytes() {
                    return ((Tag) this.instance).getColorBytes();
                }

                public Builder setColor(String value) {
                    copyOnWrite();
                    ((Tag) this.instance).setColor(value);
                    return this;
                }

                public Builder clearColor() {
                    copyOnWrite();
                    ((Tag) this.instance).clearColor();
                    return this;
                }

                public Builder setColorBytes(ByteString value) {
                    copyOnWrite();
                    ((Tag) this.instance).setColorBytes(value);
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
                switch (method) {
                    case NEW_MUTABLE_INSTANCE:
                        return new Tag();
                    case NEW_BUILDER:
                        return new Builder();
                    case BUILD_MESSAGE_INFO:
                        Object[] objects = {"id_", "text_", "color_"};
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u0002\u0003\u0208\u0004\u0208", objects);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<Tag> parser = PARSER;
                        if (parser == null) {
                            synchronized (Tag.class) {
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
                Tag defaultInstance = new Tag();
                DEFAULT_INSTANCE = defaultInstance;
                GeneratedMessageLite.registerDefaultInstance(Tag.class, defaultInstance);
            }

            public static Tag getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<Tag> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
        public String getGroupId() {
            return this.groupId_;
        }

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
        public ByteString getGroupIdBytes() {
            return ByteString.copyFromUtf8(this.groupId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGroupId(String value) {
            value.getClass();
            this.groupId_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGroupId() {
            this.groupId_ = getDefaultInstance().getGroupId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGroupIdBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.groupId_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
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

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
        public String getAvatarUrl() {
            return this.avatarUrl_;
        }

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
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

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
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

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
        public String getIntroduction() {
            return this.introduction_;
        }

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
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

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
        public long getMember() {
            return this.member_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMember(long value) {
            this.member_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMember() {
            this.member_ = 0L;
        }

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
        public String getCreateBy() {
            return this.createBy_;
        }

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
        public ByteString getCreateByBytes() {
            return ByteString.copyFromUtf8(this.createBy_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCreateBy(String value) {
            value.getClass();
            this.createBy_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCreateBy() {
            this.createBy_ = getDefaultInstance().getCreateBy();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCreateByBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.createBy_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
        public int getDirectJoin() {
            return this.directJoin_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDirectJoin(int value) {
            this.directJoin_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDirectJoin() {
            this.directJoin_ = 0;
        }

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
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

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
        public int getHistoryMsg() {
            return this.historyMsg_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHistoryMsg(int value) {
            this.historyMsg_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHistoryMsg() {
            this.historyMsg_ = 0;
        }

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
        public String getCategoryName() {
            return this.categoryName_;
        }

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
        public ByteString getCategoryNameBytes() {
            return ByteString.copyFromUtf8(this.categoryName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCategoryName(String value) {
            value.getClass();
            this.categoryName_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCategoryName() {
            this.categoryName_ = getDefaultInstance().getCategoryName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCategoryNameBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.categoryName_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
        public long getCategoryId() {
            return this.categoryId_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCategoryId(long value) {
            this.categoryId_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCategoryId() {
            this.categoryId_ = 0L;
        }

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
        public int getPrivate() {
            return this.private_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrivate(int value) {
            this.private_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPrivate() {
            this.private_ = 0;
        }

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
        public int getDoNotDisturb() {
            return this.doNotDisturb_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDoNotDisturb(int value) {
            this.doNotDisturb_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDoNotDisturb() {
            this.doNotDisturb_ = 0;
        }

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
        public long getCommunityId() {
            return this.communityId_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCommunityId(long value) {
            this.communityId_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCommunityId() {
            this.communityId_ = 0L;
        }

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
        public String getCommunityName() {
            return this.communityName_;
        }

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
        public ByteString getCommunityNameBytes() {
            return ByteString.copyFromUtf8(this.communityName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCommunityName(String value) {
            value.getClass();
            this.communityName_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCommunityName() {
            this.communityName_ = getDefaultInstance().getCommunityName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCommunityNameBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.communityName_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
        public int getTop() {
            return this.top_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTop(int value) {
            this.top_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTop() {
            this.top_ = 0;
        }

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
        public List<String> getAdminList() {
            return this.admin_;
        }

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
        public int getAdminCount() {
            return this.admin_.size();
        }

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
        public String getAdmin(int index) {
            return this.admin_.get(index);
        }

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
        public ByteString getAdminBytes(int index) {
            return ByteString.copyFromUtf8(this.admin_.get(index));
        }

        private void ensureAdminIsMutable() {
            Internal.ProtobufList<String> tmp = this.admin_;
            if (!tmp.isModifiable()) {
                this.admin_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdmin(int index, String value) {
            value.getClass();
            ensureAdminIsMutable();
            this.admin_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAdmin(String value) {
            value.getClass();
            ensureAdminIsMutable();
            this.admin_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAdmin(Iterable<String> values) {
            ensureAdminIsMutable();
            AbstractMessageLite.addAll(values, this.admin_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdmin() {
            this.admin_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAdminBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            ensureAdminIsMutable();
            this.admin_.add(value.toStringUtf8());
        }

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
        public String getLimitedMsgType() {
            return this.limitedMsgType_;
        }

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
        public ByteString getLimitedMsgTypeBytes() {
            return ByteString.copyFromUtf8(this.limitedMsgType_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLimitedMsgType(String value) {
            value.getClass();
            this.limitedMsgType_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLimitedMsgType() {
            this.limitedMsgType_ = getDefaultInstance().getLimitedMsgType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLimitedMsgTypeBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.limitedMsgType_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
        public String getOwner() {
            return this.owner_;
        }

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
        public ByteString getOwnerBytes() {
            return ByteString.copyFromUtf8(this.owner_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOwner(String value) {
            value.getClass();
            this.owner_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOwner() {
            this.owner_ = getDefaultInstance().getOwner();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOwnerBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.owner_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
        public int getRecommandation() {
            return this.recommandation_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRecommandation(int value) {
            this.recommandation_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRecommandation() {
            this.recommandation_ = 0;
        }

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
        public List<String> getTagOldList() {
            return this.tagOld_;
        }

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
        public int getTagOldCount() {
            return this.tagOld_.size();
        }

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
        public String getTagOld(int index) {
            return this.tagOld_.get(index);
        }

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
        public ByteString getTagOldBytes(int index) {
            return ByteString.copyFromUtf8(this.tagOld_.get(index));
        }

        private void ensureTagOldIsMutable() {
            Internal.ProtobufList<String> tmp = this.tagOld_;
            if (!tmp.isModifiable()) {
                this.tagOld_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTagOld(int index, String value) {
            value.getClass();
            ensureTagOldIsMutable();
            this.tagOld_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTagOld(String value) {
            value.getClass();
            ensureTagOldIsMutable();
            this.tagOld_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTagOld(Iterable<String> values) {
            ensureTagOldIsMutable();
            AbstractMessageLite.addAll(values, this.tagOld_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTagOld() {
            this.tagOld_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTagOldBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            ensureTagOldIsMutable();
            this.tagOld_.add(value.toStringUtf8());
        }

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
        public List<Tag> getTagList() {
            return this.tag_;
        }

        public List<? extends TagOrBuilder> getTagOrBuilderList() {
            return this.tag_;
        }

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
        public int getTagCount() {
            return this.tag_.size();
        }

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
        public Tag getTag(int index) {
            return this.tag_.get(index);
        }

        public TagOrBuilder getTagOrBuilder(int index) {
            return this.tag_.get(index);
        }

        private void ensureTagIsMutable() {
            Internal.ProtobufList<Tag> tmp = this.tag_;
            if (!tmp.isModifiable()) {
                this.tag_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTag(int index, Tag value) {
            value.getClass();
            ensureTagIsMutable();
            this.tag_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTag(Tag value) {
            value.getClass();
            ensureTagIsMutable();
            this.tag_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTag(int index, Tag value) {
            value.getClass();
            ensureTagIsMutable();
            this.tag_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTag(Iterable<? extends Tag> values) {
            ensureTagIsMutable();
            AbstractMessageLite.addAll(values, this.tag_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTag() {
            this.tag_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeTag(int index) {
            ensureTagIsMutable();
            this.tag_.remove(index);
        }

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
        public String getMyGroupNickname() {
            return this.myGroupNickname_;
        }

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
        public ByteString getMyGroupNicknameBytes() {
            return ByteString.copyFromUtf8(this.myGroupNickname_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMyGroupNickname(String value) {
            value.getClass();
            this.myGroupNickname_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMyGroupNickname() {
            this.myGroupNickname_ = getDefaultInstance().getMyGroupNickname();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMyGroupNicknameBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.myGroupNickname_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
        public String getGroupCode() {
            return this.groupCode_;
        }

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
        public ByteString getGroupCodeBytes() {
            return ByteString.copyFromUtf8(this.groupCode_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGroupCode(String value) {
            value.getClass();
            this.groupCode_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGroupCode() {
            this.groupCode_ = getDefaultInstance().getGroupCode();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGroupCodeBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.groupCode_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
        public long getHideGroupMembers() {
            return this.hideGroupMembers_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHideGroupMembers(long value) {
            this.hideGroupMembers_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHideGroupMembers() {
            this.hideGroupMembers_ = 0L;
        }

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
        public long getAutoDeleteMessage() {
            return this.autoDeleteMessage_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAutoDeleteMessage(long value) {
            this.autoDeleteMessage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAutoDeleteMessage() {
            this.autoDeleteMessage_ = 0L;
        }

        @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
        public long getDenyMembersUploadToGroupDisk() {
            return this.denyMembersUploadToGroupDisk_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDenyMembersUploadToGroupDisk(long value) {
            this.denyMembersUploadToGroupDisk_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDenyMembersUploadToGroupDisk() {
            this.denyMembersUploadToGroupDisk_ = 0L;
        }

        public static Group_data parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (Group_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Group_data parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Group_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Group_data parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (Group_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Group_data parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Group_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Group_data parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (Group_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Group_data parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Group_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Group_data parseFrom(InputStream input) throws IOException {
            return (Group_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Group_data parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Group_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Group_data parseDelimitedFrom(InputStream input) throws IOException {
            return (Group_data) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static Group_data parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Group_data) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Group_data parseFrom(CodedInputStream input) throws IOException {
            return (Group_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Group_data parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Group_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Group_data prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Group_data, Builder> implements Group_dataOrBuilder {
            private Builder() {
                super(Group_data.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public String getGroupId() {
                return ((Group_data) this.instance).getGroupId();
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public ByteString getGroupIdBytes() {
                return ((Group_data) this.instance).getGroupIdBytes();
            }

            public Builder setGroupId(String value) {
                copyOnWrite();
                ((Group_data) this.instance).setGroupId(value);
                return this;
            }

            public Builder clearGroupId() {
                copyOnWrite();
                ((Group_data) this.instance).clearGroupId();
                return this;
            }

            public Builder setGroupIdBytes(ByteString value) {
                copyOnWrite();
                ((Group_data) this.instance).setGroupIdBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public String getName() {
                return ((Group_data) this.instance).getName();
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public ByteString getNameBytes() {
                return ((Group_data) this.instance).getNameBytes();
            }

            public Builder setName(String value) {
                copyOnWrite();
                ((Group_data) this.instance).setName(value);
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((Group_data) this.instance).clearName();
                return this;
            }

            public Builder setNameBytes(ByteString value) {
                copyOnWrite();
                ((Group_data) this.instance).setNameBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public String getAvatarUrl() {
                return ((Group_data) this.instance).getAvatarUrl();
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public ByteString getAvatarUrlBytes() {
                return ((Group_data) this.instance).getAvatarUrlBytes();
            }

            public Builder setAvatarUrl(String value) {
                copyOnWrite();
                ((Group_data) this.instance).setAvatarUrl(value);
                return this;
            }

            public Builder clearAvatarUrl() {
                copyOnWrite();
                ((Group_data) this.instance).clearAvatarUrl();
                return this;
            }

            public Builder setAvatarUrlBytes(ByteString value) {
                copyOnWrite();
                ((Group_data) this.instance).setAvatarUrlBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public long getAvatarId() {
                return ((Group_data) this.instance).getAvatarId();
            }

            public Builder setAvatarId(long value) {
                copyOnWrite();
                ((Group_data) this.instance).setAvatarId(value);
                return this;
            }

            public Builder clearAvatarId() {
                copyOnWrite();
                ((Group_data) this.instance).clearAvatarId();
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public String getIntroduction() {
                return ((Group_data) this.instance).getIntroduction();
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public ByteString getIntroductionBytes() {
                return ((Group_data) this.instance).getIntroductionBytes();
            }

            public Builder setIntroduction(String value) {
                copyOnWrite();
                ((Group_data) this.instance).setIntroduction(value);
                return this;
            }

            public Builder clearIntroduction() {
                copyOnWrite();
                ((Group_data) this.instance).clearIntroduction();
                return this;
            }

            public Builder setIntroductionBytes(ByteString value) {
                copyOnWrite();
                ((Group_data) this.instance).setIntroductionBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public long getMember() {
                return ((Group_data) this.instance).getMember();
            }

            public Builder setMember(long value) {
                copyOnWrite();
                ((Group_data) this.instance).setMember(value);
                return this;
            }

            public Builder clearMember() {
                copyOnWrite();
                ((Group_data) this.instance).clearMember();
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public String getCreateBy() {
                return ((Group_data) this.instance).getCreateBy();
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public ByteString getCreateByBytes() {
                return ((Group_data) this.instance).getCreateByBytes();
            }

            public Builder setCreateBy(String value) {
                copyOnWrite();
                ((Group_data) this.instance).setCreateBy(value);
                return this;
            }

            public Builder clearCreateBy() {
                copyOnWrite();
                ((Group_data) this.instance).clearCreateBy();
                return this;
            }

            public Builder setCreateByBytes(ByteString value) {
                copyOnWrite();
                ((Group_data) this.instance).setCreateByBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public int getDirectJoin() {
                return ((Group_data) this.instance).getDirectJoin();
            }

            public Builder setDirectJoin(int value) {
                copyOnWrite();
                ((Group_data) this.instance).setDirectJoin(value);
                return this;
            }

            public Builder clearDirectJoin() {
                copyOnWrite();
                ((Group_data) this.instance).clearDirectJoin();
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public int getPermissonLevel() {
                return ((Group_data) this.instance).getPermissonLevel();
            }

            public Builder setPermissonLevel(int value) {
                copyOnWrite();
                ((Group_data) this.instance).setPermissonLevel(value);
                return this;
            }

            public Builder clearPermissonLevel() {
                copyOnWrite();
                ((Group_data) this.instance).clearPermissonLevel();
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public int getHistoryMsg() {
                return ((Group_data) this.instance).getHistoryMsg();
            }

            public Builder setHistoryMsg(int value) {
                copyOnWrite();
                ((Group_data) this.instance).setHistoryMsg(value);
                return this;
            }

            public Builder clearHistoryMsg() {
                copyOnWrite();
                ((Group_data) this.instance).clearHistoryMsg();
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public String getCategoryName() {
                return ((Group_data) this.instance).getCategoryName();
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public ByteString getCategoryNameBytes() {
                return ((Group_data) this.instance).getCategoryNameBytes();
            }

            public Builder setCategoryName(String value) {
                copyOnWrite();
                ((Group_data) this.instance).setCategoryName(value);
                return this;
            }

            public Builder clearCategoryName() {
                copyOnWrite();
                ((Group_data) this.instance).clearCategoryName();
                return this;
            }

            public Builder setCategoryNameBytes(ByteString value) {
                copyOnWrite();
                ((Group_data) this.instance).setCategoryNameBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public long getCategoryId() {
                return ((Group_data) this.instance).getCategoryId();
            }

            public Builder setCategoryId(long value) {
                copyOnWrite();
                ((Group_data) this.instance).setCategoryId(value);
                return this;
            }

            public Builder clearCategoryId() {
                copyOnWrite();
                ((Group_data) this.instance).clearCategoryId();
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public int getPrivate() {
                return ((Group_data) this.instance).getPrivate();
            }

            public Builder setPrivate(int value) {
                copyOnWrite();
                ((Group_data) this.instance).setPrivate(value);
                return this;
            }

            public Builder clearPrivate() {
                copyOnWrite();
                ((Group_data) this.instance).clearPrivate();
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public int getDoNotDisturb() {
                return ((Group_data) this.instance).getDoNotDisturb();
            }

            public Builder setDoNotDisturb(int value) {
                copyOnWrite();
                ((Group_data) this.instance).setDoNotDisturb(value);
                return this;
            }

            public Builder clearDoNotDisturb() {
                copyOnWrite();
                ((Group_data) this.instance).clearDoNotDisturb();
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public long getCommunityId() {
                return ((Group_data) this.instance).getCommunityId();
            }

            public Builder setCommunityId(long value) {
                copyOnWrite();
                ((Group_data) this.instance).setCommunityId(value);
                return this;
            }

            public Builder clearCommunityId() {
                copyOnWrite();
                ((Group_data) this.instance).clearCommunityId();
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public String getCommunityName() {
                return ((Group_data) this.instance).getCommunityName();
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public ByteString getCommunityNameBytes() {
                return ((Group_data) this.instance).getCommunityNameBytes();
            }

            public Builder setCommunityName(String value) {
                copyOnWrite();
                ((Group_data) this.instance).setCommunityName(value);
                return this;
            }

            public Builder clearCommunityName() {
                copyOnWrite();
                ((Group_data) this.instance).clearCommunityName();
                return this;
            }

            public Builder setCommunityNameBytes(ByteString value) {
                copyOnWrite();
                ((Group_data) this.instance).setCommunityNameBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public int getTop() {
                return ((Group_data) this.instance).getTop();
            }

            public Builder setTop(int value) {
                copyOnWrite();
                ((Group_data) this.instance).setTop(value);
                return this;
            }

            public Builder clearTop() {
                copyOnWrite();
                ((Group_data) this.instance).clearTop();
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public List<String> getAdminList() {
                return Collections.unmodifiableList(((Group_data) this.instance).getAdminList());
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public int getAdminCount() {
                return ((Group_data) this.instance).getAdminCount();
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public String getAdmin(int index) {
                return ((Group_data) this.instance).getAdmin(index);
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public ByteString getAdminBytes(int index) {
                return ((Group_data) this.instance).getAdminBytes(index);
            }

            public Builder setAdmin(int index, String value) {
                copyOnWrite();
                ((Group_data) this.instance).setAdmin(index, value);
                return this;
            }

            public Builder addAdmin(String value) {
                copyOnWrite();
                ((Group_data) this.instance).addAdmin(value);
                return this;
            }

            public Builder addAllAdmin(Iterable<String> values) {
                copyOnWrite();
                ((Group_data) this.instance).addAllAdmin(values);
                return this;
            }

            public Builder clearAdmin() {
                copyOnWrite();
                ((Group_data) this.instance).clearAdmin();
                return this;
            }

            public Builder addAdminBytes(ByteString value) {
                copyOnWrite();
                ((Group_data) this.instance).addAdminBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public String getLimitedMsgType() {
                return ((Group_data) this.instance).getLimitedMsgType();
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public ByteString getLimitedMsgTypeBytes() {
                return ((Group_data) this.instance).getLimitedMsgTypeBytes();
            }

            public Builder setLimitedMsgType(String value) {
                copyOnWrite();
                ((Group_data) this.instance).setLimitedMsgType(value);
                return this;
            }

            public Builder clearLimitedMsgType() {
                copyOnWrite();
                ((Group_data) this.instance).clearLimitedMsgType();
                return this;
            }

            public Builder setLimitedMsgTypeBytes(ByteString value) {
                copyOnWrite();
                ((Group_data) this.instance).setLimitedMsgTypeBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public String getOwner() {
                return ((Group_data) this.instance).getOwner();
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public ByteString getOwnerBytes() {
                return ((Group_data) this.instance).getOwnerBytes();
            }

            public Builder setOwner(String value) {
                copyOnWrite();
                ((Group_data) this.instance).setOwner(value);
                return this;
            }

            public Builder clearOwner() {
                copyOnWrite();
                ((Group_data) this.instance).clearOwner();
                return this;
            }

            public Builder setOwnerBytes(ByteString value) {
                copyOnWrite();
                ((Group_data) this.instance).setOwnerBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public int getRecommandation() {
                return ((Group_data) this.instance).getRecommandation();
            }

            public Builder setRecommandation(int value) {
                copyOnWrite();
                ((Group_data) this.instance).setRecommandation(value);
                return this;
            }

            public Builder clearRecommandation() {
                copyOnWrite();
                ((Group_data) this.instance).clearRecommandation();
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public List<String> getTagOldList() {
                return Collections.unmodifiableList(((Group_data) this.instance).getTagOldList());
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public int getTagOldCount() {
                return ((Group_data) this.instance).getTagOldCount();
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public String getTagOld(int index) {
                return ((Group_data) this.instance).getTagOld(index);
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public ByteString getTagOldBytes(int index) {
                return ((Group_data) this.instance).getTagOldBytes(index);
            }

            public Builder setTagOld(int index, String value) {
                copyOnWrite();
                ((Group_data) this.instance).setTagOld(index, value);
                return this;
            }

            public Builder addTagOld(String value) {
                copyOnWrite();
                ((Group_data) this.instance).addTagOld(value);
                return this;
            }

            public Builder addAllTagOld(Iterable<String> values) {
                copyOnWrite();
                ((Group_data) this.instance).addAllTagOld(values);
                return this;
            }

            public Builder clearTagOld() {
                copyOnWrite();
                ((Group_data) this.instance).clearTagOld();
                return this;
            }

            public Builder addTagOldBytes(ByteString value) {
                copyOnWrite();
                ((Group_data) this.instance).addTagOldBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public List<Tag> getTagList() {
                return Collections.unmodifiableList(((Group_data) this.instance).getTagList());
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public int getTagCount() {
                return ((Group_data) this.instance).getTagCount();
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public Tag getTag(int index) {
                return ((Group_data) this.instance).getTag(index);
            }

            public Builder setTag(int index, Tag value) {
                copyOnWrite();
                ((Group_data) this.instance).setTag(index, value);
                return this;
            }

            public Builder setTag(int index, Tag.Builder builderForValue) {
                copyOnWrite();
                ((Group_data) this.instance).setTag(index, builderForValue.build());
                return this;
            }

            public Builder addTag(Tag value) {
                copyOnWrite();
                ((Group_data) this.instance).addTag(value);
                return this;
            }

            public Builder addTag(int index, Tag value) {
                copyOnWrite();
                ((Group_data) this.instance).addTag(index, value);
                return this;
            }

            public Builder addTag(Tag.Builder builderForValue) {
                copyOnWrite();
                ((Group_data) this.instance).addTag(builderForValue.build());
                return this;
            }

            public Builder addTag(int index, Tag.Builder builderForValue) {
                copyOnWrite();
                ((Group_data) this.instance).addTag(index, builderForValue.build());
                return this;
            }

            public Builder addAllTag(Iterable<? extends Tag> values) {
                copyOnWrite();
                ((Group_data) this.instance).addAllTag(values);
                return this;
            }

            public Builder clearTag() {
                copyOnWrite();
                ((Group_data) this.instance).clearTag();
                return this;
            }

            public Builder removeTag(int index) {
                copyOnWrite();
                ((Group_data) this.instance).removeTag(index);
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public String getMyGroupNickname() {
                return ((Group_data) this.instance).getMyGroupNickname();
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public ByteString getMyGroupNicknameBytes() {
                return ((Group_data) this.instance).getMyGroupNicknameBytes();
            }

            public Builder setMyGroupNickname(String value) {
                copyOnWrite();
                ((Group_data) this.instance).setMyGroupNickname(value);
                return this;
            }

            public Builder clearMyGroupNickname() {
                copyOnWrite();
                ((Group_data) this.instance).clearMyGroupNickname();
                return this;
            }

            public Builder setMyGroupNicknameBytes(ByteString value) {
                copyOnWrite();
                ((Group_data) this.instance).setMyGroupNicknameBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public String getGroupCode() {
                return ((Group_data) this.instance).getGroupCode();
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public ByteString getGroupCodeBytes() {
                return ((Group_data) this.instance).getGroupCodeBytes();
            }

            public Builder setGroupCode(String value) {
                copyOnWrite();
                ((Group_data) this.instance).setGroupCode(value);
                return this;
            }

            public Builder clearGroupCode() {
                copyOnWrite();
                ((Group_data) this.instance).clearGroupCode();
                return this;
            }

            public Builder setGroupCodeBytes(ByteString value) {
                copyOnWrite();
                ((Group_data) this.instance).setGroupCodeBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public long getHideGroupMembers() {
                return ((Group_data) this.instance).getHideGroupMembers();
            }

            public Builder setHideGroupMembers(long value) {
                copyOnWrite();
                ((Group_data) this.instance).setHideGroupMembers(value);
                return this;
            }

            public Builder clearHideGroupMembers() {
                copyOnWrite();
                ((Group_data) this.instance).clearHideGroupMembers();
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public long getAutoDeleteMessage() {
                return ((Group_data) this.instance).getAutoDeleteMessage();
            }

            public Builder setAutoDeleteMessage(long value) {
                copyOnWrite();
                ((Group_data) this.instance).setAutoDeleteMessage(value);
                return this;
            }

            public Builder clearAutoDeleteMessage() {
                copyOnWrite();
                ((Group_data) this.instance).clearAutoDeleteMessage();
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.info.Group_dataOrBuilder
            public long getDenyMembersUploadToGroupDisk() {
                return ((Group_data) this.instance).getDenyMembersUploadToGroupDisk();
            }

            public Builder setDenyMembersUploadToGroupDisk(long value) {
                copyOnWrite();
                ((Group_data) this.instance).setDenyMembersUploadToGroupDisk(value);
                return this;
            }

            public Builder clearDenyMembersUploadToGroupDisk() {
                copyOnWrite();
                ((Group_data) this.instance).clearDenyMembersUploadToGroupDisk();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new Group_data();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"groupId_", "name_", "avatarUrl_", "avatarId_", "introduction_", "member_", "createBy_", "directJoin_", "permissonLevel_", "historyMsg_", "categoryName_", "categoryId_", "private_", "doNotDisturb_", "communityId_", "communityName_", "top_", "admin_", "limitedMsgType_", "owner_", "recommandation_", "tagOld_", "tag_", Tag.class, "myGroupNickname_", "groupCode_", "hideGroupMembers_", "autoDeleteMessage_", "denyMembersUploadToGroupDisk_"};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u001c\u0000\u0000\u0001!\u001c\u0000\u0003\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0002\u0005\u0208\u0006\u0002\u0007\u0208\b\u0004\t\u0004\n\u0004\u000b\u0208\f\u0002\r\u0004\u000e\u0004\u000f\u0002\u0010\u0208\u0013\u0004\u0014\u021a\u0016\u0208\u0017\u0208\u0018\u0004\u001a\u021a\u001b\u001b\u001c\u0208\u001d\u0208\u001e\u0003 \u0002!\u0003", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<Group_data> parser = PARSER;
                    if (parser == null) {
                        synchronized (Group_data.class) {
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
            Group_data defaultInstance = new Group_data();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(Group_data.class, defaultInstance);
        }

        public static Group_data getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Group_data> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    @Override // com.yhchat.canarys.proto.group.infoOrBuilder
    public boolean hasStatus() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.yhchat.canarys.proto.group.infoOrBuilder
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

    @Override // com.yhchat.canarys.proto.group.infoOrBuilder
    public boolean hasData() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.yhchat.canarys.proto.group.infoOrBuilder
    public Group_data getData() {
        return this.data_ == null ? Group_data.getDefaultInstance() : this.data_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setData(Group_data value) {
        value.getClass();
        this.data_ = value;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeData(Group_data value) {
        value.getClass();
        if (this.data_ != null && this.data_ != Group_data.getDefaultInstance()) {
            this.data_ = Group_data.newBuilder(this.data_).mergeFrom((Group_data.Builder) value).buildPartial();
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

    @Override // com.yhchat.canarys.proto.group.infoOrBuilder
    public List<Bot_data> getHistoryBotList() {
        return this.historyBot_;
    }

    public List<? extends Bot_dataOrBuilder> getHistoryBotOrBuilderList() {
        return this.historyBot_;
    }

    @Override // com.yhchat.canarys.proto.group.infoOrBuilder
    public int getHistoryBotCount() {
        return this.historyBot_.size();
    }

    @Override // com.yhchat.canarys.proto.group.infoOrBuilder
    public Bot_data getHistoryBot(int index) {
        return this.historyBot_.get(index);
    }

    public Bot_dataOrBuilder getHistoryBotOrBuilder(int index) {
        return this.historyBot_.get(index);
    }

    private void ensureHistoryBotIsMutable() {
        Internal.ProtobufList<Bot_data> tmp = this.historyBot_;
        if (!tmp.isModifiable()) {
            this.historyBot_ = GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHistoryBot(int index, Bot_data value) {
        value.getClass();
        ensureHistoryBotIsMutable();
        this.historyBot_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addHistoryBot(Bot_data value) {
        value.getClass();
        ensureHistoryBotIsMutable();
        this.historyBot_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addHistoryBot(int index, Bot_data value) {
        value.getClass();
        ensureHistoryBotIsMutable();
        this.historyBot_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllHistoryBot(Iterable<? extends Bot_data> values) {
        ensureHistoryBotIsMutable();
        AbstractMessageLite.addAll(values, this.historyBot_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHistoryBot() {
        this.historyBot_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeHistoryBot(int index) {
        ensureHistoryBotIsMutable();
        this.historyBot_.remove(index);
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

        @Override // com.yhchat.canarys.proto.group.infoOrBuilder
        public boolean hasStatus() {
            return ((info) this.instance).hasStatus();
        }

        @Override // com.yhchat.canarys.proto.group.infoOrBuilder
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

        @Override // com.yhchat.canarys.proto.group.infoOrBuilder
        public boolean hasData() {
            return ((info) this.instance).hasData();
        }

        @Override // com.yhchat.canarys.proto.group.infoOrBuilder
        public Group_data getData() {
            return ((info) this.instance).getData();
        }

        public Builder setData(Group_data value) {
            copyOnWrite();
            ((info) this.instance).setData(value);
            return this;
        }

        public Builder setData(Group_data.Builder builderForValue) {
            copyOnWrite();
            ((info) this.instance).setData(builderForValue.build());
            return this;
        }

        public Builder mergeData(Group_data value) {
            copyOnWrite();
            ((info) this.instance).mergeData(value);
            return this;
        }

        public Builder clearData() {
            copyOnWrite();
            ((info) this.instance).clearData();
            return this;
        }

        @Override // com.yhchat.canarys.proto.group.infoOrBuilder
        public List<Bot_data> getHistoryBotList() {
            return Collections.unmodifiableList(((info) this.instance).getHistoryBotList());
        }

        @Override // com.yhchat.canarys.proto.group.infoOrBuilder
        public int getHistoryBotCount() {
            return ((info) this.instance).getHistoryBotCount();
        }

        @Override // com.yhchat.canarys.proto.group.infoOrBuilder
        public Bot_data getHistoryBot(int index) {
            return ((info) this.instance).getHistoryBot(index);
        }

        public Builder setHistoryBot(int index, Bot_data value) {
            copyOnWrite();
            ((info) this.instance).setHistoryBot(index, value);
            return this;
        }

        public Builder setHistoryBot(int index, Bot_data.Builder builderForValue) {
            copyOnWrite();
            ((info) this.instance).setHistoryBot(index, builderForValue.build());
            return this;
        }

        public Builder addHistoryBot(Bot_data value) {
            copyOnWrite();
            ((info) this.instance).addHistoryBot(value);
            return this;
        }

        public Builder addHistoryBot(int index, Bot_data value) {
            copyOnWrite();
            ((info) this.instance).addHistoryBot(index, value);
            return this;
        }

        public Builder addHistoryBot(Bot_data.Builder builderForValue) {
            copyOnWrite();
            ((info) this.instance).addHistoryBot(builderForValue.build());
            return this;
        }

        public Builder addHistoryBot(int index, Bot_data.Builder builderForValue) {
            copyOnWrite();
            ((info) this.instance).addHistoryBot(index, builderForValue.build());
            return this;
        }

        public Builder addAllHistoryBot(Iterable<? extends Bot_data> values) {
            copyOnWrite();
            ((info) this.instance).addAllHistoryBot(values);
            return this;
        }

        public Builder clearHistoryBot() {
            copyOnWrite();
            ((info) this.instance).clearHistoryBot();
            return this;
        }

        public Builder removeHistoryBot(int index) {
            copyOnWrite();
            ((info) this.instance).removeHistoryBot(index);
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
                Object[] objects = {"bitField0_", "status_", "data_", "historyBot_", Bot_data.class};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u001b", objects);
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
