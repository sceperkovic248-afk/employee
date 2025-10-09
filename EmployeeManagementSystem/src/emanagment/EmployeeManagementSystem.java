package emanagment;

import java.util.Scanner;

public class EmployeeManagementSystem {
    private static final Scanner scanner = new Scanner(System.in);
    private static EmployeeManager employeeManager = new EmployeeManager();

    public static void main(String[] args) {
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    removeEmployee();
                    break;
                case 3:
                    viewAllEmployees();
                    break;
                case 4:
                    searchEmployee();
                    break;
                case 5:
                    updateEmployee();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\nEmployee Management System");
        System.out.println("1. Add Employee");
        System.out.println("2. Remove Employee");
        System.out.println("3. View All Employees");
        System.out.println("4. Search Employee");
        System.out.println("5. Update Employee");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addEmployee() {
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter employee department: ");
        String department = scanner.nextLine();
        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();
        employeeManager.addEmployee(name, age, department, salary);
    }

    private static void removeEmployee() {
        System.out.print("Enter employee ID to remove: ");
        int id = scanner.nextInt();
        employeeManager.removeEmployee(id);
    }

    private static void viewAllEmployees() {
        employeeManager.viewAllEmployees();
    }

    private static void searchEmployee() {
        System.out.print("Enter employee name or ID to search: ");
        String searchTerm = scanner.nextLine();
        Employee foundEmployee = employeeManager.searchEmployee(searchTerm);
        if (foundEmployee != null) {
            System.out.println("Employee found: " + foundEmployee);
        } else {
            System.out.println("No employee found.");
        }
    }

    private static void updateEmployee() {
        System.out.print("Enter employee ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter new employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter new employee age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter new employee department: ");
        String department = scanner.nextLine();
        System.out.print("Enter new employee salary: ");
        double salary = scanner.nextDouble();
        employeeManager.updateEmployee(id, name, age, department, salary);
    }
}

