package codegym;

public interface Tree<E> {
    public boolean insert(E e);

    public void inorder();

    public void posorder();

    public void preorder();

    public int getSize();
}
