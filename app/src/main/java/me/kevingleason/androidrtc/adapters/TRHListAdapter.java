package me.kevingleason.androidrtc.adapters;

/**
 * Created by satish on 11/6/2015.
 */

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import me.kevingleason.androidrtc.R;

public class TRHListAdapter extends BaseAdapter{

    private Context context;
    private ArrayList<me.kevingleason.androidrtc.model.TRHItem> TRHItems;

    public TRHListAdapter(Context context, ArrayList<me.kevingleason.androidrtc.model.TRHItem> TRHItems) {
        this.context = context;
        this.TRHItems = TRHItems;
    }

    @Override
    public int getCount() {
        return TRHItems.size();
    }

    @Override
    public Object getItem(int position) {
        return TRHItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater)
                    context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.drawer_list_item, null);
        }

        ImageView imgIcon = (ImageView) convertView.findViewById(R.id.icon);
        TextView txtTitle = (TextView) convertView.findViewById(R.id.title);
        TextView txtCount = (TextView) convertView.findViewById(R.id.counter);

        imgIcon.setImageResource(TRHItems.get(position).getIcon());
        txtTitle.setText(TRHItems.get(position).getTitle());

        // displaying count
        // check whether it set visible or not
        if (TRHItems.get(position).getCounterVisibility()) {
            txtCount.setText(TRHItems.get(position).getCount());
        } else {
            // hide the counter view
            txtCount.setVisibility(View.GONE);
        }

        return convertView;
    }
}
