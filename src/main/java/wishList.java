//Wish List implemented by a QueueLL

import java.io.Serializable;


public class wishList implements Serializable {
		private customerNode fMovie;
		private customerNode eMovie;
		private int n;
			
	public wishList() {
		fMovie = null;
		eMovie = null;
		n = 0;
	}
		
	public customerNode accessMovie() {
		return fMovie;
	}
	
	public customerNode deleteMovie() {
		customerNode temp; 
		temp = fMovie;
		fMovie = fMovie.getNext();
		n--;
		return temp;
	}
	
	public void addMovie(customerNode x) {
		if (fMovie == null) {
			fMovie = x;
			eMovie = x;
			n++;
		}
		else {
			customerNode temp = eMovie;
			eMovie = x;
			temp.setNext(eMovie);
			n++;
		}
	}
	
	public boolean isEmpty() {
		return (n==0);
	}
	
	public void printMovie() {
		System.out.println(n);
		customerNode temp = fMovie;
		while (temp != null) {
			System.out.println(temp.getKey());
			temp = temp.getNext();
		}
	}
}
