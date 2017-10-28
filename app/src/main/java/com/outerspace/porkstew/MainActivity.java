package com.outerspace.porkstew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.outerspace.porkstew.adapter.GenericAdapter;
import com.outerspace.porkstew.adapter.IGenericDataItem;
import com.outerspace.porkstew.adapter.MyAdapter;
import com.outerspace.porkstew.model.Person;
import com.outerspace.porkstew.model.PersonList;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();

        PersonList personList = new PersonList();
        ArrayList<Person> persons = personList.getList();
        MyAdapter adapter = new MyAdapter(persons);

        ArrayList<IGenericDataItem> dataItems = new ArrayList<>();
        for(Person person: persons)
            dataItems.add(person);
        GenericAdapter genericAdapter = new GenericAdapter(null, dataItems);

        RecyclerView recycler = (RecyclerView) findViewById(R.id.recycler);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        // recycler.setAdapter(adapter);
        recycler.setAdapter(genericAdapter);
    }
}
