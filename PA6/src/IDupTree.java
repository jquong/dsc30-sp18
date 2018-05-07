import java.util.List;
import java.util.NoSuchElementException;

public interface IDupTree<T> {

    /**gets the size of a tree
     *
     * @return the number of elements in the tree
     */
    int getSize();

    /**adds a node with key and data to tree
     *
     * @param key the value the data will be stored based on
     * @throws NullPointerException if either key or data is null
     * @return whether or not insertion was successful (if key already exists return false)
     */
    boolean insert(Integer key, T data) throws NullPointerException;

    /**
     * Removes node with key from tree
     *
     * @param key The node to remove
     * @throws NoSuchElementException if key does not exist in this BSTree
     * @return the data of the removed node*/
    List<T> remove(Integer key) throws  NoSuchElementException;

    /** finds if an element is in a tree
     *
     * @param key the thing too look for
     * @throws NullPointerException if looking for null
     * @return if a node with key exists in the tree
     */
    boolean containsKey(Integer key) throws NullPointerException;


    /** finds if an element is in a tree
     *
     * @param key the thing too look for
     * @return the data associated with that key
     * @throws NullPointerException if looking for null
     * @throws NoSuchElementException if no key exists with key in tree
     */
    List<T> getData(Integer key) throws NullPointerException, NoSuchElementException;

    /**
     * checks to see if a key,value pair exists in the tree
     *
     * @param key Node to find
     * @param element value at node to find
     * @return whether or not the key,value pair exists in the tree
     */
    boolean findPair(int key, T element);
}
