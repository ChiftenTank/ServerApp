package com.example.joker.mili;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.joker.mili.Adapters.Adapter_Drawer;
import com.example.joker.mili.Classes.Recyclerview_Info;
import com.yqritc.recyclerviewflexibledivider.HorizontalDividerItemDecoration;

import java.util.ArrayList;
import java.util.List;


public class Nav_Fragment extends Fragment {

    private DrawerLayout menu_drawer_layout;
    private ActionBarDrawerToggle menu_actionBarDrawerToggle;
    private RecyclerView recyclerView;
    private Adapter_Drawer adapter_drawer;

    public Nav_Fragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_nav_, container, false);

        recyclerView=(RecyclerView)view.findViewById(R.id.rec_nav);
        adapter_drawer=new Adapter_Drawer(getActivity(),data_nav());
        recyclerView.setAdapter(adapter_drawer);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.addItemDecoration(new HorizontalDividerItemDecoration.Builder(getActivity())
                .margin(15,15)
                .colorResId(R.color.bold_red)
                .build());

        return view;
    }



    public void set_up(DrawerLayout drawerLayout, final Toolbar toolbar){
        menu_drawer_layout=drawerLayout;
        menu_actionBarDrawerToggle=new ActionBarDrawerToggle(getActivity(),drawerLayout,toolbar, R.string.open,R.string.close){
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                super.onDrawerSlide(drawerView, slideOffset);
                if (slideOffset<0.5){
                    toolbar.setAlpha(1-slideOffset);
                }
            }
        };
        menu_drawer_layout.addDrawerListener(menu_actionBarDrawerToggle);
        menu_drawer_layout.post(new Runnable() {
            @Override
            public void run() {
           menu_actionBarDrawerToggle.syncState();
            }
        });
    }

    private List<Recyclerview_Info> data_nav(){
        List<Recyclerview_Info> data_navigation=new ArrayList<>();
        String txtnav[]={"Home","About","Share","Setting","Exit"};
        int imgnav[]={R.drawable.ic_action_chat,R.drawable.ic_action_contact_mail,R.drawable.ic_action_share,
                R.drawable.ic_action_settings,R.drawable.ic_action_power_settings_new};

        for (int i = 0; i <txtnav.length && i <imgnav.length ; i++) {

        Recyclerview_Info cur_info_recy=new Recyclerview_Info();

            cur_info_recy.txt_nav=txtnav[i];
            cur_info_recy.img_nav=imgnav[i];

            data_navigation.add(cur_info_recy);
        }

        return data_navigation;
    }
}
