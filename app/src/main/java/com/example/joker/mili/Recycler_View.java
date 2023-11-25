package com.example.joker.mili;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

public class Recycler_View extends AppCompatActivity {


    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler__view);

        setRecyclerView();
        get_data_from_server();
    }

    private void setRecyclerView(){
        recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL));
    }

    private void get_data_from_server(){
        Post_Adapter post_adapter=new Post_Adapter(this,Post_FakeData.get_data_for_post(this));
        recyclerView.setAdapter(post_adapter);
    }
}
