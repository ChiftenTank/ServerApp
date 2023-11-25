package com.example.joker.mili;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import static com.example.joker.mili.R.drawable.back_pic;

public class Registering extends AppCompatActivity {

    private Typeface typeface;

    private ImageView back_pic;
    private Button btn_avatar;
    private ImageView edt_avatar;
    private TextView txt_info;
    private EditText edt_name;
    private EditText edt_pass;
    private TextView txt_gen;
    private RadioButton rb_man;
    private RadioButton rb_woman;
    private CheckBox chk_jvs;
    private CheckBox chk_php;
    private CheckBox chk_asp;
    private CheckBox chk_jav;
    private Button btn_reg;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registering);
        setup_toolbar();

        back_pic=(ImageView) findViewById(R.id.background_pic);
        btn_avatar=(Button) findViewById(R.id.btn_avatar);
        edt_avatar=(ImageView) findViewById(R.id.edt_avatar);
        txt_info=(TextView) findViewById(R.id.txt_info);
        edt_name=(EditText) findViewById(R.id.edt_name);
        edt_pass=(EditText) findViewById(R.id.edt_pass);
        txt_gen=(TextView) findViewById(R.id.txt_gen);
        rb_man=(RadioButton) findViewById(R.id.rb_man);
        rb_woman=(RadioButton) findViewById(R.id.rb_woman);
        chk_jvs= (CheckBox) findViewById(R.id.chk_jvs);
        chk_php= (CheckBox) findViewById(R.id.chk_php);
        chk_asp= (CheckBox) findViewById(R.id.chk_asp);
        chk_jav= (CheckBox) findViewById(R.id.chk_jav);
        btn_reg=(Button) findViewById(R.id.btn_reg);

        typeface=Typeface.createFromAsset(getAssets(),"fonts/BOD_I.TTF");
        btn_avatar.setTypeface(typeface);
    }

    private void setup_toolbar(){
        Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        for (int i = 0; i <toolbar.getChildCount(); i++) {
            if (toolbar.getChildAt(i) instanceof TextView) {
                ((TextView) toolbar.getChildAt(i)).setTypeface(typeface);
            }

        }
    }

    
}
