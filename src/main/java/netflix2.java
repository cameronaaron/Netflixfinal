
import java.util.Scanner;
import java.io.*;


public class netflix2 implements Serializable{

    public static void main(String[] args){
        netflixHeap heap = new netflixHeap();
        netflixBST bst = new netflixBST();
        netflixHash hash = new netflixHash();

        movieNode mov1 = new movieNode("Black Panther", 20180216, 96);
        movieNode mov2 = new movieNode("Avengers: Infinity War", 20180427, 84);
        movieNode mov3 = new movieNode("Pacific Rim: Uprising", 20180323, 43);

        customerNode xNode = new customerNode("Jane","Jane@gmail.com", 123456789);

        bst.insert(mov1);
        bst.insertID(mov1);
        heap.insert(mov1);
        heap.insert(mov3);
        bst.insert(mov2);
        bst.insertID(mov2);
        heap.insert(mov2);
        bst.insert(mov3);
        bst.insertID(mov3);

        hash.insert(xNode);

        Scanner input1 = new Scanner(System.in);
        int c1;
        System.out.println("Welcome to the Netflix Database \n");
        System.out.println("Are you a USER or ADMIN? ");
        System.out.println("(1) USER");
        System.out.println("(2) ADMIN");
        c1 = input1.nextInt();

        if (c1 == 1){
            System.out.println("Hi! Are you a:");
            System.out.println("(1) New User");
            System.out.println("(2) Returning User");

            Scanner input2 = new Scanner(System.in);
            int c2;
            c2 = input2.nextInt();

            if (c2 == 1){
                System.out.println("Hello New User!");

                System.out.println("Please Input your Name:");
                Scanner inName = new Scanner(System.in);
                String name;
                name = inName.nextLine();

                
                System.out.println("Please Input your Credit Card Number:");
                Scanner inCCN = new Scanner(System.in);
                int ccn;
                ccn = inCCN.nextInt();


                System.out.println("Please Input your Email Address: ");
                Scanner inEmail = new Scanner(System.in);
                String email;
                email = inEmail.nextLine();

                customerNode customerInfo = new customerNode(name, email, ccn);
                hash.insert(customerInfo);

                System.out.println("Here is your info!");
                System.out.println(customerInfo.getName());
                System.out.println(customerInfo.getCCN());
                System.out.println(customerInfo.getEmail());

                System.out.println("Choose an action below: \n");
                System.out.println("(1) Access Movie (by Release Date)");
                System.out.println("(2) Access Movie(by ID)");
                System.out.println("(3) Access Wish List");
                System.out.println("(4) Print to Screen All Movies in Order of Release Date");
                System.out.println("(5) Go back");
                System.out.println("(6) Quit");


                Scanner inM1 = new Scanner(System.in);
                int m1;
                m1 = inM1.nextInt();


                if (m1 == 1) {
                    System.out.println("Enter Release Date:");
                    Scanner uInput = new Scanner(System.in);
                    int i;

                    i = uInput.nextInt();
                    System.out.println("The movie with release date " + i + " is: ");
                    System.out.println(bst.search(i).getTitle());
                }

                else if (m1 == 2){
                    System.out.println("Enter ID: ");
                    Scanner uInput = new Scanner(System.in);
                    int i;

                    i = uInput.nextInt();
                    System.out.println("The movie with ID " + i + " is: ");
                    System.out.println(bst.searchID(i).getTitle());
                }

                else if (m1 == 3){

                    System.out.println("Access to WishList, Would you Like to:");
                    System.out.println("(1) Add to WishList");
                    System.out.println("(2) Access Next Movie");

                    Scanner inM2 = new Scanner(System.in);
                    int m2;
                    m2 = inM2.nextInt();

                    if (m2 == 1){

                        System.out.println("Adding a New Movie!");

                        System.out.println("Please Input Title of movie:");
                        Scanner inTitle = new Scanner(System.in);
                        String title;
                        title = inTitle.nextLine();

                        System.out.println("Please Input Release Date of movie:");
                        Scanner inRD = new Scanner(System.in);
                        int rd;
                        rd = inRD.nextInt();

                        System.out.println("Please Input the Popularity Score:");
                        Scanner inPop = new Scanner(System.in);
                        int pop;
                        pop = inPop.nextInt();

                        movieNode movieInfo = new movieNode(title, rd, pop);

                        bst.insert(movieInfo);
                        bst.insertID(movieInfo);
                        heap.insert(movieInfo);

                        // System.out.println(bst.insert(mov4));
                        // System.out.println(bst.insertID(mov4));
                        // System.out.println(heap.insert(mov4));

                    }
                    else if (m2 == 2){
                    System.out.println("Enter ID: ");
                    Scanner uInput = new Scanner(System.in);
                    int i;

                    i = uInput.nextInt();
                    System.out.println("The movie with ID " + i + " is: ");
                    System.out.println(bst.searchID(i).getTitle());
                    }
                    else if (m2 == 3){
                        System.out.println("wl");
                    
                    }
                else if (m1 == 4){
                    System.out.println("print");
                }
                else if (m1 == 5){
                    System.out.println("print");
                }
                else if (m1 == 6){
                    hash = null;
                    try{
                        FileInputStream fileIn = new FileInputStream("User.txt");
                        ObjectInputStream in = new ObjectInputStream(fileIn);
                        hash = (netflixHash) in.readObject();
                        in.close();
                        fileIn.close();
                        return;
                    }
                    catch(IOException i){
                        i.printStackTrace();
                        return;
                    } 
                  
                    catch(ClassNotFoundException c) {
                        System.out.println("Error: Class not found");
                        c.printStackTrace();
                        return;
                    }
                }

                else{
                    //Access to Next Movie
                }
            }

            else if(c2 == 4){
                //Print to Screen all Movies based on Release Date
                bst.traverse();
            }

            else if(c2 == 5){
                //Go Back
                Scanner inBack = new Scanner(System.in);
                int back;
                System.out.println("Choose an action below: \n");
                System.out.println("(1) Access to Customer Info");
                System.out.println("(2) See least Rated Movie");
                System.out.println("(3) Print all movies in order of release date");
                System.out.println("(4) Go back");
                back = inBack.nextInt();
            }
            else if(c2 == 6){
                //seriaize
                try {
                    FileOutputStream fileOut = new FileOutputStream("User.txt");
                    ObjectOutputStream out = new ObjectOutputStream(fileOut);
                    out.writeObject(hash);
                    out.close();
                    fileOut.close();
                    System.out.println("Your file has been serialized!");
                }
                catch(IOException i) {
                    i.printStackTrace();
                }
            }
            //else{
            //    System.out.println("Invaild Input. Please Try Again!");
            //}       

            }

        else{
            System.out.println("Hello Returning User!");
                System.out.println("Please Input your last 8 digits of Credit Card Number:");

            Scanner CCNInput = new Scanner(System.in);
            int ccn;
            ccn = CCNInput.nextInt();

            hash.lookUp(ccn);

        }
        }

        else if(c1 == 2){
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

                Scanner inMenu = new Scanner(System.in);
                int menu;

                System.out.println("Choose an action below: \n");
                System.out.println("(1) Access to Customer Info");
                System.out.println("(2) See least Rated Movie");
                System.out.println("(3) Print all movies in order of release date");
                System.out.println("(4) Go back");
                System.out.println("(5) Quit");
                menu = inMenu.nextInt();

                if (menu == 1){
                    //Acess to Customer Info
                    Scanner keyInput = new Scanner(System.in);
                    System.out.println("Enter key: ");
                    int k = keyInput.nextInt();
                    System.out.println(hash.lookUp(k).getName());
                    System.out.println(hash.lookUp(k).getEmail());
                    System.out.println(hash.lookUp(k).getCCN());
                }

                else if(menu == 2){
                    System.out.println("The least Rated Movie is:");
                    System.out.println(heap.findMin().getTitle());

                    System.out.println("Would you like to Delete it?");
                    System.out.println("(1) Yes");
                    System.out.println("(2) No");

                    Scanner inDelete = new Scanner(System.in);
                    int delete;
                    delete = inDelete.nextInt();

                    if(delete == 1){
                        //Delete Movie
                        heap.deleteMin();
                    }
                    else if(delete == 2){
                        //Dont Delete
                        System.out.println("Movie deletion was unsuccessful");
                    }
                }

                else if(menu == 3){
                    bst.traverse();
                }
                else if(menu == 4){
                    //Go back
                    Scanner inBack2 = new Scanner(System.in);
                    int back2;

                    System.out.println("Choose an action below: \n");
                    System.out.println("(1) Access to Customer Info");
                    System.out.println("(2) See least Rated Movie");
                    System.out.println("(3) Print all movies in order of release date");
                    System.out.println("(4) Go back");
                    back2 = inBack2.nextInt();
                }
                else if(menu == 5){
                    //serialize
                        try {
                            FileOutputStream fileOut = new FileOutputStream("Admin.txt");
                            ObjectOutputStream out = new ObjectOutputStream(fileOut);
                            out.writeObject(heap); 
                            out.close();
                            fileOut.close();
                            System.out.println("Your file has been serialized!");
                        }
                        catch(IOException i) {
                            i.printStackTrace();
                        }
                }
                else{
                    System.out.println("Invalid Input. Please Try Again!");
                }
            }

            else if (userA.equals(userNameA)) {
                System.out.println("Invalid password");
                netflix2.main(args);
             } 

            else if (passA.equals(passWordA)) {
                System.out.println("Invalid username");
                netflix2.main(args);
            } 
        
            else {
                System.out.println("Invalid username and password");
                netflix2.main(args);
            }

        }
    }
}
