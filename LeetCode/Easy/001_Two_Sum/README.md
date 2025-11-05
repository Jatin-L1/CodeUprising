# Two Sum

## Problem Link
[LeetCode - Two Sum](https://leetcode.com/problems/two-sum/)

## Difficulty
Easy

## Problem Description
Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

### Example 1:
```
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
```

### Example 2:
```
Input: nums = [3,2,4], target = 6
Output: [1,2]
```

### Example 3:
```
Input: nums = [3,3], target = 6
Output: [0,1]
```

## Approach

**Method 1: Hash Map (Optimal)**

Use a hash map to store the numbers we've seen so far along with their indices. For each number, check if `target - current_number` exists in the hash map. If it does, we've found our pair. If not, add the current number to the hash map and continue.

**Algorithm:**
1. Create an empty hash map
2. Iterate through the array
3. For each element, calculate `complement = target - current_element`
4. Check if complement exists in hash map
   - If yes: return [map[complement], current_index]
   - If no: add current element to map with its index
5. Continue until pair is found

**Why this works:**
- We only need to traverse the array once
- Hash map lookup is O(1) on average
- We avoid nested loops

## Complexity Analysis
- **Time Complexity:** O(n) - Single pass through the array
- **Space Complexity:** O(n) - Hash map stores up to n elements

## Alternative Approach

**Method 2: Brute Force (Not Recommended)**
- Time Complexity: O(n²)
- Space Complexity: O(1)
- Use nested loops to check all pairs

## Tags
`Array`, `Hash Table`, `Two Pointers`

## Notes
- This is a classic interview problem
- Tests understanding of hash maps and space-time tradeoffs
- Always clarify if input is sorted (can use two-pointers approach)
