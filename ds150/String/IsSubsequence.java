public class IsSubsequence{
    public static void main(String[] args) {
        String s = "cde";
        String t = "abcde";

        int n=s.length();
        int m=t.length();
        
        int i=0;
        int j=0;
        while(i<n && j<m){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        if(i==n){
            System.out.println("Yes!");
        }else{
            System.out.println("No");
        }
    }
}