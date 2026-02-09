package test.OOPS;

public class Class_obj {
//    A class is a blueprint
//    an obj is a instance of the class
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
        classObj.room("hari",90);
        classObj.room("arun",92);
        classObj.display();
    }
}
