/**
 * 
 */
package com.testoptionmenue;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

/**
 * @author fbjh73
 *
 */
public class SecondActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.second_layout);
		Button button_3 = (Button) findViewById(R.id.button_3);
		button_3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(SecondActivity.this, "你妹的!", Toast.LENGTH_LONG).show();
			}
		});
		
	}

}
