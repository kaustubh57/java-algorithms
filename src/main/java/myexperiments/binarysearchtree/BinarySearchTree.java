package myexperiments.binarysearchtree;

public class BinarySearchTree {

    Node root;

    public BinarySearchTree(int value) {
        root = new Node(value);
    }

    public Node insert(int value) {
        Node newNode = new Node(value);

        Node currentNode = root;
        while (currentNode != null) {
            if (currentNode.value > value) {
                //left
                if (currentNode.left == null) {
                    currentNode.left = newNode;
                    break;
                }
                currentNode = currentNode.left;
            } else {
                //right
                if (currentNode.right == null) {
                    currentNode.right = newNode;
                    break;
                }
                currentNode = currentNode.right;
            }
        }

        return newNode;
    }

    public Node lookup(int value) {
        Node currentNode = root;

        while (currentNode != null) {
            if (currentNode.value == value) {
                return currentNode;
            } else if (currentNode.value > value) {
                currentNode = currentNode.left;
            } else {
                currentNode = currentNode.right;
            }
        }

        return null;
    }

    public Node remove(int value) {
        if (root == null || (root.value == value && root.left == null && root.right == null)) {
            root = null;
            return null;
        }

        Node parentNodeOfRemove = null;
        Node nodeToRemove = root;
        boolean isLeft = false;
        while (nodeToRemove != null && nodeToRemove.value != value) {
            parentNodeOfRemove = nodeToRemove;

            if (nodeToRemove.value > value) {
                nodeToRemove = nodeToRemove.left;
                isLeft = true;
            } else {
                nodeToRemove = nodeToRemove.right;
                isLeft = false;
            }
        }

        if (nodeToRemove != null) {
            //find node to replace
            if (nodeToRemove.left == null && nodeToRemove.right == null) {
                if (parentNodeOfRemove != null) {
                    if (isLeft) {
                        parentNodeOfRemove.left = null;
                    } else {
                        parentNodeOfRemove.right = null;
                    }
                }
            } else if (nodeToRemove.left == null) {
                if (parentNodeOfRemove != null) {
                    if (isLeft) {
                        parentNodeOfRemove.left = nodeToRemove.right;
                    } else {
                        parentNodeOfRemove.right = nodeToRemove.right;
                    }
                } else {
                    root = nodeToRemove.right;
                }
            } else if (nodeToRemove.left != null) {
                Node nodeToReplaceParent = nodeToRemove;
                Node nodeToReplace = nodeToRemove.left;
                while (nodeToReplace.right != null) {
                    nodeToReplaceParent = nodeToReplace;
                    nodeToReplace = nodeToReplace.right;
                }

                if (nodeToReplaceParent.value != value) {
                    nodeToReplaceParent.right = nodeToReplace.left;
                }

                if (nodeToReplace.value != nodeToRemove.left.value) {
                    nodeToReplace.left = nodeToRemove.left;
                }

                nodeToReplace.right = nodeToRemove.right;

                if (parentNodeOfRemove != null) {
                    if (isLeft) {
                        parentNodeOfRemove.left = nodeToReplace;
                    } else {
                        parentNodeOfRemove.right = nodeToReplace;
                    }
                } else {
                    root = nodeToReplace;
                }
            }
        }

        return nodeToRemove;
    }

    // print
    public void printBinarySearchTree(Node node, int rootValue, int level, String type) {
        if (node == null) {
            return;
        }
        System.out.println(level + "(" + type + ")" + "::" + rootValue + " => " + node.value);
        if (node.left != null) {
            printBinarySearchTree(node.left, node.value, level + 1, "LH");
        }
        if (node.right != null) {
            printBinarySearchTree(node.right, node.value, level + 1, "RH");
        }
    }

}
