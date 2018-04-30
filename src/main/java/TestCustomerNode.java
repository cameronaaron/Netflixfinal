public class TestCustomerNode {
    public static void main(String[] args) {
        System.out.println("customerNode Test Program");
        customerNode xNode = new customerNode("Jane", "Jane@gmail.com", 123456789);
        System.out.println("initial xNode");
        System.out.println(xNode.getName());
        System.out.println(xNode.getEmail());
        System.out.println(xNode.getCCN());
        System.out.println(xNode.getKey());

        xNode.setName("Jill");
        xNode.setEmail("Jill@gmail.com");
        xNode.setCCN(987654321);
        System.out.println("changed xNode");
        System.out.println(xNode.getName());
        System.out.println(xNode.getEmail());
        System.out.println(xNode.getCCN());
        System.out.println(xNode.getKey());

        customerNode yNode = new customerNode("Joe", "Jor@gmail.com", 934567890);
        System.out.println("initial yNode");
        System.out.println(yNode.getName());
        System.out.println(xNode.getEmail());
        System.out.println(yNode.getCCN());
        System.out.println(yNode.getKey());

        xNode.setNext(yNode);
        System.out.println("yNode through xNode next");
        System.out.println(xNode.getNext().getName());
        System.out.println(xNode.getNext().getEmail());
        System.out.println(xNode.getNext().getCCN());
        System.out.println(xNode.getNext().getKey());
    }
}
