package com.example.a14323.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class zhuyemianActivity extends AppCompatActivity implements View.OnClickListener{
    private Fragment_Home fragment_home ;
    private Fragment_richeng fragment_activity ;
    private Fragment_discover fragment_discover ;
    private Fragment_me fragment_me ;
    private Button btn_home;
    private Button btn_activity;
    private Button btn_discover;
    private Button btn_me;
    private Button btn_add;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhuyemian);

        btn_home= (Button) findViewById(R.id.btn_home);
        btn_activity = (Button) findViewById(R.id.btn_activity);
        btn_discover = (Button) findViewById(R.id.btn_discover);
        btn_me = (Button) findViewById(R.id.btn_me);
        btn_add = (Button) findViewById(R.id.btn_add);

        btn_home.setOnClickListener(zhuyemianActivity.this);
        btn_activity.setOnClickListener(zhuyemianActivity.this);
        btn_discover.setOnClickListener(zhuyemianActivity.this);
        btn_me.setOnClickListener(zhuyemianActivity.this);
        btn_add.setOnClickListener(zhuyemianActivity.this);

        fragment_home = new Fragment_Home();
        getFragmentManager().beginTransaction().add(R.id.Frame,fragment_home,"home").commitAllowingStateLoss();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btn_home: {
                    fragment_home = new Fragment_Home();
                    getFragmentManager().beginTransaction().replace(R.id.Frame, fragment_home, "home").commitAllowingStateLoss();
            }break;


            case R.id.btn_activity:
            {
                    fragment_activity = new Fragment_richeng();
                    getFragmentManager().beginTransaction().replace(R.id.Frame, fragment_activity, "activity").commitAllowingStateLoss();
            }break;


            case R.id.btn_discover:
            {
                    fragment_discover = new Fragment_discover();
                    getFragmentManager().beginTransaction().replace(R.id.Frame, fragment_discover, "discover").commitAllowingStateLoss();
            }break;


            case R.id.btn_me:
            {
                    fragment_me = new Fragment_me();
                    getFragmentManager().beginTransaction().replace(R.id.Frame, fragment_me, "me").commitAllowingStateLoss();
            }break;


            case R.id.btn_add:
            {
                Toast.makeText(zhuyemianActivity.this, "嘿  嘿  嘿 。。。", Toast.LENGTH_SHORT).show();
            }break;
        }
    }
}
