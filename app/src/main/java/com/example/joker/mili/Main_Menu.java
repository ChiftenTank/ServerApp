package com.example.joker.mili;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Main_Menu extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ImageView menu_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawer_menu);

        drawerLayout= (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView=(NavigationView) findViewById(R.id.nav_view);
        menu_img=(ImageView) findViewById(R.id.menu_img);

        menu_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             drawerLayout.openDrawer(Gravity.LEFT);
            }
        });

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id=item.getItemId();
                switch (id){
                    case R.id.item_contact:
                        Toast.makeText(Main_Menu.this, "Contact to US", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.item_email:
                        Toast.makeText(Main_Menu.this, "Email to US", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.item_setting:
                        Toast.makeText(Main_Menu.this, "Go to Setting", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.item_share:
                        Toast.makeText(Main_Menu.this, "Share US to Your Friends", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.item_exit:
                        finish();
                }
                return false;
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(Gravity.LEFT)){
            drawerLayout.closeDrawer(Gravity.RIGHT);
        }
        else {
            super.onBackPressed();
        }
    }
}
