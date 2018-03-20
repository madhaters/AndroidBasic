package com.madhatters.androidbasic;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FragmentActivity extends AppCompatActivity implements AnotherFragment.Callback{
    private DemoFragment demoFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        demoFragment=new DemoFragment();
        FragmentManager fragmentManager=getSupportFragmentManager();

        fragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer,demoFragment)
                .commit();

        fragmentManager.beginTransaction()
                .replace(R.id.secondContainer,new AnotherFragment())
                .commit();

    }

    @Override
    public void showImage() {
        demoFragment.setText("Yesy Yes");
    }
}
