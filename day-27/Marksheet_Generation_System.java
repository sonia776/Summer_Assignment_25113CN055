import java.util.*;

public class Marksheet_Generation_System {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        int[] marks = new int[5];
        int total = 0;
        System.out.print("Enter Marks of 5 Subjects : ");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
            total += marks[i];
        }
        double percentage = total / 5.0;

        String grade;

        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }
        sc.close();

        System.out.println("\n========== MARKSHEET ==========");
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + roll);

        for (int i = 0; i < 5; i++) {
            System.out.println("Marks in subject " + i+1 + " : " + marks[i] + " ");
        }

        System.out.println("\nTotal Marks : " + total);
        System.out.println("Percentage  : " + percentage + "%");
        System.out.println("Grade       : " + grade);

        if (marks[0] >= 40 && marks[1] >= 40 && marks[2] >= 40 && marks[3] >= 40 && marks[4] >= 40) {
            System.out.println("Result      : PASS");
        } else {
            System.out.println("Result      : FAIL");
        }

    }

}