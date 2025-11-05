# 🚀 CodeUprising

**From contest to commit — rise with your code.**

## 📖 About

CodeUprising is a collaborative coding platform for our tech team where we sharpen our problem-solving skills through competitive programming. Team members participate in coding contests on platforms like **CodeChef** and **LeetCode**, then share their solutions through Pull Requests for review and knowledge sharing.

### 🎯 Mission
- **Practice**: Regularly solve coding problems from top competitive platforms
- **Share**: Document solutions and approaches through PRs
- **Learn**: Review each other's code to discover new techniques
- **Grow**: Track progress and improve problem-solving skills together

---

## 📁 Repository Structure

```
CodeUprising/
├── CodeChef/
│   ├── Contest_Name/
│   │   ├── Problem_Code/
│   │   │   ├── solution.cpp (or .py, .java, etc.)
│   │   │   └── README.md (problem description & approach)
│   └── Practice/
│       └── Problem_Code/
│           ├── solution.cpp
│           └── README.md
├── LeetCode/
│   ├── Easy/
│   │   ├── 001_Two_Sum/
│   │   │   ├── solution.cpp
│   │   │   └── README.md
│   ├── Medium/
│   │   └── Problem_Number_Problem_Name/
│   │       ├── solution.cpp
│   │       └── README.md
│   └── Hard/
│       └── Problem_Number_Problem_Name/
│           ├── solution.cpp
│           └── README.md
└── README.md (this file)
```

---

## 🤝 How to Contribute

### Step 1: Solve a Problem
Choose a problem from CodeChef or LeetCode and solve it. Make sure to:
- Understand the problem thoroughly
- Test your solution with multiple test cases
- Optimize if possible

### Step 2: Create Your Solution Branch
```bash
git checkout -b username/platform-problem-name
# Example: git checkout -b john/leetcode-two-sum
```

### Step 3: Add Your Solution

#### For CodeChef Problems:
```bash
# For contest problems
mkdir -p CodeChef/Contest_Name/Problem_Code
cd CodeChef/Contest_Name/Problem_Code

# For practice problems
mkdir -p CodeChef/Practice/Problem_Code
cd CodeChef/Practice/Problem_Code
```

#### For LeetCode Problems:
```bash
# Based on difficulty
mkdir -p LeetCode/Easy/001_Two_Sum
# or
mkdir -p LeetCode/Medium/Problem_Number_Problem_Name
# or
mkdir -p LeetCode/Hard/Problem_Number_Problem_Name
```

### Step 4: Create Your Files

**solution.ext** (your code file)
```cpp
// Example: solution.cpp
// Your solution code here
```

**README.md** (problem documentation)
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

### Step 5: Commit and Push
```bash
git add .
git commit -m "Add solution for [Platform] - [Problem Name]"
git push origin username/platform-problem-name
```

### Step 6: Create a Pull Request
1. Go to the repository on GitHub
2. Click "New Pull Request"
3. Select your branch
4. Fill in the PR template:
   - Problem name and link
   - Difficulty level
   - Brief approach explanation
   - Any challenges faced
5. Submit the PR

### Step 7: Wait for Review
The Tech Head will:
- Review your solution
- Provide feedback if needed
- Approve and merge when ready

---

## 📝 Contribution Guidelines

### Code Quality
- **Clean Code**: Write readable, well-formatted code
- **Comments**: Add comments for complex logic
- **Naming**: Use meaningful variable and function names
- **Standards**: Follow language-specific conventions

### Documentation
- **Problem README**: Always include a README.md with each solution
- **Approach**: Clearly explain your thought process
- **Complexity**: Mention time and space complexity
- **Edge Cases**: Document any special cases handled

### File Naming
- Use descriptive names: `solution.cpp`, `solution.py`, `solution.java`
- For multiple solutions: `solution_v1.cpp`, `solution_optimized.cpp`
- Keep folder names consistent with the structure above

### Commit Messages
- Use clear, descriptive commit messages
- Format: `Add solution for [Platform] - [Problem Name]`
- Examples:
  - `Add solution for LeetCode - Two Sum`
  - `Add solution for CodeChef - TWOSUM Contest`
  - `Update approach for LeetCode - Binary Search`

---

## 🏆 Contest Guidelines

### Regular Contests
- **CodeChef**: Long Challenge, Cook-Off, Lunch Time
- **LeetCode**: Weekly Contest, Biweekly Contest

### After Contest
1. Create a folder with the contest name
2. Add solutions for problems you solved
3. Create a PR within 2-3 days of contest end
4. Share learnings in the PR description

---

## 💡 Best Practices

### Before Submitting
- ✅ Test with sample test cases
- ✅ Test with edge cases
- ✅ Check for runtime errors
- ✅ Verify memory limits
- ✅ Add problem README
- ✅ Format code properly

### Code Review
- Be open to feedback
- Learn from others' solutions
- Suggest improvements respectfully
- Ask questions if something is unclear

### Learning Together
- Comment on others' PRs
- Share alternative approaches
- Discuss optimizations
- Celebrate each other's successes

---

## 📊 Tracking Progress

Consider maintaining a personal progress file:

```markdown
## My Progress - [Your Name]

### Statistics
- Total Problems Solved: X
- Easy: Y
- Medium: Z
- Hard: W

### Recent Submissions
- [Date] - [Problem Name] - [Status]
```

---

## 🛠️ Supported Languages

We support solutions in multiple languages:
- C++ (`.cpp`)
- Python (`.py`)
- Java (`.java`)
- JavaScript (`.js`)
- Go (`.go`)
- Rust (`.rs`)

Choose the language you're most comfortable with!

---

## 🌟 Tips for Success

1. **Consistency is Key**: Try to solve at least 3-4 problems per week
2. **Variety Matters**: Mix easy, medium, and hard problems
3. **Learn Patterns**: Focus on common problem-solving patterns
4. **Time Yourself**: Practice under time constraints for contests
5. **Review Others**: Learn from teammates' approaches
6. **Ask Questions**: Don't hesitate to discuss in PR comments

---

## 📞 Contact

For any questions or issues:
- Create an issue in the repository
- Contact the Tech Head
- Discuss in team meetings

---

## 🎖️ Recognition

Outstanding contributors will be recognized for:
- Most problems solved
- Best code quality
- Most helpful reviews
- Creative solutions

Keep coding, keep learning, keep uprising! 🚀

---

**Happy Coding! 💻**
