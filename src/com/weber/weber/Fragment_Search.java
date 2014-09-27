package com.weber.weber;

import com.weber.guest_results.Guest_results_fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Fragment_Search extends FragmentActivity {
	Button go, signin;

	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		setContentView(R.layout.fragment_search);
		getActionBar().hide();
		// requestWindowFeature(Window.FEATURE_NO_TITLE);

		go = (Button) findViewById(R.id.button2);
		signin = (Button) findViewById(R.id.sign_signup);
		go.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent go1 = new Intent(Fragment_Search.this, Guest_results_fragments.class);
				startActivity(go1);
			}
		});
		signin.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODOgenerated method stub
				Intent sign1 = new Intent(Fragment_Search.this, Weber.class);
				startActivity(sign1);
			}
		});
	}
}
