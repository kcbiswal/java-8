package lamda;

public class MyAppOne {
    public static void main(String[] args) {
        MyInterfaceOne mio = () -> System.out.println("this is mi method");
        mio.m1();
    }
}
