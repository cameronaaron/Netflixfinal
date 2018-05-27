/* Programners: Alex Saucedo, Nelia Arnaud, Michele Davila, Cameron Aaron
   Date: May 16, 2018
   Final Prject
*/

   
//imported java packages(scanner used to identify user import and * import serelization) 
import java.util.Scanner; 
import java.io.*;
import java.util.InputMismatchException;
// created a class named netflix
// made the class serializable
public class netflix implements Serializable {
    // globalized variable node 
    public movieNode zNode;
    // created a mian 
    public static void main(String[] args){
        // while loop for the quit option 
        boolean quit = true;
        while(quit == true){
            // creating instant variables for data structures 
            netflixBST bst = new netflixBST();
            netflixHeap heap = new netflixHeap();
            netflixHash hash = new netflixHash();
            //wishList wish = new wishList();
// a list of movies that we inputed for the user
            movieNode mov1 = new movieNode("Black Panther",20180216, 96, true);
            movieNode mov2 = new movieNode("Avengers: Infinity War", 20180427, 84, true);
            movieNode mov3 = new movieNode("Pacific Rim: Uprising", 20180323, 43, true);
            movieNode mov26 = new movieNode("A Quiet Place", 20180406, 95,true);
            movieNode mov5 = new movieNode("Dunkirk", 20170721, 92,true);
            movieNode mov6 = new movieNode("Coco", 20171122, 97,true);
            movieNode mov7 = new movieNode("Moana", 20161123, 96,true);
            movieNode mov8 = new movieNode("Goal!", 20060512, 44,true);
            movieNode mov9 = new movieNode("Ferris Bueller's Day Off", 19860611, 81,true);

            movieNode mov10 = new movieNode("Four Brothers", 20050822, 52,true);
            movieNode mov11 = new movieNode("Titanic", 19971219, 88,true);
            movieNode mov12 = new movieNode("The Wizard of Oz", 19390825, 99,true);
            movieNode mov13 = new movieNode("The Conjuring", 20130719, 86,true);
            movieNode mov14 = new movieNode("Insidious", 20140914, 65,true);
            movieNode mov15 = new movieNode("The Notebook", 20040625, 52,true);
            movieNode mov16 = new movieNode("101 Dalmations", 19610125, 98,true);
            movieNode mov17 = new movieNode("Madea Goes to Jail", 20090216, 28,true);

            movieNode mov18 = new movieNode("Get Out", 20170224, 99,true);
            movieNode mov19 = new movieNode("Cult of Chucky", 20171020, 82,true);
            movieNode mov20 = new movieNode("The Spongebob Squarepants Movie", 11142004, 66,true);
            movieNode mov21 = new movieNode("Home Alone 2", 19921120, 30,true);
            movieNode mov22 = new movieNode("The Shape of Water", 20180313, 92,true);
            movieNode mov23 = new movieNode("Fifty Shades Freed", 20180209, 13,true);
            movieNode mov24 = new movieNode("Camp Rock", 20080620, 20,true);
            movieNode mov25 = new movieNode("House of Wax", 20050626, 25,true);

            //inserted movies 
            bst.insert(mov1);
            bst.insertID(mov1);
            heap.insert(mov1);
            bst.insert(mov2);
            bst.insertID(mov2);
            heap.insert(mov2);
            bst.insert(mov3);
            bst.insertID(mov3);
            heap.insert(mov3);
            bst.insert(mov26);
            bst.insertID(mov26);
            heap.insert(mov26);
            bst.insert(mov5);
            bst.insertID(mov5);
            heap.insert(mov5);
            bst.insert(mov6);
            bst.insertID(mov6);
            heap.insert(mov6);
            bst.insert(mov7);
            bst.insertID(mov7);
            heap.insert(mov7);
            bst.insert(mov8);
            bst.insertID(mov8);
            heap.insert(mov8);
            bst.insert(mov9);
            bst.insertID(mov9);
            heap.insert(mov9);
            bst.insert(mov10);
            bst.insertID(mov10);
            heap.insert(mov10);
            bst.insert(mov11);
            bst.insertID(mov11);
            heap.insert(mov11);
            bst.insert(mov12);
            bst.insertID(mov12);
            heap.insert(mov12);
            bst.insert(mov13);
            bst.insertID(mov13);
            heap.insert(mov13);
            bst.insert(mov14);
            bst.insertID(mov14);
            heap.insert(mov14);
            bst.insert(mov15);
            bst.insertID(mov15);
            heap.insert(mov15);
            bst.insert(mov16);
            bst.insertID(mov16);
            heap.insert(mov16);
            bst.insert(mov17);
            bst.insertID(mov17);
            heap.insert(mov17);
            bst.insert(mov18);
            bst.insertID(mov18);
            heap.insert(mov18);
            bst.insert(mov19);
            bst.insertID(mov19);
            heap.insert(mov19);
            bst.insert(mov20);
            bst.insertID(mov20);
            heap.insert(mov20);
            bst.insert(mov21);
            bst.insertID(mov21);
            heap.insert(mov21);
            bst.insert(mov22);
            bst.insertID(mov22);
            heap.insert(mov22);
            bst.insert(mov23);
            bst.insertID(mov23);
            heap.insert(mov23);
            bst.insert(mov24);
            bst.insertID(mov24);
            heap.insert(mov24);   
            bst.insert(mov25);
            bst.insertID(mov25);
            heap.insert(mov25);

            // while loops to go back to main menu 
            boolean userAdmin = true;
            while(userAdmin == true && quit == true){
                Scanner input1 = new Scanner(System.in);
                //boolean successInput1 = false;
                //while (!successInput1) {
                    //try {
                // intro to the program
                    System.out.println("Welcome to the MAN-C Database \n");
                    System.out.println();
                    // first options for the program(intro)
                    System.out.println("Are you a USER or ADMIN? ");
                    System.out.println();
                    System.out.println("(1) USER");
                    System.out.println("(2) ADMIN");
                    System.out.println("(3) Quit");
                    int c1 = input1.nextInt();
                    // options for menu
                    if (c1==1){
                    boolean userMenu = true;
                    while (userMenu == true && quit == true){
                        Scanner input2 = new Scanner(System.in);
                        System.out.println();
                        System.out.println("Hi! Are you a:");
                        System.out.println();
                        System.out.println("(1) New User");
                        System.out.println("(2) Returning User");
                        System.out.println("(3) Return to Main Menu");
                        int c2 = input2.nextInt();
                    // options for user 
                            if (c2 == 1) {
                            boolean userMenu2 = true;
                            while(quit == true && userMenu == true && userMenu2 == true){
                                System.out.println();
                                System.out.println("Hello New User!");
                                System.out.println();

                                System.out.println("Please Input your Name:");
                                Scanner input3 = new Scanner(System.in);
                                String c3;
                                c3 = input3.nextLine();
                            
                                System.out.println();
                                
                                Scanner input4 = new Scanner(System.in);
                                System.out.println("Please Input your Credit Card Number (8 numbers): ");
                                int c4 = input4.nextInt();
                           
                                System.out.println();
                                System.out.println("Please Input your Email Address: ");
                               
                                Scanner input5 = new Scanner(System.in);
                                String c5;
                                c5 = input5.nextLine();

                                customerNode yNode = new customerNode(c3, c5, c4);
                                hash.insert(yNode);
                                System.out.println();
                                System.out.println("In Our Records:");
                                System.out.println();
                                System.out.println("Your Name is: " + yNode.getName());
                                System.out.println("Your Credit Card Number is: " + yNode.getCCN());
                                System.out.println("Your Email is: " + yNode.getEmail());
                                //serializable
                                try {
                                    FileOutputStream fileOut = new FileOutputStream("User.txt");
                                    ObjectOutputStream out = new ObjectOutputStream(fileOut);
                                    out.writeObject(hash);
                                    out.close();
                                    fileOut.close();
                                    System.out.println();
                                    System.out.println("Your file has been serialized!");
                                }
                                catch(IOException i) {
                                    i.printStackTrace();
                                }
                                    boolean newUser2 = true;
                                    while(newUser2 == true && quit == true && userMenu == true && userMenu2 == true){
                                        Scanner inM1 = new Scanner(System.in);
                                        //more options for the user you can access a movie, wishlist, print all movies,go back to menu,and quit
                                        System.out.println();
                                        System.out.println("Choose an action below: \n");
                                        System.out.println();
                                        System.out.println("(1) Access Movie(by ID)");
                                        System.out.println("(2) Access Wish List");
                                        System.out.println("(3) Access Movie (by Release Date)");
                                        System.out.println("(4) Print to Screen All Movies in Order of Release Date");
                                        System.out.println("(5) Go back");
                                        System.out.println("(6) Quit");
                                        int m1 = inM1.nextInt();
                                        //options if you click option 1
                                        // 
                                        if (m1 == 1) {
                                            System.out.println("Enter ID(5 Last #s of Release Date): ");
                                            Scanner uInput = new Scanner(System.in);
                                            int i = uInput.nextInt();
                                            System.out.println("The movie with ID inputed is: " + bst.searchID(i).getTitle());    
                                        }
                                        // options if you click option 3 
                                        else if (m1 == 3) {
                                            System.out.println();
                                            Scanner uInput = new Scanner(System.in);
                                            System.out.println("Enter Release Date: ");
                                            System.out.println();
                                            int i = uInput.nextInt();
                                            System.out.println("The movie with inputed release date is: " + bst.search(i).getTitle());
                                        }
                                        // option if you choose option 2, it allows you to access the wishlist and view the most recent added
                                        else if (m1 == 2) {
                                            boolean userMenu1 = true;
                                            while(userMenu1 == true && quit == true && newUser2 == true){
                                                Scanner inM2 = new Scanner(System.in);
                                                System.out.println("Access to WishList, Would you Like to:");
                                                System.out.println();
                                                System.out.println("(1) Add to WishList");
                                                System.out.println("(2) Recently Added");
                                                System.out.println("(3) Return to User Menu");

                                                int m2 = inM2.nextInt();
                                                // options that allow you to add a new movie by title, release date, and pop score
                                                if (m2 == 1) {
                                                    System.out.println();
                                                    System.out.println("Adding a New Movie!");
                                                    System.out.println();
                                                    System.out.println("Please Input Title of movie:");
                                                    Scanner input8 = new Scanner(System.in);
                                                    String c8;
                                                    c8 = input8.nextLine();
                                                    System.out.println();
                                                    System.out.println("Please Input Release Date of movie:(yyyymmdd)");
                                                    Scanner input9 = new Scanner(System.in);
                                                    int c9;
                                                    c9 = input9.nextInt();
                                                    System.out.println();
                                                    System.out.println("Please Input the Popularity Score:(0-100)");
                                                    Scanner input10 = new Scanner(System.in);
                                                    int c10;
                                                    c10 = input10.nextInt();

                                                    movieNode mov4 = new movieNode(c8, c9, c10, true);

                                                    bst.insert(mov4);
                                                    bst.insertID(mov4);
                                                    heap.insert(mov4);
                                                    //wishList x = new wishList();

                                                    wishList x = yNode.getWishList();
                                                    x.addMovie(mov4);
                                                   // yNode.getWishList().printQueue();
                                                    // serealizable wishlist 
                                                    try {
                                                        FileOutputStream fileOut = new FileOutputStream("moviesWishList.txt");
                                                        ObjectOutputStream out = new ObjectOutputStream(fileOut);
                                                        out.writeObject(x);
                                                        out.close();
                                                        fileOut.close();
                                                        System.out.println();
                                                        System.out.println("Your file has been serialized!");
                                                        }
                                                    catch(IOException i) {
                                                        i.printStackTrace();
                                                    }

                                                }
                                                else if (m2 == 2){
                                                    //deserealizable for wish list 
                                                    try{
                                                        FileInputStream fileIn = new FileInputStream("moviesWishList.txt");
                                                        ObjectInputStream in = new ObjectInputStream(fileIn);
                                                        wishList x = (wishList)  in.readObject();
                                                        System.out.println("Most Recent Movie is:");
                                                        System.out.println(x.front().getTitle());
                                                        in.close();
                                                        fileIn.close();
                                                    }
                                                    catch(IOException w){
                                                        w.printStackTrace();
                                                    } 
                                                    catch(ClassNotFoundException c) {
                                                        System.out.println("Error: Class not found");
                                                        c.printStackTrace();
                                                    }
                                                }
                                                else if (m2 == 3){
                                                    userMenu1 = false;
                                                }
                                                else {
                                                    System.out.println("Please Input a Correct Input");
                                                }
                                            }
                                        }
                                        else if(m1 == 4) {
                                            //Print to Screen all Movies based on Release Date
                                            bst.traverse();
                                        }
                                        //retun to main menu
                                        else if(m1 == 5) {
                                            System.out.println();
                                            System.out.print("Return to main menu");
                                            userMenu2 = false;
                                        }

                                        else if (m1 == 6){
                                            quit = false;
                                        }

                                        else {
                                            System.out.println("Invaild Input. Please Try Again !");
                                        }
                                    } 
                            }      
                        }
                        else if (c2==2) {
                                System.out.println();
                                System.out.println("Hello Returning User!");
                                System.out.println();
                                System.out.println("Please Input your last 4 digits of your Credit Card:");
                                //deserealizable of customer info
                                Scanner CCNInput = new Scanner(System.in);
                                int ccn;
                                ccn = CCNInput.nextInt();
                                //d for customerNode
                                try {
                                    FileInputStream fileIn = new FileInputStream("User.txt");
                                    ObjectInputStream in = new ObjectInputStream(fileIn);
                                    hash = (netflixHash) in.readObject();
                                    hash.printHashTable();
                                    System.out.println(hash.lookUp(ccn).getName());
                            
                                    in.close();
                                    fileIn.close();
                                }
                                catch(IOException i) {
                                    i.printStackTrace();
                                } 
                                catch(ClassNotFoundException c) {
                                    System.out.println("Error: Class not found");
                                    c.printStackTrace();
                                }
                                System.out.println();
                                System.out.println("Welcome Back " + hash.lookUp(ccn).getName());
                                boolean returningUser = true;
                                while(returningUser == true && quit == true){
                                    // ooptions for returning cusotmer 
                                    System.out.println();
                                    System.out.println("Choose an action below: \n");
                                    System.out.println();
                                    System.out.println("(1) Access Movie(by ID(last 5 digits of release date)");
                                    System.out.println("(2) Access Movie (by Release Date)");
                                    System.out.println("(3) Access Wish List");
                                    System.out.println("(4) Print to Screen All Movies in Order of Release Date");
                                    System.out.println("(5) Go back");
                                    System.out.println("(6) Quit");

                                    // scanner for returning user input 
                                    Scanner inM1 = new Scanner(System.in);
                                    int m1;
                                    m1 = inM1.nextInt();
                                    // Options if you choose option 1 that allows you to access a movie by ID
                                    if (m1 == 1) {
                                        System.out.println("Enter ID: ");
                                        Scanner uInput = new Scanner(System.in);
                                        int i;
                                        //prints out the movie accesed by ID
                                        i = uInput.nextInt();
                                        System.out.println("The movie with ID is: " + bst.searchID(i).getTitle());

                                        //d for movieNode for search by ID
                                        //deserealizable for movies
                                        try{
                                            FileInputStream fileIn = new FileInputStream("moviesBST.txt");
                                            ObjectInputStream in = new ObjectInputStream(fileIn);
                                            //heap = (netflixHeap) in.readObject();
                                            bst = (netflixBST) in.readObject();
                                            System.out.println(bst.searchID(i).getTitle());
                                            //System.out.println(heap.findMin().getTitle);

                                            in.close();
                                            fileIn.close();
                                            // return heap;
                                        }
                                        catch(IOException w){
                                            w.printStackTrace();
                                        //  return null;
                                        } 
                                        catch(ClassNotFoundException c) {
                                            System.out.println("Error: Class not found");
                                            c.printStackTrace();
                                            // return null;
                                        }
                                    }
                                    //options if you choose 3 that allows to access the wishlist and lets you add movies to it 
                                    else if (m1 == 3) {
                                        System.out.println();
                                        System.out.println("Access to WishList, Would you Like to:");
                                        System.out.println();
                                        System.out.println("(1) Add to WishList");
                                        //scanner for the users input 

                                        Scanner inM2 = new Scanner(System.in);
                                        int m2;
                                        m2 = inM2.nextInt();
                                        // options if you chooe 1 that allows you to add movies by inputing title,release date, and pop socre 
                                        if (m2 == 1) {
                                            System.out.println();
                                            System.out.println("Adding a New Movie!");
                                            System.out.println();
                                            System.out.println("Please Input Title of movie:");
                                            Scanner input8 = new Scanner(System.in);
                                            String c8;
                                            c8 = input8.nextLine();
                                            System.out.println();
                                            System.out.println("Please Input Release Date of movie:(0-100)");
                                            Scanner input9 = new Scanner(System.in);
                                            int c9;
                                            c9 = input9.nextInt();
                                            System.out.println();
                                            System.out.println("Please Input the Popularity Score:(0-100)");
                                            Scanner input10 = new Scanner(System.in);
                                            int c10;
                                            c10 = input10.nextInt();

                                            movieNode mov4 = new movieNode(c8, c9, c10, true);

                                            bst.insert(mov4);
                                            bst.insertID(mov4);
                                            heap.insert(mov4);
                                        }

                                        else {
                                            System.out.println("Please input a correct value.");
                                        }
                                    }

                                    else if(m1 == 4) {
                                        //Print to Screen all Movies based on Release Date
                                        bst.traverse();
                                    }

                                    else if(m1 == 5) {
                                        //Go Back
                                        returningUser = false;
                                    }

                                    else if (m1 == 6){
                                        quit = false;
                                    }

                                    else if(m1 == 2) {
                                        System.out.println();
                                        System.out.println("Enter Release Date: ");
                                        System.out.println();
                                        Scanner uInput = new Scanner(System.in);
                                        int i;

                                        i = uInput.nextInt();
                                        System.out.println("The movie with inputed release date is: " + bst.search(i).getTitle());
                                    }
                                }
                        }

                        else if (c2 == 3) {
                            userMenu = false;
                        }

                        else {
                            System.out.println("Invaild Input. Please Try Again!");
                        } 
                    }
                }

                else if(c1 == 2) {
                        // welcomes Admin 
                        System.out.println("Hi Admin! \n");
                        // sets the info for the admins login 
                        String userNameA = "admin321";
                        String passWordA = "321";
                        // scanner for admin's input 
                        Scanner uAInput = new Scanner(System.in);
                        System.out.println("Username: ");
                        String userA = uAInput.nextLine();
     
                        Scanner pAInput = new Scanner(System.in);
                        System.out.println("Password: ");
                        String passA = pAInput.nextLine();

                        if (userA.equals(userNameA) && passA.equals(passWordA) && quit == true){
                            System.out.println("Successfull Login \n");
                            boolean admin = true;
                            while (admin == true && quit == true){
                            Scanner input11 = new Scanner(System.in);
                            int c11;
                            // options for admin
                            System.out.println();
                            System.out.println("Choose an action below: \n");
                            System.out.println();
                            System.out.println("(1) Access to Customer Info");
                            System.out.println("(2) See least Rated Movie");
                            System.out.println("(3) Add Movie to MAN-C Database");
                            System.out.println("(4) Print to Screen All Movies");
                            System.out.println("(5) Go back");
                            System.out.println("(6) Quit Program");
                            //scanner for admin input 
                            Scanner inM3 = new Scanner(System.in);
                            int m3;
                            m3 = inM3.nextInt();
                            //options if admin chooses 1, it will allow the admin to access customer info 
                            if (m3 == 1){
                                //Acess to Customer Info
                                Scanner keyInput = new Scanner(System.in);
                                System.out.println();
                                System.out.println("Enter last 4 digits of Customer's CCN: ");
                                int k = keyInput.nextInt();
                                //deserealizable of customer info
                                try {
                                    FileInputStream fileIn = new FileInputStream("User.txt");
                                    ObjectInputStream in = new ObjectInputStream(fileIn);
                                    hash = (netflixHash) in.readObject();
                                    hash.printHashTable();
                                    in.close();
                                    fileIn.close();
                                }
                                catch(IOException i) {
                                    i.printStackTrace();
                                } 
                                catch(ClassNotFoundException c) {
                                    System.out.println("Error: Class not found");
                                    c.printStackTrace();
                                }
                                System.out.println();
                                System.out.println(hash.lookUp(k).getName());
                                System.out.println(hash.lookUp(k).getEmail());
                                System.out.println(hash.lookUp(k).getCCN());
                            }   
                            //options if the admin chooses 2, allows you to access customer 
                            else if(m3 == 2){
                                System.out.println("Input Customer's CCN Info: ");
                                Scanner ccnInput = new Scanner(System.in);
                                int ccn;
                                ccn = ccnInput.nextInt();
                                // prints out least rated movie and gives you the option to delete or not 
                                System.out.println();
                                System.out.println("The least Rated Movie is:");
                                System.out.println(heap.findMin().getTitle());
                                System.out.println();
                                System.out.println("Would you like to Delete it?");
                                System.out.println();
                                System.out.println("(1) Yes");
                                System.out.println("(2) No");

                                Scanner input12 = new Scanner(System.in);
                                int c12;
                                c12 = input12.nextInt();
                                // lets you know that you deleted a movie successfully
                                if(c12 == 1) {
                                    //Delete Movie
                                    heap.deleteMin();
                                    System.out.println("Movie Successfully Deleted");
                                }

                                else if (c12 == 2) {
                                    //Dont Delete
                                    System.out.println();
                                    System.out.println("Will not Delete Movie");
                                }
                            }
                            //options if the admin chooses 3, it let the admin add a movie to the database
                            else if (m3 == 3) {
                                    System.out.println();
                                    System.out.println("Input Movie Title: ");
                                    Scanner input20 = new Scanner(System.in);
                                    String c20;
                                    c20 = input20.nextLine();
                                    System.out.println();
                                    System.out.println("Input Release Date:(yyyymmdd) ");
                                    Scanner input21 = new Scanner(System.in);
                                    int c21;
                                    c21 = input21.nextInt();
                                    System.out.println();
                                    System.out.println("Input Popularity Score:(0-100) ");
                                    Scanner input22 = new Scanner(System.in);
                                    int c22;
                                    c22 = input22.nextInt();
                                    System.out.println();
                                    movieNode zNode = new movieNode(c20, c21, c22, true);
                                    bst.insert(zNode);
                                    bst.insertID(zNode);
                                    heap.insert(zNode);
                                    System.out.println();
                                    System.out.println("In our Records");
                                    System.out.println("The Movie's Title is:" + zNode.getTitle());
                                    System.out.println("The Movie's Release Date is: " + zNode.getRDate());
                                    System.out.println("The MOvie's Pop Score:" + zNode.getPopScore());
                            }

                            else if(m3 ==4) {
                                //Print to Screen all Movies based on Release Date
                                bst.traverse();
                            }

                            else if(m3 ==5) {
                                admin = false;
                            }

                            else if(m3 == 6) {
                                quit = false;
                            } 

                            else {
                                System.out.println("Invalid Input. Please Try Again Data Structure Expert!");
                            }
                        }
                        }
                        // messages if the login info for admin is incorrect 
                        else if (userA.equals(userNameA)) {
                            System.out.println();
                            System.out.println("Invalid password");
                            netflix.main(args);
                        }   

                        else if (passA.equals(passWordA)) {
                            System.out.println();
                            System.out.println("Invalid username");
                            netflix.main(args);
                        } 
            
                        else {
                            System.out.println();
                            System.out.println("Invalid username and password");
                            netflix.main(args);
                        }
                    
                }

                else if (c1 == 3) {
                    quit = false;
                }
        
                else {
                    System.out.println("Invalid Input. Please Try Again Data Structure Expert!");  
                }
            
            // catch(InputMismatchException e) {
            //     input1.next();
            //     System.out.println("Invalid Input. Please Try Again.");
            //     System.out.println();
            // }

                
            }
        }
        //good bye message 
        System.out.println("See You Later!");
    }
}
               