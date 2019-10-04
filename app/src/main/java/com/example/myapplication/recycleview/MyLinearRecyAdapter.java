package com.example.myapplication.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

public class MyLinearRecyAdapter extends RecyclerView.Adapter<MyLinearRecyAdapter.LinearViewHoloder> {
    private Context mcontext;
    private OnItemClickListener mListener;
    private OnItemLongClistener mLongListener;
    public MyLinearRecyAdapter(Context context,OnItemClickListener listener,OnItemLongClistener llistener){
        this.mcontext=context;
        this.mListener=listener;
        this.mLongListener=llistener;
    }
    public MyLinearRecyAdapter.LinearViewHoloder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LinearViewHoloder(LayoutInflater.from(mcontext).inflate(R.layout.layout_linear_recycle,parent,false));//每个item长什么样子的view（xml布局文件）
    }


    public void onBindViewHolder(@NonNull MyLinearRecyAdapter.LinearViewHoloder holder, final int position) {
         holder.textView.setText("hello recycleView");
         holder.itemView.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 mListener.onClick(position);
             }
         });
         holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
             @Override
             public boolean onLongClick(View view) {
                 mLongListener.onLongClick(position);
                 return true;
             }
         });
    }

    @Override
    public int getItemCount() {
        return 15;
    }

    class LinearViewHoloder extends RecyclerView.ViewHolder {
        private TextView textView;
        public LinearViewHoloder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.tv_rtitle);
        }
    }
    public interface OnItemClickListener{
        public void onClick(int position);
    }
    public interface OnItemLongClistener{
        public void onLongClick(int position);
    }
}