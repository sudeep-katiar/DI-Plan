package com.di.datastructure;

/**
 * Java Program to remove duplicates
 * from a sorted linked list
 * **/
public class RemoveDuplicate {
    /* Link list node */
    static class Node
    {
        int data;
        Node next;
    };

    /* The function removes duplicates from a sorted list */
    static Node removeDuplicates( Node head)
    {
        /* if head is null then return*/
        if (head == null)
            return null;

        /* Remove duplicates from list after head */
        head.next = removeDuplicates(head.next);

        // Check if head itself is duplicate
        if (head.next != null &&
                head.next.data == head.data)
        {

            Node res = head.next;

            return res;
        }

        return head;
    }

    /* Function to insert a node at the beginning of the linked list */
    static Node push( Node head_ref, int new_data)
    {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = (head_ref);
        (head_ref) = new_node;
        return head_ref;
    }

    /* Function to print nodes in a given linked list */
    static void printList( Node node)
    {
        while (node != null)
        {
            System.out.printf("%d ", node.data);
            node = node.next;
        }
    }

    /* Driver program to test above functions*/
    public static void main(String args[])
    {
        /* Start with the empty list */
        Node head = null;
        head = push(head, 20);
        head = push(head, 13);
        head = push(head, 13);
        head = push(head, 11);
        head = push(head, 11);
        head = push(head, 11);

        System.out.printf("\n Linked list before duplicate removal ");
        printList(head);

        /* Remove duplicates from linked list */
        Node h = removeDuplicates(head);

        System.out.printf("\n Linked list after duplicate removal ");
        printList(h);
    }
}
