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

        //Insert Method SinglyLinkedList
        public void insertInLinkedList(int nodeValue, int location) {
            Node node = new Node(); //Object creation of type node
            node.value = nodeValue; //Setting the nodeValue to node.value
            if(head == null) { //If head is null, meaning if the list is empty
                createdSinglyLinkedList(nodeValue); //Insert the node and return it
                return;
            }
            else if(location == 0) {
                node.next = head;
                head = node;
            }
            else if(location >= size) { //If the location is greater than the size, we know that we need to insert at the end of the list
                node.next = null;
                tail.next = node;
                tail = node;
            }
            else {
                Node tempNode = head;
                int index = 0;
                while(index < location - 1) {
                    tempNode = tempNode.next;
                    index++;
                }
                Node nextNode = tempNode.next;
                tempNode.next = node;
                node.next = nextNode;
            }
            size++;
        }
        //Time Complexity of insertInLinkedList: O(n)
        //Space Complexity: O(1)


    //SinglyLinkedList Traversal
    public void traverseSinglyLinkedList() {
        if(head == null) { //Meaning if the Linkedlist is empty, we print that it doesn't exist
            System.out.println("Single Linked List does not exist!");
        }
        else {
            Node tempNode = head; //Create a temp node that stores head(to start from the beginning
            for(int i = 0; i < size; i++) { //Loop through the list as long as i is less than size
                System.out.print(tempNode.value); //Print the node value
                if(i != size - 1) {
                    System.out.print(" --> ");
                }
                tempNode = tempNode.next; //and store the next reference to tempNode
            }
        }
        System.out.print("\n");
    }

    //Time Complexity: O(n)
    //Space Complexity: O(1)


    //Search for a node
    public boolean searchSinglyLinkedList(int nodeValue) {
        if(head != null) { //If the list isn't empty
            Node tempNode = head; //create a tempNode and set it to head(this is where we start when traversing)
            for(int i = 0; i < size; i++) { //Loop from i = 0 as long as its less than size
                if(tempNode.value == nodeValue) { //Check if tempNode.value is equal to the parameter nodeValue
                    System.out.println("Found the node at location " + i + "\n");
                    return true; //If true we print the above statement and return true
                }
                tempNode = tempNode.next; //Set tempNode = tempNode.next to continue traversing
            }
        }
        System.out.println("Node not found"); //If node not found print statement and return false
        return false;
        }

        //Time Complexity: O(n)
       //Space Complexity: O(1)


    //Deleting a Node From a Singly Linked List
    public void deletionOfNode(int location) {
        if(head == null) { //If head is null meaning there is no node in the list
            System.out.println("The Singly Linked List does not exist");
            return;
        }
        else if(location == 0) { //If we have more than one element, we can always delete the node by setting the head reference to head.next
            head = head.next; //Set the head reference to the node next to what is being deleted
            size--;
            if(size == 0) { //If the list is empty
                tail = null; //We have to initialize tail back to null
            }
        }
        else if(location >= size) { //Checking for the last node in the list
            Node tempNode = head;
            for(int i = 0; i < size - 1; i++) { //We need to traverse through the list to get to the deletionNode - 1
                tempNode = tempNode.next;
            }
            if(tempNode == head) { //If we have only one element
                tail = null;
                head = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        }
        else {
            Node tempNode = head; //We are starting from the head
            for(int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
                // [1] [2] [3]
                //  t
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }
    //Time Complexity: O(n)
    //Space Complexity: O(1)


    // ---------------------------------------------------------------


    //Delete entire Singly Linked List
    public void deleteEntireSinglyLinkedList() {
        Node tempNode = head;
        head = null;
        tail = null;
        System.out.println("Entire Singly Linked List Deleted!");

        }





}
