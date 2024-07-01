package NeetCode;

import java.util.HashMap;

public class NextGreaterElement1 {
    public int[] nextGreaterElement1(int[] nums1 , int[] nums2){

        // to save the greater element of each num
        HashMap<Integer , Integer> map = new HashMap<>();

        // initialize vars
        int i = 0;
        int j = 1;
        int n = nums1.length;
        int m = nums2.length;

        // iterate from 0 to m
        while(i < m){

            // if j reaches last element no max found so map with -1
            if(j == m){
                map.put(nums2[i] , -1);
                i++;
                j = i+1;
            }

            // if next element itself greater then add that to map
            else if(nums2[i] < nums2[j]){
                map.put(nums2[i] , nums2[j]);
                i++;
                j = i + 1;
            }
            // if no max found move the j pointer to next to find max
            else{
               j++;
            }
        }

        int[] res = new int[n];

        for(int k = 0 ; k < n;k++){
            res[k] = map.get(nums1[k]);
        }
        return res;

    }
}
