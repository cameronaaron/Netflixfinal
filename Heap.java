
//Cameron Aaron
//Mar 23 2018
//

//
public class Heap {
    Node [] h = new Node [120];
    private int n;
    private Node temp;
   public Heap() {

        n=0;
   }

    // This is the creatin of the is empty function this will tell you

    public boolean isEmptyset() {
        return n == 0;
    }
    // This returns the node at the top of the stack
    public Node findMin() {
        return h[0];

    }
    public int parent(int x){
       if (x%2==0){
           return (x-2)/2;


       }
       else{
           return (x-1)/2;

       }
    }
    public void swap(int c, int p){
       temp=h[p];
       h[p]=h[c];
       h[c]=temp;

    }
    public int child(int p){
       int childL=2*p+1;
       int childR=2*p+2;
       if (childR>=n&&childL>=n){
           return -1;
        }
        else if(h[childR].getKey()>h[childL].getKey()||childR>=n){
           return childL;

       }
       else{
           return childR;
       }
    }

    // This removes from the top of the stack
    public void insert(Node newnode){
       if (isEmptyset()){
           h[0]=newnode;
           n++;
       }
       else {
           h[n]=newnode;
           n++;
           int p=parent(n-1);
           int a=n-1;
           while (h[a].getKey()<h[p].getKey()){
               swap(a,p);
               a=p;
               p=parent(a);
               if (p==-1){
                   break;
               }

           }
       }
    }
    public void deleteMin(){
       if (isEmptyset()){
           System.out.print("Heap is empty");

        }
        else{
           n--;
           swap(0,n);
           int p=0;
           int c=child(p);
           while (c!=-1){
               swap(c,p);
               p=c;
               c=child(p);

           }
        }

    }

    // This prints the stack
    public void printHeap() {

       for(int i =0; i <= n-1; i++){
           System.out.println(h[i].getKey());

        }
    }


}