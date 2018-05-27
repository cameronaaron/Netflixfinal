import java.io.Serializable;
import java.io.*;

public class wishList implements Serializable{

	//creates 3 different variables as integers, and creates a new array
	private int n;
	private int front;
	private movieNode[] q;
	private int tail;

	//Constructor for the Queue array, sets n, front, tail all equal to 0 and sets the max size of the array to 100 
	public wishList(){
		int n = 0;
		int front = 0;
		int tail = 0;
		q = new movieNode[20];

	}

	// printQueue method for QueueA
	//Prints the key values for the movieNodes in the queue
    public void printQueue() {
        System.out.println(front);
        System.out.println(tail);
        if (front <= tail)
           for(int i = front; i < tail; i++) 
               System.out.println(q[i].getTitle());
        else {
           for(int i = front; i < 100; i++) 
               System.out.println(q[i].getTitle());          
           for(int i = 0; i < tail; i++) 
               System.out.println(q[i].getTitle());
        }          
    }

	//Returns the first movieNode of queue
    public movieNode front(){
    	return q[front];
    }

	//Returns and removes the first movieNode of queue
    public movieNode deleteMovie(){
    	int temp = front;
    	front = (front + 1) % 100;
    	n = n - 1;
    	return q[temp];

    }

	//Adds movieNode x to the queue
    public void addMovie(movieNode x){
    	q[tail] = x;
	   n = n + 1;
    	tail = (front + n) % 100;

    }

    //Boolean function which returns true or false depending if the queue is empty or not
	public Boolean isEmpty(){
		if (n==0){
			return true;
		}
		else{
			return false;
		}
	}
}

