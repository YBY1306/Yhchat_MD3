package com.yhchat.canarys.p007ui.bot;

import com.yhchat.canarys.data.model.BotInfo;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BotInfoViewModel.kt */
@Metadata(m168d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u00a2\u0006\u0004\b\f\u0010\rJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\u0016\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\b\u001aJG\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000eR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006!"}, m169d2 = {"Lcom/yhchat/canarys/ui/bot/BotInfoUiState;", "", "isLoading", "", "botInfo", "Lcom/yhchat/canarys/data/model/BotInfo;", "error", "", "isAdding", "addResult", "Lkotlin/Result;", "", "<init>", "(ZLcom/yhchat/canarys/data/model/BotInfo;Ljava/lang/String;ZLkotlin/Result;)V", "()Z", "getBotInfo", "()Lcom/yhchat/canarys/data/model/BotInfo;", "getError", "()Ljava/lang/String;", "getAddResult-xLWZpok", "()Lkotlin/Result;", "component1", "component2", "component3", "component4", "component5", "component5-xLWZpok", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BotInfoUiState {
    public static final int $stable = 8;
    private final Result<Unit> addResult;
    private final BotInfo botInfo;
    private final String error;
    private final boolean isAdding;
    private final boolean isLoading;

    public BotInfoUiState() {
        this(false, null, null, false, null, 31, null);
    }

    public static /* synthetic */ BotInfoUiState copy$default(BotInfoUiState botInfoUiState, boolean z, BotInfo botInfo, String str, boolean z2, Result result, int i, Object obj) {
        if ((i & 1) != 0) {
            z = botInfoUiState.isLoading;
        }
        if ((i & 2) != 0) {
            botInfo = botInfoUiState.botInfo;
        }
        if ((i & 4) != 0) {
            str = botInfoUiState.error;
        }
        if ((i & 8) != 0) {
            z2 = botInfoUiState.isAdding;
        }
        if ((i & 16) != 0) {
            result = botInfoUiState.addResult;
        }
        Result result2 = result;
        String str2 = str;
        return botInfoUiState.copy(z, botInfo, str2, z2, result2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final BotInfo getBotInfo() {
        return this.botInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsAdding() {
        return this.isAdding;
    }

    /* renamed from: component5-xLWZpok, reason: not valid java name */
    public final Result<Unit> m10443component5xLWZpok() {
        return this.addResult;
    }

    public final BotInfoUiState copy(boolean isLoading, BotInfo botInfo, String error, boolean isAdding, Result<Unit> addResult) {
        return new BotInfoUiState(isLoading, botInfo, error, isAdding, addResult);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BotInfoUiState)) {
            return false;
        }
        BotInfoUiState botInfoUiState = (BotInfoUiState) other;
        return this.isLoading == botInfoUiState.isLoading && Intrinsics.areEqual(this.botInfo, botInfoUiState.botInfo) && Intrinsics.areEqual(this.error, botInfoUiState.error) && this.isAdding == botInfoUiState.isAdding && Intrinsics.areEqual(this.addResult, botInfoUiState.addResult);
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.isLoading) * 31) + (this.botInfo == null ? 0 : this.botInfo.hashCode())) * 31) + (this.error == null ? 0 : this.error.hashCode())) * 31) + Boolean.hashCode(this.isAdding)) * 31) + (this.addResult != null ? Result.m11924hashCodeimpl(this.addResult.getValue()) : 0);
    }

    public String toString() {
        return "BotInfoUiState(isLoading=" + this.isLoading + ", botInfo=" + this.botInfo + ", error=" + this.error + ", isAdding=" + this.isAdding + ", addResult=" + this.addResult + ")";
    }

    public BotInfoUiState(boolean isLoading, BotInfo botInfo, String error, boolean isAdding, Result<Unit> result) {
        this.isLoading = isLoading;
        this.botInfo = botInfo;
        this.error = error;
        this.isAdding = isAdding;
        this.addResult = result;
    }

    public /* synthetic */ BotInfoUiState(boolean z, BotInfo botInfo, String str, boolean z2, Result result, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : botInfo, (i & 4) != 0 ? null : str, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : result);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final BotInfo getBotInfo() {
        return this.botInfo;
    }

    public final String getError() {
        return this.error;
    }

    public final boolean isAdding() {
        return this.isAdding;
    }

    /* renamed from: getAddResult-xLWZpok, reason: not valid java name */
    public final Result<Unit> m10444getAddResultxLWZpok() {
        return this.addResult;
    }
}
