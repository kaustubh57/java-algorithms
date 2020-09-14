package practicaldatastructure.datastructure.queue;

public class App {

    public static void main(String[] argv) {
        Queue queue = new Queue(3);
        queue.view();
        queue.viewIndexPosition();

        queue.push(8L);
        queue.push(3L);
        queue.push(55L);
        queue.push(654L);

        queue.view();
        queue.viewIndexPosition();

        System.out.println("pop: " + queue.pop());
        System.out.println("pop: " + queue.pop());

        queue.push(89L);
        queue.push(43L);
        System.out.println("pop: " + queue.pop());

        queue.view();
        queue.viewIndexPosition();

        System.out.println("pop: " + queue.pop());
        System.out.println("pop: " + queue.pop());
        System.out.println("pop: " + queue.pop());

        queue.view();
        queue.viewIndexPosition();

        queue.push(10003L);
        queue.push(1000654L);

        queue.view();
        queue.viewIndexPosition();

        System.out.println("pop: " + queue.pop());

        queue.view();
        queue.viewIndexPosition();

        System.out.println("peek: " + queue.peek());
        System.out.println("pop: " + queue.pop());
        System.out.println("peek: " + queue.peek());

        queue.view();
        queue.viewIndexPosition();
    }
}
