package com.hchooney.qewqs.recycler_tutorial.Recycler.Exam1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.hchooney.qewqs.recycler_tutorial.R;
import com.hchooney.qewqs.recycler_tutorial.DAO.Listitem;
import com.hchooney.qewqs.recycler_tutorial.Recycler.Exam1.List.ListAdapter;

import java.util.ArrayList;

public class RecyclerExam1Activity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_exam1);

        init();
        setUI();
    }

    private void init(){
        recyclerView = (RecyclerView) findViewById(R.id.r_exam1_list);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
    }

    private void setUI(){
        recyclerView.setAdapter(new ListAdapter(getApplicationContext()));
    }

}
