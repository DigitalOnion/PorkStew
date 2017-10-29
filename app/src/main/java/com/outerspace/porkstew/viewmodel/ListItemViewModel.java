package com.outerspace.porkstew.viewmodel;

import com.outerspace.porkstew.adapter.IGenericDataItem;
import com.outerspace.porkstew.model.Person;

public class ListItemViewModel implements IGenericViewModel {

    Person person;

    @Override
    public IGenericViewModel getInstance() {
        return new ListItemViewModel();
    }

    @Override
    public void setDataItem(IGenericDataItem dataItem) {
        person = (Person) dataItem;
    }

    public String fullName() {
        String s = person.firstName;
        //s += (person.middleName.length() == 0 ? "" : " " + person.middleName.charAt(0));
        s += " " + person.lastNameDad;
        s += " " + person.lastNameMom;
        return s;
    }

}
