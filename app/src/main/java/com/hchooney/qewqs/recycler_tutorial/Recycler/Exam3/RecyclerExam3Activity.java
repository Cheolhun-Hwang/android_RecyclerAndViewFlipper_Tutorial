package com.hchooney.qewqs.recycler_tutorial.Recycler.Exam3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.hchooney.qewqs.recycler_tutorial.R;
import com.hchooney.qewqs.recycler_tutorial.Recycler.Exam3.List.ListAdapter;

public class RecyclerExam3Activity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_exam3);
        init();
        setUI();
    }
    private void init(){
        recyclerView = (RecyclerView) findViewById(R.id.r_exam3_list);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
    }

    private void setUI(){
        recyclerView.setAdapter(new ListAdapter(getApplicationContext()));
    }
}
