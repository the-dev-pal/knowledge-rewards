package Java.Generics.UpperBoundLowerBound;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundLowerBoundClient {

    public static void doSomething(List<?> objects){
        System.out.println("Method accepting unbounded type parameter.");
    }

    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();
        List<Animal> animals = new ArrayList<>();

        // Upper bound
        Animal.doSomething(dogs);
        // Lower Bound
        Dog.dogsShelter(animals);

        // Unbounded Type
        doSomething(dogs);
        doSomething(animals);

    }

}
