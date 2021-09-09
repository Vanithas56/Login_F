
	 
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
import android.widget.TextView;
import android.content.Intent;

public class map_view_searched_result_activity extends Activity {

	
	private View _bg__map_view_searched_result_ek2;
	private ImageView mapsicle_map_ek6;
	private ImageView path_ek72;
	private ImageView path_ek73;
	private ImageView path_ek74;
	private ImageView empty_bar_ek16;
	private ImageView path_ek75;
	private ImageView path_ek76;
	private ImageView path_ek77;
	private ImageView path_ek78;
	private ImageView path_ek79;
	private ImageView path_ek80;
	private ImageView rectangle_23_ek8;
	private ImageView _100_ek8;
	private ImageView rectangle_21__stroke__ek8;
	private View rectangle_20_ek8;
	private ImageView _9_41_ek17;
	private View rectangle_171;
	private ImageView vector_ek86;
	private TextView navratna_hotel__415__pedest__;
	private ImageView vector_ek87;
	private TextView navratna_hotel_ek8;
	private View rectangle_171_ek1;
	private View rectangle_172;
	private View _rectangle_173;
	private View rectangle_174;
	private ImageView vector_ek88;
	private ImageView vector_ek89;
	private ImageView vector_ek90;
	private View rectangle_105_ek6;
	private TextView restaurant;
	private TextView open;
	private TextView directions;
	private TextView favourite;
	private TextView add_to_list;
	private TextView add_note;
	private ImageView vector_ek91;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.map_view_searched_result);

		
		_bg__map_view_searched_result_ek2 = (View) findViewById(R.id._bg__map_view_searched_result_ek2);
		mapsicle_map_ek6 = (ImageView) findViewById(R.id.mapsicle_map_ek6);
		path_ek72 = (ImageView) findViewById(R.id.path_ek72);
		path_ek73 = (ImageView) findViewById(R.id.path_ek73);
		path_ek74 = (ImageView) findViewById(R.id.path_ek74);
		empty_bar_ek16 = (ImageView) findViewById(R.id.empty_bar_ek16);
		path_ek75 = (ImageView) findViewById(R.id.path_ek75);
		path_ek76 = (ImageView) findViewById(R.id.path_ek76);
		path_ek77 = (ImageView) findViewById(R.id.path_ek77);
		path_ek78 = (ImageView) findViewById(R.id.path_ek78);
		path_ek79 = (ImageView) findViewById(R.id.path_ek79);
		path_ek80 = (ImageView) findViewById(R.id.path_ek80);
		rectangle_23_ek8 = (ImageView) findViewById(R.id.rectangle_23_ek8);
		_100_ek8 = (ImageView) findViewById(R.id._100_ek8);
		rectangle_21__stroke__ek8 = (ImageView) findViewById(R.id.rectangle_21__stroke__ek8);
		rectangle_20_ek8 = (View) findViewById(R.id.rectangle_20_ek8);
		_9_41_ek17 = (ImageView) findViewById(R.id._9_41_ek17);
		rectangle_171 = (View) findViewById(R.id.rectangle_171);
		vector_ek86 = (ImageView) findViewById(R.id.vector_ek86);
		navratna_hotel__415__pedest__ = (TextView) findViewById(R.id.navratna_hotel__415__pedest__);
		vector_ek87 = (ImageView) findViewById(R.id.vector_ek87);
		navratna_hotel_ek8 = (TextView) findViewById(R.id.navratna_hotel_ek8);
		rectangle_171_ek1 = (View) findViewById(R.id.rectangle_171_ek1);
		rectangle_172 = (View) findViewById(R.id.rectangle_172);
		_rectangle_173 = (View) findViewById(R.id._rectangle_173);
		rectangle_174 = (View) findViewById(R.id.rectangle_174);
		vector_ek88 = (ImageView) findViewById(R.id.vector_ek88);
		vector_ek89 = (ImageView) findViewById(R.id.vector_ek89);
		vector_ek90 = (ImageView) findViewById(R.id.vector_ek90);
		rectangle_105_ek6 = (View) findViewById(R.id.rectangle_105_ek6);
		restaurant = (TextView) findViewById(R.id.restaurant);
		open = (TextView) findViewById(R.id.open);
		directions = (TextView) findViewById(R.id.directions);
		favourite = (TextView) findViewById(R.id.favourite);
		add_to_list = (TextView) findViewById(R.id.add_to_list);
		add_note = (TextView) findViewById(R.id.add_note);
		vector_ek91 = (ImageView) findViewById(R.id.vector_ek91);
	
		
		_rectangle_173.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), favourites_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	