/*
 * class Solution {
    public boolean isIsomorphic(String s, String t) {
        int flag=1;
        HashMap<Character,Character> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(map.containsKey(ch1)){
                if(map.get(ch1) != ch2){
                    flag=0;
                    return false;
                }
            }else{
                if(map.containsValue(ch2))return false;
                map.put(ch1,ch2);
            }
        }
        if(flag==1)return true;
        return false;
    }
}
 */