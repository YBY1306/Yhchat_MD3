package com.yhchat.canarys.p007ui.chat;

import com.yhchat.canarys.data.model.GroupDetail;
import com.yhchat.canarys.data.model.GroupMemberInfo;
import com.yhchat.canarys.data.model.MenuButton;
import com.yhchat.canarys.proto.bot.Bot;
import com.yhchat.canarys.proto.group.Bot_data;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChatViewModel.kt */
@Metadata(m168d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001B\u00c1\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00180\f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0015\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0015\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\fH\u00c6\u0003J\t\u00108\u001a\u00020\u000fH\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u000f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u00c6\u0003J\u0015\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00180\fH\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0015H\u00c6\u0003J\u00c3\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00180\f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0015H\u00c6\u0001J\u0013\u0010@\u001a\u00020\u00032\b\u0010A\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010B\u001a\u00020\u000fH\u00d6\u0001J\t\u0010C\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u001eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u001eR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u001eR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u001d\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00180\f\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010%R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010-\u00a8\u0006D"}, m169d2 = {"Lcom/yhchat/canarys/ui/chat/ChatUiState;", "", "isLoading", "", "error", "", "isConnected", "isRefreshing", "newMessageReceived", "groupInfo", "Lcom/yhchat/canarys/data/model/GroupDetail;", "groupMembers", "", "Lcom/yhchat/canarys/data/model/GroupMemberInfo;", "groupMemberCount", "", "botInfo", "Lcom/yhchat/canarys/proto/bot/Bot$bot_info;", "botBoard", "Lcom/yhchat/canarys/proto/bot/Bot$board;", "groupBots", "", "Lcom/yhchat/canarys/proto/group/Bot_data;", "groupBotBoards", "Lcom/yhchat/canarys/proto/bot/Bot$board$Board_data;", "chatBackgroundUrl", "menuButtons", "Lcom/yhchat/canarys/data/model/MenuButton;", "<init>", "(ZLjava/lang/String;ZZZLcom/yhchat/canarys/data/model/GroupDetail;Ljava/util/Map;ILcom/yhchat/canarys/proto/bot/Bot$bot_info;Lcom/yhchat/canarys/proto/bot/Bot$board;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;)V", "()Z", "getError", "()Ljava/lang/String;", "getNewMessageReceived", "getGroupInfo", "()Lcom/yhchat/canarys/data/model/GroupDetail;", "getGroupMembers", "()Ljava/util/Map;", "getGroupMemberCount", "()I", "getBotInfo", "()Lcom/yhchat/canarys/proto/bot/Bot$bot_info;", "getBotBoard", "()Lcom/yhchat/canarys/proto/bot/Bot$board;", "getGroupBots", "()Ljava/util/List;", "getGroupBotBoards", "getChatBackgroundUrl", "getMenuButtons", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChatUiState {
    public static final int $stable = 8;
    private final Bot.board botBoard;
    private final Bot.bot_info botInfo;
    private final String chatBackgroundUrl;
    private final String error;
    private final Map<String, Bot.board.Board_data> groupBotBoards;
    private final List<Bot_data> groupBots;
    private final GroupDetail groupInfo;
    private final int groupMemberCount;
    private final Map<String, GroupMemberInfo> groupMembers;
    private final boolean isConnected;
    private final boolean isLoading;
    private final boolean isRefreshing;
    private final List<MenuButton> menuButtons;
    private final boolean newMessageReceived;

    public ChatUiState() {
        this(false, null, false, false, false, null, null, 0, null, null, null, null, null, null, 16383, null);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component10, reason: from getter */
    public final Bot.board getBotBoard() {
        return this.botBoard;
    }

    public final List<Bot_data> component11() {
        return this.groupBots;
    }

    public final Map<String, Bot.board.Board_data> component12() {
        return this.groupBotBoards;
    }

    /* renamed from: component13, reason: from getter */
    public final String getChatBackgroundUrl() {
        return this.chatBackgroundUrl;
    }

    public final List<MenuButton> component14() {
        return this.menuButtons;
    }

    /* renamed from: component2, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsConnected() {
        return this.isConnected;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsRefreshing() {
        return this.isRefreshing;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getNewMessageReceived() {
        return this.newMessageReceived;
    }

    /* renamed from: component6, reason: from getter */
    public final GroupDetail getGroupInfo() {
        return this.groupInfo;
    }

    public final Map<String, GroupMemberInfo> component7() {
        return this.groupMembers;
    }

    /* renamed from: component8, reason: from getter */
    public final int getGroupMemberCount() {
        return this.groupMemberCount;
    }

    /* renamed from: component9, reason: from getter */
    public final Bot.bot_info getBotInfo() {
        return this.botInfo;
    }

    public final ChatUiState copy(boolean isLoading, String error, boolean isConnected, boolean isRefreshing, boolean newMessageReceived, GroupDetail groupInfo, Map<String, GroupMemberInfo> groupMembers, int groupMemberCount, Bot.bot_info botInfo, Bot.board botBoard, List<Bot_data> groupBots, Map<String, Bot.board.Board_data> groupBotBoards, String chatBackgroundUrl, List<MenuButton> menuButtons) {
        Intrinsics.checkNotNullParameter(groupMembers, "groupMembers");
        Intrinsics.checkNotNullParameter(groupBots, "groupBots");
        Intrinsics.checkNotNullParameter(groupBotBoards, "groupBotBoards");
        Intrinsics.checkNotNullParameter(menuButtons, "menuButtons");
        return new ChatUiState(isLoading, error, isConnected, isRefreshing, newMessageReceived, groupInfo, groupMembers, groupMemberCount, botInfo, botBoard, groupBots, groupBotBoards, chatBackgroundUrl, menuButtons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatUiState)) {
            return false;
        }
        ChatUiState chatUiState = (ChatUiState) other;
        return this.isLoading == chatUiState.isLoading && Intrinsics.areEqual(this.error, chatUiState.error) && this.isConnected == chatUiState.isConnected && this.isRefreshing == chatUiState.isRefreshing && this.newMessageReceived == chatUiState.newMessageReceived && Intrinsics.areEqual(this.groupInfo, chatUiState.groupInfo) && Intrinsics.areEqual(this.groupMembers, chatUiState.groupMembers) && this.groupMemberCount == chatUiState.groupMemberCount && Intrinsics.areEqual(this.botInfo, chatUiState.botInfo) && Intrinsics.areEqual(this.botBoard, chatUiState.botBoard) && Intrinsics.areEqual(this.groupBots, chatUiState.groupBots) && Intrinsics.areEqual(this.groupBotBoards, chatUiState.groupBotBoards) && Intrinsics.areEqual(this.chatBackgroundUrl, chatUiState.chatBackgroundUrl) && Intrinsics.areEqual(this.menuButtons, chatUiState.menuButtons);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((Boolean.hashCode(this.isLoading) * 31) + (this.error == null ? 0 : this.error.hashCode())) * 31) + Boolean.hashCode(this.isConnected)) * 31) + Boolean.hashCode(this.isRefreshing)) * 31) + Boolean.hashCode(this.newMessageReceived)) * 31) + (this.groupInfo == null ? 0 : this.groupInfo.hashCode())) * 31) + this.groupMembers.hashCode()) * 31) + Integer.hashCode(this.groupMemberCount)) * 31) + (this.botInfo == null ? 0 : this.botInfo.hashCode())) * 31) + (this.botBoard == null ? 0 : this.botBoard.hashCode())) * 31) + this.groupBots.hashCode()) * 31) + this.groupBotBoards.hashCode()) * 31) + (this.chatBackgroundUrl != null ? this.chatBackgroundUrl.hashCode() : 0)) * 31) + this.menuButtons.hashCode();
    }

    public String toString() {
        return "ChatUiState(isLoading=" + this.isLoading + ", error=" + this.error + ", isConnected=" + this.isConnected + ", isRefreshing=" + this.isRefreshing + ", newMessageReceived=" + this.newMessageReceived + ", groupInfo=" + this.groupInfo + ", groupMembers=" + this.groupMembers + ", groupMemberCount=" + this.groupMemberCount + ", botInfo=" + this.botInfo + ", botBoard=" + this.botBoard + ", groupBots=" + this.groupBots + ", groupBotBoards=" + this.groupBotBoards + ", chatBackgroundUrl=" + this.chatBackgroundUrl + ", menuButtons=" + this.menuButtons + ")";
    }

    public ChatUiState(boolean isLoading, String error, boolean isConnected, boolean isRefreshing, boolean newMessageReceived, GroupDetail groupInfo, Map<String, GroupMemberInfo> groupMembers, int groupMemberCount, Bot.bot_info botInfo, Bot.board botBoard, List<Bot_data> groupBots, Map<String, Bot.board.Board_data> groupBotBoards, String chatBackgroundUrl, List<MenuButton> menuButtons) {
        Intrinsics.checkNotNullParameter(groupMembers, "groupMembers");
        Intrinsics.checkNotNullParameter(groupBots, "groupBots");
        Intrinsics.checkNotNullParameter(groupBotBoards, "groupBotBoards");
        Intrinsics.checkNotNullParameter(menuButtons, "menuButtons");
        this.isLoading = isLoading;
        this.error = error;
        this.isConnected = isConnected;
        this.isRefreshing = isRefreshing;
        this.newMessageReceived = newMessageReceived;
        this.groupInfo = groupInfo;
        this.groupMembers = groupMembers;
        this.groupMemberCount = groupMemberCount;
        this.botInfo = botInfo;
        this.botBoard = botBoard;
        this.groupBots = groupBots;
        this.groupBotBoards = groupBotBoards;
        this.chatBackgroundUrl = chatBackgroundUrl;
        this.menuButtons = menuButtons;
    }

    public /* synthetic */ ChatUiState(boolean z, String str, boolean z2, boolean z3, boolean z4, GroupDetail groupDetail, Map map, int i, Bot.bot_info bot_infoVar, Bot.board boardVar, List list, Map map2, String str2, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? false : z3, (i2 & 16) != 0 ? false : z4, (i2 & 32) != 0 ? null : groupDetail, (i2 & 64) != 0 ? MapsKt.emptyMap() : map, (i2 & 128) == 0 ? i : 0, (i2 & 256) != 0 ? null : bot_infoVar, (i2 & 512) != 0 ? null : boardVar, (i2 & 1024) != 0 ? CollectionsKt.emptyList() : list, (i2 & 2048) != 0 ? MapsKt.emptyMap() : map2, (i2 & 4096) == 0 ? str2 : null, (i2 & 8192) != 0 ? CollectionsKt.emptyList() : list2);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final String getError() {
        return this.error;
    }

    public final boolean isConnected() {
        return this.isConnected;
    }

    public final boolean isRefreshing() {
        return this.isRefreshing;
    }

    public final boolean getNewMessageReceived() {
        return this.newMessageReceived;
    }

    public final GroupDetail getGroupInfo() {
        return this.groupInfo;
    }

    public final Map<String, GroupMemberInfo> getGroupMembers() {
        return this.groupMembers;
    }

    public final int getGroupMemberCount() {
        return this.groupMemberCount;
    }

    public final Bot.bot_info getBotInfo() {
        return this.botInfo;
    }

    public final Bot.board getBotBoard() {
        return this.botBoard;
    }

    public final List<Bot_data> getGroupBots() {
        return this.groupBots;
    }

    public final Map<String, Bot.board.Board_data> getGroupBotBoards() {
        return this.groupBotBoards;
    }

    public final String getChatBackgroundUrl() {
        return this.chatBackgroundUrl;
    }

    public final List<MenuButton> getMenuButtons() {
        return this.menuButtons;
    }
}
