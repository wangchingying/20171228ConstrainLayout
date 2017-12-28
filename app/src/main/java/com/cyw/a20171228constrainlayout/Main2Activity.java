package com.cyw.a20171228constrainlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv3=findViewById(R.id.textView3);
        Intent it=getIntent();//取得intent
        String str=it.getStringExtra("itname");
        tv3.setText(str);//取得值
    }
}
