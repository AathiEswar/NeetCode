package NeetCode;

public class ValidStringPalindrome {
    public static boolean isValidStringPalindrome(String s){

        int i=0;
        int j = s.length();

        while(i<=j){
            char first  = s.charAt(i);
            char last = s.charAt(j);

            if(!Character.isLetterOrDigit(first)){
                i++;
            }


            else if(!Character.isLetterOrDigit(last)){
                j--;
            }

            else{
                if(Character.isLowerCase(first) != Character.isLowerCase(last)){
                    return false;
                }
                j--;
                i++;
            }
                                            }
        return true;
    }
}
