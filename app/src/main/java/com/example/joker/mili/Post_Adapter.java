package com.example.joker.mili;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Joker on 6/13/2020.
 */

public class Post_Adapter extends RecyclerView.Adapter<Post_Adapter.postviewholder> {


    private Context context;
    private List<post_view1> allpost;
    private boolean like=true;


    public Post_Adapter(Context context, List<post_view1> allpost){

        this.context = context;
        this.allpost = allpost;
    }

    @Override
    public postviewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.post_view,parent,false);
        return new postviewholder(view);
    }

    @Override
    public void onBindViewHolder(final postviewholder holder, final int position) {

        post_view1 postView1=allpost.get(position);
        holder.post_img.setImageDrawable(postView1.getPost_img());
        holder.btn_like.setImageDrawable(postView1.getPost_img_like());
        holder.btn_chat.setImageDrawable(postView1.getPost_img_chat());
        holder.btn_seen.setImageDrawable(postView1.getPost_img_seen());
        holder.post_title.setText(postView1.getTitle());
        holder.post_content.setText(postView1.getContent());
        holder.post_time.setText(postView1.getTime());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,Post_View2.class);
                intent.putExtra("post_id",allpost.get(position).getId());
                intent.putExtra("post_title",allpost.get(position).getTitle());
                intent.putExtra("post_content",allpost.get(position).getContent());
                intent.putExtra("post_time",allpost.get(position).getTime());

                holder.btn_seen.setImageResource(R.drawable.ic_action_explore_off);

                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return allpost.size();
    }

    public class postviewholder extends RecyclerView.ViewHolder{


        private ImageView post_img;
        private TextView post_title;
        private TextView post_content;
        private TextView post_time;
        private ImageButton btn_like;
        private ImageButton btn_chat;
        private ImageButton btn_seen;

        public postviewholder(View itemView) {
            super(itemView);

            post_img=(ImageView) itemView.findViewById(R.id.img_post);
            post_title= (TextView) itemView.findViewById(R.id.post_title);
            post_content= (TextView) itemView.findViewById(R.id.post_content);
            post_time= (TextView) itemView.findViewById(R.id.post_time);
            btn_like=(ImageButton)itemView.findViewById(R.id.btn_action_dislike);

            btn_like.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (like){
                        btn_like.setImageResource(R.drawable.ic_action_like);
                        like=false;
                    }else {
                        btn_like.setImageResource(R.drawable.ic_action_favorite_border);
                        like=true;
                    }
                }
            });
            btn_chat=(ImageButton)itemView.findViewById(R.id.btn_action_chat);
            btn_seen=(ImageButton)itemView.findViewById(R.id.btn_action_seen);

        }
    }
}
