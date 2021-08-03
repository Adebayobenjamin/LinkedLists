import java.util.ArrayList;

public class LinkedList{
    Node head = new Node(null);

    public void append(String data){
        if(head.data == null){
            head.data = data;
        }else{
            Node currentNode = head;
            while (currentNode.nextNode != null){
                currentNode = currentNode.nextNode;
            }
            currentNode.nextNode = new Node(data);
        }

    }
    public void prepend(String data){
            Node newHead = new Node(data);
            newHead.nextNode = head;
            head = newHead;
    }
    public void removeAny(String data){
            if(head.data == null){
                System.out.println("Nothing to remove");
            }else if(head.data.equals(data)){
               if(head.nextNode == null){
                   head = new Node(null);
               }else{
                   head = head.nextNode;
               }

            }else {
                Node currentNode = head;
                while (currentNode.nextNode != null){
                      if(currentNode.nextNode.data == data){
                          currentNode.nextNode = currentNode.nextNode.nextNode;
                            return;
                      }
                    currentNode = currentNode.nextNode;
                }

            }
    }
    public void pop(){
        if(head.data == null){
            return;
        }
        if(head.nextNode == null){
            head.data = null;
        }else{
            Node currentNode = head;
            while(currentNode.nextNode.nextNode != null){
                currentNode = currentNode.nextNode;
            }
            currentNode.nextNode = null;
        }
    }
    public void shift(){
        Node newHead = head.nextNode;
        head = newHead;
    }

    public void listAllNodesdata(){
        ArrayList <String> nodeData = new ArrayList<String>();
        Node currentNode = head;
        while(currentNode != null){
            System.out.println(currentNode.data);
            currentNode = currentNode.nextNode;
        }

//        return nodeData;
    }
}