package com.hchooney.qewqs.recycler_tutorial.Recycler.Exam4.List.Under;

import android.support.v7.widget.RecyclerView;
import android.view.View;
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

        imageview = (ImageView) itemView.findViewById(R.id.r_exam4_under_image);
        Title = (TextView) itemView.findViewById(R.id.r_exam4_under_title);
        DateAndWho = (TextView) itemView.findViewById(R.id.r_exam4_under_dateAndWho);
    }
}
