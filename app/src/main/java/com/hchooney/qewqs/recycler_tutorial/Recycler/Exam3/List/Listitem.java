package com.hchooney.qewqs.recycler_tutorial.Recycler.Exam3.List;

/**
 * Created by qewqs on 2018-01-18.
 */

public class Listitem {
    private String Title;
    private String Date;
    private String Context;
    private String Writer;
    private String ImageURL;

    public Listitem() {
        this.Title = "";
        this.Date = "";
        this.Context = "";
        this.Writer = "";
        this.ImageURL = "";
    }

    public Listitem(String title, String date, String context, String writer, String imageURL) {
        this.Title = title;
        this.Date = date;
        this.Context = context;
        this.Writer = writer;
        this.ImageURL = imageURL;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getContext() {
        return Context;
    }

    public void setContext(String context) {
        Context = context;
    }

    public String getWriter() {
        return Writer;
    }

    public void setWriter(String writer) {
        Writer = writer;
    }

    public String getImageURL() {
        return ImageURL;
    }

    public void setImageURL(String imageURL) {
        ImageURL = imageURL;
    }
}
