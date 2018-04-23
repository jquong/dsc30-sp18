public class Pair{
    String word;
    int count;

    public Pair(String word){
        this.word = word;
        this.count = 1;
    }

    public Pair(String word, int count){
        this.word = word;
        this.count = count;
    }

    public String getWord(){
        return word;
    }

    public int getCount(){
        return count;
    }

    public void incrementCount(){
        this.count++;
    }
}