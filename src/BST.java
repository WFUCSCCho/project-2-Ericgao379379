//∗ @file: BST.java
//∗ @description: This program defines a BST and has numeral methods
//∗ @author: Eric Gao
//∗ @date: September 15, 2025
import java.util.*;

public class BST<T extends Comparable<? super T>> implements Iterable<T> {
    private Node<T> root;
    private int size;

    // Returns the number of elements stored in the BST.
    public int size() {
        return size;
    }

    // Returns true if the BST has no elements.
    public boolean isEmpty() {
        return size == 0;
    }

    // Removes all elements from the BST and resets size to 0.
    public void clear () {
        root = null;
        size = 0;
    }

    // Returns true if an equal element exists in the BST.
    public boolean contains (T val) {
        return getVal(val) != null;
    }

    // Returns the stored element equal to val, or null if not found.
    public T getVal (T val) {
        if (val == null) {
            return null;
        }
        Node<T> current = root;
        while (current != null) {
            int compare = val.compareTo(current.getVal());
            if (compare == 0) {
                return current.getVal();
            }
            if (compare < 0) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
        }
        return null;

    }

    // Inserts val if absent; ignores duplicates. Throws if val is null.
    public void insert (T val) {
        if (val == null) {
            throw new IllegalArgumentException();
        }
        if (root == null) {
            root = new Node<>(val);
            size = 1;
            return;
        }
        Node<T> current = root;
        Node<T> parent = null;
        int compare = 0;
        while (current != null) {
            parent = current;
            compare = val.compareTo(current.getVal());
            if (compare == 0) {
                return;
            }
            if(compare < 0){
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
        }
        Node<T> New = new Node<>(val);
        if (compare < 0) {
            parent.setLeft(New);
        } else {
            parent.setRight(New);
        }
        size++;

    }

    // Removes val if present; does nothing if absent. Throws if val is null.
    public T remove (T val) {
        if (val == null) {
            throw new IllegalArgumentException();
        }
        Node<T> current = root;
        Node<T> parent = null;
        while (current != null) {
            int compare = val.compareTo(current.getVal());
            if (compare == 0) {
                break;
            }
            parent = current;
            if (compare < 0) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
        }
        if (current == null) {
            return null;
        }
        T removedVal = current.getVal();
        // If node has two children, replace its value with in-order successor, then remove successor.
        if (current.hasLeft() && current.hasRight()) {
            Node<T> successorParent = current;
            Node<T> successor = current.getRight();
            while (successor.getLeft() != null) {
                successorParent = successor;
                successor = successor.getLeft();
            }

            current.setVal(successor.getVal());
            current = successor;
            parent = successorParent;
        }

        // Splice out node with at most one child.
        Node<T> child = null;
        if (current.getLeft() != null) {
            child = current.getLeft();
        } else {
            child = current.getRight();
        }

        if (parent == null) {
            root = child;
        } else if (parent.getLeft() == current) {
            parent.setLeft(child);
        } else {
            parent.setRight(child);
        }

        size --;
        return removedVal;
    }

    // Returns the smallest element in the BST. Throws if empty.
    public T first() {
        if (root == null) {
            throw new NoSuchElementException();
        }
        return root.minNode().getVal();
    }

    // Returns the largest element in the BST. Throws if empty.
    public T last() {
        if (root == null) {
            throw new NoSuchElementException();
        }
        return root.maxNode().getVal();
    }

    // Returns the height (in edges) of the BST; -1 if empty.
    public int height() {
        return height(root);
    }

    // Helper: recursively computes height of a subtree.
    private int height(Node<T> node) {
        if(node == null) {
            return -1;
        }
        return 1+Math.max(height(node.getLeft()), height(node.getRight()));
    }

    // Returns a list of elements in pre-order (root, left, right).
    public List<T> preOrder() {
        List<T> list = new ArrayList<>(size);
        preOrder(root, list);
        return list;
    }

    // Helper: pre-order traversal accumulator.
    private void preOrder(Node<T> o, List<T> list) {
        if (o == null) return;
        list.add(o.getVal());
        preOrder(o.getLeft(), list);
        preOrder(o.getRight(), list);
    }

    // Returns a list of elements in in-order (sorted order).
    public List<T> inorder() {
        List<T> list = new ArrayList<>(size);
        inorder(root, list);
        return list;
    }

    // Helper: in-order traversal accumulator.
    private void inorder(Node<T> o, List<T> list) {
        if (o == null) return;
        inorder(o.getLeft(), list);
        list.add(o.getVal());
        inorder(o.getRight(), list);
    }

    // Returns a list of elements in post-order (left, right, root).
    public List<T> postOrder() {
        List<T> list = new ArrayList<>(size);
        postOrder(root, list);
        return list;
    }

    // Helper: post-order traversal accumulator.
    private void postOrder(Node<T> o, List<T> list) {
        if (o == null) return;
        postOrder(o.getLeft(), list);
        postOrder(o.getRight(), list);
        list.add(o.getVal());
    }

    // Returns an in-order iterator over the BST.
    public Iterator<T> iterator() {
        return new inOrderIterator<>(root);
    }

    // In-order iterator using an explicit stack; yields elements in ascending order.
    public static final class inOrderIterator <T extends Comparable<? super T>> implements Iterator<T> {
        private Stack<Node<T>> stack = new Stack<>();

        // Initializes the stack with the left spine from root.
        public inOrderIterator(Node<T>root)
        {
            stack = new Stack<>();
            pushAllLeft(root);
        }

        // True if there is another element to iterate.
        public boolean hasNext() {
            return !stack.isEmpty();
        }

        // Pops next in-order node; pushes right child's left spine if present.
        public T next() {
            if (stack.isEmpty()) {
                throw new NoSuchElementException();
            }
            Node<T> node = stack.pop();
            if (node.getRight() != null) {
                pushAllLeft(node.getRight());
            }
            return node.getVal();
        }

        // Pushes a node and all its left descendants onto the stack.
        private void pushAllLeft(Node<T> node) {
            while (node != null) {
                stack.push(node);
                node = node.getLeft();
            }
        }

    }

    public Node<T> search (T key) {
        if (key == null) return null;
        Node<T> cur = root;
        while (cur != null) {
            int cmp = key.compareTo(cur.getVal());
            if (cmp == 0) return cur;
            cur = (cmp < 0) ? cur.getLeft() : cur.getRight();
        }
        return null;
    }

    // Returns the in-order traversal as a string.
    @Override
    public String toString() {
        return inorder().toString();
    }


}
