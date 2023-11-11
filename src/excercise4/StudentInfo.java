package excercise4;

public class StudentInfo {
    private String name;
    private Integer grade;

    private static Integer totalGrades = 0;
    private static Integer totalStudents = 0;

    public StudentInfo(String name, Integer grade) {
        this.name = name;
        this.grade = grade;
        totalGrades += grade;
        totalStudents++;
    }

    public String getName() {
        return name;
    }

    public Integer getGrade() {
        return grade;
    }

    public static double calculateAverageGrade() {
        if (totalStudents == 0) {
            return 0.0; // To avoid division by zero
        }
        return (double) totalGrades / totalStudents;
    }
}
