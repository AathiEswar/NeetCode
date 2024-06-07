package NeetCode;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s){
        int count = 0;

        boolean isWhite = false;

        for(int i=s.length()-1 ; i>= 0;i--){
            if(s.charAt(i) == ' ' && isWhite){
                break;
            }
            if(s.charAt(i) == ' '){
                count++;
                isWhite = true;
            }
        }

        return count;
    }
}
