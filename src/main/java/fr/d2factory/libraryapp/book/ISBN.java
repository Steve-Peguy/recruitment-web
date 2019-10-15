package fr.d2factory.libraryapp.book;

import java.util.Objects;

public class ISBN {
	
	long isbnCode;
	
	public ISBN(long isbnCode){
		this.isbnCode = isbnCode;
	}
	
	public long getIsbnCode(){
		return this.isbnCode;
	}
	
	@Override
	public boolean equals(Object obj){
		return obj.hashCode() == this.hashCode();
	}
	
	@Override
	public int hashCode(){
		return Objects.hash(this.isbnCode);
	}
}
