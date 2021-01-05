import ctci_function.arrays_and_strings;
import ctci_function.linked_list_problems;
import ctci_function.Node;

public class ctci_main{

    public static void main(String[] args){

        System.out.println("Main class to run and test coding problems from Cracking the Coding Interview Book.");   

        Node n1 = new Node(9);
        Node n2 = new Node(7);
        Node n3 = new Node(8);

        Node n4 = new Node(6);
        Node n5 = new Node(8);
        Node n6 = new Node(5);

        n1.next = n2;
        n2.next = n3;

        n4.next = n5;
        n5.next = n6;

        Node result = linked_list_problems.sumLists(n1, n4);

        System.out.println("Before/After");
        ctci_function.Node.printAll(result);
    }
}