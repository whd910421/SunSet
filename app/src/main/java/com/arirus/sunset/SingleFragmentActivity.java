package com.arirus.sunset;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by whd910421 on 16/10/31.
 */

public abstract class SingleFragmentActivity extends FragmentActivity {
    private static final String TAG = "SingleFragmentActivity";
    private Fragment mFragment = null;

    protected abstract Fragment newFragment();

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_fragment);
        FragmentManager fm = getSupportFragmentManager();
        mFragment = fm.findFragmentById(R.id.fragment_container);
        if (mFragment == null)
        {
            mFragment = newFragment();
            fm.beginTransaction().add(R.id.fragment_container , mFragment).commit();
        }
    }
}
