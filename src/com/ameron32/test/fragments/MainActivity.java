package com.ameron32.test.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends FragmentActivity {

	Fragment fragment;
	Button b1, b2, b3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		b1 = (Button) findViewById(R.id.b1);
		b2 = (Button) findViewById(R.id.b2);
		b3 = (Button) findViewById(R.id.b3);

		FragmentManager fm = getSupportFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		StartFragment startFragment = new StartFragment();
		ft.add(R.id.llFragments, startFragment);
		ft.commit();

		b1.setOnClickListener(bListener);
		b2.setOnClickListener(bListener);
		b3.setOnClickListener(bListener);
	}

	View.OnClickListener bListener = new View.OnClickListener() {
		@Override
		public void onClick(View v) {
			Fragment newFragment;
			switch (v.getId()) {
			case R.id.b1:
				newFragment = new Fragment1();
				break;
			case R.id.b2:
				newFragment = new Fragment2();
				break;
			case R.id.b3:
				newFragment = new Fragment3();
				break;
			default:
				newFragment = new StartFragment();
			}

			FragmentManager fm = getSupportFragmentManager();
			FragmentTransaction ft = fm.beginTransaction();

			ft.replace(R.id.llFragments, newFragment);
			ft.addToBackStack(null);
			ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
			ft.commit();
		}
	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
