

package com.domain;


public class Track {
    
    private int id;
    private String name;
    private int userID;
    
    public Track(int id, String name, int userID){
        this.id = id;
        this.name = name;
        this.userID = userID;
    }
    
    public Track(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
