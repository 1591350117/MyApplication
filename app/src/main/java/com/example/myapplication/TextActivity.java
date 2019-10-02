package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.TextView;

public class TextActivity extends Activity {
    private TextView mytx;
    private TextView underTx;
    private TextView RunText;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
         mytx = findViewById(R.id.tv_5);
         mytx.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);//中划线
        mytx.getPaint().setAntiAlias(true);//去除锯齿
        underTx=findViewById(R.id.tv_3);
        underTx.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);//下划线
        RunText=findViewById(R.id.tv_6);
        RunText.setSelected(true);
    }
}
