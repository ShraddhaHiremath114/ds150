public class BestTimeToBuyAndSellStock1 {
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        int n=arr.length;
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[i]){
                    max=Math.max(max,arr[j]-arr[i]);
                }
            }
        }
        System.out.println(max);
    }
}
