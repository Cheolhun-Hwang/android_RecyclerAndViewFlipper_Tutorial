package com.hchooney.qewqs.recycler_tutorial.Recycler.Exam3.List;

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

    public ListHolder(View itemView) {
        super(itemView);

        imageview = (ImageView) itemView.findViewById(R.id.r_exam3_image);
        Title = (TextView) itemView.findViewById(R.id.r_exam3_title);
        DateAndWho = (TextView) itemView.findViewById(R.id.r_exam3_dateAndWho);
    }
}
