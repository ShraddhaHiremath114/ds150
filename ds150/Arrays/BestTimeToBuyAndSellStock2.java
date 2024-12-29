public class BestTimeToBuyAndSellStock2 {
    public static void main(String[] args) {
        int[] arr={5,2,7,3,6,1,2,4};
        int n=arr.length;
        int profit=0;
        for(int i=0;i<n-1;i++){
            if(arr[i+1]>arr[i]){
                profit+=arr[i+1]-arr[i];
            }
        }
        System.out.println();
        System.out.println(profit);

    }
}
