package myexperiments.linkedlist;

public class App {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(5);

        linkedList.insert(6);
        linkedList.addHead(87);
        linkedList.insert(1, 99);
        linkedList.insert(4, 67);
        linkedList.insert(2, 100);
        System.out.println("=======INSERT=========");
        System.out.println("Size: " + linkedList.size);
        System.out.println(linkedList.toString());
        System.out.println("================");

        linkedList.clear();
        linkedList.addHead(5);
        linkedList.insert(398);
        linkedList.reverse();
        System.out.println("======REVERSE==========");
        System.out.println("Size: " + linkedList.size);
        System.out.println(linkedList.toString());
        System.out.println("================");

        linkedList.removeTail();
        linkedList.remove(2);
        System.out.println("=======REMOVE=========");
        System.out.println("Size: " + linkedList.size);
        System.out.println(linkedList.toString());
        System.out.println("================");



    }
}
