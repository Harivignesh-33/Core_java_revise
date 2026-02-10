package test.OOPS;

public class Version1 {
    public void layout() {
        System.out.println("Version 1");
        System.out.println("Red color menu");
    }
}

class Version2 extends Version1 {
    public void layout2() {
        System.out.println("Version2");
        System.out.println("Yellow color menu");
    }
}
class Version3 extends Version2 {

    public void layout3()
    {
        System.out.println("Version3");
        System.out.println("Blue color menu");
    }

    public static void main(String[] args) {
        Version3 caller=new Version3();
        caller.layout();
        caller.layout2();
        caller.layout3();

    }
}