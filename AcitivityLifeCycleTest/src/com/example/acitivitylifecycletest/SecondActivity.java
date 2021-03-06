package com.example.acitivitylifecycletest;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class SecondActivity extends BaseActivity {
	
	public static void actionStart(Context context, String data) {
		Intent intent = new Intent(context, SecondActivity.class);
		intent.putExtra("param", data);
		context.startActivity(intent);
		
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		Intent intent = getIntent();
		String dataString = intent.getStringExtra("param");
		Toast.makeText(SecondActivity.this, dataString, Toast.LENGTH_SHORT).show();
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
		if (id == R.id.action_exit) {
			ActivityCollector.finishAllActivity();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
