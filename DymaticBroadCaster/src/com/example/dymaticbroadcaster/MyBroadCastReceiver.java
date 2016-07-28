package com.example.dymaticbroadcaster;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadCastReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		Toast.makeText(context, "接收到自定义广播",Toast.LENGTH_LONG).show();
/*Intent intent1 = new Intent(Intent.ACTION_VIEW);
intent1.setData(Uri.parse("http://www.baidu.com"));
intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
context.startActivity(intent1);//打开浏览器*/
		
Intent intent2 = context.getPackageManager().getLaunchIntentForPackage("com.example.listviewtest");
intent2.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
context.startActivity(intent2);//打开另一个app
	}
}
