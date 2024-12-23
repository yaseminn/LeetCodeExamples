package arrayProblems;

import java.util.LinkedHashSet;

public class RemoveDuplicates {

    /*
    * Time complexity : O(n)
    * Space complexity : O(1)
     */
    public static int removeDuplicatesWithPointers(int[] nums) {
        int indexOfTemp = 0;
        if (nums == null || nums.length == 0) {
            return 0;
        }else {
            for (int i = 1; i < nums.length; i++) {
                if(nums[indexOfTemp] != nums[i]){
                    indexOfTemp++;
                    nums[indexOfTemp] = nums[i];
                }

            }
        }
        return indexOfTemp +1;
    }

    /*
     * Time complexity : O(n)
     * Space complexity : O(n)
     */
    public static int removeDuplicatesWithSet(int[] nums) {
        LinkedHashSet<Integer> tempSet = new LinkedHashSet<>();
        for(int num : nums){
            tempSet.add(num);
        }
        int i = 0;
        for(int num: tempSet){
            nums[i] = num;
            i++;
        }

        return tempSet.size();
    }
}
