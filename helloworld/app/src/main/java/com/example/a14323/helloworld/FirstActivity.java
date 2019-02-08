package com.example.a14323.helloworld;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    private Button btn_back;
    private TextView tv_wjmm;
    private Button btn_dl;
    private ImageView imgv_wechat;
    private  ImageView imgv_qq;
    private TextView tv_yhzc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        tv_wjmm=(TextView)findViewById(R.id.tv_wjmm) ;
        tv_wjmm.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        tv_wjmm.getPaint().setAntiAlias(true);




        btn_back=(Button)findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });


        btn_dl=(Button) findViewById(R.id.btn_dl);
        btn_dl.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (true)
                {
                    Intent intent = new Intent(FirstActivity.this,zhuyemianActivity.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(FirstActivity.this, "账号或密码不正确", Toast.LENGTH_SHORT).show();
                }

            }
        });

        imgv_wechat=(ImageView)findViewById(R.id.iv_wechat);
        imgv_wechat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });

        imgv_qq=(ImageView)findViewById(R.id.iv_qq);
        imgv_qq.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });

        tv_wjmm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });



        tv_yhzc=(TextView)findViewById(R.id.tv_yhzc);
        tv_yhzc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this,yhzcActivity.class);
                startActivity(intent);
            }
        });
    }
}
