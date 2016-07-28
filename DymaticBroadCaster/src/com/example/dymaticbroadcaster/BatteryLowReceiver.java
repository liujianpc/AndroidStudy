package com.example.dymaticbroadcaster;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BatteryLowReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
Toast.makeText(context, "电池电量低", Toast.LENGTH_LONG).show();
	}

}
