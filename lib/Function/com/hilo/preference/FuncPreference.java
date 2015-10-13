package com.hilo.preference;

import android.content.Context;
import android.content.SharedPreferences;

public class FuncPreference {

	private static final String NUMBER = "number";

	public static int loadNum( Context con ){
		SharedPreferences pref = con.getSharedPreferences( NUMBER , Context.MODE_PRIVATE );
		// 取得失敗した場合は return"0"
		return pref.getInt(NUMBER, 0);
	}

	public static void saveNum( Context con, String number ){
		SharedPreferences pref = con.getSharedPreferences( NUMBER , Context.MODE_PRIVATE );
		SharedPreferences.Editor editor = pref.edit();
		editor.putString( NUMBER, number );
		editor.commit();
	}


}
