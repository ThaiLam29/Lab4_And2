package com.example.Lab4_PH34492.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.Lab4_PH34492.Fragment2;
import com.example.Lab4_PH34492.Fragment1;

public class AdapterViewPager extends FragmentStateAdapter {
    public AdapterViewPager(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position==0){
            return new Fragment1();
        }
        return new Fragment2();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
