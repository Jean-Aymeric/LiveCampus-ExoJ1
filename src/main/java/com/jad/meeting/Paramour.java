package com.jad.meeting;

public class Paramour extends Person implements Meetable {
    public Paramour(final String lastName, final String firstName) {
        super(lastName, firstName);
    }

    public void doHug() {
        System.out.println("On se fait un câlin");
    }

    @Override
    public void isMet(final Meeter meeter) {
        meeter.meet(this);
    }
}
