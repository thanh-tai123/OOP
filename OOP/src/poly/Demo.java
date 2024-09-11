package poly;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Town town = new Town();
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the number of families (n):");
	        int n = scanner.nextInt();

	        for(int i = 0; i < n; i++) {
	            // Input for each family
	            System.out.println("Enter address:");
	            scanner.nextLine();  // Consume the newline left by nextInt()
	            String address = scanner.nextLine();

	            // Enter the number of people in the family
	            List<Person> persons = new ArrayList<>();
	            System.out.println("Enter the number of people in the family:");
	            int number = scanner.nextInt();

	            for (int j = 0; j < number; j++) {
	               
	                System.out.println("Enter details for person " + (j + 1) + ":");

	                System.out.print("Name: ");
	                scanner.nextLine();  
	                String name = scanner.nextLine();

	                System.out.print("Age: ");
	                int age = scanner.nextInt();

	                System.out.print("Job: ");
	                scanner.nextLine();  // Consume the newline
	                String job = scanner.nextLine();

	                System.out.print("Passport: ");
	                String passport = scanner.nextLine();

	                // Add the person to the list
	                persons.add(new Person(name, age, job, passport));
	            }

	            // After done input
	            town.addFamily(new Family(persons, address));
	}
	}

}
