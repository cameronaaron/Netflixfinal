import java.io.*;
public class deserialization_test
{
  public static void main (String [] args)
  {

    Movie mov1 = null;
    try{
    FileInputStream fileIn = new FileInputStream("MovieList.txt");
    ObjectInputStream in = new ObjectInputStream(fileIn);
    mov1 = (Movie) in.readObject();
    in.close();
    fileIn.close();
  }
  catch(IOException i)
  {
    i.printStackTrace();
    return;
  }catch(ClassNotFoundException c)
  {
    System.out.println("Class not found");
    c.printStackTrace();
    return;
  }

    System.out.println("Deserialized movie!!!");
    System.out.println("Title:" + mov1.getTitle());
    System.out.println("ID:" + mov1.getID());
    System.out.println("Release date:" + mov1.getRelease());
    System.out.println("Rotten Tomatoes score:" + mov1.getrTscore());

  }
}
