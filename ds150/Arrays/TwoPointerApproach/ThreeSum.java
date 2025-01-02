import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 0};
        int n = nums.length;
        // Method 1: Brute Force Time Complexity: O(n^3)
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        Collections.sort(temp);
                        set.add(temp);
                    }
                }
            }
        }

        for (List<Integer> l : set) {
            ans.add(l);
        }

        System.out.println(ans);
    }
}
/*
 * Method 2: Two pointer technique:
 * Time Complexity = O(sorting)+O(outer loop×inner loop)=O(nlogn)+O(n×n)=O(n 
2
 )
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        List<List<Integer>> ans=new ArrayList<>();
        Set<List<Integer>> set=new HashSet<>();

        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            int s=i+1;
            int e=n-1;
            while(s<e){
                if(nums[i]+nums[s]+nums[e]==0){
                    List<Integer> temp=new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[s]);
                    temp.add(nums[e]);
                    set.add(temp);
                    s++;e--;
                }else if(nums[i]+nums[s]+nums[e]<0){
                    s++;
                }else{
                    e--;
                }
                
            }
        }
        for(List<Integer> list:set){
            ans.add(list);
        }
        return ans;
    }
}
 */