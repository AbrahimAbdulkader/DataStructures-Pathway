package LinkedList;

public class SinglyLinkedList {

    /*
    1. We need to create head and tail.
    2. We create our Linked List method to
     */

    public Node head; //Our head node
    public Node tail; //Our tail node
    public int size;  //size of our list

    public Node createdSinglyLinkedList(int nodeValue) {
        head = new Node(); //Initializing head                                  Time Complexity: O(1)
        Node node = new Node(); //Created an instance of Node class with node   Time Complexity: O(1)
        node.next = null; //Setting the reference of node to null               Time Complexity: O(1)
        node.value = nodeValue; //Setting the value of node                     Time Complexity: O(1)
        head = node;            //Setting head to the first node                Time Complexity: O(1)
        tail = node;            //Setting tail to the first node                Time Complexity: O(1)
        size = 1;               //Setting the size to 1                         Time Complexity: O(1)
        return head;            //Returning head                                Time Complexity: O(1)

        //                                                                      Overall: O(1) Time Complexity
    }
}
