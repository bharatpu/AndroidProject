package com.myapps.login_explicitintent;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	
	TextView logoTextView,signupTextView,forgotTextView;
	EditText usernameedittext,passwordedittext;
	CheckBox remberpwdcheckbox;
	Button loginbutton;

	String stUsername = "bharat";
	String stPassword = "12345";
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        usernameedittext = (EditText) findViewById(R.id.editTextusername);
		passwordedittext = (EditText) findViewById(R.id.editTextpassword);
		loginbutton = (Button) findViewById(R.id.button1);
        
        loginbutton.setOnClickListener(new OnClickListener() 
        {
			
			@Override
			public void onClick(View arg0) {
				
				String entusername = usernameedittext.getText().toString();
				String entpassword = passwordedittext.getText().toString();

				if(entusername.equalsIgnoreCase(stUsername)  &&  entpassword.equals(stPassword))
				{
					Intent intent = new Intent(MainActivity.this,SecondActivity.class);
					startActivity(intent);
					Log.d("[DEBUG]", "Login Successful");
				}
				else
				{
					Intent intent = new Intent(MainActivity.this,ThirdActivity.class);
					startActivity(intent);
					Log.d("[DEBUG]", "Login Failed");
				}
			}
				
				
			
		});
		
    }


    
    
}
