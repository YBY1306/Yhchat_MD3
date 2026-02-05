package com.yhchat.canarys.data.model;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u00a2\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\tH\u00c6\u0003J\t\u0010!\u001a\u00020\u0005H\u00c6\u0003JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\tH\u00d6\u0001J\t\u0010'\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012\u00a8\u0006("}, m169d2 = {"Lcom/yhchat/canarys/data/model/MenuButton;", "", Name.MARK, "", "botId", "", HintConstants.AUTOFILL_HINT_NAME, "content", "menuType", "", "createTime", "menuAction", "select", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IJILjava/lang/String;)V", "getId", "()J", "getBotId", "()Ljava/lang/String;", "getName", "getContent", "getMenuType", "()I", "getCreateTime", "getMenuAction", "getSelect", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class MenuButton {
    public static final int $stable = 0;
    private final String botId;
    private final String content;
    private final long createTime;
    private final long id;
    private final int menuAction;
    private final int menuType;
    private final String name;
    private final String select;

    public static /* synthetic */ MenuButton copy$default(MenuButton menuButton, long j, String str, String str2, String str3, int i, long j2, int i2, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = menuButton.id;
        }
        long j3 = j;
        if ((i3 & 2) != 0) {
            str = menuButton.botId;
        }
        String str5 = str;
        if ((i3 & 4) != 0) {
            str2 = menuButton.name;
        }
        return menuButton.copy(j3, str5, str2, (i3 & 8) != 0 ? menuButton.content : str3, (i3 & 16) != 0 ? menuButton.menuType : i, (i3 & 32) != 0 ? menuButton.createTime : j2, (i3 & 64) != 0 ? menuButton.menuAction : i2, (i3 & 128) != 0 ? menuButton.select : str4);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
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
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component5, reason: from getter */
    public final int getMenuType() {
        return this.menuType;
    }

    /* renamed from: component6, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* renamed from: component7, reason: from getter */
    public final int getMenuAction() {
        return this.menuAction;
    }

    /* renamed from: component8, reason: from getter */
    public final String getSelect() {
        return this.select;
    }

    public final MenuButton copy(long id, String botId, String name, String content, int menuType, long createTime, int menuAction, String select) {
        Intrinsics.checkNotNullParameter(botId, "botId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(select, "select");
        return new MenuButton(id, botId, name, content, menuType, createTime, menuAction, select);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenuButton)) {
            return false;
        }
        MenuButton menuButton = (MenuButton) other;
        return this.id == menuButton.id && Intrinsics.areEqual(this.botId, menuButton.botId) && Intrinsics.areEqual(this.name, menuButton.name) && Intrinsics.areEqual(this.content, menuButton.content) && this.menuType == menuButton.menuType && this.createTime == menuButton.createTime && this.menuAction == menuButton.menuAction && Intrinsics.areEqual(this.select, menuButton.select);
    }

    public int hashCode() {
        return (((((((((((((Long.hashCode(this.id) * 31) + this.botId.hashCode()) * 31) + this.name.hashCode()) * 31) + this.content.hashCode()) * 31) + Integer.hashCode(this.menuType)) * 31) + Long.hashCode(this.createTime)) * 31) + Integer.hashCode(this.menuAction)) * 31) + this.select.hashCode();
    }

    public String toString() {
        return "MenuButton(id=" + this.id + ", botId=" + this.botId + ", name=" + this.name + ", content=" + this.content + ", menuType=" + this.menuType + ", createTime=" + this.createTime + ", menuAction=" + this.menuAction + ", select=" + this.select + ")";
    }

    public MenuButton(long id, String botId, String name, String content, int menuType, long createTime, int menuAction, String select) {
        Intrinsics.checkNotNullParameter(botId, "botId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(select, "select");
        this.id = id;
        this.botId = botId;
        this.name = name;
        this.content = content;
        this.menuType = menuType;
        this.createTime = createTime;
        this.menuAction = menuAction;
        this.select = select;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MenuButton(long j, String str, String str2, String str3, int i, long j2, int i2, String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        if ((i3 & 128) == 0) {
            str5 = str4;
        } else {
            str5 = "";
        }
        this(j, str, str2, str3, i, j2, i2, str5);
    }

    public final long getId() {
        return this.id;
    }

    public final String getBotId() {
        return this.botId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getContent() {
        return this.content;
    }

    public final int getMenuType() {
        return this.menuType;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final int getMenuAction() {
        return this.menuAction;
    }

    public final String getSelect() {
        return this.select;
    }
}
