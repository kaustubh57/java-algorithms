package practicaldatastructure.datastructure.binaryseachtree;

public class BinarySearchTree {

    public Node rootNode;

    public void insert(int key, String value) {

        if (rootNode == null) {
            rootNode = new Node(key, value);
        } else {
            Node parentNode;
            Node currentNode = rootNode;
            while (true) {
                parentNode = currentNode;
                if (key <= parentNode.key) {
                    currentNode = parentNode.lhNode;
                    if (currentNode == null) {
                        parentNode.lhNode = new Node(key, value);
                        break;
                    }
                } else {
                    currentNode = parentNode.rhNode;
                    if (currentNode == null) {
                        parentNode.rhNode = new Node(key, value);
                        break;
                    }
                }
            }
        }
    }

    public Node findMin() {
        Node toReturn = rootNode;

        while (toReturn != null && toReturn.lhNode != null) {
            toReturn = toReturn.lhNode;
        }

        return toReturn;
    }

    public Node findMax() {
        Node toReturn = rootNode;

        while (toReturn != null && toReturn.rhNode != null) {
            toReturn = toReturn.rhNode;
        }

        return toReturn;
    }

    public Node findNode(Node parentNode, int key) {
        if (parentNode == null) {
            return null;
        }

        if (parentNode.key == key) {
            return parentNode;
        }

        Node toReturn = null;
        if (parentNode.lhNode != null) {
            toReturn = findNode(parentNode.lhNode, key);
        }
        if (toReturn == null && parentNode.rhNode != null) {
            toReturn = findNode(parentNode.rhNode, key);
        }

        return toReturn;
    }

    public boolean isLeafNode(Node node) {
        return node == null || (node.lhNode == null && node.rhNode == null);
    }
}
