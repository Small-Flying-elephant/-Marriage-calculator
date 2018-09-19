package com.smallflyingelephant.pc.youtube.funnyvideo.marriagecalculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by linsheng on 2018/9/19.
 */

class SecondActivity extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent=getIntent();

        String manName = intent.getStringExtra("manName");
        String femaleName = intent.getStringExtra("femaleName");

        //方法二获取方式：
//		Bundle bundle=intent.getExtras();
//		String manName=bundle.getString("manName");
//		String femaleName=bundle.getString("femaleName");

        TextView tv=(TextView) findViewById(R.id.tv);

        //创建一个随机数
        Random rd=new Random();
        int i=rd.nextInt(100);
        tv.setText(manName + "与" + femaleName + "的姻缘值为" + i + "，实乃天作之合");


    }
}
