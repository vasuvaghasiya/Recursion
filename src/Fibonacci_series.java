public class Fibonacci_series {
    public static void main(String[] args) {
        int n = 7;
         System.out.println(fibonacciSeries(n));
    }

    private static int fibonacciSeries(int n) {
        if(n==1) return 0;
        if(n==2) return 1;
        return fibonacciSeries(n-1) + fibonacciSeries(n-2);

    }
}
