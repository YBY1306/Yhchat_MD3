package com.yhchat.canarys.data.model;

import androidx.autofill.HintConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\bH\u00c6\u0003J\t\u0010%\u001a\u00020\nH\u00c6\u0003J\t\u0010&\u001a\u00020\nH\u00c6\u0003J\t\u0010'\u001a\u00020\nH\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003Jw\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010/\u001a\u00020\nH\u00d6\u0001J\t\u00100\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013\u00a8\u00061"}, m169d2 = {"Lcom/yhchat/canarys/data/model/Instruction;", "", "botId", "", "botName", HintConstants.AUTOFILL_HINT_NAME, "desc", Name.MARK, "", "sort", "", "auth", "type", "hintText", "defaultText", "form", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBotId", "()Ljava/lang/String;", "getBotName", "getName", "getDesc", "getId", "()J", "getSort", "()I", "getAuth", "getType", "getHintText", "getDefaultText", "getForm", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class Instruction {
    public static final int $stable = 0;

    @SerializedName("auth")
    private final int auth;

    @SerializedName("botId")
    private final String botId;

    @SerializedName("botName")
    private final String botName;
    private final String defaultText;

    @SerializedName("desc")
    private final String desc;
    private final String form;
    private final String hintText;

    @SerializedName(Name.MARK)
    private final long id;

    @SerializedName(HintConstants.AUTOFILL_HINT_NAME)
    private final String name;

    @SerializedName("sort")
    private final int sort;
    private final int type;

    public static /* synthetic */ Instruction copy$default(Instruction instruction, String str, String str2, String str3, String str4, long j, int i, int i2, int i3, String str5, String str6, String str7, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = instruction.botId;
        }
        if ((i4 & 2) != 0) {
            str2 = instruction.botName;
        }
        if ((i4 & 4) != 0) {
            str3 = instruction.name;
        }
        if ((i4 & 8) != 0) {
            str4 = instruction.desc;
        }
        if ((i4 & 16) != 0) {
            j = instruction.id;
        }
        if ((i4 & 32) != 0) {
            i = instruction.sort;
        }
        if ((i4 & 64) != 0) {
            i2 = instruction.auth;
        }
        if ((i4 & 128) != 0) {
            i3 = instruction.type;
        }
        if ((i4 & 256) != 0) {
            str5 = instruction.hintText;
        }
        if ((i4 & 512) != 0) {
            str6 = instruction.defaultText;
        }
        if ((i4 & 1024) != 0) {
            str7 = instruction.form;
        }
        String str8 = str6;
        String str9 = str7;
        long j2 = j;
        String str10 = str3;
        String str11 = str4;
        return instruction.copy(str, str2, str10, str11, j2, i, i2, i3, str5, str8, str9);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBotId() {
        return this.botId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getDefaultText() {
        return this.defaultText;
    }

    /* renamed from: component11, reason: from getter */
    public final String getForm() {
        return this.form;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBotName() {
        return this.botName;
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
    public final long getId() {
        return this.id;
    }

    /* renamed from: component6, reason: from getter */
    public final int getSort() {
        return this.sort;
    }

    /* renamed from: component7, reason: from getter */
    public final int getAuth() {
        return this.auth;
    }

    /* renamed from: component8, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component9, reason: from getter */
    public final String getHintText() {
        return this.hintText;
    }

    public final Instruction copy(String botId, String botName, String name, String desc, long id, int sort, int auth, int type, String hintText, String defaultText, String form) {
        Intrinsics.checkNotNullParameter(botId, "botId");
        Intrinsics.checkNotNullParameter(botName, "botName");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(hintText, "hintText");
        Intrinsics.checkNotNullParameter(defaultText, "defaultText");
        Intrinsics.checkNotNullParameter(form, "form");
        return new Instruction(botId, botName, name, desc, id, sort, auth, type, hintText, defaultText, form);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Instruction)) {
            return false;
        }
        Instruction instruction = (Instruction) other;
        return Intrinsics.areEqual(this.botId, instruction.botId) && Intrinsics.areEqual(this.botName, instruction.botName) && Intrinsics.areEqual(this.name, instruction.name) && Intrinsics.areEqual(this.desc, instruction.desc) && this.id == instruction.id && this.sort == instruction.sort && this.auth == instruction.auth && this.type == instruction.type && Intrinsics.areEqual(this.hintText, instruction.hintText) && Intrinsics.areEqual(this.defaultText, instruction.defaultText) && Intrinsics.areEqual(this.form, instruction.form);
    }

    public int hashCode() {
        return (((((((((((((((((((this.botId.hashCode() * 31) + this.botName.hashCode()) * 31) + this.name.hashCode()) * 31) + this.desc.hashCode()) * 31) + Long.hashCode(this.id)) * 31) + Integer.hashCode(this.sort)) * 31) + Integer.hashCode(this.auth)) * 31) + Integer.hashCode(this.type)) * 31) + this.hintText.hashCode()) * 31) + this.defaultText.hashCode()) * 31) + this.form.hashCode();
    }

    public String toString() {
        return "Instruction(botId=" + this.botId + ", botName=" + this.botName + ", name=" + this.name + ", desc=" + this.desc + ", id=" + this.id + ", sort=" + this.sort + ", auth=" + this.auth + ", type=" + this.type + ", hintText=" + this.hintText + ", defaultText=" + this.defaultText + ", form=" + this.form + ")";
    }

    public Instruction(String botId, String botName, String name, String desc, long id, int sort, int auth, int type, String hintText, String defaultText, String form) {
        Intrinsics.checkNotNullParameter(botId, "botId");
        Intrinsics.checkNotNullParameter(botName, "botName");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(hintText, "hintText");
        Intrinsics.checkNotNullParameter(defaultText, "defaultText");
        Intrinsics.checkNotNullParameter(form, "form");
        this.botId = botId;
        this.botName = botName;
        this.name = name;
        this.desc = desc;
        this.id = id;
        this.sort = sort;
        this.auth = auth;
        this.type = type;
        this.hintText = hintText;
        this.defaultText = defaultText;
        this.form = form;
    }

    public /* synthetic */ Instruction(String str, String str2, String str3, String str4, long j, int i, int i2, int i3, String str5, String str6, String str7, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, j, (i4 & 32) != 0 ? 0 : i, (i4 & 64) != 0 ? 0 : i2, (i4 & 128) != 0 ? 1 : i3, (i4 & 256) != 0 ? "" : str5, (i4 & 512) != 0 ? "" : str6, (i4 & 1024) != 0 ? "" : str7);
    }

    public final String getBotId() {
        return this.botId;
    }

    public final String getBotName() {
        return this.botName;
    }

    public final String getName() {
        return this.name;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final long getId() {
        return this.id;
    }

    public final int getSort() {
        return this.sort;
    }

    public final int getAuth() {
        return this.auth;
    }

    public final int getType() {
        return this.type;
    }

    public final String getHintText() {
        return this.hintText;
    }

    public final String getDefaultText() {
        return this.defaultText;
    }

    public final String getForm() {
        return this.form;
    }
}
