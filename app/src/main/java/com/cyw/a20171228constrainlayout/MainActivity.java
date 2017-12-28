package com.cyw.a20171228constrainlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1,tv4,tv5;
    Button b1,b2,b3,b4;
    EditText et1;
    //final int request_page_2=2;
    final int request_page_3=3;
    final int request_page_4=4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=findViewById(R.id.textView);
        tv1.setText("123");//設定textview內容顯示123
        tv4=findViewById(R.id.textView4);
        tv5=findViewById(R.id.textView5);
        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button8);
        et1=findViewById(R.id.editText);
    }
    public void click1(View v)//按鈕後在123後加上456
    {
        tv1.setText(tv1.getText()+"456");
    }
    public void click2(View v)//按鈕後將第一頁輸入的字傳送並跳到第二頁
    {
        Intent it=new Intent(MainActivity.this,Main2Activity.class);
        //it.putExtra("itname","sentvalue");
        it.putExtra("itname",et1.getText().toString()+" going to page2");
        startActivity(it); //單向 - 丟出intent
    }
    public void click3(View v) //按鈕後跳到第3頁並將第3頁打的字傳回第一頁
    {
        Intent it=new Intent(MainActivity.this,Main3Activity.class);
        startActivityForResult(it,request_page_3);//雙向 - 丟出並接收,用requestCode區分是哪個按鈕
    }
    public void click4(View v)//按鈕後跳到第四頁並將第四頁打的字傳回第一頁
    {
        Intent it=new Intent(MainActivity.this,Main4Activity.class);
        startActivityForResult(it,request_page_4);//雙向
    }
    @Override
    //
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==request_page_3){
            //用下面的if確認是否有輸入值, 有才將數值設定入textview,不然會得空值然後當機
            if (resultCode==RESULT_OK) {
                tv4.setText(data.getStringExtra("myresult"));
            }
        }
        if(requestCode==request_page_4){
            if (resultCode==RESULT_OK) {
                tv5.setText(data.getStringExtra("myresult"));
            }
        }
    }
}
