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

			while (scan.hasNextLine() == true) {
				array.add(scan.nextLine());

			}

		} catch (Exception e) {

		}

		// scan.nextLine();
		// scan.hasNextLine();

	}
	

}