package _01_array_manipulation;

import java.util.ArrayList;

public class Inserting {

	public static int[] insertAt(int[] testArray, int i, int j) {
		// TODO Auto-generated method stub
		ArrayList<Integer> num = new ArrayList<Integer>();
		for (int of : testArray) {
			num.add(of);
			num.add(j, 0);
			num.add(j, 4);
			num.add(j, 5);
		}
				
		return num;
	}

	public static String[] insertAlphabetically(String[] orderedArray, String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
