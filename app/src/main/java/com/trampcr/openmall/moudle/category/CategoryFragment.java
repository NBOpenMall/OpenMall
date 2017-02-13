package com.trampcr.openmall.moudle.category;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.trampcr.openmall.R;
import com.trampcr.openmall.moudle.base.BaseFragment;

/**
 * Created by zxm on 2017/2/12.
 */
public class CategoryFragment extends BaseFragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_category, null);
        return view;
    }
}
