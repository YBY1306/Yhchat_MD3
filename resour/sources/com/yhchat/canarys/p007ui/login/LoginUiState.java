package com.yhchat.canarys.p007ui.login;

import com.yhchat.canarys.data.model.LoginData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoginViewModel.kt */
@Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J?\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f\u00a8\u0006\u001e"}, m169d2 = {"Lcom/yhchat/canarys/ui/login/LoginUiState;", "", "isLoading", "", "error", "", "loginSuccess", "loginData", "Lcom/yhchat/canarys/data/model/LoginData;", "smsSuccess", "<init>", "(ZLjava/lang/String;ZLcom/yhchat/canarys/data/model/LoginData;Z)V", "()Z", "getError", "()Ljava/lang/String;", "getLoginSuccess", "getLoginData", "()Lcom/yhchat/canarys/data/model/LoginData;", "getSmsSuccess", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class LoginUiState {
    public static final int $stable = 0;
    private final String error;
    private final boolean isLoading;
    private final LoginData loginData;
    private final boolean loginSuccess;
    private final boolean smsSuccess;

    public LoginUiState() {
        this(false, null, false, null, false, 31, null);
    }

    public static /* synthetic */ LoginUiState copy$default(LoginUiState loginUiState, boolean z, String str, boolean z2, LoginData loginData, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = loginUiState.isLoading;
        }
        if ((i & 2) != 0) {
            str = loginUiState.error;
        }
        if ((i & 4) != 0) {
            z2 = loginUiState.loginSuccess;
        }
        if ((i & 8) != 0) {
            loginData = loginUiState.loginData;
        }
        if ((i & 16) != 0) {
            z3 = loginUiState.smsSuccess;
        }
        boolean z4 = z3;
        boolean z5 = z2;
        return loginUiState.copy(z, str, z5, loginData, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getLoginSuccess() {
        return this.loginSuccess;
    }

    /* renamed from: component4, reason: from getter */
    public final LoginData getLoginData() {
        return this.loginData;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getSmsSuccess() {
        return this.smsSuccess;
    }

    public final LoginUiState copy(boolean isLoading, String error, boolean loginSuccess, LoginData loginData, boolean smsSuccess) {
        return new LoginUiState(isLoading, error, loginSuccess, loginData, smsSuccess);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginUiState)) {
            return false;
        }
        LoginUiState loginUiState = (LoginUiState) other;
        return this.isLoading == loginUiState.isLoading && Intrinsics.areEqual(this.error, loginUiState.error) && this.loginSuccess == loginUiState.loginSuccess && Intrinsics.areEqual(this.loginData, loginUiState.loginData) && this.smsSuccess == loginUiState.smsSuccess;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.isLoading) * 31) + (this.error == null ? 0 : this.error.hashCode())) * 31) + Boolean.hashCode(this.loginSuccess)) * 31) + (this.loginData != null ? this.loginData.hashCode() : 0)) * 31) + Boolean.hashCode(this.smsSuccess);
    }

    public String toString() {
        return "LoginUiState(isLoading=" + this.isLoading + ", error=" + this.error + ", loginSuccess=" + this.loginSuccess + ", loginData=" + this.loginData + ", smsSuccess=" + this.smsSuccess + ")";
    }

    public LoginUiState(boolean isLoading, String error, boolean loginSuccess, LoginData loginData, boolean smsSuccess) {
        this.isLoading = isLoading;
        this.error = error;
        this.loginSuccess = loginSuccess;
        this.loginData = loginData;
        this.smsSuccess = smsSuccess;
    }

    public /* synthetic */ LoginUiState(boolean z, String str, boolean z2, LoginData loginData, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : loginData, (i & 16) != 0 ? false : z3);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final String getError() {
        return this.error;
    }

    public final boolean getLoginSuccess() {
        return this.loginSuccess;
    }

    public final LoginData getLoginData() {
        return this.loginData;
    }

    public final boolean getSmsSuccess() {
        return this.smsSuccess;
    }
}
