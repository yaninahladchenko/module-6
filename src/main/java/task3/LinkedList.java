package task3;

//https://www.geeksforgeeks.org/how-to-use-iterator-in-java/
public class LinkedList {

    LinkedListNode head; // head of list

    public LinkedList insert(String nodeData) {
        // Create a new node with given data
        LinkedListNode linkedListNode = new LinkedListNode(nodeData);

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = linkedListNode;
        } else {
            // Else traverse till the last node
            // and insert the new_node there
            LinkedListNode lastNode = list.head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }

            // Insert the newNode at last node
            lastNode.next = newNode;
        }

        // Return the list by head
        return list;
    }

    // **************TRAVERSAL**************

    // Method to print the LinkedList.
    public void printList(LinkedList list) {
        LinkedListNode currentNode = list.head;

        System.out.print("\nLinkedList: ");

        // Traverse through the LinkedList
        while (currentNode != null) {
            // Print the data at current node
            System.out.print(currentNode.nodeData + " ");

            // Go to next node
            currentNode = currentNode.next;
        }
        System.out.println("\n");
    }

    // **************DELETION BY KEY**************

    // Method to delete a node in the LinkedList by KEY
    public LinkedList deleteByKey(LinkedList list, int key) {
        // Store head node
        Node currentNode = list.head, prev = null;

        //
        // CASE 1:
        // If head node itself holds the key to be deleted

        if (currentNode != null && currentNode.nodeData.equals(key)) {
            list.head = currentNode.next; // Changed head

            // Display the message
            System.out.println(key + " found and deleted");

            // Return the updated List
            return list;
        }

        //
        // CASE 2:
        // If the key is somewhere other than at head
        //

        // Search for the key to be deleted,
        // keep track of the previous node
        // as it is needed to change currNode.next
        while (currentNode != null && !currentNode.nodeData.equals(key)) {
            // If currNode does not hold key
            // continue to next node
            prev = currentNode;
            currentNode = currentNode.next;
        }

        // If the key was present, it should be at currNode
        // Therefore the currNode shall not be null
        if (currentNode != null) {
            // Since the key is at currNode
            // Unlink currNode from linked list
            prev.next = currentNode.next;

            // Display the message
            System.out.println(key + " found and deleted");
        }

        //
        // CASE 3: The key is not present
        //

        // If key was not present in linked list
        // currNode should be null
        if (currentNode == null) {
            // Display the message
            System.out.println(key + " not found");
        }

        // return the List
        return list;
    }

    // **************DELETION AT A POSITION**************

    // Method to delete a node in the LinkedList by POSITION
    public LinkedList deleteAtPosition(LinkedList list, int index) {
        // Store head node
        Node currentNode = list.head, prev = null;

        //
        // CASE 1:
        // If index is 0, then head node itself is to be deleted

        if (index == 0 && currentNode != null) {
            list.head = currentNode.next; // Changed head

            // Display the message
            System.out.println(index + " position element deleted");

            // Return the updated List
            return list;
        }

        //
        // CASE 2:
        // If the index is greater than 0 but less than the size of LinkedList
        //
        // The counter
        int counter = 0;

        // Count for the index to be deleted,
        // keep track of the previous node
        // as it is needed to change currNode.next
        while (currentNode != null) {

            if (counter == index) {
                // Since the currNode is the required position
                // Unlink currNode from linked list
                prev.next = currentNode.next;

                // Display the message
                System.out.println(index + " position element deleted");
                break;
            } else {
                // If current position is not the index
                // continue to next node
                prev = currentNode;
                currentNode = currentNode.next;
                counter++;
            }
        }

        // If the position element was found, it should be at currNode
        // Therefore the currNode shall not be null
        //
        // CASE 3: The index is greater than the size of the LinkedList
        //
        // In this case, the currNode should be null
        if (currentNode == null) {
            // Display the message
            System.out.println(index + " position element not found");
        }

        // return the List
        return list;
    }

}
