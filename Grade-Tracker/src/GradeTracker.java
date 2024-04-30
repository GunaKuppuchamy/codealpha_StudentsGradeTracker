import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class GradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();
        System.out.println("Student Grade Tracker");
        System.out.println("======================");
        System.out.println("Enter grades for students (type 'done' when finished):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            try {
                double grade = Double.parseDouble(input);
                if (grade < 0 || grade > 100) {
                    System.out.println("Invalid grade. Grade must be between 0 and 100.");
                } else {
                    grades.add(grade);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'done' to finish.");
            }
        }
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        double average = sum / grades.size();
        double highest = Collections.max(grades);
        double lowest = Collections.min(grades);
        System.out.println("\n--------------------------------------");
        System.out.println("          Grade Statistics");
        System.out.println("--------------------------------------");
        System.out.printf("Average grade:   %.2f\n", average);
        System.out.println("Highest grade:   " + highest);
        System.out.println("Lowest grade:    " + lowest);
        System.out.println("--------------------------------------");
    }
}