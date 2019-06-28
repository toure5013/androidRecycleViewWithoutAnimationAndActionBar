package com.example.rvitemanimation;

public class NewsItem {
    String Title, Content, Date;

    int userPhoto;

    public NewsItem(){

    }


    public NewsItem(String tile, String content, String date, int userPhoto) {
        Title = tile;
        Content = content;
        Date = date;
        this.userPhoto = userPhoto;
    }


    //Les getters pour nous retourner les différents titres, contenus et date.

    public String getTitle() {
        return Title;
    }

    public String getContent() {
        return Content;
    }

    public String getDate() {return Date; }

    public int getUserPhoto() {
        return userPhoto;
    }


}
