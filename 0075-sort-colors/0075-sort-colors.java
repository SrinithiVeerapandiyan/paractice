import java.util.*;
import java.util.Arrays;

class Solution {
    public void sortColors(int[] nums) {
       Arrays.sort(nums);
       for(int i=0;i<nums.length;i++){
        System.out.print(Arrays.toString(nums));
       }
    }
}