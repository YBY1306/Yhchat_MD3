package com.yhchat.canarys.p007ui.bot;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'RADIO' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: InstructionFormModels.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001cB?\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u00a2\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\n\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b\u00a8\u0006\u001d"}, m169d2 = {"Lcom/yhchat/canarys/ui/bot/CustomFieldType;", "", "displayName", "", "jsonType", "key", "", "requiresOptions", "", "supportsPlaceholder", "supportsDefault", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IZZZ)V", "getDisplayName", "()Ljava/lang/String;", "getJsonType", "getKey", "()I", "getRequiresOptions", "()Z", "getSupportsPlaceholder", "getSupportsDefault", "RADIO", "INPUT", "SWITCH", "CHECKBOX", "TEXTAREA", "SELECT", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes11.dex */
public final class CustomFieldType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CustomFieldType[] $VALUES;
    public static final CustomFieldType CHECKBOX;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final CustomFieldType INPUT;
    public static final CustomFieldType RADIO;
    public static final CustomFieldType SELECT;
    public static final CustomFieldType SWITCH;
    public static final CustomFieldType TEXTAREA;
    private final String displayName;
    private final String jsonType;
    private final int key;
    private final boolean requiresOptions;
    private final boolean supportsDefault;
    private final boolean supportsPlaceholder;

    private static final /* synthetic */ CustomFieldType[] $values() {
        return new CustomFieldType[]{RADIO, INPUT, SWITCH, CHECKBOX, TEXTAREA, SELECT};
    }

    public static EnumEntries<CustomFieldType> getEntries() {
        return $ENTRIES;
    }

    public static CustomFieldType valueOf(String str) {
        return (CustomFieldType) Enum.valueOf(CustomFieldType.class, str);
    }

    public static CustomFieldType[] values() {
        return (CustomFieldType[]) $VALUES.clone();
    }

    private CustomFieldType(String $enum$name, int $enum$ordinal, String displayName, String jsonType, int key, boolean requiresOptions, boolean supportsPlaceholder, boolean supportsDefault) {
        this.displayName = displayName;
        this.jsonType = jsonType;
        this.key = key;
        this.requiresOptions = requiresOptions;
        this.supportsPlaceholder = supportsPlaceholder;
        this.supportsDefault = supportsDefault;
    }

    /* synthetic */ CustomFieldType(String str, int i, String str2, String str3, int i2, boolean z, boolean z2, boolean z3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, str3, i2, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? false : z3);
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getJsonType() {
        return this.jsonType;
    }

    public final int getKey() {
        return this.key;
    }

    public final boolean getRequiresOptions() {
        return this.requiresOptions;
    }

    public final boolean getSupportsPlaceholder() {
        return this.supportsPlaceholder;
    }

    public final boolean getSupportsDefault() {
        return this.supportsDefault;
    }

    static {
        boolean z = false;
        RADIO = new CustomFieldType("RADIO", 0, "\u5355\u9009\u6846", "radio", 0, true, z, false, 48, null);
        boolean z2 = true ? 1 : 0;
        INPUT = new CustomFieldType("INPUT", 1, "\u8f93\u5165\u6846", "input", z2, z, true, true, 8, null);
        SWITCH = new CustomFieldType("SWITCH", 2, "\u5f00\u5173", "switch", 2, false, false, true, 24, null);
        boolean z3 = false;
        CHECKBOX = new CustomFieldType("CHECKBOX", 3, "\u591a\u9009\u6846", "checkbox", 3, true, z3, false, 48, null);
        boolean z4 = true;
        boolean z5 = false;
        TEXTAREA = new CustomFieldType("TEXTAREA", 4, "\u591a\u884c\u8f93\u5165\u6846", "textarea", 4, z3, z4, z5, 40, null);
        SELECT = new CustomFieldType("SELECT", 5, "\u9009\u62e9\u5668", "select", 5, z4, z5, false, 48, null);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
        INSTANCE = new Companion(null);
    }

    /* compiled from: InstructionFormModels.kt */
    @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/ui/bot/CustomFieldType$Companion;", "", "<init>", "()V", "fromJson", "Lcom/yhchat/canarys/ui/bot/CustomFieldType;", "type", "", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CustomFieldType fromJson(String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            for (CustomFieldType customFieldType : CustomFieldType.values()) {
                if (StringsKt.equals(customFieldType.getJsonType(), type, true)) {
                    return customFieldType;
                }
            }
            return null;
        }
    }
}
