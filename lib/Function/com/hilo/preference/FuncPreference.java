package com.hilo.preference;

import android.content.Context;
import android.content.SharedPreferences;

public class FuncPreference {

	private static final String MAX_ITEM 		= "MAX_ITEM";
	private static final String REG_TITLE 		= "REG_TITLE";
	private static final String REG_ID 			= "REG_ID";
	private static final String REG_PASSWORD 	= "REG_PASSWORD";

	//===============================================================================================
	// ShareMethod
	//===============================================================================================
	public static SharedPreferences getPreferences( Context context ){
		SharedPreferences pref = context.getSharedPreferences( "PassMngPref" , Context.MODE_PRIVATE );
		return pref;
	}

	//===============================================================================================
	// MaxItem
	//===============================================================================================
	public static int loadMaxItem( Context context ){
		// 取得失敗した場合は return"0"
		return getPreferences( context ).getInt( MAX_ITEM, 0 );
	}
	public static void saveMaxItem( Context context, int maxItem ){
		SharedPreferences.Editor editor = getPreferences( context ).edit();
		editor.putInt( MAX_ITEM, maxItem );
		editor.commit();
	}

	//===============================================================================================
	// Title
	//===============================================================================================
	public static String loadTitle( Context context, int number ){
		// 取得失敗した場合は return"0"
		String num = String.format("%03d", number );;
		return getPreferences( context ).getString( REG_TITLE + "_" + num, "0" );
	}
	public static void saveTitle( Context context, int number, String title ){
		String num = String.format("%03d", number );
		SharedPreferences.Editor editor = getPreferences( context ).edit();
		editor.putString( REG_TITLE + "_" + num, title );
		editor.commit();
	}

	//===============================================================================================
	// ID
	//===============================================================================================
	public static String loadId( Context context, int number ){
		// 取得失敗した場合は return"0"
		String num = String.format("%03d", number );
		return getPreferences( context ).getString( REG_ID + "_" + num, "0" );
	}
	public static void saveId( Context context, int number, String id ){
		String num = String.format("%03d", number );
		SharedPreferences.Editor editor = getPreferences( context ).edit();
		editor.putString( REG_ID + "_" + num, id );
		editor.commit();
	}

	//===============================================================================================
	// Password
	//===============================================================================================
	public static String loadPassword( Context context, int number ){
		// 取得失敗した場合は return"0"
		String num = String.format("%03d", number );
		return getPreferences( context ).getString( REG_PASSWORD + "_" + num, "0" );
	}
	public static void savePassword( Context context, int number, String password ){
		String num = String.format("%03d", number );
		SharedPreferences.Editor editor = getPreferences( context ).edit();
		editor.putString( REG_PASSWORD + "_" + num, password );
		editor.commit();
	}
}
