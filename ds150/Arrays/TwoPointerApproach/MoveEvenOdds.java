public class MoveEvenOdds {
    public static void main(String[] args) {
        int[] arr={2,1,3,4,5};
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
            if(arr[i]%2==0){
                i++;

            }else if(arr[j]%2!=0){
                j--;
            }else{
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }

        }
        System.out.println();
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
