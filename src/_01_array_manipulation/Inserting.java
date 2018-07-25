package _01_array_manipulation;

public class Inserting {

	public static int[] insertAt(int[] oldArray, int indexToInsertInto, int valueToInsert) {
		// TODO Auto-generated method stub
		int number = 0;
		int[] newArray = new int[oldArray.length + 1];

		for (int k = 0; k < oldArray.length; k++) {

			if (number == indexToInsertInto) {
				newArray[indexToInsertInto] = valueToInsert;
				// number += 1;
				number = k + 1;
				newArray[number] = oldArray[k];
			} else {

				newArray[number] = oldArray[k];
				// number = +1;
			}

			number++;

		}

		return newArray;

	}

	public static void sortArray(String[] old) {

		String temp;
		for (int i = 0; i < old.length; i++) {
			for (int j = 1; j < (old.length); j++) {

				if (old[j - 1].compareTo(old[j]) > 0) {
					temp = old[j - 1];
					old[j - 1] = old[j];
					old[j] = temp;
				}

			}
		}
		// for (String it : old) {
		// System.out.println(it);
		// }
	}

	public static String[] insertAlphabetically(String[] orderedArray, String value) {
		// TODO Auto-generated method stub
		sortArray(orderedArray);
		String[] list = new String[orderedArray.length + 1];

		boolean going = false;
		int index = 0;

		for (String a : orderedArray) {
			if (a.compareTo(value) <= 0 || going) {
				list[index] = a;
				index += 1;

			} else {
				list[index] = value;
				going = true;
				index += 1;

				list[index] = a;
				index += 1;

			}

		}
		if (!going) {
			list[index] = value;
		}

		for (String string : list) {
			System.out.println(string);
		}

		return list;
	}

}
