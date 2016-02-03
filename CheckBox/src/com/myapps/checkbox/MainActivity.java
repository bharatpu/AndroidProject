package com.myapps.checkbox;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioButton;

public class MainActivity extends Activity 
{
	
CheckBox cb1;
CheckBox cb2;
RadioButton rb;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        cb1=(CheckBox) findViewById(R.id.checkBoxoption1);
        cb2=(CheckBox) findViewById(R.id.checkBoxoption2);
        
       if(cb1.isChecked())
       {
    	   Log.d("[DEBUB]", "option1 is selected");   
       }
			
		cb1.setOnCheckedChangeListener(new OnCheckedChangeListener() 
		{
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean state)
			{
			
			if(state==true)
			{
				Log.d("[DEBUB]", "option1 is selected");
		    }
			else
			{
				Log.d("[DEBUB]", "option1 is unselected");
				}
			
			}
		}
		);
		cb2.setOnCheckedChangeListener(new OnCheckedChangeListener() 
		{
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean state)
			{
			
			if(state==true)
			{
				Log.d("[DEBUB]", "option2 is selected");
		    }
			else{
				Log.d("[DEBUB]", "option2 is unselected");
				}
			
			}
		}
		);
		rb.setOnCheckedChangeListener(new OnCheckedChangeListener() 
		{
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean state)
			{
			
			if(state==true)
			{
				Log.d("[DEBUB]", "option3 is selected");
		    }
			else{
				Log.d("[DEBUB]", "option3 is unselected");
				}
			
			}
		}
		);
		}
    }
    

