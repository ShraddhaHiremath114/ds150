import java.util.PriorityQueue;
public class KthMaxEle {
    public static void main(String[] args) {
        int[] arr={4,3,1,2,5};
        int k=2;//2nd largest element - 4
        //min heap
        PriorityQueue<Integer> minheap=new PriorityQueue<>();

        for(int i=0;i<2;i++){
            minheap.add(arr[i]);
        }
        for(int i=k;i<arr.length;i++){
            if(arr[i]>minheap.peek()){
                minheap.poll();//removes head of the queue
                minheap.add(arr[i]);
            }
            
        }
        System.out.println("\n"+minheap.peek());
    }
}
