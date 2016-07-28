package com.example.newsapplication;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class NewsAdapter extends ArrayAdapter<News> {
	private int resourceId;

	public NewsAdapter(Context context, int textViewResourceId,
			List<News> objects) {
		super(context, textViewResourceId, objects);
		resourceId = textViewResourceId;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		News news = getItem(position);
		ViewHolder viewHolder;
		View view;
		if (convertView == null) {
			view = LayoutInflater.from(getContext()).inflate(resourceId, null);
			viewHolder = new ViewHolder();
			viewHolder.news_titleTextView = (TextView) view.findViewById(R.id.news_title);
			view.setTag(viewHolder);
			
		} else {
			view = convertView;
			viewHolder = (ViewHolder) view.getTag();
			

		}
		
		viewHolder.news_titleTextView.setText(news.getTitle());
		
		return view;
	}

	class ViewHolder{
		TextView news_titleTextView;
	}
}
