//Scope.java
//Scope class demonstrates fields and local variable scopes

public class Scope{
    //field that is accesible to all methods of this class
    private static int x = 1;

    //method main creates and initializes local variable x
    //and calls methods useLocalVariable and useField

    public static void main(String [] args){
        int x = 5; //method's local variable x shadows field x
        System.out.printf("local x in main is %d%n", x);

        useLocalVariable();
        useField();
        useLocalVariable();
        useField();

        System.out.printf("%nlocal x in main is %d%n", x);
    }

    //create and initialize local variable x during each call
    public static void useLocalVariable(){
        int x = 25;

        System.out.printf("%nlocal variable x on entering method useLocalVariable is %d%n", x);
        ++x;
        System.out.printf("local variable x before exiting method useLocalVariable is %d%n", x);
    }
    //modify class Scope's field x during each call
    public static void useField(){
        System.out.printf("%nfield x on entering method useField is %d%n", x);
        x *= 10;
        System.out.printf("field x before exiting method useField is %d%n", x);

    }
}