package NeetCode;

public class ValidParenthesis2 {
    boolean validparenthesis2(String s){

        for(int i = 0  , j = s.length()-1; i < j ; i++ , j--){
            if(s.charAt(i) != s.charAt(j)){
                return isValid(s , i+1, j ) || isValid(s , i , j-1) ;
            }
        }
        return true ;
    }

    public boolean isValid(String s , int start , int end){
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
