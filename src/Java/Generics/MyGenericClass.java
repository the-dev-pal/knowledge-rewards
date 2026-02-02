package Java.Generics;

public class MyGenericClass <T,V>{

    T firstParameter;
    V secondParameter;

    public T getFirstParameter() {
        return firstParameter;
    }

    public void setFirstParameter(T firstParameter) {
        this.firstParameter = firstParameter;
    }

    public V getSecondParameter() {
        return secondParameter;
    }

    public void setSecondParameter(V secondParameter) {
        this.secondParameter = secondParameter;
    }

    public static <A,B> void myGenericStaticMethod(A a, B b){
        System.out.println("Generic static method");
        System.out.println(a);
        System.out.println(b);
    }

    public void myGenericMethod(T t, V v){
        System.out.println("Generic method");
        System.out.println(t);
        System.out.println(v);
    }

}
