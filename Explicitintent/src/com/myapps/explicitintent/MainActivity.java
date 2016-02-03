package com.myapps.explicitintent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	
	Button launchbutton;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        launchbutton = (Button) findViewById(R.id.buttonSecondStart);
        
        launchbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				
			Intent intent = new Intent(MainActivity.this,SecondActivity.class);
			startActivity(intent);
				
			}
		});
    }


   
}
