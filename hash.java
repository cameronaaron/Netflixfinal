public class hash {
    Node [] h = new Node [100];
   private int n;


    public hash(){
        n = 0;
    }
    public boolean isEmpty(){
       return n==0;
    }
    public Node lookup(int key) {
        if (isEmpty()) {
            System.out.print("Cannot be printed hashtable is empty");
            return null;
        }
        else {
            int index = key % 7;
            Node temp = null;
            if (h[index].getKey() == key) {
                return h[index];
            } else {
                temp = h[index];
                while (temp.getKey() != key || temp == null) {
                    temp = temp.getNext();

                }
                if (temp == null) {
                    System.out.print("NO NODE FOUND");
                    return null;
                } else {
                    return temp;

                }


            }
        }
    }
    public void insert(Node newnode) {
        int index = newnode.getKey() % 7;
        n++;
        if (h[index] == null) {
            h[index] = newnode;


        } else {
            Node temp = h[index];
            h[index] = newnode;
            h[index].setNext(temp);

        }
    }
    public void delete(int key){
            if (isEmpty()){
                System.out.print("Table is empty");

            }
            else{
               int index= key%7;
                n--;
                Node temp= null;
                if (h[index].getKey()==key){
                    if (h[index].getNext()!=null){
                        h[index]=h[index].getNext();

                    }
                    else{
                        h[index]=null;
                    }

                }
                else{
                    temp=h[index];
                    Node temp2=null;
                    while (temp != null && temp.getKey() != key  ){
                        temp2=temp;
                        temp=temp.getNext();
                    }
                    if (temp==null) {
                        System.out.println("NODE NOT IN HASH");
                    }
                    else{
                        temp2.setNext(temp.getNext());

                    }

                }



            }
    }
    public void printhastable(){
        for (int i=0; i<7; i++){
            printchain(i);
        }

    }
    public void printchain(int index){
        Node temp=h[index];
        while (temp!=null){
            System.out.println(temp.getKey());
	 
            temp=temp.getNext();
        }
    }

}
