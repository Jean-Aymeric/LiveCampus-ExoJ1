package com.jad.meeting;

public interface Meeter {
    void meet(Meetable meetable);

    void meet(Friend friend);

    void meet(Paramour paramour);

    void meet(Company company);
}
