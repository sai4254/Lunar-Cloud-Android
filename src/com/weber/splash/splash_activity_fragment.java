package com.weber.splash;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.ProgressBar;

import com.weber.splash.LoadingTask.LoadingTaskFinishedListener;
import com.weber.weber.Fragment_Search;
import com.weber.weber.R;

public class splash_activity_fragment extends FragmentActivity implements
		LoadingTaskFinishedListener {
	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		setContentView(R.layout.home_fragment);
		getActionBar().hide();
		// Find the progress bar
		ProgressBar progressBar = (ProgressBar) findViewById(R.id.activity_splash_progress_bar);
		// Start your loading
		new LoadingTask(progressBar, this).execute("www.google.co.uk");
		// Pass
	}

	// This is the callback for when your async task has finished
	@Override
	public void onTaskFinished() {
		completeSplash();
	}

	private void completeSplash() {
		startApp();
		finish(); // Don't forget to finish this Splash Activity so the user
					// can't return to it!
	}

	private void startApp() {
		Intent intent1 = new Intent(splash_activity_fragment.this,
				Fragment_Search.class);
		startActivity(intent1);
	}
}
