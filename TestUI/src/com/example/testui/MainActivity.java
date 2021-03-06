package com.example.testui;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends BaseActivity {
	EditText editText;
	String contentString;
	ProgressBar hProgressBar,rProgressBar;
	int flag = 0;
/**
 * 匿名类中使用的变量，必须在最外层类中声明
 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
//		View view = (View) findViewById(R.id.linearLayout);
//		view.getBackground().setAlpha(50);
		setContentView(R.layout.activity_main);
		editText = (EditText) findViewById(R.id.edit_text);
		hProgressBar = (ProgressBar) findViewById(R.id.HprogressBar);
		rProgressBar = (ProgressBar) findViewById(R.id.RprogressBar);
		Button button_1 = (Button) findViewById(R.id.button_1);
		Button button_2 = (Button) findViewById(R.id.button_2);
		Button button_3 = (Button) findViewById(R.id.button_3);
		Button button_4 = (Button) findViewById(R.id.button_4);
		button_1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//editText = (EditText) findViewById(R.id.edit_text);
				contentString = editText.getText().toString();
				Toast.makeText(MainActivity.this, contentString, Toast.LENGTH_SHORT).show();
			}
		});
		button_2.setOnClickListener(new OnClickListener() {
			
			/**
			 * 进度条从0-100，再从100-0.往此循环
			 */
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int progress = hProgressBar.getProgress();
				if (flag == 1) {
					progress -= 10;
					if (progress == 0) {
						flag = 0;
					}
					
				} else if (flag == 0) {
					progress += 10;
					if (progress == 100) {
						flag = 1;
					}

				}
				
			hProgressBar.setProgress(progress);
				
				
			}
		});
		
		button_3.setOnClickListener(new OnClickListener() {
			
			/**
			 * 设置圆形进度条的显示情况
			 */
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (rProgressBar.getVisibility() == View.GONE) {
					rProgressBar.setVisibility(View.VISIBLE);
				}
				else {
					rProgressBar.setVisibility(View.GONE);
				}
			}
		});
		
		button_4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
				progressDialog.setTitle("这是progressDialog");
				progressDialog.setMessage("请耐心等待...");
				progressDialog.setCancelable(true);
				progressDialog.show();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
		AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
		dialog.setTitle("内容对话框");
		dialog.setMessage(editText.getText().toString());
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

	case R.id.action_start:
		SecondActivity.actionStart(MainActivity.this, "来自MainActivity的问候");
		return true;
		

	default:
		return super.onOptionsItemSelected(item);
	}
}
}
