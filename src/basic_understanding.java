public class basic_understanding {
    public static void main(String[] args) {
        number1(1);
    }

    private static void number1(int n) {
        System.out.println(1);
        number2(2);
    }

    private static void number2(int n) {
        System.out.println(2);
        number3(3);
    }

    private static void number3(int n){
        System.out.println(3);
        number4(4);
    }

    private static void number4(int n) {
        System.out.println(4);
    }
}
