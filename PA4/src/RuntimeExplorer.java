import java.util.AbstractList;
import java.util.ArrayList;

public class RuntimeExplorer {

    public static void main(String [] args){
        String smallNamesFile = "SmallNames.txt";
        String mediumNamesFile = "MediumNames.txt";
        String largeNamesFile = "LargeNames.txt";

        String prideAndPredjudice = "PrideAndPredjudice.txt";

        //Run 1.1
        AbstractList<String> names = readNames(smallNamesFile);
        ArrayList<String> words = readFile(prideAndPredjudice, 5000);
        long startTime1 = System.nanoTime();
        ArrayList<Pair> wordCounts = getNameCounts(names, words);
        long endTime1   = System.nanoTime();
        long totalTime1 = endTime1 - startTime1;
        //Repeat for 10,000 words

        //TODO: Complete all other empircal runtime expieriments INCLUDING SORTING

    }

    public static ArrayList<Pair> getNameCounts(AbstractList<String> names, ArrayList<String> words){
        //TODO: implement
        return null;
    }

    public static AbstractList<String> readNames(String fileName){
        //TODO: implement
        return null;
    }

    public static ArrayList<String> readFile(String fileName, int numWords){
        //TODO: implement
        return null;
    }
}
