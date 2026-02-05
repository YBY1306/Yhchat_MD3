package com.yhchat.canarys.p007ui.expression;

import com.yhchat.canarys.data.model.Expression;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExpressionViewModel.kt */
@Metadata(m168d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u00c6\u0003J/\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\bH\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0019"}, m169d2 = {"Lcom/yhchat/canarys/ui/expression/ExpressionUiState;", "", "expressions", "", "Lcom/yhchat/canarys/data/model/Expression;", "isLoading", "", "error", "", "<init>", "(Ljava/util/List;ZLjava/lang/String;)V", "getExpressions", "()Ljava/util/List;", "()Z", "getError", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ExpressionUiState {
    public static final int $stable = 8;
    private final String error;
    private final List<Expression> expressions;
    private final boolean isLoading;

    public ExpressionUiState() {
        this(null, false, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExpressionUiState copy$default(ExpressionUiState expressionUiState, List list, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = expressionUiState.expressions;
        }
        if ((i & 2) != 0) {
            z = expressionUiState.isLoading;
        }
        if ((i & 4) != 0) {
            str = expressionUiState.error;
        }
        return expressionUiState.copy(list, z, str);
    }

    public final List<Expression> component1() {
        return this.expressions;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final ExpressionUiState copy(List<Expression> expressions, boolean isLoading, String error) {
        Intrinsics.checkNotNullParameter(expressions, "expressions");
        return new ExpressionUiState(expressions, isLoading, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpressionUiState)) {
            return false;
        }
        ExpressionUiState expressionUiState = (ExpressionUiState) other;
        return Intrinsics.areEqual(this.expressions, expressionUiState.expressions) && this.isLoading == expressionUiState.isLoading && Intrinsics.areEqual(this.error, expressionUiState.error);
    }

    public int hashCode() {
        return (((this.expressions.hashCode() * 31) + Boolean.hashCode(this.isLoading)) * 31) + (this.error == null ? 0 : this.error.hashCode());
    }

    public String toString() {
        return "ExpressionUiState(expressions=" + this.expressions + ", isLoading=" + this.isLoading + ", error=" + this.error + ")";
    }

    public ExpressionUiState(List<Expression> expressions, boolean isLoading, String error) {
        Intrinsics.checkNotNullParameter(expressions, "expressions");
        this.expressions = expressions;
        this.isLoading = isLoading;
        this.error = error;
    }

    public /* synthetic */ ExpressionUiState(List list, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str);
    }

    public final List<Expression> getExpressions() {
        return this.expressions;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final String getError() {
        return this.error;
    }
}
