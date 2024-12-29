public class ValidPalindrome {
    public static boolean isPalindrome(String s1){
        if(s1.length()==0)return true;
        
        int i=0;
        int j=s1.length()-1;
        char arr[]=s1.toCharArray();
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        String rev=String.valueOf(arr);
        if(rev.equals(s1))return true;
        return false;
    }
    public static void main(String[] args) {
        String s1="noon";
        

        System.out.println(isPalindrome(s1));
    }
}
