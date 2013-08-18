package com.danielme.android.transitions;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * 
 * @author danielme.com
 *
 */
public class SecondActivity extends Activity
{

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
	}

	public void zoomBack(View button)
	{
		startActivity(new Intent(this, MainActivity.class));
		overridePendingTransition(R.anim.zoom_back_in, R.anim.zoom_back_out);
	}	
	
	public void fade(View button)
	{
		startActivity(new Intent(this, MainActivity.class));
		overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
	}	
	
	public void right(View button)
	{
		startActivity(new Intent(this, MainActivity.class));
		overridePendingTransition(R.anim.right_in, R.anim.right_out);
	}	
	
	public void back(View button)
	{
		super.onBackPressed();
	}	

}
