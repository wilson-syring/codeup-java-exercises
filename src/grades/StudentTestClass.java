package grades;

public class StudentTestClass {
    public static void main(String[] args) {
        Student Wilson = new Student("Wilson");
        System.out.println("Student name: "+ Wilson.getName());
        Wilson.addGrade(100);
        Wilson.addGrade(98);
        Wilson.addGrade(70);
        System.out.println("Average of grades: " + Wilson.getGradeAverage());

    }
}
