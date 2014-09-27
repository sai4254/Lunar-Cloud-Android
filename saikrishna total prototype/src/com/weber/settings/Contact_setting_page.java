package com.weber.settings;

import com.weber.weber.R;

import android.app.ActionBar;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class Contact_setting_page extends FragmentActivity{
@Override
protected void onCreate(Bundle arg0) {
	// TODO Auto-generated method stub
	super.onCreate(arg0);
	setContentView(R.layout.setting_contact_page);
	setTitle("Contact US");
	ActionBar bar = getActionBar();

	bar.setBackgroundDrawable(new ColorDrawable(Color
			.parseColor("#ff4ba587")));
}
}
