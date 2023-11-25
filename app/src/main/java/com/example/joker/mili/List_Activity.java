package com.example.joker.mili;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class List_Activity extends AppCompatActivity {

    EditText edt_list;
    Button btn_add;
    ListView list_name;
    ArrayList<String> arrayNames;
    ArrayAdapter<String> arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        edt_list=(EditText) findViewById(R.id.edt_list);
        btn_add=(Button)findViewById(R.id.btn_add);
        list_name=(ListView)findViewById(R.id.list_items);

        arrayNames=new ArrayList<>();
        arrayNames.add("George");
        arrayNames.add("David");

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String name_add=edt_list.getText().toString();
                arrayNames.add(name_add);
                arrayAdapter.notifyDataSetChanged();
            }
        });

        arrayAdapter=new ArrayAdapter<String>(List_Activity.this,android.R.layout.simple_list_item_1);
        list_name.setAdapter(arrayAdapter);

    }
}
