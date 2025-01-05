public class ReverseString2{
    public static void main(String[] args) {
        String s="abcdefg";
        int k=2;
        int n=s.length();

        char[] arr=s.toCharArray();
        int i=0;
        while(i<n){
            int left = i;
            int right = Math.min(i + k - 1, n - 1); 
            while (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            i += 2 * k;
        }
        String ans=String.valueOf(arr);
        System.out.println(ans);
    }
}