import java.util.ArrayList;

public class CircularLinkedLists {
    Node head;

    public void append(String data){
        if(head == null){
            head = new Node(data, null, null);
            head.next = head;
            head.prev = head;
        }else {
            Node current = head;
            while(current.next != head){
                current = current.next;
            }
            current.next = new Node(data, head, current);
            head.prev = current.next;
        }

    }

    public void prepend(String data){
        if(head == null){
            head = new Node(data, null, null);
            head.next = head;
            head.prev = head;
        }else{
            Node newHead = new Node(data, head, head.prev);
            head.prev = newHead;
            head = newHead;
            head.prev.next = head;
        }
    }

    public void removeAny(String data){
        if(head.data == null){
            System.out.println("Nothing to remove");
        }else if(head.data.equals(data)){
            Node newHead = head.next;
            newHead.prev = head.prev;
            head = newHead;
        }else{
            Node current = head;
            while (current.next != head){
                if(current.next.data == data){
                    current.next = current.next.next;
                    current.next.prev = current;
                    return;
                }
                current = current.next;
            }


        }
    }
    public void pop(){
        if(head.data == null){
            System.out.println("Nothing to pop");
        }else if(head.next == null){
           head = new Node(null, null, null);
        }else{
            Node current = head;
            while(current.next.next != head){
                current = current.next;
            }
            current.next = head;
            head.prev = current;
        }
    }

    public void unshift(){
        if(head.data == null){
            System.out.println("List is empty");
        }else if(head.next == head){
            head = null;
        }else{
            Node newHead = head.next;
            newHead.prev = head.prev;
            head.prev.next = newHead;
            head = newHead;
        }
    }

    public void list(){
        ArrayList<String> nodedata = new ArrayList<String>();
        Node current = head;
        while(current != null){
            nodedata.add(current.data);
            if(current.next == head){
              break;
            }
            current = current.next;
        }
        System.out.println(nodedata);
    }

}
