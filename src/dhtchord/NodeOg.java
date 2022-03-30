package dhtchord;

import java.util.ArrayList;

public class NodeOg {
    private int key, next;
    private Boolean active;
    private ArrayList<NodeOg> musics;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getNext() {
        return next;
   }

    public void setNext(int next) {
        this.next = next;
    }

    public boolean isActive() {
        return active;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void setMusics(ArrayList<NodeOg> musics) {
        this.musics = musics;
    }

    public ArrayList<NodeOg> getMusics() {
        return musics;
    }

    public void setActive(boolean active) {
        this.active = active;
    }



}