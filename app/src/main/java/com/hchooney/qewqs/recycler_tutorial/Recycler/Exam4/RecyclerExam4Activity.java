package com.hchooney.qewqs.recycler_tutorial.Recycler.Exam4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.hchooney.qewqs.recycler_tutorial.DAO.Listitem;
import com.hchooney.qewqs.recycler_tutorial.R;
import com.hchooney.qewqs.recycler_tutorial.Recycler.Exam4.List.Upper.ListAdapter;

import java.util.ArrayList;

public class RecyclerExam4Activity extends AppCompatActivity {

    private ArrayList<String> uplist;
    private static ArrayList<Listitem> underlist;

    private RecyclerView upRecycler;
    private static RecyclerView underRecycler;

    private static boolean isFirest = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_exam4);

        init();
        setUI();
        setUnderRecycler(1);
    }

    private void init(){
        //variable
        uplist = new ArrayList<String>();
        underlist = new ArrayList<Listitem>();
        loadData();

        //res
        upRecycler = (RecyclerView) findViewById(R.id.r_exam4_upper_list);
        upRecycler.setHasFixedSize(true);
        upRecycler.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        underRecycler = (RecyclerView) findViewById(R.id.r_exam4_under_list);
        underRecycler.setHasFixedSize(true);
        underRecycler.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
    }

    private void setUI(){
        upRecycler.setAdapter(new ListAdapter(getApplicationContext(), uplist));
        underRecycler.setAdapter(new com.hchooney.qewqs.recycler_tutorial.Recycler.Exam4.List.Under.ListAdapter(getApplicationContext(), underlist));
    }

    private void loadData(){
        for(int i = 1 ; i<13 ; i++){
            uplist.add(i+"");
        }

        for(int i = 0;i<6;i++){
            Listitem listitem = new Listitem();
            listitem.setContext("Item " + (i+1) + " 번째에 대한 내용입니다.");
            listitem.setDate("2017-01-0"+(i+1)+" 0"+(i+1)+":00");
            listitem.setImageURL(1+"");
            listitem.setTitle("Title " + (i+1));
            listitem.setWriter("Writer Number " + (i+1));
            underlist.add(listitem);
        }
    }

    public static void setUnderRecycler(int num){
        underlist.clear();
        for(int i = 0;i<6;i++){
            Listitem listitem = new Listitem();
            listitem.setContext("Item " + (i+1) + " 번째에 대한 내용입니다.");
            listitem.setDate("2017-01-0"+(i+1)+" 0"+(i+1)+":00");
            listitem.setImageURL(num+"");
            listitem.setTitle("Title " + (i+1));
            listitem.setWriter("Writer Number " + (i+1));
            underlist.add(listitem);
        }

        underRecycler.getAdapter().notifyDataSetChanged();

    }

}
