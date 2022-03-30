package dhtchord;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private List<Music> musics;

    public Node() {
        this.musics = new ArrayList<>();
    }

    public Node(List<Music> musics){
        this.musics = musics;
    }

    public List<Music> getMusics() {
        return musics;
    }
}
