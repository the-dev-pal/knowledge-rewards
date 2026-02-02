package Java.Collections;

public class Client {

    public static void main(String[] args) {
        MyGenericList<Integer> myGenericList = new MyGenericList<>();

        myGenericList.add(11);
        myGenericList.add(12);
        myGenericList.add(13);

//        Iterator<Integer> iterator = myGenericList.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        // We replaced above three lines of code with for-each loop.
        for(int element: myGenericList){
            System.out.println(element);
        }
    }

}
