package com.delarosa.delarosaquiz1.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.delarosa.delarosaquiz1.R;
import com.delarosa.delarosaquiz1.model.Android;

import java.util.List;

/**
 * Created by Cheska Dela Rosa on 028, 9/28/17.
 */

public class CustomAdapter extends BaseAdapter {
    Context context;
    List<Android> android;
    ImageView androidLogo;
    TextView androidName, androidVer, androidAPI, androidReleaseDate;

    public CustomAdapter(Context context, List<Android> android) {
        this.context = context;
        this.android = android;
    }

    @Override
    public int getCount() {
        return android.size();
    }

    @Override
    public Object getItem(int i) {
        return android.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = View.inflate(context, R.layout.row_layout, null);
        androidLogo = v.findViewById(R.id.androidLogo);
        androidName = v.findViewById(R.id.androidName);
        androidVer = v.findViewById(R.id.androidVer);
        androidAPI = v.findViewById(R.id.androidAPI);
        androidReleaseDate = v.findViewById(R.id.androidReleaseDate);

        androidLogo.setImageResource(android.get(i).getAndroidLogo());
        androidName.setText(android.get(i).getAndroidName());
        androidVer.setText("v" + android.get(i).getAndroidVer());
        androidAPI.setText(android.get(i).getAndroidAPI());
        androidReleaseDate.setText("Released on " + android.get(i).getAndroidReleaseDate());

        return v;
    }

}
