package com.yetsdmr.circlemenu.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.yetsdmr.circlemenu.CircleMenuView;
import com.yetsdmr.circlemenu.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CircleMenuView menu = findViewById(R.id.circle_menu);
        menu.setEventListener(new CircleMenuView.EventListener() {
            @Override
            public void onMenuOpenAnimationStart(@NonNull CircleMenuView view) {
                Log.d("D", "onMenuOpenAnimationStart");
            }

            @Override
            public void onMenuOpenAnimationEnd(@NonNull CircleMenuView view) {
                Log.d("D", "onMenuOpenAnimationEnd");
            }

            @Override
            public void onMenuCloseAnimationStart(@NonNull CircleMenuView view) {
                Log.d("D", "onMenuCloseAnimationStart");
            }

            @Override
            public void onMenuCloseAnimationEnd(@NonNull CircleMenuView view) {
                Log.d("D", "onMenuCloseAnimationEnd");
            }

            @Override
            public void onButtonClickAnimationStart(@NonNull CircleMenuView view, int index) {
                Log.d("D", "onButtonClickAnimationStart| index: " + index);

            }

            @Override
            public void onButtonClickAnimationEnd(@NonNull CircleMenuView view, int index) {
                Log.d("D", "onButtonClickAnimationEnd| index: " + index);
                Toast.makeText(MainActivity.this, "index: " + index, Toast.LENGTH_SHORT).show();

                if(index == 1){
                    Intent intent = new Intent(MainActivity.this,SearchActivity.class);
                    startActivity(intent);
                }

            }

            @Override
            public boolean onButtonLongClick(@NonNull CircleMenuView view, int index) {
                Log.d("D", "onButtonLongClick| index: " + index);
                return true;
            }

            @Override
            public void onButtonLongClickAnimationStart(@NonNull CircleMenuView view, int index) {
                Log.d("D", "onButtonLongClickAnimationStart| index: " + index);
            }

            @Override
            public void onButtonLongClickAnimationEnd(@NonNull CircleMenuView view, int index) {
                Log.d("D", "onButtonLongClickAnimationEnd| index: " + index);
            }
        });
    }
}