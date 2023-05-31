package com.jad.meeting;

public class Friend extends Person implements Meetable {
    private String surName;

    public Friend(final String lastName, final String firstName, final String surName) {
        super(lastName, firstName);
        this.surName = surName;
    }

    public void drink() {
        System.out.print("On picole entre potes");
    }

    public String getSurName() {
        return this.surName;
    }

    public void setSurName(final String surName) {
        this.surName = surName;
    }

    @Override
    public void isMet(final Person person) {
        person.meet(this);
    }
}
