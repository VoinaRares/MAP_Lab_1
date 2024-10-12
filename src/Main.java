import Ex1.GradeService;
import Ex2.Array;
import Ex3.BigNumber;

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


    public static void Ex3(){
        BigNumber bigNumber = new BigNumber(new int[]{1, 3, 0, 0, 0, 0, 0, 0, 0});
        BigNumber bigNumber2 = new BigNumber(new int[]{8, 7, 0, 0, 0, 0, 0, 0, 0});

        System.out.println(Arrays.toString(bigNumber.getSum(bigNumber2)));

        bigNumber.setNumber(new int[]{8, 3, 0, 0, 0, 0, 0, 0, 0});
        bigNumber2.setNumber(new int[]{5, 4, 0, 0, 0, 0, 0, 0, 1});

        System.out.println(Arrays.toString(bigNumber.getDifference(bigNumber2)));
    }
    public static void main(String[] args) {
        //Ex1();
        //Ex2();
        Ex3();
    }


}