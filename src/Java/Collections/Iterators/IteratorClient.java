package Java.Collections.Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorClient {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        List<Integer> myNewList = new CopyOnWriteArrayList<>();

        myList.add(123);
        myList.add(234);
        myList.add(345);

        Iterator<Integer> myIterator = myList.iterator();
        while(myIterator.hasNext()){
            System.out.println(myIterator.next());

            // This will throw ConcurrentModificationException,
            // as the compiler detects modifications during iteration (Fail-Fast)
            myList.add(456);
        }
        System.out.println("======");
        for (int element: myList){
            System.out.println(element);
        }

        // Concurrent Collection Classes (from java.util.concurrent package)
        myNewList.add(123);
        myNewList.add(234);
        myNewList.add(345);

        Iterator<Integer> myConcurrentIterator = myNewList.iterator();
        while(myConcurrentIterator.hasNext()){
            System.out.println(myConcurrentIterator.next());

            // This doesn't throw any Exception, but the modification will reflect after the
            // successful iteration.
            myNewList.add(456);
        }
        System.out.println("======");
        for (int element: myNewList){
            System.out.println(element);
        }

    }

}
