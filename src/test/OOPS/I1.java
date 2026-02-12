package test.OOPS;

public interface I1 {
    void add();
    void sub();
    void mul();
    void test();
}
interface I2{
    void div();
    void mod();
}
class Child implements I1 , I2{

    public void add(){
        System.out.println("Add");
    }
    public void sub(){
        System.out.println("sub");
    }
    public void mul(){
        System.out.println("mul");
    }
    public void test(){
        System.out.println("Test");
    }

    public void mod(){
        System.out.println("Mod");
    }

    public void div() {
        System.out.println("div");
    }

    public static void main(String[] args) {
        Child obj=new Child();
        obj.add();
        obj.sub();
        obj.test();
        obj.mul();
        obj.add();
    }
}
