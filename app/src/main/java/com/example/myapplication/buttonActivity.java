package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class buttonActivity extends Activity {

    private Button bt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        bt3=findViewById(R.id.btn_3);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(buttonActivity.this,"我是按钮3，然后被点击了",Toast.LENGTH_LONG).show();
            }
        });
    }
    public void showTextToast(View view){
        Toast.makeText(this,"teextview被点击",Toast.LENGTH_SHORT).show();
    }
    public void showToast(View view){
        Toast.makeText(this,"此按钮被点击了",Toast.LENGTH_LONG).show();
    }

}
