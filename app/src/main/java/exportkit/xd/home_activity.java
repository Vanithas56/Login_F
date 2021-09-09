
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		mad
	 *	@date 		1631113523428
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package exportkit.xd;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.content.Intent;
import android.widget.TextView;

public class home_activity extends Activity {

	
	private View _bg__home_ek2;
	private ImageView mapsicle_map;
	private ImageView path_ek18;
	private ImageView path_ek19;
	private ImageView path_ek20;
	private ImageView empty_bar_ek4;
	private ImageView path_ek21;
	private ImageView path_ek22;
	private ImageView path_ek23;
	private ImageView path_ek24;
	private ImageView path_ek25;
	private ImageView path_ek26;
	private ImageView rectangle_23_ek2;
	private ImageView _100_ek2;
	private ImageView rectangle_21__stroke__ek2;
	private View rectangle_20_ek2;
	private ImageView _9_41_ek5;
	private View rectangle_105;
	private View _rectangle_106;
	private TextView search_location;
	private TextView previous_search_results;
	private ImageView vector_ek14;
	private View rectangle_163_ek1;
	private View rectangle_165_ek1;
	private ImageView rectangle_98;
	private TextView my_favourite;
	private ImageView vector_ek15;
	private ImageView _rectangle_98_ek1;
	private TextView login_ek4;
	private ImageView _rectangle_166;
	private TextView upcoming_alarms;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);

		
		_bg__home_ek2 = (View) findViewById(R.id._bg__home_ek2);
		mapsicle_map = (ImageView) findViewById(R.id.mapsicle_map);
		path_ek18 = (ImageView) findViewById(R.id.path_ek18);
		path_ek19 = (ImageView) findViewById(R.id.path_ek19);
		path_ek20 = (ImageView) findViewById(R.id.path_ek20);
		empty_bar_ek4 = (ImageView) findViewById(R.id.empty_bar_ek4);
		path_ek21 = (ImageView) findViewById(R.id.path_ek21);
		path_ek22 = (ImageView) findViewById(R.id.path_ek22);
		path_ek23 = (ImageView) findViewById(R.id.path_ek23);
		path_ek24 = (ImageView) findViewById(R.id.path_ek24);
		path_ek25 = (ImageView) findViewById(R.id.path_ek25);
		path_ek26 = (ImageView) findViewById(R.id.path_ek26);
		rectangle_23_ek2 = (ImageView) findViewById(R.id.rectangle_23_ek2);
		_100_ek2 = (ImageView) findViewById(R.id._100_ek2);
		rectangle_21__stroke__ek2 = (ImageView) findViewById(R.id.rectangle_21__stroke__ek2);
		rectangle_20_ek2 = (View) findViewById(R.id.rectangle_20_ek2);
		_9_41_ek5 = (ImageView) findViewById(R.id._9_41_ek5);
		rectangle_105 = (View) findViewById(R.id.rectangle_105);
		_rectangle_106 = (View) findViewById(R.id._rectangle_106);
		search_location = (TextView) findViewById(R.id.search_location);
		previous_search_results = (TextView) findViewById(R.id.previous_search_results);
		vector_ek14 = (ImageView) findViewById(R.id.vector_ek14);
		rectangle_163_ek1 = (View) findViewById(R.id.rectangle_163_ek1);
		rectangle_165_ek1 = (View) findViewById(R.id.rectangle_165_ek1);
		rectangle_98 = (ImageView) findViewById(R.id.rectangle_98);
		my_favourite = (TextView) findViewById(R.id.my_favourite);
		vector_ek15 = (ImageView) findViewById(R.id.vector_ek15);
		_rectangle_98_ek1 = (ImageView) findViewById(R.id._rectangle_98_ek1);
		login_ek4 = (TextView) findViewById(R.id.login_ek4);
		_rectangle_166 = (ImageView) findViewById(R.id._rectangle_166);
		upcoming_alarms = (TextView) findViewById(R.id.upcoming_alarms);
	
		
		_rectangle_106.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), home_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_rectangle_98_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), login_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_rectangle_166.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), favourites_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	