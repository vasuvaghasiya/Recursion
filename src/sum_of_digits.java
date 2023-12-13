public class sum_of_digits {
    static int sum = 0;
    public static void main(String[] args) {

        int n = 12345;
        findSumOfDigits(n);
        System.out.println(sum);
    }

    private static void findSumOfDigits(int n) {
        if(n==0){
            return ;
        }
        int r = n%10;
         sum = sum + r;
        findSumOfDigits(n/10);

    }
}
