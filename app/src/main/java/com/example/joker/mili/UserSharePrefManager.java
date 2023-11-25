package com.example.joker.mili;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Joker on 1/18/2020.
 */

public class UserSharePrefManager {

    //**Name of the Space that Android will give to every app (USER_PREF_SHARED_NAME) ke ma in esmo gozashtim**//
    private static final String USER_PREF_SHARED_NAME="Pref_Shared";

    private SharedPreferences sharedpreferences;

    private static final String KEY_USER_NAME="user_name";
    private static final String KEY_PASSWORD="pass";
    private static final String KEY_GENDER="gen";
    private static final String KEY_HTML="ishtmlexpert";
    private static final String KEY_CSS="iscssexpert";
    private static final String KEY_JAVA="isjavaexpert";




    //**Constructor Class (Name of Constructor Will Always be the same as the Name of Class**//
   public UserSharePrefManager (Context cntxt){
       sharedpreferences=cntxt.getSharedPreferences(USER_PREF_SHARED_NAME,cntxt.MODE_PRIVATE);
    }

    public void Save_User_In_Share(User user){
        if(user != null){
            SharedPreferences.Editor editor=sharedpreferences.edit();
            editor.putString(KEY_USER_NAME,user.getUser_name());
            editor.putString(KEY_PASSWORD,user.getPass());
            editor.putInt(KEY_GENDER,user.getGen());
            editor.putBoolean(KEY_HTML,user.ishtmlexpert());
            editor.putBoolean(KEY_CSS,user.iscssexpert());
            editor.putBoolean(KEY_JAVA,user.isjavaexpert());
     editor.apply();
        }
    }

    public User GetUserFromShare(){
     User  user=new User();
        user.setUser_name(sharedpreferences.getString(KEY_USER_NAME,""));
        user.setPass(sharedpreferences.getString(KEY_USER_NAME,""));
        user.setGen(sharedpreferences.getInt(KEY_GENDER,0));
        user.setIshtmlexpert(sharedpreferences.getBoolean(KEY_HTML,false));
        user.setIscssexpert(sharedpreferences.getBoolean(KEY_CSS,false));
        user.setIsjavaexpert(sharedpreferences.getBoolean(KEY_JAVA,false));

        return user;
    }

}
