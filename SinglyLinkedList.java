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



}
