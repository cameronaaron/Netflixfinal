//change all the variables

public class TestMovieNode {
    public static void main(String[] args){  
    System.out.println("movieNode Test Program");
  	movieNode xNode = new movieNode("Avengers",2018, 80);
  	System.out.println("initial xNode");
  	System.out.println(xNode.getTitle());
    System.out.println(xNode.getRDate());
  	System.out.println(xNode.getPopScore());
  	System.out.println(xNode.getUniqID());
      
  	xNode.setTitle("Black Panther");
  	xNode.setRDate(2017);
  	xNode.setUniqID(100);
    System.out.println("changed xNode");
    System.out.println(xNode.getTitle());
  	System.out.println(xNode.getRDate());
  	System.out.println(xNode.getPopScore());
  	System.out.println(xNode.getUniqID());
  	
    movieNode yNode = new movieNode("Quiet Place",2018, 60);
  	System.out.println("initial yNode");
    System.out.println(yNode.getTitle());
    System.out.println(xNode.getRDate());
  	System.out.println(yNode.getPopScore());
  	System.out.println(yNode.getUniqID());
      
    xNode.setNext(yNode);
  	System.out.println("yNode through xNode next");
  	System.out.println(xNode.getNext().getTitle());
    System.out.println(xNode.getNext().getRDate());
  	System.out.println(xNode.getNext().getPopScore());
  	System.out.println(xNode.getNext().getUniqID());
    }
}
