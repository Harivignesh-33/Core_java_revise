package test;

// collection of data  within same type
public class Array {

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4};
        String[] name = {"hari", "arun", "gowtham", "naveen"};
        // name[0]="hari"
        // name[1]="arun"
        // name[2]="gowtham"
        // name[3]="naveen"

        String[] state = new String[4];

        state[0] = "tn";
        state[1] = "kl";

        for (String i : name) {
            System.out.println(i);
        }
        System.out.println(name.length);
        System.out.println(num.length);

        String data="1,hari,male,phone,10000";
        String[] a =data.split(",");

        System.out.println(a[1]+" "+a[4]);
    }
}
