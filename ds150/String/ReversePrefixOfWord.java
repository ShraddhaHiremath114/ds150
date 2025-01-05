public class ReversePrefixOfWord {
    public static void main(String[] args) {
        String word="abcdefg";
        String ch="d";
        int n=word.length();
        int ind=word.indexOf(ch);
        System.out.println(ind);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<=ind;i++){
            sb.append(word.charAt(i));
        }
        sb.reverse().toString();
        for(int i=ind+1;i<n;i++){
            sb.append(word.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
