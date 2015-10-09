package com.hilo.activity;

import java.util.ArrayList;

import com.example.passwordmanager.R;
import com.hilo.preference.FuncPreference;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class StartActivity extends Activity{

	private static ArrayList<String> lists = new ArrayList<String>();

	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(getLayoutID());

		initSettings();

		ListView lv = (ListView)findViewById(R.id.list_view);
		ArrayAdapter<String> adpt = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, lists);
		lv.setAdapter(adpt);

		Button addBtn = (Button)findViewById(R.id.button_newReg);
		addBtn.setOnClickListener( new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// Addボタン押下時の処理
				TextView text = (TextView)findViewById(R.id.text_title);
				text.setText("change text ...");
			}
		});
	}

	private void initSettings(){
		// 登録数取得
		int count = FuncPreference.loadNum( getApplicationContext() );

		// プリファレンスから登録データの読み出し
		for( int i = 0; i <= count; i++ ){

		}
	}

	public int getLayoutID(){
		return R.layout.view_main;
	}

}
