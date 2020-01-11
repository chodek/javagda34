package dzien3.drzewa;

import java.util.ArrayList;
import java.util.List;

public class MyBST {

    private Node root;

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    public List<Node> preOrder(){
        List<Node> listaWezlow = new ArrayList<>();
        recursivePreOrder(root, listaWezlow);
        return listaWezlow;
    }

    private void recursivePreOrder(Node current, List<Node> alreadyVisited) {

        alreadyVisited.add(current); // 1.
        if (current.left != null) {
            recursivePreOrder(current.left, alreadyVisited); // 2.
        }
        if (current.right != null) {
            recursivePreOrder(current.right, alreadyVisited); // 3.
        }

    }
}
