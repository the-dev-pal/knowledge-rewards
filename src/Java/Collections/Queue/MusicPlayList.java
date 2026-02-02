package Java.Collections.Queue;

public class MusicPlayList implements Comparable<MusicPlayList>{
    String MusicDirector;
    int priority;

    public MusicPlayList(String musicDirector, int priority) {
        MusicDirector = musicDirector;
        this.priority = priority;
    }

    @Override
    public int compareTo(MusicPlayList musicPlayList) {
        return Integer.compare(this.priority, musicPlayList.priority);
    }

    @Override
    public String toString() {
        return "MusicPlayList{" +
                "MusicDirector='" + MusicDirector + '\'' +
                ", priority=" + priority +
                '}';
    }
}
