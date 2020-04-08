package com.ttit.core.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ttit.helloworld.R;

public class ThirdActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_activity_layout);
        Intent in = getIntent();
        String val = in.getStringExtra("test");
        int val2 = in.getIntExtra("number", 0);
        Log.e("tag", "val =" + val);
        Log.e("tag", "val2 =" + val2);

        Bundle b = in.getExtras();
        String val3 = b.getString("test");
        int val4 = b.getInt("number");
        Log.e("tag", "val3 =" + val3);
        Log.e("tag", "val4 =" + val4);


        Intent backIn = new Intent();
        backIn.putExtra("back", "abcdef");
        setResult(1002, backIn);
    }
}
