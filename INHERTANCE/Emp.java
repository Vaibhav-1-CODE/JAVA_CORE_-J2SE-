import java.util.*;

class Employee {
    private int id;
    private String name, dept;
    private double salary;

    Employee() { }

    Employee(int id, String name, String dept, double salary) {
        this.id = id; this.name = name;
        this.dept = dept; this.salary = salary;
    }

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: "); id = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: "); name = sc.nextLine();
        System.out.print("Department: "); dept = sc.nextLine();
        System.out.print("Salary: "); salary = sc.nextDouble();
    }

    void display() {
        System.out.println("ID: " + id + "\nName: " + name +
                           "\nDepartment: " + dept + "\nSalary: " + salary);
    }

    double getSalary() { return salary; }
}

class Manager extends Employee {
    private double bonus;

    Manager() { super(); }

    Manager(int id, String name, String dept, double sal, double b) {
        super(id, name, dept, sal);
        bonus = b;
    }

    void accept() {
        super.accept();
        Scanner sc = new Scanner(System.in);
        System.out.print("Bonus: "); bonus = sc.nextDouble();
    }

    void display() {
        super.display();
        System.out.println("Bonus: " + bonus +
                           "\nTotal Salary: " + getTotalSalary());
    }

    double getTotalSalary() { return getSalary() + bonus; }
}

public class Emp
 {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Managers: ");
        int n = sc.nextInt();

        Manager m[] = new Manager[n];

        for (int i = 0; i < n; i++) 
        {
            System.out.println("\nManager " + (i + 1));
            m[i] = new Manager();
            m[i].accept();
        }

        int max = 0;
        for (int i = 1; i < n; i++)
            if (m[i].getTotalSalary() > m[max].getTotalSalary())

                max = i;

        System.out.println("\nManager with Maximum Total Salary:");
        m[max].display();
    }
}
