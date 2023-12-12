public class Count_digits_using_recursion {
    static int count = 0;
    public static void main(String[] args) {
        int num = 786546523;
        System.out.print(countNumber(num));
    }

//    private static void countNumber(int num) {
//        if(num==0){
//            return;
//        }
//        countNumber(num/10);
//        count++;
//    }
    private static int countNumber(int num) {
        if(num==0){
            return 0;
        }
        return 1+ countNumber(num/10);
    }
}
