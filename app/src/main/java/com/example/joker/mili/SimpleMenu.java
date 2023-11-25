package com.example.joker.mili;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class SimpleMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,1,1,"Main");
        menu.add(0,2,2,"Register");
        menu.add(0,3,3,"Calculator");
        menu.add(0,4,4,"Contact-Us");
        menu.add(0,5,5,"Exit");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case 1:
                Toast.makeText(this, "Main", Toast.LENGTH_SHORT).show();
                break;

            case 2:
                Intent intent=new Intent(SimpleMenu.this,Register.class);
                startActivity(intent);
                break;

            case 3:
                Intent intent1=new Intent(SimpleMenu.this,Calculator.class);
                startActivity(intent1);
                break;

            case 4:
                Toast.makeText(this, "Contact_Us", Toast.LENGTH_SHORT).show();
                break;

            case 5:
                finish();
                break;
        }


        return super.onOptionsItemSelected(item);
    }
}
