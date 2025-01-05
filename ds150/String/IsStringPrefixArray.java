public class IsStringPrefixArray{
    public static void main(String[] args) {
        String s="iloveleetcode";
        String[] arr={"i","love","leetcode","apples"};
        int n=arr.length;
        String prefixString=arr[0];
        for(int i=1;i<n;i++){
            prefixString+=arr[i];
        }
        System.out.println(prefixString);
        System.out.println(s.equals(prefixString));

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=prefixString.charAt(i)){
                System.out.println("False");
            }

        }
        String s1="a";
        String s2="aa";
        System.out.println(s1.equals(s2));
        System.out.println(s2.indexOf(s1));

    }
}