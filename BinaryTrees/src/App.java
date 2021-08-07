public class App {
    public static void main(String[] args) {
        Tree binaryTree = new Tree();

        binaryTree.root = new Node(1);
        binaryTree.root.left = new Node(3);
        binaryTree.root.right = new Node(2);
        binaryTree.root.left.left = new Node(5);
        binaryTree.root.left.right = new Node(4);

        System.out.println("Inorder \n");
        binaryTree.inorder(binaryTree.root);
        System.out.println("Postorder \n");
        binaryTree.postorder(binaryTree.root);
        System.out.println("Preorder \n");
        binaryTree.preorder(binaryTree.root);
        
    }
}
