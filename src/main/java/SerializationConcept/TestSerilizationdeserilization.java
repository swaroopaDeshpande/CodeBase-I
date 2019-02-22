package SerializationConcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerilizationdeserilization {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		CarObj obj = new CarObj();

		// Serialization

		FileOutputStream fos = new FileOutputStream("DemoSerialization.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		oos.close();

		// Deserilization

		FileInputStream fis = new FileInputStream("DemoSerialization.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		CarObj obj1 = (CarObj) ois.readObject();
		ois.close();

		System.out.println(obj1.ModelNo +"..."+ obj1.ModelSerialNo );

	}

}
