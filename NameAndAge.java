package uwstout.cs144.labs.lab02;

import java.util.Scanner;

/**
 * Prints out user's first name and age
 * 
 * @author Flowers
 * @version 2016-09-19
 */
public class NameAndAge {

	/**
	 * Prints out the user's first name and age
	 * 
	 * @param args
	 *            Command line parameters
	 */

	public static void main(String[] args) {
		Scanner nameScan = new Scanner(System.in);
		Scanner ageScan = new Scanner(System.in);
		String name;
		int age;

		System.out.println("Enter in your first and last name");
		name = nameScan.next();

		System.out.println("Enter your age");
		age = ageScan.nextInt();
		System.out.println(name + ", " + age);

		nameScan.close();
		ageScan.close();

	}

}
