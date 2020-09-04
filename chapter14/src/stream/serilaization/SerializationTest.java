package stream.serilaization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{ 
	String name;
	String Job;
	
	public Person(String name, String Job) {
		this.name = name; 
		this.Job = Job;
		
	}
	
	public String toString() { 
		return name + "," + Job;
	}
}
public class SerializationTest {
	
	public static void main(String[] args ) {
		
		Person personLee = new Person("이수신", "엔지니어");
		Person personkim = new Person("김유신", "선생님");
		
		try(FileOutputStream fos = new FileOutputStream("serial.dat");
				ObjectOutputStream oos=new ObjectOutputStream(fos)){
			oos.writeObject(personLee);
			oos.writeObject(personkim);
	
		}catch(IOException e) {
		System.out.println(e);
	  }
		try(FileInputStream fos = new FileInputStream("serial.dat");
				ObjectInputStream ois=new ObjectInputStream(fos)){
			Person p1 = (Person)ois.readObject();
			Person p2 = (Person)ois.readObject();
			
		
   }catch(IOException e) {
		System.out.println(e);		
   }catch(ClassNotFoundException e) {
		System.out.println(e);		

}
	}
}
