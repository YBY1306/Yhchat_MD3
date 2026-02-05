package com.yhchat.canarys.p007ui.chat;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChatScreen.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b\u00a8\u0006\u001a"}, m169d2 = {"Lcom/yhchat/canarys/ui/chat/ButtonData;", "", "text", "", "actionType", "", "url", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getActionType", "()I", "getUrl", "getValue", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
final /* data */ class ButtonData {
    private final int actionType;
    private final String text;
    private final String url;
    private final String value;

    public static /* synthetic */ ButtonData copy$default(ButtonData buttonData, String str, int i, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = buttonData.text;
        }
        if ((i2 & 2) != 0) {
            i = buttonData.actionType;
        }
        if ((i2 & 4) != 0) {
            str2 = buttonData.url;
        }
        if ((i2 & 8) != 0) {
            str3 = buttonData.value;
        }
        return buttonData.copy(str, i, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final int getActionType() {
        return this.actionType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component4, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final ButtonData copy(String text, int actionType, String url, String value) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(value, "value");
        return new ButtonData(text, actionType, url, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonData)) {
            return false;
        }
        ButtonData buttonData = (ButtonData) other;
        return Intrinsics.areEqual(this.text, buttonData.text) && this.actionType == buttonData.actionType && Intrinsics.areEqual(this.url, buttonData.url) && Intrinsics.areEqual(this.value, buttonData.value);
    }

    public int hashCode() {
        return (((((this.text.hashCode() * 31) + Integer.hashCode(this.actionType)) * 31) + this.url.hashCode()) * 31) + this.value.hashCode();
    }

    public String toString() {
        return "ButtonData(text=" + this.text + ", actionType=" + this.actionType + ", url=" + this.url + ", value=" + this.value + ")";
    }

    public ButtonData(String text, int actionType, String url, String value) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(value, "value");
        this.text = text;
        this.actionType = actionType;
        this.url = url;
        this.value = value;
    }

    public final String getText() {
        return this.text;
    }

    public final int getActionType() {
        return this.actionType;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getValue() {
        return this.value;
    }
}
