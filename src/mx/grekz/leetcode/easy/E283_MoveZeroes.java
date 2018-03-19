package mx.grekz.leetcode.easy;

/**
 * @author grekz
 */
public class E283_MoveZeroes {
    public void moveZeroes(int[] nums) {
        int pointer = 0;
        for(int i = 0; i < nums.length ; i++){
            if(nums[i] != 0){
                changeArrayValues(nums, pointer++, i);
            }
        }
    }
    public void changeArrayValues(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}