package com.bridou_n.beaconscanner.dagger

import android.content.Context
import androidx.room.Room
import com.bridou_n.beaconscanner.Database.AppDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
object DatabaseModule {

    @JvmStatic @Singleton @Provides
    fun providesAppDb(ctx: Context) : AppDatabase {
        return Room.databaseBuilder(ctx, AppDatabase::class.java, "room_db")
                .fallbackToDestructiveMigration()
                .build()
    }
}
