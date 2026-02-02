package Java.Collections;

import java.util.Iterator;

public class MyGenericList<T> implements Iterable<T>{

    private T[] elements;
    private int size;

    public MyGenericList() {
        this.elements = (T[])new Object[50];
        this.size = 0;
    }

    public void add(T element){
        elements[this.size++] = element;
    }

    public T getElementAtIndex(int index){
        return elements[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new MyGenericListIterator(this);
    }

    private class MyGenericListIterator implements Iterator<T>{

        private MyGenericList<T> myGenericList;
        private int index = 0;

        public MyGenericListIterator(MyGenericList<T> myGenericList){
            this.myGenericList = myGenericList;
        }

        @Override
        public boolean hasNext() {
            System.out.println("hasNext() called");
            return index < myGenericList.size;
        }

        @Override
        public T next() {
            System.out.println("next() called");
            return myGenericList.elements[index++];
        }
    }
}
