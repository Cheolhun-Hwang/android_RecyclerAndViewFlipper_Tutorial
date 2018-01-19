package com.hchooney.qewqs.recycler_tutorial.DAO;

import java.util.ArrayList;

/**
 * Created by hooney on 2018. 1. 19..
 */

public class WordList {
    private int index;
    private String Date;
    private ArrayList<Listitem> list;

    public WordList() {
        this.index = -1;
        this.Date = "";
        this.list = new ArrayList<Listitem>();
    }

    public WordList(int index, ArrayList<Listitem> list, String date) {
        this.index = index;
        this.list = list;
        this.Date = date;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public ArrayList<Listitem> getList() {
        return list;
    }

    public void setList(ArrayList<Listitem> list) {
        this.list = list;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}
