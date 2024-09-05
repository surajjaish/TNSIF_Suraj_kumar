package main;

import Employees.Developer;
import Employees.Employee;
import Employees.Manager;
import Utilities.EmployeeUtilities;

public class AssignmentMain {
    public static void main(String[] args) {
        Developer developer = new Developer("vishu", 20, 25000, "Java");
        Manager manager = new Manager("rohit", 22, 70000, "HR");
        Employee employee = new Employee("rohan", 28, 72000);

        EmployeeUtilities.printEmployeeDetails(developer);
        System.out.println();
        EmployeeUtilities.printEmployeeDetails(manager);
        System.out.println();
        EmployeeUtilities.printEmployeeDetails(employee);
    }
}
