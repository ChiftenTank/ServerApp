package com.example.joker.mili;

/**
 * Created by Joker on 1/18/2020.
 */

public class User {
    private String user_name;
    private String pass;
    public static final int MALE=0;
    public static final int FEMALE=1;
    private int gen=MALE;
    private boolean ishtmlexpert;
    private boolean iscssexpert;
    private boolean isjavaexpert;


    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String usr_nme) {
        this.user_name = usr_nme;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getGen() {
        return gen;
    }

    public void setGen(int gen) {
        this.gen = gen;
    }

    public boolean ishtmlexpert() {
        return ishtmlexpert;
    }

    public void setIshtmlexpert(boolean ishtmlexpert) {
        this.ishtmlexpert = ishtmlexpert;
    }

    public boolean iscssexpert() {
        return iscssexpert;
    }

    public void setIscssexpert(boolean iscssexpert) {
        this.iscssexpert = iscssexpert;
    }

    public boolean isjavaexpert() {
        return isjavaexpert;
    }

    public void setIsjavaexpert(boolean isjavaexpert) {
        this.isjavaexpert = isjavaexpert;
    }
}
