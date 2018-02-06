package list;

/**
 * Created by JANG3LET on 2/1/18.
 */
class Node {

    public Object item;
    public Node next;

    Node(Object newItem){
        item = newItem;
        next = null;
    }

    Node(Object newItem, Node nextNode) {
        item = newItem;
        next = nextNode;
    }
}

