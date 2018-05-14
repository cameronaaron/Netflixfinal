import java.io.*;
import java.util.Scanner;

public class netflix2 {
    public movieNode zNode;
    public static void main(String[] args){

        netflixBST bst = new netflixBST();
        netflixHeap heap = new netflixHeap();
        netflixHash hash = new netflixHash();
        wishList wish = new wishList();

        movieNode mov1 = new movieNode("Black Panther", 20180216, 96);
        movieNode mov2 = new movieNode("Avengers: Infinity War", 20180427, 84);
        movieNode mov3 = new movieNode("Pacific Rim: Uprising", 20180323, 43);

        // customerNode xNode = new customerNode("Jane","Jane@gmail.com", 123456789);

        bst.insert(mov1);
        bst.insertID(mov1);
        heap.insert(mov1);
        bst.insert(mov2);
        bst.insertID(mov2);
        heap.insert(mov2);
        bst.insert(mov3);
        bst.insertID(mov3);
        heap.insert(mov3);

        //hash.insert(xNode);

        Scanner input1 = new Scanner(System.in);
        int c1;
        System.out.println("Welcome to the Netflix Database \n");
        System.out.println("Are you a USER or ADMIN? ");
        System.out.println("(1) USER");
        System.out.println("(2) ADMIN");
        c1 = input1.nextInt();

        if (c1 == 1) {
            System.out.println("Hi! Are you a:");
            System.out.println("(1) New User");
            System.out.println("(2) Returning User");

            Scanner input2 = new Scanner(System.in);
            int c2;
            c2 = input2.nextInt();

            if (c2 == 1) {
                System.out.println("Hello New User!");

                System.out.println("Please Input your Name:");
                Scanner input3 = new Scanner(System.in);
                String c3;
                c3 = input3.nextLine();


                System.out.println("Please Input your Credit Card Number:");
                Scanner input4 = new Scanner(System.in);
                int c4;
                c4 = input4.nextInt();


                System.out.println("Please Input your Email Address: ");
                Scanner input5 = new Scanner(System.in);
                String c5;
                c5 = input5.nextLine();

                customerNode yNode = new customerNode(c3, c5, c4);
                hash.insert(yNode);

                System.out.println("Here is your info!");
                System.out.println(yNode.getName());
                System.out.println(yNode.getCCN());
                System.out.println(yNode.getEmail());


                //s for customerNode
                try {
                    FileOutputStream fileOut = new FileOutputStream("User.txt");
                    ObjectOutputStream out = new ObjectOutputStream(fileOut);
                    out.writeObject(hash);
                    out.close();
                    fileOut.close();
                    System.out.println("Your file has been serialized!");
                } catch (IOException i) {
                    i.printStackTrace();
                }


                System.out.println("Choose an action below: \n");
                System.out.println("(1) Add movie");
                System.out.println("(2) Access Movie(by ID)");
                System.out.println("(3) Access Wish List");
                System.out.println("(4) Print to Screen All Movies in Order of Release Date");
                System.out.println("(5) Go back");
                System.out.println("(6) Quit");
                System.out.println("(7) Access Movie (by Release Date)");


                Scanner inM1 = new Scanner(System.in);
                int m1;
                m1 = inM1.nextInt();

                if (m1 == 1) {
                    //if serialization doesnt work then add the heap serialization
                    System.out.println("Input Movie Title: ");
                    Scanner input20 = new Scanner(System.in);
                    String c20;
                    c20 = input20.nextLine();

                    System.out.println("Input Release Date: ");
                    Scanner input21 = new Scanner(System.in);
                    int c21;
                    c21 = input21.nextInt();

                    System.out.println("Input Popularity Score: ");
                    Scanner input22 = new Scanner(System.in);
                    int c22;
                    c22 = input22.nextInt();

                    movieNode zNode = new movieNode(c20, c21, c22);
                    bst.insert(zNode);
                    bst.insertID(zNode);
                    heap.insert(zNode);

                    System.out.println("Here is your info!");
                    System.out.println(zNode.getTitle());
                    System.out.println(zNode.getRDate());
                    System.out.println(zNode.getPopScore());

                    //s for movieNode
                    try {
                        FileOutputStream fileOut = new FileOutputStream("moviesBST.txt");
                        ObjectOutputStream out = new ObjectOutputStream(fileOut);
                        out.writeObject(bst);
                        out.close();
                        fileOut.close();
                        System.out.println("Your file has been serialized!");
                    } catch (IOException i) {
                        i.printStackTrace();
                    }

                    try {
                        FileOutputStream fileOut = new FileOutputStream("moviesHeap.txt");
                        ObjectOutputStream out = new ObjectOutputStream(fileOut);
                        out.writeObject(heap);
                        out.close();
                        fileOut.close();
                        System.out.println("Your file has been serialized!");
                    } catch (IOException i) {
                        i.printStackTrace();
                    }
                    // try{
                    //     FileInputStream fileOut = new FileInputStream("Heap.txt");
                    //     ObjectInputStream out = new ObjectInputStream(fileOut);
                    //     heap = (netflixHeap) in.readObject();
                    //     bst = (netflixBST) in.readObject();
                    //     bst.search(zNode.getRDate());
                    //     in.close();
                    //     fileIn.close();
                    //    // return heap;
                    // }
                    // catch(IOException i){
                    //     i.printStackTrace();
                    //   //  return null;
                    // }
                    // catch(ClassNotFoundException c) {
                    //     System.out.println("Error: Class not found");
                    //     c.printStackTrace();
                    //    // return null;
                    // }
                } else if (m1 == 2) {
                    System.out.println("Enter ID: ");
                    Scanner uInput = new Scanner(System.in);
                    int i;

                    i = uInput.nextInt();
                    System.out.println("The movie with ID " + i + " is: ");

                    //d for movieNode for search by ID
                    try {
                        FileInputStream fileIn = new FileInputStream("moviesBST.txt");
                        ObjectInputStream in = new ObjectInputStream(fileIn);
                        //heap = (netflixHeap) in.readObject();
                        bst = (netflixBST) in.readObject();
                        System.out.println(bst.searchID(i).getTitle());
                        //System.out.println(heap.findMin().getTitle);

                        in.close();
                        fileIn.close();
                        // return heap;
                    } catch (IOException w) {
                        w.printStackTrace();
                        //  return null;
                    } catch (ClassNotFoundException c) {
                        System.out.println("Error: Class not found");
                        c.printStackTrace();
                        // return null;
                    }
                } else if (m1 == 3) {
                    System.out.println("Access to WishList, Would you Like to:");
                    System.out.println("(1) Add to WishList");
                    System.out.println("(2) Access Next Movie");

                    Scanner inM2 = new Scanner(System.in);
                    int m2;
                    m2 = inM2.nextInt();

                    if (m2 == 1) {
                        System.out.println("Adding a New Movie!");

                        System.out.println("Please Input Title of movie:");
                        Scanner input8 = new Scanner(System.in);
                        String c8;
                        c8 = input8.nextLine();

                        System.out.println("Please Input Release Date of movie:");
                        Scanner input9 = new Scanner(System.in);
                        int c9;
                        c9 = input9.nextInt();

                        System.out.println("Please Input the Popularity Score:");
                        Scanner input10 = new Scanner(System.in);
                        int c10;
                        c10 = input10.nextInt();

                        movieNode mov4 = new movieNode(c8, c9, c10);

                        bst.insert(mov4);
                        bst.insertID(mov4);
                        heap.insert(mov4);
                    } else {
                        //Acess to Next Movie
                    }
                } else if (m1 == 4) {
                    //Print to Screen all Movies based on Release Date
                    bst.traverse();
                } else if (m1 == 5) {
                    //Go Back
                    System.out.println("Choose an action below: \n");
                    System.out.println("(1) Access Movie (by Release Date)");
                    System.out.println("(2) Access Movie(by ID)");
                    System.out.println("(3) Access Wish List");
                    System.out.println("(4) Print to Screen All Movies in Order of Release Date");
                    System.out.println("(5) Go back");
                    System.out.println("(6) Quit");

                    Scanner input67 = new Scanner(System.in);
                    int c67;
                    c67 = input67.nextInt();
                } else if (m1 == 7) {
                    System.out.println("Enter Release Date:");
                    Scanner uInput = new Scanner(System.in);
                    int i;

                    i = uInput.nextInt();
                    System.out.println("The movie with release date " + i + " is: ");
                    System.out.println(bst.search(i).getTitle());

                    try {
                        FileInputStream fileIn = new FileInputStream("moviesBST.txt");
                        ObjectInputStream in = new ObjectInputStream(fileIn);
                        //heap = (netflixHeap) in.readObject();
                        bst = (netflixBST) in.readObject();
                        //System.out.println(bst.searchID(i).getTitle());
                        System.out.println(bst.search(i).getTitle());

                        in.close();
                        fileIn.close();
                        // return heap;
                    } catch (IOException w) {
                        w.printStackTrace();
                        //  return null;
                    } catch (ClassNotFoundException c) {
                        System.out.println("Error: Class not found");
                        c.printStackTrace();
                        // return null;
                    }


                } else {
                    System.out.println("Invaild Input. Please Try Again!");

                    //yes i know its in the wrong place

                }

            } else if (c2 == 2) {
                System.out.println("Hello Returning User!");
                System.out.println("Please Input your last 8 digits of Credit Card Number:");

                Scanner CCNInput = new Scanner(System.in);
                int ccn;
                ccn = CCNInput.nextInt();
                //hash = null;
                //d for customerNode
                try {
                    FileInputStream fileIn = new FileInputStream("User.txt");
                    ObjectInputStream in = new ObjectInputStream(fileIn);
                    hash = (netflixHash) in.readObject();
                    hash.printHashTable();
                    System.out.println(hash.lookUp(ccn).getName());

                    in.close();
                    fileIn.close();
                    //return hash;
                } catch (IOException i) {
                    i.printStackTrace();
                    // return null;
                } catch (ClassNotFoundException c) {
                    System.out.println("Error: Class not found");
                    c.printStackTrace();
                    // return null;
                }

                System.out.println("Choose an action below: \n");
                System.out.println("(1) Add movie");
                System.out.println("(2) Access Movie(by ID)");
                System.out.println("(3) Access Wish List");
                System.out.println("(4) Print to Screen All Movies in Order of Release Date");
                System.out.println("(5) Go back");
                System.out.println("(6) Quit");
                System.out.println("(7) Access Movie (by Release Date)");


                Scanner inM1 = new Scanner(System.in);
                int m1;
                m1 = inM1.nextInt();

                if (m1 == 1) {
                    //if serialization doesnt work then add the heap serialization
                    System.out.println("Input Movie Title: ");
                    Scanner input20 = new Scanner(System.in);
                    String c20;
                    c20 = input20.nextLine();

                    System.out.println("Input Release Date: ");
                    Scanner input21 = new Scanner(System.in);
                    int c21;
                    c21 = input21.nextInt();

                    System.out.println("Input Popularity Score: ");
                    Scanner input22 = new Scanner(System.in);
                    int c22;
                    c22 = input22.nextInt();

                    movieNode zNode = new movieNode(c20, c21, c22);
                    bst.insert(zNode);
                    bst.insertID(zNode);
                    heap.insert(zNode);

                    System.out.println("Here is your info!");
                    System.out.println(zNode.getTitle());
                    System.out.println(zNode.getRDate());
                    System.out.println(zNode.getPopScore());

                    //s for movieNode
                    try {
                        FileOutputStream fileOut = new FileOutputStream("moviesBST.txt");
                        ObjectOutputStream out = new ObjectOutputStream(fileOut);
                        out.writeObject(bst);
                        out.close();
                        fileOut.close();
                        System.out.println("Your file has been serialized!");
                    } catch (IOException i) {
                        i.printStackTrace();
                    }

                    try {
                        FileOutputStream fileOut = new FileOutputStream("moviesHeap.txt");
                        ObjectOutputStream out = new ObjectOutputStream(fileOut);
                        out.writeObject(heap);
                        out.close();
                        fileOut.close();
                        System.out.println("Your file has been serialized!");
                    } catch (IOException i) {
                        i.printStackTrace();
                    }
                } else if (m1 == 2) {
                    System.out.println("Enter ID: ");
                    Scanner uInput = new Scanner(System.in);
                    int i;

                    i = uInput.nextInt();
                    System.out.println("The movie with ID " + i + " is: ");

                    //d for movieNode for search by ID
                    try {
                        FileInputStream fileIn = new FileInputStream("moviesBST.txt");
                        ObjectInputStream in = new ObjectInputStream(fileIn);
                        //heap = (netflixHeap) in.readObject();
                        bst = (netflixBST) in.readObject();
                        System.out.println(bst.searchID(i).getTitle());
                        //System.out.println(heap.findMin().getTitle);

                        in.close();
                        fileIn.close();
                        // return heap;
                    } catch (IOException w) {
                        w.printStackTrace();
                        //  return null;
                    } catch (ClassNotFoundException c) {
                        System.out.println("Error: Class not found");
                        c.printStackTrace();
                        // return null;
                    }
                } else if (m1 == 3) {
                    System.out.println("Access to WishList, Would you Like to:");
                    System.out.println("(1) Add to WishList");
                    System.out.println("(2) Access Next Movie");

                    Scanner inM2 = new Scanner(System.in);
                    int m2;
                    m2 = inM2.nextInt();

                    if (m2 == 1) {
                        System.out.println("Adding a New Movie!");

                        System.out.println("Please Input Title of movie:");
                        Scanner input8 = new Scanner(System.in);
                        String c8;
                        c8 = input8.nextLine();

                        System.out.println("Please Input Release Date of movie:");
                        Scanner input9 = new Scanner(System.in);
                        int c9;
                        c9 = input9.nextInt();

                        System.out.println("Please Input the Popularity Score:");
                        Scanner input10 = new Scanner(System.in);
                        int c10;
                        c10 = input10.nextInt();

                        movieNode mov4 = new movieNode(c8, c9, c10);

                        bst.insert(mov4);
                        bst.insertID(mov4);
                        heap.insert(mov4);
                    } else {
                        //Acess to Next Movie
                    }
                } else if (m1 == 4) {
                    //Print to Screen all Movies based on Release Date
                    bst.traverse();
                } else if (m1 == 5) {
                    //Go Back
                    System.out.println("Choose an action below: \n");
                    System.out.println("(1) Access Movie (by Release Date)");
                    System.out.println("(2) Access Movie(by ID)");
                    System.out.println("(3) Access Wish List");
                    System.out.println("(4) Print to Screen All Movies in Order of Release Date");
                    System.out.println("(5) Go back");
                    System.out.println("(6) Quit");

                    Scanner input67 = new Scanner(System.in);
                    int c67;
                    c67 = input67.nextInt();
                } else if (m1 == 7) {
                    System.out.println("Enter Release Date:");
                    Scanner uInput = new Scanner(System.in);
                    int i;

                    i = uInput.nextInt();

                    //System.out.println(bst.search(i).getTitle());

                    try {
                        FileInputStream fileIn = new FileInputStream("moviesBST.txt");
                        ObjectInputStream in = new ObjectInputStream(fileIn);
                        //heap = (netflixHeap) in.readObject();
                        bst = (netflixBST) in.readObject();
                        //System.out.println(bst.searchID(i).getTitle());
                        System.out.println(bst.search(i).getTitle());
                        System.out.println("The movie with release date " + i + " is: ");
                        in.close();
                        fileIn.close();
                        // return heap;
                    } catch (IOException w) {
                        w.printStackTrace();
                        //  return null;
                    } catch (ClassNotFoundException c) {
                        System.out.println("Error: Class not found");
                        c.printStackTrace();
                        // return null;
                    }
                } else {
                    System.out.println("Invaild Input. Please Try Again!");

                    //yes i know its in the wrong place

                }

            } else {
                System.out.println("Error");
            }
        } else if (c1 == 2) {
            System.out.println("Hi Admin! \n");

            String userNameA = "admin321";
            String passWordA = "321";

            Scanner uAInput = new Scanner(System.in);
            System.out.println("Username: ");
            String userA = uAInput.nextLine();

            Scanner pAInput = new Scanner(System.in);
            System.out.println("Password: ");
            String passA = pAInput.nextLine();

            if (userA.equals(userNameA) && passA.equals(passWordA)){
                System.out.println("Successfull Login \n");

                Scanner input11 = new Scanner(System.in);
                int c11;

                System.out.println("Choose an action below: \n");
                System.out.println("(1) Access to Customer Info");
                System.out.println("(2) See least Rated Movie");
                System.out.println("(3) Print all movies in order of release date");
                System.out.println("(4) Go back");
                Scanner inM3 = new Scanner(System.in);
                int m3;
                m3 = inM3.nextInt();

                if (m3 == 1) {
                    //Acess to Customer Info
                    Scanner keyInput = new Scanner(System.in);
                    System.out.println("Enter key: ");
                    int k = keyInput.nextInt();
                    System.out.println(hash.lookUp(k).getName());
                    System.out.println(hash.lookUp(k).getEmail());
                    System.out.println(hash.lookUp(k).getCCN());
                } else if (m3 == 2) {
                    System.out.println("The least Rated Movie is:");
                    System.out.println(heap.findMin().getTitle());

                    System.out.println("Would you like to Delete it?");
                    System.out.println("(1) Yes");
                    System.out.println("(2) No");

                    Scanner input12 = new Scanner(System.in);
                    int c12;
                    c12 = input12.nextInt();

                    if (c12 == 1) {
                        //Delete Movie
                        heap.deleteMin();
                    } else if (c12 == 2) {
                        //Dont Delete
                        System.out.println("Will not Delete Movie");
                    }
                } else if (m3 == 3) {
                    bst.traverse();
                } else if (m3 == 4) {
                    //Go back
                    // Scanner input11 = new Scanner(System.in);
                    // int c11;

                    System.out.println("Choose an action below: \n");
                    System.out.println("(1) Access to Customer Info");
                    System.out.println("(2) See least Rated Movie");
                    System.out.println("(3) Print all movies in order of release date");
                    System.out.println("(4) Go back");
                    c11 = input11.nextInt();
                } else {
                    System.out.println("Invalid Input. Please Try Again!");

                }
            } else if (userA.equals(userNameA)) {
                System.out.println("Invalid password");
                netflix2.main(args);
            } else if (passA.equals(passWordA)) {
                System.out.println("Invalid username");
                netflix2.main(args);
            } else {
                System.out.println("Invalid username and password");
                netflix2.main(args);
            }
        } else {
            System.out.println("Invalid Input. Please Try Again!");
        }
    }
}