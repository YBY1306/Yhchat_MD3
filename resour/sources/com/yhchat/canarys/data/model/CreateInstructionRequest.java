package com.yhchat.canarys.data.model;

import androidx.autofill.HintConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003JU\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\bH\u00d6\u0001J\t\u0010\"\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e\u00a8\u0006#"}, m169d2 = {"Lcom/yhchat/canarys/data/model/CreateInstructionRequest;", "", HintConstants.AUTOFILL_HINT_NAME, "", "desc", "hintText", "defaultText", "type", "", "botId", "customJson", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getDesc", "getHintText", "getDefaultText", "getType", "()I", "getBotId", "getCustomJson", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class CreateInstructionRequest {
    public static final int $stable = 0;

    @SerializedName("botId")
    private final String botId;

    @SerializedName("customJson")
    private final String customJson;

    @SerializedName("defaultText")
    private final String defaultText;

    @SerializedName("desc")
    private final String desc;

    @SerializedName("hintText")
    private final String hintText;

    @SerializedName(HintConstants.AUTOFILL_HINT_NAME)
    private final String name;

    @SerializedName("type")
    private final int type;

    public static /* synthetic */ CreateInstructionRequest copy$default(CreateInstructionRequest createInstructionRequest, String str, String str2, String str3, String str4, int i, String str5, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = createInstructionRequest.name;
        }
        if ((i2 & 2) != 0) {
            str2 = createInstructionRequest.desc;
        }
        if ((i2 & 4) != 0) {
            str3 = createInstructionRequest.hintText;
        }
        if ((i2 & 8) != 0) {
            str4 = createInstructionRequest.defaultText;
        }
        if ((i2 & 16) != 0) {
            i = createInstructionRequest.type;
        }
        if ((i2 & 32) != 0) {
            str5 = createInstructionRequest.botId;
        }
        if ((i2 & 64) != 0) {
            str6 = createInstructionRequest.customJson;
        }
        String str7 = str5;
        String str8 = str6;
        int i3 = i;
        String str9 = str3;
        return createInstructionRequest.copy(str, str2, str9, str4, i3, str7, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    /* renamed from: component3, reason: from getter */
    public final String getHintText() {
        return this.hintText;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDefaultText() {
        return this.defaultText;
    }

    /* renamed from: component5, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component6, reason: from getter */
    public final String getBotId() {
        return this.botId;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCustomJson() {
        return this.customJson;
    }

    public final CreateInstructionRequest copy(String name, String desc, String hintText, String defaultText, int type, String botId, String customJson) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(botId, "botId");
        return new CreateInstructionRequest(name, desc, hintText, defaultText, type, botId, customJson);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateInstructionRequest)) {
            return false;
        }
        CreateInstructionRequest createInstructionRequest = (CreateInstructionRequest) other;
        return Intrinsics.areEqual(this.name, createInstructionRequest.name) && Intrinsics.areEqual(this.desc, createInstructionRequest.desc) && Intrinsics.areEqual(this.hintText, createInstructionRequest.hintText) && Intrinsics.areEqual(this.defaultText, createInstructionRequest.defaultText) && this.type == createInstructionRequest.type && Intrinsics.areEqual(this.botId, createInstructionRequest.botId) && Intrinsics.areEqual(this.customJson, createInstructionRequest.customJson);
    }

    public int hashCode() {
        return (((((((((((this.name.hashCode() * 31) + this.desc.hashCode()) * 31) + (this.hintText == null ? 0 : this.hintText.hashCode())) * 31) + (this.defaultText == null ? 0 : this.defaultText.hashCode())) * 31) + Integer.hashCode(this.type)) * 31) + this.botId.hashCode()) * 31) + (this.customJson != null ? this.customJson.hashCode() : 0);
    }

    public String toString() {
        return "CreateInstructionRequest(name=" + this.name + ", desc=" + this.desc + ", hintText=" + this.hintText + ", defaultText=" + this.defaultText + ", type=" + this.type + ", botId=" + this.botId + ", customJson=" + this.customJson + ")";
    }

    public CreateInstructionRequest(String name, String desc, String hintText, String defaultText, int type, String botId, String customJson) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(botId, "botId");
        this.name = name;
        this.desc = desc;
        this.hintText = hintText;
        this.defaultText = defaultText;
        this.type = type;
        this.botId = botId;
        this.customJson = customJson;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CreateInstructionRequest(String str, String str2, String str3, String str4, int i, String str5, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str7;
        if ((i2 & 64) == 0) {
            str7 = str6;
        } else {
            str7 = null;
        }
        this(str, str2, str3, str4, i, str5, str7);
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

    public final String getBotId() {
        return this.botId;
    }

    public final String getCustomJson() {
        return this.customJson;
    }
}
