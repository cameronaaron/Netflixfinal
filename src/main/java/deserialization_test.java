import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class deserialization_test
{
  public static void main (String [] args)
  {

    movieNode mov1 = null;
    try{
    FileInputStream fileIn = new FileInputStream("MovieList.txt");
    ObjectInputStream in = new ObjectInputStream(fileIn);
      mov1 = (movieNode) in.readObject();
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

    System.out.println("Deserialized!!!");
    System.out.println("Title:" + mov1.getTitle());
    System.out.println("ID:" + mov1.getUniqID());
    System.out.println("Release date:" + mov1.getRDate());
    System.out.println("Rotten Tomatoes score:" + mov1.getPopScore());

  }
}
