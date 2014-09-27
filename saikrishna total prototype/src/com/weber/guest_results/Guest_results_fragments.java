package com.weber.guest_results;

import android.app.ActionBar;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SearchView;

import com.weber.weber.R;
import com.weber.weber.profile_pic_fragment_person_each;

public class Guest_results_fragments extends FragmentActivity {
	private ActionBar actionBar;
	String[] name;
	String[] time;
	String[] location;
	String[] paragraph;;

	int[] flag;
	ListView list;
	Guest_results_adapter adapter;

	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		setContentView(R.layout.fragment_guest_search_results_page);
		actionBar = getActionBar();

		// Hide the action bar title
		actionBar.setDisplayShowTitleEnabled(false);
		ActionBar bar = getActionBar();
		bar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#ff4ba587")));
		name = new String[] { "Rahul", "Karhik", "Srujan", "Dheepak", "Sri",
				"Susmitha", "Sahithya", "Rakesh", "Dhepali" };
		time = new String[] { "6:45", "7:08", "8:09", "9:45", "1:56", "7:12",
				"7:45", "9:09", "10:05" };
		location = new String[] { "Miyapur", "hydernagar", "nizampet",
				"kphpcolony", "htechcity", "bachupally", "jntu hyd",
				"nizampet", "kukatpally" };
		paragraph = new String[] {
				"i would like to go to movie can any one join with us, its really awesome to enjoy the day ,we will find a new thing",
				"i would like to go to movie can any one join with us, its really awesome to enjoy the day ,we will find a new thing",
				"i would like to go to movie can any one join with us, its really awesome to enjoy the day ,we will find a new thing",
				"i would like to go to movie can any one join with us, its really awesome to enjoy the day ,we will find a new thing",
				"i would like to go to movie can any one join with us, its really awesome to enjoy the day ,we will find a new thing",
				"i would like to go to movie can any one join with us, its really awesome to enjoy the day ,we will find a new thing",
				"i would like to go to movie can any one join with us, its really awesome to enjoy the day ,we will find a new thing",
				"i would like to go to movie can any one join with us, its really awesome to enjoy the day ,we will find a new thing",
				"i would like to go to movie can any one join with us, its really awesome to enjoy the day ,we will find a new thing" };
		flag = new int[] { R.drawable.image8, R.drawable.image5,
				R.drawable.image4, R.drawable.image2, R.drawable.image1,
				R.drawable.image7, R.drawable.image3, R.drawable.image9,
				R.drawable.sss };
		list = (ListView) findViewById(R.id.listView1_result_page);
		list.setAdapter(new Guest_results_adapter(getApplicationContext(),
				name, time, location, paragraph, flag));
		list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				Intent i2 = new Intent(Guest_results_fragments.this,
						profile_pic_fragment_person_each.class);
				startActivity(i2);
			}
		});

	}

	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.activity_main_actions, menu);

		// Associate searchable configuration with the SearchView
		SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
		SearchView searchView = (SearchView) menu.findItem(R.id.action_search)
				.getActionView();
		searchView.setSearchableInfo(searchManager
				.getSearchableInfo(getComponentName()));

		return super.onCreateOptionsMenu(menu);
	}
}
