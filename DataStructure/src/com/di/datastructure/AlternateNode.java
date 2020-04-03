package com.di.datastructure;

/**
 * Java code to print Alternate Nodes
 * **/
public class AlternateNode {

    /* Link list node */
    static class Node
    {
        int data;
        Node next;
    };

    /* Function to get the alternate nodes of the linked list */
    static void printAlternateNode( Node head)
    {
        int count = 0;

        while (head != null)
        {

            // when count is even print the nodes
            if (count % 2 == 0)
                System.out.printf(" %d ", head.data);

            // count the nodes
            count++;

            // move on the next node.
            head = head.next;
        }
    }

    // Function to push node at head
    static Node push( Node head_ref, int new_data)
    {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = (head_ref);
        (head_ref) = new_node;
        return head_ref;
    }

    // Driver code
    public static void main(String args[])
    {
        /* Start with the empty list */
        Node head = null;

    /* Use push() function to con
    the below list 8 . 23 . 11 . 29 . 12 */
        head = push(head, 12);
        head = push(head, 29);
        head = push(head, 11);
        head = push(head, 23);
        head = push(head, 8);

        printAlternateNode(head);
    }

}
