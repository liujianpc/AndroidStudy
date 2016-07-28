package com.example.dymaticbroadcaster;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class PoweronBroadCastReceiver extends BroadcastReceiver {

	public PoweronBroadCastReceiver() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		Toast.makeText(context, "开机问候", Toast.LENGTH_LONG).show();

	}

}
