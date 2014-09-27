package com.weber.weber;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.GridView;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

import com.weber.settings.About_setting_fragment;
import com.weber.settings.Contact_setting_page;
import com.weber.settings.Feedback_setting_fragment;
import com.weber.settings.Location_setting_fragment;
import com.weber.settings.Network_usage_setting_page;
import com.weber.settings.Profile_page_setting_fragment;
import com.weber.settings.Queries_setting_fragment;

public class SettingFragment extends Fragment {
	int[] images_for_gridview;
	String[] names_for_gridview;

	GridView gv;
	Settings_page_fragment_adapter adapter2;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View gridroot = inflater.inflate(R.layout.fragment_settings_page_tab,
				container, false);
		images_for_gridview = new int[] { R.drawable.about,
				R.drawable.profile_pic, R.drawable.status, R.drawable.location,
				R.drawable.language, R.drawable.notification,
				R.drawable.feedback, R.drawable.neteork_usage,
				R.drawable.contactus, R.drawable.deletemyacc,
				R.drawable.logout, R.drawable.queries };
		names_for_gridview = new String[] { "ABOUT", "Profile Pic", "Status",
				"Location", "Language", "Notification", "FeedBack",
				"Network Usage", "Contact Us", "Delete Account", "Logout",
				"Queries" };

		gv = (GridView) gridroot.findViewById(R.id.settings_grid);

		Log.d("", "run");
		gv.setAdapter(new Settings_page_fragment_adapter(getActivity(),
				images_for_gridview, names_for_gridview));
		Log.d("", "running");
		gv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1,
					int set_position, long arg3) {
				// TODO Auto-generated method stub
				if (set_position == 0) {
					Intent about = new Intent(getActivity(),
							About_setting_fragment.class);
					startActivity(about);
				} else if (set_position == 1) {
					Intent profile = new Intent(getActivity(),
							Profile_page_setting_fragment.class);
					startActivity(profile);
				} else if (set_position == 2) {
					final Dialog status = new Dialog(getActivity());
					status.setContentView(R.layout.setting_status_page);
					status.setTitle("Weber Status");
					//status.setFeatureDrawableResource(set_position,
						//	R.drawable.noti_dialog_icon);
					status.show();
					final RadioGroup rg = (RadioGroup) status
							.findViewById(R.id.online_status);
					rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {

						@Override
						public void onCheckedChanged(RadioGroup group,
								int checkedId) {
							/*
							 * // TODO Auto-generated method stub int selectedId
							 * = rg.getCheckedRadioButtonId();
							 * 
							 * // find the radiobutton by returned id rb1 =
							 * (RadioButton) findViewById(selectedId);
							 * 
							 * Toast.makeText(Weber_settings_page.this,
							 * rb1.getText(), Toast.LENGTH_SHORT).show();
							 */
						}
					});

				} else if (set_position == 3) {
					Intent locat = new Intent(getActivity(),
							Location_setting_fragment.class);
					startActivity(locat);
				} else if (set_position == 4) {
					final Dialog lang = new Dialog(getActivity());
					lang.setContentView(R.layout.setting_language_page);
					lang.setTitle("Languages");
				//	lang.setFeatureDrawableResource(set_position,
					//		R.drawable.lang_dialog_noti);
					lang.show();
					final RadioGroup rg2 = (RadioGroup) lang
							.findViewById(R.id.language);
					Button show = (Button) lang.findViewById(R.id.show);
					show.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							// get selected radio button from radioGroup
							/*
							 * int selectedId = rg2.getCheckedRadioButtonId();
							 * 
							 * // find the radiobutton by returned id rb =
							 * (RadioButton) findViewById(selectedId);
							 * 
							 * Toast.makeText(getApplicationContext(),
							 * rb.getText(), Toast.LENGTH_SHORT).show();
							 */
						}
					});

				} else if (set_position == 5) {
					final Dialog lang = new Dialog(getActivity());
					lang.setContentView(R.layout.setting_notification_page);
					lang.setTitle("Notifications");
				//	lang.setFeatureDrawableResource(set_position,
					//		R.drawable.notif_dialog_pic);
					lang.show();
					final RadioGroup rg_for_noti = (RadioGroup) lang
							.findViewById(R.id.notification);
					Button noti = (Button) lang.findViewById(R.id.ok);
					noti.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							// get selected radio button from radioGroup
							/*
							 * int selectedId =
							 * rg_for_noti.getCheckedRadioButtonId();
							 * 
							 * // find the radiobutton by returned id rb =
							 * (RadioButton) findViewById(selectedId);
							 * 
							 * Toast.makeText(getApplicationContext(),
							 * rb.getText(), Toast.LENGTH_SHORT).show();
							 */
						}
					});

				} else if (set_position == 6) {
					Intent feedback = new Intent(getActivity(),
							Feedback_setting_fragment.class);
					startActivity(feedback);

				} else if (set_position == 7) {
					Intent network = new Intent(getActivity(),
							Network_usage_setting_page.class);
					startActivity(network);

				} else if (set_position == 8) {
					Intent cnt = new Intent(getActivity(),
							Contact_setting_page.class);
					startActivity(cnt);

				} else if (set_position == 9) {
					Toast.makeText(getActivity(),
							"You want to delete your account",
							Toast.LENGTH_LONG).show();

				} else if (set_position == 10) {
					Builder builder = new Builder(getActivity());
					builder.setTitle("Logout");
					builder.setIcon(R.drawable.logout_dialog_icon);
					builder.setMessage("are you sure?");
					builder.setPositiveButton("Yes",
							new DialogInterface.OnClickListener() {

								@Override
								public void onClick(DialogInterface dialog,
										int which) {
									// TODO Auto-generated method stub
									Toast.makeText(getActivity(),
											"You are logout to your account",
											Toast.LENGTH_LONG).show();
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
				} else if (set_position == 11) {
					Intent query = new Intent(getActivity(),
							Queries_setting_fragment.class);
					startActivity(query);

				}
			}
		});
		return gridroot;
	}
}
