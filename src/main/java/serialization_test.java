import java.io.*;
public class serialization_test
{
  public static void main (String [] args)
  {
    movieNode mov1 = new movieNode("Black Panther",20180216, 96);
    // movieNode mov2 = new movieNode("Avengers: Infinity War", 20180427, 84);
    // movieNode mov3 = new movieNode("Pacific Rim: Uprising", 20180323, 43);
    // movieNode mov4 = new movieNode("A Quiet Place", 20180406, 95);
    // movieNode mov5 = new movieNode("Dunkirk", 20170721, 92);
    // movieNode mov6 = new movieNode("Coco", 20171122, 97);
    // movieNode mov7 = new movieNode("Moana", 20161123, 96);
    // movieNode mov8 = new movieNode("Goal!", 20060512, 44);
    // movieNode mov9 = new movieNode("Ferris Bueller's Day Off", 19860611, 81);

    // movieNode mov10 = new movieNode("Four Brothers", 200508212, 52);
    // movieNode mov11 = new movieNode("Titanic", 19971219, 88);
    // movieNode mov12 = new movieNode("The Wizard of Oz", 19390825, 99);
    // movieNode mov13 = new movieNode("The Conjuring", 20130719, 86);
    // movieNode mov14 = new movieNode("Insidious", 20100914, 65);
    // movieNode mov15 = new movieNode("The Notebook", 20040625, 52);
    // movieNode mov16 = new movieNode("101 Dalmations", 19610125, 98);
    // movieNode mov17 = new movieNode("Madea Goes to Jail", 20090216, 28);

    // movieNode mov18 = new movieNode("Get Out", 20170224, 99);
    // movieNode mov19 = new movieNode("Cult of Chucky", 20171020, 82);
    // movieNode mov20 = new movieNode("The Spongebob Squarepants Movie", 11142004, 66);
    // movieNode mov21 = new movieNode("Home Alone 2", 19921120, 30);
    // movieNode mov22 = new movieNode("The Shape of Water", 20180313, 92);
    // movieNode mov23 = new movieNode("Fifty Shades Freed", 20180209, 13);
    // movieNode mov24 = new movieNode("Camp Rock", 20080620, 20);
    // movieNode mov25 = new movieNode("House of Wax", 20050626, 25);


    File netflixHeap = new File("MovieList.txt");
		// if file exists, deserialize
    System.out.println("file exists");
    try {
    FileOutputStream fileOut =
    new FileOutputStream("MovieList.txt");
    ObjectOutputStream out = new ObjectOutputStream(fileOut);
    out.writeObject(mov1);
    // out.writeObject(mov2);
    // out.writeObject(mov3);
    // out.writeObject(mov4);
    // out.writeObject(mov5);
    // out.writeObject(mov6);
    // out.writeObject(mov7);
    // out.writeObject(mov8);
    // out.writeObject(mov9);
    // out.writeObject(mov10);
    // out.writeObject(mov11);
    // out.writeObject(mov12);
    // out.writeObject(mov13);
    // out.writeObject(mov14);
    // out.writeObject(mov15);
    // out.writeObject(mov16);
    // out.writeObject(mov17);
    // out.writeObject(mov18);
    // out.writeObject(mov19);
    // out.writeObject(mov20);
    // out.writeObject(mov21);
    // out.writeObject(mov22);
    // out.writeObject(mov23);
    // out.writeObject(mov24);
    // out.writeObject(mov25);
    out.close();
    fileOut.close();
    System.out.println("Your file has been serialized!");
    }
    catch(IOException i)
    {
    i.printStackTrace();
    }
//
  }
  
}
