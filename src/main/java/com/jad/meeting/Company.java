package com.jad.meeting;

import java.util.ArrayList;

public class Company implements Meetable {
    private final ArrayList<Person> employees = new ArrayList<>();
    private String label;

    public Company(final String label) {
        this.label = label;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(final String label) {
        this.label = label;
    }

    public int getNbEmployees() {
        return this.employees.size();
    }

    public void addEmployees(final Person employee) {
        this.employees.add(employee);
    }

    public void sayHelloToEveryone() {
        System.out.println("Je dis bonjour à tout ,le monde, pour bien me faire voir par la boite.");
    }
}
