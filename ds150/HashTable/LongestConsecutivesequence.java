/*
 * class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
    for(int num:nums){
        set.add(num);

    }
    int LargestSeq=0;
    for(int num:nums){
        if(!set.contains(num-1)){
            int curSeq=num;
            int count=1;
            while(set.contains(curSeq+1)){
                curSeq++;
                count++;
            }
            LargestSeq=Math.max(LargestSeq, count);
        }
    }
        return LargestSeq;
    }
}
 */