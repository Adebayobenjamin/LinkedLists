public class Tree {
    Node root;

    public Tree(){
        root = null;
    }

    public void inorder(Node node) {
        if(node == null) return;

        // traverse left
        inorder(node.left);
        // traverse root
        System.out.println(node.data + " ->");
        // traverse right
        inorder(node.right);
    }

    public void postorder(Node node){
        if(node == null) return;

        // traverse left
        postorder(node.left);

        // traverse right
        postorder(node.right);

        //traverse root
        System.out.println(node.data + "->");
    }

    public void preorder(Node node){
        if(node == null) return;

        // traverse root
        System.out.println(node.data + "->");

        //traverse left
        preorder(node.left);
        // traverse right
        preorder(node.right);
    }

}
