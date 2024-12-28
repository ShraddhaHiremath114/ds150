import java.util.*;
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,1,1,1,1,1};
        int n=arr.length;
        
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        int max=0;
        int element=0;
        for(int i=0;i<map.size();i++){
            if(map.get(arr[i])>max){
                max=map.get(arr[i]);
                element=arr[i];
            }
        }
        System.out.println(element);

        // for(int i=0;i<n;i++){
        //     map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        // }
        // System.out.println(map);

    }
}
