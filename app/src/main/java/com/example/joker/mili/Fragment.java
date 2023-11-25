package com.example.joker.mili;

import android.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.joker.mili.R.id.btn_replace;

public class Fragment extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);


        Button btn_replace=(Button)findViewById(R.id.btn_replace);
        Button btn_remove=(Button)findViewById(R.id.btn_remove);
        final Sample_Fragment2 sampleFrag2=new Sample_Fragment2();


        final android.support.v4.app.FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        transaction.add(R.id.fragment_container,new Sample_Fragment1());
        transaction.commit();

        btn_replace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentTransaction transaction1=fragmentManager.beginTransaction();
                transaction1.replace(R.id.fragment_container,sampleFrag2 );
                transaction1.commit();

            }
        });

        btn_remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction2=fragmentManager.beginTransaction();
                transaction2.remove(sampleFrag2);
                transaction2.commit();

            }
        });


    }
}
