package com.example.myapplication;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

//https://github.com/bumptech/glide   第三方图像加载库
//此处使用glide第三方库的时候，修改了app文件夹下面的build.gradle文件
public class ImageActivity extends Activity {

    private ImageView image1;
    //加载网络资源需要网络权限，在AndroidMainfest中申请
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        image1=findViewById(R.id.net_Img);
        Glide.with(this).load("http://img1.imgtn.bdimg.com/it/u=2037944750,611917901&fm=15&gp=0.jpg").into(image1);
    }
}
