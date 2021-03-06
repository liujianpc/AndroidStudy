package com.example.ninepatchtest;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends Activity {
	private List<Message> messages = new ArrayList<Message>();
	private EditText inputText;
	private Button sendButton;
	private MessageAdapter adapter;
	private ListView listView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		initMessages();
		adapter = new MessageAdapter(MainActivity.this,
				R.layout.message_item, messages);
		listView = (ListView) findViewById(R.id.message_listView);
		listView.setAdapter(adapter);
		/*
		 * if (!((EditText)
		 * findViewById(R.id.message_edit)).getText().toString().equals("")) {
		 * ((Button)
		 * findViewById(R.id.send_button)).setBackgroundColor(Color.parseColor
		 * ("#000000")); }
		 */
		sendButton = (Button) findViewById(R.id.send_button);
		inputText = (EditText) findViewById(R.id.message_edit);
		sendButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String messageContent = inputText.getText().toString();
				if (!messageContent.equals("")) {
					
					messages.add(new Message(messageContent, Message.TYPE_SENDED));
					adapter.setNotifyOnChange(true);
					listView.setSelection(messages.size());
					inputText.setText("");
					
				}
				

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
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	public void initMessages() {
		Message messageRecv_1 = new Message("今晚约吗?", Message.TYPE_RECEIVED);
		Message messageSend_1 = new Message("万水千山总是情！便宜一点行不行！",
				Message.TYPE_SENDED);
		Message messageRecv_2 = new Message("不行，不行！", Message.TYPE_RECEIVED);
		Message messageSend_2 = new Message("那就不约了！不约了！", Message.TYPE_SENDED);
		messages.add(messageRecv_1);
		messages.add(messageSend_1);
		messages.add(messageRecv_2);
		messages.add(messageSend_2);

	}
}
