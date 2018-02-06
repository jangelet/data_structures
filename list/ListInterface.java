package list;

/**
 * Created by JANG3LET on 2/1/18.
 */
public interface ListInterface {

    //Returns true or false depending on if list is empty or not
    public boolean isEmpty();

    //Returns amount of items in list
    public int size();

    //Adds something to list
    public void add(int index, Object item) throws ListIndexOutOfBoundsException;

    //Removes something from list
    public void remove(int index) throws ListIndexOutOfBoundsException;

    //Gets something from list
    public Object get (int index) throws ListIndexOutOfBoundsException;

    //Removes everything from list
    public void removeAll();

}
