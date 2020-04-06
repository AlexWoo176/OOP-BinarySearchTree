package codegym;

public class TestBST {
    public static void main(String[] args) {
        BinarySearchTree<String> tree = new BinarySearchTree<>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");

        System.out.print("Inorder (sorted): ");
        tree.inorder();
        System.out.println("The number of Nodes is: " + tree.getSize());

        System.out.println("------------------------------------------");
        System.out.print("Posorder (sorted): ");
        tree.posorder();
        System.out.println("The number of Nodes is: " + tree.getSize());

        System.out.println("--------------------------------------------");
        System.out.print("Preorder (sorted): ");
        tree.preorder();
        System.out.println("The number of Nodes is: " + tree.getSize());

    }
}
