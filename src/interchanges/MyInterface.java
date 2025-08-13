package interchanges;

public interface MyInterface {
    //Abstract method(Must be override by implementation classes)
    void abstractMethod();

    //Default method(optional to override)
    default void defaultMethod(){
        System.out.println("This is the default method in interface.");
    }

    //Static method(called using interface name)
    static void staticMethod(){
        System.out.println("This is the static method in interface.");

    }



}
