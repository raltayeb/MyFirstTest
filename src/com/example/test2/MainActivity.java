package com.example.test2;

import java.util.ArrayList;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.TableLayout.LayoutParams;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		test();
	}

	private void test() {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		for (int j = 0; j < 3; j++) {
			list.add("ROW "+ j);
		}
		
		
		TableLayout mainTableLayout = (TableLayout) findViewById(R.id.myTableLayOut);
		 
			LinearLayout forheader = new LinearLayout(this);
			TextView header = new TextView(getApplicationContext());
			header.setText("     PASSENGERS NAMES:   " );
			header.setGravity(Gravity.CENTER_HORIZONTAL);
			header.setTextColor(Color.GREEN);
			header.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14);
			forheader.addView(header);
			mainTableLayout.addView(forheader);
		
//			ListView myListView = new ListView(this);
//			ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, list);
//			myListView.setAdapter(adapter);
//			mainTableLayout.addView(myListView);
			for (int j = 0; j < list.size(); j++) {
				TableLayout gabs = new TableLayout(getApplicationContext());
				TableLayout.LayoutParams params = new TableLayout.LayoutParams(
						LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
				params.setMargins(0, 1, 0, 1);
				gabs.setLayoutParams(params);
				LinearLayout ll = new LinearLayout(this);
				TextView t1 = new TextView(this);
				t1.setText("                  "+list.get(j));
				t1.setTextColor(Color.WHITE);
				t1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
				
				ll.addView(t1);
				if (j % 2 == 0) {
					ll.setBackgroundColor(Color.BLACK);

				} else {
					ll.setBackgroundColor(Color.parseColor("#333333"));
				}
				mainTableLayout.addView(gabs);
				mainTableLayout.addView(ll);
				
				
			}
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
}
