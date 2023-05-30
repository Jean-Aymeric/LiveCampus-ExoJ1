package com.jad.meeting;

public class Person {
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

    public void meet(final Meetable meetable) {
        // To do
        // Lorsque meetable est :
        // - une entreprise, il faut lancer la méthode sayHelloToEveryone() et afficher le nombre d'employés
        // - paramour, lan,cer la méthode doHug()
        // - friend, lancer la méthode drink() et afficher le surnom du pote.
    }
}
