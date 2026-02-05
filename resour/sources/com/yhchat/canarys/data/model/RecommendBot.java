package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\"\u001a\u00020\u000bH\u00c6\u0003J\t\u0010#\u001a\u00020\u000bH\u00c6\u0003Js\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010(\u001a\u00020\u000bH\u00d6\u0001J\t\u0010)\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0018R\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0018R\u0016\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018\u00a8\u0006*"}, m169d2 = {"Lcom/yhchat/canarys/data/model/RecommendBot;", "", ChatSearchActivity.EXTRA_CHAT_ID, "", ChatSearchActivity.EXTRA_CHAT_TYPE, "headcount", "nickname", "introduction", "introductions", "avatarUrl", "isAdd", "", "isApply", "alwaysAgree", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V", "getChatId", "()Ljava/lang/String;", "getChatType", "getHeadcount", "getNickname", "getIntroduction", "getIntroductions", "getAvatarUrl", "()I", "getAlwaysAgree", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RecommendBot {
    public static final int $stable = 0;

    @SerializedName("alwaysAgree")
    private final int alwaysAgree;

    @SerializedName("avatarUrl")
    private final String avatarUrl;

    @SerializedName(ChatSearchActivity.EXTRA_CHAT_ID)
    private final String chatId;

    @SerializedName(ChatSearchActivity.EXTRA_CHAT_TYPE)
    private final String chatType;

    @SerializedName("headcount")
    private final String headcount;

    @SerializedName("introduction")
    private final String introduction;

    @SerializedName("introductions")
    private final String introductions;

    @SerializedName("isAdd")
    private final int isAdd;

    @SerializedName("isApply")
    private final int isApply;

    @SerializedName("nickname")
    private final String nickname;

    public static /* synthetic */ RecommendBot copy$default(RecommendBot recommendBot, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = recommendBot.chatId;
        }
        if ((i4 & 2) != 0) {
            str2 = recommendBot.chatType;
        }
        if ((i4 & 4) != 0) {
            str3 = recommendBot.headcount;
        }
        if ((i4 & 8) != 0) {
            str4 = recommendBot.nickname;
        }
        if ((i4 & 16) != 0) {
            str5 = recommendBot.introduction;
        }
        if ((i4 & 32) != 0) {
            str6 = recommendBot.introductions;
        }
        if ((i4 & 64) != 0) {
            str7 = recommendBot.avatarUrl;
        }
        if ((i4 & 128) != 0) {
            i = recommendBot.isAdd;
        }
        if ((i4 & 256) != 0) {
            i2 = recommendBot.isApply;
        }
        if ((i4 & 512) != 0) {
            i3 = recommendBot.alwaysAgree;
        }
        int i5 = i2;
        int i6 = i3;
        String str8 = str7;
        int i7 = i;
        String str9 = str5;
        String str10 = str6;
        return recommendBot.copy(str, str2, str3, str4, str9, str10, str8, i7, i5, i6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component10, reason: from getter */
    public final int getAlwaysAgree() {
        return this.alwaysAgree;
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
    public final String getIntroductions() {
        return this.introductions;
    }

    /* renamed from: component7, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* renamed from: component8, reason: from getter */
    public final int getIsAdd() {
        return this.isAdd;
    }

    /* renamed from: component9, reason: from getter */
    public final int getIsApply() {
        return this.isApply;
    }

    public final RecommendBot copy(String chatId, String chatType, String headcount, String nickname, String introduction, String introductions, String avatarUrl, int isAdd, int isApply, int alwaysAgree) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(chatType, "chatType");
        Intrinsics.checkNotNullParameter(headcount, "headcount");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        return new RecommendBot(chatId, chatType, headcount, nickname, introduction, introductions, avatarUrl, isAdd, isApply, alwaysAgree);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendBot)) {
            return false;
        }
        RecommendBot recommendBot = (RecommendBot) other;
        return Intrinsics.areEqual(this.chatId, recommendBot.chatId) && Intrinsics.areEqual(this.chatType, recommendBot.chatType) && Intrinsics.areEqual(this.headcount, recommendBot.headcount) && Intrinsics.areEqual(this.nickname, recommendBot.nickname) && Intrinsics.areEqual(this.introduction, recommendBot.introduction) && Intrinsics.areEqual(this.introductions, recommendBot.introductions) && Intrinsics.areEqual(this.avatarUrl, recommendBot.avatarUrl) && this.isAdd == recommendBot.isAdd && this.isApply == recommendBot.isApply && this.alwaysAgree == recommendBot.alwaysAgree;
    }

    public int hashCode() {
        return (((((((((((((((((this.chatId.hashCode() * 31) + this.chatType.hashCode()) * 31) + this.headcount.hashCode()) * 31) + this.nickname.hashCode()) * 31) + (this.introduction == null ? 0 : this.introduction.hashCode())) * 31) + (this.introductions == null ? 0 : this.introductions.hashCode())) * 31) + (this.avatarUrl != null ? this.avatarUrl.hashCode() : 0)) * 31) + Integer.hashCode(this.isAdd)) * 31) + Integer.hashCode(this.isApply)) * 31) + Integer.hashCode(this.alwaysAgree);
    }

    public String toString() {
        return "RecommendBot(chatId=" + this.chatId + ", chatType=" + this.chatType + ", headcount=" + this.headcount + ", nickname=" + this.nickname + ", introduction=" + this.introduction + ", introductions=" + this.introductions + ", avatarUrl=" + this.avatarUrl + ", isAdd=" + this.isAdd + ", isApply=" + this.isApply + ", alwaysAgree=" + this.alwaysAgree + ")";
    }

    public RecommendBot(String chatId, String chatType, String headcount, String nickname, String introduction, String introductions, String avatarUrl, int isAdd, int isApply, int alwaysAgree) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(chatType, "chatType");
        Intrinsics.checkNotNullParameter(headcount, "headcount");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        this.chatId = chatId;
        this.chatType = chatType;
        this.headcount = headcount;
        this.nickname = nickname;
        this.introduction = introduction;
        this.introductions = introductions;
        this.avatarUrl = avatarUrl;
        this.isAdd = isAdd;
        this.isApply = isApply;
        this.alwaysAgree = alwaysAgree;
    }

    public /* synthetic */ RecommendBot(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, (i4 & 128) != 0 ? 1 : i, (i4 & 256) != 0 ? 0 : i2, (i4 & 512) != 0 ? 0 : i3);
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

    public final String getIntroductions() {
        return this.introductions;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final int isAdd() {
        return this.isAdd;
    }

    public final int isApply() {
        return this.isApply;
    }

    public final int getAlwaysAgree() {
        return this.alwaysAgree;
    }
}
