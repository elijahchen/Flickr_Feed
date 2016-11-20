package com.elijahcodes.myflickr;

import android.content.Context;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Elijah on 11/20/2016.
 */

class RecyclerItemClickListener extends RecyclerView.SimpleOnItemTouchListener {
    private static final String TAG = "RecyclerItemClickListen";

    interface OnRecyclerClickListener {
        void onItemClick(View view, int position);
        void onItemLongClick(View view, int position);
    }

    private final OnRecyclerClickListener mListener;
    private final GestureDetectorCompat mGestureDetector;

    public RecyclerItemClickListener(Context context, final RecyclerView recyclerView, OnRecyclerClickListener listener) {
        mListener = listener;
        mGestureDetector = new GestureDetectorCompat(context, new GestureDetector.SimpleOnGestureListener(){
            @Override
            public boolean onSingleTapUp(MotionEvent e) {
                Log.d(TAG, "onSingleTapUp: Starts");
                return true;
            }

            @Override
            public void onLongPress(MotionEvent e) {
                Log.d(TAG, "onLongPress: Starts");
            }
        });

    }

    @Override
    public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
        // Whaaaat, did I just intercept the touchevent?!
        Log.d(TAG, "onInterceptTouchEvent: returned: " + true);
        if(mGestureDetector != null){
            boolean result = mGestureDetector.onTouchEvent(e);
            Log.d(TAG, "onInterceptTouchEvent(): Returned: " + result);
            return result;
        } else {
            Log.d(TAG, "onInterceptTouchEvent(): Returned: false");
            return false;
        }
    }


}
