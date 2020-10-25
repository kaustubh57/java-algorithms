package myexperiments.binarysearchtree;

public class App {

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree(45);
//        binarySearchTree.insert(23);
        binarySearchTree.insert(57);
//        binarySearchTree.insert(89);
//        binarySearchTree.insert(50);
//        binarySearchTree.insert(10);
//        binarySearchTree.insert(27);
//        binarySearchTree.insert(100);
//        binarySearchTree.insert(52);
//        binarySearchTree.insert(56);

        //
        binarySearchTree.printBinarySearchTree(binarySearchTree.root, 0, 0, "ROOT");

        System.out.println("======lookup======");
        System.out.println(binarySearchTree.lookup(57));

        System.out.println("======remove======");
        System.out.println(binarySearchTree.remove(45));
        System.out.println(binarySearchTree.remove(57));
        System.out.println(binarySearchTree.remove(145));
        binarySearchTree.printBinarySearchTree(binarySearchTree.root, 0, 0, "ROOT");
    }
}
