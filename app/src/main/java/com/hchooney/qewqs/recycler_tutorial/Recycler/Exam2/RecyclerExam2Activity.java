package com.hchooney.qewqs.recycler_tutorial.Recycler.Exam2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.hchooney.qewqs.recycler_tutorial.R;
import com.hchooney.qewqs.recycler_tutorial.Recycler.Exam2.List.ListAdapter;

public class RecyclerExam2Activity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_exam2);

        init();
        setUI();
    }
    private void init(){
        recyclerView = (RecyclerView) findViewById(R.id.r_exam2_list);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
    }

    private void setUI(){
        recyclerView.setAdapter(new ListAdapter(getApplicationContext()));
    }

}
