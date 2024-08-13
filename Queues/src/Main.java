public class Main {
    public static void main(String... args){
        Queues queues = new Queues(5);

        queues.enqueue(1);
        queues.enqueue(2);
        queues.enqueue(3);
        queues.enqueue(4);
        queues.enqueue(5);
        queues.dequeue();
        queues.enqueue(5);
        queues.list();
    }
}
