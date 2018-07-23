package _01_array_manipulation;

import java.util.Arrays;

public class Inserting {

	public static int[] insertAt(int[] oldArray, int indexToInsertInto, int valueToInsert) {
		// TODO Auto-generated method stub

		int[] newArray = new int[oldArray.length + 1];

		for (int k = 0; k < oldArray.length; k++) {

			if (k == indexToInsertInto) {
				newArray[indexToInsertInto] = valueToInsert;

			} else {
				newArray[k] = oldArray[k];

			}

		}

		return newArray;

	}

	public static void sortArray(String[] old) {
	
	String temp;
	for (int i = 0; i < old.length-1; i++) {
        for (int j = 1; j < (old.length-1 - i); j++) {

            if (old[j - 1] .compareTo(old[j])>0) {
                temp = old[j - 1];
                old[j - 1] = old[j];
                old[j] = temp;
            }

        }
    }
	
		
		
		
	}
	public static String[] insertAlphabetically(String[] orderedArray, String value) {
		// TODO Auto-generated method stub
		sortArray(orderedArray);
		String[] list = new String[orderedArray.length + 1];
		
		boolean going = false;
		int index = 0;
		
		for (String a : orderedArray) {
			if (a.compareTo(value)<=0) {
				list[index] = a;
				index += 1;
			
			}else {
				list[index] = value;
				index += 1;
				list[index] = a;
				index += 1;
			}
			
		}	
		for (String string : list) {
			System.out.println(string);
		}				
		

		return list;
	}

}
