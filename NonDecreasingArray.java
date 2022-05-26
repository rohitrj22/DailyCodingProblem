// Good morning! Here's your coding interview problem for today.

// This problem was asked by Facebook.

// Given an array of integers, write a function to determine whether the array could become non-decreasing by modifying at most 1 element.

// For example, given the array [10, 5, 7], you should return true, since we can modify the 10 into a 1 to make the array non-decreasing.

// Given the array [10, 5, 1], you should return false, since we can't modify any one element to get a non-decreasing array.














public class NonDecreasingArray {
    public boolean checkPossibility(int[] nums) {
        int count=0;
        boolean flag = true;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                if(flag)
                {
                    flag = false;
                    if(i!=0 && nums[i-1]>nums[i+1])
                        nums[i+1]=nums[i];
                    else
                        nums[i]=nums[i+1];
                }
                else
                    return false;
               
            }
                
        }
       return true;
        
    }
}
