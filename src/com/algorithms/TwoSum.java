package com.algorithms;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }throw new IllegalArgumentException("No such result");
    }


    public int[] twoSum1(int[] nums,int target){
        Map<Integer,Integer> map= new HashMap<>();
        for (int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for (int i=0;i<nums.length;i++){
            int remain = target-nums[i];
            if (map.containsKey(remain)&&map.get(remain)!=i){
                return new int[] {i,map.get(remain)};
            }
        }throw new IllegalArgumentException("No such result");
    }
}
