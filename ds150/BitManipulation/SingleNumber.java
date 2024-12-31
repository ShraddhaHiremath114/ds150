import java.util.*;

public class SingleNumber{
    public static void main(String[] args) {
        int[] arr={2,2,1};
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
        /*
        class Solution {
    public int singleNumber(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor=xor^nums[i];
        }
        return xor;
    }
}
    Initialize 
𝑥
𝑜
𝑟
=
0
xor=0.

Traverse the array and XOR each number with the current 
𝑥
𝑜
𝑟
xor.

Iteration 1: 
𝑥
𝑜
𝑟
=
0
⊕
4
=
4
xor=0⊕4=4
Current value of 
𝑥
𝑜
𝑟
xor: 
4
4

Iteration 2: 
𝑥
𝑜
𝑟
=
4
⊕
1
=
5
xor=4⊕1=5
Current value of 
𝑥
𝑜
𝑟
xor: 
5
5

Iteration 3: 
𝑥
𝑜
𝑟
=
5
⊕
2
=
7
xor=5⊕2=7
Current value of 
𝑥
𝑜
𝑟
xor: 
7
7

Iteration 4: 
𝑥
𝑜
𝑟
=
7
⊕
1
=
6
xor=7⊕1=6
Current value of 
𝑥
𝑜
𝑟
xor: 
6
6

Iteration 5: 
𝑥
𝑜
𝑟
=
6
⊕
2
=
4
xor=6⊕2=4
Current value of 
𝑥
𝑜
𝑟
xor: 
4
4

After the loop, the value of 
𝑥
𝑜
𝑟
xor is 
4
4, which is the single number.

How XOR Cancels Pairs:
Numbers appearing twice cancel out because 
𝑥
⊕
𝑥
=
0
x⊕x=0.
For example:
4
⊕
1
⊕
2
⊕
1
⊕
2
=
(
4
)
⊕
(
1
⊕
1
)
⊕
(
2
⊕
2
)
4⊕1⊕2⊕1⊕2=(4)⊕(1⊕1)⊕(2⊕2)
=
4
⊕
0
⊕
0
=
4
=4⊕0⊕0=4.
Thus, the single number 
4
4 remains.
         */

/*
 * third soln
 * public class UniqueNo {
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

 * 
 */
    }
}