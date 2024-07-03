package NeetCode;

public class ReverseString3 {
    public String reverseString3(String s){
       char[] cArr = s.toCharArray();

       int left = 0;
       int right = 0;

       while(right < cArr.length){
           if(cArr[right] == ' '){
               reverseStr(cArr , left , right );
               left = right + 1;
           }
           right +=1;
       }

       reverseStr(cArr , left , right-1);

       return new String(cArr);
    }

    public void reverseStr(char[] cArr , int start , int end){

        while(start < end){
            char temp = cArr[start];
            cArr[start] = cArr[end];
            cArr[end] = temp;

            start++;
            end--;
        }
    }
}
