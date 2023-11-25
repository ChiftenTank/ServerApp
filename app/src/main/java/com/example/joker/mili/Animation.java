package com.example.joker.mili;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Animation extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
    }

    private void setup_buttons(){
        Button btn_alpha=(Button)findViewById(R.id.btn_alpha);
        btn_alpha.setOnClickListener(this);

        Button btn_translate=(Button)findViewById(R.id.btn_translate);
        btn_translate.setOnClickListener(this);

        Button btn_scale=(Button)findViewById(R.id.btn_scale);
        btn_scale.setOnClickListener(this);

        Button btn_rotate=(Button)findViewById(R.id.btn_rotate);
        btn_rotate.setOnClickListener(this);

        Button btn_value=(Button)findViewById(R.id.btn_value);
        btn_value.setOnClickListener(this);

        Button btn_yoyo=(Button)findViewById(R.id.btn_yoyo);
        btn_yoyo.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
       Intent intent=new Intent(this,Animation_Show.class);
        intent.putExtra("key_animation",Integer.parseInt((String) view.getTag()));
        startActivity(intent);
    }
}
