import java.util.Scanner;

public class StudentGradeCalculator{
    public static void main(String[] args) {
        Scanner ed = new Scanner(System.in);
        String name;
        int javaScore, dmathScore, webTechScore, dsScore, seScore;
        int totalMarks = 0;
        double percentage;
        System.out.print("Enter name of Student = ");
        name = ed.nextLine();
        System.out.println("Now, Number Out of 100 in following subject :- ");
        System.out.print("Java : ");
        javaScore = ed.nextInt();
        System.out.print("Discrete Maths : ");
        dmathScore = ed.nextInt();
        System.out.print("Web Technologies : ");
        webTechScore = ed.nextInt();
        System.out.print("Data Structure : ");
        dsScore = ed.nextInt();
        System.out.print("Software Engineering : ");
        seScore = ed.nextInt();
        totalMarks = javaScore + dmathScore + dsScore + seScore + webTechScore;
        percentage = (totalMarks / 500.0) * 100;
        System.out.println("\n\n*****Result Of Student*****");
        System.out.println("------------------------------------------------------");
        System.out.println("Name = " + name);
        System.out.println("Total Marks = " + totalMarks);
        System.out.println("Average Percentage = " + percentage);
        if (percentage > 80.0 && percentage <= 100.0) {
		   System.out.println("Grade = A");
		   System.out.println("------------------------------------------------------");
		} else if (percentage > 60.0 &&  percentage <= 80.0) {
		   System.out.println("Grade = B");
		   System.out.println("------------------------------------------------------");
		} else if (percentage > 30.0 && percentage <= 60.0) {
		   System.out.println("Grade = C");
		   System.out.println("------------------------------------------------------");
		} else if (percentage >= 0 && percentage <= 30.0) {
            System.out.println("Grade = D");
            System.out.println("------------------------------------------------------");
		}
    }
}