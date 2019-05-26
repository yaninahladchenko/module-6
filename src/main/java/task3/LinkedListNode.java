package task3;

public class LinkedListNode {
    private String nodeData;
    private LinkedListNode nextNode;

    public LinkedListNode(String nodeData) {
        this.nodeData = nodeData;
        this.nextNode = null;
    }

    public String getNodeData() {
        return nodeData;
    }

    public void setNodeData(String nodeData) {
        this.nodeData = nodeData;
    }

    public LinkedListNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(LinkedListNode nextNode) {
        this.nextNode = nextNode;
    }
}
