package com.yhchat.canarys.data.local;

import android.content.Context;
import android.content.SharedPreferences;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReadPositionStore.kt */
@Singleton
@Metadata(m168d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J&\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010J$\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00122\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u0013\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0018\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, m169d2 = {"Lcom/yhchat/canarys/data/local/ReadPositionStore;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "prefs", "Landroid/content/SharedPreferences;", "saveReadPosition", "", ChatSearchActivity.EXTRA_CHAT_ID, "", ChatSearchActivity.EXTRA_CHAT_TYPE, "", "msgId", "msgSeq", "", "getReadPosition", "Lkotlin/Pair;", "clearReadPosition", "getKey", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes7.dex */
public final class ReadPositionStore {
    public static final int $stable = 8;
    private final SharedPreferences prefs;

    @Inject
    public ReadPositionStore(@ApplicationContext Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("read_position_prefs", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.prefs = sharedPreferences;
    }

    public final void saveReadPosition(String chatId, int chatType, String msgId, long msgSeq) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(msgId, "msgId");
        String key = getKey(chatId, chatType);
        this.prefs.edit().putString(key + "_msgId", msgId).putLong(key + "_msgSeq", msgSeq).apply();
    }

    public final Pair<String, Long> getReadPosition(String chatId, int chatType) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        String key = getKey(chatId, chatType);
        String msgId = this.prefs.getString(key + "_msgId", null);
        long msgSeq = this.prefs.getLong(key + "_msgSeq", -1L);
        if (msgId == null || msgSeq == -1) {
            return null;
        }
        return new Pair<>(msgId, Long.valueOf(msgSeq));
    }

    public final void clearReadPosition(String chatId, int chatType) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        String key = getKey(chatId, chatType);
        this.prefs.edit().remove(key + "_msgId").remove(key + "_msgSeq").apply();
    }

    private final String getKey(String chatId, int chatType) {
        return chatType + "_" + chatId;
    }
}
