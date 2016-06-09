package example.property;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class PropertiesDemo {

	public static void main(String[] args) {
		try {

			Properties existingProp = new Properties();
			existingProp.load(new FileInputStream("c:/tmp/properti.prop"));
			System.out.println("existing : " + existingProp);

			existingProp.put("f", "+");
			existingProp.put("c", "+++");
			System.out.println("updated existing : " + existingProp);

			FileOutputStream fosExistingProp = new FileOutputStream("c:/tmp/properti.prop", false);
			existingProp.store(fosExistingProp, null);

			// -----------------------------adding from new
			// property------------------------------
			FileOutputStream fos = new FileOutputStream("c:/tmp/properti.prop", true);

			Properties newProp = new Properties();

			newProp.put("i", "------+--------");
			newProp.put("j", "-------+-------");

			newProp.store(fos, null);
			fos.close();

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}