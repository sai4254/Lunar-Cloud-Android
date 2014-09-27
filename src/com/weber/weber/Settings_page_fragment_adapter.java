package com.weber.weber;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;

public class Settings_page_fragment_adapter extends BaseAdapter {
	Context mcontext;
	int[] images_for_gridview;
	String[] names_for_gridview;
	Settings_page_fragment_adapter adapter2;
	LayoutInflater inflater;

	public Settings_page_fragment_adapter(Context mContext,
			int[] images_for_gridview, String[] names_for_gridview) {
		mcontext = mContext;
		this.names_for_gridview = names_for_gridview;
		this.images_for_gridview = images_for_gridview;

	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return images_for_gridview.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		View grid;
		inflater = (LayoutInflater) mcontext
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		if (convertView == null) {

			grid = new View(mcontext);
			grid = inflater.inflate(R.layout.fragment_settings_grid_adapter,
					null);
			TextView nameofimage = (TextView) grid
					.findViewById(R.id.textbetweenimage);
			ImageView imagefor_setting = (ImageView) grid
					.findViewById(R.id.image_view__for_grid_adapter);
			nameofimage.setText(names_for_gridview[position]);
			imagefor_setting.setImageResource(images_for_gridview[position]);
			imagefor_setting.setScaleType(ScaleType.FIT_XY);
		} else {
			grid = (View) convertView;
		}

		return grid;

	}

}
