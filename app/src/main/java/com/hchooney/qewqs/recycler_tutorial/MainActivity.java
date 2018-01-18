package com.hchooney.qewqs.recycler_tutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hchooney.qewqs.recycler_tutorial.DAO.DAO;
import com.hchooney.qewqs.recycler_tutorial.Recycler.Exam1.RecyclerExam1Activity;
import com.hchooney.qewqs.recycler_tutorial.Recycler.Exam2.RecyclerExam2Activity;
import com.hchooney.qewqs.recycler_tutorial.Recycler.Exam3.RecyclerExam3Activity;
import com.hchooney.qewqs.recycler_tutorial.Recycler.Exam4.RecyclerExam4Activity;
import com.hchooney.qewqs.recycler_tutorial.ViewFlip.Exam1.ViewFlipperExam1Activity;
import com.hchooney.qewqs.recycler_tutorial.ViewFlip.Exam2.ViewFlipperExam2Activity;

import static com.hchooney.qewqs.recycler_tutorial.DAO.DAO.initList;

public class MainActivity extends AppCompatActivity {

    private Button R_E1, R_E2, R_E3, R_E4,          //Recycler Exam Activity
                    VP_E1, VP_E2;                   //ViewFlipper Exam Activity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init(){
        //List Setting
        DAO.initList();
        DAO.setList();

        //Button Resource Setting
        R_E1 = (Button) findViewById(R.id.exam1);
        R_E1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), RecyclerExam1Activity.class));
            }
        });
        R_E2 = (Button) findViewById(R.id.exam2);
        R_E2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), RecyclerExam2Activity.class));
            }
        });
        R_E3 = (Button) findViewById(R.id.exam3);
        R_E3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), RecyclerExam3Activity.class));
            }
        });
        R_E4 = (Button) findViewById(R.id.exam4);
        R_E4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), RecyclerExam4Activity.class));
            }
        });
        VP_E1 = (Button) findViewById(R.id.exam5);
        VP_E1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ViewFlipperExam1Activity.class));
            }
        });
        VP_E2 = (Button) findViewById(R.id.exam6);
        VP_E2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ViewFlipperExam2Activity.class));
            }
        });
    }


}
