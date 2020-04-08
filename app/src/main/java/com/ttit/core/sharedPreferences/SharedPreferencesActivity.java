package com.ttit.core.sharedPreferences;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.ttit.helloworld.R;

public class SharedPreferencesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences);

        final TextView tv = findViewById(R.id.textView);
        final EditText et = findViewById(R.id.editText);
        findViewById(R.id.write).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String etStr = et.getText().toString().trim();
                SharedPreferences shp = getSharedPreferences("ttit", MODE_PRIVATE);
                SharedPreferences.Editor editor = shp.edit();
                editor.putString("name", etStr);
                boolean isSaveSuccess = editor.commit();
                if (isSaveSuccess) {
                    Toast.makeText(SharedPreferencesActivity.this, "保存成功", Toast.LENGTH_SHORT).show();
                }
            }
        });
        findViewById(R.id.read).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences shp = getSharedPreferences("ttit", MODE_PRIVATE);
                String s = shp.getString("name", "无");
                tv.setText(s);
            }
        });
    }
}
