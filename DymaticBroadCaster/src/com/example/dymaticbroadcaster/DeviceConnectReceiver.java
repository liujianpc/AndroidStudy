package com.example.dymaticbroadcaster;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class DeviceConnectReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
Toast.makeText(context, "连接了设备", Toast.LENGTH_LONG).show();
	}

}
