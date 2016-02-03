package com.myapps.list;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

	ListView phones;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final String[] phonebrands = {"Sony","Samsung","Moto","Apple","Micromax","HTC","Blackberry","MI","Lenovo"};
       
        phones = (ListView) findViewById(R.id.listViewphone);
        
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,phonebrands);
		phones.setAdapter(adapter);

        phones.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
					long arg3)
			{
				Toast.makeText(MainActivity.this,phonebrands[position],Toast.LENGTH_SHORT).show();
				
			}
		});
        
    }



   
}
