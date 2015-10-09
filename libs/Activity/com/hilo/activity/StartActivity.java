package com.hilo.activity;

import com.example.passwordmanager.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StartActivity extends Activity{

	private String[] lists = {"Title 1",
			"Title 2",
			"Title 3",
			"Title 4",
			"Title 5",
			"Title 6",
			"Title 7",
			"Title 8",
			"Title 9",
			"Title 10",
			"Title 11",
			"Title 12",};

	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(getLayoutID());

		create(savedInstanceState);

		ListView lv = (ListView)findViewById(R.id.list_view);
		ArrayAdapter<String> adpt = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, lists);
		lv.setAdapter(adpt);
	}

	public void create(Bundle savedInstanceState){

	}

	public void initExec(){

//		ListView lv = (ListView)findViewById(R.id.list_view);

//		ArrayList<String> list = new ArrayList<String>();
//		list.add("Title 1");
//		list.add("Title 2");
//		list.add("Title 3");
//		list.add("Title 4");
//		list.add("Title 5");
//		list.add("Title 6");
//		list.add("Title 7");
//		list.add("Title 8");
//		list.add("Title 9");
//		list.add("Title 10");
//		list.add("Title 11");
//		list.add("Title 12");

//		list = readList();

//		ArrayAdapter<String> adpt = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, lists);
//		lv.setAdapter(adpt);
	}

//	public ArrayList<String> readList(){
//		ArrayList<String> list = new ArrayList<String>();
//
//		list.add("Title 1");
//		list.add("Title 2");
//		list.add("Title 3");
//		list.add("Title 4");
//		list.add("Title 5");
//		list.add("Title 6");
//		list.add("Title 7");
//		list.add("Title 8");
//		list.add("Title 9");
//		list.add("Title 10");
//		list.add("Title 11");
//		list.add("Title 12");
//
//		return list;
//	}

	public int getLayoutID(){
//		return R.layout.activity_main;
		return R.layout.view_main;
	}

}
