package NeetCode;

public class FirstOccurenceOfSubString {
    public int firstOccurence (String haystack , String needle){
        //loop till hay - needle len
        for (int i = 0; i < haystack.length() - needle.length(); i++) {
            // declare j outside to use it to after check len
            int j ;

            // iterate till the len of needle
            for(j = 0; j < needle.length();j++){

                // if not matching char break
                if(haystack.charAt(j+i) != needle.charAt(j)){
                    break;
                }
            }
            //check if the j and needle len matches if so return i which is the start of the substring occurence
            if(j == needle.length())return i;
        }

        // if ntng matches return -1
        return -1;
    }
}
