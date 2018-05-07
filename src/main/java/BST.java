//Mar 23 2018
public class BST {
    //Accumulator
    private movieNode root;
    private movieNode root2;


    //Declaire public class
    public BST() {
        //Accumulator starts at 0
        root = null;
        root2 = null;
    }

    // Returns true if the list is empty
    public boolean isEmptyTree() {
        return (root == null);
    }

    // Pop Funtion
    public void delete(movieNode x) {
        if (x == root) {
            root = deleteRoot(x);

        } else {
            delete2(root, x);
        }


    }

    public movieNode deleteRoot(movieNode x) {
        if (x.getRightReleaseD() == null && x.getLeftReleaseD() == null) {
            return null;
        } else if (x.getLeftReleaseD() == null) {
            movieNode temp = x.getRightReleaseD();
            x.setRightReleaseD(null);
            return temp;
        } else if (x.getLeftReleaseD() == null) {
            movieNode temp = x.getRightReleaseD();
            x.setLeftReleaseD(null);
            return temp;
        } else {
            movieNode s = successor(x);
            delete(s);
            s.setRightReleaseD(x.getRightReleaseD());
            s.setLeftReleaseD(x.getLeftReleaseD());
            x.setLeftReleaseD(null);
            x.setRightReleaseD(null);
            return s;


        }
    }


    public movieNode successor(movieNode x) {
        movieNode temp = x.getRightReleaseD();
        while (temp.getLeftReleaseD() != null) {
            temp = temp.getLeftReleaseD();
        }
        return temp;
    }

    public void delete2(movieNode tree, movieNode x) {
        if (tree.getRightReleaseD() == x) {

            tree.setRightReleaseD(deleteRoot(x));
        } else if (tree.getLeftReleaseD() == x) {
            tree.setLeftReleaseD(deleteRoot(x));
        } else if (x.getRDate() < tree.getRDate()) {
            delete2(tree.getLeftReleaseD(), x);
        } else {
            delete2(tree.getRightReleaseD(), x);
        }


    }

    // Return the top node in stac
    // pushes node to top of stack
    public void insert(movieNode newNode) {
        if (null == root) {
            root = newNode;

        } else {
            insert2(root, newNode);
        }


    }

    public void insert2(movieNode t, movieNode p) {
        if (p.getRDate() < t.getRDate()) {
            if (t.getLeftReleaseD() == null) {
                t.setLeftReleaseD(p);
            } else {
                insert2(t.getLeftReleaseD(), p);

            }

        } else {
            if (t.getRightReleaseD() == null) {
                t.setRightReleaseD(p);
            } else {
                insert2(t.getRightReleaseD(), p);

            }

        }
    }

    public movieNode search(int key) {
        if (root.getRDate() == key) {
            return root;
        } else {
            return searchR(root, key);
        }


    }

    public movieNode searchR(movieNode t, int key) {
        if (t == null) {
            return null;
        } else if (key == t.getRDate()) {
            return t;
        } else if (key < t.getRDate()) {
            return searchR(t.getLeftReleaseD(), key);

        } else {
            return searchR(t.getRightReleaseD(), key);

        }
    }

    public void traverse() {
        if (root != null) {
            traverse2(root);

        }
    }

    public void traverse2(movieNode t) {
        if (t != null) {
            traverse2(t.getLeftReleaseD());
            System.out.println(t.getRDate());
            traverse2(t.getRightReleaseD());
        }
    }


    //Prints the stack
    public void printTree() {
        printTree2(root);
        System.out.println();
    }

    private void printTree2(movieNode tree) {
        if (tree != null) {
            System.out.print(tree.getRDate() + " ");
            if (tree.getLeftReleaseD() != null)
                System.out.print("Left: " + tree.getLeftReleaseD().getRDate() + " ");
            else
                System.out.print("Left: null ");
            if (tree.getRightReleaseD() != null)
                System.out.println("Right: " + tree.getRightReleaseD().getRDate() + " ");
            else
                System.out.println("Right: null ");
            printTree2(tree.getLeftReleaseD());
            printTree2(tree.getRightReleaseD());
        }
    }







    // Returns true if the list is empty
    public boolean isEmptyTreeID() {
        return (root2 == null);
    }

    // Pop Funtion
    public void deleteID(movieNode x) {
        if (x == root2) {
            root2 = deleteRootID(x);

        } else {
            delete2ID(root2, x);
        }


    }

    public movieNode deleteRootID(movieNode x) {
        if (x.getRightID() == null && x.getLeftID() == null) {
            return null;
        } else if (x.getLeftID() == null) {
            movieNode temp = x.getRightID();
            x.setRightID(null);
            return temp;
        } else if (x.getLeftID() == null) {
            movieNode temp = x.getRightID();
            x.setLeftID(null);
            return temp;
        } else {
            movieNode s = successorID(x);
            deleteID(s);
            s.setRightID(x.getRightID());
            s.setLeftID(x.getLeftID());
            x.setLeftID(null);
            x.setRightID(null);
            return s;


        }
    }


    public movieNode successorID(movieNode x) {
        movieNode temp = x.getRightID();
        while (temp.getLeftID() != null) {
            temp = temp.getLeftID();
        }
        return temp;
    }

    public void delete2ID(movieNode tree, movieNode x) {
        if (tree.getRightID() == x) {

            tree.setRightID(deleteRoot(x));
        } else if (tree.getLeftID() == x) {
            tree.setLeftID(deleteRoot(x));
        } else if (x.getUniqID() < tree.getUniqID()) {
            delete2ID(tree.getLeftID(), x);
        } else {
            delete2ID(tree.getRightID(), x);
        }


    }

    // Return the top node in stac
    // pushes node to top of stack
    public void insertID(movieNode newNode) {
        if (null == root2) {
            root2 = newNode;

        } else {
            insert2ID(root2, newNode);
        }


    }

    public void insert2ID(movieNode t, movieNode p) {
        if (p.getUniqID() < t.getUniqID()) {
            if (t.getLeftID() == null) {
                t.setLeftID(p);
            } else {
                insert2ID(t.getLeftID(), p);

            }

        } else {
            if (t.getRightID() == null) {
                t.setRightID(p);
            } else {
                insert2ID(t.getRightID(), p);

            }

        }
    }

    public movieNode searchID(int key) {
        if (root.getUniqID() == key) {
            return root2;
        } else {
            return searchRID(root2, key);
        }


    }

    public movieNode searchRID(movieNode t, int key) {
        if (t == null) {
            return null;
        } else if (key == t.getUniqID()) {
            return t;
        } else if (key < t.getUniqID()) {
            return searchR(t.getLeftID(), key);

        } else {
            return searchR(t.getRightID(), key);

        }
    }

    public void traverseID() {
        if (root2 != null) {
            traverse2ID(root2);

        }
    }

    public void traverse2ID(movieNode t) {
        if (t != null) {
            traverse2ID(t.getLeftID());
            System.out.println(t.getUniqID());
            traverse2ID(t.getRightID());
        }
    }


    //Prints the stack
    public void printTreeID() {
        printTree2ID(root2);
        System.out.println();
    }

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
            printTree2(tree.getLeftID());
            printTree2(tree.getRightID());
        }
    }

}
