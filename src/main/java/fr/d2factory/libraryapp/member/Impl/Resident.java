package fr.d2factory.libraryapp.member.impl;

import static fr.d2factory.libraryapp.member.impl.FirstYearStudent.leftToPayAtStandardAndLateRate;

import java.math.BigDecimal;

import fr.d2factory.libraryapp.member.Member;

public class Resident extends Member {

    private static final BigDecimal STANDARD_RATE = new BigDecimal("0.10");
    private static final BigDecimal LATE_RATE = new BigDecimal("0.20");

    public Resident(final BigDecimal wallet) {
        super(wallet);
    }

    @Override
    protected BigDecimal priceForBook(final long numberOfDays) {

        final long standardDays = dayOfLateness();
        return leftToPayAtStandardAndLateRate(numberOfDays, standardDays, STANDARD_RATE, LATE_RATE);
    }

    @Override
    public long dayOfLateness() {
        return 60;
    }
}