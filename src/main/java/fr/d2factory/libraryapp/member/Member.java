package fr.d2factory.libraryapp.member;

import fr.d2factory.libraryapp.library.Library;

/**
 * A member is a person who can borrow and return books to a {@link Library}
 * A member can be either a student or a resident
 */
public abstract class Member {
    /**
     * An initial sum of money the member has
     */
    private BigDecimal wallet;
	
	protected Member(final BigDecimal wallet) {
        this.wallet = wallet;
    }
	
    /**
     * The member should pay their books when they are returned to the library
     *
     * @param numberOfDays the number of days they kept the book
     */
    public void payBook(final long numberOfDays){
		if (numberOfDays < 0) throw new IllegalArgumentException("numberOfDays was negative " + numberOfDays);

        setWallet(getWallet().subtract(priceForBook(numberOfDays)));
	}

    public BigDecimal getWallet() {
        return wallet;
    }

    public void setWallet(BigDecimal wallet) {
        this.wallet = wallet;
    }
	
	protected abstract BigDecimal priceForBook(final long numberOfDays);
	
	//Nbre de jours après lesquels le membre est en retard
	public abstract long dayOfLateness();
}
