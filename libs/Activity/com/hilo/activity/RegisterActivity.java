package com.hilo.activity;

import com.example.passwordmanager.R;
import com.hilo.preference.FuncPreference;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends Activity{

	public static String title 		= "";
	public static String id 		= "";
	public static String password 	= "";

	@Override
	public void onCreate( Bundle bundle ){
		super.onCreate( bundle );
		setContentView( R.layout.view_reg );

		Button regBtn = (Button)findViewById(R.id.button_RegItem);
		regBtn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				EditText titleEdit 		= (EditText)findViewById(R.id.editText_Title);
				EditText idEdit 		= (EditText)findViewById(R.id.editText_Id);
				EditText passwordEdit 	= (EditText)findViewById(R.id.editText_Password);

				title 	= titleEdit.getText().toString();
				id 		= idEdit.getText().toString();
				password= passwordEdit.getText().toString();

				int itemNum = FuncPreference.loadMaxItem( getApplicationContext() );
				itemNum = itemNum + 1;

				FuncPreference.saveTitle(getApplicationContext(), itemNum, title);
				FuncPreference.saveId(getApplicationContext(), itemNum, id);
				FuncPreference.savePassword(getApplicationContext(), itemNum, password);

				FuncPreference.saveMaxItem(getApplicationContext(), itemNum);

				Intent intent = new Intent( RegisterActivity.this, StartActivity.class );
				try{
					startActivity( intent );
				} catch( Exception e ){
					e.printStackTrace();
				}

				finish();

			}
		});
	}
}
