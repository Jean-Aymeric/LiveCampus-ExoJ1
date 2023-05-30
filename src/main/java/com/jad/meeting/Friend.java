package com.jad.meeting;

public class Friend extends Person implements Meetable {
    private String surName;

    public Friend(final String lastName, final String firstName, final String surName) {
        super(lastName, firstName);
        this.surName = surName;
    }

    public void drink() {
        System.out.println("On picole entre potes");
    }
}
