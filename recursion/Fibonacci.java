package recursion;

public class Fibonacci {

    public static void main(String[] args){
        System.out.println(fib(45));
    }

    public static int fib(long n){
        if((n == 0)||(n ==1)){
            return (int) n;
        }
        return fib(n-1) + fib(n -2);
    }
}
