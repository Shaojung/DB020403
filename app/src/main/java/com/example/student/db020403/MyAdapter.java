package com.example.student.db020403;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by student on 2017/2/4.
 */

public class MyAdapter extends BaseAdapter {
    String data[];
    Context context;
    public MyAdapter(Context c, String d[])
    {
        this.data = d;
        this.context = c;
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView tv = new TextView(context);
        tv.setText(data[position]);
        return tv;
    }
}
