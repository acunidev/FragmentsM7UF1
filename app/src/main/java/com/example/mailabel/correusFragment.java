package com.example.mailabel;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.mailabel.model.AdapterPersona;
import com.example.mailabel.model.Email;

import java.util.ArrayList;


public class correusFragment extends Fragment {
        RecyclerView recyclerView;
        ArrayList<Email> correus;
        View vista;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vista =inflater.inflate(R.layout.fragment_correus, container, false);





        ompleLlista();




        return  vista;
    }

    public void ompleLlista(){

        correus = new ArrayList<>();
        correus.add(new Email("gbadham0@flavors.me"));
        correus.add(new Email("mkinnear1@prweb.com"));
        correus.add(new Email("bgambell2@dailymail.co.uk"));
        correus.add(new Email("mmacghee4@usatoday.com"));
        correus.add(new Email("jbeedie5@yahoo.co.jp"));
        correus.add(new Email("fbloxham6@webeden.co.uk"));
        correus.add(new Email("nkenefick7@mysql.com"));
        correus.add(new Email("rbuller8@wsj.com"));
        correus.add(new Email("fpashen9@homestead.com"));
        correus.add(new Email("ncornfortha@addtoany.com"));

        AdapterPersona adapterPersona  = new AdapterPersona(correus, getContext());

        recyclerView = (RecyclerView) vista.findViewById(R.id.rv_emails);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        adapterPersona.setOnclickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), correus.get(recyclerView.getChildAdapterPosition(v)).getGmail(), Toast.LENGTH_SHORT).show();
                Fragment missatge = new MissatgeFragment();

                ((MainActivity)getActivity()).greetings(missatge, correus.get(recyclerView.getChildAdapterPosition(v)));

            }
        });

        recyclerView.setAdapter(adapterPersona);


    }
}