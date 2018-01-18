package com.hchooney.qewqs.recycler_tutorial.Recycler.Exam4.List.Upper;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

import com.hchooney.qewqs.recycler_tutorial.DAO.DAO;
import com.hchooney.qewqs.recycler_tutorial.DAO.Listitem;
import com.hchooney.qewqs.recycler_tutorial.ImageCTRL.ImageCTRL;
import com.hchooney.qewqs.recycler_tutorial.R;
import com.hchooney.qewqs.recycler_tutorial.Recycler.Exam4.RecyclerExam4Activity;

import java.util.ArrayList;


/**
 * Created by qewqs on 2018-01-19.
 */

public class ListAdapter extends Adapter {
    private Context mContext;
    private ArrayList<String> list;

    public ListAdapter(Context mContext, ArrayList<String> list) {
        this.mContext = mContext;
        this.list = list;
    }

    // Allows to remember the last item shown on screen
    private int lastPosition = -1;

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_r_exam4_up,parent,false);
        ListHolder holder = new ListHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        final ListHolder hold = (ListHolder) holder;

        hold.textView.setText(list.get(position));
        hold.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("upper", "Upper : " + (position+1));
                RecyclerExam4Activity.setUnderRecycler(position+1);
            }
        });

        setAnimation(hold.itemView, position);
    }

    @Override
    public int getItemCount() {
        return DAO.list.size();
    }

    private void setAnimation(View viewToAnimate, int position) {
        // 새로 보여지는 뷰라면 애니메이션을 해줍니다
        if (position > lastPosition) {
            Animation animation = AnimationUtils.loadAnimation(mContext, android.R.anim.fade_in);
            viewToAnimate.startAnimation(animation);
            lastPosition = position;
        }
    }
}
