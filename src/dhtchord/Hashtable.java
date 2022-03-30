package dhtchord;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Hashtable {
    private static ArrayList<NodeOg> activeNodes = new ArrayList<>();
    private static StringBuilder actives = new StringBuilder();
    private static StringBuilder inactives = new StringBuilder();
    private static Map<Integer, NodeOg> ring;
    private static ArrayList arrayList;

    public Hashtable() throws IOException {
        ring = new HashMap<Integer, NodeOg>();
    }


}



