import static org.junit.Assert.*;

public class BSTreeTester {

    @Test
    //TODO: REMOVE THIS TEST IF YOU DO NOT IMPLEMENT REMOVE
    public void ExampleTest(){
        BSTree<String> t = new BSTree<>();

        t.insert(5,"A");
        t.insert(3,"B");
        t.insert(10,"C");
        t.insert(8,"D");

        t.remove(10); //This will cause your tree to change in structure

        //Create a BST of the correct structure
        BSTree<String> solution = new BSTree<>();
        solution.insert(5,"A");;
        solution.insert(3,"E");
        solution.insert(8,"D");

        //Use the treeCompare function to check wether your AVL rotated correctly
        assertTrue(solution.treeCompare(t));
    }

}
