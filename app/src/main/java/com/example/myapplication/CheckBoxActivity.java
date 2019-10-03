package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class CheckBoxActivity extends Activity {

    private CheckBox cb1,cb2,cb3;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        cb1=findViewById(R.id.cb_1);
        cb2=findViewById(R.id.cb_2);
        cb3=findViewById(R.id.cb_3);
        cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {//监听checkBox的变化
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(CheckBoxActivity.this,b?"1选中":"1未选中",Toast.LENGTH_SHORT).show();
            }
        });
        cb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {//监听checkBox的变化
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(CheckBoxActivity.this,b?"2选中":"2未选中",Toast.LENGTH_SHORT).show();
            }
        });
        cb3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {//监听checkBox的变化
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(CheckBoxActivity.this,b?"3选中":"3未选中",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
