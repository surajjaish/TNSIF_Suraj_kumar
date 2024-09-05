package Employees;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int age, double salary, String programmingLanguage) {
        super(name, age, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public static void main(String[] args) {
        Developer developer = new Developer("suraj", 20, 45000, "Java");
        System.out.println("Name: " + developer.getName());
        System.out.println("Age: " + developer.getAge());
        System.out.println("Salary: " + developer.getSalary());
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());
    }
}