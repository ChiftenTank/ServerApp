package com.example.joker.mili;

import android.content.Context;
import android.support.v4.content.res.ResourcesCompat;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joker on 6/13/2020.
 */

public class Post_FakeData  {

    public static List<post_view1> get_data_for_post(Context context){

        List<post_view1> all_data_post=new ArrayList<>();

        for (int i = 0; i <5 ; i++) {
            post_view1 post_data=new post_view1();

            post_data.setId(i);
            post_data.setPost_img_like(ResourcesCompat.getDrawable(context.getResources(),R.drawable.ic_action_favorite_border,null));
            post_data.setPost_img_chat(ResourcesCompat.getDrawable(context.getResources(),R.drawable.ic_action_chat,null));
            post_data.setPost_img_seen(ResourcesCompat.getDrawable(context.getResources(),R.drawable.ic_action_explore,null));

            switch (i){
                case 1:
                    post_data.setTitle("3D Binocular");
                    post_data.setContent("Binocular 3D is a new world of watching TV, with this Technology you will be in fantastic place that you don't want to leave. Welcome to New style of watching TV");
                    post_data.setTime("3 hours ago");
                    post_data.setPost_img(ResourcesCompat.getDrawable(context.getResources(),R.drawable.post_pic_1,null));
                    break;
                case 2:
                    post_data.setTitle("3D Binocular");
                    post_data.setContent("Binocular 3D is a new world of watching TV, with this Technology you will be in fantastic place that you don't want to leave. Welcome to New style of watching TV");
                    post_data.setTime("3 hours ago");
                    post_data.setPost_img(ResourcesCompat.getDrawable(context.getResources(),R.drawable.post_pic_2,null));
                    break;
                case 3:
                    post_data.setTitle("3D Binocular");
                    post_data.setContent("Binocular 3D is a new world of watching TV, with this Technology you will be in fantastic place that you don't want to leave. Welcome to New style of watching TV");
                    post_data.setTime("3 hours ago");
                    post_data.setPost_img(ResourcesCompat.getDrawable(context.getResources(),R.drawable.post_pic_3,null));
                    break;
                case 4:
                    post_data.setTitle("3D Binocular");
                    post_data.setContent("Binocular 3D is a new world of watching TV, with this Technology you will be in fantastic place that you don't want to leave. Welcome to New style of watching TV");
                    post_data.setTime("3 hours ago");
                    post_data.setPost_img(ResourcesCompat.getDrawable(context.getResources(),R.drawable.post_pic_4,null));
                    break;
                case 5:
                    post_data.setTitle("3D Binocular");
                    post_data.setContent("Binocular 3D is a new world of watching TV, with this Technology you will be in fantastic place that you don't want to leave. Welcome to New style of watching TV");
                    post_data.setTime("3 hours ago");
                    post_data.setPost_img(ResourcesCompat.getDrawable(context.getResources(),R.drawable.post_pic_5,null));
                    break;
                case 6:
                    post_data.setTitle("3D Binocular");
                    post_data.setContent("Binocular 3D is a new world of watching TV, with this Technology you will be in fantastic place that you don't want to leave. Welcome to New style of watching TV");
                    post_data.setTime("3 hours ago");
                    post_data.setPost_img(ResourcesCompat.getDrawable(context.getResources(),R.drawable.post_pic_6,null));
                    break;

            }
        all_data_post.add(post_data);
        }

        return all_data_post;
    }
}