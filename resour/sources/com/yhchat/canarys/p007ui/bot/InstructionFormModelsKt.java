package com.yhchat.canarys.p007ui.bot;

import androidx.autofill.HintConstants;
import com.yhchat.canarys.p007ui.bot.CustomFieldType;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.simpleframework.xml.strategy.Name;

/* compiled from: InstructionFormModels.kt */
@Metadata(m168d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u001a\u0014\u0010\u0006\u001a\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u001a\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0002\u00a8\u0006\u000b"}, m169d2 = {"randomFieldId", "", "parseCustomFields", "", "Lcom/yhchat/canarys/ui/bot/InstructionFormField;", "json", "buildCustomJson", "fields", "buildProps", "Lorg/json/JSONArray;", "field", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes11.dex */
public final class InstructionFormModelsKt {

    /* compiled from: InstructionFormModels.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CustomFieldType.values().length];
            try {
                iArr[CustomFieldType.RADIO.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[CustomFieldType.CHECKBOX.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[CustomFieldType.SELECT.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[CustomFieldType.INPUT.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[CustomFieldType.TEXTAREA.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr[CustomFieldType.SWITCH.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String randomFieldId() {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return StringsKt.take(StringsKt.replace$default(string, "-", "", false, 4, (Object) null), 6);
    }

    public static final List<InstructionFormField> parseCustomFields(String json) {
        String str = json;
        if (str == null || StringsKt.isBlank(str)) {
            return CollectionsKt.emptyList();
        }
        try {
            JSONArray array = new JSONArray(json);
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            int length = array.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = array.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    CustomFieldType.Companion companion = CustomFieldType.INSTANCE;
                    String strOptString = jSONObjectOptJSONObject.optString("type");
                    Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
                    CustomFieldType customFieldTypeFromJson = companion.fromJson(strOptString);
                    if (customFieldTypeFromJson != null) {
                        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("propsValue");
                        if (jSONObjectOptJSONObject2 == null) {
                            jSONObjectOptJSONObject2 = new JSONObject();
                        }
                        String strOptString2 = jSONObjectOptJSONObject.optString(Name.MARK, randomFieldId());
                        Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
                        String strOptString3 = jSONObjectOptJSONObject2.optString("label", "");
                        Intrinsics.checkNotNullExpressionValue(strOptString3, "optString(...)");
                        String strOptString4 = jSONObjectOptJSONObject2.optString("placeholder", "");
                        Intrinsics.checkNotNullExpressionValue(strOptString4, "optString(...)");
                        String strOptString5 = jSONObjectOptJSONObject2.optString("options", "");
                        Intrinsics.checkNotNullExpressionValue(strOptString5, "optString(...)");
                        String strOptString6 = jSONObjectOptJSONObject2.optString("defaultValue", "");
                        Intrinsics.checkNotNullExpressionValue(strOptString6, "optString(...)");
                        listCreateListBuilder.add(new InstructionFormField(strOptString2, customFieldTypeFromJson, strOptString3, strOptString4, strOptString5, strOptString6));
                    }
                }
            }
            return CollectionsKt.build(listCreateListBuilder);
        } catch (Exception e) {
            return CollectionsKt.emptyList();
        }
    }

    public static final String buildCustomJson(List<InstructionFormField> fields) throws JSONException {
        Intrinsics.checkNotNullParameter(fields, "fields");
        JSONArray jSONArray = new JSONArray();
        for (InstructionFormField instructionFormField : fields) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", instructionFormField.getType().getKey());
            jSONObject.put("type", instructionFormField.getType().getJsonType());
            String label = instructionFormField.getLabel();
            if (StringsKt.isBlank(label)) {
                label = instructionFormField.getType().getDisplayName();
            }
            jSONObject.put("title", label);
            String id = instructionFormField.getId();
            if (StringsKt.isBlank(id)) {
                id = randomFieldId();
            }
            jSONObject.put(Name.MARK, id);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("label", instructionFormField.getLabel());
            if (instructionFormField.getType().getSupportsPlaceholder()) {
                jSONObject2.put("placeholder", instructionFormField.getPlaceholder());
            }
            if (instructionFormField.getType().getRequiresOptions()) {
                jSONObject2.put("options", instructionFormField.getOptions());
            }
            if (instructionFormField.getType().getSupportsDefault() || instructionFormField.getType() == CustomFieldType.SWITCH) {
                jSONObject2.put("defaultValue", instructionFormField.getDefaultValue());
            }
            jSONObject.put("propsValue", jSONObject2);
            jSONObject.put("props", buildProps(instructionFormField));
            jSONArray.put(jSONObject);
        }
        String string = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private static final JSONArray buildProps(InstructionFormField field) throws JSONException {
        JSONArray props = new JSONArray();
        buildProps$addProp$default(props, "label", "\u6807\u7b7e", null, field.getLabel(), 8, null);
        switch (WhenMappings.$EnumSwitchMapping$0[field.getType().ordinal()]) {
            case 1:
            case 2:
            case 3:
                buildProps$addProp(props, "options", "\u9009\u9879", "\u7528#\u5206\u5272\uff0c\u5982\uff1a\u5317\u4eac#\u4e0a\u6d77#\u5929\u6d25", field.getOptions());
                return props;
            case 4:
                buildProps$addProp$default(props, "defaultValue", "\u9ed8\u8ba4\u5185\u5bb9", null, field.getDefaultValue(), 8, null);
                buildProps$addProp$default(props, "placeholder", "\u5360\u4f4d\u6587\u672c", null, field.getPlaceholder(), 8, null);
                return props;
            case 5:
                buildProps$addProp$default(props, "placeholder", "\u5360\u4f4d\u6587\u672c", null, field.getPlaceholder(), 8, null);
                return props;
            case 6:
                buildProps$addProp(props, "defaultValue", "\u9ed8\u8ba4\u72b6\u6001", "1=\u6253\u5f00,0=\u5173\u95ed", field.getDefaultValue());
                return props;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    static /* synthetic */ void buildProps$addProp$default(JSONArray jSONArray, String str, String str2, String str3, String str4, int i, Object obj) throws JSONException {
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = "";
        }
        buildProps$addProp(jSONArray, str, str2, str3, str4);
    }

    private static final void buildProps$addProp(JSONArray props, String type, String name, String placeholder, String value) throws JSONException {
        JSONObject obj = new JSONObject();
        obj.put("type", type);
        obj.put(HintConstants.AUTOFILL_HINT_NAME, name);
        obj.put("value", value);
        if (placeholder != null) {
            obj.put("placeholder", placeholder);
        }
        props.put(obj);
    }
}
