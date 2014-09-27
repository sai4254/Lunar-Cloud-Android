package com.weber.settings;

import android.app.ActionBar;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

import com.weber.weber.R;

public class Network_usage_setting_page extends FragmentActivity {
	Network_Adapter adap;
	ListView li;
	String[] size_of_content = { "200messages", "300messages", "958.0KB",
			"2.5KB", "1.5KB", "10.5KB", "1.7MB", "13.0MB", "Clear all" };
	String[] content_usage = { "Messages Sent:", " Messages Received:",
			" Message Bytes Sent:", " message Bytes Seceived:",
			"Media Bytes Sent:", " Media Bytes Received:",
			" Total Bytes Sent:", " Total Bytes Received:", " Reset Statistics" };

	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		setContentView(R.layout.setting_network_usage_page);
		setTitle("Network Usage");
		ActionBar bar = getActionBar();

		bar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#ff4ba587")));
		li = (ListView) findViewById(R.id.network);
		adap = new Network_Adapter(Network_usage_setting_page.this,
				content_usage, size_of_content);
		li.setAdapter(adap);
		li.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int byt,
					long arg3) {
				if (byt == 8) {
					// TODO Auto-generated method stub
					Builder builder = new Builder(
							Network_usage_setting_page.this);
					builder.setTitle("Statistics");
					builder.setMessage("Clear all data?");
					builder.setPositiveButton("Yes",
							new DialogInterface.OnClickListener() {

								@Override
								public void onClick(DialogInterface dialog,
										int which) {
									// TODO Auto-generated method stub
									Toast.makeText(getApplicationContext(),
											"You are clear all the data",
											Toast.LENGTH_LONG).show();
									finish();
								}
							});
					builder.setNegativeButton("No",
							new DialogInterface.OnClickListener() {

								@Override
								public void onClick(DialogInterface dialog,
										int which) {
									// TODO Auto-generated method stub

								}
							});
					AlertDialog alertDialog = builder.create();
					alertDialog.show();
				}
			}
		});
	}
}
