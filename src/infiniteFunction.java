public class infiniteFunction {
    public static void main(String[] args) {
        System.out.println("start");
        printHello();
        System.out.println("end");
    }

    private static void printHello() {
        //function must have exit condition other wise it's goes to infinite after some time give stack over flow error
        System.out.println("hello");
        printHello();
    }
}
