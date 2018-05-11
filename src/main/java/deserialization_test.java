import java.io.*;
public class deserialization_test
{
  public static void main (String [] args)
  {

    movieNode mov1 = null;
//     movieNode mov2 = null;
//     movieNode mov3 = null;
//     movieNode mov4 = null;
//     movieNode mov5 = null;
//     movieNode mov6 = null;
//     movieNode mov7 = null;
//     movieNode mov8 = null;
//     movieNode mov9 = null;
//     movieNode mov10 = null;
//     movieNode mov11 = null;
//     movieNode mov12 = null;
//     movieNode mov13 = null;
//     movieNode mov14 = null;
//     movieNode mov15 = null;
//     movieNode mov16 = null;
//     movieNode mov17 = null;
//     movieNode mov18 = null;
//     movieNode mov19 = null;
//     movieNode mov20 = null;
//     movieNode mov21 = null;
//     movieNode mov22 = null;
//     movieNode mov23= null;
//     movieNode mov24= null;
//     movieNode mov25= null;
// while(true){
    try{
    FileInputStream fileIn = new FileInputStream("MovieList.txt");
    ObjectInputStream in = new ObjectInputStream(fileIn);
    mov1 = (movieNode) in.readObject();
    // mov2 = (movieNode) in.readObject();
    // mov3 = (movieNode) in.readObject();
    // mov4 = (movieNode) in.readObject();
    // mov5 = (movieNode) in.readObject();
    // mov6 = (movieNode) in.readObject();
    // mov7 = (movieNode) in.readObject();
    // mov8 = (movieNode) in.readObject();
    // mov9 = (movieNode) in.readObject();
    // mov10 = (movieNode) in.readObject();
    // mov11 = (movieNode) in.readObject();
    // mov12 = (movieNode) in.readObject();
    // mov13 = (movieNode) in.readObject();
    // mov14 = (movieNode) in.readObject();
    // mov15 = (movieNode) in.readObject();
    // mov16 = (movieNode) in.readObject();
    // mov17 = (movieNode) in.readObject();
    // mov18 = (movieNode) in.readObject();
    // mov19 = (movieNode) in.readObject();
    // mov20 = (movieNode) in.readObject();
    // mov21 = (movieNode) in.readObject();
    // mov22 = (movieNode) in.readObject();
    // mov23 = (movieNode) in.readObject();
    // mov24 = (movieNode) in.readObject();
    // mov25 = (movieNode) in.readObject();
    in.close();
    fileIn.close();
  }

  catch(IOException i){
    i.printStackTrace();
    return;
  } 
  
  catch(ClassNotFoundException c) {
    System.out.println("Class not found");
    c.printStackTrace();
    return;
  }

    System.out.println("Deserialized movie!!!");
    System.out.println("Title:" + mov1.getTitle());
    System.out.println("ID:" + mov1.getUniqID());
    System.out.println("Release date:" + mov1.getRDate());
    System.out.println("Rotten Tomatoes score:" + mov1.getPopScore());

    // System.out.println("Deserialized movie!!!");
    // System.out.println("Title:" + mov2.getTitle());
    // System.out.println("ID:" + mov2.getUniqID());
    // System.out.println("Release date:" + mov2.getRDate());
    // System.out.println("Rotten Tomatoes score:" + mov2.getPopScore());

    // System.out.println("Deserialized movie!!!");
    // System.out.println("Title:" + mov3.getTitle());
    // System.out.println("ID:" + mov3.getUniqID());
    // System.out.println("Release date:" + mov3.getRDate());
    // System.out.println("Rotten Tomatoes score:" + mov3.getPopScore());

    // System.out.println("Deserialized movie!!!");
    // System.out.println("Title:" + mov4.getTitle());
    // System.out.println("ID:" + mov4.getUniqID());
    // System.out.println("Release date:" + mov4.getRDate());
    // System.out.println("Rotten Tomatoes score:" + mov4.getPopScore());

    // System.out.println("Deserialized movie!!!");
    // System.out.println("Title:" + mov5.getTitle());
    // System.out.println("ID:" + mov5.getUniqID());
    // System.out.println("Release date:" + mov5.getRDate());
    // System.out.println("Rotten Tomatoes score:" + mov5.getPopScore());

    // System.out.println("Deserialized movie!!!");
    // System.out.println("Title:" + mov6.getTitle());
    // System.out.println("ID:" + mov6.getUniqID());
    // System.out.println("Release date:" + mov6.getRDate());
    // System.out.println("Rotten Tomatoes score:" + mov6.getPopScore());

    // System.out.println("Deserialized movie!!!");
    // System.out.println("Title:" + mov7.getTitle());
    // System.out.println("ID:" + mov7.getUniqID());
    // System.out.println("Release date:" + mov7.getRDate());
    // System.out.println("Rotten Tomatoes score:" + mov7.getPopScore());

    // System.out.println("Deserialized movie!!!");
    // System.out.println("Title:" + mov8.getTitle());
    // System.out.println("ID:" + mov8.getUniqID());
    // System.out.println("Release date:" + mov8.getRDate());
    // System.out.println("Rotten Tomatoes score:" + mov8.getPopScore());

    // System.out.println("Deserialized movie!!!");
    // System.out.println("Title:" + mov9.getTitle());
    // System.out.println("ID:" + mov9.getUniqID());
    // System.out.println("Release date:" + mov9.getRDate());
    // System.out.println("Rotten Tomatoes score:" + mov9.getPopScore());

    // System.out.println("Deserialized movie!!!");
    // System.out.println("Title:" + mov10.getTitle());
    // System.out.println("ID:" + mov10.getUniqID());
    // System.out.println("Release date:" + mov10.getRDate());
    // System.out.println("Rotten Tomatoes score:" + mov10.getPopScore());

    // System.out.println("Deserialized movie!!!");
    // System.out.println("Title:" + mov11.getTitle());
    // System.out.println("ID:" + mov11.getUniqID());
    // System.out.println("Release date:" + mov11.getRDate());
    // System.out.println("Rotten Tomatoes score:" + mov11.getPopScore());

    // System.out.println("Deserialized movie!!!");
    // System.out.println("Title:" + mov12.getTitle());
    // System.out.println("ID:" + mov12.getUniqID());
    // System.out.println("Release date:" + mov12.getRDate());
    // System.out.println("Rotten Tomatoes score:" + mov12.getPopScore());

    // System.out.println("Deserialized movie!!!");
    // System.out.println("Title:" + mov13.getTitle());
    // System.out.println("ID:" + mov13.getUniqID());
    // System.out.println("Release date:" + mov13.getRDate());
    // System.out.println("Rotten Tomatoes score:" + mov13.getPopScore());

    // System.out.println("Deserialized movie!!!");
    // System.out.println("Title:" + mov14.getTitle());
    // System.out.println("ID:" + mov14.getUniqID());
    // System.out.println("Release date:" + mov14.getRDate());
    // System.out.println("Rotten Tomatoes score:" + mov14.getPopScore());

    // System.out.println("Deserialized movie!!!");
    // System.out.println("Title:" + mov15.getTitle());
    // System.out.println("ID:" + mov15.getUniqID());
    // System.out.println("Release date:" + mov15.getRDate());
    // System.out.println("Rotten Tomatoes score:" + mov15.getPopScore());

    // System.out.println("Deserialized movie!!!");
    // System.out.println("Title:" + mov16.getTitle());
    // System.out.println("ID:" + mov16.getUniqID());
    // System.out.println("Release date:" + mov16.getRDate());
    // System.out.println("Rotten Tomatoes score:" + mov16.getPopScore());

    // System.out.println("Deserialized movie!!!");
    // System.out.println("Title:" + mov17.getTitle());
    // System.out.println("ID:" + mov17.getUniqID());
    // System.out.println("Release date:" + mov17.getRDate());
    // System.out.println("Rotten Tomatoes score:" + mov17.getPopScore());

    // System.out.println("Deserialized movie!!!");
    // System.out.println("Title:" + mov18.getTitle());
    // System.out.println("ID:" + mov18.getUniqID());
    // System.out.println("Release date:" + mov18.getRDate());
    // System.out.println("Rotten Tomatoes score:" + mov18.getPopScore());

    // System.out.println("Deserialized movie!!!");
    // System.out.println("Title:" + mov19.getTitle());
    // System.out.println("ID:" + mov19.getUniqID());
    // System.out.println("Release date:" + mov19.getRDate());
    // System.out.println("Rotten Tomatoes score:" + mov19.getPopScore());

    // System.out.println("Deserialized movie!!!");
    // System.out.println("Title:" + mov20.getTitle());
    // System.out.println("ID:" + mov20.getUniqID());
    // System.out.println("Release date:" + mov20.getRDate());
    // System.out.println("Rotten Tomatoes score:" + mov20.getPopScore());

    // System.out.println("Deserialized movie!!!");
    // System.out.println("Title:" + mov21.getTitle());
    // System.out.println("ID:" + mov21.getUniqID());
    // System.out.println("Release date:" + mov21.getRDate());
    // System.out.println("Rotten Tomatoes score:" + mov21.getPopScore());

    // System.out.println("Deserialized movie!!!");
    // System.out.println("Title:" + mov22.getTitle());
    // System.out.println("ID:" + mov22.getUniqID());
    // System.out.println("Release date:" + mov22.getRDate());
    // System.out.println("Rotten Tomatoes score:" + mov22.getPopScore());

    // System.out.println("Deserialized movie!!!");
    // System.out.println("Title:" + mov23.getTitle());
    // System.out.println("ID:" + mov23.getUniqID());
    // System.out.println("Release date:" + mov23.getRDate());
    // System.out.println("Rotten Tomatoes score:" + mov23.getPopScore());

    // System.out.println("Deserialized movie!!!");
    // System.out.println("Title:" + mov24.getTitle());
    // System.out.println("ID:" + mov24.getUniqID());
    // System.out.println("Release date:" + mov24.getRDate());
    // System.out.println("Rotten Tomatoes score:" + mov24.getPopScore());

    // System.out.println("Deserialized movie!!!");
    // System.out.println("Title:" + mov25.getTitle());
    // System.out.println("ID:" + mov25.getUniqID());
    // System.out.println("Release date:" + mov25.getRDate());
    // System.out.println("Rotten Tomatoes score:" + mov25.getPopScore());

    
  }
}
