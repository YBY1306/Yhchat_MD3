package com.yhchat.canarys.p007ui.bot;

import com.yhchat.canarys.proto.bot.Bot;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BotDetailViewModel.kt */
@Metadata(m168d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003JM\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012\u00a8\u0006\""}, m169d2 = {"Lcom/yhchat/canarys/ui/bot/BotDetailUiState;", "", "isLoading", "", "botInfo", "Lcom/yhchat/canarys/proto/bot/Bot$bot_info;", "error", "", "isBoardLoading", "boardInfo", "Lcom/yhchat/canarys/proto/bot/Bot$board;", "boardError", "<init>", "(ZLcom/yhchat/canarys/proto/bot/Bot$bot_info;Ljava/lang/String;ZLcom/yhchat/canarys/proto/bot/Bot$board;Ljava/lang/String;)V", "()Z", "getBotInfo", "()Lcom/yhchat/canarys/proto/bot/Bot$bot_info;", "getError", "()Ljava/lang/String;", "getBoardInfo", "()Lcom/yhchat/canarys/proto/bot/Bot$board;", "getBoardError", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BotDetailUiState {
    public static final int $stable = 0;
    private final String boardError;
    private final Bot.board boardInfo;
    private final Bot.bot_info botInfo;
    private final String error;
    private final boolean isBoardLoading;
    private final boolean isLoading;

    public BotDetailUiState() {
        this(false, null, null, false, null, null, 63, null);
    }

    public static /* synthetic */ BotDetailUiState copy$default(BotDetailUiState botDetailUiState, boolean z, Bot.bot_info bot_infoVar, String str, boolean z2, Bot.board boardVar, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = botDetailUiState.isLoading;
        }
        if ((i & 2) != 0) {
            bot_infoVar = botDetailUiState.botInfo;
        }
        if ((i & 4) != 0) {
            str = botDetailUiState.error;
        }
        if ((i & 8) != 0) {
            z2 = botDetailUiState.isBoardLoading;
        }
        if ((i & 16) != 0) {
            boardVar = botDetailUiState.boardInfo;
        }
        if ((i & 32) != 0) {
            str2 = botDetailUiState.boardError;
        }
        Bot.board boardVar2 = boardVar;
        String str3 = str2;
        return botDetailUiState.copy(z, bot_infoVar, str, z2, boardVar2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final Bot.bot_info getBotInfo() {
        return this.botInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsBoardLoading() {
        return this.isBoardLoading;
    }

    /* renamed from: component5, reason: from getter */
    public final Bot.board getBoardInfo() {
        return this.boardInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final String getBoardError() {
        return this.boardError;
    }

    public final BotDetailUiState copy(boolean isLoading, Bot.bot_info botInfo, String error, boolean isBoardLoading, Bot.board boardInfo, String boardError) {
        return new BotDetailUiState(isLoading, botInfo, error, isBoardLoading, boardInfo, boardError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BotDetailUiState)) {
            return false;
        }
        BotDetailUiState botDetailUiState = (BotDetailUiState) other;
        return this.isLoading == botDetailUiState.isLoading && Intrinsics.areEqual(this.botInfo, botDetailUiState.botInfo) && Intrinsics.areEqual(this.error, botDetailUiState.error) && this.isBoardLoading == botDetailUiState.isBoardLoading && Intrinsics.areEqual(this.boardInfo, botDetailUiState.boardInfo) && Intrinsics.areEqual(this.boardError, botDetailUiState.boardError);
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.isLoading) * 31) + (this.botInfo == null ? 0 : this.botInfo.hashCode())) * 31) + (this.error == null ? 0 : this.error.hashCode())) * 31) + Boolean.hashCode(this.isBoardLoading)) * 31) + (this.boardInfo == null ? 0 : this.boardInfo.hashCode())) * 31) + (this.boardError != null ? this.boardError.hashCode() : 0);
    }

    public String toString() {
        return "BotDetailUiState(isLoading=" + this.isLoading + ", botInfo=" + this.botInfo + ", error=" + this.error + ", isBoardLoading=" + this.isBoardLoading + ", boardInfo=" + this.boardInfo + ", boardError=" + this.boardError + ")";
    }

    public BotDetailUiState(boolean isLoading, Bot.bot_info botInfo, String error, boolean isBoardLoading, Bot.board boardInfo, String boardError) {
        this.isLoading = isLoading;
        this.botInfo = botInfo;
        this.error = error;
        this.isBoardLoading = isBoardLoading;
        this.boardInfo = boardInfo;
        this.boardError = boardError;
    }

    public /* synthetic */ BotDetailUiState(boolean z, Bot.bot_info bot_infoVar, String str, boolean z2, Bot.board boardVar, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : bot_infoVar, (i & 4) != 0 ? null : str, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : boardVar, (i & 32) != 0 ? null : str2);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final Bot.bot_info getBotInfo() {
        return this.botInfo;
    }

    public final String getError() {
        return this.error;
    }

    public final boolean isBoardLoading() {
        return this.isBoardLoading;
    }

    public final Bot.board getBoardInfo() {
        return this.boardInfo;
    }

    public final String getBoardError() {
        return this.boardError;
    }
}
