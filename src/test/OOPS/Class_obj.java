package test.OOPS;

public class Class_obj {
//    A class is a blueprint
//    an obj is an instance of the class
    String name;
    int mark;
        void room(String name,int mark){
            this.name=name;
            this.mark=mark;
        }
        void display(){
            System.out.println("My name is "+ name +" my mark is "+ mark);
        }
    public static void main(String[] args) {
        Class_obj classObj=new Class_obj();
        classObj.room("Hari",90);
        classObj.room("Arun",92);
        classObj.display();
    }
}
