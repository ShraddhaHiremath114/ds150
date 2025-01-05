import java.util.HashSet;
import java.util.Set;

public class PalindromicSeq3 {
    public static void main(String[] args) {
        String s = "adc";
        int n = s.length();
        int ans = 0;

        Set<Character> set = new HashSet<>();
        for (int i = 0; i < n - 1; i++) {
            int j = n - 1;
            while (i < j) {
                if (!set.contains(s.charAt(i))) {
                    set.add(s.charAt(i));
                    if (s.charAt(i) == s.charAt(j)) {
                        ans += (j - i - 1);
                        break;
                    }
                }
                j--;
            }
            
        }
        System.out.println(ans);
    }
}
