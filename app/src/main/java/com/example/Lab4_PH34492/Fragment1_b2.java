package com.example.Lab4_PH34492;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.lab4_ph34492.R;

public class Fragment1_b2 extends Fragment {

    TextView tv_data;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fm1_b2, container, false);
        tv_data=view.findViewById(R.id.tv_data);
        return view;
    }
    public  void nhanData(String data){
        tv_data.setText(data);
    }
}
