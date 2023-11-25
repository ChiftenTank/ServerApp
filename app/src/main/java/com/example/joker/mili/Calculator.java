package com.example.joker.mili;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    private int No1 , No2;
    private String operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        final TextView txt_res=(TextView) findViewById(R.id.txt_result);
        final TextView txt_sto=(TextView) findViewById(R.id.txt_store);

        ImageButton img0=(ImageButton) findViewById(R.id.btn0);
        ImageButton img1=(ImageButton) findViewById(R.id.btn1);
        ImageButton img2=(ImageButton) findViewById(R.id.btn2);
        ImageButton img3=(ImageButton) findViewById(R.id.btn3);
        ImageButton img4=(ImageButton) findViewById(R.id.btn4);
        ImageButton img5=(ImageButton) findViewById(R.id.btn5);
        ImageButton img6=(ImageButton) findViewById(R.id.btn6);
        ImageButton img7=(ImageButton) findViewById(R.id.btn7);
        ImageButton img8=(ImageButton) findViewById(R.id.btn8);
        ImageButton img9=(ImageButton) findViewById(R.id.btn9);

        ImageButton imgdiv=(ImageButton) findViewById(R.id.btn_div);
        ImageButton imgmul=(ImageButton) findViewById(R.id.btn_mul);
        ImageButton imgmin=(ImageButton) findViewById(R.id.btn_min);
        ImageButton imgsum=(ImageButton) findViewById(R.id.btn_sum);
        ImageButton imgequ=(ImageButton) findViewById(R.id.btn_equ);
        ImageButton imgclr=(ImageButton) findViewById(R.id.btn_clr);

        img0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               txt_res.setText (txt_res.getText().toString()+"0");
            }
        });

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_res.setText (txt_res.getText().toString()+"1");
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_res.setText (txt_res.getText().toString()+"2");
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_res.setText (txt_res.getText().toString()+"3");
            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_res.setText (txt_res.getText().toString()+"4");
            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_res.setText (txt_res.getText().toString()+"5");
            }
        });

        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_res.setText (txt_res.getText().toString()+"6");
            }
        });

        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_res.setText (txt_res.getText().toString()+"7");
            }
        });

        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_res.setText (txt_res.getText().toString()+"8");
            }
        });

        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_res.setText (txt_res.getText().toString()+"9");
            }
        });

        imgdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                No1=Integer.parseInt(txt_res.getText().toString());
                operator="/";
                txt_sto.setText (String.valueOf(No1+operator));
                txt_res.setText("");
            }
        });

        imgmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                No1=Integer.parseInt(txt_res.getText().toString());
                operator="*";
                txt_sto.setText (String.valueOf(No1+operator));
                txt_res.setText("");
            }
        });

        imgmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                No1=Integer.parseInt(txt_res.getText().toString());
                operator="-";
                txt_sto.setText (String.valueOf(No1+operator));
                txt_res.setText("");
            }
        });

        imgsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                No1=Integer.parseInt(txt_res.getText().toString());
                operator="+";
                txt_sto.setText (String.valueOf(No1+operator));
                txt_res.setText("");
            }
        });

        imgequ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                No2=Integer.parseInt(txt_res.getText().toString());

                if (operator=="+"){
                    txt_res.setText(String.valueOf(No1+No2));
                }
                else if (operator=="-")
                {
                txt_res.setText(String.valueOf(No1-No2));
                }
                else if (operator=="*"){
                    txt_res.setText(String.valueOf(No1*No2));
                }
                else if (operator=="/"){
                    txt_res.setText(String.valueOf(No1/No2));
                }
            }
        });

        imgclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_res.setText("");
            }
        });

    }
}
