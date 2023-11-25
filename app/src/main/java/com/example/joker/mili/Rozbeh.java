package com.example.joker.mili;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class Rozbeh extends AppCompatActivity {

    EditText edt_detail;
    Button btn_add_names;
    ListView list_customer;
    ArrayList<String> names;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rozbeh);

        edt_detail=(EditText)findViewById(R.id.edt_add_name);
        btn_add_names=(Button)findViewById(R.id.add_btn);
        list_customer=(ListView)findViewById(R.id.list_name);
        names=new ArrayList<>();

        btn_add_names.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=edt_detail.getText().toString();
                names.add(name);

                adapter.notifyDataSetChanged();
            }
        });

        adapter= new ArrayAdapter<String>(Rozbeh.this, android.R.layout.simple_list_item_multiple_choice, names);
        list_customer.setAdapter(adapter);

    }


}
