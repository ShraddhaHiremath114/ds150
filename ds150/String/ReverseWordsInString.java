public class ReverseWordsInString {
    public static void main(String[] args) {
        String str="Java Code";
        String ans="";

        int end=str.length();
        int ind=str.length()-1;

        while(ind>0){
            if(str.charAt(ind)==' '){
                ans+=str.substring(ind+1, end);
                end=ind;
                ans+=" ";
            }
            
            ind--;
        }
        ans+=str.substring(ind, end);
        System.out.println(ans);

        String demo=" Hi ";
        demo=demo.trim();
        System.out.println(demo);
    }
}
