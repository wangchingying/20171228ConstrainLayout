package com.cyw.a20171228constrainlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {

    EditText et1;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        et1=findViewById(R.id.editText2);
        b1=findViewById(R.id.button4);
        b2=findViewById(R.id.button5);
    }
    public void clickok(View v)
    {
        Intent it=new Intent();//new intent
        it.putExtra("myresult",et1.getText().toString());//把值放進去
        setResult(RESULT_OK,it);    //將結果放入result,才能讓第一頁的onActivityResult接收
                                    //onActivityResult(int requestCode, int resultCode, Intent data)
        finish();
    }
    public void clickcancel(View v)
    {
        finish();
    }
}
