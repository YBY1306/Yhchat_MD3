package com.yhchat.canarys.data.model;

import androidx.autofill.HintConstants;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010(\u001a\u00020\rH\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\u007f\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u00d6\u0003J\t\u00100\u001a\u00020\u0003H\u00d6\u0001J\t\u00101\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013\u00a8\u00062"}, m169d2 = {"Lcom/yhchat/canarys/data/model/BotInstruction;", "Ljava/io/Serializable;", Name.MARK, "", "botId", "", HintConstants.AUTOFILL_HINT_NAME, "desc", "instructionType", "hintText", "defaultText", "customJson", "createTime", "", "sort", "hidden", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JII)V", "getId", "()I", "getBotId", "()Ljava/lang/String;", "getName", "getDesc", "getInstructionType", "getHintText", "getDefaultText", "getCustomJson", "getCreateTime", "()J", "getSort", "getHidden", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class BotInstruction implements Serializable {
    public static final int $stable = 0;

    @SerializedName("botId")
    private final String botId;

    @SerializedName("createTime")
    private final long createTime;

    @SerializedName("customJson")
    private final String customJson;

    @SerializedName("defaultText")
    private final String defaultText;

    @SerializedName("desc")
    private final String desc;

    @SerializedName("hidden")
    private final int hidden;

    @SerializedName("hintText")
    private final String hintText;

    @SerializedName(Name.MARK)
    private final int id;

    @SerializedName("instructionType")
    private final int instructionType;

    @SerializedName(HintConstants.AUTOFILL_HINT_NAME)
    private final String name;

    @SerializedName("sort")
    private final int sort;

    public static /* synthetic */ BotInstruction copy$default(BotInstruction botInstruction, int i, String str, String str2, String str3, int i2, String str4, String str5, String str6, long j, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = botInstruction.id;
        }
        if ((i5 & 2) != 0) {
            str = botInstruction.botId;
        }
        if ((i5 & 4) != 0) {
            str2 = botInstruction.name;
        }
        if ((i5 & 8) != 0) {
            str3 = botInstruction.desc;
        }
        if ((i5 & 16) != 0) {
            i2 = botInstruction.instructionType;
        }
        if ((i5 & 32) != 0) {
            str4 = botInstruction.hintText;
        }
        if ((i5 & 64) != 0) {
            str5 = botInstruction.defaultText;
        }
        if ((i5 & 128) != 0) {
            str6 = botInstruction.customJson;
        }
        if ((i5 & 256) != 0) {
            j = botInstruction.createTime;
        }
        if ((i5 & 512) != 0) {
            i3 = botInstruction.sort;
        }
        if ((i5 & 1024) != 0) {
            i4 = botInstruction.hidden;
        }
        long j2 = j;
        String str7 = str5;
        String str8 = str6;
        int i6 = i2;
        String str9 = str4;
        String str10 = str2;
        String str11 = str3;
        return botInstruction.copy(i, str, str10, str11, i6, str9, str7, str8, j2, i3, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final int getSort() {
        return this.sort;
    }

    /* renamed from: component11, reason: from getter */
    public final int getHidden() {
        return this.hidden;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBotId() {
        return this.botId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    /* renamed from: component5, reason: from getter */
    public final int getInstructionType() {
        return this.instructionType;
    }

    /* renamed from: component6, reason: from getter */
    public final String getHintText() {
        return this.hintText;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDefaultText() {
        return this.defaultText;
    }

    /* renamed from: component8, reason: from getter */
    public final String getCustomJson() {
        return this.customJson;
    }

    /* renamed from: component9, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    public final BotInstruction copy(int id, String botId, String name, String desc, int instructionType, String hintText, String defaultText, String customJson, long createTime, int sort, int hidden) {
        Intrinsics.checkNotNullParameter(botId, "botId");
        Intrinsics.checkNotNullParameter(name, "name");
        return new BotInstruction(id, botId, name, desc, instructionType, hintText, defaultText, customJson, createTime, sort, hidden);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BotInstruction)) {
            return false;
        }
        BotInstruction botInstruction = (BotInstruction) other;
        return this.id == botInstruction.id && Intrinsics.areEqual(this.botId, botInstruction.botId) && Intrinsics.areEqual(this.name, botInstruction.name) && Intrinsics.areEqual(this.desc, botInstruction.desc) && this.instructionType == botInstruction.instructionType && Intrinsics.areEqual(this.hintText, botInstruction.hintText) && Intrinsics.areEqual(this.defaultText, botInstruction.defaultText) && Intrinsics.areEqual(this.customJson, botInstruction.customJson) && this.createTime == botInstruction.createTime && this.sort == botInstruction.sort && this.hidden == botInstruction.hidden;
    }

    public int hashCode() {
        return (((((((((((((((((((Integer.hashCode(this.id) * 31) + this.botId.hashCode()) * 31) + this.name.hashCode()) * 31) + (this.desc == null ? 0 : this.desc.hashCode())) * 31) + Integer.hashCode(this.instructionType)) * 31) + (this.hintText == null ? 0 : this.hintText.hashCode())) * 31) + (this.defaultText == null ? 0 : this.defaultText.hashCode())) * 31) + (this.customJson != null ? this.customJson.hashCode() : 0)) * 31) + Long.hashCode(this.createTime)) * 31) + Integer.hashCode(this.sort)) * 31) + Integer.hashCode(this.hidden);
    }

    public String toString() {
        return "BotInstruction(id=" + this.id + ", botId=" + this.botId + ", name=" + this.name + ", desc=" + this.desc + ", instructionType=" + this.instructionType + ", hintText=" + this.hintText + ", defaultText=" + this.defaultText + ", customJson=" + this.customJson + ", createTime=" + this.createTime + ", sort=" + this.sort + ", hidden=" + this.hidden + ")";
    }

    public BotInstruction(int id, String botId, String name, String desc, int instructionType, String hintText, String defaultText, String customJson, long createTime, int sort, int hidden) {
        Intrinsics.checkNotNullParameter(botId, "botId");
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = id;
        this.botId = botId;
        this.name = name;
        this.desc = desc;
        this.instructionType = instructionType;
        this.hintText = hintText;
        this.defaultText = defaultText;
        this.customJson = customJson;
        this.createTime = createTime;
        this.sort = sort;
        this.hidden = hidden;
    }

    public final int getId() {
        return this.id;
    }

    public final String getBotId() {
        return this.botId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final int getInstructionType() {
        return this.instructionType;
    }

    public final String getHintText() {
        return this.hintText;
    }

    public final String getDefaultText() {
        return this.defaultText;
    }

    public final String getCustomJson() {
        return this.customJson;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final int getSort() {
        return this.sort;
    }

    public final int getHidden() {
        return this.hidden;
    }
}
