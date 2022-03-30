package dhtchord;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args) {
        Music m1 = new Music("Alice in Chains", "Would?");
        Music m2 = new Music("Mad Season", "Wake up");
        Music m3 = new Music("PJ", "Do the Evolution");
        Music m4 = new Music("RadioHead", "Creep");
        Music m5 = new Music("Metallica","Enter Sandman");

        List<Music> l1 = new ArrayList<>();
        l1.add(m4);
        Node n1 = new Node(l1);

        List<Music> l2 = new ArrayList<>();
        l2.add(m3);
        Node n2 = new Node(l2);

        List<Music> l3 = new ArrayList<>();
        l3.add(m2);
        Node n3 = new Node(l3);

        List<Music> l4 = new ArrayList<>();
        l4.add(m1);
        l4.add(m5);
        Node n4 = new Node(l4);


        ListNode ring = new ListNode();
        ring.add(n1);
        ring.add(n2);
        ring.add(n3);
        ring.add(n4);

        System.out.println(ring.succ());
        System.out.println(ring.succ());
        System.out.println(ring.succ());
        System.out.println(ring.succ());
        System.out.println(ring.succ());

    }


}
