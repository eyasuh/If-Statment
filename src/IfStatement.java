//import scanner first
import java.util.Scanner;

public class IfStatement {
    public static void main (String [] args) {
        // create new object for scanner
        Scanner input= new Scanner(System.in);

        //declare variable type and take in score number
        System.out.println("Enter testscore: " );
        int testscore = input.nextInt();
        char grade = 'A';

        if (testscore >= 90) {
            grade = 'A';
        }else if (testscore >= 80) {
            grade = 'B';
        }else if (testscore >= 70) {
            grade = 'C';
        }else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
    }
}
