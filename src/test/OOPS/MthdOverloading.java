package test.OOPS;
// -- method overloading which having methods with same name with different arguments
public class MthdOverloading {
    void addition(){
        int a=20;
        int b=10;
        int c=a+b;
        System.out.println("result is : "+c);
    }

    void addition(int a, int b){
        System.out.println("Result : "+a+b);
    }
    void addition(String a){
        System.out.println("Hello " + a);
    }
    public static void main(String[] args) {
        MthdOverloading caller=new MthdOverloading();
        caller.addition();
        caller.addition(1,67);
        caller.addition("Hari");
    }
}
