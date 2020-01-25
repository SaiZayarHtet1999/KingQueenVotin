package com.ucs_tgi.voting.Model;

public class User {
    private String userName;
    private String password;
    private String kingID;
    private String queenID;
    private String testerKing;
    private String testerQueen;

    public String getTesterKing() {
        return testerKing;
    }

    public void setTesterKing(String testerKing) {
        this.testerKing = testerKing;
    }

    public String getTesterQueen() {
        return testerQueen;
    }

    public void setTesterQueen(String testerQueen) {
        this.testerQueen = testerQueen;
    }

    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String userName, String password, String kingID,String queenID, String testerKing,String testerQueen) {
        this.userName = userName;
        this.password = password;
        this.kingID = kingID;
        this.queenID = queenID;
        this.testerKing = testerKing;
        this.testerQueen=testerQueen;

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getKingID() {
        return kingID;
    }

    public void setKingID(String kingID) {
        this.kingID = kingID;
    }
    public String getQueenID() {
        return queenID;
    }

    public void setQueenID(String queenID) {
        this.queenID = queenID;
    }


}
