package com.example.testui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Toast;

public class SecondActivity extends Activity {
	
	public static void actionStart(Context context, String data) {
		Intent intent = new Intent(context, SecondActivity.class);
		intent.putExtra("param", data);
		context.startActivity(intent);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_second);
		String data = getIntent().getStringExtra("param");
		Toast.makeText(SecondActivity.this, data, Toast.LENGTH_SHORT).show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
	switch (id) {
	case R.id.action_settings:
		AlertDialog.Builder dialog = new AlertDialog.Builder(SecondActivity.this);
		dialog.setTitle("内容对话框");
		dialog.setMessage("这是sencondActivity");
		dialog.setCancelable(true);
		dialog.setPositiveButton("确认", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		});
		dialog.setNegativeButton("取消", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		});
		dialog.show();
		return true;
		
	case R.id.action_exit:
		ActivityCollector.finishAllActivity();
		return true;
		

	default:
		return super.onOptionsItemSelected(item);
	}
}
}
