package com.ameron32.test.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment3 extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, 
			ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
//		return super.onCreateView(inflater, container, savedInstanceState);
		
		return inflater.inflate(R.layout.fragment_3, container, false);
	}
	
}
