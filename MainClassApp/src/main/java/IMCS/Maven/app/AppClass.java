package IMCS.Maven.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import IMCS.ExceptionMaven.Gender;
import IMCS.ExceptionMaven.Student;

import java.util.Collections;

public class AppClass {

	private static Scanner sc;

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(1123, "sam", 22, (int) 8, Gender.MALE));
		students.add(new Student(1124, "ravi", 22, (int) 5, Gender.MALE));
		students.add(new Student(1125, "ram", 22, (int) 7, Gender.MALE));

		System.out.println("1. Sort on names\n2. Sort on age and height\nSelect one option");
		sc = new Scanner(System.in);
		if (sc.nextInt() == 1) {
			Collections.sort(students, Student.nameComparator);
			students.forEach(System.out::println);
		} else {
			Collections.sort(students, Student.ageHeightComparator);
			students.forEach(System.out::println);
		}

	}

}
