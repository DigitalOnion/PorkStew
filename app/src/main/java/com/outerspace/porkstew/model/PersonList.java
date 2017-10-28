package com.outerspace.porkstew.model;

import java.util.ArrayList;

public class PersonList {
    private ArrayList<Person> persons;

    private String[][] rawNames = {
            {"Alejandro", "Jonás", "Pizarro", "Báez"},
            {"Carlos", "Carlos", "Palma", "Cabrera"},
            {"Patricia", "Elizabeth", "Sánchez", "Figueroa"},
            {"Pablo", "Enrique", "Medina", "Reyes"},
            {"Antonia", "Claudia", "Riquelme", "Navarrete"},
            {"Javier", "Manuel", "Romero", "Báez"},
            {"Guadalupe", "Carla", "Ruiz", "Venegas"},
            {"Martha", "Luisa", "Zúñiga", "Navarrete"},
            {"Salvador", "Alejandro", "Pino", "Chávez"},
            {"Mao", "Mao", "Mendoza", "Gutiérrez"},
            {"Carlos", "Enrique", "San Martín", "Alarcón"},
            {"Irene", "Alicia", "Galeano", "Sanhueza"},
            {"Elizabeth", "America", "Farías", "Sosa"},
            {"Ana", "Irma", "Guzmán", "Pizarro"},
            {"Araceli", "Electra", "Ramírez", "Ortiz"},
            {"Guadalupe", "Josefína", "Núñez", "Pérez"},
            {"Juana", "Carlota", "Vergara", "Venegas"},
            {"Roberto", "Víctor", "Martínez", "Gallardo"},
            {"Pablo", "Mario", "Díaz", "Franco"},
            {"Gabriel", "Jonás", "Gutiérrez", "Navarro"},
            {"Silvia", "America", "Vásquez", "Cárdenas"},
            {"Diego", "Francisco", "Bravo", "Vásquez"},
            {"Alfredo", "Raúl", "Henríquez", "Martínez"},
            {"Francelia", "Electra", "Salinas", "Moreno"},
            {"Luz", "Guadalupe", "Yáñez", "Sosa"},
            {"Carlos", "Ángel", "Molina", "Chávez"},
            {"Ramón", "David", "Riquelme", "Carvajal"},
            {"Elena", "Luz", "González", "Cortés"},
            {"Irma", "Maria", "Godoy", "Venegas"}
    };

    public PersonList() {
        persons = new ArrayList<>();
        for(String[] names: rawNames) {
            Person person = new Person(names[0], names[1], names[2], names[3]);
            persons.add(person);
        }
    }

    public ArrayList<Person> getList() {
        return persons;
    }
}

