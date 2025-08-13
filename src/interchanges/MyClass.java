package interchanges;

public class MyClass implements MyInterface{
    @Override
    public void abstractMethod() {
        System.out.println("abstract method implemented in myclass");
    }

    @Override
    public void defaultMethod() {
//        System.out.println("override default method in implementetion class");
    }
}
