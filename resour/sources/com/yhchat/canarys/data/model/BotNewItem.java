package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003JU\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r\u00a8\u0006\""}, m169d2 = {"Lcom/yhchat/canarys/data/model/BotNewItem;", "", ChatSearchActivity.EXTRA_CHAT_ID, "", ChatSearchActivity.EXTRA_CHAT_TYPE, "headcount", "nickname", "introduction", "instructions", "avatarUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "getChatType", "getHeadcount", "getNickname", "getIntroduction", "getInstructions", "getAvatarUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class BotNewItem {
    public static final int $stable = 0;

    @SerializedName("avatarUrl")
    private final String avatarUrl;

    @SerializedName(ChatSearchActivity.EXTRA_CHAT_ID)
    private final String chatId;

    @SerializedName(ChatSearchActivity.EXTRA_CHAT_TYPE)
    private final String chatType;

    @SerializedName("headcount")
    private final String headcount;

    @SerializedName("instructions")
    private final String instructions;

    @SerializedName("introduction")
    private final String introduction;

    @SerializedName("nickname")
    private final String nickname;

    public static /* synthetic */ BotNewItem copy$default(BotNewItem botNewItem, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = botNewItem.chatId;
        }
        if ((i & 2) != 0) {
            str2 = botNewItem.chatType;
        }
        if ((i & 4) != 0) {
            str3 = botNewItem.headcount;
        }
        if ((i & 8) != 0) {
            str4 = botNewItem.nickname;
        }
        if ((i & 16) != 0) {
            str5 = botNewItem.introduction;
        }
        if ((i & 32) != 0) {
            str6 = botNewItem.instructions;
        }
        if ((i & 64) != 0) {
            str7 = botNewItem.avatarUrl;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return botNewItem.copy(str, str2, str11, str4, str10, str8, str9);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getChatType() {
        return this.chatType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getHeadcount() {
        return this.headcount;
    }

    /* renamed from: component4, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* renamed from: component5, reason: from getter */
    public final String getIntroduction() {
        return this.introduction;
    }

    /* renamed from: component6, reason: from getter */
    public final String getInstructions() {
        return this.instructions;
    }

    /* renamed from: component7, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final BotNewItem copy(String chatId, String chatType, String headcount, String nickname, String introduction, String instructions, String avatarUrl) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(chatType, "chatType");
        Intrinsics.checkNotNullParameter(headcount, "headcount");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        return new BotNewItem(chatId, chatType, headcount, nickname, introduction, instructions, avatarUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BotNewItem)) {
            return false;
        }
        BotNewItem botNewItem = (BotNewItem) other;
        return Intrinsics.areEqual(this.chatId, botNewItem.chatId) && Intrinsics.areEqual(this.chatType, botNewItem.chatType) && Intrinsics.areEqual(this.headcount, botNewItem.headcount) && Intrinsics.areEqual(this.nickname, botNewItem.nickname) && Intrinsics.areEqual(this.introduction, botNewItem.introduction) && Intrinsics.areEqual(this.instructions, botNewItem.instructions) && Intrinsics.areEqual(this.avatarUrl, botNewItem.avatarUrl);
    }

    public int hashCode() {
        return (((((((((((this.chatId.hashCode() * 31) + this.chatType.hashCode()) * 31) + this.headcount.hashCode()) * 31) + this.nickname.hashCode()) * 31) + (this.introduction == null ? 0 : this.introduction.hashCode())) * 31) + (this.instructions == null ? 0 : this.instructions.hashCode())) * 31) + (this.avatarUrl != null ? this.avatarUrl.hashCode() : 0);
    }

    public String toString() {
        return "BotNewItem(chatId=" + this.chatId + ", chatType=" + this.chatType + ", headcount=" + this.headcount + ", nickname=" + this.nickname + ", introduction=" + this.introduction + ", instructions=" + this.instructions + ", avatarUrl=" + this.avatarUrl + ")";
    }

    public BotNewItem(String chatId, String chatType, String headcount, String nickname, String introduction, String instructions, String avatarUrl) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(chatType, "chatType");
        Intrinsics.checkNotNullParameter(headcount, "headcount");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        this.chatId = chatId;
        this.chatType = chatType;
        this.headcount = headcount;
        this.nickname = nickname;
        this.introduction = introduction;
        this.instructions = instructions;
        this.avatarUrl = avatarUrl;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final String getChatType() {
        return this.chatType;
    }

    public final String getHeadcount() {
        return this.headcount;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getIntroduction() {
        return this.introduction;
    }

    public final String getInstructions() {
        return this.instructions;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }
}
