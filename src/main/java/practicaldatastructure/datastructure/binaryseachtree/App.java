package practicaldatastructure.datastructure.binaryseachtree;

public class App {

    public static void main(String[] args) {

        example3();
        //example2();
        //example1();

    }

    private static void example3() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(38, "38");
        binarySearchTree.insert(26, "26");
        binarySearchTree.insert(72, "72");
        binarySearchTree.insert(55, "55");
        binarySearchTree.insert(41, "41");
        binarySearchTree.insert(60, "60");
        binarySearchTree.insert(43, "43");
        binarySearchTree.insert(90, "90");
        binarySearchTree.insert(78, "78");
        binarySearchTree.insert(74, "74");
        binarySearchTree.insert(92, "92");

        System.out.println("===============");
        System.out.println("Root node is: " + binarySearchTree.rootNode.key);
        binarySearchTree.printBinarySearchTree(binarySearchTree.rootNode, "ROOT", 1);
        System.out.println("Min: " + binarySearchTree.findMin());

        System.out.println("===============");
        binarySearchTree.remove(38);
        binarySearchTree.remove(26);
        System.out.println("After remove 38 and 26");
        System.out.println("===============");
        System.out.println("Root node is: " + (binarySearchTree.rootNode == null ? "null" : binarySearchTree.rootNode.key));
        binarySearchTree.printBinarySearchTree(binarySearchTree.rootNode, "ROOT", 1);
        System.out.println("Min: " + binarySearchTree.findMin());
    }

    private static void example2() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(40, "forty");

        System.out.println("===============");
        System.out.println("Root node is: " + binarySearchTree.rootNode.key);
        binarySearchTree.printBinarySearchTree(binarySearchTree.rootNode, "ROOT", 1);

        System.out.println("===============");
        binarySearchTree.remove(40);
        System.out.println("After remove 40");
        System.out.println("===============");
        System.out.println("Root node is: " + (binarySearchTree.rootNode == null ? "null" : binarySearchTree.rootNode.key));
        binarySearchTree.printBinarySearchTree(binarySearchTree.rootNode, "ROOT", 1);

        binarySearchTree.insert(10, "ten");
        binarySearchTree.insert(100, "hundred");
        binarySearchTree.insert(70, "seventy");
        binarySearchTree.insert(500, "hundred");
        binarySearchTree.insert(40, "forty");

        System.out.println("===============");
        System.out.println("Root node is: " + (binarySearchTree.rootNode == null ? "null" : binarySearchTree.rootNode.key));
        binarySearchTree.printBinarySearchTree(binarySearchTree.rootNode, "ROOT", 1);

        System.out.println("===============");
        binarySearchTree.remove(10);
        System.out.println("After remove 10");
        System.out.println("===============");
        System.out.println("Root node is: " + (binarySearchTree.rootNode == null ? "null" : binarySearchTree.rootNode.key));
        binarySearchTree.printBinarySearchTree(binarySearchTree.rootNode, "ROOT", 1);
    }

    private static void example1() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(40, "forty");
        binarySearchTree.insert(30, "thirty");
        binarySearchTree.insert(10, "ten");
        binarySearchTree.insert(100, "hundred");
        binarySearchTree.insert(70, "seventy");

        System.out.println("===============");
        System.out.println("Root node is: " + binarySearchTree.rootNode.key);
        binarySearchTree.printBinarySearchTree(binarySearchTree.rootNode, "ROOT", 1);

        System.out.println("Min: " + binarySearchTree.findMin());
        System.out.println("Max: " + binarySearchTree.findMax());

        binarySearchTree.insert(200, "two hundred");
        System.out.println("Max after insert 200: " + binarySearchTree.findMax());

        System.out.println("===============");
        System.out.println("Root node is: " + binarySearchTree.rootNode.key);
        binarySearchTree.printBinarySearchTree(binarySearchTree.rootNode, "ROOT", 1);

        int searchKey = 100;
        Node node = binarySearchTree.findNode(binarySearchTree.rootNode, searchKey);
        System.out.println(node == null ? "Node not found for key: " + searchKey : "Node found: " + node);
        System.out.println("Key " + searchKey + " node is leaf node: " + binarySearchTree.isLeafNode(node));


        System.out.println("Removed " + 40 + ": " + binarySearchTree.remove(40));
        node = binarySearchTree.findNode(binarySearchTree.rootNode, 40);
        System.out.println(node == null ? "After remove: Node not found for key: " + 40 : "After remove: Node found: " + node);

        System.out.println("===============");
        System.out.println("Root node is: " + binarySearchTree.rootNode.key);
        binarySearchTree.printBinarySearchTree(binarySearchTree.rootNode, "ROOT", 1);

        System.out.println("===============");
        binarySearchTree.insert(40, "forty");
        System.out.println("Root node is: " + binarySearchTree.rootNode.key);
        binarySearchTree.printBinarySearchTree(binarySearchTree.rootNode, "ROOT", 1);

        System.out.println("===============");
        binarySearchTree.remove(200);
        System.out.println("After remove 200");
        System.out.println("===============");
        System.out.println("Root node is: " + binarySearchTree.rootNode.key);
        binarySearchTree.printBinarySearchTree(binarySearchTree.rootNode, "ROOT", 1);
    }
}
