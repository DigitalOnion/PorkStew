package com.outerspace.porkstew.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.outerspace.porkstew.R;
import com.outerspace.porkstew.model.Person;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    ArrayList<Person> persons;

    public MyAdapter(ArrayList<Person> persons) {
        this.persons = persons;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Person person = persons.get(position);
        holder.txtFullname.setText(person.fullName());
    }

    @Override
    public int getItemCount() {
        return persons.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView txtFullname;

        public MyViewHolder(View itemView) {
            super(itemView);
            txtFullname = (TextView) itemView.findViewById(R.id.text_fullname);
        }
    }
}
