package bms.practice.ad;

import org.junit.jupiter.api.Test;

public class SearchInsert {

    public int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] >= target)
                return i;

        }
        return nums.length;
    }

    @Test
    public void actualCheck() {
        int[] nums = new int[]{1,3,5,6};
        int target = 2;
        int ans = searchInsert(nums, target);
        assert ans == 1;

        nums = new int[]{1,3,5,6};
        target = 5;
        ans = searchInsert(nums, target);
        assert ans == 2;

        nums = new int[]{1,3,5,6};
        target = 7;
        ans = searchInsert(nums, target);
        assert ans == 4;

    }

}
