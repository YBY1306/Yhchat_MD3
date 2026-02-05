package com.yhchat.canarys.p007ui.settings;

import com.yhchat.canarys.data.model.DeviceInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceViewModel.kt */
@Metadata(m168d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u00c6\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\bH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0019"}, m169d2 = {"Lcom/yhchat/canarys/ui/settings/DeviceState;", "", "isLoading", "", "devices", "", "Lcom/yhchat/canarys/data/model/DeviceInfo;", "error", "", "<init>", "(ZLjava/util/List;Ljava/lang/String;)V", "()Z", "getDevices", "()Ljava/util/List;", "getError", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class DeviceState {
    public static final int $stable = 8;
    private final List<DeviceInfo> devices;
    private final String error;
    private final boolean isLoading;

    public DeviceState() {
        this(false, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceState copy$default(DeviceState deviceState, boolean z, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = deviceState.isLoading;
        }
        if ((i & 2) != 0) {
            list = deviceState.devices;
        }
        if ((i & 4) != 0) {
            str = deviceState.error;
        }
        return deviceState.copy(z, list, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final List<DeviceInfo> component2() {
        return this.devices;
    }

    /* renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final DeviceState copy(boolean isLoading, List<DeviceInfo> devices, String error) {
        Intrinsics.checkNotNullParameter(devices, "devices");
        return new DeviceState(isLoading, devices, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceState)) {
            return false;
        }
        DeviceState deviceState = (DeviceState) other;
        return this.isLoading == deviceState.isLoading && Intrinsics.areEqual(this.devices, deviceState.devices) && Intrinsics.areEqual(this.error, deviceState.error);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isLoading) * 31) + this.devices.hashCode()) * 31) + (this.error == null ? 0 : this.error.hashCode());
    }

    public String toString() {
        return "DeviceState(isLoading=" + this.isLoading + ", devices=" + this.devices + ", error=" + this.error + ")";
    }

    public DeviceState(boolean isLoading, List<DeviceInfo> devices, String error) {
        Intrinsics.checkNotNullParameter(devices, "devices");
        this.isLoading = isLoading;
        this.devices = devices;
        this.error = error;
    }

    public /* synthetic */ DeviceState(boolean z, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : str);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final List<DeviceInfo> getDevices() {
        return this.devices;
    }

    public final String getError() {
        return this.error;
    }
}
