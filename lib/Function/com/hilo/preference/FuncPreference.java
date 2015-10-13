package com.hilo.preference;

import android.content.Context;
import android.content.SharedPreferences;

public class FuncPreference {

	private static final String NUMBER = "number";
	private static final String TITLE = "title";

	public static SharedPreferences getPreferences( Context con ){
		SharedPreferences pref = con.getSharedPreferences( "PassMngPref" , Context.MODE_PRIVATE );
		return pref;
	}

	public static int loadNum( Context con ){
		// 取得失敗した場合は return"0"
		return getPreferences( con ).getInt( NUMBER, 0 );
	}

	public static void saveNum( Context con, int maxNumber ){
		SharedPreferences.Editor editor = getPreferences( con ).edit();
		editor.putInt( NUMBER, maxNumber );
		editor.commit();
	}


	public static String loadTitle( Context con, int number ){
		// 取得失敗した場合は return"0"
		String strNum = String.valueOf( Integer.valueOf( "%03d", number ) );
		return getPreferences( con ).getString( TITLE + "_" + strNum, "0" );
	}

	public static void saveTitle( Context con, int number, String title ){
		String strNum = String.valueOf( Integer.valueOf( "%03d", number ) );
		SharedPreferences.Editor editor = getPreferences(con).edit();
		editor.putString( TITLE + "_" + strNum, title );
		editor.commit();
	}
}
