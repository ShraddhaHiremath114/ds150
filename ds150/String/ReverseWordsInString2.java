public class ReverseWordsInString2{
    public static void main(String[] args) {
        String s="Let's take LeetCode contest";
        StringBuilder sb=new StringBuilder();
        
        
        int n=s.length();
        int ind=0;
        int end=0;
        while(end<=n-1){
            if(s.charAt(end)==' '){
                    StringBuilder csb=new StringBuilder();
                csb.append(s.substring(ind,end));
                
                csb.reverse();
                sb.append(csb);
                sb.append(" ");
                ind=end+1;
            }
            end++;
            
        }
        StringBuilder temp=new StringBuilder();
        temp.append(s.substring(ind, end));
        temp.reverse();
        sb.append(temp);

        System.out.println(sb.toString());
    }
}