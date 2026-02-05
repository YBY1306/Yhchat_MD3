package com.yhchat.canarys.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.yhchat.canarys.proto.Msg;
import com.yhchat.canarys.proto.Status;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class list_message_by_seq extends GeneratedMessageLite<list_message_by_seq, Builder> implements list_message_by_seqOrBuilder {
    private static final list_message_by_seq DEFAULT_INSTANCE;
    public static final int MSG_FIELD_NUMBER = 2;
    private static volatile Parser<list_message_by_seq> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int TOTAL_FIELD_NUMBER = 3;
    private int bitField0_;
    private Internal.ProtobufList<Msg> msg_ = emptyProtobufList();
    private Status status_;
    private int total_;

    private list_message_by_seq() {
    }

    @Override // com.yhchat.canarys.proto.list_message_by_seqOrBuilder
    public boolean hasStatus() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.yhchat.canarys.proto.list_message_by_seqOrBuilder
    public Status getStatus() {
        return this.status_ == null ? Status.getDefaultInstance() : this.status_;
    }

    public void setStatus(Status value) {
        value.getClass();
        this.status_ = value;
        this.bitField0_ |= 1;
    }

    public void mergeStatus(Status value) {
        value.getClass();
        if (this.status_ != null && this.status_ != Status.getDefaultInstance()) {
            this.status_ = Status.newBuilder(this.status_).mergeFrom((Status.Builder) value).buildPartial();
        } else {
            this.status_ = value;
        }
        this.bitField0_ |= 1;
    }

    public void clearStatus() {
        this.status_ = null;
        this.bitField0_ &= -2;
    }

    @Override // com.yhchat.canarys.proto.list_message_by_seqOrBuilder
    public List<Msg> getMsgList() {
        return this.msg_;
    }

    public List<? extends MsgOrBuilder> getMsgOrBuilderList() {
        return this.msg_;
    }

    @Override // com.yhchat.canarys.proto.list_message_by_seqOrBuilder
    public int getMsgCount() {
        return this.msg_.size();
    }

    @Override // com.yhchat.canarys.proto.list_message_by_seqOrBuilder
    public Msg getMsg(int index) {
        return this.msg_.get(index);
    }

    public MsgOrBuilder getMsgOrBuilder(int index) {
        return this.msg_.get(index);
    }

    private void ensureMsgIsMutable() {
        Internal.ProtobufList<Msg> tmp = this.msg_;
        if (!tmp.isModifiable()) {
            this.msg_ = GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    public void setMsg(int index, Msg value) {
        value.getClass();
        ensureMsgIsMutable();
        this.msg_.set(index, value);
    }

    public void addMsg(Msg value) {
        value.getClass();
        ensureMsgIsMutable();
        this.msg_.add(value);
    }

    public void addMsg(int index, Msg value) {
        value.getClass();
        ensureMsgIsMutable();
        this.msg_.add(index, value);
    }

    public void addAllMsg(Iterable<? extends Msg> values) {
        ensureMsgIsMutable();
        AbstractMessageLite.addAll(values, this.msg_);
    }

    public void clearMsg() {
        this.msg_ = emptyProtobufList();
    }

    public void removeMsg(int index) {
        ensureMsgIsMutable();
        this.msg_.remove(index);
    }

    @Override // com.yhchat.canarys.proto.list_message_by_seqOrBuilder
    public int getTotal() {
        return this.total_;
    }

    public void setTotal(int value) {
        this.total_ = value;
    }

    public void clearTotal() {
        this.total_ = 0;
    }

    public static list_message_by_seq parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (list_message_by_seq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static list_message_by_seq parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (list_message_by_seq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static list_message_by_seq parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (list_message_by_seq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static list_message_by_seq parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (list_message_by_seq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static list_message_by_seq parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (list_message_by_seq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static list_message_by_seq parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (list_message_by_seq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static list_message_by_seq parseFrom(InputStream input) throws IOException {
        return (list_message_by_seq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static list_message_by_seq parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (list_message_by_seq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static list_message_by_seq parseDelimitedFrom(InputStream input) throws IOException {
        return (list_message_by_seq) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static list_message_by_seq parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (list_message_by_seq) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static list_message_by_seq parseFrom(CodedInputStream input) throws IOException {
        return (list_message_by_seq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static list_message_by_seq parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (list_message_by_seq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(list_message_by_seq prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<list_message_by_seq, Builder> implements list_message_by_seqOrBuilder {
        /* synthetic */ Builder(list_message_by_seqIA list_message_by_seqia) {
            this();
        }

        private Builder() {
            super(list_message_by_seq.DEFAULT_INSTANCE);
        }

        @Override // com.yhchat.canarys.proto.list_message_by_seqOrBuilder
        public boolean hasStatus() {
            return ((list_message_by_seq) this.instance).hasStatus();
        }

        @Override // com.yhchat.canarys.proto.list_message_by_seqOrBuilder
        public Status getStatus() {
            return ((list_message_by_seq) this.instance).getStatus();
        }

        public Builder setStatus(Status value) {
            copyOnWrite();
            ((list_message_by_seq) this.instance).setStatus(value);
            return this;
        }

        public Builder setStatus(Status.Builder builderForValue) {
            copyOnWrite();
            ((list_message_by_seq) this.instance).setStatus(builderForValue.build());
            return this;
        }

        public Builder mergeStatus(Status value) {
            copyOnWrite();
            ((list_message_by_seq) this.instance).mergeStatus(value);
            return this;
        }

        public Builder clearStatus() {
            copyOnWrite();
            ((list_message_by_seq) this.instance).clearStatus();
            return this;
        }

        @Override // com.yhchat.canarys.proto.list_message_by_seqOrBuilder
        public List<Msg> getMsgList() {
            return Collections.unmodifiableList(((list_message_by_seq) this.instance).getMsgList());
        }

        @Override // com.yhchat.canarys.proto.list_message_by_seqOrBuilder
        public int getMsgCount() {
            return ((list_message_by_seq) this.instance).getMsgCount();
        }

        @Override // com.yhchat.canarys.proto.list_message_by_seqOrBuilder
        public Msg getMsg(int index) {
            return ((list_message_by_seq) this.instance).getMsg(index);
        }

        public Builder setMsg(int index, Msg value) {
            copyOnWrite();
            ((list_message_by_seq) this.instance).setMsg(index, value);
            return this;
        }

        public Builder setMsg(int index, Msg.Builder builderForValue) {
            copyOnWrite();
            ((list_message_by_seq) this.instance).setMsg(index, builderForValue.build());
            return this;
        }

        public Builder addMsg(Msg value) {
            copyOnWrite();
            ((list_message_by_seq) this.instance).addMsg(value);
            return this;
        }

        public Builder addMsg(int index, Msg value) {
            copyOnWrite();
            ((list_message_by_seq) this.instance).addMsg(index, value);
            return this;
        }

        public Builder addMsg(Msg.Builder builderForValue) {
            copyOnWrite();
            ((list_message_by_seq) this.instance).addMsg(builderForValue.build());
            return this;
        }

        public Builder addMsg(int index, Msg.Builder builderForValue) {
            copyOnWrite();
            ((list_message_by_seq) this.instance).addMsg(index, builderForValue.build());
            return this;
        }

        public Builder addAllMsg(Iterable<? extends Msg> values) {
            copyOnWrite();
            ((list_message_by_seq) this.instance).addAllMsg(values);
            return this;
        }

        public Builder clearMsg() {
            copyOnWrite();
            ((list_message_by_seq) this.instance).clearMsg();
            return this;
        }

        public Builder removeMsg(int index) {
            copyOnWrite();
            ((list_message_by_seq) this.instance).removeMsg(index);
            return this;
        }

        @Override // com.yhchat.canarys.proto.list_message_by_seqOrBuilder
        public int getTotal() {
            return ((list_message_by_seq) this.instance).getTotal();
        }

        public Builder setTotal(int value) {
            copyOnWrite();
            ((list_message_by_seq) this.instance).setTotal(value);
            return this;
        }

        public Builder clearTotal() {
            copyOnWrite();
            ((list_message_by_seq) this.instance).clearTotal();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new list_message_by_seq();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"bitField0_", "status_", "msg_", Msg.class, "total_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u1009\u0000\u0002\u001b\u0003\u0004", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<list_message_by_seq> parser = PARSER;
                if (parser == null) {
                    synchronized (list_message_by_seq.class) {
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
        list_message_by_seq defaultInstance = new list_message_by_seq();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(list_message_by_seq.class, defaultInstance);
    }

    public static list_message_by_seq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<list_message_by_seq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
