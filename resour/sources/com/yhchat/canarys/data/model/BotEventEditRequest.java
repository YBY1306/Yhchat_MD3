package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010!\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003Jx\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010)\u001a\u00020\u0005H\u00d6\u0001J\t\u0010*\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0016\u0010\u0012R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0017\u0010\u0012R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0019\u0010\u0012R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010\u00a8\u0006+"}, m169d2 = {"Lcom/yhchat/canarys/data/model/BotEventEditRequest;", "", "botId", "", "messageReceiveNormal", "", "messageReceiveInstruction", "botFollowed", "botUnfollowed", "groupJoin", "groupLeave", "botSetting", "typ", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getBotId", "()Ljava/lang/String;", "getMessageReceiveNormal", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMessageReceiveInstruction", "getBotFollowed", "getBotUnfollowed", "getGroupJoin", "getGroupLeave", "getBotSetting", "getTyp", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/yhchat/canarys/data/model/BotEventEditRequest;", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class BotEventEditRequest {
    public static final int $stable = 0;

    @SerializedName("botFollowed")
    private final Integer botFollowed;

    @SerializedName("botId")
    private final String botId;

    @SerializedName("botSetting")
    private final Integer botSetting;

    @SerializedName("botUnfollowed")
    private final Integer botUnfollowed;

    @SerializedName("groupJoin")
    private final Integer groupJoin;

    @SerializedName("groupLeave")
    private final Integer groupLeave;

    @SerializedName("messageReceiveInstruction")
    private final Integer messageReceiveInstruction;

    @SerializedName("messageReceiveNormal")
    private final Integer messageReceiveNormal;

    @SerializedName("typ")
    private final String typ;

    public static /* synthetic */ BotEventEditRequest copy$default(BotEventEditRequest botEventEditRequest, String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = botEventEditRequest.botId;
        }
        if ((i & 2) != 0) {
            num = botEventEditRequest.messageReceiveNormal;
        }
        if ((i & 4) != 0) {
            num2 = botEventEditRequest.messageReceiveInstruction;
        }
        if ((i & 8) != 0) {
            num3 = botEventEditRequest.botFollowed;
        }
        if ((i & 16) != 0) {
            num4 = botEventEditRequest.botUnfollowed;
        }
        if ((i & 32) != 0) {
            num5 = botEventEditRequest.groupJoin;
        }
        if ((i & 64) != 0) {
            num6 = botEventEditRequest.groupLeave;
        }
        if ((i & 128) != 0) {
            num7 = botEventEditRequest.botSetting;
        }
        if ((i & 256) != 0) {
            str2 = botEventEditRequest.typ;
        }
        Integer num8 = num7;
        String str3 = str2;
        Integer num9 = num5;
        Integer num10 = num6;
        Integer num11 = num4;
        Integer num12 = num2;
        return botEventEditRequest.copy(str, num, num12, num3, num11, num9, num10, num8, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBotId() {
        return this.botId;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getMessageReceiveNormal() {
        return this.messageReceiveNormal;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getMessageReceiveInstruction() {
        return this.messageReceiveInstruction;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getBotFollowed() {
        return this.botFollowed;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getBotUnfollowed() {
        return this.botUnfollowed;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getGroupJoin() {
        return this.groupJoin;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getGroupLeave() {
        return this.groupLeave;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getBotSetting() {
        return this.botSetting;
    }

    /* renamed from: component9, reason: from getter */
    public final String getTyp() {
        return this.typ;
    }

    public final BotEventEditRequest copy(String botId, Integer messageReceiveNormal, Integer messageReceiveInstruction, Integer botFollowed, Integer botUnfollowed, Integer groupJoin, Integer groupLeave, Integer botSetting, String typ) {
        Intrinsics.checkNotNullParameter(botId, "botId");
        return new BotEventEditRequest(botId, messageReceiveNormal, messageReceiveInstruction, botFollowed, botUnfollowed, groupJoin, groupLeave, botSetting, typ);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BotEventEditRequest)) {
            return false;
        }
        BotEventEditRequest botEventEditRequest = (BotEventEditRequest) other;
        return Intrinsics.areEqual(this.botId, botEventEditRequest.botId) && Intrinsics.areEqual(this.messageReceiveNormal, botEventEditRequest.messageReceiveNormal) && Intrinsics.areEqual(this.messageReceiveInstruction, botEventEditRequest.messageReceiveInstruction) && Intrinsics.areEqual(this.botFollowed, botEventEditRequest.botFollowed) && Intrinsics.areEqual(this.botUnfollowed, botEventEditRequest.botUnfollowed) && Intrinsics.areEqual(this.groupJoin, botEventEditRequest.groupJoin) && Intrinsics.areEqual(this.groupLeave, botEventEditRequest.groupLeave) && Intrinsics.areEqual(this.botSetting, botEventEditRequest.botSetting) && Intrinsics.areEqual(this.typ, botEventEditRequest.typ);
    }

    public int hashCode() {
        return (((((((((((((((this.botId.hashCode() * 31) + (this.messageReceiveNormal == null ? 0 : this.messageReceiveNormal.hashCode())) * 31) + (this.messageReceiveInstruction == null ? 0 : this.messageReceiveInstruction.hashCode())) * 31) + (this.botFollowed == null ? 0 : this.botFollowed.hashCode())) * 31) + (this.botUnfollowed == null ? 0 : this.botUnfollowed.hashCode())) * 31) + (this.groupJoin == null ? 0 : this.groupJoin.hashCode())) * 31) + (this.groupLeave == null ? 0 : this.groupLeave.hashCode())) * 31) + (this.botSetting == null ? 0 : this.botSetting.hashCode())) * 31) + (this.typ != null ? this.typ.hashCode() : 0);
    }

    public String toString() {
        return "BotEventEditRequest(botId=" + this.botId + ", messageReceiveNormal=" + this.messageReceiveNormal + ", messageReceiveInstruction=" + this.messageReceiveInstruction + ", botFollowed=" + this.botFollowed + ", botUnfollowed=" + this.botUnfollowed + ", groupJoin=" + this.groupJoin + ", groupLeave=" + this.groupLeave + ", botSetting=" + this.botSetting + ", typ=" + this.typ + ")";
    }

    public BotEventEditRequest(String botId, Integer messageReceiveNormal, Integer messageReceiveInstruction, Integer botFollowed, Integer botUnfollowed, Integer groupJoin, Integer groupLeave, Integer botSetting, String typ) {
        Intrinsics.checkNotNullParameter(botId, "botId");
        this.botId = botId;
        this.messageReceiveNormal = messageReceiveNormal;
        this.messageReceiveInstruction = messageReceiveInstruction;
        this.botFollowed = botFollowed;
        this.botUnfollowed = botUnfollowed;
        this.groupJoin = groupJoin;
        this.groupLeave = groupLeave;
        this.botSetting = botSetting;
        this.typ = typ;
    }

    public /* synthetic */ BotEventEditRequest(String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : num4, (i & 32) != 0 ? null : num5, (i & 64) != 0 ? null : num6, (i & 128) != 0 ? null : num7, (i & 256) != 0 ? null : str2);
    }

    public final String getBotId() {
        return this.botId;
    }

    public final Integer getMessageReceiveNormal() {
        return this.messageReceiveNormal;
    }

    public final Integer getMessageReceiveInstruction() {
        return this.messageReceiveInstruction;
    }

    public final Integer getBotFollowed() {
        return this.botFollowed;
    }

    public final Integer getBotUnfollowed() {
        return this.botUnfollowed;
    }

    public final Integer getGroupJoin() {
        return this.groupJoin;
    }

    public final Integer getGroupLeave() {
        return this.groupLeave;
    }

    public final Integer getBotSetting() {
        return this.botSetting;
    }

    public final String getTyp() {
        return this.typ;
    }
}
