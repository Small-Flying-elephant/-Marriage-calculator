package com.smallflyingelephant.pc.youtube.funnyvideo.marriagecalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View v) {
        String manName = ((EditText) findViewById(R.id.et_manName)).getText().toString();
        String femaleName = ((EditText) findViewById(R.id.et_femaleName)).getText().toString();
        //方法一：使用Intent意图
        Intent intent = new Intent(this, SecondActivity.class);
        //把数据封装到intent
        intent.putExtra("manName", manName);
        intent.putExtra("femaleName", femaleName);
        startActivity(intent);

        //方法二：Bunddle
//		Bundle bundle=new Bundle();
//		bundle.putString("manName", manName);
//		bundle.putString("femaleName", femaleName);
//		//把bundle放进意图中
//		intent.putExtras(bundle);
//		startActivity(intent);


    }
}
