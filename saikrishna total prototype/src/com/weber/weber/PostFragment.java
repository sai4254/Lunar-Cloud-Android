package com.weber.weber;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;

public class PostFragment extends Fragment {
	String[] name;
	String[] time;
	String[] location;
	String[] paragraph;;

	int[] flag;
	ListView list;
	Post_page_adapter adapter;
	TextView like, camment;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View rootView = inflater.inflate(R.layout.fragment_feedpage_tab,
				container, false);
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
		// Locate the ListView in fragmenttab2.xml
		list = (ListView) rootView.findViewById(R.id.listview_feed_page);

		// Pass results to ListViewAdapter Class
		adapter = new Post_page_adapter(getActivity(), name, time, location,
				paragraph, flag);
		// Binds the Adapter to the ListView
		list.setAdapter(adapter);
		list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				Intent i1 = new Intent(getActivity(),
						profile_pic_fragment_person_each.class);
				startActivity(i1);
			}
		});
		return rootView;
	}

}
