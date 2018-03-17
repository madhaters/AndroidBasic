package com.madhatters.androidbasic;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by bullhead on 3/16/18.
 *
 */

public class PagerFragment extends Fragment {
    private String text;

    public static PagerFragment newInstance(String text) {

        Bundle args = new Bundle();

        PagerFragment fragment = new PagerFragment();
        fragment.text=text;
        fragment.setArguments(args);
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_pager,container,false);
        TextView tvPage=view.findViewById(R.id.tvInPager);
        tvPage.setText(text);
        return view;
    }
}
