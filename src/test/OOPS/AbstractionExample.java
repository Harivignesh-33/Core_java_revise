package test.OOPS;

abstract class AbstractionExample {
    abstract void add();

    abstract void sub();

    abstract void mul();

    void test() {
        System.out.println("Test");
    }
//    you can't   create objects for abstract  classes
}

class child extends AbstractionExample {

    @Override
    void add() {
        System.out.println("add");
    }

    @Override
    void sub() {
        System.out.println("sub");
    }

    @Override
    void mul() {
        System.out.println("mul");
    }

    @Override
    void test() {
        System.out.println("Child test");
    }

    public static void main(String[] args) {
        child obj = new child();
        obj.add();
        obj.mul();
        obj.sub();
        obj.test();
    }
}
