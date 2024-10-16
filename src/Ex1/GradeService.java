package Ex1;

import java.util.Arrays;

public class GradeService {
    public int[] unsatisfactoryGrades(int[] grades) {
        int[] result = new int[grades.length];
        for(int i = 0; i < grades.length; i++) {
            if(grades[i] <= 38){
                result[i] = grades[i];
            }
        }
        return result;
    }

    public double average(int[] grades) {

        double result = 0;
        for(int i = 0; i < grades.length; i++) {
            result += grades[i];
        }
        result /= grades.length;
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
        int[] result = new int[grades.length];
        for(int i = 0; i < grades.length; i++) {
            result[i] = roundedGrade(grades[i]);
        }
        return result;
    }

    public int maximumRoundedGrade(int[] grades) {
        int[] roundedGrades = roundedUpGrades(grades);

        int max = 0;
        for(int i =0; i < roundedGrades.length; i++) {
            if(roundedGrades[i] > max) {
                max = roundedGrades[i];
            }
        }
        return max;
    }


}
