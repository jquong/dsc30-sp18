/**
 * Implementation of the Queue ADT using a Circular Array
 */
public class CircularArrayQueue implements QueueADT {
    private static final int DEFAULT_SIZE = 5;
    private static final int GROWTH_FACTOR = 2;

    private int[] circularArray;
    private int length;
    private int head;
    private int tail;

    /**
     * Creates a new, empty queue of default capacity
     */
    public CircularArrayQueue() {
        //TODO:
    }

    /**
     * Creates an empty queue of a specified capacity
     *
     * @param capacity the initial amount of space to reserve for the queue
     */
    public CircularArrayQueue(int capacity) {
        //TODO:
    }

    /**
     * Adds a new element to the tail of the Queue
     *
     * @param elem integer to add
     * @return true
     */
    public void add(int elem) {
        //TODO:
    }

    /**
     * Determines if the Queue is empty
     *
     * @return true if the number of elements in the Queue is 0
     */
    public boolean isEmpty() {
        //TODO:
        return false;
    }

    /**
     * Returns the head of the Queue
     *
     * @return head of the Queue, or 0 if the Queue is empty
     */
    public int peek() {
        //TODO:
        return 0;
    }

    /**
     * Returns and removes the element at the head of the Queue
     *
     * @return head of the queue, or 0 if the Queue is empty
     */
    public int remove() {
        //TODO:
        return 0;
    }

    /**
     * Removes all elements from the Queue
     */
    public void clear() {
        //TODO:
    }

    /**
     * Determines the number of elements in the Queue
     *
     * @return number of elements in the Queue
     */
    public int size() {
        //TODO:
        return 0;
    }
}
