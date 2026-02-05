package com.yhchat.canarys.data.local;

import android.content.Context;
import android.content.SharedPreferences;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DraftStore.kt */
@Singleton
@Metadata(m168d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bJ\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0018\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, m169d2 = {"Lcom/yhchat/canarys/data/local/DraftStore;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "prefs", "Landroid/content/SharedPreferences;", "saveDraft", "", ChatSearchActivity.EXTRA_CHAT_ID, "", ChatSearchActivity.EXTRA_CHAT_TYPE, "", "content", "getDraft", "clearDraft", "getKey", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes7.dex */
public final class DraftStore {
    public static final int $stable = 8;
    private final SharedPreferences prefs;

    @Inject
    public DraftStore(@ApplicationContext Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("chat_draft_prefs", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.prefs = sharedPreferences;
    }

    public final void saveDraft(String chatId, int chatType, String content) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(content, "content");
        String key = getKey(chatId, chatType);
        if (content.length() > 0) {
            this.prefs.edit().putString(key, content).apply();
        } else {
            clearDraft(chatId, chatType);
        }
    }

    public final String getDraft(String chatId, int chatType) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        String key = getKey(chatId, chatType);
        return this.prefs.getString(key, null);
    }

    public final void clearDraft(String chatId, int chatType) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        String key = getKey(chatId, chatType);
        this.prefs.edit().remove(key).apply();
    }

    private final String getKey(String chatId, int chatType) {
        return chatType + "_" + chatId;
    }
}
