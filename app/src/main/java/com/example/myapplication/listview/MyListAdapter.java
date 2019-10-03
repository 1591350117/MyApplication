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

//Adapter,描述界面的布局
public class MyListAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater mLayoutInflater;
    public MyListAdapter(Context context){
        this.mContext=context;
        mLayoutInflater=LayoutInflater.from(context);
    }
    @Override
    public int getCount() {//获取列表的长度
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
            view=mLayoutInflater.inflate(R.layout.layout_list_item,null);
            holoder=new ViewHoloder();
            holoder.image1=view.findViewById(R.id.iv);
            holoder.tvContent=view.findViewById(R.id.tv_content);
            holoder.tvTime=view.findViewById(R.id.tv_time);
            holoder.tvTitle=view.findViewById(R.id.tv_title);
            view.setTag(holoder);
        }else{
            holoder=(ViewHoloder) view.getTag();
        }
        holoder.tvTitle.setText("这是标题");
        holoder.tvTime.setText("2018-10-3");
        holoder.tvContent.setText("这里是内容");
        /***
         *
         * setText出错，Attempt to invoke virtual method
         * 'void android.widget.TextView.setText(java.lang.CharSequence)' on a null object reference
         * 可能的原因：这是因为在findViewById的时候并没有起作用，没有找到该对象或者没有给变量绑定某个控件
         *
         *
         *
         * ****/
        Glide.with(mContext).load("http://img1.imgtn.bdimg.com/it/u=2037944750,611917901&fm=15&gp=0.jpg").into(holoder.image1);
        return view;
    }
    static class ViewHoloder{
        public TextView tvTitle,tvContent,tvTime;
        public ImageView image1;
    }
}
