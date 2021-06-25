package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employee = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int quantEmp = sc.nextInt();
		
		for (int i = 1; i <= quantEmp; i++) {
			System.out.println("\nEmployee #" + i + ":");
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			employee.add(new Employee(id, name, salary));
		}
		
		System.out.print("\nEnter the employee id that will have salary increase: ");
		int idForIncrease = sc.nextInt();
		
		Employee result = employee.stream().filter(e -> e.getId() == idForIncrease).findFirst().orElse(null);
		
		if (result != null) {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			result.increaseSalary(percentage);
		}
		else {
			System.out.print("This id does not exist!");
		}
		
		System.out.println("\nList of employess:");
		
		for (Employee e : employee) {
			System.out.println(e);
		}
		
		sc.close();
	}

}
