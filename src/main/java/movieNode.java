public class movieNode {

    /// Creating the 4 instance variables/
    private String title;
    private int rDate;
    private int popScore;
    private int uniqID;
    private movieNode rightReleaseD;
    private movieNode leftReleaseD;
    private movieNode rightID;
    private movieNode leftID;
    private float score;

    /// A constructor method which takes 4 parameters/
    public movieNode(String title, int rDate, int popScore) {
        this.title = title;
        this.rDate = rDate;
        this.popScore = popScore;
        this.rightID = rightID;
        this.leftID = leftID;
        this.leftReleaseD = leftReleaseD;
        this.rightReleaseD = rightReleaseD;
        this.score = score;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRDate() {
        return rDate;
    }

    public void setRDate(int rDate) {
        this.rDate = rDate;
    }

    public int getUniqID() {
        int ID = rDate % 10;
        return ID;
    }

    public void setUniqID(int uniqID) {
        this.uniqID = uniqID;
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

    public movieNode getrightID() {
        return rightID;
    }

    public void setRiightID(movieNode rightID) {
        this.rightID = rightID;
    }


}
