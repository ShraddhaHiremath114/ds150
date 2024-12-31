public class TargetSum {
    public static void main(String[] args) {
        int[] arr={4,6,3,5,2};
        int n=arr.length;
        int target=7;
        int pairs=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target)pairs++;
            }
            
        }
        System.out.println("\n"+ pairs);
    }
}
