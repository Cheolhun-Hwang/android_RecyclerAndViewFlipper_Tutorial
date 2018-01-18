package com.hchooney.qewqs.recycler_tutorial.DAO;

import java.util.ArrayList;

/**
 * Created by qewqs on 2018-01-19.
 */

public class DAO {
    public static ArrayList<Listitem> list;

    public static void initList(){
        DAO.list = new ArrayList<Listitem>();
    }

    public static void setList(){
        for(int i = 1 ; i<=6;i++){
            Listitem listitem = new Listitem();
            listitem.setContext("Item " + i + " 번째에 대한 내용입니다.");
            listitem.setDate("2017-01-0"+i+" 0"+i+":00");
            listitem.setImageURL(i+"");
            listitem.setTitle("Title " + i);
            listitem.setWriter("Writer Number " + i);
            DAO.list.add(listitem);
        }
    }
}
