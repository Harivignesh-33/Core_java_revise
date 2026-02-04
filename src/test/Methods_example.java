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

    public static void main(String[] args) {
        Methods_example caller=new Methods_example();
        caller.addition();

        Methods_example arg_method = new Methods_example();
        arg_method.addition();
    }
}
