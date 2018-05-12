import java.util.Scanner; 

public class netflix2 {
    public static void main(String[] args){

        netflixBST bst = new netflixBST();
        netflixHeap heap = new netflixHeap();
        netflixHash hash = new netflixHash();

        movieNode mov1 = new movieNode("Black Panther",20180216, 96);
        movieNode mov2 = new movieNode("Avengers: Infinity War", 20180427, 84);
        movieNode mov3 = new movieNode("Pacific Rim: Uprising", 20180323, 43);

        customerNode xNode = new customerNode("Jane","Jane@gmail.com", 123456789);

        bst.insert(mov1);
        bst.insertID(mov1);
        heap.insert(mov1);
        bst.insert(mov2);
        bst.insertID(mov2);
        heap.insert(mov2);
        bst.insert(mov3);
        bst.insertID(mov3);
        heap.insert(mov3);

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

                customerNode yNode = new 
                (c3, c5, c4);
                hash.insert(yNode);

                System.out.println("Here is your info!");
                System.out.println(yNode.getName());
                System.out.println(yNode.getCCN());
                System.out.println(yNode.getEmail());

                System.out.println("Choose an action below: \n");
                System.out.println("(1) Access Movie (by Release Date)");
                System.out.println("(2) Access Movie(by ID)");
                System.out.println("(3) Access Wish List");
                System.out.println("(4) Print to Screen All Movies in Order of Release Date");
                System.out.println("(5) Go back");
                System.out.println("(6) Quit");


                Scanner input6 = new Scanner(System.in);
                int c6;
                c6 = input6.nextInt();


                if (c6 == 1){
                    System.out.println("Enter Release Date:");
                    Scanner uInput = new Scanner(System.in);
                    int i;

                    i = uInput.nextInt();
                    System.out.println("The movie with release date " + i + " is: ");
                    System.out.println(bst.search(i).getTitle());
                }

                else if (c6 == 2){
                    System.out.println("Enter ID: ");
                    Scanner uInput = new Scanner(System.in);
                    int i;

                    i = uInput.nextInt();
                    System.out.println("The movie with ID " + i + " is: ");
                    System.out.println(bst.searchID(i).getTitle());
                }

                else if (c6 == 3){

                    System.out.println("Access to WishList, Would you Like to:");
                    System.out.println("(1) Add to WishList");
                    System.out.println("(2) Access Next Movie");

                    Scanner input7 = new Scanner(System.in);
                    int c7;
                    c7 = input7.nextInt();

                    if (c7 == 1){

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

                        // System.out.println(bst.insert(mov4));
                        // System.out.println(bst.insertID(mov4));
                        // System.out.println(heap.insert(mov4));


                    }

                else{
                    //Acess to Next Movie
                }
            }

            else if(c6 == 4){
                //Print to Screen all Movies based on Release Date
                bst.traverse();
            }

            else if(c6 == 5){
                //Go Back
            }

            else{
                System.out.println("Invaild Input. Please Try Again!");
            }       


            }

        else{
            System.out.println("Hello Returning User!");
            System.out.println("Please Input your Credit Card Number:");

            Scanner CCNInput = new Scanner(System.in);
            int ccn;
            ccn = CCNInput.nextInt();

            hash.lookUp(ccn);

        }
        }

        else if(c1 == 2){
            System.out.println("HI Admin! \n");

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
                c11 = input11.nextInt();

                if (c11 == 1){
                    //Acess to Customer Info
                    Scanner keyInput = new Scanner(System.in);
                    System.out.println("Enter key: ");
                    int k = keyInput.nextInt();
                    System.out.println(hash.lookUp(k).getName());
                    System.out.println(hash.lookUp(k).getEmail());
                    System.out.println(hash.lookUp(k).getCCN());
                }

                else if(c11 == 2){
                    System.out.println("The least Rated Movie is:");
                    System.out.println(heap.findMin().getTitle());

                    System.out.println("Would you like to Delete it?");
                    System.out.println("(1) Yes");
                    System.out.println("(2) No");

                    Scanner input12 = new Scanner(System.in);
                    int c12;
                    c12 = input12.nextInt();

                    if(c12 == 1){
                        //Delete Movie
                        heap.deleteMin();
                    }
                    else if(c12 == 2){
                        //Dont Delete
                        System.out.println("Movie deletion was unsuccessful");
                    }
                }

                else if(c11 == 3){
                    bst.traverse();
                }
                else if(c11 == 4){
                    //Go back
                    // Scanner input11 = new Scanner(System.in);
                    // int c11;

                    System.out.println("Choose an action below: \n");
                    System.out.println("(1) Access to Customer Info");
                    System.out.println("(2) See least Rated Movie");
                    System.out.println("(3) Print all movies in order of release date");
                    System.out.println("(4) Go back");
                    c11 = input11.nextInt();
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
