package com.example.myapplication.recycleview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.R;
import com.example.myapplication.listview.MyListViewActivity;

public class RecycleViewActivity extends Activity {
    private Button linearReBt;
    private Button listBt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.recycle_view_activity);
        linearReBt=findViewById(R.id.licy1);
        linearReBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(RecycleViewActivity.this,LinearRecycleViewActivity.class);
                startActivity(intent);
            }
        });
        listBt=findViewById(R.id.listBt);
        listBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(RecycleViewActivity.this, MyListViewActivity.class);
                startActivity(intent);
            }
        });
    }
}
