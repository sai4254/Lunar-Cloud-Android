package com.weber.weber;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class NotificationsFragment extends Fragment {
	String[] comment;
	int[] flag;
	ListView list;
	Notification_fragment_adapter adapter1;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_notification_page,
				container, false);
		comment = new String[] { "Navya likes you shared video",
				"saikrishna likes your profile pic", "anusha comment on you",
				"Meena likes you shared video",
				"sharmi likes you shared video", "anu likes you shared video",
				"saikrishna likes your profile pic", "anusha comment on you",
				"navya comment on you" };

		flag = new int[] { R.drawable.baby1, R.drawable.boy, R.drawable.baby5,
				R.drawable.baby, R.drawable.baby4, R.drawable.baby6,
				R.drawable.boy, R.drawable.baby5, R.drawable.baby4 };
		// Locate the ListView in fragmenttab2.xml
		list = (ListView) rootView.findViewById(R.id.listView_notification);
		// Pass results to ListViewAdapter Class
		adapter1 = new Notification_fragment_adapter(getActivity(), comment, flag);
		// Binds the Adapter to the ListView
		list.setAdapter(adapter1);

		return rootView;
	}
}
