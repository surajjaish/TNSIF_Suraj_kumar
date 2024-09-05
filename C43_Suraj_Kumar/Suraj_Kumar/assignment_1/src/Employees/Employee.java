package Employees;

public class Employee {
	private String name;
	private int age;
	private double salary;

	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}

	public static void main(String[] args) {
		Employee employee = new Employee("king", 28, 72000);
		System.out.println("Name: " + employee.getName());
		System.out.println("Age: " + employee.getAge());
		System.out.println("Salary: " + employee.getSalary());

	}

}
