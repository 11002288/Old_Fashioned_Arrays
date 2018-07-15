import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Anagram {

	public static void main(String[] args) {

		try {
			Scanner scan = new Scanner(new FileReader("src/words.txt"));

			ArrayList<String> array = new ArrayList<String>();

			ArrayList<String> array2 = new ArrayList<String>();

			String word = JOptionPane.showInputDialog("Type in a word");

			/*
			 * String sc = scan.toString(); char[] noMom = sc.toCharArray();
			 * Arrays.sort(noMom); String more = new String(noMom);
			 * System.out.println(more);
			 */
			char[] chars = word.toCharArray();
			Arrays.sort(chars);
			String mod = new String(chars);
			

			/*
			 * char[] war = list.toCharArray(); Arrays.sort(war); String more = new
			 * String(list); System.out.println(more);
			 */

			/*
			 * 
			 * 
			 * 
			 * char[] alph = more.toCharArray(); Arrays.sort(alph); String also = new
			 * String(alph);
			 */

			for (int j = 0; j < 235886; j++) {
				String more = scan.nextLine();

				if (mod.length() == more.length()) {
					array.add(more);
					char[] card = more.toCharArray();
					Arrays.sort(card);
					String nod = new String(card);

					array2.add(nod);

				}

			}
			int amount = 0;

			for (int i = 0; i < array.size(); i++) {

				if (array2.get(i).equals(mod)) {
					array2.add(array.get(i));
					amount += 1;
					System.out.println(array.get(i));

				}
			}
			if (amount == 1) {

				System.out.println(word + " has " + amount + " anagram");
			} else {
				System.out.println(word + " has " + amount + " anagrams");
			}
			scan.close();

			// if (array) {
			// System.out.println("test");
			// }

		} catch (Exception e) {

		}

		// scan.nextLine();
		// scan.hasNextLine();

	}

}
