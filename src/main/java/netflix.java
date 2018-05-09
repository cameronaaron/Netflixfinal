import java.util.Scanner; 
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

public class netflix implements Serializable{
    public static void main(String[] args){
        Scanner input1 = new Scanner(System.in);
        int c1;
        System.out.println("Welcome to the Netflix Database \n");
        System.out.println("Are you a USER or ADMIN? ");
        System.out.println("(1) USER");
        System.out.println("(2) ADMIN");
        c1 = input1.nextInt();

        if (c1 == 1) {
            System.out.println("Hi User! \n");

            String userNameU = "user123";
            String passWordU = "123";

            Scanner uUInput = new Scanner(System.in);
            System.out.println("Username: ");
            String userU = uUInput.nextLine();

            Scanner pUInput = new Scanner(System.in);
            System.out.println("Password: ");
            String passU = pUInput.nextLine();

            if (userU.equals(userNameU) && passU.equals(passWordU)) {
                System.out.println("Successful Login \n");

                Scanner input3 = new Scanner(System.in);
                int c3;
                System.out.println("Would you like to use a Loaded or New Database?");
                System.out.println("(1) LOADED");
                System.out.println("(2) NEW");
                if (c3 == 1) {
                    try {
                        FileInputStream fileIn = new FileInputStream("output.txt");
                        ObjectInputStream in = new ObjectInputStream(fileIn);
                        a.bst = (netflixBST) in.readObject();
                        a.hash = (netflixHash) in.readObject();
                        a.heap = (netflixHeap) in.readObject();
                        a = (Database) in.readObject();
                        in.close();
                        fileIn.close();
                    }
                    catch(IOException i) {
                        i.printStackTrace();
                    }
                    catch(ClassNotFoundException j) {
                        j.printStackTrace();
                    }
                    System.out.println("Database Restored");
                    System.out.println();

                    Scanner input2 = new Scanner(System.in);
                    int c2;
                    System.out.println("Choose an action below: \n");
                    System.out.println("(1) Access Movie(by ReleaseDate)");
                    System.out.println("(2) Access Movie(by ID)");
                    System.out.println("(3) Access Wish List");
                    System.out.println("(4) Search Movie ID");
                    System.out.println("(5) Return to Login");
                    System.out.println("(6) Quit"); //save info
                    System.out.println("Choice?");
                    c2 = input2.nextInt();
                }
                    // if (c2 == 1) {
                    //     Scanner rdInput = new Scanner(System.in);
                    //     System.out.println("Input Realease Date: ");
                    //     string rdIn = rdInput.nextline();
                    //     a.search(rdIn);
                    // }
                    // else if (c2 == 2) {

                    // }
                    // else if (c2 == 3) {
                    //     wishListQueue a = new wishListQueue();
                    // }
                    // else if (c2 == 4) {

                    // }
                    // else if (c2 == 5) {
                    //         netflix.main(args);
                    // }
                //     else if (c2 == 6) {
                //         try {
                //             FileOutputStream fileOut = new FileOutputStream("output.txt");
                //             ObjectOutputStream out = new ObjectOutputStream(fileOut);
                //             out.writeObject(a.netflixBST);
                //             out.writeObject(a.netflixHash);
                //             out.writeObject(a.netflixHeap);
                //             out.writeObject(a);
                //             out.close();
                //             fileOut.close();
                //             System.out.println("Serialized object successfully in output.txt");
                //             }
                //         catch(IOException i) {
                //                 i.printStackTrace();
                //             }
                //     }
                //     else {
                //         System.out.println("Invalid Input");
                //     }
                // }
            }

                else if (c3 == 2){
                    Scanner input2 = new Scanner(System.in);
                    int c2;
                    System.out.println("Choose an action below: \n");
                    System.out.println("(1) Access Movie(by ReleaseDate)");
                    System.out.println("(2) Access Movie(by ID)");
                    System.out.println("(3) Access Wish List");
                    System.out.println("(4) Search Movie ID");
                    System.out.println("(5) Return to Login");
                    System.out.println("(6) Quit"); //save info
                    System.out.println("Choice?");
                    c2 = input2.nextInt();

                    // if (c2 == 1) {
                    //     Scanner rdInput = new Scanner(System.in);
                    //     System.out.println("Input Realease Date: ");
                    //     string rdIn = rdInput.nextline();
                    //     a.search(rdIn);
                    // }
                    // else if (c2 == 2) {

                    // }
                    // else if (c2 == 3) {
                    //     wishListQueue a = new wishListQueue();
                    // }
                    // else if (c2 == 4) {

                    // }
                    // else if (c2 == 5) {
                    //         netflix.main(args);
                    // }
                    // else if (c2 == 6) {
                    //     try {
                    //         FileOutputStream fileOut = new FileOutputStream("output.txt");
                    //         ObjectOutputStream out = new ObjectOutputStream(fileOut);
                    //         out.writeObject(a.netflixBST);
                    //         out.writeObject(a.netflixHash);
                    //         out.writeObject(a.netflixHeap);
                    //         out.writeObject(a);
                    //         out.close();
                    //         fileOut.close();
                    //         System.out.println("Serialized object successfully in output.txt");
                    //     }
                    //     catch(IOException i) {
                    //             i.printStackTrace();
                    //     }
                    // }
                    // else {
                    //     System.out.println("Invalid Input");
                    // }
                // }
                // else {
                //     System.out.println("Error");
                 }

            else if (userU.equals(userNameU)) {
                System.out.println("Invalid password");
                netflix.main(args);
            } 
            else if (passU.equals(passWordU)) {
                System.out.println("Invalid username");
                netflix.main(args);
            } 
            else {
                System.out.println("Invalid username and password");
                netflix.main(args);
            }
        }
        
        else if (c1 == 2) {
            System.out.println("Hi Admin! \n");

            String userNameA = "admin321";
            String passWordA = "321";

            Scanner uAInput = new Scanner(System.in);
            System.out.println("Username: ");
            String userA = uAInput.nextLine();

            Scanner pAInput = new Scanner(System.in);
            System.out.println("Password: ");
            String passA = pAInput.nextLine();

            if (userA.equals(userNameA) && passA.equals(passWordA)) {
                System.out.println("Successful Login \n");

                Scanner  input2 = new Scanner(System.in);
                int c2;
                System.out.println("Choose an action below: \n");
                System.out.println("(1) Access least rated movie");
                System.out.println("(2) Access Customer Info");
                System.out.println("(3) Access Wish list");
                System.out.println("(4) Return to Login");
                System.out.println("Choice?: ");
                c2 = input2.nextInt();

                // if (c2 == 1) {

                // }
                // else if (c2 == 2) {
                //     netflixHash a = new netflixHash();
                //     Scanner input3 = new Scanner(System.in); 
                //     a.lookUp(6789);
                // }
                // else if (c2 == 3) {

                // }
                // else if (c2 == 4) {
                    //netflix.main(args);
                // }
                // else() {
                //     System.out.println("Invalid Input");
                // }
            }
            else if (userA.equals(userNameA)) {
                System.out.println("Invalid password");
                netflix.main(args);
            } 
            else if (passA.equals(passWordA)) {
                System.out.println("Invalid username");
                netflix.main(args);
            } 
            else {
                System.out.println("Invalid username and password");
                netflix.main(args);
            }
        }

        else {
            System.out.println("Invalid Input, you will be redirected to login screen.");
            netflix.main(args);
        }

//final closing 
    }
}