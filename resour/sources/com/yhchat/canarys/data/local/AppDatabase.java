package com.yhchat.canarys.data.local;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppDatabase.kt */
@Metadata(m168d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&\u00a8\u0006\u000f"}, m169d2 = {"Lcom/yhchat/canarys/data/local/AppDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "userTokenDao", "Lcom/yhchat/canarys/data/local/UserTokenDao;", "cachedConversationDao", "Lcom/yhchat/canarys/data/local/CachedConversationDao;", "cachedMessageDao", "Lcom/yhchat/canarys/data/local/CachedMessageDao;", "blockedUserDao", "Lcom/yhchat/canarys/data/local/BlockedUserDao;", "savedAccountDao", "Lcom/yhchat/canarys/data/local/SavedAccountDao;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes7.dex */
public abstract class AppDatabase extends RoomDatabase {
    private static volatile AppDatabase INSTANCE;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public abstract BlockedUserDao blockedUserDao();

    public abstract CachedConversationDao cachedConversationDao();

    public abstract CachedMessageDao cachedMessageDao();

    public abstract SavedAccountDao savedAccountDao();

    public abstract UserTokenDao userTokenDao();

    /* compiled from: AppDatabase.kt */
    @Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\nR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, m169d2 = {"Lcom/yhchat/canarys/data/local/AppDatabase$Companion;", "", "<init>", "()V", "INSTANCE", "Lcom/yhchat/canarys/data/local/AppDatabase;", "getDatabase", "context", "Landroid/content/Context;", "clearInstance", "", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AppDatabase getDatabase(Context context) {
            AppDatabase appDatabase;
            Intrinsics.checkNotNullParameter(context, "context");
            AppDatabase appDatabase2 = AppDatabase.INSTANCE;
            if (appDatabase2 != null) {
                return appDatabase2;
            }
            synchronized (this) {
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                appDatabase = (AppDatabase) Room.databaseBuilder(applicationContext, AppDatabase.class, "yhchat_database").fallbackToDestructiveMigration().build();
                Companion companion = AppDatabase.INSTANCE;
                AppDatabase.INSTANCE = appDatabase;
            }
            return appDatabase;
        }

        public final void clearInstance() {
            AppDatabase appDatabase = AppDatabase.INSTANCE;
            if (appDatabase != null) {
                appDatabase.close();
            }
            AppDatabase.INSTANCE = null;
        }
    }
}
