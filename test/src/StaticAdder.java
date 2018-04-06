public class StaticAdder {
    private static int sum;


    StaticAdder(int num)
    {
        this.sum = num;
    }

    public void add(int num)
    {
        sum += num;
    }

    public void subtract(int num){
        sum -= num;
    }

    public int getValue()
    {
        return sum;
    }
}

