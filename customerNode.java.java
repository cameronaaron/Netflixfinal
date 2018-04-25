public class Node {
	
	private Node next;
	private String name;
	private String email;
	private int CCN;
	
	public Node(String name0, String email0, int CCN0) {
		name = name0;
		email = email0;
		CCN = CCN0;
		
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
	
	public void setCCN(int CCN0) {
		CCN = CCN0;
	}
	
	public int getCCN() {
		return CCN;
	}
	
	public int getKey() {
		return (this.CCN%10000);
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
