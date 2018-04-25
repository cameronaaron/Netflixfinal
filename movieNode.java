public class movieNode{

	///Creating the 4 instance variables/
	private String title;
	private int rDate;
	private int popScore;

	
	///A constructor method which takes 4 parameters/
	public movieNode(String title, int rDate, int popScore){
		this.title = title;
		this rDate = rDate;
		this popScore = popScore;

	}
	public String getTitle(){
		return title;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public int getRDate(){
		return rDate;
	}
	public void setRDate(int rDate){
		this.rDate = rDate;
	}
	public int getUniqID(){
		int ID = rDate % 10;
		return ID;
	}
	public void setUniqID(int uniqID){
		this.uniqID = uniqID;
	}
	public int getPopScore(){
		return popScore;
	}
	public void popScore(int popScore){
		this.popScore = popScore;
	}
    }
