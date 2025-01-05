public class NoWaysToSplitArray {
    public static void main(String[] args) {
        int[] nums={2,3,1,0};
        int n=nums.length;
        int[] ps=new int[n];
        ps[0]=nums[0];
        for(int i=1;i<n;i++){
            ps[i]=ps[i-1]+nums[i];
        }
        System.out.println();
        for(int val:ps){
            System.out.print(val+" ");
        }
        int count=0;
        for(int i=0;i<n-1;i++){
            int p=ps[i];
            int cs=0;
            for(int j=i+1;j<n;j++){
                cs+=nums[j];
            }
            if(p>=cs)count++;
        }
        System.out.println(count);
    }
}
