package com.yhchat.canarys.data.api;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiService.kt */
@Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0013"}, m169d2 = {"Lcom/yhchat/canarys/data/api/EditBotSubscribedLinkRequest;", "", "botId", "", "link", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getBotId", "()Ljava/lang/String;", "getLink", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class EditBotSubscribedLinkRequest {
    public static final int $stable = 0;

    @SerializedName("botId")
    private final String botId;

    @SerializedName("link")
    private final String link;

    public static /* synthetic */ EditBotSubscribedLinkRequest copy$default(EditBotSubscribedLinkRequest editBotSubscribedLinkRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = editBotSubscribedLinkRequest.botId;
        }
        if ((i & 2) != 0) {
            str2 = editBotSubscribedLinkRequest.link;
        }
        return editBotSubscribedLinkRequest.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBotId() {
        return this.botId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    public final EditBotSubscribedLinkRequest copy(String botId, String link) {
        Intrinsics.checkNotNullParameter(botId, "botId");
        Intrinsics.checkNotNullParameter(link, "link");
        return new EditBotSubscribedLinkRequest(botId, link);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EditBotSubscribedLinkRequest)) {
            return false;
        }
        EditBotSubscribedLinkRequest editBotSubscribedLinkRequest = (EditBotSubscribedLinkRequest) other;
        return Intrinsics.areEqual(this.botId, editBotSubscribedLinkRequest.botId) && Intrinsics.areEqual(this.link, editBotSubscribedLinkRequest.link);
    }

    public int hashCode() {
        return (this.botId.hashCode() * 31) + this.link.hashCode();
    }

    public String toString() {
        return "EditBotSubscribedLinkRequest(botId=" + this.botId + ", link=" + this.link + ")";
    }

    public EditBotSubscribedLinkRequest(String botId, String link) {
        Intrinsics.checkNotNullParameter(botId, "botId");
        Intrinsics.checkNotNullParameter(link, "link");
        this.botId = botId;
        this.link = link;
    }

    public final String getBotId() {
        return this.botId;
    }

    public final String getLink() {
        return this.link;
    }
}
