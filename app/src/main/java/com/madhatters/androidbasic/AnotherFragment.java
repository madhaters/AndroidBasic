package com.madhatters.androidbasic;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by bullhead on 3/20/18.
 * gdgdf
 */

public class AnotherFragment extends Fragment {
    public interface Callback{
        void showImage();
    }
    private Callback callback;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        callback= (Callback) context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.another_layout,container,false);
        Button helloButton=view.findViewById(R.id.btnHello);
        helloButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callback.showImage();
            }
        });
        return view;
    }
}
