package com.example.listviewtest;

import java.util.ArrayList;
import java.util.List;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class MainActivity extends BaseActivity {

	/*
	 * private String fruits[] = { "狼家", "龙家", "鹿家", "玫瑰家", "狮家", "铁种", "鱼家",
	 * "鹰家", "毒蛇家" ,"剥皮家","黑城堡","塞北野人","异鬼","森林之子"};
	 */
	private List<Family> families = new ArrayList<Family>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		/**
		 * 将数组传入适配器，resource 一般选择为Simple_expandable_list_item_1
		 */
		/*
		 * ArrayAdapter<String> adapter = new ArrayAdapter<String>(
		 * MainActivity.this, android.R.layout.simple_expandable_list_item_1,
		 * fruits); ListView listView = (ListView) findViewById(R.id.listView);
		 * listView.setAdapter(adapter);
		 */
		initFamilyData();
		FamilyAdapter adapter = new FamilyAdapter(MainActivity.this,
				R.layout.family_item, families);
		ListView listView = (ListView) findViewById(R.id.listView);
		listView.setAdapter(adapter);

		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				String getItm = families.get(arg2).getName();
				if ("狼家" == getItm) {
					Intent intent = new Intent("com.example.listviewtest.WOLF");
					startActivity(intent);
				} else if ("龙家" == getItm) {
					Intent intent = new Intent("com.example.listviewtest.DRAGON");
					startActivity(intent);

				} else if ("鹿家" == getItm) {
					Intent intent = new Intent("com.example.listviewtest.DEER");
					startActivity(intent);
				} else if ("狮家" == getItm) {
					Intent intent = new Intent("com.example.listviewtest.LION");
					startActivity(intent);
				} else if ("玫瑰家" == getItm) {
					Intent intent = new Intent("com.example.listviewtest.ROSE");
					startActivity(intent);
				} else if ("铁种" == getItm) {
					Intent intent = new Intent("com.example.listviewtest.IRON");
					startActivity(intent);
				} else if ("鹰家" == getItm) {
					Intent intent = new Intent("com.example.listviewtest.EAGLE");
					startActivity(intent);
				} else if ("毒蛇家" == getItm) {
					Intent intent = new Intent("com.example.listviewtest.SNACK");
					startActivity(intent);
				} else if ("鱼家" == getItm) {
					Intent intent = new Intent("com.example.listviewtest.FISH");
					startActivity(intent);
				} else if ("剥皮家" == getItm) {
					Intent intent = new Intent("com.example.listviewtest.CRULE");
					startActivity(intent);
				} else if ("黑城堡" == getItm) {
					Intent intent = new Intent("com.example.listviewtest.BLACKCASTLE");
					startActivity(intent);
				} else if ("塞外野人" == getItm) {
					Intent intent = new Intent("com.example.listviewtest.WILD");
					startActivity(intent);
				} else if ("森林之子" == getItm) {
					Intent intent = new Intent("com.example.listviewtest.SONOFFOEREST");
					startActivity(intent);
				} else if ("异鬼" == getItm) {
					Intent intent = new Intent("com.example.listviewtest.GHOST");
					startActivity(intent);
				}

			}
		});
		/*
		 * ListView listView2 = (ListView) findViewById(R.id.listView);
		 * 
		 * listView2.setOnClickListener(new OnClickListener() {
		 * 
		 * @Override public void onClick(View v) { // TODO Auto-generated method
		 * stub String helloString = "Hello 狼家史塔克家族，凛冬将至！"; Intent intent = new
		 * Intent(MainActivity.this, WolfActivity.class);
		 * intent.putExtra("greet", helloString); startActivity(intent); } });
		 */
	}

	public void initFamilyData() {
		Family wolfFamily = new Family("狼家", R.drawable.wolf);
		Family deerfFamily = new Family("鹿家", R.drawable.deer);
		Family dragonfFamily = new Family("龙家", R.drawable.dragon);
		Family lionFamily = new Family("狮家", R.drawable.lion);
		Family rosefFamily = new Family("玫瑰家", R.drawable.rose);
		Family ironFamily = new Family("铁种", R.drawable.octups);
		Family eaglefFamily = new Family("鹰家", R.drawable.eagle);
		Family snackFamily = new Family("毒蛇家", R.drawable.snack);
		Family fishFamily = new Family("鱼家", R.drawable.fish);
		Family cruleFamily = new Family("剥皮家", R.drawable.crule);
		Family blckCastleFamily = new Family("黑城堡", R.drawable.blackcastle);
		Family wildFamily = new Family("塞外野人", R.drawable.wild);
		Family sonFamily = new Family("森林之子", R.drawable.sonofforest);
		Family ghostFamily = new Family("异鬼", R.drawable.ghost);
		families.add(wolfFamily);
		families.add(deerfFamily);
		families.add(dragonfFamily);
		families.add(lionFamily);
		families.add(rosefFamily);
		families.add(ironFamily);
		families.add(eaglefFamily);
		families.add(snackFamily);
		families.add(fishFamily);
		families.add(cruleFamily);
		families.add(blckCastleFamily);
		families.add(wildFamily);
		families.add(sonFamily);
		families.add(ghostFamily);
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
		case R.id.action_exit:
			ActivityCollector.finishAllActivity();
			return true;
		case R.id.action_about:
			Dialog dialog = new Dialog(MainActivity.this);
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
