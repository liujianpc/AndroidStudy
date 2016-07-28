package com.example.newsapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class NewsContentFragment extends Fragment {
private View view;
@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
		Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	view = inflater.inflate(R.layout.news_content_fragment, container,false);
	
	return view;
}

public void refresh(String newsTitle, String newsContent){
	View news_content_fragment = view.findViewById(R.id.news_content_layout);
	news_content_fragment.setVisibility(View.VISIBLE);
	TextView newsTitleTextView = (TextView) view.findViewById(R.id.news_title);
	TextView newsContentTextView = (TextView) view.findViewById(R.id.news_content);
	newsTitleTextView.setText(newsTitle);
	newsContentTextView.setText(newsContent);
	
}

}
