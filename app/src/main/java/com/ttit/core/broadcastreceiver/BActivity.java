package com.ttit.core.broadcastreceiver;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ttit.helloworld.R;

public class BActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b_activity_layout);

        findViewById(R.id.btn_send).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //发送广播
//                Intent intent = new Intent("com.example.broadcasttest.StaticBRReceiver");
//                Android8.0以上系统不再支持该种方式
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(BActivity.this, StaticBRReceiver.class));
                sendBroadcast(intent);

//                Intent intent = new Intent("com.example.broadcasttest.DynamicBRReceiver");
//                sendBroadcast(intent);
            }
        });
    }
}
