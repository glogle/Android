package com.ttit.core.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ttit.helloworld.R;

public class AActivity extends AppCompatActivity {
    private DynamicBRReceiver dynamicBRReceiver;
    private NetReceiver netReceiver;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_activity_layout);
        // 动态注册广播接收器
        dynamicBRReceiver = new DynamicBRReceiver();
        IntentFilter itFilter = new IntentFilter();
        itFilter.addAction("com.example.broadcasttest.DynamicBRReceiver");
        registerReceiver(dynamicBRReceiver, itFilter);

        //接受系统发出的广播
        netReceiver = new NetReceiver();
        IntentFilter itFilterNet = new IntentFilter();
        itFilterNet.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        registerReceiver(netReceiver, itFilterNet);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AActivity.this, BActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(dynamicBRReceiver);
        unregisterReceiver(netReceiver);
    }

    //接收系统广播
    class NetReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            Toast.makeText(context, "NetReceiver: 网络状态发送变化！！！", Toast.LENGTH_SHORT).show();
        }
    }
}


