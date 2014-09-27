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

public class Feedback_setting_fragment extends FragmentActivity {
	EditText title, msg;
	Button feed;

	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		setContentView(R.layout.settting_feed_back_page);
		setTitle("Feedback");
		ActionBar bar = getActionBar();

		bar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#ff4ba587")));
		title = (EditText) findViewById(R.id.edittext_title);
		msg = (EditText) findViewById(R.id.edittext_msg);
		feed = (Button) findViewById(R.id.feedbackbut);
		feed.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				title.setText("");
				msg.setText("");
				Toast.makeText(getApplicationContext(),
						"Thank You For Giving Feedback", Toast.LENGTH_LONG)
						.show();
			}
		});
	}
}
