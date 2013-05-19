package com.mws.llc.libs.asquare.demo;

import com.mws.llc.libs.asquare.demo.R;
import com.mws.llc.libs.asquare.demo.R.id;
import com.mws.llc.libs.asquare.demo.R.layout;
import com.mws.llc.libs.asquare.demo.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;

public class DemoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_demo);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.demo, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();

		switch (id) {
		case R.id.action_reset:
			setContentView(R.layout.activity_demo);
			break;

		case R.id.action_see_image_views:
			setContentView(R.layout.activity_demo_image_views);
			break;

		case R.id.action_see_text_views:
			setContentView(R.layout.activity_demo_text_views);
			break;

		case R.id.action_see_frame_layouts:
			setContentView(R.layout.activity_demo_frame_layouts);
			break;

		case R.id.action_see_linear_layouts:
			setContentView(R.layout.activity_demo_linear_layouts);
			break;

		case R.id.action_see_relative_layouts:
			setContentView(R.layout.activity_demo_relative_layouts);
			break;

		case R.id.action_see_table_layouts:
			setContentView(R.layout.activity_demo_table_layouts);
			break;

		default:
			return super.onOptionsItemSelected(item);
		}

		return true;
	}
}
