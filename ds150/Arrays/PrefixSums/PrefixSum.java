public class PrefixSum {
    public static void main(String[] args) {
        int[] arr={2,1,3,4,5};
        int n=arr.length;
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        System.out.println();
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
