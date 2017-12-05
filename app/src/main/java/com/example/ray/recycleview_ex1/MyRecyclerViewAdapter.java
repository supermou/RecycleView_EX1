package com.example.ray.recycleview_ex1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Ray on 2017/12/5.
 */

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {

    String[] dataList;
    Context context;

    public MyRecyclerViewAdapter(Context context, String[] dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    //建立ViewHolder讓RecyclerView自行處理回收機制
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.recycler_view_main, parent, false);
        return new ViewHolder(v);       //指須要回傳layout的view
    }

    //處理view的內容
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.item.setText(dataList[position]);
    }

    @Override
    public int getItemCount() {
        return dataList.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView item;

        public ViewHolder(View itemView) {
            super(itemView);        //一定要call super(itemView), 讓系統知道layout的view
            item = itemView.findViewById(R.id.txtView_item);    //在new ViewHolder的時候即找到對應的View
        }
    }
}
