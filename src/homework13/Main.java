package homework13;

public class Main {

    public static void main(String[] args) {
        //Create tree
        Tree tree = new Tree();
        tree.root = new Node(1);
        Node first = new Node(3);
        Node second = new Node(5);
        Node third = new Node(7);
        Node fourth = new Node(9);
        Node fifth = new Node(11);
        Node sixth = new Node(13);

        tree.root.left = first;
        tree.root.right = second;
        first.left = third;
        first.right = fourth;
        second.left = fifth;
        second.right = sixth;

        /*                 1
        *              /      \
        *             3        5
        *           /   \     /  \
        *          7     9   11   13
        * */
        //Adding Node with value 12 & 6
        tree.add(12);
        tree.add(6);
        //iterate from node to node
        System.out.println("result of iterate():");
        tree.iterate(tree.root);
    }
}
