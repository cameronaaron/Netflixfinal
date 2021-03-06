/* Programners: Alex Saucedo, Nelia Arnaud, Michele Davila, Cameron Aaron
   Date: May 16, 2018
   Final Prject
*/

   
//imported java packages(scanner used to identify user import and * import serelization) 
import java.io.Serializable;
import java.io.*;

public class netflixBST implements Serializable{
    //Create Universal instance variables
    private movieNode root;
    private movieNode root2;

    //Two roots since it is a double BST
    public netflixBST(){
        root = null;
        root2 = null;
    }
    //Checks to see if tree for release date is empty or not
    public Boolean isEmptyTree(){
        if(root == null){
            return true;
        }
        else{
            return false;
        }
    }

    //Prints tree with release date
    public void printTree() {
    printTree2(root);
    System.out.println();
    }
    //Helper method for printtree
    private void printTree2(movieNode tree) {
    if (tree != null) {
        System.out.print(tree.getRDate() + " ");
            if (tree.getLeftReleaseD() != null)
            System.out.print("Release Date: " + tree.getLeftReleaseD().getRDate() + " ");
            else
                System.out.print(" ");
            if (tree.getRightReleaseD() != null)
            System.out.println("Release Date: " + tree.getRightReleaseD().getRDate() + " ");
            else
                System.out.println(" ");
        printTree2(tree.getLeftReleaseD());
        printTree2(tree.getRightReleaseD());
    }
    }

    //Inserts new movie to release date BST 
    public void insert(movieNode x){
        if (root == null){
            root = x;
        }
        else{
            insert2(root, x);
        }
    }
    //Help method for insert
    public void insert2(movieNode r, movieNode x){
        if(x.getRDate() < r.getRDate()){
            if(r.getLeftReleaseD() == null){
                r.setLeftReleaseD(x);
            
            }
            else{
                insert2(r.getLeftReleaseD(), x);
            }}
        else{
            if(r.getRightReleaseD() == null){
                r.setRightReleaseD(x);
        }
            else{
                insert2(r.getRightReleaseD(), x);
            }
        }
    }
    
    //Traverses release date BST
    public void traverse(){
    traverser(root);
    }
    //Helper method for traverse
    public void traverser(movieNode x){
    if(x != null){
        traverser(x.getLeftReleaseD());
        System.out.println(x.getTitle() + " ame out on " + x.getRDate() + " (yyyymmdd)");
        traverser(x.getRightReleaseD());
    }
    }
    //Searchs for node in release date BST
    public movieNode search(int key){
    return searchr(root, key);

    }
    //Helper method for bst
    public movieNode searchr(movieNode x, int key){
    if(x == null){
        return x;
        }
    else if(key == x.getRDate()){
        return x;
    }
    else if(key < x.getRDate()){
        return searchr(x.getLeftReleaseD(), key);
    }
    else{
        return searchr(x.getRightReleaseD(), key);
    }
    }
//Deletes movie from release date bst
public void delete(movieNode p){
        // Removes the node p from the tree
        if (root!=null){// if the tree is not empty calls delete2
            delete2(root,p);
        }
    }
    //Helper method for delete
    public movieNode delete2(movieNode parent, movieNode p){
        //called on delete to recursively delete the node p
        if (parent==null){// if the Node being passes is null returns null
            return null;
        }
        if (parent.getRDate()==p.getRDate()){// if the parent is the desired node
            if (parent.getRightReleaseD()==null && parent.getLeftReleaseD()==null){// Leaf
                return null;
            }
            else if(parent.getRightReleaseD()!=null && parent.getLeftReleaseD()==null){// 1 child
                return parent.getRightReleaseD();
            }
            else if(parent.getLeftReleaseD()!=null && parent.getRightReleaseD()==null){// 1 child
                return parent.getLeftReleaseD();
            }
            else{// 2 childrem, uses the Node method findSuccessor to find the successor
                movieNode suc= parent.getRightReleaseD().findSuccessorRDate();
                parent.popScore(suc.getPopScore());
                parent.setTitle(suc.getTitle());
                parent.setRightReleaseD(delete2(parent.getRightReleaseD(), suc));
                return parent;
                }
        }
        else if (parent.getRDate()> p.getRDate()){// Calls delete2 on the left
            parent.setLeftReleaseD(delete2(parent.getLeftReleaseD(),p));
            return parent;
        }
        else if (parent.getRDate()< p.getRDate()){// calls delete2 on the Right
            parent.setRightReleaseD(delete2(parent.getRightReleaseD(),p));
            return parent;
        }
        
        return null; 
    }
    //Checks to see if ID bst is empty
   public Boolean isEmptyTreeID(){
        if(root2 == null){
            return true;
        }
        else{
            return false;
        }
    }
    //Prints movies with ID
    public void printTreeID() {
    printTree2ID(root2);
    System.out.println();
    }
    //helper method for print method
    private void printTree2ID(movieNode tree) {
    if (tree != null) {
        System.out.print(tree.getUniqID() + " ");
            if (tree.getLeftID() != null)
            System.out.print("Left: " + tree.getLeftID().getUniqID() + " ");
            else
                System.out.print("Left: null ");
            if (tree.getRightID() != null)
            System.out.println("Right: " + tree.getRightID().getUniqID() + " ");
            else
                System.out.println("Right: null ");
        printTree2ID(tree.getLeftID());
        printTree2ID(tree.getRightID());
    }
    }
    //Inserts new movie to ID bst
    public void insertID(movieNode x){
        if (root2 == null){
            root2 = x;
        }
        else{
            insert2ID(root2, x);
        }
    }
    //Helper Method for insert 
    public void insert2ID(movieNode r, movieNode x){
        if(x.getUniqID() < r.getUniqID()){
            if(r.getLeftID() == null){
                r.setLeftID(x);
            
            }
            else{
                insert2ID(r.getLeftID(), x);
            }}
        else{
            if(r.getRightID() == null){
                r.setRightID(x);
        }
            else{
                insert2ID(r.getRightID(), x);
            }
        }
    }
    
    //Travserse bst for ID
    public void traverseID(){
    traverserID(root);
    }

    public void traverserID(movieNode x){
    if(x != null){
        traverser(x.getLeftID());
        System.out.println(x.getUniqID());
        traverser(x.getRightID());
    }
    }
    //Searches movie in BST using ID
    public movieNode searchID(int key){
    return searchrID(root2, key);

    }

    public movieNode searchrID(movieNode x, int key){
    if(x == null){
        return x;
        }
    else if(key == x.getUniqID()){
        return x;
    }
    else if(key < x.getUniqID()){
        return searchrID(x.getLeftID(), key);
    }
    else{
        return searchrID(x.getRightID(), key);
    }
    }
//Deletes movie from ID bst
public void deleteID(movieNode p){
        // Removes the node p from the tree
        if (root2!=null){// if the tree is not empty calls delete2
            delete2ID(root2,p);
        }
    }
    public movieNode delete2ID(movieNode parent, movieNode p){
        //called on delete to recursively delete the node p
        if (parent==null){// if the Node being passes is null returns null
            return null;
        }
        if (parent.getUniqID()==p.getUniqID()){// if the parent is the desired node
            if (parent.getRightID()==null && parent.getLeftID()==null){// Leaf
                return null;
            }
            else if(parent.getRightID()!=null && parent.getLeftID()==null){// 1 child
                return parent.getRightID();
            }
            else if(parent.getLeftID()!=null && parent.getRightID()==null){// 1 child
                return parent.getLeftID();
            }
            else{// 2 childrem, uses the Node method findSuccessor to find the successor
                movieNode suc= parent.getRightID().findSuccessorID();
                parent.popScore(suc.getPopScore());
                parent.setTitle(suc.getTitle());
                parent.setRDate(suc.getRDate());
                parent.setRightID(delete2(parent.getRightID(), suc));
                return parent;
                }
        }
        else if (parent.getUniqID()> p.getUniqID()){// Calls delete2 on the left
            parent.setLeftID(delete2(parent.getLeftID(),p));
            return parent;
        }
        else if (parent.getUniqID()< p.getUniqID()){// calls delete2 on the Right
            parent.setRightID(delete2(parent.getRightID(),p));
            return parent;
        }
        
        return null; 
    }

}