import java.util.Collections;
import java.util.PriorityQueue;
public class KthMinEle {
    public static void main(String[] args) {
        int[] arr={4,3,1,2,5};
        int k=2;//2nd smallest element - 4
        //max heap
        PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<2;i++){
            maxheap.add(arr[i]);
        }
        for(int i=k;i<arr.length;i++){
            if(arr[i]<maxheap.peek()){
                maxheap.poll();
                maxheap.add(arr[i]);
            }
         
        }
        System.out.println("\n"+maxheap.peek());
    }
}
