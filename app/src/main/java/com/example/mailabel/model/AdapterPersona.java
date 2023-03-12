package com.example.mailabel.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mailabel.R;

import java.util.ArrayList;

public class AdapterPersona
        extends RecyclerView.Adapter<AdapterPersona.ViewHolder>
        implements View.OnClickListener {

        ArrayList<Email> llistaEmail;
        private LayoutInflater inflater;
        private Context context;

        private View.OnClickListener listener;

        public AdapterPersona(ArrayList<Email> llistaEmail, Context context){
            this.inflater = LayoutInflater.from(context);
            this.context=context;
            this.llistaEmail = llistaEmail;
        }


    @NonNull
    @Override
    public AdapterPersona.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.list_element,null);

        v.setOnClickListener(this);
            return new AdapterPersona.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final AdapterPersona.ViewHolder holder, final int pos) {
        holder.bindData(llistaEmail.get(pos));
    }

    @Override
    public int getItemCount() {
        return llistaEmail.size();
    }

    public void setOnclickListener(View.OnClickListener listener){
            this.listener=listener;
    }

    @Override
    public void onClick(View v) {
        if(listener!=null){
            listener.onClick(v);
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
            ImageView profileIcon;
            TextView mail;

            ViewHolder(View itemView){
                super(itemView);
                profileIcon = itemView.findViewById(R.id.ProifileIconIV);
                mail = itemView.findViewById(R.id.emailTV);
            }
            void bindData(final Email p){
                mail.setText(p.getGmail());
            }

    }
}
