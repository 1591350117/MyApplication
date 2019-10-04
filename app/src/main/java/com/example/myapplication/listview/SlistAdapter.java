package com.example.myapplication.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.myapplication.R;

public class SlistAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater mLaayoutInflater;
    public SlistAdapter(Context content){
        this.mContext=content;
        mLaayoutInflater=LayoutInflater.from(content);
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHoloder holoder=null;
        if(view==null){
            holoder=new ViewHoloder();
            view=mLaayoutInflater.inflate(R.layout.layout_my_listitem,null);
            holoder.img1=view.findViewById(R.id.ig1);
            holoder.img2=view.findViewById(R.id.ig2);
            holoder.img3=view.findViewById(R.id.ig3);
            holoder.tv_ca=view.findViewById(R.id.tv_ca);
            holoder.tv_content=view.findViewById(R.id.tv_content);
            holoder.tv_time=view.findViewById(R.id.tv_time);
            holoder.tv_title=view.findViewById(R.id.tv_title);
            view.setTag(holoder);
        }else{
            holoder=(ViewHoloder) view.getTag();
        }
        holoder.tv_title.setText("这里是标题");
        holoder.tv_time.setText("2019-10-04");
        holoder.tv_content.setText("这里是内容");
        holoder.tv_ca.setText("这里是分类");
        Glide.with(mContext).load("http://img1.imgtn.bdimg.com/it/u=2037944750,611917901&fm=15&gp=0.jpg").into(holoder.img1);
        Glide.with(mContext).load("http://img1.imgtn.bdimg.com/it/u=2037944750,611917901&fm=15&gp=0.jpg").into(holoder.img2);
        Glide.with(mContext).load("http://img1.imgtn.bdimg.com/it/u=2037944750,611917901&fm=15&gp=0.jpg").into(holoder.img3);
        return view;
    }
    static class ViewHoloder{
        private ImageView img1,img2,img3;
        private TextView tv_title,tv_content,tv_time,tv_ca;
    }
}
