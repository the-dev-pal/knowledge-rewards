package Java.Generics;

public class Clinet {

    public static void main(String[] args) {

        MyGenericClass<Integer, String> myFirstGeneric = new MyGenericClass<>();
        MyGenericClass<Double, Boolean> mySecondGeneric = new MyGenericClass<>();

        // First Generic with specific types
        myFirstGeneric.setFirstParameter(123);
        myFirstGeneric.setSecondParameter("context");

        System.out.println(myFirstGeneric.getFirstParameter());
        System.out.println(myFirstGeneric.getSecondParameter());

        // Second Generic with specific types
        mySecondGeneric.setFirstParameter(123.45);
        mySecondGeneric.setSecondParameter(false);

        MyGenericClass.myGenericStaticMethod("context", 123);
        MyGenericClass.myGenericStaticMethod(123, "context");
        MyGenericClass.myGenericStaticMethod(123.45, true);

        mySecondGeneric.myGenericMethod(123.45, true);

        // The below call will show us the compile-time error as the type are mismatch.
        //mySecondGeneric.myGenericMethod("context", 123);

    }

}
