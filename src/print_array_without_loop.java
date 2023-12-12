public class print_array_without_loop {
    public static void main(String[] args) {
        int [] arr = {4,1,2,5,3,6};
        printArr(arr,arr.length-1);
    }

    private static void printArr(int[] arr,int n) {
        if(n==-1){
            return;
        }
        printArr(arr,n-1);

        System.out.print(arr[n]+" ");


    }

}
