import java.io.Serializable;
import java.io.*;


public class netflixHash implements Serializable {
    customerNode []s = new customerNode [7]; //creates max size array
    private int n; //declaring variable to act as counter

    public netflixHash() {
        n=0; //initializes counter
    }

    public customerNode lookUp(int key) {
        if (isEmpty()) { //lets user know if HashTable is empty
            System.out.println("customerNode not found");
            return null; //always need to return something
        }
        else { 
            int index = key % 7; //helps organize integers in an array
            customerNode temp = null; //declare a temp to store info
            if (s[index].getKey() == key) { //returns the index that is equivalent to key
                return s[index];
            }
            else {
                temp = s[index]; 
                while (temp == null || temp.getKey() != key) { //while we look up the value that isnt accounted for our first if statement
                    temp=temp.getNext();
                }
            }
            if (temp == null) { //different case if temp is null
                System.out.println("No customerNode found to return this key");
                return null;
            }
            else {
                return temp; //returns the value we stored
            }
            
        }
    }
    public void insert(customerNode newcustomerNode) {
        int index = newcustomerNode.getKey() % 7; //inserts new customerNode in the posotion we want 
        n++; //updating counter
        
        if (s[index] == null) { //if there is nothing in HashTable procede to add a new customerNode
            s[index] = newcustomerNode;
        }   
        else {
            customerNode temp = s[index]; //store position we want to insert in
            s[index] = newcustomerNode; //sets that position to the new customerNode
            s[index].setNext(temp); 
        }
    }

    public void delete(int key) {
        if (isEmpty()) {
            System.out.println("HashTable is empty");
        }
        else {
            int index = key % 7; 
            customerNode temp = null;
            customerNode temp2 = null;
            n--; //decrements counter
            
            if (s[index].getKey() == key ) {
                if (s[index].getNext() != null ){
                    s[index] = s[index].getNext();
                }
                else {
                    s[index] = null;
                }
            }
            else {
                temp = s[index];
                while (temp != null && temp.getKey() != key){
                    temp2 = temp;
                    temp = temp.getNext();
                }
            
                if (temp == null) {
                    System.out.println("No customerNode found to delete");
                    n++;
                }
                else {
                    temp2.setNext(temp.getNext());
                }
            }
        }
    }

    public boolean isEmpty() {
        return (n==0); 
    }

    public void printHashTable() {
        for (int i = 0; i < 7; i++) {
            printChain(i);
        }
    
    }
    public void printChain(int i) {
        customerNode temp = s[i];
        while (temp != null ) {
            System.out.println(temp.getKey());
            temp = temp.getNext();
        }
    }
}

    

