package com.example.student.db020403;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by student on 2017/2/4.
 */

public class MyAdapter extends BaseAdapter {
    ArrayList<Map<String, Object>> mydata;
    Context context;
    public MyAdapter(Context c, ArrayList<Map<String, Object>> m)
    {
        this.mydata = m;
        this.context = c;
    }

    @Override
    public int getCount() {
        return mydata.size();
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
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.myitem, null);
        TextView tv = (TextView) v.findViewById(R.id.textView2);
        tv.setText(mydata.get(position).get("city").toString());
        TextView tv2 = (TextView) v.findViewById(R.id.textView3);
        tv2.setText(mydata.get(position).get("code").toString());
        ImageView img = (ImageView) v.findViewById(R.id.imageView);
        img.setImageResource((Integer) mydata.get(position).get("img"));
        return v;
    }
}
