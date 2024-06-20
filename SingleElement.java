package NeetCode;

public class SingleElement {
    public int singleElement(int[] nums){
        int theNum = 0;

        for(int num : nums){
            // the XOR return 0 when two element is same
            theNum = theNum ^ num;
        }

        return theNum;
    }
}
