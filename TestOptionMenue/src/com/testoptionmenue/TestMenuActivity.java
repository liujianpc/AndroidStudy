package com.testoptionmenue;

import android.app.Activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

/**
 * @author FBJH73
 *
 */
public class TestMenuActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main_activity);
		/**
		 * 打开Toast
		 */
		Button button_1 = (Button) findViewById(R.id.button_1);
		button_1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(TestMenuActivity.this, "this is TestMenuActivity", Toast.LENGTH_SHORT).show();
				
			}
		});
		
		/**
		 *显式方法启动Activity
		 */
		Button button_2 = (Button) findViewById(R.id.button_2);
		button_2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub  显示�?图
				Intent intent = new Intent(TestMenuActivity.this, SecondActivity.class);
				startActivity(intent);
				
			}
		});
		/**
		 * 隐式方法启动activity
		 */
		Button button_4 = (Button) findViewById(R.id.button_4);
		button_4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent("com.testoptionmenue.ACTION_START");
				intent.addCategory("com.testoptionmenue.MY_CATEGORY");
				startActivity(intent);
			}
		});
		
		/**
		 * 隐式方法打开百度首页
		 */
		Button button_5 = (Button) findViewById(R.id.button_5);
		button_5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Intent.ACTION_VIEW);
				intent.setData(Uri.parse("http://www.baidu.com"));
				startActivity(intent);
			}
		});
		
		/**
		 * �?�?方法打开拨号界面
		 */
		Button button_6 = (Button) findViewById(R.id.button_6);
		button_6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Intent.ACTION_DIAL);
				intent.setData(Uri.parse("tel:13880108527"));
			}
		});
		
		/**
		 * 利用Intent�?�其他Activity传输数据
		 */
		Button button_7 = (Button) findViewById(R.id.button_7);
		button_7.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String data = "data from first Activity";
				Intent intent = new Intent(TestMenuActivity.this, FourthActivity.class);
				intent.putExtra("data", data);
				startActivity(intent);
			}
		});
		
		/**
		 * 利用finish（）销毁acticity
		 */
		Button button_8 = (Button) findViewById(R.id.button_8);
		button_8.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(TestMenuActivity.this, "即将销毁此Activity", Toast.LENGTH_LONG).show();
				finish();
				
			}
		});
		
		/**
		 * 利用 startActivityForResult()启动Activity
		 */
		
		Button button_9 = (Button) findViewById(R.id.button_9);
		button_9.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(TestMenuActivity.this, FifthActivity.class);
				startActivityForResult(intent, 1);
				
				
			}
		});
		
		Log.d("TestMenuActivity", "TestMenuActivity is working");
	}
	/**
	 * 重写onActivityResult()使得下一级的Activity能够返回数据给上一级的activity。
	 */
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data){
		switch (requestCode) {
		case 1:
			if (resultCode == RESULT_OK) {
				String dataString = data.getStringExtra("dataString");
				Toast.makeText(TestMenuActivity.this, dataString, Toast.LENGTH_LONG).show();
			}
			break;

		default:
			break;
		}
	}
	

/**
 * 构建menu的函数
 */

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	/**
	 * 菜单选择的处理函数
	 */
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
	switch (item.getItemId()) {
	case R.id.add_item:
		Toast.makeText(TestMenuActivity.this, "add item", Toast.LENGTH_SHORT).show();
		
		break;
		
	case R.id.remove_item:
		Toast.makeText(TestMenuActivity.this, "remove item", Toast.LENGTH_SHORT).show();
		break;

	default:
		break;
	}
	return true;
	}
}
