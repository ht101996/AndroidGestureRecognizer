package com.moming.gesturerecognizer;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

import com.moming.gesturerecognizer.GestureRecognizer.Listener;

public class MainActivity extends Activity implements Listener{

	private static final String TAG = "MainActivity";
	
	GestureRecognizer mGestureRecognizer;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mGestureRecognizer=new GestureRecognizer(this, this);
	}


	
	@Override
	public boolean onTouchEvent(MotionEvent event){
		mGestureRecognizer.onTouchEvent(event);
		return true;//super.onTouchEvent(event);
	}



	@Override
	public boolean onSingleTapUp(float x, float y) {
		Log.e(TAG, "onSingleTapUp");
		return false;
	}



	@Override
	public boolean onDoubleTap(float x, float y) {
		Log.e(TAG, "onSingleTapUp");
		return false;
	}

	@Override
	public boolean onScroll(float dx, float dy, float totalX, float totalY) {
		Log.e(TAG, "onScroll:"+dx+"-"+dy+"-"+totalX+"-"+totalY);
		return true;
	}



	@Override
	public boolean onFling(float velocityX, float velocityY) {
		Log.e(TAG, "onFling");
		return false;
	}



	@Override
	public boolean onScaleBegin(float focusX, float focusY) {
		Log.e(TAG, "onScaleBegin");
		return true;
	}



	@Override
	public boolean onScale(float focusX, float focusY, float scale) {
		Log.e(TAG, "onScale:"+focusX+"-"+focusY+"-"+scale);
		return false;
	}



	@Override
	public void onScaleEnd() {
		Log.e(TAG, "onScaleEnd");
	}



	@Override
	public void onDown(float x, float y) {
		Log.e(TAG, "onDown");
	}



	@Override
	public void onUp() {
		Log.e(TAG, "onUp");
	}

}
