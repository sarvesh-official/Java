python 6
-------------------------------------------------------------------
given k and number to remove digit and give small number:
-------------------------------------------------------------
def remove_k_digits(num: str, k: int) -> str:
    stack = []
    
    for digit in num:
        while k > 0 and stack and stack[-1] > digit:
            stack.pop()
            k -= 1
        
        stack.append(digit)
    
    # Remove any remaining digits to meet the required count
    while k > 0 and stack: 
        stack.pop()
        k -= 1
    
    # Construct the result by joining the digits in the stack
    result = ''.join(stack)
    
    # Remove leading zeroes
    result = result.lstrip('0')
    
    # If the result is empty, return '0'
    return result if result else '0'

# Get input from the user
num = input("Enter a non-negative integer: ")
k = int(input("Enter the number of digits to remove: "))

# Call the function and print the result
print("Smallest integer after removing", k, "digits:", remove_k_digits(num, k))
------------------------------------------------------------------------------------------
question:
2 3 4 * +
change to (2+(3*4))
----------------------------------
def is_operand(char):
    return char.isalnum()

def postfix_to_infix(expression):
    stack = []
    for char in expression.split():
        if is_operand(char):
            stack.append(char)
        else:
            operand2 = stack.pop()
            operand1 = stack.pop()
            infix_string = f"({operand1} {char} {operand2})"
            stack.append(infix_string)
    return stack.pop()

# Get the postfix expression from the user
postfix_expression = input("Enter a valid postfix expression (operators and operands separated by spaces): ")
infix_result = postfix_to_infix(postfix_expression)
print(f"Infix expression: {infix_result}")
---------------------------------------------------------------------------------------
print power for 2 decimal places
-----------------------------------------------
x,n=map(float,input.split())
res=x**n
print(f"{res:.2f}")
------------------------------------------------------------------------------------------
question
n = 3, candidates = [2,3,5], target = 8
Output: 
2 2 2 2
2 3 3
3 5
---------------------------
def combinationSum(candidates, target):
    def backtrack(start, target, current_combination):
        if target == 0:
            result.append(current_combination[:])
            return
        while start < len(candidates) and target - candidates[start] >= 0:
            current_combination.append(candidates[start])
            backtrack(start, target - candidates[start], current_combination)
            start += 1
            current_combination.pop()

    candidates.sort()
    result = []
    backtrack(0, target, [])
    return result

# Example usage
candidates = [2, 3, 5]
target = 8
res = combinationSum(candidates, target)

if not res:
    print("Empty")
else:
    for combination in res:
        print(*combination)
------------------------------------------------------------------------------------------
rain water 


Input:
12 //Size
0 1 0 2 1 0 1 3 2 1 2 1
Output:
6
Explanation:
The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.

-----------------------------------
def trapRainWater(heightMap):
    if not heightMap:
        return 0

    n = len(heightMap)
    left_max = [0] * n
    right_max = [0] * n

    # Calculate the maximum height on the left for each index
    left_max[0] = heightMap[0]
    for i in range(1, n):
        left_max[i] = max(left_max[i - 1], heightMap[i])

    # Calculate the maximum height on the right for each index
    right_max[n - 1] = heightMap[n - 1]
    for i in range(n - 2, -1, -1):
        right_max[i] = max(right_max[i + 1], heightMap[i])

    # Calculate trapped water for each index
    total_water = 0
    for i in range(n):
        water_at_i = min(left_max[i], right_max[i]) - heightMap[i]
        total_water += water_at_i

    return total_water

# Example usage
x = input()
lis = list(map(int, x.split()))  # Corrected input line
print(trapRainWater(lis))
------------------------------------------------------------------------------------------
question next great 

Input:
2
2 4
4
1 2 3 4
Output:
3 -1
Explanation:
The next greater element for each value of nums1 is as follows:
2 is underlined in nums2 = [1,2,3,4]. The next greater element is 3.
4 is underlined in nums2 = [1,2,3,4]. There is no next greater element, so the answer is -1.

--------------------------------------------
def next_greater_element(nums1, nums2):
    # Create a dictionary to store the next greater element for each value in nums2
    next_greater = {}
    stack = []
    
    # Iterate through nums2 to find the next greater element for each value
    for num in nums2:
        while stack and num > stack[-1]:
            next_greater[stack.pop()] = num
        stack.append(num)
    
    # Initialize the result array with -1 for all values in nums1
    result = [-1] * len(nums1)
    
    # Populate the result array with the next greater element
    for i, num in enumerate(nums1):
        if num in next_greater:
            result[i] = next_greater[num]
    
    return result

# Example usage
nums1 = [2, 4]
nums2 = [1, 2, 3, 4]
output = next_greater_element(nums1, nums2)
print(output)  # Output: [3, -1]
----------------------------------------------------------------------------------------------------------------------------------
asteroid question  
--------------------------
n = int(input())
ad = list(map(int, input().split()))
stack = []
for a in ad:
    if not stack or a > 0:
        stack.append(a)
    else:
        while stack and stack[-1] > 0:
            if stack[-1] == -a:
                stack.pop()
                break
            elif stack[-1] < -a:
                stack.pop()
                continue
            else:
                break
        else:
            stack.append(a)


if not stack:
    print("Everything Destroyed")
else:
    print(*stack)
---------------------------------------------------------------------------------------------------------------------------
Example 1:

Input:
3 //N value

Output:
((())) (()()) (())() ()(()) ()()()
------------------------------
def generate_parentheses(N):
    def backtrack(s, left, right):
        if len(s) == 2 * N:
            result.append(s)
            return
        if left < N:
            backtrack(s + '(', left + 1, right)
        if right < left:
            backtrack(s + ')', left, right + 1)

    result = []
    backtrack('', 0, 0)
    return result

N = int(input())
all_combinations = generate_parentheses(N)
for combination in all_combinations:
    print(combination , end =" ")
----------------------------------------------------------------------------------------------------------------------------------
phone question
-------------------------------
def letter_combinations(digits):
    if not digits:
        return []

    digit_to_letters = {
        '2': 'abc',
        '3': 'def',
        '4': 'ghi',
        '5': 'jkl',
        '6': 'mno',
        '7': 'pqrs',
        '8': 'tuv',
        '9': 'wxyz'
    }

    def backtrack(index, current_combination):
        if index == len(digits):
            combinations.append(current_combination)
            return
        for letter in digit_to_letters[digits[index]]:
            backtrack(index + 1, current_combination + letter)

    combinations = []
    backtrack(0, '')
    return combinations

digits = input()
result = letter_combinations(digits)
for combination in result:
    print(combination, end=' ')
--------------------------------------------------------------------------------------------------------------------------------------------
Input: 
4 //n
1 5 11 5
Output: 
true
Explanation: 
The array can be partitioned as [1, 5, 5] and [11].
----------------------------------------------------
nums = [1, 5, 11, 5]
total_sum = sum(nums)
if total_sum % 2 != 0:
    print("False")
else:
    print("true")
--------------------------------------------------------------------------------------------
question lexicograph
7   //n  
10 1 2 7 6 1 5  //candidates   
8 // target
Output: 
1 1 6
1 2 5
1 7
2 6


-------------------------------------------------------
# Given input
n = 7
candidates = [1, 2, 7, 6, 1, 5]
target = 8

# Initialize an empty list to store the valid combinations
result = []

# Helper function to find valid combinations
def find_combinations(start, target, path):
    if target == 0:
        result.append(path)
        return
    if target < 0:
        return
    for i in range(start, len(candidates)):
        # Skip duplicate candidates to avoid repetition
        if i > start and candidates[i] == candidates[i - 1]:
            continue
        find_combinations(i + 1, target - candidates[i], path + [candidates[i]])

# Sort the candidates to handle duplicates
candidates.sort()

# Call the helper function
find_combinations(0, target, [])

# Print the valid combinations or -1 if empty
if not result:
    print(-1)
else:
    for combination in result:
        print(combination)
------------------------------------------------------------------------------------------
Input: 
abc 
  
Output: 
a ab abc ac b bc c   
Explanation: 
Printing all the 7 subsequences for the string
-----------------------------------------------------------
def generate_subsequences(s):
    n = len(s)
    subsequences = []
    
    # Generate all possible subsequences
    for i in range(1 << n):
        subseq = ""
        for j in range(n):
            if i & (1 << j):
                subseq += s[j]
        subsequences.append(subseq)
    
    # Sort the subsequences lexicographically
    subsequences.sort()
    
    return subsequences

# Example usage
input_string = "abc"
result = generate_subsequences(input_string)
for subseq in result:
    print(subseq)
------------------------------------------------------------------------------------------
using lexiograph
Input: 
n = 3, nums = [1,2,3]
Output:
1
1 2
1 2 3
1 3
2
2 3
3
---------------------------------------
def generate_subsequences(nums):
    n = len(nums)
    subsequences = []
    
    # Generate all possible subsequences
    for i in range(1 << n):
        subseq = []
        for j in range(n):
            if i & (1 << j):
                subseq.append(nums[j])
        subsequences.append(subseq)
    
    # Sort the subsequences lexicographically
    subsequences.sort()
    
    return subsequences

# Example usage
n = 3
nums = [1, 2, 3]
result = generate_subsequences(nums)
for subseq in result:
    print(*subseq)
------------------------------------------------------------------------------------------
input:
3
412
4
1 3 42
Output:
-1 3-1
Explanation:
The next greater element for each value of nums1 is as follows
-------------------------------------------------------
n = int(input())
arr = list(map(int, input().split()))

m = int(input())
arra = list(map(int, input().split()))

for i in range(n):
    next_element = -1
    found = False
    for j in range(m):
        if arr[i] == arra[j]:
            found = True
        if found and arra[j] > arr[i]:
            next_element = arra[j]
            break
    print(next_element, end=" ")
--------------------------------------------------------------------------------------------------------------------------------------------
bababas question
----------------------------------------
def find(piles, h):
        def can_eat_all(speed):
        # Check if Koko can eat all bananas at the given speed
        hours_needed = 0
        for pile in piles:
            hours_needed += (pile + speed - 1) // speed  # Ceiling division
        return hours_needed <= h

    # Binary search for the minimum eating speed
    left, right = 1, max(piles)
    while left < right:
        mid = left + (right - left) // 2
        if can_eat_all(mid):
            right = mid
        else:
            left = mid + 1

    return left

x=input()
piles = list(map(int,input().split()
h1 = int(input())
out = find(piles1, h1)
print(out)
------------------------------------------------------------------------------------------------
difference between the largest and smallest element in the subarray. Write a program to print the sum of all subarray ranges of nums.
Example 1:
Input:
3 //size     
1 2 3
Output:
4
-----------------------------------------------------
def sum_of_subarray_ranges(nums):
    total_sum = 0
    n = len(nums)

    for i in range(n):
        max_val, min_val = nums[i], nums[i]
        for j in range(i, n):
            max_val = max(max_val, nums[j])
            min_val = min(min_val, nums[j])
            total_sum += max_val - min_val

    return total_sum

# Example 1
nums1 = [1, 2, 3]
output1 = sum_of_subarray_ranges(nums1)
print(f"Example 1 Output: {output1}")
-------------------------------------------------------------------------------------------
max_sliding question
-------------------------------------------------------------------
n = int(input())
nums=list(map(int,input().split()))
k=int(input())

def slide(nums,k):
	result=[]
	for i in range(n-k+1):
		maxv=max(nums[i:i+k])
		result.append(maxv)
	return result
out=slide(nums,k)
print(*out)
-----------------------------------------------------------------------------------------------
histogram question
-------------------------------------------------
def largestRectangleArea(heights):
    n = len(heights)
    max_area = 0

    # Initializing Next Smaller Right (nsr) and Next Smaller Left (nsl)
    nsr = [0] * n
    nsl = [0] * n

    # Calculating Next Smaller Right
    stack = []
    for i in range(n - 1, -1, -1):
        while stack and heights[stack[-1]] >= heights[i]:
            stack.pop()
        nsr[i] = n if not stack else stack[-1]
        stack.append(i)

    # Clearing the stack for Next Smaller Left
    stack.clear()

    # Calculating Next Smaller Left
    for i in range(n):
        while stack and heights[stack[-1]] >= heights[i]:
            stack.pop()
        nsl[i] = -1 if not stack else stack[-1]
        stack.append(i)

    # Calculate the maximum area
    for i in range(n):
        height = heights[i]
        width = nsr[i] - nsl[i] - 1
        curr_area = height * width
        max_area = max(max_area, curr_area)

    return max_area
x=input()
# Example usage
heights = [2, 1, 5, 6, 2, 3]
print(largestRectangleArea(heights))  # Output: 10
---------------------------------------------------------------------------------------------
Sample Input:
10 5 2 * +
Sample Output:
+ 10 * 5 2   
postfix question
--------------------------------------------------
def isOperator(char):
    return char in "+-*/"

def postfixToPrefix(post_exp):
    stack = []
    for char in post_exp.split():
        if isOperator(char):
            op1 = stack.pop()
            op2 = stack.pop()
            temp = char +" "+ op2 +" "+ op1
            stack.append(temp)
        else:
            stack.append(char)
    return stack[-1]

# Example usage
postfix_expression = "10 5 2 * +"
prefix_expression = postfixToPrefix(postfix_expression)
print("Prefix:", prefix_expression)  # Output: + 10 * 5 2
----------------------------------------------------------------------------------------------
You are given a singly linked list, and your task is to remove the nth node from the end of the list and print the resulting list. Assume that n is always valid and within the range of the list's length.
Sample input:
5 //size
1 2 3 4 5 //list
2 // nth node to remove (position)
Output:
1 -> 2 -> 3 -> 5 -> nullptr
Sample input:
4 //size
1 2 3 4 //list
4 // nth node to remove (position)
Output:
2 -> 3 -> 4 -> nullptr
--------------------------------------------------------------
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def removeNthFromEnd(head, n):
    # Create a dummy node to handle edge cases
    dummy = ListNode(0)
    dummy.next = head

    fastPtr = dummy
    slowPtr = dummy

    # Move fastPtr ahead by n + 1 steps
    for _ in range(n + 1):
        fastPtr = fastPtr.next

    # Traverse both pointers simultaneously
    while fastPtr:
        fastPtr = fastPtr.next
        slowPtr = slowPtr.next

    # Delete the nth node
    slowPtr.next = slowPtr.next.next

    return dummy.next

# Example usage
def printLinkedList(head):
    while head:
        print(head.val, end=" -> ")
        head = head.next
    print("nullptr")

# Sample input
size = 5
list_values = [1, 2, 3, 4, 5]
nth_node = 2

# Create the linked list
dummy_head = ListNode()
current = dummy_head
for val in list_values:
    current.next = ListNode(val)
    current = current.next

# Remove nth node from the end
new_head = removeNthFromEnd(dummy_head.next, nth_node)

# Print the resulting list
printLinkedList(new_head)
-------------------------------------------------------------------------------------------------------------------------------------------------------







