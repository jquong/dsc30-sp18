public class Static_debug {

    public static void main(String[] args){
        Adder one = new Adder(10);
        Adder two = new Adder(100);
        StaticAdder sone = new StaticAdder(10);
        StaticAdder stwo = new StaticAdder(100);

        one.add(100);
        one.subtract(110);

        sone.add(100);
        sone.subtract(110);

        System.out.println("one = " + one.getValue() + "\ntwo = " + two.getValue() + "\nsone = " + sone.getValue() + "\nstwo = " + stwo.getValue() );

    }
}
