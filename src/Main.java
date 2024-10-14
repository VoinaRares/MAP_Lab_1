import Ex1.GradeService;
import Ex2.Array;
import Ex3.BigNumber;
import Ex4.Keyboard;
import Ex4.Shop;
import Ex4.ShopItem;
import Ex4.USBDrive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        //Ex 3.1
        BigNumber bigNumber = new BigNumber(new int[]{1, 3, 0, 0, 0, 0, 0, 0, 0});
        BigNumber bigNumber2 = new BigNumber(new int[]{8, 7, 0, 0, 0, 0, 0, 0, 0});
        System.out.println(Arrays.toString(bigNumber.getSum(bigNumber2)));

        //Ex 3.2
        bigNumber.setNumber(new int[]{8, 3, 0, 0, 0, 0, 0, 0, 0});
        bigNumber2.setNumber(new int[]{5, 4, 0, 0, 0, 0, 0, 0, 1});

        System.out.println(Arrays.toString(bigNumber.getDifference(bigNumber2)));

        //Ex 3.3
        bigNumber2.setNumber(new int[]{2, 3, 6, 0, 0, 0, 0, 0, 1});
        System.out.println(Arrays.toString(bigNumber2.getMultiplication(2)));

        //Ex 3.4
        System.out.println(Arrays.toString(bigNumber2.getDivision(2)));
    }

    public static void Ex4(){
        Shop shop = new Shop();
        //Ex 4.1
        List<ShopItem> items = new ArrayList<>();
        Keyboard k1 = new Keyboard(40);
        Keyboard k2 = new Keyboard(35);
        Keyboard k3 = new Keyboard(70);
        Keyboard k4 = new Keyboard(15);
        Keyboard k5 = new Keyboard(45);
        items.add(k1);
        items.add(k2);
        items.add(k3);
        items.add(k4);
        items.add(k5);

        USBDrive usb1 = new USBDrive(12);
        USBDrive usb2 = new USBDrive(40);
        items.add(usb1);
        items.add(usb2);

        shop.setItems(items);
        System.out.println(shop.getCheapestKeyboard().getPrice());


        //Ex 4.2

        System.out.println(shop.getMostExpensiveItem().getPrice());

        //Ex 4.3
        System.out.println(shop.getMostExpensiveUSBDriveOnBudget(40).getPrice());


        //Ex 4.4

        System.out.println(shop.getKeyboardAndUSBUnderBudget(60));
        System.out.println(shop.getKeyboardAndUSBUnderBudget(100));
        System.out.println(shop.getKeyboardAndUSBUnderBudget(110));

    }

    public static void main(String[] args) {
        //Ex1();
        //Ex2();
        //Ex3();
        Ex4();
    }


}