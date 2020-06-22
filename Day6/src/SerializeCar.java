import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class SerializeCar {

	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
	  Car c1=new Car("1012g","jgyftdr","uygygy");
	
		//FileObjectStream f1=new FileObjectStream("")
	     //  File d1=new File("mess");
	    
	  FileOutputStream f1=new FileOutputStream("serial1.txx");
	  ObjectOutputStream s1=new ObjectOutputStream(f1);
		
          s1.writeObject(c1);
          s1.close();
	}

}
