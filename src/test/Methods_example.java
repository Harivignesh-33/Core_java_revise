package test;

public class Methods_example {
    void addition(){
        int a=10;
        int b=12;
        System.out.println(a+b);
    }

    void addition(int a, int b){
        System.out.println(a+b);
    }

    void str(String a, String b){
        System.out.println(a+b);
    }

    int add(int a,int b){
        int c=a+b;
        return c;
    }

    public static void main(String[] args) {
        Methods_example caller=new Methods_example();
        //  method without argument
        caller.addition();
//        method with argument
        caller.addition(4,8);
//        String method
        caller.str("hello"," World");
//        Return method
        int x=caller.add(1,3);
        System.out.println(x);
    }
}
