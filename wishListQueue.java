//Wish List implemented by a QueueLL

public class QueueLL {
		private Node fMovie;
		private Node eMovie;
		private int n;
			
	public QueueLL() {
		fMovie = null;
		eMovie = null;
		n = 0;
	}
		
	public Node acessMovie() {
		return fMovie;
	}
	
	public Node deleteMovie() {
		Node temp; 
		temp = fMovie;
		fMovie = fMovie.getNext();
		n--;
		return temp;
	}
	
	public void addMovie(Node x) {
		if (fMovie == null) {
			fMovie = x;
			eMovie = x;
			n++;
		}
		else {
			Node temp = eMovie;
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
		Node temp = fMovie;
		while (temp != null) {
			System.out.println(temp.getKey());
			temp = temp.getNext();
		}
	}
}
