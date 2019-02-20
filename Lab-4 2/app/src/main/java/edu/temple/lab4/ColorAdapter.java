package edu.temple.lab4;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by zc on 2/14/2018.
 */

public class ColorAdapter extends BaseAdapter {

    String[] colors;
    Context context;

    public ColorAdapter(Context context, String[] colors){ //manually creating our own adapter
        this.colors = colors;
        this.context = context; //allows us to create views
    }

    @Override
    public int getCount() { //returns count of elements
        return colors.length; //primary and secondary color views
    }

    @Override
    public Object getItem(int i) {
        return colors[i]; //returns position
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        TextView textView = new TextView(context);

        if (view == null) {
            textView = new TextView(context);
        } else {
            textView = (TextView) view;
        }

        textView.setText(colors[position]);
        textView.setBackgroundColor(Color.parseColor(colors[position]));

        return textView;
    }
}