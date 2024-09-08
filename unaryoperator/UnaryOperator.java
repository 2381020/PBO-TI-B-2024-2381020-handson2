package unaryoperator;

public class UnaryOperator {
    public static void main(String[] args) {
    int x = 10;
    int y = -5;
    boolean isTrue = true;
//increment
        System.out.println("x awal: " + x);
        System.out.println("++x: " + ++x); //pre increment
        System.out.println("x++ awal: " + x++);// post increment
        System.out.println("x awal: " + x);
//decrement
        System.out.println("x awal: " + x);
        System.out.println("--x: " + --x);//pre decrement
        System.out.println("x-- awal: " + x--);//post decremet
        System.out.println("x awal: " + x);
//unary plus dan minus
        System.out.println("=x: " + x);
        System.out.println("-y: " + y);

        //logical not
        System.out.println("isTrue: " + !isTrue);


}
}