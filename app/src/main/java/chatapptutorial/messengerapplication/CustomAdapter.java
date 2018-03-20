package chatapptutorial.messengerapplication;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.*;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by Ahsan on 19/03/2018.
 */

public class CustomAdapter extends BaseAdapter{

    Activity _activity;
    List<CustomList> list;

    public CustomAdapter (Activity _activity, List<CustomList> list){
        this._activity = _activity;
        this.list = list;
    }

    @Override
    public int getCount() {
        return this.list.size();
    }

    @Override
    public Object getItem(int position) {
        return this.list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return this.list.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        if(row == null){
            LayoutInflater inflater = (LayoutInflater)_activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.content_layout,parent,false);
        }

        ((TextView) row.findViewById(R.id.tvTitle)).setText(this.list.get(position).getUserName());
        ((TextView) row.findViewById(R.id.tvMsg)).setText(this.list.get(position).getMsgBody());
        ((TextView) row.findViewById(R.id.tvTime)).setText(this.list.get(position).getMsgTime());



        ((ImageView) row.findViewById(R.id.imgMsgSeen)).setImageDrawable(_activity.getResources().getDrawable(this.list.get(position).getGreenTick()));
        ((ImageView) row.findViewById(R.id.imgUser)).setImageDrawable(_activity.getResources().getDrawable(this.list.get(position).getId()));
//        ((ImageView) row.findViewById(R.id.imgMsgSeen)).setImageDrawable(_activity.getResources().getDrawable(this.list.get(position).getMic()));
        return row;
    }
}
