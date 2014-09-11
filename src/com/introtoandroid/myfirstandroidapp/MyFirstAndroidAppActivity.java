package com.introtoandroid.myfirstandroidapp;


import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;
import android.location.Location;
import android.location.LocationManager;

public class MyFirstAndroidAppActivity extends ActionBarActivity {

	private static final String DEBUG_TAG= "MyFirstAppLogging";
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_first_android_app);
       // forceError();
       getLocation();
        Log.i(DEBUG_TAG, "In the onCreate() method of the MyFirstAndroidAppActivity Class");
      }


    @Override
	protected void onStop() {
    	
    	
		// TODO Auto-generated method stub
		super.onStop();
	}


	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my_first_android_app, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    
   
    
    
    public void forceError() {
    	
    	if(true) {
    		
    		throw new Error("Whoops");
    	}
    	
    	}
    
    public void getLocation() {
    	
    	try {
    		LocationManager locMgr = (LocationManager)
    				this.getSystemService(LOCATION_SERVICE);
    		Location recentLoc = locMgr.getLastKnownLocation(LocationManager.GPS_PROVIDER);
    	Log.i(DEBUG_TAG, "loc: " + recentLoc.toString());	
    	}
    	catch (Exception e) {
    		Log.e(DEBUG_TAG, "Location failed", e);
    		
    	}
    }
    
    
    }

