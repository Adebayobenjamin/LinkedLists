import java.util.ArrayList;

public class DoublyLinkedList {
    Node head = new Node(null, null);

    public void append(String data){
        if(head.data == null){
            head = new Node(data, null);
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = new Node(data, current);
        }
    }

    public void prepend(String data){
        if(head.data == null){
            head = new Node(data, null);
        }else{
            Node newHead = new Node(data, null);
            newHead.next = head;
            head.prev = newHead;
            head = newHead;
        }
    }

    public void removeAny(String data){
        if(head.data == null){
            System.out.println("Nothing to remove");
        }else if(head.data.equals(data)){
          if(head.next == null){
              head = new Node(null, null);
          }else{
              head = head.next;
              head.prev = null;
          }
        }
    }

    public void pop(){
        if(head.data == null){
            System.out.println("Nothing to pop");
        }else{
            if(head.next == null){
                head = new Node(null, null);
            }else{
                Node current = head;
                while (current.next.next != null){
                    current = current.next;
                }
                current.next = null;
            }
        }
    }

    public void unshift(){
        if (head.data == null){
            System.out.println("List is empty");
        }else if(head.next == null){
            head = new Node(null, null);
        }else{
            head = head.next;
            head.prev = null;
        }
    }

    public void list(){
        ArrayList<String> dataList= new ArrayList<String>();
        Node current = head;
        while (current != null){
            dataList.add(current.data);
            current = current.next;
        }
        System.out.println(dataList);
    }
}
