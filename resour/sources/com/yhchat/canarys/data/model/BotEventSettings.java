package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003Jm\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010*\u001a\u00020\u0003H\u00d6\u0001J\t\u0010+\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011\u00a8\u0006,"}, m169d2 = {"Lcom/yhchat/canarys/data/model/BotEventSettings;", "", Name.MARK, "", "botId", "", "messageReceiveNormal", "messageReceiveInstruction", "botFollowed", "botUnfollowed", "groupJoin", "groupLeave", "botSetting", "delFlag", "<init>", "(ILjava/lang/String;IIIIIIII)V", "getId", "()I", "getBotId", "()Ljava/lang/String;", "getMessageReceiveNormal", "getMessageReceiveInstruction", "getBotFollowed", "getBotUnfollowed", "getGroupJoin", "getGroupLeave", "getBotSetting", "getDelFlag", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class BotEventSettings {
    public static final int $stable = 0;

    @SerializedName("botFollowed")
    private final int botFollowed;

    @SerializedName("botId")
    private final String botId;

    @SerializedName("botSetting")
    private final int botSetting;

    @SerializedName("botUnfollowed")
    private final int botUnfollowed;

    @SerializedName("del_flag")
    private final int delFlag;

    @SerializedName("groupJoin")
    private final int groupJoin;

    @SerializedName("groupLeave")
    private final int groupLeave;

    @SerializedName(Name.MARK)
    private final int id;

    @SerializedName("messageReceiveInstruction")
    private final int messageReceiveInstruction;

    @SerializedName("messageReceiveNormal")
    private final int messageReceiveNormal;

    public static /* synthetic */ BotEventSettings copy$default(BotEventSettings botEventSettings, int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = botEventSettings.id;
        }
        if ((i10 & 2) != 0) {
            str = botEventSettings.botId;
        }
        if ((i10 & 4) != 0) {
            i2 = botEventSettings.messageReceiveNormal;
        }
        if ((i10 & 8) != 0) {
            i3 = botEventSettings.messageReceiveInstruction;
        }
        if ((i10 & 16) != 0) {
            i4 = botEventSettings.botFollowed;
        }
        if ((i10 & 32) != 0) {
            i5 = botEventSettings.botUnfollowed;
        }
        if ((i10 & 64) != 0) {
            i6 = botEventSettings.groupJoin;
        }
        if ((i10 & 128) != 0) {
            i7 = botEventSettings.groupLeave;
        }
        if ((i10 & 256) != 0) {
            i8 = botEventSettings.botSetting;
        }
        if ((i10 & 512) != 0) {
            i9 = botEventSettings.delFlag;
        }
        int i11 = i8;
        int i12 = i9;
        int i13 = i6;
        int i14 = i7;
        int i15 = i4;
        int i16 = i5;
        return botEventSettings.copy(i, str, i2, i3, i15, i16, i13, i14, i11, i12);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final int getDelFlag() {
        return this.delFlag;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBotId() {
        return this.botId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMessageReceiveNormal() {
        return this.messageReceiveNormal;
    }

    /* renamed from: component4, reason: from getter */
    public final int getMessageReceiveInstruction() {
        return this.messageReceiveInstruction;
    }

    /* renamed from: component5, reason: from getter */
    public final int getBotFollowed() {
        return this.botFollowed;
    }

    /* renamed from: component6, reason: from getter */
    public final int getBotUnfollowed() {
        return this.botUnfollowed;
    }

    /* renamed from: component7, reason: from getter */
    public final int getGroupJoin() {
        return this.groupJoin;
    }

    /* renamed from: component8, reason: from getter */
    public final int getGroupLeave() {
        return this.groupLeave;
    }

    /* renamed from: component9, reason: from getter */
    public final int getBotSetting() {
        return this.botSetting;
    }

    public final BotEventSettings copy(int id, String botId, int messageReceiveNormal, int messageReceiveInstruction, int botFollowed, int botUnfollowed, int groupJoin, int groupLeave, int botSetting, int delFlag) {
        Intrinsics.checkNotNullParameter(botId, "botId");
        return new BotEventSettings(id, botId, messageReceiveNormal, messageReceiveInstruction, botFollowed, botUnfollowed, groupJoin, groupLeave, botSetting, delFlag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BotEventSettings)) {
            return false;
        }
        BotEventSettings botEventSettings = (BotEventSettings) other;
        return this.id == botEventSettings.id && Intrinsics.areEqual(this.botId, botEventSettings.botId) && this.messageReceiveNormal == botEventSettings.messageReceiveNormal && this.messageReceiveInstruction == botEventSettings.messageReceiveInstruction && this.botFollowed == botEventSettings.botFollowed && this.botUnfollowed == botEventSettings.botUnfollowed && this.groupJoin == botEventSettings.groupJoin && this.groupLeave == botEventSettings.groupLeave && this.botSetting == botEventSettings.botSetting && this.delFlag == botEventSettings.delFlag;
    }

    public int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.id) * 31) + this.botId.hashCode()) * 31) + Integer.hashCode(this.messageReceiveNormal)) * 31) + Integer.hashCode(this.messageReceiveInstruction)) * 31) + Integer.hashCode(this.botFollowed)) * 31) + Integer.hashCode(this.botUnfollowed)) * 31) + Integer.hashCode(this.groupJoin)) * 31) + Integer.hashCode(this.groupLeave)) * 31) + Integer.hashCode(this.botSetting)) * 31) + Integer.hashCode(this.delFlag);
    }

    public String toString() {
        return "BotEventSettings(id=" + this.id + ", botId=" + this.botId + ", messageReceiveNormal=" + this.messageReceiveNormal + ", messageReceiveInstruction=" + this.messageReceiveInstruction + ", botFollowed=" + this.botFollowed + ", botUnfollowed=" + this.botUnfollowed + ", groupJoin=" + this.groupJoin + ", groupLeave=" + this.groupLeave + ", botSetting=" + this.botSetting + ", delFlag=" + this.delFlag + ")";
    }

    public BotEventSettings(int id, String botId, int messageReceiveNormal, int messageReceiveInstruction, int botFollowed, int botUnfollowed, int groupJoin, int groupLeave, int botSetting, int delFlag) {
        Intrinsics.checkNotNullParameter(botId, "botId");
        this.id = id;
        this.botId = botId;
        this.messageReceiveNormal = messageReceiveNormal;
        this.messageReceiveInstruction = messageReceiveInstruction;
        this.botFollowed = botFollowed;
        this.botUnfollowed = botUnfollowed;
        this.groupJoin = groupJoin;
        this.groupLeave = groupLeave;
        this.botSetting = botSetting;
        this.delFlag = delFlag;
    }

    public final int getId() {
        return this.id;
    }

    public final String getBotId() {
        return this.botId;
    }

    public final int getMessageReceiveNormal() {
        return this.messageReceiveNormal;
    }

    public final int getMessageReceiveInstruction() {
        return this.messageReceiveInstruction;
    }

    public final int getBotFollowed() {
        return this.botFollowed;
    }

    public final int getBotUnfollowed() {
        return this.botUnfollowed;
    }

    public final int getGroupJoin() {
        return this.groupJoin;
    }

    public final int getGroupLeave() {
        return this.groupLeave;
    }

    public final int getBotSetting() {
        return this.botSetting;
    }

    public final int getDelFlag() {
        return this.delFlag;
    }
}
