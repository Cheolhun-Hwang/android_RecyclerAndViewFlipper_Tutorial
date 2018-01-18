package com.hchooney.qewqs.recycler_tutorial.Recycler.Exam4.List.Upper;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hchooney.qewqs.recycler_tutorial.R;


/**
 * Created by qewqs on 2018-01-19.
 */

public class ListHolder extends RecyclerView.ViewHolder {
    public TextView textView;


    public ListHolder(View itemView) {
        super(itemView);

        textView = (TextView) itemView.findViewById(R.id.r_exam4_up_textview);
    }
}
