public class Product_of_two_num {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int ans = product_Of_Two_Num(a,b);
        System.out.println(ans);
    }

    private static int product_Of_Two_Num(int a, int b) {
        if(b==0){
            return 0;
        }
        return a + product_Of_Two_Num(a, b - 1);

    }
}
