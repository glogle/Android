package com.ttit.core.taskstack;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ttit.helloworld.R;

public class Aactivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_layout);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1.演示 standard模式: A-standard
//                startActivity(new Intent(Aactivity.this, Aactivity.class));

                //2.演示 singleTop模式: A-standard B-singleTop
//                startActivity(new Intent(Aactivity.this, Bactivity.class));

                //3.演示 singleTask模式: A-singleTask  B-standard C-standard
//                startActivity(new Intent(Aactivity.this, Bactivity.class));

                //4.演示 singleInstance:  A-singleInstance  B-singleInstance
                startActivity(new Intent(Aactivity.this, Bactivity.class));
            }
        });
    }
}
