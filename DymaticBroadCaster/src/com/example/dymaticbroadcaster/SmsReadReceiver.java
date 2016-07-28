package com.example.dymaticbroadcaster;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class SmsReadReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
Toast.makeText(context, "阅读短信", Toast.LENGTH_LONG).show();
	}

}
