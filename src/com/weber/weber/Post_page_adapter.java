package com.weber.weber;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Post_page_adapter extends BaseAdapter {

	// Declare Variables
	Context context;
	String[] name;
	String[] time;
	String[] paragraph;
	String[] location;
	int[] flag;
	LayoutInflater inflater;

	public Post_page_adapter(Context context, String[] name, String[] time,
			String[] location, String[] paragraph, int[] flag) {
		this.context = context;
		this.name = name;
		this.time = time;
		this.location = location;
		this.paragraph = paragraph;
		this.flag = flag;
	}

	public int getCount() {
		return name.length;
	}

	public Object getItem(int position) {
		return null;
	}

	public long getItemId(int position) {
		return 0;
	}

	public View getView(int position, View convertView, ViewGroup parent) {

		// Declare Variables
		TextView Name;
		TextView time1;
		TextView location1;
		ImageView imgperson;
		TextView paragraph1;
		;

		inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		View itemView = inflater.inflate(R.layout.feedpage_adapter, parent,
				false);

		// Locate the TextViews in listview_item.xml
		Name = (TextView) itemView.findViewById(R.id.profile_name_feed_page);
		time1 = (TextView) itemView.findViewById(R.id.time_feed_page);
		location1 = (TextView) itemView.findViewById(R.id.location_feed_page);
		// Locate the ImageView in listview_item.xml
		imgperson = (ImageView) itemView
				.findViewById(R.id.profile_imagerounded_feed_page);
		paragraph1 = (TextView) itemView.findViewById(R.id.paragraph_feed_page);

		// Capture position and set to the TextViews
		Name.setText(name[position]);
		time1.setText(time[position]);
		location1.setText(location[position]);
		paragraph1.setText(paragraph[position]);

		// Capture position and set to the ImageView
		imgperson.setImageResource(flag[position]);

		return itemView;
	}
}
