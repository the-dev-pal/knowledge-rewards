package Java.Generics.UpperBoundLowerBound;

import java.util.List;

public class Animal {

    public static void doSomething(List<? extends Animal> dogs){
        System.out.println("Dogs shelter");
    }

}
