import org.junit.Test;

import static org.junit.Assert.*;

public class AVLTreeTester {

    @Test
    public void ExampleTest() {
        AVLTree<String> t = new AVLTree<>();

        t.insert(5,"A");
        t.insert(2,"B");
        t.insert(3,"C"); //Should cause a right rotation

        //Create a BST(NOT AVL) of the correct structure
        BSTree<String> sol = new BSTree<>();
        sol.insert(3,"C");
        sol.insert(2,"B");
        sol.insert(5,"A");

        //Use the treeCompare function to check whether your AVL rotated correctly
        assertTrue(t.treeCompare(sol));
    }

    //TODO: Add tests
}
