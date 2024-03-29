package solution_junit.solution001;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import solution.Solution001TwoSum;
import solution.Solution001TwoSumHashMap;

import java.util.Arrays;
// import static org.junit.Assert.assertEquals; //JUnit4

class Solution001Test {
    @Test
    public void test01() {
        // Example 1:
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] ourput = {0, 1};
        String answer = Arrays.toString(Solution001TwoSum.twoSum(nums, target));
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName + " answer Value:" + answer);
        Assertions.assertEquals(Arrays.toString(ourput), answer);
    }

    @Test
    public void test02() {
        // Example 2:
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] ourput = {1, 2};
        String answer = Arrays.toString(Solution001TwoSum.twoSum(nums, target));
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName + " answer Value:" + answer);
        Assertions.assertEquals(Arrays.toString(ourput), answer);
    }

    @Test
    public void test03() {
        // Example 3:
        int[] nums = {3, 3};
        int target = 6;
        int[] ourput = {0, 1};
        String answer = Arrays.toString(Solution001TwoSum.twoSum(nums, target));
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName + " answer Value:" + answer);
        Assertions.assertEquals(Arrays.toString(ourput), answer);
    }

    @Test
    public void test04() {
        // Example 1:
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] ourput = {0, 1};
        String answer = Arrays.toString(Solution001TwoSumHashMap.twoSum(nums, target));
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName + " answer Value:" + answer);
        Assertions.assertEquals(Arrays.toString(ourput), answer);
    }

    @Test
    public void test05() {
        // Example 2:
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] ourput = {1, 2};
        String answer = Arrays.toString(Solution001TwoSumHashMap.twoSum(nums, target));
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName + " answer Value:" + answer);
        Assertions.assertEquals(Arrays.toString(ourput), answer);
    }

    @Test
    public void test06() {
        // Example 3:
        int[] nums = {3, 3};
        int target = 6;
        int[] ourput = {0, 1};
        String answer = Arrays.toString(Solution001TwoSumHashMap.twoSum(nums, target));
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName + " answer Value:" + answer);
        Assertions.assertEquals(Arrays.toString(ourput), answer);
    }
}