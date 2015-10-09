package com.example.passwordmanager;


import com.hilo.activity.StartActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends StartActivity {

	@Override
	public void create(Bundle savedInstanceState){
	}


//	@Override
//	protected void onResume(){
//		super.onResume();
//
//
//	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
