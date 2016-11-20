package com.elijahcodes.myflickr;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;

/**
 * Created by Elijah on 11/20/2016.
 */

public class BaseActivity extends AppCompatActivity {
    private static final String TAG = "BaseActivity";
    static String FLICKR_QUERY = "FLICKR_QUERY";
    static String PHOTO_TRANSFER = "PHOTO_TRANSFER";

    void activateToolbar(boolean enableHome){
        Log.d(TAG, "activateToolbar: Starts");
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

            if(toolbar != null){
                setSupportActionBar(toolbar);
                actionBar = getSupportActionBar();
            }
        }

        if(actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(enableHome);
        }
    }
}
