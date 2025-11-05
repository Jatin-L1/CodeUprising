/**
 * Problem: Two Sum
 * Platform: LeetCode
 * Difficulty: Easy
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

#include <vector>
#include <unordered_map>
using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        // Hash map to store number and its index
        unordered_map<int, int> numMap;
        
        // Iterate through the array
        for (int i = 0; i < nums.size(); i++) {
            // Calculate the complement
            int complement = target - nums[i];
            
            // Check if complement exists in map
            if (numMap.find(complement) != numMap.end()) {
                // Found the pair, return indices
                return {numMap[complement], i};
            }
            
            // Add current number to map
            numMap[nums[i]] = i;
        }
        
        // No solution found (shouldn't happen based on problem constraints)
        return {};
    }
};

/**
 * Example Usage:
 * 
 * Solution sol;
 * vector<int> nums = {2, 7, 11, 15};
 * int target = 9;
 * vector<int> result = sol.twoSum(nums, target);
 * // result = {0, 1}
 */
