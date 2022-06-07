public class RemoveOneElement {

    public boolean canBeIncreasing(int[] nums) {
        boolean removed = false;
        int n = nums.length;
        for(int i=1;i<n;i++)
        {
            if(nums[i-1]>=nums[i])
            {
                if(removed)
                    return false;
                removed = true;
                if(i>1 && nums[i-2]>=nums[i])
                {
                    nums[i] = nums[i-1];
                }
            }
        }
        
        return true;
    }
    
}
