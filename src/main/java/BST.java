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
        if (x.getRight() == null && x.getLeft() == null) {
            return null;
        } else if (x.getLeft() == null) {
            Node temp = x.getRight();
            x.setRight(null);
            return temp;
        } else if (x.getLeft() == null) {
            Node temp = x.getRight();
            x.setLeft(null);
            return temp;
        } else {
            Node s = successor(x);
            delete(s);
            s.setRight(x.getRight());
            s.setLeft(x.getLeft());
            x.setLeft(null);
            x.setRight(null);
            return s;


        }
    }


    public movieNode successor(movieNode x) {
        movieNode temp = x.getRight();
        while (temp.getLeft() != null) {
            temp = temp.getLeft();
        }
        return temp;
    }

    public void delete2(movieNode tree, Node x) {
        if (tree.getRight() == x) {

            tree.setRight(deleteRoot(x));
        } else if (tree.getLeft() == x) {
            tree.setLeft(deleteRoot(x));
        } else if (x.getKey() < tree.getKey()) {
            delete2(tree.getLeft(), x);
        } else {
            delete2(tree.getRight(), x);
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

    public void insert2(Node t, Node p) {
        if (p.getKey() < t.getKey()) {
            if (t.getLeft() == null) {
                t.setLeft(p);
            } else {
                insert2(t.getLeft(), p);

            }

        } else {
            if (t.getRight() == null) {
                t.setRight(p);
            } else {
                insert2(t.getRight(), p);

            }

        }
    }

    public Node search(int key) {
        if (root.getKey() == key) {
            return root;
        } else {
            return searchR(root, key);
        }


    }

    public Node searchR(Node t, int key) {
        if (t == null) {
            return null;
        } else if (key == t.getKey()) {
            return t;
        } else if (key < t.getKey()) {
            return (searchR(t.getLeft(), key));

        } else {
            return searchR(t.getRight(), key);

        }
    }

    public void traverse() {
        if (root != null) {
            traverse2(root);

        }
    }

    public void traverse2(Node t) {
        if (t != null) {
            traverse2(t.getLeft());
            System.out.println(t.getKey());
            traverse2(t.getRight());
        }
    }


    //Prints the stack
    public void printTree() {
        printTree2(root);
        System.out.println();
    }

    private void printTree2(customerNode tree) {
        if (tree != null) {
            System.out.print(tree.getKey() + " ");
            if (tree.getLeft() != null)
                System.out.print("Left: " + tree.getLeft().getKey() + " ");
            else
                System.out.print("Left: null ");
            if (tree.getRight() != null)
                System.out.println("Right: " + tree.getRight().getKey() + " ");
            else
                System.out.println("Right: null ");
            printTree2(tree.getLeft());
            printTree2(tree.getRight());
        }
    }

}
