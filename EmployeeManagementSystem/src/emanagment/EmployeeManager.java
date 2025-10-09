package emanagment;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees;
    private int nextId;

    // Constructor
    public EmployeeManager() {
        employees = new ArrayList<>();
        nextId = 1;
    }

    // Add a new employee
    public void addEmployee(String name, int age, String department, double salary) {
        Employee newEmployee = new Employee(nextId++, name, age, department, salary);
        employees.add(newEmployee);
        System.out.println("Employee added: " + newEmployee);
    }

    // Remove an employee by ID
    public void removeEmployee(int id) {
        employees.removeIf(employee -> employee.getId() == id);
        System.out.println("Employee removed with ID: " + id);
    }

    // View all employees
    public void viewAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees available.");
        } else {
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }

    // Search for an employee by name or ID
    public Employee searchEmployee(String searchTerm) {
        for (Employee employee : employees) {
            if (employee.getName().contains(searchTerm) || String.valueOf(employee.getId()).equals(searchTerm)) {
                return employee;
            }
        }
        return null;
    }

    // Update employee details
    public void updateEmployee(int id, String name, int age, String department, double salary) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employee.setName(name);
                employee.setAge(age);
                employee.setDepartment(department);
                employee.setSalary(salary);
                System.out.println("Employee updated: " + employee);
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }
}
