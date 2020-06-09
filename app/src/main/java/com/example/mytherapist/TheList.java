package com.example.mytherapist;
import java.io.Serializable;


public class TheList implements Serializable {

    private String name;
    private String college;
    private int imageRefrence;
    private String infoo;
    private String email;

    public TheList(String name, String college, int imageRefrence, String infoo, String email) {
        this.name = name;
        this.college = college;
        this.imageRefrence = imageRefrence;
        this.infoo = infoo;
        this.email = email;
    }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public int getImageRefrence() {
        return imageRefrence;
    }

    public void setImageRefrence(int imageRefrence) {
        this.imageRefrence = imageRefrence;
    }

    public String getInfoo() {
        return infoo;
    }

    public void setInfoo(String infoo) {
        this.infoo = infoo;
    }
}