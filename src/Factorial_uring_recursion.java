public class Factorial_uring_recursion {
    public static void main(String[] args) {
        int n = 5;
        int ans = fact(n);
        System.out.println("factorial of " + n + " is " + ans);
    }

    private static int fact(int n) {
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
}
