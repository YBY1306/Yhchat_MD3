package com.yhchat.canarys.p007ui.components;

import com.yhchat.canarys.data.model.Expression;
import com.yhchat.canarys.data.model.StickerPack;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExpressionPicker.kt */
@Metadata(m168d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\b\f\u0010\rJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u00c6\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u0005H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nH\u00c6\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\nH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006 "}, m169d2 = {"Lcom/yhchat/canarys/ui/components/ExpressionPickerUiState;", "", "isLoading", "", "expressions", "", "Lcom/yhchat/canarys/data/model/Expression;", "stickerPacks", "Lcom/yhchat/canarys/data/model/StickerPack;", "defaultExpressions", "", "error", "<init>", "(ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "()Z", "getExpressions", "()Ljava/util/List;", "getStickerPacks", "getDefaultExpressions", "getError", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ExpressionPickerUiState {
    public static final int $stable = 8;
    private final List<String> defaultExpressions;
    private final String error;
    private final List<Expression> expressions;
    private final boolean isLoading;
    private final List<StickerPack> stickerPacks;

    public ExpressionPickerUiState() {
        this(false, null, null, null, null, 31, null);
    }

    public static /* synthetic */ ExpressionPickerUiState copy$default(ExpressionPickerUiState expressionPickerUiState, boolean z, List list, List list2, List list3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = expressionPickerUiState.isLoading;
        }
        if ((i & 2) != 0) {
            list = expressionPickerUiState.expressions;
        }
        if ((i & 4) != 0) {
            list2 = expressionPickerUiState.stickerPacks;
        }
        if ((i & 8) != 0) {
            list3 = expressionPickerUiState.defaultExpressions;
        }
        if ((i & 16) != 0) {
            str = expressionPickerUiState.error;
        }
        String str2 = str;
        List list4 = list2;
        return expressionPickerUiState.copy(z, list, list4, list3, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final List<Expression> component2() {
        return this.expressions;
    }

    public final List<StickerPack> component3() {
        return this.stickerPacks;
    }

    public final List<String> component4() {
        return this.defaultExpressions;
    }

    /* renamed from: component5, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final ExpressionPickerUiState copy(boolean isLoading, List<Expression> expressions, List<StickerPack> stickerPacks, List<String> defaultExpressions, String error) {
        Intrinsics.checkNotNullParameter(expressions, "expressions");
        Intrinsics.checkNotNullParameter(stickerPacks, "stickerPacks");
        Intrinsics.checkNotNullParameter(defaultExpressions, "defaultExpressions");
        return new ExpressionPickerUiState(isLoading, expressions, stickerPacks, defaultExpressions, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpressionPickerUiState)) {
            return false;
        }
        ExpressionPickerUiState expressionPickerUiState = (ExpressionPickerUiState) other;
        return this.isLoading == expressionPickerUiState.isLoading && Intrinsics.areEqual(this.expressions, expressionPickerUiState.expressions) && Intrinsics.areEqual(this.stickerPacks, expressionPickerUiState.stickerPacks) && Intrinsics.areEqual(this.defaultExpressions, expressionPickerUiState.defaultExpressions) && Intrinsics.areEqual(this.error, expressionPickerUiState.error);
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.isLoading) * 31) + this.expressions.hashCode()) * 31) + this.stickerPacks.hashCode()) * 31) + this.defaultExpressions.hashCode()) * 31) + (this.error == null ? 0 : this.error.hashCode());
    }

    public String toString() {
        return "ExpressionPickerUiState(isLoading=" + this.isLoading + ", expressions=" + this.expressions + ", stickerPacks=" + this.stickerPacks + ", defaultExpressions=" + this.defaultExpressions + ", error=" + this.error + ")";
    }

    public ExpressionPickerUiState(boolean isLoading, List<Expression> expressions, List<StickerPack> stickerPacks, List<String> defaultExpressions, String error) {
        Intrinsics.checkNotNullParameter(expressions, "expressions");
        Intrinsics.checkNotNullParameter(stickerPacks, "stickerPacks");
        Intrinsics.checkNotNullParameter(defaultExpressions, "defaultExpressions");
        this.isLoading = isLoading;
        this.expressions = expressions;
        this.stickerPacks = stickerPacks;
        this.defaultExpressions = defaultExpressions;
        this.error = error;
    }

    public /* synthetic */ ExpressionPickerUiState(boolean z, List list, List list2, List list3, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2, (i & 8) != 0 ? CollectionsKt.emptyList() : list3, (i & 16) != 0 ? null : str);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final List<Expression> getExpressions() {
        return this.expressions;
    }

    public final List<StickerPack> getStickerPacks() {
        return this.stickerPacks;
    }

    public final List<String> getDefaultExpressions() {
        return this.defaultExpressions;
    }

    public final String getError() {
        return this.error;
    }
}
