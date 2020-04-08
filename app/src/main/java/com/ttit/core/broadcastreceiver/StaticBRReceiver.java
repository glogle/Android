package com.ttit.core.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

// 静态注册
public class StaticBRReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "StaticBRReceiver: 收到广播！！！", Toast.LENGTH_SHORT).show();
    }
}
