import java.util.Scanner;

public class Q3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter marks for the five subjects:");
        System.out.print("Physics: ");
        double physics = scanner.nextDouble();
        
        System.out.print("Chemistry: ");
        double chemistry = scanner.nextDouble();
        
        System.out.print("Biology: ");
        double biology = scanner.nextDouble();
        
        System.out.print("Mathematics: ");
        double mathematics = scanner.nextDouble();
        
        System.out.print("Computer: ");
        double computer = scanner.nextDouble();
        
        scanner.close();
        double totalMarks = physics + chemistry + biology + mathematics + computer;
        double percentage = (totalMarks / 500) * 100;

        
        String grade;
        if (percentage >= 90) {
            grade = "Grade A";
        } else if (percentage >= 80) {
            grade = "Grade B";
        } else if (percentage >= 70) {
            grade = "Grade C";
        } else if (percentage >= 60) {
            grade = "Grade D";
        } else if (percentage >= 40) {
            grade = "Grade E";
        } else {
            grade = "Grade F";
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}
