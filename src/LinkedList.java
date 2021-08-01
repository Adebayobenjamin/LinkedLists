public class LinkedList {
    Node root = null;

    Node insertStart(String data){
        Node insertedNode = new Node();
        insertedNode.data = data;
        if(this.root == null){
          root = insertedNode;
        }else{
            Node x = root;
            root = insertedNode;
            insertedNode.nextNode = x;
        }

        return insertedNode;
    };

}
