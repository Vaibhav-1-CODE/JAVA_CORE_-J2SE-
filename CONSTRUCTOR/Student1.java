/* 
Modify the above program to create n objects of the Student class. 
Accept details from the user for each object. 
Define a static method “sortStudent” which sorts the array on the basis of percentage 
*/

import java.io.*;

public class Student1 {

    private int rno;
    private String name;
    private double per;

    // Static variable to keep count of objects created
    private static int count = 0;

    // Default Constructor
    Student1() {
        rno = 0;
        name = "unknown";
        per = 0.0;
        count++;
    }

    // Parameterized Constructor
    Student1(int rno, String name, double per) {
        this.rno = rno;
        this.name = name;
        this.per = per;
        count++;
    }

    // Static method to return the total number of Student objects created
    public static int getObjectCount() {
        return count;
    }

    // Display Method (Data of Student)
    public void display() {
        System.out.println("Roll Number   : " + rno);
        System.out.println("Name          : " + name);
        System.out.println("Percentage    : " + per);
    }

    // Static method to sort students by percentage (descending order)
    public static void sortStudent(Student1[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].per < arr[j].per) {
                    // swap
                    Student1 temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter How Many Students: ");
        int n = Integer.parseInt(br.readLine());

        Student1[] s = new Student1[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter Details of Student " + (i + 1) + ":");

            System.out.print("Enter The Roll Number: ");
            int r = Integer.parseInt(br.readLine());

            System.out.print("Enter The Name: ");
            String nm = br.readLine();

            System.out.print("Enter The Percentage: ");
            double per = Double.parseDouble(br.readLine());

            s[i] = new Student1(r, nm, per);

            System.out.println("Total Students Created: " + Student1.getObjectCount());
        }

        System.out.println("\n--- Student Details Before Sorting ---");
        for (int i = 0; i < n; i++) {
            s[i].display();
            System.out.println("-------------------------------------");
        }

        // Sort the students by percentage
        Student1.sortStudent(s);

        System.out.println("\n--- Student Details After Sorting (By Percentage Descending) ---");
        for (int i = 0; i < n; i++) {
            s[i].display();
            System.out.println("-------------------------------------");
        }
    }
}
