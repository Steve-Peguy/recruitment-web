package fr.d2factory.libraryapp.library;

public class HasLateBooksException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7511152640224894009L;

	public HasLateBooksException(String msg){
		super(msg);
	}
}
