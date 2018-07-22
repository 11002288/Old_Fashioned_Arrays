package _01_array_manipulation;

public class Inserting {

	public static int[] insertAt(int[] oldArray, int indexToInsertInto, int valueToInsert) {
		// TODO Auto-generated method stub

		int[] newArray = new int[oldArray.length + 1];

		for (int k = 0; k < newArray.length; k++) {
			
			if (k==indexToInsertInto) {
				newArray[k]=valueToInsert;
			}else {
				newArray[k]=oldArray[k-1];
				System.out.println(oldArray[k]);
				
			}
			
		}

		return newArray;
	}

	public static String[] insertAlphabetically(String[] orderedArray, String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
