//Cameron Aaron
//Mar 23 2018
public class BST {
    //Accumulator
    private movieNode root;


    //Declaire public class
    public BST() {
        //Accumulator starts at 0
        root = null;
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
            return (searchR(t.getLeftReleaseD(), key));

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

}
