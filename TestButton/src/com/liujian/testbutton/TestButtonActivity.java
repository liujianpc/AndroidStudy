/**
 * 
 */
package com.liujian.testbutton;


import com.liujian.testbutton.R;
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
public class TestButtonActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main_activity);
		Button button_1 = (Button) findViewById(R.id.button_1);
		button_1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(TestButtonActivity.this, "this is the toast", Toast.LENGTH_LONG).show();
				
			}
		});
	}
}