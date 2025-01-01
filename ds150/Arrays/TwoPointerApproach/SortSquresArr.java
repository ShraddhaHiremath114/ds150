public class SortSquresArr {
    public static void main(String[] args) {
        int[] arr={-10,-3,-2,1,4,5};
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
            if(arr[i]*arr[i]>arr[j]*arr[j]){
                int temp=arr[i]*arr[i];
                arr[i]=arr[j]*arr[j];
                arr[j]=temp;
                i++;
                j--;

            }else{
                i++;
            }
        }
        System.out.println();
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
