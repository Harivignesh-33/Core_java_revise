package test;

public class Exception_handle {
    public static void main(String[] args) {
//        try     - core logic
//        throw   -
//        catch   -
//        finally -
        try{
            int a=10/0;
            System.out.println(a);
        }
        catch(Exception e){
            System.out.println("Cannot divide by zero");
        }
        finally {
            System.out.println("Closing program");
        }
        System.out.println("Rest of the code");


    }
}
