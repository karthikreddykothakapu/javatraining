import java.util.*;

public class Employeeinfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Employee ID:");
        int employeeId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        System.out.println("Enter Employee Name:");
        String employeeName = scanner.nextLine();
        
        System.out.println("Enter Employee Salary:");
        double employeeSalary = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        
        System.out.println("Enter Employee Address:");
        String employeeAddress = scanner.nextLine();
        
        System.out.println("Enter Employee Contact:");
        String employeeContact = scanner.nextLine();
        
        System.out.println("Enter Employee Gender (M/F):");
        char employeeGender = scanner.next().charAt(0);
        
        // Displaying entered information
        System.out.println("\nEmployee Information:");
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + employeeSalary);
        System.out.println("Address: " + employeeAddress);
        System.out.println("Contact: " + employeeContact);
        System.out.println("Gender: " + employeeGender);
    }
}
