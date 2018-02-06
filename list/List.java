package list;

/**
 * Created by JANG3LET on 2/1/18.
 */
public class List implements ListInterface{

    private int size;
    private Node head;

    //Default constructor
    public List(){
        size = 0;
        head = null;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    private Node find(int index) {
        Node curr = head;
        for(int skip = 0; skip < index; skip++){
            curr = curr.next;
        }
        return curr;
    }

    @Override
    public void add(int index, Object item) throws ListIndexOutOfBoundsException {
        if (index >= 0 && index < size + 1) {
            if (index == 0) {
                //putting at beginning of list
                //new node takes in new item, and points to former head
                Node newNode = new Node(item, head);
                //becomes new head
                head = newNode;
            }
            size++;
        } else {
            throw new ListIndexOutOfBoundsException("List index out of bounds on add");
        }
    }

    @Override
    public void remove(int index) throws ListIndexOutOfBoundsException{
        if (index >= 0 && index < size - 1) {
            if (index == 0) {
                //deletes first node from list
                //head is now whatever former head was pointing to
                head = head.next;

            } else {
                Node prev = find(index - 1);
                //gets node previous to the one passed in for removal
                //current node now equals what previous node pointed to
                //previous node now points to what current node points to
                Node curr = prev.next;
                prev.next = curr.next;
            }
            size--;
        } else {
            throw new ListIndexOutOfBoundsException("List index out of bounds on remove");
        }
    }

    @Override
    public Object get(int index) throws ListIndexOutOfBoundsException{
            if(index >= 0 && index < size) {
                    // get reference to node, then data in node
                    Node curr = find(index);
                    Object dataItem = curr.item;
                    return dataItem;
            }
            else {
                throw new ListIndexOutOfBoundsException("List index out of bounds on get");
            }
    }

    @Override
    public void removeAll() {
        head = null; size = 0;
    }
}
