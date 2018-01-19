package com.hchooney.qewqs.recycler_tutorial.Recycler.Exam4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.hchooney.qewqs.recycler_tutorial.DAO.DAO;
import com.hchooney.qewqs.recycler_tutorial.DAO.Listitem;
import com.hchooney.qewqs.recycler_tutorial.R;
import com.hchooney.qewqs.recycler_tutorial.Recycler.Exam4.List.Upper.ListAdapter;

import java.util.ArrayList;

public class RecyclerExam4Activity extends AppCompatActivity {

    private RecyclerView upRecycler;
    public static RecyclerView underRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_exam4);

        init();
        setUI();
    }

    private void init(){
        //res
        upRecycler = (RecyclerView) findViewById(R.id.r_exam4_upper_list);
        upRecycler.setHasFixedSize(true);
        upRecycler.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        underRecycler = (RecyclerView) findViewById(R.id.r_exam4_under_list);
        underRecycler.setHasFixedSize(true);
        underRecycler.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
    }

    private void setUI(){
        upRecycler.setAdapter(new ListAdapter(getApplicationContext()));
        underRecycler.setAdapter(new com.hchooney.qewqs.recycler_tutorial.Recycler.Exam4.List.Under.ListAdapter(getApplicationContext(), DAO.wlist.get(0).getList()));
    }

}
