import java.util.*;
public class FirstMissingPositive {
    public static void method2(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<=0){
                arr[i]=n+1;
            }
        }
        for(int i=0;i<n;i++){
            int ind=arr[i];
            if(ind<=n-1){
                arr[ind-1]=-1;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=-1){
                System.out.println(i+1);
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={3,4,-1,1};
        int n=arr.length;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(arr[i]);
        }
        for(int i=1;i<=n+1;i++){
            if(!list.contains(i)){
                System.out.println(i);
                break;
            }
        }
        method2(arr);
    }
}
