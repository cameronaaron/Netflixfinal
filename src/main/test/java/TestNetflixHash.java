public class TestNetflixHash {
    public static void main(String[] args) {
        netflixHash a = new netflixHash();
        customerNode xcustomerNode = new customerNode("Jane", "Jane@gmail.com", 123456789);
        customerNode ycustomerNode = new customerNode("Joe", "Joe@gmail.com", 934567890);
        customerNode zcustomerNode = new customerNode("Jack", "Jack@gmail.com", 223452234);
        customerNode kcustomerNode = new customerNode("Jill", "Jill@gmail.com", 934567856);
        customerNode acustomerNode = new customerNode("Abe", "Abe@gmail.com", 123456788);
        customerNode bcustomerNode = new customerNode("Beth", "Beth@gmail.com", 934567898);
        customerNode ccustomerNode = new customerNode("Chuck", "Chuck@gmail.com", 223452238);
        customerNode dcustomerNode = new customerNode("Dot", "Dot@gmail.com", 934567858);
        a.insert(xcustomerNode);
        a.insert(ycustomerNode);
        a.insert(zcustomerNode);
        a.insert(kcustomerNode);
        System.out.println("Is empty =" + a.isEmpty());
        a.printnetflixHash();
        a.lookUp(6789);

        a.insert(acustomerNode);
        a.insert(bcustomerNode);
        a.insert(ccustomerNode);
        a.insert(dcustomerNode);
        a.printnetflixHash();
        a.delete(2238);
        a.delete(7898);
        a.delete(1234);
        a.printnetflixHash();
        System.out.println("Is empty =" + a.isEmpty());
    }
}