//704. Binary Search

Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
Example 2:

Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1
  

class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]<target) left=mid+1;
            else right=mid-1;
        }
        return -1;
    }
}
