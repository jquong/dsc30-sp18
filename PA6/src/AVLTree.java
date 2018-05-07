import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Implementation of an AVL tree.
 * The tree holds Node objects that have key,value structure.
 */

//TODO: Remember to add javadoc comments to ever method in this file which requires it
public class AVLTree <T> implements IDupTree<T>{

    private AVLNode root; //AVL tree root
    private int nelems;   //Number of nodes in tree

    /**
     * Inner class defining the node structure that will be used for the AVL Tree
     * */
    public class AVLNode {

        private Integer key;         //The value on which the node will be placed
        ArrayList<T> dataList;       /*The associated data stored in the node.
                                      Since there are duplicates we store as a list*/
        private int height;          //The height of this node
        private AVLNode leftChild;   //Left child
        private AVLNode rightChild;  //Right child
        private AVLNode parent;      //The parent of this node. Using this is OPTIONAL but recommended


        /**
         * Constructs a leaf node that stores an integer key and it's associated data
         *
         */
        AVLNode(Integer key, T data) {
            //TODO: Implement
        }

        /**
         * Gets the key of the this node
         *
         */
        Integer getKey() {
            //TODO: implement
            return null;
        }

        /**
         * Sets the Node pointer to the left child of the current node and parent pointer of the left child back up
         * to this node
         *
         */
        void setLeftChild(AVLNode leftChild) {
            //TODO: implement
        }

        /**
         * Returns the left child node of the current node
         *
         */
        AVLNode getLeftChild() {
            //TODO: implement
            return null;
        }

        /**
         * Sets the Node pointer to the right child of the current node and parent pointer of the right child back up
         * to this node
         *
         */
        void setRightChild(AVLNode rightChild) {
            //TODO: implement
        }

        /**
         * Returns the right child node of the current node
         *
         */
        AVLNode getRightChild() {
            //TODO: implement
            return null;
        }

        /**
         * Sets the parent pointer of this node to the passed in node
         *
         */
        void setParent(AVLNode parent) {

            //TODO: implement
        }

        /**
         * Returns the parent node of this node
         *
         */
        AVLNode getParent() {
            //TODO: implement
            return null;
        }

        /**
         * Sets the height value of this node
         *
         */
        void setHeight(int height){
            //TODO: implement
        }

        /**
         * Returns the height of this node
         *
         */
        int getHeight(){
            //TODO: implement
            return -1;
        }

        /**
         * Returns the list of data associated with this node
         *
         */
        ArrayList<T> getDataList() {
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
         * Recursively updates the height of this node and it's parent node
         */
        private void updateHeight(){

            AVLNode left = this.getLeftChild();
            AVLNode right = this.getRightChild();
            int leftHeight = 0;
            int rightHeight = 0;

            //Get heights
            if(left != null){
                leftHeight = left.getHeight();
            }
            if(right != null){
                rightHeight = right.getHeight();
            }

            //Get max child height
            int maxChildHeight = leftHeight;
            if(rightHeight > leftHeight){
                maxChildHeight = rightHeight;
            }

            //Set height
            if(left == null && right == null){
                this.setHeight(0);
            } else {
                this.setHeight(maxChildHeight+1);
            }
        }

        /**
         * Determines the balance factor of the current node
         * The balance factor is equal to the difference between the
         * height of the left subtree and the right subtree of the current node.
         *
         */
        int getBalanceFactor(){
            //TODO: implement
            return 0;
        }



        /**
         * HELPER METHOD FOR TESTING. Refer to the writeup and AVLTreeTest.java file for info on how to use it*/
        private boolean subTreeCompare(BSTree.BSTNode root){
            if(nodeCompare(this, root)){
                boolean left = true;
                boolean right = true;

                if(this.leftChild != null)
                    left = this.leftChild.subTreeCompare(root.leftChild);
                if(this.rightChild != null)
                    right = this.rightChild.subTreeCompare(root.rightChild);
                return (left && right);
            }

            return false;
        }

        /**
         * HELPER METHOD FOR TESTING. Refer to the writeup and AVLTreeTest.java file for info on how to use it*/
        private boolean nodeCompare(AVLNode one, BSTree.BSTNode two){
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
     * Constructs an empty AVL tree.
     */
    public AVLTree() {
        //TODO: implement
    }

    /**
     * Constructs an AVL tree, setting root to a new Node that contains
     * the T value, key
     *
     */
    public AVLTree(Integer key, T data) {
        //TODO: implement
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
     * Finds if a Node in the AVL tree holds the key
     *
     */
    public boolean containsKey(Integer key) {
        //TODO: implement
        return false;
    }

    /**
     * Finds a Node in the AVL tree based on key and returns it's data
     *
     */
    public List<T> getData(Integer key) {
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
    public boolean insert(Integer key, T data) throws  NullPointerException {
        //TODO: implement

        return true;
    }

    /**
     * EXTRA CREDIT!
     *
     *  Removes node from tree with given key
     *
     */
    public List<T> remove(Integer key) throws NoSuchElementException{

        //TODO: implement
        return null;
    }


    /**
     * OPTIONAL METHOD BUT RECOMMENDED
     * Rebalances the AVL rooted at current
     *
     */
    private void rebalance(AVLNode current) {

        current.updateHeight();

        //Too right heavy
        if (current.getBalanceFactor() == -2) {

            // Double rotation case.
            if (current.getRightChild().getBalanceFactor() == 1) {
                //TODO: Add code here
            }

            //TODO: Add code here

        }
        //Too left heavy
        else if (current.getBalanceFactor() == 2) {

            // Double rotation case.
            if (current.getLeftChild().getBalanceFactor() == -1) {
                //TODO: Add code here
            }

            //TODO: Add code here
        }
    }

    /**
     * OPTIONAL METHOD BUT RECOMMENDED
     * Replaces the child of a node with a different node
     *
     */
    private void replaceChild(AVLNode parent, AVLNode currentChild, AVLNode newChild){
        //TODO: implement
    }

    /**
     * Rotates tree rooted at node, to the right. Based on ZYBooks algorithm
     *
     */
    private void rotateRight(AVLNode node) {
        //TODO: implement
    }

    /**
     * Rotates tree rooted at node, to the left. ZYBooks algorithm
     *
     */
    private void rotateLeft(AVLNode node) {
        //TODO: implement
    }


    /**
     * HELPER METHODS FOR TESTING. Refer to the writeup and AVLTreeTest.java file for info on how to use it*/
    public boolean treeCompare(BSTree<T> other){
        if(root == null && other.getRoot() == null){
            return true;
        }
        else if(root == null || other.getRoot() == null){
            return false;
        }
        return root.subTreeCompare(other.getRoot());
    }
}
