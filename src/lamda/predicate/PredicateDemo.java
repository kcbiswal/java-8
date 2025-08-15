package lamda.predicate;

import java.util.function.Predicate;

public class PredicateDemo {
    //logic without lambda
//    public boolean test(int i){
//        if (i>10){
//            return true;
//        }else {
//            return false;
//        }
//    }

    public static void main(String[] args) {
        //with lambda
       Predicate <Integer>p= i->i>10;
        System.out.println( p.test(5));

    }
}
