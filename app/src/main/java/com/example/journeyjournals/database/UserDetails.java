package com.example.journeyjournals.database;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.lang.reflect.Constructor;

@Entity
public class UserDetails {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String Username;
    private String Email;
    private String Re_Password;
    private String Password;

    public UserDetails(int id, String username, String email, String re_Password, String password) {
        this.id = id;
        Username = username;
        Email = email;
        Re_Password = re_Password;
        Password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getRe_Password() {
        return Re_Password;
    }

    public void setRe_Password(String re_Password) {
        Re_Password = re_Password;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }


}
