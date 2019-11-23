package com.example.listviewdynamic_ca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lview;
    static MainActivity mActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lview=(ListView)findViewById(R.id.lview1);
        mActivity=this;
        lview.setAdapter(new MyAdapter());

    }
}
