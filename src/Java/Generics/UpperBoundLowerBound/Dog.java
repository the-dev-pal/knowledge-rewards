package Java.Generics.UpperBoundLowerBound;

import java.util.List;

public class Dog extends Animal{

    public static void dogsShelter(List<? super Dog> animal){
        System.out.println("Animal Farm");
    }

}
