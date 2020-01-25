package com.ucs_tgi.voting;

import android.app.Application;

public class GlobalClass extends Application {

    private String UserName;
    private String KID;
    private String QID;


    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getKID() {
        return KID;
    }

    public void setKID(String KID) {
        this.KID = KID;
    }

    public String getQID() {
        return QID;
    }

    public void setQID(String QID) {
        this.QID = QID;
    }
}
