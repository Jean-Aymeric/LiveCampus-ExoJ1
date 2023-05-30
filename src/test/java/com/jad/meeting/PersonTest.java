package com.jad.meeting;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {
    private static final int NB_EMPLOYEES = 10;
    private static final Company COMPANY = new Company("Label expected");
    private static final Friend FRIEND = new Friend("FriendLastName", "FriendFirstName", "FriendSurname");
    private static final Paramour PARAMOUR = new Paramour("ParamourLastName", "ParamourFirstName");
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeAll
    static void init() {
        for (int i = 0; i < PersonTest.NB_EMPLOYEES; i++) {
            PersonTest.COMPANY.addEmployees(new Person("LastName" + i, "FirstName" + i));
        }
    }

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(this.outputStreamCaptor));
    }

    @Test
    void meetFriend() {
        final Person person = new Person("LastName", "FirstName");
        person.meet(PersonTest.FRIEND);
        assertEquals("On picole entre potes " + FRIEND.getSurName(), this.outputStreamCaptor.toString().trim());
    }

    @Test
    void meetParamour() {
        final Person person = new Person("LastName", "FirstName");
        person.meet(PersonTest.PARAMOUR);
        assertEquals("On se fait un câlin", this.outputStreamCaptor.toString().trim());
    }

    @Test
    void meetCompany() {
        final Person person = new Person("LastName", "FirstName");
        person.meet(PersonTest.COMPANY);
        assertEquals(
                "Je dis bonjour à tout ,le monde, pour bien me faire voir par la boite. " +
                        PersonTest.COMPANY.getNbEmployees(),
                this.outputStreamCaptor.toString().trim());
    }
}