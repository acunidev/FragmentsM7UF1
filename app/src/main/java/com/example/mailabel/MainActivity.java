package com.example.mailabel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.mailabel.model.Email;

public class MainActivity extends AppCompatActivity {

    public static FragmentTransaction fragmentTransaction;
    public static FragmentTransaction fragmentTransaction2;
    Fragment mail;
    Fragment missatge;
    public Email correu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mail = new correusFragment();
        missatge=new MissatgeFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.correusFL, mail).commit();


    }


    public void greetings(Fragment f, Email e){

        fragmentTransaction =getSupportFragmentManager().beginTransaction();
        missatge = f;
        correu=e;
        fragmentTransaction.replace(R.id.messageView, f);
        fragmentTransaction.commit();




    }

    public void fragmentLlista(){
        fragmentTransaction2 =getSupportFragmentManager().beginTransaction();
        fragmentTransaction2.replace(R.id.correusFL, mail);
        fragmentTransaction2.commit();
        fragmentTransaction2.hide(missatge);

    }



}