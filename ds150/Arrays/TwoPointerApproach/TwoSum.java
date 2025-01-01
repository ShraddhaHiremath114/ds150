import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int n=arr.length;
        int target=9;
        System.out.println();

    //Method 1 (Brute Force) Time Complexity: O(n^2)
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]+arr[j]==target){
                System.out.println(i+" "+j);
            }
        }
    }

    //Method 2: Using Two Pointer Approach
    //First sort the array: Time complexity: O(nlogn)
    //Total time complexity: O(nlogn)+O(n)=O(nlogn) higher order term is nlogn
    /*
     * Arrays.sort(arr);
    int i=0;
    int j=n-1;
    while(i<j){
        if(arr[i]+arr[j]==target){
            System.out.println("Found");
        }else if(arr[i]+arr[j]>target){
            j--;
        }else{
            i++;
        }
    }

     */
    
    //Method 3 : Using Hashing (HashMap) Time Complexity: O(n)+Space Complexity: O(n)
    
    Map<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<n;i++){
        int complement=target-arr[i];
        if(map.containsKey(complement)){
            System.out.println(map.get(complement)+" "+i);
        }
        map.put(arr[i],i);
    }
}

}
