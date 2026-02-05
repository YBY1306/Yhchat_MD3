package com.yhchat.canarys.data.local;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SecureTokenStorage.kt */
@Metadata(m168d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\tJ\u0006\u0010\u0017\u001a\u00020\tR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, m169d2 = {"Lcom/yhchat/canarys/data/local/SecureTokenStorage;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "encryptedPrefs", "Landroid/content/SharedPreferences;", "saveAccountToken", "", "userId", "", "token", "getAccountToken", "removeAccountToken", "saveUserToken", "getUserToken", "getUserId", "getLastLoginTime", "", "hasValidToken", "", "clearTokens", "clearAll", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes7.dex */
public final class SecureTokenStorage {
    private static final String KEY_LAST_LOGIN_TIME = "last_login_time";
    private static final String KEY_USER_ID = "user_id";
    private static final String KEY_USER_TOKEN = "user_token";
    private static final String PREFS_NAME = "yhchat_secure_tokens";
    private final SharedPreferences encryptedPrefs;
    public static final int $stable = 8;

    public SecureTokenStorage(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            String masterKeyAlias = MasterKeys.getOrCreate(MasterKeys.AES256_GCM_SPEC);
            Intrinsics.checkNotNullExpressionValue(masterKeyAlias, "getOrCreate(...)");
            SharedPreferences sharedPreferencesCreate = EncryptedSharedPreferences.create(PREFS_NAME, masterKeyAlias, context, EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
            Intrinsics.checkNotNullExpressionValue(sharedPreferencesCreate, "create(...)");
            this.encryptedPrefs = sharedPreferencesCreate;
        } catch (Exception e) {
            throw new RuntimeException("\u65e0\u6cd5\u521b\u5efa\u5b89\u5168\u5b58\u50a8\uff0c\u8bf7\u68c0\u67e5\u8bbe\u5907\u517c\u5bb9\u6027", e);
        }
    }

    public final void saveAccountToken(String userId, String token) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(token, "token");
        this.encryptedPrefs.edit().putString("token_" + userId, token).apply();
    }

    public final String getAccountToken(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        return this.encryptedPrefs.getString("token_" + userId, null);
    }

    public final void removeAccountToken(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.encryptedPrefs.edit().remove("token_" + userId).apply();
    }

    public final void saveUserToken(String token, String userId) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.encryptedPrefs.edit().putString(KEY_USER_TOKEN, token).putString(KEY_USER_ID, userId).putLong(KEY_LAST_LOGIN_TIME, System.currentTimeMillis()).apply();
        if (userId.length() > 0) {
            saveAccountToken(userId, token);
        }
    }

    public final String getUserToken() {
        return this.encryptedPrefs.getString(KEY_USER_TOKEN, null);
    }

    public final String getUserId() {
        return this.encryptedPrefs.getString(KEY_USER_ID, null);
    }

    public final long getLastLoginTime() {
        return this.encryptedPrefs.getLong(KEY_LAST_LOGIN_TIME, 0L);
    }

    public final boolean hasValidToken() {
        String token = getUserToken();
        String str = token;
        return !(str == null || str.length() == 0);
    }

    public final void clearTokens() {
        this.encryptedPrefs.edit().remove(KEY_USER_TOKEN).remove(KEY_USER_ID).remove(KEY_LAST_LOGIN_TIME).apply();
    }

    public final void clearAll() {
        this.encryptedPrefs.edit().clear().apply();
    }
}
