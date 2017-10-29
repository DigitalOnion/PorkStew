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
}
