package Java.Collections.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueClient {

    public static void main(String[] args) {

        Queue<MusicPlayList> myPlayList = new PriorityQueue<>();
        Queue<String> myPriorityQueue = new PriorityQueue<>();
        Queue<Movies> myMovies = new PriorityQueue<>(new Movies());
        Queue<Students> myStudents = new PriorityQueue<>();

        // By default, the elements are in natural order (ascending order)
        myPriorityQueue.offer("vishnu");
        myPriorityQueue.offer("kalyan");
        myPriorityQueue.offer("prasad");
        myPriorityQueue.offer("anji");

        while (!myPriorityQueue.isEmpty()){
            System.out.println(myPriorityQueue.poll());
        }

        System.out.println("===============");
        // Elements are fetched based on the priority mentioned using comparable interface.
        myPlayList.offer(new MusicPlayList("DSP", 500));
        myPlayList.offer(new MusicPlayList("Rahman", 900));
        myPlayList.offer(new MusicPlayList("Anirudh", 700));
        myPlayList.offer(new MusicPlayList("Arjith", 900));

        while (!myPlayList.isEmpty()){
            System.out.println(myPlayList.poll());
        }

        System.out.println("============");
        // Elements are fetched based on the priority mentioned using comparator object.
        myMovies.offer(new Movies("ABC", 4));
        myMovies.offer(new Movies("DEF", 2));
        myMovies.offer(new Movies("GHI", 5));
        myMovies.offer(new Movies("XYZ", 1));

        while (!myMovies.isEmpty()){
            System.out.println(myMovies.poll());
        }

        System.out.println("===========");
        // Elements without any Comparable or Comparator
        /* This will throw a ClassCastExcpetion, as no pririty provided through either
         Comparable or Comparator */
        myStudents.offer(new Students("English", 87));
        myStudents.offer(new Students("English", 60));
        myStudents.offer(new Students("English", 25));
        myStudents.offer(new Students("English", 98));

        while (!myStudents.isEmpty()){
            System.out.println(myMovies.poll());
        }

    }

}
