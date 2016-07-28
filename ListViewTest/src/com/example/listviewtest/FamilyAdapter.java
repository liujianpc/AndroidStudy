package com.example.listviewtest;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class FamilyAdapter extends ArrayAdapter<Family> {
	private int resourceId;

	public FamilyAdapter(Context context, int textViewResourceId,
			List<Family> objects) {
		super(context, textViewResourceId, objects);
		this.resourceId = textViewResourceId;
	}

@Override
public View getView(int position, View convertView, ViewGroup parent) {
	// TODO Auto-generated method stub
	Family family = getItem(position);
	View view;
	ViewHolder viewHolder;
	if (convertView == null) {
		view = LayoutInflater.from(getContext()).inflate(resourceId, null);
		viewHolder = new ViewHolder();
		viewHolder.imageView = (ImageView) view.findViewById(R.id.family_image);
		viewHolder.textView = (TextView) view.findViewById(R.id.family_name);
		view.setTag(viewHolder);
	} else {
		view = convertView;
		viewHolder = (ViewHolder) view.getTag();
	}
	

	viewHolder.imageView.setImageResource(family.getImageId());
	viewHolder.textView.setText(family.getName());
	
	return view;
}
class ViewHolder{
	ImageView imageView;
	TextView textView;
	
}

}
