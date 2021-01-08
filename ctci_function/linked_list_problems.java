package ctci_function;

import java.lang.Boolean;
import java.lang.Math;
import java.lang.StringBuilder;
import java.util.ArrayList;
import ctci_function.Node;
import java.lang.Math;
import java.util.Stack;

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

    public static Node intersection(Node headA, Node headB){
        // traverse through both lists to get tail and length;
        // if tail are not equal, no intersection
        Node tailA = headA;
        Integer lenA = 0;
        while(tailA != null){
            lenA+=1;
            tailA = tailA.next;
        }
        Node tailB = headB;
        Integer lenB = 0;
        while(tailB != null){
            lenB+=1;
            tailB = tailB.next;
        }
        if (tailA != tailB){
            return null;
        }
        Node longer = lenA > lenB ? headA : headB;
        Node shorter = lenA < lenB ? headA : headB;

        int i = 0;
        while (i < Math.abs(lenA-lenB)){
                longer = longer.next;
                i+=1;
        }
        while (shorter != longer){
            shorter = shorter.next;
            longer = longer.next;
        }
        return longer;
    }
}
