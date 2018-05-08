import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class serialization_test
{
  public static void main (String [] args)
  {
    movieNode mov1 = new movieNode("Pulp Fiction", 19940814, 5);

    File movHeap = new File("MovieList.txt");
		// if file exists, deserialize
    System.out.println("file exists");

    try{
    FileOutputStream fileOut =
    new FileOutputStream("MovieList.txt");
    ObjectOutputStream out = new ObjectOutputStream(fileOut);
    out.writeObject(mov1);
    out.close();
    fileOut.close();
      System.out.println("Serialized like a boosssss");
  }catch(IOException i)
  {
    i.printStackTrace();
  }

  }
}
