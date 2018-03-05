package com.example.irisreitsma.friendsr;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Iris Reitsma on 26-2-2018.
 */

public class FriendsAdapter extends ArrayAdapter<Friend> {

    private ArrayList friends;

    // constructor of the class
    public FriendsAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Friend> objects) {
        super(context, resource, objects);
        friends = (ArrayList<Friend>)objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.grid_item, parent, false);

        }

        // fill views with info from friends list
        ImageView image = (ImageView) convertView.findViewById(R.id.cat);
        TextView name = (TextView) convertView.findViewById(R.id.name);
        Friend friend = (Friend) friends.get(position);
        int id = friend.getDrawableId();
        name.setText(friend.getName());
        image.setImageDrawable(getContext().getResources().getDrawable(id,null));

        // adjust height
        int screenHeight = Resources.getSystem().getDisplayMetrics().heightPixels;
        convertView.setLayoutParams(new GridView.LayoutParams(GridView.AUTO_FIT, screenHeight/3));
        return convertView;
    }
}
