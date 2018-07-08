import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(new FileReader("src/words.txt"));

			ArrayList<String> array = new ArrayList<String>();
			
			int num = 0;

			while (scan.hasNextLine() == true) {
				String line = scan.nextLine();
				
				array.add(scan.nextLine());
				if (array.get(num).equals(line)) {
					System.out.println("test");
				}
				

		
			
				
			}

		} catch (Exception e) {

		}

		// scan.nextLine();
		// scan.hasNextLine();

	}

}