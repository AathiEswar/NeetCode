package NeetCode;

import java.util.ArrayList;
import java.util.List;

public class FindAllDisNum {
    public List<Integer> findALl(int[] nums){

        for(int num : nums){
            int index = Math.abs(num);

            if(nums[index-1] > 0){
                nums[index-1] *= -1;
            }
        }

        List<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] > 0){
                list.add(i+1);
            }
        }

        return list;
    }
}
