package com.android.rafael.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Rafael on 5/4/2017.
 */

public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(Context context, ArrayList<Location> location){
        super(context, 0, location);
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent){

        View listItemView = converView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Location currentLocation = getItem(position);

        TextView locationName = (TextView) listItemView.findViewById(R.id.location_name);
        locationName.setText(currentLocation.getName());

        TextView locationAddress = (TextView) listItemView.findViewById(R.id.location_address);
        locationAddress.setText(currentLocation.getAddress());

        TextView locationPhone = (TextView) listItemView.findViewById(R.id.location_phone);
        locationPhone.setText(currentLocation.getPhone());

        ImageView locationImage = (ImageView) listItemView.findViewById(R.id.location_image);
        locationImage.setImageResource(currentLocation.getImageResourceId());

        return listItemView;
    }

}
