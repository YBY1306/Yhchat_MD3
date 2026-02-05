package com.yhchat.canarys.p007ui.bot;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: InstructionFormModels.kt */
@Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r\u00a8\u0006!"}, m169d2 = {"Lcom/yhchat/canarys/ui/bot/InstructionFormField;", "", Name.MARK, "", "type", "Lcom/yhchat/canarys/ui/bot/CustomFieldType;", "label", "placeholder", "options", "defaultValue", "<init>", "(Ljava/lang/String;Lcom/yhchat/canarys/ui/bot/CustomFieldType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getType", "()Lcom/yhchat/canarys/ui/bot/CustomFieldType;", "getLabel", "getPlaceholder", "getOptions", "getDefaultValue", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class InstructionFormField {
    public static final int $stable = 0;
    private final String defaultValue;
    private final String id;
    private final String label;
    private final String options;
    private final String placeholder;
    private final CustomFieldType type;

    public static /* synthetic */ InstructionFormField copy$default(InstructionFormField instructionFormField, String str, CustomFieldType customFieldType, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = instructionFormField.id;
        }
        if ((i & 2) != 0) {
            customFieldType = instructionFormField.type;
        }
        if ((i & 4) != 0) {
            str2 = instructionFormField.label;
        }
        if ((i & 8) != 0) {
            str3 = instructionFormField.placeholder;
        }
        if ((i & 16) != 0) {
            str4 = instructionFormField.options;
        }
        if ((i & 32) != 0) {
            str5 = instructionFormField.defaultValue;
        }
        String str6 = str4;
        String str7 = str5;
        return instructionFormField.copy(str, customFieldType, str2, str3, str6, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final CustomFieldType getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* renamed from: component5, reason: from getter */
    public final String getOptions() {
        return this.options;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDefaultValue() {
        return this.defaultValue;
    }

    public final InstructionFormField copy(String str, CustomFieldType type, String label, String placeholder, String options, String defaultValue) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return new InstructionFormField(str, type, label, placeholder, options, defaultValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstructionFormField)) {
            return false;
        }
        InstructionFormField instructionFormField = (InstructionFormField) other;
        return Intrinsics.areEqual(this.id, instructionFormField.id) && this.type == instructionFormField.type && Intrinsics.areEqual(this.label, instructionFormField.label) && Intrinsics.areEqual(this.placeholder, instructionFormField.placeholder) && Intrinsics.areEqual(this.options, instructionFormField.options) && Intrinsics.areEqual(this.defaultValue, instructionFormField.defaultValue);
    }

    public int hashCode() {
        return (((((((((this.id.hashCode() * 31) + this.type.hashCode()) * 31) + this.label.hashCode()) * 31) + this.placeholder.hashCode()) * 31) + this.options.hashCode()) * 31) + this.defaultValue.hashCode();
    }

    public String toString() {
        return "InstructionFormField(id=" + this.id + ", type=" + this.type + ", label=" + this.label + ", placeholder=" + this.placeholder + ", options=" + this.options + ", defaultValue=" + this.defaultValue + ")";
    }

    public InstructionFormField(String id, CustomFieldType type, String label, String placeholder, String options, String defaultValue) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        this.id = id;
        this.type = type;
        this.label = label;
        this.placeholder = placeholder;
        this.options = options;
        this.defaultValue = defaultValue;
    }

    public /* synthetic */ InstructionFormField(String str, CustomFieldType customFieldType, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? InstructionFormModelsKt.randomFieldId() : str, customFieldType, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5);
    }

    public final String getId() {
        return this.id;
    }

    public final CustomFieldType getType() {
        return this.type;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final String getOptions() {
        return this.options;
    }

    public final String getDefaultValue() {
        return this.defaultValue;
    }
}
