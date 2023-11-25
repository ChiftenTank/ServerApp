package com.example.joker.mili;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.IdRes;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.example.joker.mili.Activity.Setting_DrawerFloatActionButton_Menu;
import com.example.joker.mili.Fragments.FavFragment;
import com.example.joker.mili.Fragments.HomeFragment;
import com.example.joker.mili.Fragments.SaveFragment;
import com.example.joker.mili.Fragments.ShareFragment;
import com.gitonway.lee.niftymodaldialogeffects.lib.Effectstype;
import com.gitonway.lee.niftymodaldialogeffects.lib.NiftyDialogBuilder;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabClickListener;

public class Drawer_Menu extends AppCompatActivity {

    private Toolbar toolbar;
    private BottomBar bottomBar;
    private static Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer__menu);

        context = getApplicationContext();
        toolbar = (Toolbar) findViewById(R.id.toolbar_drawer);

        toolbar.setTitle("");
        setSupportActionBar(toolbar);

        Nav_Fragment nav_fragment = (Nav_Fragment) getSupportFragmentManager().findFragmentById(R.id.drawer_frag);
        nav_fragment.set_up((DrawerLayout) findViewById(R.id.drawer_layout), toolbar);

        ImageView image_View = new ImageView(this);
        image_View.setImageResource(R.drawable.ic_action_menu);

        FloatingActionButton actionButton = new FloatingActionButton.Builder(this)
                .setContentView(image_View)
                .setBackgroundDrawable(R.drawable.floataction_btn)
                .build();

        ImageView img_set = new ImageView(this);
        img_set.setImageResource(R.drawable.ic_action_settings);
        ImageView img_con = new ImageView(this);
        img_con.setImageResource(R.drawable.ic_action_contact_mail);
        ImageView img_share = new ImageView(this);
        img_share.setImageResource(R.drawable.ic_action_share);

        SubActionButton.Builder item_builder = new SubActionButton.Builder(this);
        item_builder.setBackgroundDrawable(getResources().getDrawable(R.drawable.floatactionmenu_btn));
        SubActionButton button_set = item_builder.setContentView(img_set).build();
        SubActionButton button_con = item_builder.setContentView(img_con).build();
        SubActionButton button_share = item_builder.setContentView(img_share).build();


        FloatingActionMenu actionMenu = new FloatingActionMenu.Builder(this)
                .addSubActionView(button_set)
                .addSubActionView(button_con)
                .addSubActionView(button_share)
                .attachTo(actionButton)
                .build();

        button_con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final NiftyDialogBuilder niftyDialogBuilder = NiftyDialogBuilder.getInstance(Drawer_Menu.this);
                niftyDialogBuilder
                        .withTitle("Talk to US")
                        .withDividerColor("#11000000")
                        .withMessage(Drawer_Menu.this.getString(R.string.info))
                        .withMessageColor("#FFFFFFFF")
                        .withDialogColor("#FFE74C3C")
                        .withIcon(R.drawable.ic_action_contact_mail)
                        .withDuration(700)
                        .withEffect(Effectstype.Fall)
                        .withButton1Text("OK")
                        .isCancelable(false);
                niftyDialogBuilder.setButton1Click(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        niftyDialogBuilder.cancel();
                    }
                });
                niftyDialogBuilder.show();
            }
        });

        button_set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Drawer_Menu.this, Setting_DrawerFloatActionButton_Menu.class));
            }
        });

        button_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Settings.ACTION_SETTINGS));
            }
        });


        bottomBar=BottomBar.attach(this,savedInstanceState);
        bottomBar.setItemsFromMenu(R.menu.menu_bar, new OnMenuTabClickListener() {
            @Override
            public void onMenuTabSelected(@IdRes int menuItemId) {
                if (menuItemId == R.id.home_actionbar) {
                    HomeFragment home_frag = new HomeFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, home_frag).commit();
                    toolbar.setBackgroundColor(Color.parseColor("#4d008a"));
                } else
                if (menuItemId == R.id.fav_actionbar) {
                    FavFragment fav_frag = new FavFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, fav_frag).commit();
                    toolbar.setBackgroundColor(Color.parseColor("#d30053"));
                } else
                if (menuItemId == R.id.share_actionbar) {
                    ShareFragment share_frag = new ShareFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, share_frag).commit();
                    toolbar.setBackgroundColor(Color.parseColor("#68b1e5"));
                } else
                if (menuItemId == R.id.save_actionbar) {
                    SaveFragment save_frag = new SaveFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, save_frag).commit();
                    toolbar.setBackgroundColor(Color.parseColor("#FFD900"));
                }
            }
            @Override
            public void onMenuTabReSelected(@IdRes int menuItemId) {

            }
        });
        bottomBar.mapColorForTab(0,"#4d008a");
        bottomBar.mapColorForTab(1,"#d30053");
        bottomBar.mapColorForTab(2,"#68b1e5");
        bottomBar.mapColorForTab(3,"#FFD900");


    }
}

