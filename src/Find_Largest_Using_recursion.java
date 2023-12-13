public class Find_Largest_Using_recursion {
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) {
        int [] arr = {15,2,6,9,12};
        findLargest(arr,arr.length-1);
        System.out.println(max);

    }

    private static void findLargest(int[] arr, int n) {
        if(n==-1){
            return;
        }

        findLargest(arr,n-1);
        if(arr[n]>max)
        {
            max = arr[n];
        }

    }
}
