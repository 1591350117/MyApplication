package com.example.myapplication.listview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.myapplication.R;

public class MyListViewActivity extends Activity {
    private ListView mLi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_list_view_activity);
        mLi=findViewById(R.id.myList);
        mLi.setAdapter(new SlistAdapter(MyListViewActivity.this));
    }
}
