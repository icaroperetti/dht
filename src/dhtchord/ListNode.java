package dhtchord;

import java.util.ArrayList;
import java.util.List;

public class ListNode {
    private List<Node> nodes;
    //private int ringSize;
    private int currentNode;

    public ListNode(){
        this.nodes = new ArrayList<>();
        //int ringSize = 0;
        int currentNode = -1;
    }

    public void add(Node node){
        this.nodes.add(node);
    }

    public Node get(int i){
        return this.nodes.get(i);
    }

    public int succ(){
        if(this.currentNode + 1 >=  this.nodes.size()){
            this.currentNode = 0;
        } else{
            this.currentNode++;
        }
        return this.currentNode;
    }
}
