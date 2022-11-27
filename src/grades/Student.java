package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList grade = new ArrayList();
    Student(){}
    public Student(String name) {
        this.name = name;

    }
    public ArrayList getGrade() {
        return this.grade;
    }
    public int getGrade(int grade) {
        return (int)this.grade.get(grade);
    }
    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        this.grade.add(grade);
    }

    public int getArrSize() {
        return this.grade.size();
    }

    public double getGradeAverage() {
        double total = 0;
        for (int g = 0; g < grade.size(); g++) {
            total += ((double) (int) this.grade.get(g));
        }
        return total / this.grade.size();
    }
}
