package com.cyw.a20171228constrainlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main4Activity extends AppCompatActivity {

    EditText et1;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        et1=findViewById(R.id.editText3);
    }
    public void clickok(View v)
    {
        Intent it=new Intent();
        it.putExtra("myresult",et1.getText().toString());
        setResult(RESULT_OK,it);
        finish();
    }
    public void clickcancel(View v)
    {
        finish();
    }
}
