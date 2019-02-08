package com.example.a14323.helloworld;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class yhzcActivity extends AppCompatActivity {

    private TextView tv_yhxy;
    private TextView tv_yszc;
    private Button btn_back;
    private Button btn_zc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yhzc);

        tv_yhxy=(TextView)findViewById(R.id.tv_yhxy);
        tv_yhxy.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        tv_yhxy.getPaint().setAntiAlias(true);

        tv_yszc=(TextView)findViewById(R.id.tv_yszc);
        tv_yszc.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        tv_yszc.getPaint().setAntiAlias(true);

        tv_yhxy.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });

        tv_yszc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });

        btn_back=(Button)findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(yhzcActivity.this,FirstActivity.class);
                startActivity(intent);
            }
        });

        btn_zc=(Button)findViewById(R.id.btn_zc);
        btn_zc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });
    }
}
