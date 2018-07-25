package _01_array_manipulation;

public class Sorting {

	public static void sort(String[] old) {
		// TODO Auto-generated method stub

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

	}

	/*
	 * String ta = ""; ArrayList<String> list = new ArrayList<String>();
	 * ArrayList<String> list2 = new ArrayList<String>(); ta.equals(testArray);
	 * char[] chars = ta.toCharArray(); Arrays.sort(chars); String change = new
	 * String(chars);
	 * 
	 * for (int i = 0; i < list.size(); i++) { list.add(change); if
	 * (list.get(i).equals(list.get(i))) { System.out.println(list); }
	 * 
	 * }
	 */
}
