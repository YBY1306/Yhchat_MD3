package com.yhchat.canarys.proto.group;

import com.yhchat.canarys.proto.group.tag_member_send;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: tag_member_sendKt.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\b\nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u000e"}, m169d2 = {"Lcom/yhchat/canarys/proto/group/tag_member_sendKt;", "", "<init>", "()V", "data", "Lcom/yhchat/canarys/proto/group/tag_member_send$Data;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/group/tag_member_sendKt$DataKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializedata", "Dsl", "DataKt", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes3.dex */
public final class tag_member_sendKt {
    public static final int $stable = 0;
    public static final tag_member_sendKt INSTANCE = new tag_member_sendKt();

    /* compiled from: tag_member_sendKt.kt */
    @Metadata(m168d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u001c\u001a\u00020\u0010J\u0006\u0010#\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u0004\u0018\u00010\t*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00168G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u001d8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u00a8\u0006%"}, m169d2 = {"Lcom/yhchat/canarys/proto/group/tag_member_sendKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/group/tag_member_send$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/group/tag_member_send$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/group/tag_member_send;", "value", "Lcom/yhchat/canarys/proto/group/tag_member_send$Data;", "data", "getData", "()Lcom/yhchat/canarys/proto/group/tag_member_send$Data;", "setData", "(Lcom/yhchat/canarys/proto/group/tag_member_send$Data;)V", "clearData", "", "hasData", "", "dataOrNull", "getDataOrNull", "(Lcom/yhchat/canarys/proto/group/tag_member_sendKt$Dsl;)Lcom/yhchat/canarys/proto/group/tag_member_send$Data;", "", "groupId", "getGroupId", "()Ljava/lang/String;", "setGroupId", "(Ljava/lang/String;)V", "clearGroupId", "", "tagId", "getTagId", "()J", "setTagId", "(J)V", "clearTagId", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Dsl {
        private final tag_member_send.Builder _builder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Dsl(tag_member_send.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(tag_member_send.Builder _builder) {
            this._builder = _builder;
        }

        /* compiled from: tag_member_sendKt.kt */
        @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/group/tag_member_sendKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/group/tag_member_sendKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/group/tag_member_send$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(tag_member_send.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ tag_member_send _build() {
            tag_member_send tag_member_sendVarBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(tag_member_sendVarBuild, "build(...)");
            return tag_member_sendVarBuild;
        }

        public final tag_member_send.Data getData() {
            tag_member_send.Data data = this._builder.getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            return data;
        }

        public final void setData(tag_member_send.Data value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setData(value);
        }

        public final void clearData() {
            this._builder.clearData();
        }

        public final boolean hasData() {
            return this._builder.hasData();
        }

        public final tag_member_send.Data getDataOrNull(Dsl $this$dataOrNull) {
            Intrinsics.checkNotNullParameter($this$dataOrNull, "<this>");
            return Tag_member_sendKtKt.getDataOrNull($this$dataOrNull._builder);
        }

        public final String getGroupId() {
            String groupId = this._builder.getGroupId();
            Intrinsics.checkNotNullExpressionValue(groupId, "getGroupId(...)");
            return groupId;
        }

        public final void setGroupId(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setGroupId(value);
        }

        public final void clearGroupId() {
            this._builder.clearGroupId();
        }

        public final long getTagId() {
            return this._builder.getTagId();
        }

        public final void setTagId(long value) {
            this._builder.setTagId(value);
        }

        public final void clearTagId() {
            this._builder.clearTagId();
        }
    }

    private tag_member_sendKt() {
    }

    /* renamed from: -initializedata, reason: not valid java name */
    public final tag_member_send.Data m9858initializedata(Function1<? super DataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        DataKt.Dsl.Companion companion = DataKt.Dsl.INSTANCE;
        tag_member_send.Data.Builder builderNewBuilder = tag_member_send.Data.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        DataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: tag_member_sendKt.kt */
    @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/group/tag_member_sendKt$DataKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class DataKt {
        public static final int $stable = 0;
        public static final DataKt INSTANCE = new DataKt();

        /* compiled from: tag_member_sendKt.kt */
        @Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000e\u00a8\u0006\u0016"}, m169d2 = {"Lcom/yhchat/canarys/proto/group/tag_member_sendKt$DataKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/group/tag_member_send$Data$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/group/tag_member_send$Data$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/group/tag_member_send$Data;", "value", "", "size", "getSize", "()I", "setSize", "(I)V", "clearSize", "", "page", "getPage", "setPage", "clearPage", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Dsl {
            private final tag_member_send.Data.Builder _builder;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final int $stable = 8;

            public /* synthetic */ Dsl(tag_member_send.Data.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(tag_member_send.Data.Builder _builder) {
                this._builder = _builder;
            }

            /* compiled from: tag_member_sendKt.kt */
            @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/group/tag_member_sendKt$DataKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/group/tag_member_sendKt$DataKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/group/tag_member_send$Data$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ Dsl _create(tag_member_send.Data.Builder builder) {
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public final /* synthetic */ tag_member_send.Data _build() {
                tag_member_send.Data dataBuild = this._builder.build();
                Intrinsics.checkNotNullExpressionValue(dataBuild, "build(...)");
                return dataBuild;
            }

            public final int getSize() {
                return this._builder.getSize();
            }

            public final void setSize(int value) {
                this._builder.setSize(value);
            }

            public final void clearSize() {
                this._builder.clearSize();
            }

            public final int getPage() {
                return this._builder.getPage();
            }

            public final void setPage(int value) {
                this._builder.setPage(value);
            }

            public final void clearPage() {
                this._builder.clearPage();
            }
        }

        private DataKt() {
        }
    }
}
