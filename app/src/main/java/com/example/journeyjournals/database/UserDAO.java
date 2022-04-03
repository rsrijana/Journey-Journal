package com.example.journeyjournals.database;


import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;


@Dao
public interface UserDAO {
    @Insert
    void insertUser(UserDetails userDetails);

    @Query("Select exists (Select * from UserDetails where Email=:Email)")
    boolean is_taken(String Email);

    @Query("Select exists (Select * from UserDetails where Email=:Email and Password=:Password)")
    boolean login(String Email, String Password);

}
