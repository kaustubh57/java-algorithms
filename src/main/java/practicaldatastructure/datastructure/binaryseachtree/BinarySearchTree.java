package practicaldatastructure.datastructure.binaryseachtree;

import java.util.HashMap;
import java.util.Map;

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
                if (key < parentNode.key) {
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
        return findMinFromNode(rootNode);
    }

    private Node findMinFromNode(Node node) {
        Node toReturn = node;

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

    public boolean remove(int key) {
        Node currentNode = rootNode;
        Node parentNode = null;

        boolean isLHNode = false;

        while (currentNode != null) {
            if (currentNode.key == key) {
                break;
            } else {
                parentNode = currentNode;
                if (currentNode.key > key) {
                    currentNode = currentNode.lhNode;
                    isLHNode = true;
                } else {
                    currentNode = currentNode.rhNode;
                    isLHNode = false;
                }
            }
        }

        if (currentNode == null) {
            return false;
        } else if (parentNode == null) {
            if (rootNode.rhNode != null) {
                rootNode = getReplacedNodeWithLinking(rootNode);
            } else {
                rootNode = rootNode.lhNode;
            }
            return true;
        } else {
            if (isLeafNode(currentNode)) {
                if (isLHNode) {
                    parentNode.lhNode = null;
                } else {
                    parentNode.rhNode = null;
                }
            } else if (currentNode.rhNode == null) {
                if (isLHNode) {
                    parentNode.lhNode = currentNode.lhNode;
                } else {
                    parentNode.rhNode = currentNode.lhNode;
                }
            } else if (currentNode.lhNode == null) {
                if (isLHNode) {
                    parentNode.lhNode = currentNode.rhNode;
                } else {
                    parentNode.rhNode = currentNode.rhNode;
                }
            } else {
                Node nodeToReplace = getReplacedNodeWithLinking(currentNode);
                if (isLHNode) {
                    parentNode.lhNode = nodeToReplace;
                } else {
                    parentNode.rhNode = nodeToReplace;
                }
            }
            return true;
        }
    }

    private Node getReplacedNodeWithLinking(Node node) {
        Node findMinToReplace = findMinFromNode(node.rhNode);
        if (findMinToReplace != null) {
            remove(findMinToReplace.key);
            findMinToReplace.lhNode = node.lhNode;
            findMinToReplace.rhNode = node.rhNode;
        }
        return findMinToReplace;
    }

    private Map<Integer, String> printTreeLevelMap;

    public void printBinarySearchTree(Node node, String type, int currentLevel) {
        if (type.equals("ROOT")) {
            printTreeLevelMap = new HashMap<>();
        }
        if (node == null) {
            System.out.println("Empty tree!");
            return;
        }

        if (node.lhNode != null) {
            printBinarySearchTree(node.lhNode, "LH", currentLevel + 1);
        } else {
            addNodeValueToPrintMap(currentLevel + 1, "-");
        }

        if (node.rhNode != null) {
            printBinarySearchTree(node.rhNode, "RH", currentLevel + 1);
        } else {
            addNodeValueToPrintMap(currentLevel + 1, "-");
        }

        addNodeValueToPrintMap(currentLevel, "" + node.key);

        if (type.equals("ROOT")) {
            for (String printLine : printTreeLevelMap.values()) {
                System.out.println(printLine);
            }
        }

    }

    private void addNodeValueToPrintMap(int currentLevel, String value) {
        if (printTreeLevelMap.get(currentLevel) == null) {
            printTreeLevelMap.put(currentLevel, "(" + value + ")");
        } else {
            printTreeLevelMap.put(currentLevel, printTreeLevelMap.get(currentLevel) + " (" + value + ")");
        }
    }
}
