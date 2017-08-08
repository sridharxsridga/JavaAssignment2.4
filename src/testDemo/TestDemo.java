/*
 * 		This Program perform two functions
 * 1 . Validates its argument
 * Conditions to validate : print “You Have Entered Zero” if the value is equal to 0.
It should print “You Have Entered Positive Value” if the value is greater than 0.
It should print “You Have Entered Negative Value” if the value is less than 0.
 * 2. Calculates grade based on students marks and students age. 
 *  Conditions to validate  A student has A grade if marks are more than 70 (marks > 60 if age is less than 15), B
grade, if marks are between 61 and 70 (marks between 45 and 60 for age < 15) and C
grade, if marks are less than 61 (marks less than 45 for age < 15) Write a program to
print the grade for given marks and age.

 */

package testDemo;

import java.util.Scanner;

public class TestDemo {
	static int number;

	public static void main(String[] args) {

		try {
			number = Integer.parseInt(args[0]);
		} catch (ArrayIndexOutOfBoundsException e) // Exception if one argument
													// is not passed.
		{
			System.out.println("Program require single argument");
			System.exit(0);
		}
		checkNumber(number); // calling checkNumber() to validate argument

		char studentGrade;
		int studentMarks;
		int studentAge;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Student Age :");
		studentAge = scanner.nextInt();
		System.out.println("Enter Student Marks :");
		studentMarks = scanner.nextInt();

		calculateGrade(studentMarks, studentAge);

	}

	/*
	 * calculateGrade() is implemented to calculate grade of the student based
	 * on student marks and student age.
	 */
	private static void calculateGrade(int studentMarks, int studentAge) {

		if ((studentMarks > 70) || (studentMarks > 60 && studentAge < 15)) {
			System.out.println("Grade for  marks " + studentMarks
					+ " and age  " + studentAge + " is A ");
		} else if ((studentMarks >= 61 && studentMarks <= 70)
				|| ((studentMarks >= 45 && studentMarks <= 60) && studentAge < 15)) {
			System.out.println("Grade for  marks " + studentMarks + " and age "
					+ studentAge + " is  B ");
		} else if ((studentMarks < 61)
				|| ((studentMarks < 45) && studentAge < 15)) {
			System.out.println("Grade for  marks " + studentMarks + " and age "
					+ studentAge + " is  C ");
		}

	}

	/*
	 * checkNumber() is implemented to check whether number is positive ,
	 * negative or zero
	 */
	private static void checkNumber(int number) {
		if (number == 0) {
			System.out.println("You Have Entered Zero");
		} else if (number > 0) {
			System.out.println("You Have Entered Positive Value");
		} else {
			System.out.println("You Have Entered Negative Value");
		}

	}

}
