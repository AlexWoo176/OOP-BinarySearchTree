package codegym;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree<String> tree = new BinarySearchTree<>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");
        System.out.println("In-Order (sorted): ");
        tree.inOrder();
        System.out.println();
        System.out.println("Pre-Order (sorted): ");
        tree.preOrder();
        System.out.println();
        System.out.println("Pos-Order (sorted): ");
        tree.posOrder();
        System.out.println();
        System.out.println("The number of nodes is: " + tree.getSize());
        System.out.println(tree.findNode(tree.root, "George"));
        System.out.println(tree.removeNode(tree.root, "Tom"));
    }
}
