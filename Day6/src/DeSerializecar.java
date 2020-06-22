import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeSerializecar {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		   
		  FileInputStream f1=new FileInputStream("serial1.txx");
		  ObjectInputStream s1=new ObjectInputStream(f1);
			
	     Car c1  =   (Car) s1.readObject();
	     System.out.println(c1);
		

	}

}
