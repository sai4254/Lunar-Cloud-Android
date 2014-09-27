package com.weber.weber;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Notification_fragment_adapter extends BaseAdapter {
	Context context;
	String[] comment;
	int[] flag;
	ListView list;
	Notification_fragment_adapter adapter1;
	LayoutInflater inflater;

	public Notification_fragment_adapter(Context context, String[] comment,
			int[] flag) {
		this.context = context;
		this.comment = comment;
		this.flag = flag;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return comment.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		TextView Comment;
		ImageView imgperson;

		inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		View itemView = inflater.inflate(R.layout.notification_adapter_page,
				parent, false);

		// Locate the TextViews in listview_item.xml
		Comment = (TextView) itemView
				.findViewById(R.id.comment_for_notification);
		imgperson = (ImageView) itemView
				.findViewById(R.id.image_for_notification);

		// Capture position and set to the TextViews

		Comment.setText(comment[position]);

		imgperson.setImageResource(flag[position]);

		return itemView;
	}
}
