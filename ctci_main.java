import ctci_function.arrays_and_strings;
import ctci_function.linked_list_problems;
import ctci_function.Node;

public class ctci_main{

    public static void main(String[] args){

        System.out.println("Main class to run and test coding problems from Cracking the Coding Interview Book.");   
        
        Node a = new Node(3);
        Node b = new Node(1);
        Node c = new Node(5);
        Node d = new Node(9);
        Node e = new Node(4);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(2);
        Node i = new Node(1);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = g;
        e.next = f;
        f.next = null;
        g.next = h;
        h.next = i;

        Node result = linked_list_problems.intersection(a, e);
        System.out.println(result.data);
        // ctci_function.Node.printAll(result);
    }
}