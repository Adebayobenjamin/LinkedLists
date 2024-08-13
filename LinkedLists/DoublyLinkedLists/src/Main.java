public class Main {
    public static void main(String... args){
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        doublyLinkedList.append("22");
        doublyLinkedList.append("33");
        doublyLinkedList.prepend("44");
        doublyLinkedList.pop();
        doublyLinkedList.unshift();
        doublyLinkedList.removeAny("22");

        doublyLinkedList.list();
    }
}
