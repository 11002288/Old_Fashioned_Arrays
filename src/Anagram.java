import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Anagram {

	public static void main(String[] args) {

		try {
			Scanner scan = new Scanner(new FileReader("src/words.txt"));

			ArrayList<String> array = new ArrayList<String>();

			String word = JOptionPane.showInputDialog("Type in a word");
			scan.nextLine().toLowerCase();
			
			String sc = scan.toString();
			char[] noMom = sc.toCharArray();
			Arrays.sort(noMom);
			String more = new String(noMom);
			System.out.println(more);
			
			char[] chars = word.toCharArray();
			Arrays.sort(chars);
			String mod = new String(chars);
			System.out.println(mod);
			
			while (scan.hasNextLine() == true) {
				if (scan.nextLine().length() == (mod.length())) {
					
					array.add(scan.nextLine());

				}

			}

			System.out.println(array);

			// if (array) {
			// System.out.println("test");
			// }

		} catch (Exception e) {

		}

		// scan.nextLine();
		// scan.hasNextLine();

	}

}
