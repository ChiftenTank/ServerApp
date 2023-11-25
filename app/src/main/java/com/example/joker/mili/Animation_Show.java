package com.example.joker.mili;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.*;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Switch;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class Animation_Show extends AppCompatActivity {

    private Switch switch_Load;
    private ImageView img_android;
    private Button btn_start_animation;
    private boolean load_from_XML=false;
    private int animation_type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation__show);

        animation_type=getIntent().getIntExtra("key_animation",0);

        img_android=(ImageView)findViewById(R.id.img_android);

        btn_start_animation=(Button)findViewById(R.id.btn_start_animation);

        btn_start_animation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doAnimation();
            }
        });

        switch_Load=(Switch)findViewById(R.id.switch_load_xml);
        switch_Load.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                load_from_XML=b;
            }
        });
    }

    private void doAnimation(){
        switch (animation_type){
            case 0:
                show_alpha_animation();
                break;
            case 1:
                show_translate_animation();
                break;
            case 2:
               show_scale_animation();
                break;
            case 3:
                show_rotate_animation();
                break;
            case 4:
                show_value_animation();
                break;
            case 5:
                show_set_animation();
                break;
            case 6:
                show_yoyo_animation();
                break;
        }
    }
    private void show_alpha_animation(){
        if (load_from_XML){
            AlphaAnimation alphaAnimation= (AlphaAnimation) AnimationUtils.loadAnimation(this,R.anim.alpha_animation);
            alphaAnimation.setDuration(4000);
            alphaAnimation.setRepeatCount(Animation.INFINITE);
            alphaAnimation.setRepeatMode(Animation.RESTART);
            img_android.startAnimation(alphaAnimation);
        }
        else {
            AlphaAnimation alphaAnimation=new AlphaAnimation(1.0f,0.0f);
            alphaAnimation.setDuration(4000);
            alphaAnimation.setFillAfter(true);
            alphaAnimation.setRepeatCount(Animation.INFINITE);
            alphaAnimation.setRepeatMode(Animation.RESTART);
            img_android.startAnimation(alphaAnimation);
        }

    }
    private void show_translate_animation(){
        if (load_from_XML){
            TranslateAnimation translateAnimation=(TranslateAnimation) AnimationUtils.loadAnimation(this,R.anim.translate_animation);
            translateAnimation.setDuration(4000);
            translateAnimation.setRepeatCount(Animation.INFINITE);
            translateAnimation.setRepeatMode(Animation.REVERSE);
            img_android.startAnimation(translateAnimation);
        }
        else {
            TranslateAnimation translateAnimation=new TranslateAnimation(Animation.ABSOLUTE,0,Animation.ABSOLUTE,1,Animation.ABSOLUTE,0,Animation.RELATIVE_TO_PARENT,1);
            translateAnimation.setDuration(4000);
            translateAnimation.setFillAfter(true);
            translateAnimation.setRepeatCount(Animation.INFINITE);
            translateAnimation.setRepeatCount(Animation.REVERSE);
            img_android.startAnimation(translateAnimation);
        }
    }
    private void show_scale_animation(){
        if (load_from_XML){
            ScaleAnimation scaleAnimation=(ScaleAnimation)AnimationUtils.loadAnimation(this,R.anim.scale_animation);
            scaleAnimation.setDuration(4000);
            scaleAnimation.setRepeatCount(Animation.INFINITE);
            scaleAnimation.setRepeatMode(Animation.RESTART);
            img_android.startAnimation(scaleAnimation);
        }
        else {
            ScaleAnimation scaleAnimation=new ScaleAnimation(1,2,1,2,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,2);
            scaleAnimation.setDuration(4000);
            scaleAnimation.setFillAfter(true);
            scaleAnimation.setRepeatCount(Animation.INFINITE);
            scaleAnimation.setRepeatMode(Animation.RESTART);
            img_android.startAnimation(scaleAnimation);
        }

    }
    private void show_rotate_animation(){
        if (load_from_XML){
            RotateAnimation rotateAnimation=(RotateAnimation)AnimationUtils.loadAnimation(this,R.anim.rotate_animation);
            rotateAnimation.setDuration(4000);
            rotateAnimation.setFillAfter(true);
            rotateAnimation.setInterpolator(new AccelerateInterpolator());
            rotateAnimation.setRepeatCount(Animation.INFINITE);
            rotateAnimation.setRepeatMode(Animation.RESTART);
            img_android.startAnimation(rotateAnimation);
        }
        else {
            RotateAnimation rotateAnimation=new RotateAnimation(0,300f,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
            rotateAnimation.setDuration(4000);
            rotateAnimation.setFillAfter(true);
            rotateAnimation.setRepeatCount(Animation.INFINITE);
            rotateAnimation.setRepeatMode(Animation.RESTART);
            img_android.startAnimation(rotateAnimation);
        }

    }
    private void show_value_animation(){
        final FrameLayout frameLayout=(FrameLayout) findViewById(R.id.activity_animation__show);
        ValueAnimator valueAnimator=ValueAnimator.ofObject(new ArgbEvaluator(), ContextCompat.getColor(this,R.color.colorAccent),ContextCompat.getColor(this,R.color.colorPrimary));
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                frameLayout.setBackgroundColor((Integer) valueAnimator.getAnimatedValue());
            }
        });
        valueAnimator.setDuration(5000);
        valueAnimator.setRepeatCount(4);
        valueAnimator.setRepeatMode(ValueAnimator.REVERSE);
        valueAnimator.start();
    }

    private void show_set_animation(){
        if (load_from_XML){
            AnimationSet animationSet=(AnimationSet)AnimationUtils.loadAnimation(this,R.anim.set_animation);
            animationSet.setDuration(5000);
            animationSet.setRepeatCount(Animation.INFINITE);
            animationSet.setRepeatMode(Animation.RESTART);
            animationSet.setFillAfter(true);
            img_android.startAnimation(animationSet);
        }
        else {
            AnimationSet animationSet=new AnimationSet(true);
            ScaleAnimation scaleAnimation=new ScaleAnimation(0.5f,1.0f,0.5f,1.0f,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,1);
            TranslateAnimation translateAnimation=new TranslateAnimation(Animation.ABSOLUTE,0,Animation.ABSOLUTE,0,Animation.ABSOLUTE,0,Animation.RELATIVE_TO_SELF,1);
            animationSet.addAnimation(scaleAnimation);
            animationSet.addAnimation(translateAnimation);
            animationSet.setDuration(5000);
            animationSet.setRepeatCount(Animation.INFINITE);
            animationSet.setRepeatMode(Animation.RESTART);
            animationSet.setFillAfter(true);
            img_android.startAnimation(animationSet);

        }

    }
    private void show_yoyo_animation(){
        YoYo.with(Techniques.DropOut)
                .duration(4000)
                .playOn(img_android);


    }
}
