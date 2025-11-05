"""
Problem: Two Sum
Platform: LeetCode
Difficulty: Easy
Time Complexity: O(n)
Space Complexity: O(n)
"""

from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        """
        Find two indices where nums[i] + nums[j] = target
        
        Args:
            nums: List of integers
            target: Target sum
            
        Returns:
            List containing two indices [i, j]
        """
        # Hash map to store number and its index
        num_map = {}
        
        # Iterate through the array
        for i, num in enumerate(nums):
            # Calculate the complement
            complement = target - num
            
            # Check if complement exists in map
            if complement in num_map:
                # Found the pair, return indices
                return [num_map[complement], i]
            
            # Add current number to map
            num_map[num] = i
        
        # No solution found - this line ensures function returns a value
        # but should never execute as problem guarantees exactly one solution exists
        return []

# Example Usage
if __name__ == "__main__":
    sol = Solution()
    
    # Test Case 1
    nums1 = [2, 7, 11, 15]
    target1 = 9
    print(f"Input: nums = {nums1}, target = {target1}")
    print(f"Output: {sol.twoSum(nums1, target1)}")  # [0, 1]
    
    # Test Case 2
    nums2 = [3, 2, 4]
    target2 = 6
    print(f"\nInput: nums = {nums2}, target = {target2}")
    print(f"Output: {sol.twoSum(nums2, target2)}")  # [1, 2]
    
    # Test Case 3
    nums3 = [3, 3]
    target3 = 6
    print(f"\nInput: nums = {nums3}, target = {target3}")
    print(f"Output: {sol.twoSum(nums3, target3)}")  # [0, 1]
