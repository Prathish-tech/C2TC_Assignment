package entityclassassignment1;

import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            students[i] = new Student();
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Roll No: ");
            students[i].setRollNo(scanner.nextInt());
            scanner.nextLine(); 
            System.out.print("Name   : ");
            students[i].setName(scanner.nextLine());
            System.out.print("Age    : ");
            students[i].setMobileNo(scanner.nextInt());
            scanner.nextLine();
            System.out.println();
        }

        System.out.println("=== Student Details ===");
        for (Student student : students) {
            student.displayDetails();
        }

        scanner.close();
    }
}
