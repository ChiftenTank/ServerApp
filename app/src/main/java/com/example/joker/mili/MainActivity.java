package com.example.joker.mili;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button lbtn;
    private EditText edtn;
    private EditText edtf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtn= (EditText)findViewById(R.id.txt_fa) ;
        edtf= (EditText) findViewById(R.id.txt_nm);
        lbtn=(Button) findViewById(R.id.btn_log);

        lbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn=new Intent(MainActivity.this,Sec.class);

                String name_family =edtn.getText().toString() +" " + edtf.getText().toString();

                itn.putExtra("user_id",name_family);
                startActivity(itn);
            }
        });

    }

}
