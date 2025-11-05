# Contributing to CodeUprising

Thank you for contributing! Follow these steps to submit your coding solutions.

## Quick Start Guide

### 1️⃣ Fork & Clone (First time only)
```bash
git clone https://github.com/Jatin-L1/CodeUprising.git
cd CodeUprising
```

### 2️⃣ Create a Branch
```bash
git checkout -b username/platform-problem
# Example: git checkout -b john/leetcode-two-sum
```

### 3️⃣ Add Your Solution

**For CodeChef:**
```bash
mkdir -p CodeChef/Practice/PROBLEM_CODE
cd CodeChef/Practice/PROBLEM_CODE
```

**For LeetCode:**
```bash
mkdir -p LeetCode/Easy/001_Two_Sum
cd LeetCode/Easy/001_Two_Sum
```

### 4️⃣ Create Files

Create `solution.ext` (your solution) and `README.md` (documentation)

**README.md Template:**
```markdown
# Problem Name

## Problem Link
[Link to problem](URL)

## Difficulty
Easy/Medium/Hard

## Problem Description
Brief description of the problem

## Approach
Explain your approach and algorithm

## Complexity Analysis
- Time Complexity: O(?)
- Space Complexity: O(?)

## Tags
Array, Two Pointers, Hash Table, etc.
```

### 5️⃣ Commit & Push
```bash
git add .
git commit -m "Add solution for [Platform] - [Problem Name]"
git push origin username/platform-problem
```

### 6️⃣ Create Pull Request
Go to GitHub and create a PR with:
- Problem name and link
- Difficulty level
- Brief approach explanation
- Any challenges faced

## PR Title Format
- `Add solution for LeetCode - Two Sum`
- `Add solution for CodeChef - TWOSUM`
- `Update LeetCode - Binary Search solution`

## Code Standards

✅ **DO:**
- Write clean, readable code
- Add comments for complex logic
- Include problem README
- Test with edge cases
- Use meaningful variable names

❌ **DON'T:**
- Submit without testing
- Skip documentation
- Use unclear variable names
- Forget to mention complexity

## Need Help?
- Check the main README.md
- Create an issue
- Contact the Tech Head
- Ask in team meetings

Happy Coding! 🚀
