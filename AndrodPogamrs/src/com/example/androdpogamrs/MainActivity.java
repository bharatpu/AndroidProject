package com.example.androdpogamrs;

import android.inputmethodservice.ExtractEditText;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

   EditText ED;
   Button BT,BT2;
   TextView TX;
   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ED=(EditText) findViewById(R.id.editText1);
        BT=(Button) findViewById(R.id.button1);
        TX=(TextView) findViewById(R.id.textView1);
        BT2=(Button) findViewById(R.id.button2);
        
        
        
       
        BT.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				 String s1=ED.getText().toString();
				 TX.setText(s1);
			}
		});
        
        BT2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
			TX.setText("");
				
			}
		});
    }
    


    
}
