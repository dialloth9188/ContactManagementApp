package com.thd.contactsapp.data.localdatasource

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.thd.contactsapp.data.model.Contact

@Database(entities = [Contact::class], version = 2)
abstract class ContactDatabase : RoomDatabase() {
    abstract fun doa(): ContactDao
    companion object {
        var INSTANCE: ContactDatabase? = null
        fun getDatabaseInstance(context: Context): ContactDatabase {

            if (INSTANCE== null) {
                synchronized(this) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        ContactDatabase::class.java,
                        "contact_db"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                }
            }
            return  INSTANCE!!
        }
    }
}