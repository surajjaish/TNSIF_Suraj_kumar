package Employees;

public class Manager extends Employee {
    private String department;

    public Manager(String name, int age, double salary, String department) {
        super(name, age, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public static void main(String[] args) {
        Manager manager = new Manager("rohan", 20, 70000, "HR");
        System.out.println("Name: " + manager.getName());
        System.out.println("Age: " + manager.getAge());
        System.out.println("Salary: " + manager.getSalary());
        System.out.println("Department: " + manager.getDepartment());
    }
}
