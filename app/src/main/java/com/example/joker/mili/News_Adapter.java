package com.example.joker.mili;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Joker on 3/4/2020.
 */

public class News_Adapter extends RecyclerView.Adapter<News_Adapter.News_ViewHolder> {

    private Context context;
    private List<Post> posts;

    public News_Adapter (Context context, List<Post> posts){

        this.context = context;
        this.posts = posts;
    }

    @Override
    public News_ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.layout_news,parent,false);
        return new News_ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(News_ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public class News_ViewHolder extends RecyclerView.ViewHolder {

        private ImageView News_img;
        private TextView titel;
        private TextView content;
        private TextView date;

        public News_ViewHolder(View itemView) {
            super(itemView);

            News_img=(ImageView) itemView.findViewById(R.id.item_img);
            titel=(TextView) itemView.findViewById(R.id.news_title);
            content=(TextView) itemView.findViewById(R.id.news_text);
            date=(TextView) itemView.findViewById(R.id.news_time);
        }
    }
}
