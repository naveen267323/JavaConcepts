package JavaBascis;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Readingtextfile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		File file = new File("C:\\Windows\\text.txt");

		Scanner scan = new Scanner(file);

		// while loop will iterate over multiples lines and entire file line-by-line

		while (scan.hasNextLine()) {
			String read = scan.nextLine();
			System.out.println(read);

			// Use a regular for loop to iterate over characters in the line
			// for (char x : read.toCharArray()) {
			// System.out.println(x + " ");
			// }
		}

	}

}
