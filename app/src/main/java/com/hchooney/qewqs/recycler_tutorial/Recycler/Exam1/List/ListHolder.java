package com.hchooney.qewqs.recycler_tutorial.Recycler.Exam1.List;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.hchooney.qewqs.recycler_tutorial.R;


/**
 * Created by qewqs on 2018-01-19.
 */

public class ListHolder extends RecyclerView.ViewHolder {
    public ImageView imageview;
    public TextView Title;
    public TextView DateAndWho;
    public Button ContextBTN;

    public ListHolder(View itemView) {
        super(itemView);

        imageview = (ImageView) itemView.findViewById(R.id.r_exam1_image);
        Title = (TextView) itemView.findViewById(R.id.r_exam1_title);
        DateAndWho = (TextView) itemView.findViewById(R.id.r_exam1_date_writer);
        ContextBTN = (Button) itemView.findViewById(R.id.r_exam1_contextBTN);
    }
}
