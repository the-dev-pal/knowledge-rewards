package Java.Collections.Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListIteratorClient {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        List<Integer> myNewList = new CopyOnWriteArrayList<>();

        myList.add(123);
        myList.add(234);
        myList.add(345);

        // ListIterator<E> with normal List<E> (from java.util package) implementations
        ListIterator<Integer> listIterator = myList.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());

            // This doesn't throw any Exception, but the modification will reflect after the
            // successful iteration.
            listIterator.add(456);
        }
        System.out.println("======");
        for (int element: myList){
            System.out.println(element);
        }

        // Concurrent Collection Classes (from java.util.concurrent package)
        myNewList.add(123);
        myNewList.add(234);
        myNewList.add(345);

        // Using ListIterator<E>
        ListIterator<Integer> myConcurrentListIterator = myNewList.listIterator();
        while(myConcurrentListIterator.hasNext()){
            System.out.println(myConcurrentListIterator.next());

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
