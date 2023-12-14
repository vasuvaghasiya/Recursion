public class Prime_number {
    public static void main(String[] args) {
        int num = 11;
        System.out.println(isPrimeNumber(num,2));
    }

    private static boolean isPrimeNumber(int num, int i) {
        if(num==i) return true;

        if(num%i==0) return false;

        return isPrimeNumber(num , i+1);
    }

}
