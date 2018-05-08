import java.io.*;
public class serialization_test
{
  public static void main (String [] args)
  {
    Movie mov1 = new Movie("Pulp Fiction", 19940814, 00001, 94);

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
    System.out.println("serialized as shit");
  }catch(IOException i)
  {
    i.printStackTrace();
  }

  }
}
