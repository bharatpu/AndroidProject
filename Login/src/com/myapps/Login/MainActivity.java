package com.myapps.Login;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity 
{

	TextView logoTextView,signupTextView,forgotTextView;
	EditText usernameedittext,passwordedittext;
	CheckBox remberpwdcheckbox;
	Button loginbutton;

	String stUsername = "abc";
	String stPassword = "1234";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.manactivity);

		usernameedittext = (EditText) findViewById(R.id.editTextusername);
		passwordedittext = (EditText) findViewById(R.id.editTextpassword);
		loginbutton = (Button) findViewById(R.id.buttonLogin);

		loginbutton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0)
			{

				String entusername = usernameedittext.getText().toString();
				String entpassword = passwordedittext.getText().toString();

				if(entusername.equalsIgnoreCase(stUsername)  &&  entpassword.equals(stPassword))
				{

					Log.d("[DEBUG]", "Login Successful");
				}
				else
				{
					Log.d("[DEBUG]", "Login Failed");
				}
			}
		});
	}



}
