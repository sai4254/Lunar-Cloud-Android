package com.weber.settings;

import android.app.ActionBar;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.weber.weber.R;

public class Queries_setting_fragment extends FragmentActivity {
	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		setContentView(R.layout.setting_queris_page);
		setTitle("Queries");
		ActionBar bar = getActionBar();

		bar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#ff4ba587")));
		final EditText ed = (EditText) findViewById(R.id.query_edit);
		Button btn = (Button) findViewById(R.id.query_btn);
		btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ed.setText("");
				Toast.makeText(getApplicationContext(), "Query Submited",
						Toast.LENGTH_LONG).show();
			}
		});
	}
}
