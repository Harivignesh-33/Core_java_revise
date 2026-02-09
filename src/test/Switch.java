package test;

public class Switch {
    public static void main(String[] args) {
        int number=33;
        String size;

        switch (number){
            case 29:
                size="small";
                break;
            case 42:
                size ="medium";
                break;
            case 33:
                size="med";
                break;
            case 99:
                size="large";
                break;
            default:
                size="undefined";
                break;
        }
        System.out.println(size);
    }
}
