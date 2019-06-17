package task3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//https://www.geeksforgeeks.org/implementing-a-linked-list-in-java-using-class/
public class LinkedList {
    private static Logger log = LogManager.getLogger(LinkedList.class);


    private LinkedListNode headNode;

    public LinkedList add(String nodeData) {
        LinkedListNode linkedListNode = new LinkedListNode(nodeData);

        if (this.headNode == null) {
            this.headNode = linkedListNode;
        } else {
            LinkedListNode lastNode = this.headNode;
            while (lastNode.getNextNode() != null) {
                lastNode = lastNode.getNextNode();
            }
            lastNode.setNextNode(linkedListNode);
        }
        return this;
    }

    public int size() {
        int counter = 0;
        LinkedListNode currentNode = this.headNode;
        while (currentNode != null) {
            currentNode = currentNode.getNextNode();
            counter++;
        }
        return counter;
    }

    public void print() {
        LinkedListNode currentNode = this.headNode;
        while (currentNode != null) {
            log.info(currentNode.getNodeData() + "\n");
            currentNode = currentNode.getNextNode();
        }
    }

    public String get(int index) {
        LinkedListNode currentNode = this.headNode;

        int counter = 0;
        while (currentNode != null) {

            if (counter == index) {
                return currentNode.getNodeData();
            } else {
                currentNode = currentNode.getNextNode();
                counter++;
            }
        }

        if (currentNode == null) {
            log.info(String.format("Element at index %s does not exist.", index));
        }
        return currentNode.getNodeData();
    }


    public LinkedList remove(int index) {
        LinkedListNode currentNode = this.headNode, previousNode = null;

        // CASE 1:
        // If index is 0, then headNode node itself is to be removed
        if (index == 0 && currentNode != null) {
            this.headNode = currentNode.getNextNode(); // Changed headNode
            log.info(String.format("Element at index %s removed.", index));
            return this;
        }

        // CASE 2:
        // If the index is greater than 0 but less than the size of LinkedList
        // Count for the index to be deleted,
        // keep track of the previous node
        // as it is needed to change currNode.next
        int counter = 0;
        while (currentNode != null) {

            if (counter == index) {
                // Since the currentNode is the required position
                // Unlink currentNode from linked list
                previousNode.setNextNode(currentNode.getNextNode());
                log.info(String.format("Element at index %s removed.", index));
                break;
            } else {
                // If current position is not the index
                // continue to next node
                previousNode = currentNode;
                currentNode = currentNode.getNextNode();
                counter++;
            }
        }

        // If the position element was found, it should be at currNode
        // Therefore the currNode shall not be null
        //
        // CASE 3: The index is greater than the size of the LinkedList
        // In this case, the currNode should be null
        if (currentNode == null) {
            log.info(String.format("Element at index %s does not exist.", index));
        }
        return this;
    }

    public LinkedList remove(String key) {
        LinkedListNode currentNode = this.headNode, previousNode = null;

        // CASE 1:
        // If headNode node itself holds the key to be deleted
        if (currentNode != null && currentNode.getNodeData().equals(key)) {
            this.headNode = currentNode.getNextNode(); // Changed headNode
            log.info(String.format("Element '%s' removed.", key));
            return this;
        }

        // CASE 2:
        // If the key is somewhere other than at headNode
        // Search for the key to be deleted,
        // keep track of the previous node
        // as it is needed to change currentNode.next
        while (currentNode != null && !currentNode.getNodeData().equals(key)) {
            // If currNode does not hold key
            // continue to next node
            previousNode = currentNode;
            currentNode = currentNode.getNextNode();
        }

        // If the key was present, it should be at currentNode
        // Therefore the currentNode shall not be null
        if (currentNode != null) {
            // Since the key is at currentNode
            // Unlink currentNode from linked list
            previousNode.setNextNode(currentNode.getNextNode());
            log.info(String.format("Element '%s' removed.", key));
        }

        // CASE 3: The key is not present
        // If key was not present in linked list
        // currNode should be null
        if (currentNode == null) {
            log.info(String.format("Element '%s' does not exist.", key));
        }
        return this;
    }
}
