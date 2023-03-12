package com.example.mailabel;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.mailabel.model.Email;


public class MissatgeFragment extends Fragment {

    TextView missatge;
    Email corre;
    View vista;
    Button listbtn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        corre = ((MainActivity)getActivity()).correu;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vista =inflater.inflate(R.layout.fragment_missatge, container, false);

        missatge = (TextView) vista.findViewById(R.id.msgContent);
        listbtn = (Button) vista.findViewById(R.id.sendButton);

        listbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).fragmentLlista();
            }
        });
        String a = corre.getMissatge();
        missatge.setText(a);
        missatge.setMovementMethod(new ScrollingMovementMethod());



        return vista;
    }


}