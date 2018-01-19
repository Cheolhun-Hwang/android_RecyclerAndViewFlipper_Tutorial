package com.hchooney.qewqs.recycler_tutorial.DAO;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by qewqs on 2018-01-19.
 */

public class DAO {
    public static ArrayList<Listitem> list;

    public static ArrayList<WordList> wlist;

    public static void initList(){

        DAO.list = new ArrayList<Listitem>();
        DAO.wlist = new ArrayList<WordList>();
    }

    public static void setList(){
        for(int i = 0;i<6;i++){
            WordList wordList = new WordList();
            wordList.setIndex(i);

            //현재 시간 넣기
            wordList.setDate(Date.getDateAndTimeNOW("MM / dd"));

            ArrayList<Listitem> templist = new ArrayList<Listitem>();
            for(int j=0; j<6;j++){
                Listitem listitem = new Listitem();
                listitem.setContext("Item " + (j+1) + " 번째에 대한 내용입니다.");
                listitem.setDate("2017-01-0"+(j+1)+" 0"+(j+1)+":00");
                listitem.setImageURL((i+1)+"");
                listitem.setTitle("Title " + (j+1));
                listitem.setWriter("Writer Number " + (j+1));
                templist.add(listitem);
            }

            wordList.setList(templist);

            wlist.add(wordList);

        }
    }
}
