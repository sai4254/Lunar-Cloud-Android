package com.weber.settings;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.weber.weber.R;

public class Network_Adapter extends BaseAdapter {
	Context mContext;
	String[] content_usage;
	String[] size_of_content;

	public Network_Adapter(Context c, String[] content_usage,
			String[] size_of_content) {
		mContext = c;
		this.content_usage = content_usage;
		this.size_of_content = size_of_content;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return content_usage.length;
	}

	@Override
	public Object getItem(int arg0) {
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
		LayoutInflater inf = (LayoutInflater) mContext
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View items = inf.inflate(R.layout.setting_network_adapter, parent,
				false);
		TextView c1 = (TextView) items.findViewById(R.id.content_of_usage);
		TextView c2 = (TextView) items.findViewById(R.id.content_of_usage_size);
		c1.setText(content_usage[position]);
		c2.setText(size_of_content[position]);
		return items;
	}

}
