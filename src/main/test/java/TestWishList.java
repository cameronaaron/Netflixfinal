public class TestWishList {
	public static void main(String[] args){
	    	wishListQueue a = new wishListQueue();
	    	customerNode xNode = new customerNode("Jane","Jane@gmail.com", 123456789);
	    	customerNode yNode = new customerNode("Joe","Joe@gmail.com", 934567890);
	    	customerNode zNode = new customerNode("Jack","Jack@gmail.com", 223452234);
	    	customerNode kNode = new customerNode("Jill","Jill@gmail.com", 934567856);
	    	a.addMovie(xNode);
	    	a.addMovie(yNode);
	    	a.addMovie(zNode);
	    	a.addMovie(kNode);
	    	a.printMovie();
	    	System.out.println();
	    	System.out.println(a.accessMovie().getKey());
	    	System.out.println();
	    	a.printMovie();
	    	System.out.println();
	    	System.out.println(a.deleteMovie().getKey());
	    	System.out.println();
	    	a.printMovie();
	    	System.out.println();
	    	System.out.println(a.isEmpty());
	    	while(!a.isEmpty()) {
		System.out.println(a.deleteMovie().getKey());
		System.out.println();
	    	}
	        a.printMovie();
	    	System.out.println(a.isEmpty());
	    	System.out.println();
	}
}
