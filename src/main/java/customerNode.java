import java.io.Serializable;
import java.io.*;


public class customerNode implements Serializable {
	
	private customerNode next;
	private String name;
	private String email;
	private int ccn;
	private wishList wishList;
	
	public customerNode(String name0, String email0, int ccn0) {
		name = name0;
		email = email0;
		ccn = ccn0;

		
		wishList = new wishList();		
	}
	
	public void setName(String name0) {
		name = name0;
	}
	
	public String getName() {
		return name;
	}
	
	public void setEmail(String email0) {
		email = email0;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setCCN(int ccn0) {
		ccn = ccn0;
	}
	
	public int getCCN() {
		return ccn;
	}
	//uses credit card number as key, convinient for our bst 
	public int getKey() {
		return (this.ccn%10000);
	}
 	
	public void setNext(customerNode next0) {
		next = next0;
	}
	
	public customerNode getNext() {
		return next;
	}
	public void setWishList(wishList wishList0){
		wishList = wishList0;
	 }
	 //stored in node to link customer info and movies
	 public wishList getWishList(){
	 	return wishList;
	 }
	
	
}