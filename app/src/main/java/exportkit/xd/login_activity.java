
	 
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

public class login_activity extends Activity {

	
	private View _bg__login_ek2;
	private ImageView path;
	private ImageView path_ek1;
	private ImageView path_ek2;
	private ImageView empty_bar;
	private ImageView path_ek3;
	private ImageView path_ek4;
	private ImageView path_ek5;
	private ImageView path_ek6;
	private ImageView path_ek7;
	private ImageView path_ek8;
	private ImageView rectangle_23;
	private ImageView _100;
	private ImageView rectangle_21__stroke_;
	private View rectangle_20;
	private ImageView _9_41_ek1;
	private ImageView hands_alarm;
	private TextView _don_t_have_an_account__register;
	private View rectangle_56;
	private View rectangle_57;
	private TextView forgot_password_;
	private TextView youremailaddress_gmail_com;
	private View _rectangle_59;
	private TextView login_ek3;
	private View rectangle_99;
	private TextView password;
	private ImageView vector;
	private ImageView vector_ek1;
	private ImageView vector_ek2;
	private ImageView vector_ek3;
	private ImageView vector_ek4;
	private ImageView vector_ek5;
	private ImageView vector_ek6;
	private View rectangle_99_ek1;
	private TextView email_id;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);

		
		_bg__login_ek2 = (View) findViewById(R.id._bg__login_ek2);
		path = (ImageView) findViewById(R.id.path);
		path_ek1 = (ImageView) findViewById(R.id.path_ek1);
		path_ek2 = (ImageView) findViewById(R.id.path_ek2);
		empty_bar = (ImageView) findViewById(R.id.empty_bar);
		path_ek3 = (ImageView) findViewById(R.id.path_ek3);
		path_ek4 = (ImageView) findViewById(R.id.path_ek4);
		path_ek5 = (ImageView) findViewById(R.id.path_ek5);
		path_ek6 = (ImageView) findViewById(R.id.path_ek6);
		path_ek7 = (ImageView) findViewById(R.id.path_ek7);
		path_ek8 = (ImageView) findViewById(R.id.path_ek8);
		rectangle_23 = (ImageView) findViewById(R.id.rectangle_23);
		_100 = (ImageView) findViewById(R.id._100);
		rectangle_21__stroke_ = (ImageView) findViewById(R.id.rectangle_21__stroke_);
		rectangle_20 = (View) findViewById(R.id.rectangle_20);
		_9_41_ek1 = (ImageView) findViewById(R.id._9_41_ek1);
		hands_alarm = (ImageView) findViewById(R.id.hands_alarm);
		_don_t_have_an_account__register = (TextView) findViewById(R.id._don_t_have_an_account__register);
		rectangle_56 = (View) findViewById(R.id.rectangle_56);
		rectangle_57 = (View) findViewById(R.id.rectangle_57);
		forgot_password_ = (TextView) findViewById(R.id.forgot_password_);
		youremailaddress_gmail_com = (TextView) findViewById(R.id.youremailaddress_gmail_com);
		_rectangle_59 = (View) findViewById(R.id._rectangle_59);
		login_ek3 = (TextView) findViewById(R.id.login_ek3);
		rectangle_99 = (View) findViewById(R.id.rectangle_99);
		password = (TextView) findViewById(R.id.password);
		vector = (ImageView) findViewById(R.id.vector);
		vector_ek1 = (ImageView) findViewById(R.id.vector_ek1);
		vector_ek2 = (ImageView) findViewById(R.id.vector_ek2);
		vector_ek3 = (ImageView) findViewById(R.id.vector_ek3);
		vector_ek4 = (ImageView) findViewById(R.id.vector_ek4);
		vector_ek5 = (ImageView) findViewById(R.id.vector_ek5);
		vector_ek6 = (ImageView) findViewById(R.id.vector_ek6);
		rectangle_99_ek1 = (View) findViewById(R.id.rectangle_99_ek1);
		email_id = (TextView) findViewById(R.id.email_id);
	
		
		_don_t_have_an_account__register.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), register_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_rectangle_59.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), home_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	