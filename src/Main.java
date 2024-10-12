import Ex1.GradeService;
import Ex2.Array;

import java.util.Arrays;

//import java.util.Arrays;

public class Main {
    public static void Ex1(){
        GradeService gradeService = new GradeService();
        int[] grades = new int[]{29, 37, 38, 41, 84, 67};

        //Ex 1.1
        for( int grade : gradeService.unsatisfactoryGrades(grades) ) {
            System.out.println(grade);
        }

//        System.out.println(Arrays.toString(gradeService.unsatisfactoryGrades(grades)));

        //Ex 1.2
        System.out.println(gradeService.average(grades));


        //Ex 1.3
        System.out.println(Arrays.toString(gradeService.roundedUpGrades(grades)));

        //EX 1.4
        System.out.println(gradeService.maximumRoundedGrade(grades));
    }

    public static void Ex2(){
        Array array = new Array(new int[]{4, 8, 3, 10, 17});

        //Ex 2.1
        System.out.println(array.getMax());

        //Ex 2.2
        System.out.println(array.getMin());

        //Ex 2.3
        System.out.println(array.maxNSum(4));

        //Ex 2.4
        System.out.println(array.minNSum(4));
    }

    public static void main(String[] args) {
        //Ex1();
        Ex2();
    }


}