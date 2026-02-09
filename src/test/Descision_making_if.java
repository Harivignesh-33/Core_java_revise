package test;

public class Descision_making_if {
//    simple if
//    if else
//    if else if
//    nested if


    //    simple if
    public static void main(String[] args) {
        int a = 70;
        if (a > 40) {
            System.out.println("Pass");
        }

//        if-else
        a = 40;
        if (a < 40) {
            System.out.println("Pass");
        } else if (a == 40) {
            System.out.println("Just pass");
        } else {
            System.out.println("Fail");
        }

        int num = 100;
        if (num <= 100) {
            System.out.println("The entered num is less than 100");
            if (num > 50) {
                System.out.println("The number is greater than 50");
            }
        } else {
            System.out.println("The num is greater than 100");
        }
    }
}
