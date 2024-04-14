package introduction;

import java.util.Scanner;

public class Student_calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("---STUDENT GRADE CALCULATOR---");
		System.out.println("------------------------------");
		System.out.println("Enter the total number of Subjects:");
		int numOS = scan.nextInt();
		int total = 0;
		for (int i = 1; i <= numOS; i++) {
			System.out.println("Enter the marks obtained in Subeject " + i + " out of 100");
			int marks = scan.nextInt();
			total += marks;

		}

		System.out.println("Total marks obtained is: " + total);

		double avg = (double) total / numOS;
		System.out.println("Average Percentage: " + avg + "%");

		char Grade;
		if (avg > 85) {
			Grade = 'A';

		} else if (avg > 70) {
			Grade = 'B';
		} else if (avg > 60) {
			Grade = 'C';
		} else if (avg > 35) {
			Grade = 'D';

		} else {
			Grade = 'F';
		}
		System.out.println("Grade:" + Grade);
		scan.close();

		// TODO Auto-generated method stub

	}

}
