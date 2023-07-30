package com.example.Lab4_PH34492;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.Lab4_PH34492.Adapter.AdapterViewPager;
import com.example.lab4_ph34899.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class B3_activity extends AppCompatActivity {
    ViewPager2 viewPager2;
    TabLayout layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b3);
        viewPager2=findViewById(R.id.vp);
        layout=findViewById(R.id.tab_layout);
        AdapterViewPager adapterViewPager=new AdapterViewPager(this);
        viewPager2.setAdapter(adapterViewPager);

        new TabLayoutMediator(layout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0:
                        tab.setText("TabLayout Thu 1");
                        break;
                    case 1:
                        tab.setText("TabLayout Thu 2");
                        break;
                    default:
                        break;
                }
            }
        }).attach();
    }
}