package com.example.rod.myapplication;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Rod on 2016/3/16.
 */
public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.viewHolder> {
    private ArrayList<String> items = new ArrayList<>();

    public ItemAdapter(ArrayList<String> items) {
        this.items = items;
    }

    @Override
    public viewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_card, viewGroup, false);
        return new viewHolder(view);

    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);

    }

    @Override
    public void onBindViewHolder(viewHolder viewHolder, int position) {
        String info = items.get(position);
        View view = viewHolder.itemView;
        TextView textView = (TextView) view.findViewById(R.id.info_text);
        textView.setText(info);
        //手動更改高度
        textView.setHeight(200);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class viewHolder extends RecyclerView.ViewHolder {
        public viewHolder(View itemView) {
            super(itemView);
        }
    }
}