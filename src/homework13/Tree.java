package homework13;

public class Tree {
    public Node root;

    public void add(int value) {
        root = add(root, value);
    }

    public Node add(Node node, int value) {
        if (node == null) {
            node = new Node(value);
            System.out.println("add(): New node was created with");
            return node;
        }
        if (value < node.value) {
            System.out.println("Going to the left side of node with "+node.value);
            node.left = add(node.left, value);
        } else {
            System.out.println("Going to the right side of node with "+node.value);
            node.right = add(node.right, value);
        }
        return node;
    }

    public void iterate(Node node) {
        if (node == null) {
            return;
        } else {
            iterate(node.left);
            System.out.print(node.value+" ");
            iterate(node.right);
        }
    }
}
