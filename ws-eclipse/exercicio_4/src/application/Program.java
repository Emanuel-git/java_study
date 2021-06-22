package application;

import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student[] student = new Student[10];
		
		System.out.print("How many rooms will be rented? ");
		int quantRooms = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < quantRooms; i++) {
			
			System.out.println("\nRent #" + (i + 1) + ":");
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			
			student[room - 1] = new Student(name, email); 
			
		}
		
		System.out.println("\nBusy Rooms:");
		
		for (int i = 0; i < student.length; i++) {
			
			if (student[i] != null) System.out.println((i + 1) + ": " + student[i].getName() + ", " + student[i].getEmail());
			
		}

	}

}
