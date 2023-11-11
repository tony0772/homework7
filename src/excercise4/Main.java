package excercise4;

public class Main {
    public static void main(String[] args) {
        StudentInfo student1 = new StudentInfo("Marcel", 10);
        StudentInfo student2 = new StudentInfo("Alina", 7);
        StudentInfo student3 = new StudentInfo("Andrei", 8);
        StudentInfo student4 = new StudentInfo("Alexandra", 3);

        double averageGrade = StudentInfo.calculateAverageGrade();
        System.out.println("Average grade is: " + averageGrade);
    }
}
