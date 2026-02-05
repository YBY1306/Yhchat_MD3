package com.yhchat.canarys.data.model;

import androidx.autofill.HintConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJr\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010*\u001a\u00020\u0003H\u00d6\u0001J\t\u0010+\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006,"}, m169d2 = {"Lcom/yhchat/canarys/data/model/EditInstructionRequest;", "", Name.MARK, "", "botId", "", HintConstants.AUTOFILL_HINT_NAME, "desc", "hintText", "defaultText", "type", "customJson", "delFlag", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;)V", "getId", "()I", "getBotId", "()Ljava/lang/String;", "getName", "getDesc", "getHintText", "getDefaultText", "getType", "getCustomJson", "getDelFlag", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;)Lcom/yhchat/canarys/data/model/EditInstructionRequest;", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class EditInstructionRequest {
    public static final int $stable = 0;

    @SerializedName("botId")
    private final String botId;

    @SerializedName("customJson")
    private final String customJson;

    @SerializedName("defaultText")
    private final String defaultText;

    @SerializedName("delFlag")
    private final Integer delFlag;

    @SerializedName("desc")
    private final String desc;

    @SerializedName("hintText")
    private final String hintText;

    @SerializedName(Name.MARK)
    private final int id;

    @SerializedName(HintConstants.AUTOFILL_HINT_NAME)
    private final String name;

    @SerializedName("type")
    private final int type;

    public static /* synthetic */ EditInstructionRequest copy$default(EditInstructionRequest editInstructionRequest, int i, String str, String str2, String str3, String str4, String str5, int i2, String str6, Integer num, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = editInstructionRequest.id;
        }
        if ((i3 & 2) != 0) {
            str = editInstructionRequest.botId;
        }
        if ((i3 & 4) != 0) {
            str2 = editInstructionRequest.name;
        }
        if ((i3 & 8) != 0) {
            str3 = editInstructionRequest.desc;
        }
        if ((i3 & 16) != 0) {
            str4 = editInstructionRequest.hintText;
        }
        if ((i3 & 32) != 0) {
            str5 = editInstructionRequest.defaultText;
        }
        if ((i3 & 64) != 0) {
            i2 = editInstructionRequest.type;
        }
        if ((i3 & 128) != 0) {
            str6 = editInstructionRequest.customJson;
        }
        if ((i3 & 256) != 0) {
            num = editInstructionRequest.delFlag;
        }
        String str7 = str6;
        Integer num2 = num;
        String str8 = str5;
        int i4 = i2;
        String str9 = str4;
        String str10 = str2;
        return editInstructionRequest.copy(i, str, str10, str3, str9, str8, i4, str7, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
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
    public final String getHintText() {
        return this.hintText;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDefaultText() {
        return this.defaultText;
    }

    /* renamed from: component7, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component8, reason: from getter */
    public final String getCustomJson() {
        return this.customJson;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getDelFlag() {
        return this.delFlag;
    }

    public final EditInstructionRequest copy(int id, String botId, String name, String desc, String hintText, String defaultText, int type, String customJson, Integer delFlag) {
        Intrinsics.checkNotNullParameter(botId, "botId");
        Intrinsics.checkNotNullParameter(name, "name");
        return new EditInstructionRequest(id, botId, name, desc, hintText, defaultText, type, customJson, delFlag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EditInstructionRequest)) {
            return false;
        }
        EditInstructionRequest editInstructionRequest = (EditInstructionRequest) other;
        return this.id == editInstructionRequest.id && Intrinsics.areEqual(this.botId, editInstructionRequest.botId) && Intrinsics.areEqual(this.name, editInstructionRequest.name) && Intrinsics.areEqual(this.desc, editInstructionRequest.desc) && Intrinsics.areEqual(this.hintText, editInstructionRequest.hintText) && Intrinsics.areEqual(this.defaultText, editInstructionRequest.defaultText) && this.type == editInstructionRequest.type && Intrinsics.areEqual(this.customJson, editInstructionRequest.customJson) && Intrinsics.areEqual(this.delFlag, editInstructionRequest.delFlag);
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.id) * 31) + this.botId.hashCode()) * 31) + this.name.hashCode()) * 31) + (this.desc == null ? 0 : this.desc.hashCode())) * 31) + (this.hintText == null ? 0 : this.hintText.hashCode())) * 31) + (this.defaultText == null ? 0 : this.defaultText.hashCode())) * 31) + Integer.hashCode(this.type)) * 31) + (this.customJson == null ? 0 : this.customJson.hashCode())) * 31) + (this.delFlag != null ? this.delFlag.hashCode() : 0);
    }

    public String toString() {
        return "EditInstructionRequest(id=" + this.id + ", botId=" + this.botId + ", name=" + this.name + ", desc=" + this.desc + ", hintText=" + this.hintText + ", defaultText=" + this.defaultText + ", type=" + this.type + ", customJson=" + this.customJson + ", delFlag=" + this.delFlag + ")";
    }

    public EditInstructionRequest(int id, String botId, String name, String desc, String hintText, String defaultText, int type, String customJson, Integer delFlag) {
        Intrinsics.checkNotNullParameter(botId, "botId");
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = id;
        this.botId = botId;
        this.name = name;
        this.desc = desc;
        this.hintText = hintText;
        this.defaultText = defaultText;
        this.type = type;
        this.customJson = customJson;
        this.delFlag = delFlag;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EditInstructionRequest(int i, String str, String str2, String str3, String str4, String str5, int i2, String str6, Integer num, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        Integer num2;
        str6 = (i3 & 128) != 0 ? null : str6;
        if ((i3 & 256) == 0) {
            num2 = num;
        } else {
            num2 = null;
        }
        this(i, str, str2, str3, str4, str5, i2, str6, num2);
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

    public final String getHintText() {
        return this.hintText;
    }

    public final String getDefaultText() {
        return this.defaultText;
    }

    public final int getType() {
        return this.type;
    }

    public final String getCustomJson() {
        return this.customJson;
    }

    public final Integer getDelFlag() {
        return this.delFlag;
    }
}
