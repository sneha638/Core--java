import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    String name;
    String department;
    double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }


    public String toString() {
        return "Employee name: " + name + ", Department: " + department;
    }
}

public class Test1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees:");
        int nEmployees = sc.nextInt();

        ArrayList<Employee> employees = new ArrayList<>();


        for (int i = 1; i <= nEmployees; i++) {
            System.out.println("Enter the name of employee " + i + ":");
            String name = sc.next();

            System.out.println("Enter the department of employee " + i + ":");
            String department = sc.next();

            System.out.println("Enter the salary of employee " + i + ":");
            double salary = sc.nextDouble();

            employees.add(new Employee(name, department, salary));
        }


        //Calculate the total salary
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.salary;
        }

        // Calculate and print the average salary
        double averageSalary = totalSalary / employees.size();
        System.out.println("Average salary of all employees: " + averageSalary);

        // Print employee details
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

}