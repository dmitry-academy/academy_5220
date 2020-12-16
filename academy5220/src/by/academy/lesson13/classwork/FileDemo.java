package by.academy.lesson13.classwork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileDemo {
	public static void main(String... args) {

		Person p1 = new Person("John", 30, "Male", "querty");
		Person p2 = new Person("Rachel", 25, "Female", "querty");

		System.out.println(p1);
		System.out.println(p2);

		try {

			File file = new File("objects.txt");
			FileOutputStream f = new FileOutputStream(file);
			ObjectOutputStream o = new ObjectOutputStream(f);

//			BufferedReader in = new BufferedReader(new FileReader("copyBytes.txt"));
//			 FileOutputStream file = new FileOutputStream("myobject.ser");
//			    BufferedOutputStream bout = new BufferedOutputStream(file);
//			    ObjectOutputStream out = new ObjectOutputStream(bout);
			// Write objects to file
			o.writeObject(p1);
			o.writeInt(5);
			o.writeObject(p2);

			o.close();
			f.close();

			FileInputStream fi = new FileInputStream(file);
			ObjectInputStream oi = new ObjectInputStream(fi);

			// Read objects
			Person pr1 = (Person) oi.readObject();
			System.out.println(oi.readInt());
			Person pr2 = (Person) oi.readObject();

			System.out.println(pr1);
			System.out.println(pr2);

			oi.close();
			fi.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error initializing stream");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
