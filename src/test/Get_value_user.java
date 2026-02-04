package test;

import java.util.Scanner;

public class Get_value_user {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number : ");
        String a =scan.nextLine();
        System.out.println("The user entered number is : " +a);
    }
}
