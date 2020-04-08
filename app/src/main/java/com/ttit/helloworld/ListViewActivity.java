package com.ttit.helloworld;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.ttit.helloworld.adapter.NewsAdapter2;
import com.ttit.helloworld.entity.News;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {
    private List<News> mData = null;
    private Context mContext;
    private NewsAdapter2 mAdapter = null;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_layout);
        mContext = this;
        listView = (ListView) findViewById(R.id.listview);
        mData = new ArrayList<News>();
        for (int i = 0; i < 20; i++) {
            mData.add(new News("我是一个新闻标题---- " + i, "我是一个新闻内容---- " + i, R.mipmap.news));
        }
//        mAdapter = new NewsAdapter(mData, mContext);
        mAdapter = new NewsAdapter2(mData, mContext);
        listView.setAdapter(mAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(mContext, "点击了第" + position + "条数据", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
