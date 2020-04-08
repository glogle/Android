package com.ttit.helloworld;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ToastActivity extends AppCompatActivity {
    private Context mContext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toast_layout);
        mContext = this;

        final Toast toast = Toast.makeText(mContext, "吐司提示文本信息", Toast.LENGTH_SHORT);
        //设置Toast显示的位置
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);

        //自定义toast布局
        LinearLayout layout = (LinearLayout) toast.getView();
        TextView v = layout.findViewById(android.R.id.message);
        v.setTextColor(Color.parseColor("#F86C37"));
        layout.setBackgroundColor(Color.BLUE);
        ImageView image = new ImageView(this);
        image.setImageResource(R.mipmap.ic_launcher_round);
        layout.addView(image, 0);

        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast.show();
            }
        });
    }
}
