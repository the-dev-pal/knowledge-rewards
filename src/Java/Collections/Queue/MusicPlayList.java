package Java.Collections.Queue;

public class MusicPlayList implements Comparable<MusicPlayList>{
    String MusicDirector;
    int views;

    public MusicPlayList(String musicDirector, int views) {
        MusicDirector = musicDirector;
        this.views = views;
    }

    @Override
    public int compareTo(MusicPlayList musicPlayList) {
        return Integer.compare(musicPlayList.views, this.views);
    }

    @Override
    public String toString() {
        return "MusicPlayList{" +
                "MusicDirector='" + MusicDirector + '\'' +
                ", views=" + views +
                '}';
    }
}
