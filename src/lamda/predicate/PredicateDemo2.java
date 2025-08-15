package lamda.predicate;

import java.util.function.Predicate;

public class PredicateDemo2 {
    public static void main(String[] args) {
        //Declare names in an array and print names which is starting with "A" using lambdabexpression.


     String []names={"Anushka","Anupama","Pooja","Sefali","Deepika"};

        Predicate<String>p=name->name.charAt(0)=='A';

        for (String name:names){
            if (p.test(name)){
                System.out.println(name);
            }
        }
    }
}
