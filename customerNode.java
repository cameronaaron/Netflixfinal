public class Node {
	
	private Node next;
	private String name;
	private String email;
	private int ccn;
	private QueueLL wishList;
	
	public Node(String name0, String email0, int ccn0) {
		name = name0;
		email = email0;
		ccn = ccn0;
		
		wishList = new movieNode[20];
		
		next = null;
		right = null;
		left = null;
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
	
	public int getKey() {
		return (this.ccn%10000);
	}
	
	public void setNext(Node next0) {
		next = next0;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setRight(Node right0) {
		right = right0;
	}
	
	public Node getRight() {
		return right;
	}
	
	public void setLeft(Node left0) {
		left = left0;
	}
	
	public Node getLeft() {
		return left;
	}
