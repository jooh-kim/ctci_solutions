package ctci_function;

public class Node {
    public Node next = null;
    public int data;

    public Node(int d){
        data = d;
        next = null;
    }

    public static void printAll(Node head){
        Node n = head;
        while (n != null){
            System.out.println("Node: "+n.data);
            n = n.next;
        }
    }
}