package com.hchooney.qewqs.recycler_tutorial.Recycler.Exam1.List;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import com.hchooney.qewqs.recycler_tutorial.DAO.DAO;
import com.hchooney.qewqs.recycler_tutorial.DAO.Listitem;
import com.hchooney.qewqs.recycler_tutorial.ImageCTRL.ImageCTRL;
import com.hchooney.qewqs.recycler_tutorial.R;


/**
 * Created by qewqs on 2018-01-19.
 */

public class ListAdapter extends Adapter {
    private Context mContext;

    public ListAdapter(Context mContext) {
        this.mContext = mContext;
    }

    // Allows to remember the last item shown on screen
    private int lastPosition = -1;

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_r_exam1,parent,false);
        ListHolder holder = new ListHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        ListHolder hold = (ListHolder) holder;
        final Listitem item = DAO.list.get(position);

        ImageCTRL.selectImage(hold.imageview, item.getImageURL());
        hold.Title.setText(item.getTitle());
        hold.DateAndWho.setText(item.getDate() + " ("+item.getWriter()+")");
        hold.ContextBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "내용 : " + item.getContext(), Toast.LENGTH_LONG).show();
            }
        });
        hold.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "Item : " + position, Toast.LENGTH_LONG).show();
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
