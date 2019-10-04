package com.example.myapplication.recycleview;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

public class LinearRecycleViewActivity extends Activity {
    private RecyclerView mRe;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_recycle_view_activity);
        mRe=findViewById(R.id.recycleView1);
        mRe.setLayoutManager(new LinearLayoutManager(LinearRecycleViewActivity.this));
        mRe.setAdapter(new MyLinearRecyAdapter(LinearRecycleViewActivity.this,new MyLinearRecyAdapter.OnItemClickListener(){
            public void onClick(int position) {
                Toast.makeText(LinearRecycleViewActivity.this,"项目"+position+"被点击",Toast.LENGTH_SHORT).show();
            }
        },new MyLinearRecyAdapter.OnItemLongClistener(){
            @Override
            public void onLongClick(int position) {
                Toast.makeText(LinearRecycleViewActivity.this,"项目"+position+"被长按",Toast.LENGTH_SHORT).show();
            }
        }));
        mRe.addItemDecoration(new MyDecoration());//设置分割线，此处分割线默认为recycleview的背景颜色，自定义分割线的颜色用ondraw方法
    }
    class MyDecoration extends RecyclerView.ItemDecoration {
        @Override
        public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
            outRect.set(0,0,0,getResources().getDimensionPixelOffset(R.dimen.dividerHeight));
        }
    }
}
