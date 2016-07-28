package com.example.listviewtest;

import android.app.Dialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class FishActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fish);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fish, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		switch (id) {
		case R.id.action_exit:
			ActivityCollector.finishAllActivity();
			return true;
		case R.id.action_about:
			Dialog dialog = new Dialog(this);
			dialog.setCancelable(true);
			dialog.setTitle("关于本App");
			dialog.setContentView(R.layout.about_content_layout);
			dialog.show();
			// Toast.makeText(this, "本app由煎锅制作，版权所有，盗版必究",
			// Toast.LENGTH_LONG).show();
			return true;
		default:
			break;
		}

		return super.onOptionsItemSelected(item);
	}
}
