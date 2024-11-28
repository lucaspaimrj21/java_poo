package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ProgramStudent {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.print("Name: ");
		student.name = sc.nextLine();
		System.out.print("First Grade: ");
		student.firstGrade = sc.nextDouble();
		System.out.print("Second Grade: ");
		student.secondGrade = sc.nextDouble();
		System.out.print("Third Grade: ");
		student.thirdGrade = sc.nextDouble();
		
		System.out.println("FINAL GRADE: " + student.finalGrade());
		
		if (student.finalGrade() >= 60) {
			System.out.print("PASS");
		}
		else {
			System.out.print("FAILED" + "\n");
			System.out.print("MISSING " + student.missingPoints() + " POINTS");
		}
		
		sc.close();
		
		
		
		
		
	}

}
