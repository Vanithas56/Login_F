
	 
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

public class register_activity extends Activity {

	
	private View _bg__register_ek2;
	private ImageView path_ek9;
	private ImageView path_ek10;
	private ImageView path_ek11;
	private ImageView empty_bar_ek2;
	private ImageView path_ek12;
	private ImageView path_ek13;
	private ImageView path_ek14;
	private ImageView path_ek15;
	private ImageView path_ek16;
	private ImageView path_ek17;
	private ImageView rectangle_23_ek1;
	private ImageView _100_ek1;
	private ImageView rectangle_21__stroke__ek1;
	private View rectangle_20_ek1;
	private ImageView _9_41_ek3;
	private TextView w_e_l_c_o_m_e__;
	private TextView _already_have_an_account__login;
	private ImageView hands_phone;
	private View rectangle_162;
	private View rectangle_165;
	private View rectangle_163;
	private TextView youremailaddress_gmail_com_ek1;
	private TextView iete;
	private View _rectangle_164;
	private TextView register_ek3;
	private View rectangle_99_ek2;
	private TextView password_ek1;
	private ImageView vector_ek7;
	private ImageView vector_ek8;
	private ImageView vector_ek9;
	private ImageView vector_ek10;
	private ImageView vector_ek11;
	private ImageView vector_ek12;
	private ImageView vector_ek13;
	private View rectangle_99_ek3;
	private TextView email_id_ek1;
	private View rectangle_99_ek4;
	private TextView name;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.register);

		
		_bg__register_ek2 = (View) findViewById(R.id._bg__register_ek2);
		path_ek9 = (ImageView) findViewById(R.id.path_ek9);
		path_ek10 = (ImageView) findViewById(R.id.path_ek10);
		path_ek11 = (ImageView) findViewById(R.id.path_ek11);
		empty_bar_ek2 = (ImageView) findViewById(R.id.empty_bar_ek2);
		path_ek12 = (ImageView) findViewById(R.id.path_ek12);
		path_ek13 = (ImageView) findViewById(R.id.path_ek13);
		path_ek14 = (ImageView) findViewById(R.id.path_ek14);
		path_ek15 = (ImageView) findViewById(R.id.path_ek15);
		path_ek16 = (ImageView) findViewById(R.id.path_ek16);
		path_ek17 = (ImageView) findViewById(R.id.path_ek17);
		rectangle_23_ek1 = (ImageView) findViewById(R.id.rectangle_23_ek1);
		_100_ek1 = (ImageView) findViewById(R.id._100_ek1);
		rectangle_21__stroke__ek1 = (ImageView) findViewById(R.id.rectangle_21__stroke__ek1);
		rectangle_20_ek1 = (View) findViewById(R.id.rectangle_20_ek1);
		_9_41_ek3 = (ImageView) findViewById(R.id._9_41_ek3);
		w_e_l_c_o_m_e__ = (TextView) findViewById(R.id.w_e_l_c_o_m_e__);
		_already_have_an_account__login = (TextView) findViewById(R.id._already_have_an_account__login);
		hands_phone = (ImageView) findViewById(R.id.hands_phone);
		rectangle_162 = (View) findViewById(R.id.rectangle_162);
		rectangle_165 = (View) findViewById(R.id.rectangle_165);
		rectangle_163 = (View) findViewById(R.id.rectangle_163);
		youremailaddress_gmail_com_ek1 = (TextView) findViewById(R.id.youremailaddress_gmail_com_ek1);
		iete = (TextView) findViewById(R.id.iete);
		_rectangle_164 = (View) findViewById(R.id._rectangle_164);
		register_ek3 = (TextView) findViewById(R.id.register_ek3);
		rectangle_99_ek2 = (View) findViewById(R.id.rectangle_99_ek2);
		password_ek1 = (TextView) findViewById(R.id.password_ek1);
		vector_ek7 = (ImageView) findViewById(R.id.vector_ek7);
		vector_ek8 = (ImageView) findViewById(R.id.vector_ek8);
		vector_ek9 = (ImageView) findViewById(R.id.vector_ek9);
		vector_ek10 = (ImageView) findViewById(R.id.vector_ek10);
		vector_ek11 = (ImageView) findViewById(R.id.vector_ek11);
		vector_ek12 = (ImageView) findViewById(R.id.vector_ek12);
		vector_ek13 = (ImageView) findViewById(R.id.vector_ek13);
		rectangle_99_ek3 = (View) findViewById(R.id.rectangle_99_ek3);
		email_id_ek1 = (TextView) findViewById(R.id.email_id_ek1);
		rectangle_99_ek4 = (View) findViewById(R.id.rectangle_99_ek4);
		name = (TextView) findViewById(R.id.name);
	
		
		_already_have_an_account__login.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), login_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_rectangle_164.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), home_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	