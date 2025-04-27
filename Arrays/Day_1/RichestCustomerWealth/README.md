# 1672. Richest Customer Wealth

**Status:** Solved ✅  
**Difficulty:** Easy

---

## Topics
- Array
- Matrix

## Companies
*(No company tags for this problem)*

---

## Problem Description

You are given an `m x n` integer grid `accounts` where `accounts[i][j]` is the amount of money the `i`-th customer has in the `j`-th bank.

Return the **wealth** that the **richest customer** has.

A customer's **wealth** is the sum of money they have in all their bank accounts.  
The **richest customer** is the one with the maximum wealth.

---

## Hint

Calculate the sum of each row (customer's wealth) and find the maximum sum.

---

## Examples

**Example 1**  
Input: accounts = [[1,2,3], [3,2,1]] Output: 6

**Example 2**  
Input: accounts = [[1,5], [7,3], [3,5]] Output: 10

**Example 3**  
Input: accounts = [[2,8,7], [7,1,3], [1,9,5]] Output: 17