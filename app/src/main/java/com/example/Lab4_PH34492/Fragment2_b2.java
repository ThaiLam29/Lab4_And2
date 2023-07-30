package com.example.Lab4_PH34492;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.lab4_ph34899.R;


public class Fragment2_b2 extends Fragment {

    public interface Isendata{
        void sendData(String data);
    }
    private Isendata isendata;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        isendata= (Isendata) getActivity();
    }

    EditText edt_data;
    Button btn_send;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fm2_b2, container, false);

        edt_data=view.findViewById(R.id.edt_data);
        btn_send=view.findViewById(R.id.btn_send);
        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendDataFM2();
            }
        });
        return view;
    }

    private void sendDataFM2() {
        String sData=edt_data.getText().toString().trim();
        isendata.sendData(sData);
    }
}
