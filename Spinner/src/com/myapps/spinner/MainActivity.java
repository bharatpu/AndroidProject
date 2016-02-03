package com.myapps.spinner;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	Spinner phonespinner;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final String[] phonebrands = {"Sony","Samsung","Moto","Apple","Micromax","HTC","Blackberry","MI","Lenovo"};

        phonespinner = (Spinner) findViewById(R.id.spinner1);
       
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,phonebrands);
		phonespinner.setAdapter(adapter);
		
        phonespinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int position, long arg3)
			{
                 Log.d("[DEBUG]", phonebrands[position]);
				
				Toast.makeText(MainActivity.this,phonebrands[position],Toast.LENGTH_SHORT).show();
				
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) 
			{
				 
				
			}
		});
        
    }


    
}
