public class reverse_num_using_recursion {
    // Variable to store reversed
    // number after every
    // recursive call
    static int rev = 0;
    public static void main(String[] args) {
        int num = 987654321;
        reverse_num(num);
        System.out.println(rev);
    }

    private static void reverse_num(int num) {
        // base condition to end the
        // recursive calling of function
        if(num==0)
        {
            return;
        }
        int r = num%10;
        rev =(rev*10)+ r;
        reverse_num(num/10);
    }
}
