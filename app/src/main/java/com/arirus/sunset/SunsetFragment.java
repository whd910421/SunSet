package com.arirus.sunset;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by whd910421 on 16/10/31.
 */

public class SunsetFragment extends Fragment {
    private static final String TAG = "SunsetFragment";

    public static SunsetFragment newInstance()
    {
        return new SunsetFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sunset, container, false);
        return  view;
    }
}
