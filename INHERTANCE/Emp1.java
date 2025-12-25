/* Define a class Employee having private members – id, name, department, salary.
   Define default and parameterized constructors. Create a subclass called Manager
   with private member bonus. Define methods accept and display in both classes.
   Create n objects of Manager class and display the manager having maximum total salary. */

import java.io.*;

class Employee {

    private int id;
    private String name;
    private String dep;
    private double salary;

    // Default Constructor
    Employee() {
        id = 0;
        name = "";
        dep = "";
        salary = 0.0;
    }

    // Parameterized Constructor
    Employee(int id, String name, String dep, double salary) {
        this.id = id;
        this.name = name;
        this.dep = dep;
        this.salary = salary;
    }

    // Accept method using BufferedReader
    void accept(BufferedReader br) throws Exception {
        System.out.print("Enter ID: ");
        id = Integer.parseInt(br.readLine());

        System.out.print("Enter Name: ");
        name = br.readLine();

        System.out.print("Enter Department: ");
        dep = br.readLine();

        System.out.print("Enter Salary: ");
        salary = Double.parseDouble(br.readLine());
    }

    // Display
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + dep);
        System.out.println("Salary: " + salary);
    }

    double getSalary() {
        return salary;
    }
}


// ========= Manager Class ==========
class Manager extends Employee {

    private double bonus;

    // Default Constructor
    Manager() {
        super();
        bonus = 0.0;
    }

    // Parameterized Constructor
    Manager(int id, String name, String dep, double salary, double bonus) {
        super(id, name, dep, salary);
        this.bonus = bonus;
    }

    // Accept Manager details
    void accept(BufferedReader br) throws Exception {
        super.accept(br);

        System.out.print("Enter Bonus: ");
        bonus = Double.parseDouble(br.readLine());
    }

    // Display Manager details
    void display() {
        super.display();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + getTotalSalary());
        System.out.println("--------------------------------");
    }

    double getTotalSalary() {
        return getSalary() + bonus;
    }
}


// ========== Main Class =============
public class Emp1 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter number of Managers: ");
        int n = Integer.parseInt(br.readLine());

        Manager m[] = new Manager[n];

        // Accept details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Manager " + (i + 1));
            m[i] = new Manager();
            m[i].accept(br);
        }

        // Find manager with maximum total salary
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (m[i].getTotalSalary() > m[maxIndex].getTotalSalary()) {
                maxIndex = i;
            }
        }

        System.out.println("\nManager with Maximum Total Salary:");
        m[maxIndex].display();
    }
}
