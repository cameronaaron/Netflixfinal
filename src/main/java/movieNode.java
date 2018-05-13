import java.io.Serializable;

public class movieNode implements Serializable {

    /// Creating the 4 instance variables/
    private String title;
    private int rDate;
    private int popScore;
    private movieNode rightReleaseD;
    private movieNode leftReleaseD;
    private movieNode rightID;
    private movieNode leftID;


    /// A constructor method which takes 4 parameters/
    public movieNode(String title, int rDate, int popScore) {
        this.title = title;
        this.rDate = rDate;
        this.popScore = popScore;
        this.rightID = rightID;
        this.leftID = leftID;
        this.leftReleaseD = leftReleaseD;
        this.rightReleaseD = rightReleaseD;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRDate(){
        return rDate;
    }

    public void setRDate(int rDate) {
        this.rDate = rDate;
    }

    public int getUniqID() {
        int ID = rDate % 100000;
        return ID;
    }

    public void setUniqID(int uniqID) {
        int uniqID1 = uniqID;
    }

    public int getPopScore() {
        return popScore;
    }

    public void popScore(int popScore) {
        this.popScore = popScore;
    }

    public movieNode getLeftReleaseD() {
        return leftReleaseD;
    }

    public void setLeftReleaseD(movieNode leftReleaseD) {
        this.leftReleaseD = leftReleaseD;
    }

    public movieNode getRightReleaseD() {
        return rightReleaseD;
    }

    public void setRightReleaseD(movieNode rightReleaseD) {
        this.rightReleaseD = rightReleaseD;
    }

    public movieNode getLeftID() {
        return leftID;
    }

    public void setLeftID(movieNode leftID) {
        this.leftID = leftID;
    }

    public movieNode getRightID() {
        return rightID;
    }

    public void setRightID(movieNode rightID) {
        this.rightID = rightID;
    }
    public movieNode findSuccessorRDate(){
    // used on BST to find the successor on the delete function
    if (leftReleaseD==null){
        return this;
        }
    else{
        return leftReleaseD.findSuccessorRDate();
    }
    }
    public movieNode findSuccessorID(){
    // used on BST to find the successor on the delete function
    if (leftID==null){
        return this;
        }
    else{
        return leftID.findSuccessorID();
    }

}}