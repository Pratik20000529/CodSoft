package CodSoft;

import java.util.Scanner;

public class Student_Grade_Calculator {
	public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            System.out.print("Enter the total marks of this exam: ");
            int total_marks = sc.nextInt();
            System.out.print("Enter the marks in English: ");
            int Sub_1 = sc.nextInt();
            System.out.print("Enter the marks in Physics: ");
            int Sub_2 = sc.nextInt();
            System.out.print("Enter the marks in Chemistry: ");
            int Sub_3 = sc.nextInt();
            System.out.print("Enter the marks in Biology: ");
            int Sub_4 = sc.nextInt();
            System.out.print("Enter the marks in Geography: ");
            int Sub_5 = sc.nextInt();
            System.out.print("Enter the marks in Math: ");
            int Sub_6 = sc.nextInt();
            
            // Calculate percentage
            double percentage = ((Sub_1 + Sub_2 + Sub_3 + Sub_4 + Sub_5 + Sub_6) / (double) total_marks) * 100;
            System.out.println("Percentage obtained: " + percentage + "%");
            
            char grade;
            if (percentage >= 90) {
                grade = 'A';
            } 
            else if (percentage >= 80) {
                grade = 'B';
            } 
            else if (percentage >= 70) {
                grade = 'C';
            } 
            else if (percentage >= 60) {
                grade = 'D';
            } 
            else if (percentage >= 50) {
                grade = 'E';
            }
            else if(percentage >= 40) {
            	grade = 'F';
            }
            else {
                grade = 'G';
            }
            
            System.out.println("Grade obtained: " + grade); 
        }
    }
}
