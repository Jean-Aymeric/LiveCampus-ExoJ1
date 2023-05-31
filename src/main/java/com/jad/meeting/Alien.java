package com.jad.meeting;

public class Alien implements Meeter {
    public void meet(final Meetable meetable) {
        meetable.isMet(this);
    }

    @Override
    public void meet(final Friend friend) {
        System.out.println(friend.getSurName() + " devient mon sidekick.");
    }

    @Override
    public void meet(final Paramour paramour) {
        System.out.println("Je dévore " + paramour.getFirstName());
    }

    @Override
    public void meet(final Company company) {
        System.out.println("Je prends la place du pdg de la boite " + company.getLabel());
    }
}
