package com.leetcode.algorithm;

/**
 * @author orangeC
 * @description 两数之和
 * @date 2020/2/10 22:24
 */
public class One {
    public static void main(String[] args) {
        System.out.println("开始：" + System.currentTimeMillis());
        int[] nums = new int[]{12,34,20,9,50,60,20,50};
        One numsTitleOne = new One();
        int[] targetInt = numsTitleOne.twoSum(nums,80);
        System.out.println(targetInt[0] + "," +  targetInt[1]);
        System.out.println("结束：" + System.currentTimeMillis());
    }

    public int[] twoSum(int[] nums, int target) {
        int count = 0;
        while(count<nums.length){
            for(int i=count+1;i<nums.length;i++){
                if(target == nums[count] + nums[i]){
                    return new int []{count,i};
                }
            }
            count++;
        }
        return null;
    }
}
