# 🧠 LeetCode 1472: Design Browser History

> Status: ✅ Solved | Difficulty: 🟨 Medium

## 📌 Problem Statement

You’re building a **one-tab browser** with basic history features. Your task is to simulate user browsing actions such as visiting new URLs, moving backward and forward in history, just like you'd expect in Chrome or Safari.

### 🎯 Core Functionalities:

Implement a `BrowserHistory` class with the following methods:

```cpp
BrowserHistory(string homepage);
void visit(string url);
string back(int steps);
string forward(int steps);
🔨 Method Breakdown:
BrowserHistory(string homepage)

Initializes the browser with the given homepage.

void visit(string url)

Goes to a new URL from the current page.

Clears forward history (like when you go to a new site manually).

string back(int steps)

Moves steps back in history.

Can only go as far as the start of the history.

Returns the current page after going back.

string forward(int steps)

Moves steps forward in history.

Can only go as far as the latest visited page.

Returns the current page after going forward.

🧪 Example Walkthrough

Input:
["BrowserHistory","visit","visit","visit","back","back","forward","visit","forward","back","back"]
[["leetcode.com"],["google.com"],["facebook.com"],["youtube.com"],[1],[1],[1],["linkedin.com"],[2],[2],[7]]

Output:
[null,null,null,null,"facebook.com","google.com","facebook.com",null,"linkedin.com",