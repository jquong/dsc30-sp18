import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Implementation of a Binary Search Tree.
 * The tree holds Node objects that have key,value structure.
 */

//TODO: Remember to add javadoc comments to ever method in this file which requires it
public class BSTree<T> implements IDupTree<T>{

    private BSTNode root;    //BST Tree root
    private int nelems;      //Number of nodes in the trees

    /**
     * Inner class defining the node structure that will be used for the BST Tree
     * */
    protected class BSTNode{
        Integer key;            //The value on which the node will be placed
        ArrayList<T> dataList;  /*The associated data stored in the node.
                                  Since there are duplicates we store as a list*/
        BSTNode leftChild;      //The left child
        BSTNode rightChild;     //The right child


        /**
         * Constructs a leaf node that stores an integer key and it's associated data
         *
         */
        BSTNode(BSTNode leftChild, BSTNode rightChild, Integer key, T data){
            //TODO: implement
        }

        /**
         * Gets the key of the this node
         *
         */
        Integer getKey(){
            //TODO: implement
            return null;
        }

        /**
         * sets left node pointer for this node
         *
         */
        void setLeftChild(BSTNode newLeftChild){
            //TODO: implement
        }

        /**
         * Returns the left child node of the current node
         *
         */
        BSTNode getLeftChild(){
            //TODO: implement
            return null;
        }

        /**
         * sets right node pointer for this node
         *
         */
        void setRightChild(BSTNode newRightChild){
            //TODO: implement
        }

        /**
         * Returns the right child node of the current node
         *
         */
        BSTNode getRightChild(){
            //TODO: implement
            return null;
        }

        /**
         * Returns the list of data associated with this node
         *
         */
        ArrayList<T> getDataList(){
            //TODO: implement
            return null;
        }

        /**
         * Adds a new value to an existing node
         *
         */
        void addData(T data){
            //TODO: implement
        }


        /**
         * HELPER METHODS FOR TESTING*/
        private boolean subTreeCompare(BSTNode root){
            if(nodeCompare(this, root)){
                boolean left = true;
                boolean right = true;

                if(this.leftChild != null)
                    left = this.leftChild.subTreeCompare(root.leftChild);
                else if(root.leftChild != null)
                    left = false;
                else
                    left = true;

                if(this.rightChild != null)
                    right = this.rightChild.subTreeCompare(root.rightChild);
                else if(root.rightChild != null)
                    right = false;
                else
                    right = true;
                
                return (left && right);
            }

            return false;
        }

        /**
         * HELPER METHODS FOR TESTING*/
        private boolean nodeCompare(BSTNode one, BSTNode two){
            if(one == null && two == null){
                return true;
            }
            else if(one == null || two == null){
                return false;
            }
            else if(one.getKey() == two.getKey()){
                List<T> oneData = one.getDataList();
                List<T> twoData = two.getDataList();
                if(oneData.equals(twoData)){
                    return true;
                }
            }

            return false;
        }

    }


    /**
     * Constructs an empty BST.
     */
    public BSTree() {
        //TODO: implement
    }

    /**
     * Returns the root of this tree. Only used in the treeCompare method
     * (refer to writeup to read more about treeCompare)
     *
     *
     * */
    public BSTNode getRoot(){
        //TODO: implement
        return null;
    }

    /**
     * Returns the number of nodes in this tree
     *
     */
    public int getSize() {
        //TODO: implement
        return -1;
    }

    /**
     * Finds if a Node in the BST holds the key
     *
     */
    public boolean containsKey(Integer key) throws NullPointerException{
        //TODO: implement
        return false;
    }

    /**
     * Finds a Node in the BST based on key and returns it's data
     *
     */
    public List<T> getData(Integer key) throws NullPointerException, NoSuchElementException{
        //TODO: implement
        return null;
    }

    /**
     * Checks to see if a key,value pair exists in the tree
     *
     */
    public boolean findPair(int key, T element){
        //TODO: implement
        return false;
    }

    /**
     * Inserts the data into the tree at a Node with the appropriate key value.
     * If one does not exist it will create a new node in the tree.
     *
     */
    public boolean insert(Integer key, T data) throws NullPointerException{
        //TODO: implement
        return false;
    }


    /**
     * EXTRA CREDIT!
     *
     *  Removes node from tree with given key
     *
     */
    public List<T> remove(Integer key) throws  NoSuchElementException{
        //TODO: implement
        return null;
    }


    /**
     * HELPER METHODS FOR TESTING. Refer to the writeup and BSTreeTester.java file for info on how to use it*/
    public boolean treeCompare(BSTree<T> other){
        if(root == null && other.root == null){
            return true;
        }
        else if(root == null || other.root == null){
            return false;
        }
        return root.subTreeCompare(other.root);
    }

}
