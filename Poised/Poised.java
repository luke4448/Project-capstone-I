package Poised;
import java.util.ArrayList;
import java.util.*;
// importing package
public class Poised {
	
  public static void main(String[] args) {

	
	Scanner input = new Scanner(System.in);

	    // Architect input
	    System.out.println("Enter the Architect's name? ");
	    String name = input.nextLine();
	    
	    System.out.println("Enter phone number: ");
	    int number = input.nextInt();
	    
	    System.out.println("Enter the email: ");
	    String email = input.nextLine();
	    
	    System.out.println("Enter the address: ");
	    String address = input.nextLine();
	    
	    Architect Architect = new Architect(name, number, email, address);
	    
	    System.out.println(Architect);

	    // Project input
	    System.out.println("What is the total amount? ");
	    int totalAmount = input.nextInt();
	   	    
	    System.out.println("What is the deadline for the project? ");
	    String deadline = input.nextLine();
	    
	    System.out.println("Name of the building? ");
	    String buildingname = input.nextLine();
	    
	    System.out.println("What type of building is it? ");
	    String type = input.nextLine();
	    
	    System.out.println("What is the value of the building? ");
	    double price = input.nextDouble();
	    	    
	    System.out.println("Enter the customer's name? ");
	    
		String customer = input.nextLine();
	    
	    System.out.println("What is the address fo the building? ");
	    String buildingaddress = input.nextLine();
	    
	    System.out.println("Please enter the name of the Architect? ");
	    String name1 = input.nextLine();
	    
	    Project Project = new Project(totalAmount, deadline, buildingname, type, price, buildingaddress, name1);

	    System.out.println(Project);
    // Creating objects
	      System.out.println("Menu: ");
	        System.out.println("A = update contractor details ");
	        System.out.println("B = update amount paid ");
	        System.out.println("C = update deadline: ");

	        String menu = input.nextLine();

	        // Updating Architect details.

	        if (menu.equals("A")) {
	            System.out.println("Enter the Architect's name: ");
	            String newName = input.nextLine();

	            System.out.println("Enter a telephone number: ");
	            int newNumber = input.nextInt();

	            System.out.println("Enter an email: ");
	            String newEmail = input.nextLine();

	            System.out.println("Enter the contractor's address: ");
	            String newAddress = input.nextLine();
	            
	            // Updating the object attribute values.
	            Architect.setName(newName);
	            Architect.setNumber(newNumber);
	            Architect.setEmail(newEmail);
	            Architect.setAddress(newAddress);

	            System.out.println(Architect);

	        }

	            // User will be prompted to enter a new amount.
	            
	        if(menu.equals("B")) {
	            System.out.println("Enter the up-to-date amount: ");
	            double newAmount = input.nextDouble();
	            Project.setAmount(newAmount);
	            System.out.println(Project);
	        }

	            // updates the deadline attribute.
	        if (menu.equals("D")) {
	                System.out.println("Enter new deadline: ");
	                String newDeadline = input.nextLine();
	                
	                Project.setDeadline(newDeadline);
	                System.out.println(Project);
	            }
  
}


}
