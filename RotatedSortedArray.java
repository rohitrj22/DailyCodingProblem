public class RotatedSortedArray {

    int findPivot(int[] nums, int l, int h)
    {
        if(l>h)
            return -1;
        if(l==h)
            return l;
        int mid = (l+h)/2;
        if(mid<h && nums[mid]>nums[mid+1])
            return mid;
        if(mid>l && nums[mid]<nums[mid-1])
            return mid-1;
        if(nums[l]>nums[mid])
            return findPivot(nums,l,mid-1);
        return findPivot(nums,mid+1,h);
        
    }
    
    int binarySearch(int []nums,int l, int h, int target)
    {
        if(l>h)
            return -1;
        int mid = (l+h)/2;
        if(nums[mid]==target)
            return mid;
        if(target<nums[mid])
            return binarySearch(nums,l,mid-1,target);
         return binarySearch(nums,mid+1,h,target);
        
        
        
    }
    
    
    public int search(int[] nums, int target) {
        
        int pivot = findPivot(nums,0,nums.length-1);
        if(nums[pivot]==target)
                return pivot;
        System.out.println(pivot);
        if(target<nums[0])
            return binarySearch(nums,pivot+1,nums.length-1,target);
         return  binarySearch(nums,0,pivot-1,target);
    
        
    }
    
}
