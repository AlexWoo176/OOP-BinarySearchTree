package codegym;

public class BinarySearchTree<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;

    public BinarySearchTree() {
    }

    public BinarySearchTree(E[] objects) {
        for (int i = 0; i < objects.length; i++) {
            insert(objects[i]);
        }
    }

    @Override
    public boolean insert(E e) {
        if (root == null) {
            root = createNewNode(e);
        } else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else {
                    return false;
                }
            }
            if (e.compareTo(parent.element) < 0) {
                parent.left = createNewNode(e);
            } else {
                parent.right = createNewNode(e);
            }
        }
        size++;
        return true;
    }
    protected TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public boolean findNode(TreeNode<E> treeNode, E e) {
        if (treeNode == null)
            return false;
        if (treeNode.element.equals(e))
            return true;
        return e.compareTo(treeNode.element) < 0 ? findNode(treeNode.left, e) : findNode(treeNode.right, e);
    }

    @Override
    public boolean removeNode(TreeNode<E> treeNode, E e) {
        if (treeNode == null)
        return false;

        if (e.compareTo(treeNode.element) < 0) {
            return removeNode(treeNode.left, e);
        } else if (e.compareTo(treeNode.element) > 0) {
            return removeNode(treeNode.right, e);
        } else {
            if (treeNode.left == null)
                treeNode = treeNode.right;
            else if (treeNode.right == null)
                treeNode = treeNode.left;
            else {
                TreeNode<E> temp = treeNode.left;
                while (temp.right != null) {
                    temp = temp.right;
                }
                treeNode.element = temp.element;
                return removeNode(treeNode.left, temp.element);
            }
        }
        return true;
    }


    @Override
    public void inOrder() {
        inOrder(root);
    }

    protected void inOrder(TreeNode<E> root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.element + " ");
        inOrder(root.right);
    }

    @Override
    public void preOrder() {
        preOrder(root);
    }

    protected void preOrder(TreeNode<E> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.element + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    @Override
    public void posOrder() {
        posOrder(root);
    }

    protected void posOrder(TreeNode<E> root) {
        if (root == null) {
            return;
        }
        preOrder(root.left);
        preOrder(root.right);
        System.out.print(root.element + " ");
    }
}
