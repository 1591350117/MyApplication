package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    private Button textBu;
    private Button buBu;
    private Button editeBu;
    private Button btnRa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textBu = findViewById(R.id.txbu);//通过id获取button控件
       textBu.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               //点击按钮，完成activity的跳转
               Intent intent=new Intent(MainActivity.this, TextActivity.class);
               startActivity(intent);
           }
       });
    buBu=findViewById(R.id.main_bu);
    buBu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent inntent2=new Intent(MainActivity.this,buttonActivity.class);
            startActivity(inntent2);
        }
    });
    editeBu=findViewById(R.id.editeBu);
    editeBu.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent editIntet=new Intent(MainActivity.this,editeActivity.class);
            startActivity(editIntet);
        }
    });
    btnRa=findViewById(R.id.btn_ra);
    btnRa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent RaIntent =new Intent(MainActivity.this,RadioButtonActivity.class);
            startActivity(RaIntent);
        }
    });
    }
//    private class clickJump implements View.OnClickListener{
//        public void  onClick(View v){
//            Intent intent;
//            switch(v.getId()){
//
//            }
//        }
//    }
}
