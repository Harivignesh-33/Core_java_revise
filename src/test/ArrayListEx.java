package test;

import java.util.*;

public class ArrayListEx {


    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        //add elements to arraylist
        names.add("ken");
        names.add("john");
        names.add("ban");
//        Get particular element
        System.out.println(names.get(1));
//        replace particular index
        names.set(1, "kin");
        System.out.println("Arraylist : " + names);
//        delete  by index
        names.remove(1);
        System.out.println(names);

//        sort the array list
        ArrayList<Integer> num = new ArrayList<>();
        num.add(4);
        num.add(2);
        num.add(90);
        num.add(3);
//collection.sort() method  is used for all common lists  , Array list stores the data and collections  manages the data
        Collections.sort(num);
        System.out.println(num);
//        find the index number of particular values
        System.out.println(names.indexOf("ban"));
    }

}
