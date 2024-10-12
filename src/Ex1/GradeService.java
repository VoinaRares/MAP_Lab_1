package Ex1;

import java.util.Arrays;

public class GradeService {
    public int[] unsatisfactoryGrades(int[] grades) {
        return Arrays.stream(grades).filter((grade) -> grade <= 38).toArray();
    }

    public double average(int[] grades) {

        double result = (double) Arrays.stream(grades).sum() / grades.length;
        return Math.round(result * 100) / 100.0;
    }

    private int roundedGrade(int grade) {
        if(grade < 38) {
            return grade;
        }
        if(grade % 5 >= 3){
            return grade + (5 - grade % 5);
        }
        return grade;
    }

    public int[] roundedUpGrades(int[] grades) {
        return Arrays.stream(grades).map(this::roundedGrade).toArray();
    }


}
