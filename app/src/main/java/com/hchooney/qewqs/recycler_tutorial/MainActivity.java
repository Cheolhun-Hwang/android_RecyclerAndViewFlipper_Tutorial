package com.hchooney.qewqs.recycler_tutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button R_E1, R_E2, R_E3, R_E4,          //Recycler Exam Activity
                    VP_E1, VP_E2;                   //ViewFlipper Exam Activity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}
