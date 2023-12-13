public class pow_of_two_num {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;

        int ans = pow(a,b);
        System.out.println(ans);
    }

    private static int pow(int a, int b) {
        if(b==1){
            return a;
        }
        return a * pow(a , b-1);
    }
}
