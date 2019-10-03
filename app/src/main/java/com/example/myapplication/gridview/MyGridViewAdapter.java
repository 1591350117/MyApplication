package com.example.myapplication.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.myapplication.R;

public class MyGridViewAdapter extends BaseAdapter {
    private Context gContent;
    private LayoutInflater gLayoutInflater;
    public MyGridViewAdapter(Context content){
        this.gContent=content;
         gLayoutInflater=LayoutInflater.from(content);
    }
    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {//描述每个网格长什么样子
        ViewHoloder holder;
        if(view==null){
            view=gLayoutInflater.inflate(R.layout.layout_grid_view,null);

            holder=new ViewHoloder();
            holder.grimg=view.findViewById(R.id.gimage);
            view.setTag(holder);
        }else{
            holder=(ViewHoloder) view.getTag();
        }
        //刚开始时出错，提示：
        //ava.lang.NullPointerException: Argument must not be null,
        // at com.example.myapplication.gridview.MyGridViewAdapter.getView(MyGridViewAdapter.java:46)
        //出现的原因:view=gLayoutInflater.inflate(R.layout.activity_grid_view,null);引用了错误的xml布局文件
       Glide.with(gContent).load("http://img1.imgtn.bdimg.com/it/u=2037944750,611917901&fm=15&gp=0.jpg").into(holder.grimg);
        return view;
    }
    static class ViewHoloder{
        public ImageView grimg;
    }
}
