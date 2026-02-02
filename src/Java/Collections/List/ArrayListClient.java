package Java.Collections.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClient {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();

        myList.add(11);
        myList.add(33);
        myList.add(44);

        myList.add(1, 22);

        myList.remove(Integer.valueOf(44));
        myList.remove(2);

        myList.set(0, 55);

        System.out.println(myList);
    }

}
