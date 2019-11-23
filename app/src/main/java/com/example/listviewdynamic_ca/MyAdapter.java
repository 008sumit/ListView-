package com.example.listviewdynamic_ca;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.io.File;

public class MyAdapter  extends BaseAdapter {
String path="/storage/emulated/0/";
File f=new File(path);
     String [] files  =f.list();
    @Override
    public int getCount() {
        return files.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater=LayoutInflater.from(MainActivity.mActivity);
        View v=inflater.inflate(R.layout.indi_view,null);

        return v;
    }
}
