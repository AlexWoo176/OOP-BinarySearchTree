package codegym;

public interface Tree<E> {
    boolean insert(E e);

    void inOrder();

    void preOrder();

    void posOrder();

    int getSize();

    boolean findNode(TreeNode<E> treeNode, E e);

    boolean removeNode(TreeNode<E> treeNode, E e);
}
