public class CheckPrefixWordInSentence {
    public static void main(String[] args) {
        String sentence = "i love eating burger";
        String prefix="burger";
        String[] words=sentence.split(" ");
        for(int i=0;i<words.length;i++){
            if(words[i].startsWith(prefix)){
                System.out.println(i+1);
                break;
            }
        }
    }
}
