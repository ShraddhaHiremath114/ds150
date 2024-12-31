import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr={2,2,1};
        //Method 1
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }
        for(Map.Entry<Integer,Integer> key:map.entrySet()){
            if(key.getValue()==1){
                System.out.println(key.getKey());
                break;
            }
        }

        //Method 2
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

        //Method 3
        
    }
    public static int singleNumber(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor=xor^nums[i];
        }
        return xor;
    }
}
