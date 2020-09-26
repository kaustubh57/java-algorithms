package practicaldatastructure.datastructure.binaryseachtree;

public class Node {

    public int key;
    public String value;

    Node lhNode;
    Node rhNode;

    public Node(int key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", value='" + value + '\'' +
                '}';
    }
}
