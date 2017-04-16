package com.example.deepak.bangloreguid;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Deepak on 23-03-2017.
 */

public class guidAdapter extends ArrayAdapter {

    public guidAdapter(Activity context, ArrayList<guid> guid) {

        super(context, 0, guid);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link tour } object located at this position in the list
        guid currentguid = (guid) getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        ImageView placeImageView = (ImageView) listItemView.findViewById(R.id.Image);

        if (currentguid.hasimage()){
            //set the image resourse id specifid in the guid array
            placeImageView.setImageResource(currentguid.getImageResourceId());
            //if the image is provided
            placeImageView.setVisibility(View.VISIBLE);
        }
        else {
            placeImageView.setVisibility(View.GONE);
        }
        // Get the version name from the current tour object and
        // set this image on the name IamgeView
        placeImageView.setImageResource(currentguid.getImageResourceId());

        // Find the ImageView in the list_item.xml layout with the ID version_text
        TextView detailsTextView = (TextView) listItemView.findViewById(R.id.Text);
        // Get the version number from the current tour object and
        // set this text on the TextView
        detailsTextView.setText(currentguid.getDetailsText());


        // Return the whole list item layout (containing TextView and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
