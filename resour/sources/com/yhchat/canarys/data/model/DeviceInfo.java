package com.yhchat.canarys.data.model;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ComputerKt;
import androidx.compose.material.icons.filled.DeviceHubKt;
import androidx.compose.material.icons.filled.LanguageKt;
import androidx.compose.material.icons.filled.PhoneKt;
import androidx.compose.p000ui.graphics.vector.ImageVector;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceInfo.kt */
@Metadata(m168d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0003J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001f"}, m169d2 = {"Lcom/yhchat/canarys/data/model/DeviceInfo;", "", "userId", "", "platform", "deviceId", "loginTimestamp", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getUserId", "()Ljava/lang/String;", "getPlatform", "getDeviceId", "getLoginTimestamp", "()J", "getPlatformDisplayName", "getPlatformIcon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getFormattedLoginTime", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class DeviceInfo {
    public static final int $stable = 0;
    private final String deviceId;
    private final long loginTimestamp;
    private final String platform;
    private final String userId;

    public static /* synthetic */ DeviceInfo copy$default(DeviceInfo deviceInfo, String str, String str2, String str3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceInfo.userId;
        }
        if ((i & 2) != 0) {
            str2 = deviceInfo.platform;
        }
        if ((i & 4) != 0) {
            str3 = deviceInfo.deviceId;
        }
        if ((i & 8) != 0) {
            j = deviceInfo.loginTimestamp;
        }
        String str4 = str3;
        return deviceInfo.copy(str, str2, str4, j);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component4, reason: from getter */
    public final long getLoginTimestamp() {
        return this.loginTimestamp;
    }

    public final DeviceInfo copy(String userId, String platform, String deviceId, long loginTimestamp) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        return new DeviceInfo(userId, platform, deviceId, loginTimestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) other;
        return Intrinsics.areEqual(this.userId, deviceInfo.userId) && Intrinsics.areEqual(this.platform, deviceInfo.platform) && Intrinsics.areEqual(this.deviceId, deviceInfo.deviceId) && this.loginTimestamp == deviceInfo.loginTimestamp;
    }

    public int hashCode() {
        return (((((this.userId.hashCode() * 31) + this.platform.hashCode()) * 31) + this.deviceId.hashCode()) * 31) + Long.hashCode(this.loginTimestamp);
    }

    public String toString() {
        return "DeviceInfo(userId=" + this.userId + ", platform=" + this.platform + ", deviceId=" + this.deviceId + ", loginTimestamp=" + this.loginTimestamp + ")";
    }

    public DeviceInfo(String userId, String platform, String deviceId, long loginTimestamp) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        this.userId = userId;
        this.platform = platform;
        this.deviceId = deviceId;
        this.loginTimestamp = loginTimestamp;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final long getLoginTimestamp() {
        return this.loginTimestamp;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public final String getPlatformDisplayName() {
        String lowerCase = this.platform.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        switch (lowerCase.hashCode()) {
            case -861391249:
                if (lowerCase.equals("android")) {
                    return "Android";
                }
                break;
            case 104461:
                if (lowerCase.equals("ios")) {
                    return "iOS";
                }
                break;
            case 107855:
                if (lowerCase.equals("mac")) {
                    return "macOS";
                }
                break;
            case 117588:
                if (lowerCase.equals("web")) {
                    return "\u7f51\u9875\u7248";
                }
                break;
            case 102977780:
                if (lowerCase.equals("linux")) {
                    return "Linux";
                }
                break;
            case 1349493379:
                if (lowerCase.equals("windows")) {
                    return "Windows";
                }
                break;
        }
        return this.platform;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public final ImageVector getPlatformIcon() {
        String lowerCase = this.platform.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        switch (lowerCase.hashCode()) {
            case -861391249:
                if (lowerCase.equals("android")) {
                    return PhoneKt.getPhone(Icons.Filled.INSTANCE);
                }
                break;
            case 104461:
                if (lowerCase.equals("ios")) {
                    return PhoneKt.getPhone(Icons.Filled.INSTANCE);
                }
                break;
            case 107855:
                if (lowerCase.equals("mac")) {
                    return ComputerKt.getComputer(Icons.Filled.INSTANCE);
                }
                break;
            case 117588:
                if (lowerCase.equals("web")) {
                    return LanguageKt.getLanguage(Icons.Filled.INSTANCE);
                }
                break;
            case 102977780:
                if (lowerCase.equals("linux")) {
                    return ComputerKt.getComputer(Icons.Filled.INSTANCE);
                }
                break;
            case 1349493379:
                if (lowerCase.equals("windows")) {
                    return ComputerKt.getComputer(Icons.Filled.INSTANCE);
                }
                break;
        }
        return DeviceHubKt.getDeviceHub(Icons.Filled.INSTANCE);
    }

    public final String getFormattedLoginTime() {
        try {
            Date date = new Date(this.loginTimestamp * 1000);
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
            String str = formatter.format(date);
            Intrinsics.checkNotNull(str);
            return str;
        } catch (Exception e) {
            return "\u672a\u77e5\u65f6\u95f4";
        }
    }
}
