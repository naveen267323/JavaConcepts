package JavaBascis;

public class program1 {

	public static int countwordsstring(String str) {
		int a = 0;

		String[] words = str.toLowerCase().split("[^a-zA-Z]+");

		for (String st : words) {

			if (st.endsWith("y") || st.endsWith("z")) {
				a++;
			}
		}

			return a;


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(countwordsstring("fez day")); // Output: 2
		System.out.println(countwordsstring("day fez y")); // Output: 3
		System.out.println(countwordsstring("day fyyyz")); // Output: 1

	}

}
