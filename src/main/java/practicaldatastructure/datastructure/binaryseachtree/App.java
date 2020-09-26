package practicaldatastructure.datastructure.binaryseachtree;

public class App {

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(40, "forty");
        binarySearchTree.insert(30, "thirty");
        binarySearchTree.insert(10, "ten");
        binarySearchTree.insert(100, "hundred");
        binarySearchTree.insert(70, "seventy");

        System.out.println("Min: " + binarySearchTree.findMin());
        System.out.println("Max: " + binarySearchTree.findMax());

        binarySearchTree.insert(200, "two hundred");
        System.out.println("Max: " + binarySearchTree.findMax());

        int searchKey = 100;
        Node node = binarySearchTree.findNode(binarySearchTree.rootNode, searchKey);
        System.out.println(node == null ? "Node not found for key: " + searchKey : "Node found: " + node);

        System.out.println("Key " + searchKey + " node is leaf node: " + binarySearchTree.isLeafNode(node));
    }
}
