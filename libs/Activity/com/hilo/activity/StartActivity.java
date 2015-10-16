package com.hilo.activity;

import java.util.ArrayList;

import com.example.passwordmanager.R;
import com.hilo.preference.FuncPreference;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class StartActivity extends Activity{

	private static ArrayList<String> showLists = new ArrayList<String>();

	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(getLayoutID());

		initSettings();

		ListView lv = (ListView)findViewById(R.id.list_view);
		ArrayAdapter<String> adpt = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, showLists);
		lv.setAdapter(adpt);

		// reload ???
		startActivity(getIntent());

		Button addBtn = (Button)findViewById(R.id.button_newReg);
		addBtn.setOnClickListener( new View.OnClickListener() {

			@Override
			public void onClick( View v ) {
				// Addボタン押下時の処理
				Intent intent = new Intent( StartActivity.this, RegisterActivity.class );
				try{
					startActivity( intent );
				} catch( Exception e ){
					e.printStackTrace();
				}

			}
		});
	}

	private void initSettings(){
		// 登録数取得
		int maxCnt = FuncPreference.loadMaxItem( getApplicationContext() );

		if( maxCnt == 0 ){
			return;
		}

		// プリファレンスから登録データの読み出し
		for( int i = 1; i <= maxCnt; i++ ){
			showLists.add( FuncPreference.loadTitle( getApplicationContext(), i ) );
		}
	}

	public int getLayoutID(){
		return R.layout.view_main;
	}

}
