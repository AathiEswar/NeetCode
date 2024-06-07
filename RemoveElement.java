package NeetCode;

public class RemoveElement {
    public static int removeElement(int[] nums , int target){
        int j = 0;

        for(int i= 0; i< nums.length;i++){
            if(nums[i] != target) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
