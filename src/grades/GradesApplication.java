package grades;

import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        //base hash map info
        HashMap<String, Student> Students = new HashMap<>();
        Student Wilson = new Student("Wilson");
        Student Kenny = new Student("Kenny");
        Student Rick = new Student("Rick");

        Wilson.addGrade(80);
        Wilson.addGrade(76);
        Wilson.addGrade(85);

        Kenny.addGrade(99);
        Kenny.addGrade(98);
        Kenny.addGrade(99);

        Rick.addGrade(100);
        Rick.addGrade(100);
        Rick.addGrade(100);

        Students.put("Wilson-Syring", Wilson);
        Students.put("Kenny-Powers", Kenny);
        Students.put("Rick-Sanchez", Rick);
        //application input - output using my first switch case
        Input gradeMe = new Input(new Scanner(System.in));
        System.out.println("<=======================GradeFinder=======================>");
        while (true) {
            System.out.println("Please Choose A Github Member from this list");
            System.out.println("Wilson | Kenny | Rick");
            System.out.println("Or: Enter goodbye to exit GradeFinder");
            String userEntry = gradeMe.getString();
            System.out.println();
            switch (userEntry){

                case "Kenny":
                    System.out.println("GitHub UserName: Kenny-Powers\n average grade:" + Kenny.getGradeAverage()+"\n");
                    break;
                case "Rick":
                    System.out.println("GitHub UserName: Rick-Sanchez\n average grade:" + Rick.getGradeAverage()+"\n");
                    break;
                case "Wilson":
                    System.out.println("GitHub UserName: Wilson-Syring\n average grade:" + Wilson.getGradeAverage()+"\n");
                    break;
                case "goodbye":
                    System.out.println("Thank you for using GradeFinder");
                    return;
                default:
                    System.out.println("invalid username, enter valid user name\n");
                    break;
            }
        }
    }
}
