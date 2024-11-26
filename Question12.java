/*
 Develop an Employee class with attributes for name, ID, department, and salary.
Use inheritance to create subclasses like Manager and Developer that add specific
properties (e.g., Manager has teamSize). Demonstrate polymorphism with a method that
displays information about each employee
 */
class Employee {
    private String name;
    private int id;
    private String department;
    private double salary;

 
    public Employee(String name, int id, String department, double salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    public String displayInfo() {
        return "Name: " + name + ", ID: " + id + ", Department: " + department + ", Salary: $" + salary;
    }
}

class Manager extends Employee {
    private int teamSize;

    
    public Manager(String name, int id, String department, double salary, int teamSize) {
        super(name, id, department, salary);
        this.teamSize = teamSize;
    }

  
    @Override
    public String displayInfo() {
        return super.displayInfo() + ", Team Size: " + teamSize;
    }
}


class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int id, String department, double salary, String programmingLanguage) {
        super(name, id, department, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + ", Programming Language: " + programmingLanguage;
    }
}


public class Question12 {
    public static void main(String[] args) {
        Employee manager = new Manager("Alice", 101, "HR", 90000, 5);
        Employee developer = new Developer("Bob", 102, "IT", 80000, "Java");

        System.out.println(manager.displayInfo());
        System.out.println(developer.displayInfo());
    }
}

