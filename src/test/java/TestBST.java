public class TestBST {
    public static void main(String[] args) {
        BST a = new BST();
        System.out.println("isEmptyTree = " + a.isEmptyTree());
        movieNode xNode = new movieNode("Jane", 123456789, 5);
        movieNode yNode = new movieNode("Joe", 934567890, 5);
        movieNode zNode = new movieNode("Jack", 223452234, 5);
        movieNode kNode = new movieNode("Jill", 934567856, 5);
        movieNode aNode = new movieNode("Abe", 123456788, 5);
        movieNode bNode = new movieNode("Beth", 934567898, 5);
        movieNode cNode = new movieNode("Chuck", 223452238, 5);
        movieNode dNode = new movieNode("Dot", 934567858, 5);
        movieNode mNode = new movieNode("Mike", 723452237, 5);
        movieNode nNode = new movieNode("Nick", 734567857, 5);
        movieNode oNode = new movieNode("Otis", 734562222, 5);
        a.insert(xNode);
        a.insert(yNode);
        a.insert(zNode);
        a.insert(kNode);
        a.traverse();
        a.printTree();
        a.insert(mNode);
        a.insert(nNode);
        System.out.println("search");
        System.out.println(a.search(6789).getTitle());
        System.out.println(a.search(7890).getTitle());
        System.out.println(a.search(2234).getTitle());
        System.out.println(a.search(7856).getTitle());
        a.traverse();
        a.printTree();
        System.out.println("searchFor 7890");
        System.out.println(a.search(7890).getTitle());
        System.out.println("delete6789");
        a.delete(xNode);
        a.traverse();
        a.printTree();
        System.out.println("delete2237");
        a.delete(mNode);
        a.traverse();
        a.printTree();
        System.out.println("delete7857");
        a.delete(nNode);
        a.traverse();
        a.printTree();
        System.out.println("insert6788");
        a.insert(aNode);
        a.traverse();
        a.printTree();
        System.out.println("insert2222");
        a.insert(oNode);
        a.traverse();
        a.printTree();
        System.out.println("delete2234");
        a.delete(zNode);
        a.traverse();
        a.printTree();
        System.out.println("isEmptyTree = " + a.isEmptyTree());
    }
}


