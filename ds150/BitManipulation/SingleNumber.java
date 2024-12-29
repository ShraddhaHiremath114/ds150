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
    }
}