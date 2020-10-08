package practicaldatastructure.datastructure.heapdatastructure;

import java.util.Arrays;

public class Heap {

    private final Node[] heapArray;
    private final int maxSize;
    private int currentSize;

    public Heap(int size) {
        this.maxSize = size;
        this.currentSize = 0;
        heapArray = new Node[size];
    }

    public boolean insert(int key) {
        if (currentSize == maxSize) {
            return false;
        }

        Node nodeToInsert = new Node(key);
        if (currentSize == 0) {
            heapArray[0] = nodeToInsert;
        } else {
            Node parentNode;
            int parentIndex;
            heapArray[currentSize] = nodeToInsert;

            parentIndex = getParentIndex(currentSize);

            parentNode = heapArray[parentIndex];

            int indexToInsert = currentSize;

            while (parentNode.getKey() < nodeToInsert.getKey()) {
                heapArray[indexToInsert] = parentNode;
                heapArray[parentIndex] = nodeToInsert;

                if (parentIndex == 0) {
                    break;
                }

                indexToInsert = parentIndex;
                parentIndex = getParentIndex(parentIndex);
                parentNode = heapArray[parentIndex];
            }
        }
        currentSize++;
        return true;
    }

    public Node remove() {
        int nodeToUpdateIndex = 0;
        Node nodeToRemove = heapArray[nodeToUpdateIndex];
        currentSize--;

        if (currentSize == 0) {
            heapArray[nodeToUpdateIndex] = null;
            return nodeToRemove;
        }

        Node nodeToReplace = heapArray[currentSize];
        heapArray[nodeToUpdateIndex] = nodeToReplace;
        heapArray[currentSize] = null;

        do {
            int lChildIndex = getLeftChildIndex(nodeToUpdateIndex);
            int rChildIndex = getRightChildIndex(nodeToUpdateIndex);

            if (lChildIndex == -1 && rChildIndex == -1) {
                return nodeToRemove;
            } else if (rChildIndex == -1) {
                Node lChild = heapArray[lChildIndex];
                if (lChild != null && lChild.getKey() > nodeToReplace.getKey()) {
                    heapArray[nodeToUpdateIndex] = lChild;
                    heapArray[lChildIndex] = nodeToReplace;
                    nodeToUpdateIndex = lChildIndex;
                } else {
                    return nodeToRemove;
                }
            } else {
                Node lChild = heapArray[lChildIndex];
                Node rChild = heapArray[rChildIndex];

                if (lChild == null && rChild == null) {
                    return nodeToRemove;
                } else if (rChild == null) {
                    if (lChild.getKey() > nodeToReplace.getKey()) {
                        heapArray[nodeToUpdateIndex] = lChild;
                        heapArray[lChildIndex] = nodeToReplace;
                        nodeToUpdateIndex = lChildIndex;
                    } else {
                        return nodeToRemove;
                    }
                } else if (lChild != null) {
                    int toReplaceIndex = (lChild.getKey() > rChild.getKey()) ? lChildIndex : rChildIndex;
                    Node toReplaceChild = heapArray[toReplaceIndex];

                    if (toReplaceChild.getKey() > nodeToReplace.getKey()) {
                        heapArray[nodeToUpdateIndex] = toReplaceChild;
                        heapArray[toReplaceIndex] = nodeToReplace;
                        nodeToUpdateIndex = toReplaceIndex;
                    } else {
                        return nodeToRemove;
                    }
                } else {
                    return nodeToRemove;
                }
            }
        } while (true);
    }

    public Node findNode(int key) {
        int nodeIndex = findNodeIndex(key);
        if (nodeIndex == -1) {
            return null;
        }
        return heapArray[nodeIndex];
    }

    public int findNodeIndex(int key) {
        for (int i = 0; i < heapArray.length; i++) {
            Node node = heapArray[i];
            if (node != null && node.getKey() == key) {
                return i;
            }
        }
        return -1;
    }

    public int getSize() {
        return currentSize;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    private int getParentIndex(int nodeIndex) {
        return (int) Math.floor((nodeIndex - 1) / 2d);
    }

    private int getLeftChildIndex(int nodeIndex) {
        int lChildIndex = (nodeIndex * 2) + 1;
        return (lChildIndex > (currentSize - 1)) ? -1 : lChildIndex;
    }

    private int getRightChildIndex(int nodeIndex) {
        int rChildIndex = (nodeIndex * 2) + 2;
        return (rChildIndex > (currentSize - 1)) ? -1 : rChildIndex;
    }

    private int findParentLevel(int nodeIndex) {
        int parentLevel = 0;
        while (nodeIndex + 1 > calculatePowerTo2AndAdd(parentLevel)) {
            parentLevel++;
        }
        return parentLevel + 1;
    }

    private static int calculatePowerTo2AndAdd(int powerNumber) {
        if (powerNumber == 0) {
            return 1;
        }
        return getExponentValueFor2(powerNumber) + calculatePowerTo2AndAdd(powerNumber - 1);
    }

    private static int getExponentValueFor2(int exp) {
        if (exp == 0) {
            return 1;
        }
        return 2 * getExponentValueFor2(exp - 1);
    }

    private int getTotalLevels() {
        return findParentLevel(currentSize - 1) + 1;
    }

    private int getCurrentLevel(int nodeIndex) {
        return findParentLevel(nodeIndex - 1) + 1;
    }

    public void printHeapDataStructure() {
        System.out.println("[START]------------------");

        int totalLevels = getTotalLevels();
        int lastParentLevel = 0;
        for (int i = 0; i < heapArray.length; i++) {
            Node node = heapArray[i];

            if (node == null) {
                System.out.println("");
                System.out.println("[END]------------------");
                break;
            }

            int currentParentLevel = findParentLevel(i);

            if (currentParentLevel != lastParentLevel) {
                lastParentLevel = currentParentLevel;
                if (i != 0) {
                    System.out.println("");
                }
            }
            System.out.print(String.format("%1$" + ((totalLevels - currentParentLevel) * 3) + "s", "") + node.getKey());

            if (i == maxSize - 1) {
                System.out.println("");
                System.out.println("[END]------------------");
            }
        }
    }

    @Override
    public String toString() {
        return "Heap{" +
                "heapArray=" + Arrays.toString(heapArray) +
                ", maxSize=" + maxSize +
                ", currentSize=" + currentSize +
                '}';
    }
}
