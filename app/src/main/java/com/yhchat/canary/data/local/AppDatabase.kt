package com.yhchat.canary.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.yhchat.canary.data.model.SavedAccount

/**
 * 应用数据库 - 普通存储（移除SQLCipher依赖）
 * 对于敏感数据如Token，我们将使用EncryptedSharedPreferences进行加密存储
 */
@Database(
    entities = [
        UserToken::class, 
        CachedConversation::class, 
        CachedMessage::class, 
        BlockedUser::class, 
        SavedAccount::class,
        CachedDiscoverData::class,
        CachedProfileData::class,
        DownloadedFileRecord::class
    ],
    version = 7,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    
    abstract fun userTokenDao(): UserTokenDao
    abstract fun cachedConversationDao(): CachedConversationDao
    abstract fun cachedMessageDao(): CachedMessageDao
    abstract fun blockedUserDao(): BlockedUserDao
    abstract fun savedAccountDao(): SavedAccountDao
    abstract fun cachedDiscoverDataDao(): CachedDiscoverDataDao
    abstract fun cachedProfileDataDao(): CachedProfileDataDao
    abstract fun downloadedFileRecordDao(): DownloadedFileRecordDao
    
    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null
        
        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "yhchat_database"
                )
                    .fallbackToDestructiveMigration(dropAllTables = true) // 版本升级时重建数据库
                    .build()
                    
                INSTANCE = instance
                instance
            }
        }
        
        /**
         * 清除数据库实例（用于测试或重置）
         */
        fun clearInstance() {
            INSTANCE?.close()
            INSTANCE = null
        }
    }
}
