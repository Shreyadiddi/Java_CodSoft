package Java_CodSoft;
import java.util.Scanner;

public class StudentGradeCalculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of the subjects: ");
        int numSubjects = sc.nextInt();
        int totalMarks = 0;

        System.out.println("Enter marks obtained in each subject (out of 100):");

        for(int i = 1; i <= numSubjects; i++){
            System.out.print("Subject " + i + ": ");
            int marks = sc.nextInt();
            totalMarks += marks;
        }

        double averagePercentage = (double)totalMarks / numSubjects;

        char grade;

        if (averagePercentage >= 90){
            grade = 'A';
        } else if (averagePercentage >= 80){
            grade = 'B';
        } else if (averagePercentage >= 70){
            grade = 'C';
        } else if (averagePercentage >= 60){
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\nResults:");
        System.out.println("Total Marks : " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage);
        System.out.println("Grade: " + grade);

        sc.close();
    }

    
}