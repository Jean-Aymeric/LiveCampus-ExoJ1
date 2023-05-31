package com.jad.meeting;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlienTest {
    private static final int NB_EMPLOYEES = 10;
    private static final Company COMPANY = new Company("Label expected");
    private static final Friend FRIEND = new Friend("FriendLastName", "FriendFirstName", "FriendSurname");
    private static final Paramour PARAMOUR = new Paramour("ParamourLastName", "ParamourFirstName");
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeAll
    static void init() {
        for (int i = 0; i < AlienTest.NB_EMPLOYEES; i++) {
            AlienTest.COMPANY.addEmployees(new Person("LastName" + i, "FirstName" + i));
        }
    }

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(this.outputStreamCaptor));
    }

    @Test
    void meetFriend() {
        final Alien alien = new Alien();
        alien.meet((Meetable) AlienTest.FRIEND);
        assertEquals(AlienTest.FRIEND.getSurName() + " devient mon sidekick.",
                this.outputStreamCaptor.toString().trim());
    }

    @Test
    void meetParamour() {
        final Alien alien = new Alien();
        alien.meet((Meetable) AlienTest.PARAMOUR);
        assertEquals("Je dévore " + AlienTest.PARAMOUR.getFirstName(), this.outputStreamCaptor.toString().trim());
    }

    @Test
    void meetCompany() {
        final Alien alien = new Alien();
        alien.meet((Meetable) AlienTest.COMPANY);
        assertEquals(
                "Je prends la place du pdg de la boite " + AlienTest.COMPANY.getLabel(),
                this.outputStreamCaptor.toString().trim());
    }
}