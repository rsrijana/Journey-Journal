package com.example.journeyjournals.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {UserDetails.class} ,version =1)
public abstract class JourneyDatabase extends RoomDatabase {
    public abstract UserDAO getDao();
}
