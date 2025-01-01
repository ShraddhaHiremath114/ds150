public class SortZerosOnce{
    public static void main(String[] args) {
        int[] arr={0,1,1,0,0,1};
        int n=arr.length;

        int i=0;
        int j=0;
        while(j<n){
            if(arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
            }else{
                j++;
            }
        }
        System.out.println();
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}