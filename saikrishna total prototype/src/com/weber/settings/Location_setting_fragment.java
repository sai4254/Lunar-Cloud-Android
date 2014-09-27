package com.weber.settings;

import android.app.ActionBar;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.weber.weber.R;

public class Location_setting_fragment extends FragmentActivity {
	static final LatLng archana = new LatLng(17.054, 78.16);
	private GoogleMap googlemap;

	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		setContentView(R.layout.setting_location_page);
		setTitle("Location");
		ActionBar bar = getActionBar();

		bar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#ff4ba587")));
		try {
			if (googlemap == null) {
				googlemap = ((MapFragment) getFragmentManager()
						.findFragmentById(R.id.map)).getMap();

			}
			googlemap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
			Marker marker = googlemap.addMarker(new MarkerOptions().position(
					archana).title("kphb"));
		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}
