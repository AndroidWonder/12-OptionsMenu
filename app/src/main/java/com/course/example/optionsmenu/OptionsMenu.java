package com.course.example.optionsmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.content.Intent;
import android.net.Uri;

public class OptionsMenu extends Activity {
    
	private ImageView ImView;
	
	final int PHONE = Menu.FIRST ;
	final int WEB = Menu.FIRST + 1;
	final int SMS = Menu.FIRST + 2;
	final int EXIT = Menu.FIRST + 3;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        ImView = (ImageView)findViewById(R.id.image);
        ImView.setImageResource(R.drawable.trek);
    }
    
    @Override
	public boolean onCreateOptionsMenu(Menu menu) {
		
		super.onCreateOptionsMenu(menu);
		MenuItem item1 = menu.add(0, PHONE, Menu.NONE, "DIAL");
		MenuItem item2 = menu.add(0, WEB, Menu.NONE, "WEB");
		MenuItem item3 = menu.add(0, SMS, Menu.NONE, "TEXT");
		MenuItem item4 = menu.add(0, EXIT, Menu.NONE, "Exit");
		
		return true;
	}
    
    @Override
	public boolean onOptionsItemSelected(MenuItem item) {		
		    
		    int itemID = item.getItemId();  //get id of menu item picked
		    
		    switch (itemID) {
		    case PHONE : 
		    	
		    	Uri uri1 = Uri.parse("tel:8005551212");
		    	Intent intent1 = new Intent(Intent.ACTION_VIEW, uri1);
		    	startActivity(intent1);
		    	return true; 
		    	
		    case WEB : 
		    	Uri uri2 = Uri.parse("http://www.mtv.com");
		    	Intent intent2 = new Intent(Intent.ACTION_VIEW, uri2);
		    	startActivity(intent2);
		    	return true;
		    	
		    case SMS : 
		    	Uri uri3 = Uri.parse("sms:8005551212");
		    	Intent intent3 = new Intent(Intent.ACTION_VIEW, uri3);
		    	startActivity(intent3);
		    	return true;
		    
		    case EXIT : finish();
		    
		    default: super.onOptionsItemSelected(item);
		    }
		   		   
	    return false;
	}
}