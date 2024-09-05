package Utilities;

public class EmployeeUtilities {
    public static void printEmployeeDetails(Employees.Employee employee) {
        if (employee != null) {
            System.out.println("Name: " + employee.getName());
            System.out.println("Age: " + employee.getAge());
            System.out.println("Salary: " + employee.getSalary());
            if (employee instanceof Employees.Developer) {
                Employees.Developer developer = (Employees.Developer) employee;
                System.out.println("Programming Language: " + developer.getProgrammingLanguage());
            } else if (employee instanceof Employees.Manager) {
                Employees.Manager manager = (Employees.Manager) employee;
                System.out.println("Department: " + manager.getDepartment());
            }
        } else {
            System.out.println("Employee object is null");
        }
    }

    public static void main(String[] args) {
        Employees.Developer developer = new Employees.Developer("suraj", 25, 25000, "Java");
        Employees.Manager manager = new Employees.Manager("king", 20, 70000, "HR");
        Employees.Employee employee = new Employees.Employee("rohan", 28, 72000);
        printEmployeeDetails(developer);
        System.out.println();
        printEmployeeDetails(manager);
        System.out.println();
        printEmployeeDetails(employee);
    }
}
