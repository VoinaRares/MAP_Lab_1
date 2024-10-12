import Ex1.GradeService;

import java.util.Arrays;

//import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GradeService gradeService = new GradeService();
        int[] grades = new int[]{29, 37, 38, 41, 84, 67};

        //Ex1
        for( int grade : gradeService.unsatisfactoryGrades(grades) ) {
            System.out.println(grade);
        }

//        System.out.println(Arrays.toString(gradeService.unsatisfactoryGrades(grades)));

        //Ex2
        System.out.println(gradeService.average(grades));


        //Ex3
        System.out.println(Arrays.toString(gradeService.roundedUpGrades(grades)));
    }
}