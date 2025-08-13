package interchanges;

public class Main {
    public static void main(String[] args) {
        MyClass obj=new MyClass();

        //call abstract method
        obj.abstractMethod();

        //call default method
        obj.defaultMethod();

        //call static method(only via interface name)
        MyInterface.staticMethod();


    }
}
