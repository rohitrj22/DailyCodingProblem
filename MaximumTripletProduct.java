// Good morning! Here's your coding interview problem for today.

// This problem was asked by Facebook.

// Given a list of integers, return the largest product that can be made by multiplying any three integers.

// For example, if the list is [-10, -10, 5, 2], we should return 500, since that's -10 * -10 * 5.

// You can assume the list has at least three integers.


public class MaximumTripletProduct {
    public int maximumProduct(int[] nums) {
        int maxa=Integer.MIN_VALUE,maxb=Integer.MIN_VALUE,maxc=Integer.MIN_VALUE;
     int mina = Integer.MAX_VALUE,minb=Integer.MAX_VALUE;
     for(int i=0;i<nums.length;i++)
     {
         if(nums[i]>maxa)
         {
             maxc=maxb;
             maxb=maxa;
             maxa=nums[i];
         }
         else if(nums[i]>maxb)
         {
             maxc=maxb;
             maxb=nums[i];
         }
         else if(nums[i]>maxc)
         {
             maxc=nums[i];
         }
         if(nums[i]<mina)
         {
             minb=mina;
             mina=nums[i];
         }
         else if(nums[i]<minb)
             minb=nums[i];
     }
     return Math.max(maxa*maxb*maxc,mina*minb*maxa);
     
 }
    
}
