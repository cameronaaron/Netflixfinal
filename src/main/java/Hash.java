public class Hash {
   customerNode [] h = new customerNode [1000];
   private int n;


    public Hash() {
        n = 0;

    }

    public boolean isEmpty(){
       return n==0;
    }

    public customerNode lookup(int key) {
        if (isEmpty()) {
            System.out.print("Cannot be printed hashtable is empty");
            return null;
        }
        else {
            int index = key % 1000;
            customerNode temp = null;
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

    public void insert(customerNode newnode) {
        int index = newnode.getKey() % 1000;
        n++;
        if (h[index] == null) {
            h[index] = newnode;


        } else {
            customerNode temp = h[index];
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
                customerNode temp = null;
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
                    customerNode temp2 = null;
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
        for (int i=0; i<1000; i++){
            printchain(i);
        }

    }
    public void printchain(int index){
        customerNode temp = h[index];
        while (temp!=null){
            System.out.println(temp.getKey());
	 
            temp=temp.getNext();
        }
    }

}
