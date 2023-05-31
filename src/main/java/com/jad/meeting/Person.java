package com.jad.meeting;

public class Person implements Meeter {
    private String lastName;
    private String firstName;

    public Person(final String lastName, final String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void meet(final Meetable meetable) {
        meetable.isMet(this);
    }

    @Override
    public void meet(final Friend friend) {
        friend.drink();
        System.out.println(" " + friend.getSurName());
    }

    @Override
    public void meet(final Paramour paramour) {
        paramour.doHug();
    }

    @Override
    public void meet(final Company company) {
        company.sayHelloToEveryone();
        System.out.println(" " + company.getNbEmployees());
    }
}
