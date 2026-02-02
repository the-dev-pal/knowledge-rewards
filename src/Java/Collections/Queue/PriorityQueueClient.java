package Java.Collections.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueClient {

    public static void main(String[] args) {

        Queue<MusicPlayList> myPlayList = new PriorityQueue<>();

        myPlayList.offer(new MusicPlayList("DSP", 3));
        myPlayList.offer(new MusicPlayList("Rahman", 1));
        myPlayList.offer(new MusicPlayList("Anirudh", 2));

        while (!myPlayList.isEmpty()){
            System.out.println(myPlayList.poll());
        }

    }

}
