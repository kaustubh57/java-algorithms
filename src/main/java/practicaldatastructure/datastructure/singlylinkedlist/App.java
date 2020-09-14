package practicaldatastructure.datastructure.singlylinkedlist;

public class App {

    public static void main(String[] args) {
        SinglyLinkList singlyLinkList = new SinglyLinkList();
        singlyLinkList.displayData();

        singlyLinkList.insertFirst(90);
        singlyLinkList.insertFirst(60);
        singlyLinkList.insertFirst(10);

        singlyLinkList.displayData();

        singlyLinkList.deleteFirst();

        singlyLinkList.insertLast(10);
        singlyLinkList.insertLast(50);

        singlyLinkList.displayData();
    }
}
