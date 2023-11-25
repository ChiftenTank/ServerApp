package com.example.joker.mili;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.res.ResourcesCompat;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joker on 2/19/2020.
 */

public class FakeDataGenerator {
    public static List<Post> getdatafromPost (Context context) {
        List<Post> posts=new ArrayList<>();
        for (int i=0;i<=5;i++){
            Post post=new Post();

            post.setId(i);
            post.setTitle("Hi Welcome to My World");
            post.setText("The text of this app is my newest build.I have just started building this app so hopefully I can make a lot of progress in this field and bring you the best apps with the best designs for your loved ones.");
            post.setTime("1 hour ago");
            switch (i){
                case 0:
                    post.setPost_img(ResourcesCompat.getDrawable(context.getResources(),R.drawable.pic_1,null));
                    break;

                case 1:
                    post.setPost_img(ResourcesCompat.getDrawable(context.getResources(),R.drawable.pic_2,null));
                    break;

                case 2:
                    post.setPost_img(ResourcesCompat.getDrawable(context.getResources(),R.drawable.pic_3,null));
                    break;

                case 3:
                    post.setPost_img(ResourcesCompat.getDrawable(context.getResources(),R.drawable.pic_4,null));
                break;

                case 4:
                    post.setPost_img(ResourcesCompat.getDrawable(context.getResources(),R.drawable.pic_5,null));
                break;

                case 5:
                    post.setPost_img(ResourcesCompat.getDrawable(context.getResources(),R.drawable.pic_6,null));
                break;
            }
            posts.add(post);
        }
        return posts;
    }

}
