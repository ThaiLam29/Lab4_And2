package com.example.Lab4_PH34492;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lab4_ph34899.R;

public class MainActivity extends AppCompatActivity {

    Button btn_fm1, btn_fm2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_fm1=findViewById(R.id.fm1);
        btn_fm2=findViewById(R.id.fm2);

        btn_fm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment1 fragment1=new Fragment1();
                FragmentManager manager=getSupportFragmentManager();
                manager.beginTransaction().replace(R.id.fragment, fragment1).commit();
            }
        });

        btn_fm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment2 fragment2=new Fragment2();
                FragmentManager manager=getSupportFragmentManager();
                manager.beginTransaction().replace(R.id.fragment, fragment2).commit();

            }
        });




    }
}