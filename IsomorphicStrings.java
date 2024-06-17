package NeetCode;

public class IsomorphicStrings {
    public boolean isomorphicStrings1(String s , String t){

        // create array of ascii size to store all possible ascii values
        int[] arr1 = new int[256];
        int[] arr2 = new int[256];

        //iterate to one of the strings

        for(int i=0;i<s.length();i++){
            //check if both the elements have same index in the array
            if( arr1[s.charAt(i)] != arr2[t.charAt(i)]){
                return false;
            }

            // if not then add the index of the element inside the array ( a = 97 and index = 1 so arr[97] = 1)
            arr1[s.charAt(i)] = i+1;
            arr2[s.charAt(i)] = i+1;
        }

        return true;
    }

}
