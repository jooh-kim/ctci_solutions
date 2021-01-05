package ctci_function;

import java.lang.Boolean;
import java.lang.Math;
import java.lang.StringBuilder;
import java.util.ArrayList;
import ctci_function.Node;
import java.lang.Math;

public class linked_list_problems {
    
    // Problem 2.1
    public static Node removeDups(Node head){
        ArrayList<Integer> unique = new ArrayList<Integer>();
        Node current = head;
        Node prev = null;

        while (current != null){
            if (unique.contains(current.data)){
                prev.next = current.next;

            }else{
                unique.add(current.data);
                prev = current;
            }
            current = current.next;
        }
        return head;
    }

    public static Node returnKtoLast(Node head, int k){
        Node current = head;
        Node prev = null;
        Node kth = null;

        while (current != null){
            if (current.data == k){
                kth = current;
                if(prev == null){
                    prev = current.next;
                }else
                    prev.next = current.next;
            } else {
                prev = current;
            }
            current = current.next;
        }
        prev.next = kth;
        prev.next.next = null;
        return head;
    }

    public static boolean deleteNode(Node n){
        if(n == null || n.next == null){
            return false;
        }
        Node next = n.next;
        n.data = next.data;
        n.next = next.next;
        return true;
    }
    
    public static Node sumLists(Node n1, Node n2){
        int carry = 0;
        Node result = new Node(0);
        int value = 0;
        Node head = result;

        while (n1 != null || n2 != null){
            if(n1 != null){
                value += n1.data;
                n1 = n1.next;
            }
            if(n2 != null){
                value += n2.data;
                n2 = n2.next;
            }
            value += carry;
            Node newNode = new Node(value % 10);
            carry = (int)Math.floor(value/10);
            value = 0;
            result.next = newNode;
            result = result.next;
        }
        if(carry != 0){
            Node newNode = new Node(carry);
            result.next = newNode;
            result = result.next;
        }
        return head.next;
    }
}
