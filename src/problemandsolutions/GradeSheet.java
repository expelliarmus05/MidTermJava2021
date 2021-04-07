package problemandsolutions;

import java.util.Scanner;

public class GradeSheet {
    // Write a Java program that determines a student’s grade.
    //The program will read three types of scores(quiz, mid-term, and final scores) and determine the grade based on
    // the following rules:
    //- if the average score >=90% =>grade=A
    //- if the average score >= 70% and <90% => grade=B
    //- if the average score>=50% and <70% =>grade=C
    //- if the average score<50% =>grade=F
    //
    //See the example output below:
    //
    //Quiz score: 80
    //
    //Mid-term score: 68
    //
    //Final score: 90
    //
    //Your grade is B.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double quiz_mark, midterm_mark, final_mark;
        System.out.print("Quiz score : ");
        quiz_mark = input.nextDouble();
        System.out.print("\nMid-term score : ");
        midterm_mark = input.nextDouble();
        System.out.print("\nFinal score : ");
        final_mark = input.nextDouble();
        double avg = (quiz_mark + midterm_mark + final_mark) / 3;
        switch ( (int) (avg / 10.00)){
            case 10:
            case 9:
                System.out.println("\nYour grade is A");
                break;
            case 8 :
            case 7:
                System.out.println("\nYour grade is B");
                break;
            case 6:
            case 5:
                System.out.println("\nYour grade is C");
                break;
            default:
                System.out.println("\nYour grade is F");

        }
    }



}
