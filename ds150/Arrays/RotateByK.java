public class RotateByK {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        int n=nums.length;
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[(i+k)%n]=nums[i];

        }
        for(int i=0;i<n;i++){
            nums[i]=arr[i];
        }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
