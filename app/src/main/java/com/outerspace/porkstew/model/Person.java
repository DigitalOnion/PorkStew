package com.outerspace.porkstew.model;

import com.outerspace.porkstew.adapter.IGenericDataItem;

public class Person implements IGenericDataItem {

    public String firstName;
    public String middleName;
    public String lastNameDad;
    public String lastNameMom;

    public Person() { }

    public Person(String firstName, String middleName, String lastNameDad, String lastNameMom) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastNameDad = lastNameDad;
        this.lastNameMom = lastNameMom;
    }

    // TODO: remove from here and put it in the ViewModel
    public String fullName() {
        String s = firstName;
        //s += (middleName.length() == 0 ? "" : " " + middleName.charAt(0));
        s += " " + lastNameDad;
        s += " " + lastNameMom;
        return s;
    }

}
