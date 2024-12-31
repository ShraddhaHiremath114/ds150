public class UniqueNo {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,2,1,3};
        int n=nums.length;
    
        for(int i=0;i<n;i++){
            int count=1;
            for(int j=0;j<n;j++){
                if(i!=j && nums[j]==nums[i])count++;
            }
            if(count==1){
                System.out.println("\n"+nums[i]);
            break;
            }
            
        }
    }
}
