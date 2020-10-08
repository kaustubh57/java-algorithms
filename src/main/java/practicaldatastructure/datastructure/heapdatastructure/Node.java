package practicaldatastructure.datastructure.heapdatastructure;

import lombok.Getter;
import lombok.Setter;

public class Node {

    @Getter
    @Setter
    private int key;

    public Node(int key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                '}';
    }
}
